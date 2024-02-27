package androidx.work;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import m1.a0;
import t1.b;

public abstract class c {

    /* renamed from: e  reason: collision with root package name */
    private Context f4106e;

    /* renamed from: f  reason: collision with root package name */
    private WorkerParameters f4107f;

    /* renamed from: g  reason: collision with root package name */
    private volatile int f4108g = -256;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4109h;

    public static abstract class a {

        /* renamed from: androidx.work.c$a$a  reason: collision with other inner class name */
        public static final class C0071a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final b f4110a;

            public C0071a() {
                this(b.f4103c);
            }

            public b e() {
                return this.f4110a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0071a.class != obj.getClass()) {
                    return false;
                }
                return this.f4110a.equals(((C0071a) obj).f4110a);
            }

            public int hashCode() {
                return (C0071a.class.getName().hashCode() * 31) + this.f4110a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f4110a + '}';
            }

            public C0071a(b bVar) {
                this.f4110a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c  reason: collision with other inner class name */
        public static final class C0072c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final b f4111a;

            public C0072c() {
                this(b.f4103c);
            }

            public b e() {
                return this.f4111a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0072c.class != obj.getClass()) {
                    return false;
                }
                return this.f4111a.equals(((C0072c) obj).f4111a);
            }

            public int hashCode() {
                return (C0072c.class.getName().hashCode() * 31) + this.f4111a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f4111a + '}';
            }

            public C0072c(b bVar) {
                this.f4111a = bVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0071a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0072c();
        }

        public static a d(b bVar) {
            return new C0072c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f4106e = context;
            this.f4107f = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context a() {
        return this.f4106e;
    }

    public Executor c() {
        return this.f4107f.a();
    }

    public x5.a d() {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        t10.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t10;
    }

    public final UUID e() {
        return this.f4107f.c();
    }

    public final b f() {
        return this.f4107f.d();
    }

    public final int g() {
        return this.f4108g;
    }

    public b h() {
        return this.f4107f.e();
    }

    public a0 i() {
        return this.f4107f.f();
    }

    public final boolean j() {
        return this.f4108g != -256;
    }

    public final boolean k() {
        return this.f4109h;
    }

    public void l() {
    }

    public final void m() {
        this.f4109h = true;
    }

    public abstract x5.a n();

    public final void o(int i10) {
        this.f4108g = i10;
        l();
    }
}
