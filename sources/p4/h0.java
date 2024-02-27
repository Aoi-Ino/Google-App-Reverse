package p4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import s3.o;

final class h0 extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14675a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final e0 f14676b = new e0();

    /* renamed from: c  reason: collision with root package name */
    private boolean f14677c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f14678d;

    /* renamed from: e  reason: collision with root package name */
    private Object f14679e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f14680f;

    h0() {
    }

    private final void t() {
        o.l(this.f14677c, "Task is not yet complete");
    }

    private final void u() {
        if (this.f14678d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void v() {
        if (this.f14677c) {
            throw b.a(this);
        }
    }

    private final void w() {
        synchronized (this.f14675a) {
            try {
                if (this.f14677c) {
                    this.f14676b.b(this);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final i a(Executor executor, c cVar) {
        this.f14676b.a(new u(executor, cVar));
        w();
        return this;
    }

    public final i b(Executor executor, d dVar) {
        this.f14676b.a(new w(executor, dVar));
        w();
        return this;
    }

    public final i c(d dVar) {
        this.f14676b.a(new w(k.f14684a, dVar));
        w();
        return this;
    }

    public final i d(Executor executor, e eVar) {
        this.f14676b.a(new y(executor, eVar));
        w();
        return this;
    }

    public final i e(Executor executor, f fVar) {
        this.f14676b.a(new a0(executor, fVar));
        w();
        return this;
    }

    public final i f(Executor executor, a aVar) {
        h0 h0Var = new h0();
        this.f14676b.a(new q(executor, aVar, h0Var));
        w();
        return h0Var;
    }

    public final i g(Executor executor, a aVar) {
        h0 h0Var = new h0();
        this.f14676b.a(new s(executor, aVar, h0Var));
        w();
        return h0Var;
    }

    public final Exception h() {
        Exception exc;
        synchronized (this.f14675a) {
            exc = this.f14680f;
        }
        return exc;
    }

    public final Object i() {
        Object obj;
        synchronized (this.f14675a) {
            try {
                t();
                u();
                Exception exc = this.f14680f;
                if (exc == null) {
                    obj = this.f14679e;
                } else {
                    throw new g(exc);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public final Object j(Class cls) {
        Object obj;
        synchronized (this.f14675a) {
            try {
                t();
                u();
                if (!cls.isInstance(this.f14680f)) {
                    Exception exc = this.f14680f;
                    if (exc == null) {
                        obj = this.f14679e;
                    } else {
                        throw new g(exc);
                    }
                } else {
                    throw ((Throwable) cls.cast(this.f14680f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public final boolean k() {
        return this.f14678d;
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f14675a) {
            z10 = this.f14677c;
        }
        return z10;
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f14675a) {
            try {
                z10 = false;
                if (this.f14677c && !this.f14678d && this.f14680f == null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final i n(Executor executor, h hVar) {
        h0 h0Var = new h0();
        this.f14676b.a(new c0(executor, hVar, h0Var));
        w();
        return h0Var;
    }

    public final void o(Exception exc) {
        o.j(exc, "Exception must not be null");
        synchronized (this.f14675a) {
            v();
            this.f14677c = true;
            this.f14680f = exc;
        }
        this.f14676b.b(this);
    }

    public final void p(Object obj) {
        synchronized (this.f14675a) {
            v();
            this.f14677c = true;
            this.f14679e = obj;
        }
        this.f14676b.b(this);
    }

    public final boolean q() {
        synchronized (this.f14675a) {
            try {
                if (this.f14677c) {
                    return false;
                }
                this.f14677c = true;
                this.f14678d = true;
                this.f14676b.b(this);
                return true;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final boolean r(Exception exc) {
        o.j(exc, "Exception must not be null");
        synchronized (this.f14675a) {
            try {
                if (this.f14677c) {
                    return false;
                }
                this.f14677c = true;
                this.f14680f = exc;
                this.f14676b.b(this);
                return true;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final boolean s(Object obj) {
        synchronized (this.f14675a) {
            try {
                if (this.f14677c) {
                    return false;
                }
                this.f14677c = true;
                this.f14679e = obj;
                this.f14676b.b(this);
                return true;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
