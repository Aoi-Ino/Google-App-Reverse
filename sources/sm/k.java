package sm;

import lm.h0;

public final class k extends h {

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f31311g;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f31311g = runnable;
    }

    public void run() {
        try {
            this.f31311g.run();
        } finally {
            this.f31309f.a();
        }
    }

    public String toString() {
        return "Task[" + h0.a(this.f31311g) + '@' + h0.b(this.f31311g) + ", " + this.f31308e + ", " + this.f31309f + ']';
    }
}
