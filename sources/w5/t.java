package w5;

import java.util.concurrent.Executor;
import t5.s;

final class t extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f17903a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final o f17904b = new o();

    /* renamed from: c  reason: collision with root package name */
    private boolean f17905c;

    /* renamed from: d  reason: collision with root package name */
    private Object f17906d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f17907e;

    t() {
    }

    private final void m() {
        s.b(this.f17905c, "Task is not yet complete");
    }

    private final void n() {
        s.b(!this.f17905c, "Task is already complete");
    }

    private final void o() {
        synchronized (this.f17903a) {
            try {
                if (this.f17905c) {
                    this.f17904b.b(this);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final e a(a aVar) {
        this.f17904b.a(new i(f.f17881a, aVar));
        o();
        return this;
    }

    public final e b(Executor executor, b bVar) {
        this.f17904b.a(new k(executor, bVar));
        o();
        return this;
    }

    public final e c(Executor executor, c cVar) {
        this.f17904b.a(new m(executor, cVar));
        o();
        return this;
    }

    public final e d(c cVar) {
        c(f.f17881a, cVar);
        return this;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.f17903a) {
            exc = this.f17907e;
        }
        return exc;
    }

    public final Object f() {
        Object obj;
        synchronized (this.f17903a) {
            try {
                m();
                Exception exc = this.f17907e;
                if (exc == null) {
                    obj = this.f17906d;
                } else {
                    throw new d(exc);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f17903a) {
            z10 = this.f17905c;
        }
        return z10;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f17903a) {
            try {
                z10 = false;
                if (this.f17905c && this.f17907e == null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final void i(Exception exc) {
        synchronized (this.f17903a) {
            n();
            this.f17905c = true;
            this.f17907e = exc;
        }
        this.f17904b.b(this);
    }

    public final void j(Object obj) {
        synchronized (this.f17903a) {
            n();
            this.f17905c = true;
            this.f17906d = obj;
        }
        this.f17904b.b(this);
    }

    public final boolean k(Exception exc) {
        synchronized (this.f17903a) {
            try {
                if (this.f17905c) {
                    return false;
                }
                this.f17905c = true;
                this.f17907e = exc;
                this.f17904b.b(this);
                return true;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final boolean l(Object obj) {
        synchronized (this.f17903a) {
            try {
                if (this.f17905c) {
                    return false;
                }
                this.f17905c = true;
                this.f17906d = obj;
                this.f17904b.b(this);
                return true;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
