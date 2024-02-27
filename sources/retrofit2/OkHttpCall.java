package retrofit2;

import in.g;
import in.j;
import in.o;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import um.b0;
import um.d0;
import um.e;
import um.e0;
import um.f;
import um.x;

final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final e.a callFactory;
    private volatile boolean canceled;
    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;
    @GuardedBy("this")
    private boolean executed;
    @GuardedBy("this")
    @Nullable
    private e rawCall;
    private final RequestFactory requestFactory;
    private final Converter<e0, T> responseConverter;

    static final class ExceptionCatchingResponseBody extends e0 {
        private final e0 delegate;
        private final g delegateSource;
        @Nullable
        IOException thrownException;

        ExceptionCatchingResponseBody(e0 e0Var) {
            this.delegate = e0Var;
            this.delegateSource = o.b(new j(e0Var.source()) {
                public long read(in.e eVar, long j10) throws IOException {
                    try {
                        return super.read(eVar, j10);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.thrownException = e10;
                        throw e10;
                    }
                }
            });
        }

        public void close() {
            this.delegate.close();
        }

        public long contentLength() {
            return this.delegate.contentLength();
        }

        public x contentType() {
            return this.delegate.contentType();
        }

        public g source() {
            return this.delegateSource;
        }

        /* access modifiers changed from: package-private */
        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class NoContentResponseBody extends e0 {
        private final long contentLength;
        @Nullable
        private final x contentType;

        NoContentResponseBody(@Nullable x xVar, long j10) {
            this.contentType = xVar;
            this.contentLength = j10;
        }

        public long contentLength() {
            return this.contentLength;
        }

        public x contentType() {
            return this.contentType;
        }

        public g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    OkHttpCall(RequestFactory requestFactory2, Object[] objArr, e.a aVar, Converter<e0, T> converter) {
        this.requestFactory = requestFactory2;
        this.args = objArr;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private e createRawCall() throws IOException {
        e a10 = this.callFactory.a(this.requestFactory.create(this.args));
        if (a10 != null) {
            return a10;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    private e getRawCall() throws IOException {
        e eVar = this.rawCall;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.creationFailure;
        if (th2 == null) {
            try {
                e createRawCall = createRawCall();
                this.rawCall = createRawCall;
                return createRawCall;
            } catch (IOException | Error | RuntimeException e10) {
                Utils.throwIfFatal(e10);
                this.creationFailure = e10;
                throw e10;
            }
        } else if (th2 instanceof IOException) {
            throw ((IOException) th2);
        } else if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        } else {
            throw ((Error) th2);
        }
    }

    public void cancel() {
        e eVar;
        this.canceled = true;
        synchronized (this) {
            eVar = this.rawCall;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public void enqueue(final Callback<T> callback) {
        e eVar;
        Throwable th2;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (!this.executed) {
                    this.executed = true;
                    eVar = this.rawCall;
                    th2 = this.creationFailure;
                    if (eVar == null && th2 == null) {
                        e createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        eVar = createRawCall;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th2 != null) {
            callback.onFailure(this, th2);
            return;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        eVar.y(new f() {
            private void callFailure(Throwable th2) {
                try {
                    callback.onFailure(OkHttpCall.this, th2);
                } catch (Throwable th3) {
                    Utils.throwIfFatal(th3);
                    th3.printStackTrace();
                }
            }

            public void onFailure(e eVar, IOException iOException) {
                callFailure(iOException);
            }

            public void onResponse(e eVar, d0 d0Var) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(d0Var));
                    } catch (Throwable th2) {
                        Utils.throwIfFatal(th2);
                        th2.printStackTrace();
                    }
                } catch (Throwable th3) {
                    Utils.throwIfFatal(th3);
                    callFailure(th3);
                }
            }
        });
    }

    public Response<T> execute() throws IOException {
        e rawCall2;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                rawCall2 = getRawCall();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            rawCall2.cancel();
        }
        return parseResponse(rawCall2.execute());
    }

    public boolean isCanceled() {
        boolean z10 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                e eVar = this.rawCall;
                if (eVar == null || !eVar.isCanceled()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    /* access modifiers changed from: package-private */
    public Response<T> parseResponse(d0 d0Var) throws IOException {
        e0 c10 = d0Var.c();
        d0 c11 = d0Var.R().b(new NoContentResponseBody(c10.contentType(), c10.contentLength())).c();
        int h10 = c11.h();
        if (h10 < 200 || h10 >= 300) {
            try {
                return Response.error(Utils.buffer(c10), c11);
            } finally {
                c10.close();
            }
        } else if (h10 == 204 || h10 == 205) {
            c10.close();
            return Response.success(null, c11);
        } else {
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(c10);
            try {
                return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), c11);
            } catch (RuntimeException e10) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw e10;
            }
        }
    }

    public synchronized b0 request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return getRawCall().request();
    }

    public synchronized in.b0 timeout() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create call.", e10);
        }
        return getRawCall().timeout();
    }

    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
