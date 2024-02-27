package ep;

import dp.c;
import jp.a;
import jp.b;

class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f23149a;

    /* renamed from: b  reason: collision with root package name */
    private final a f23150b;

    /* renamed from: c  reason: collision with root package name */
    private final a f23151c;

    /* renamed from: d  reason: collision with root package name */
    private final c f23152d;

    /* renamed from: e  reason: collision with root package name */
    private final n3 f23153e;

    public e0(n3 n3Var) {
        this(n3Var, (c) null);
    }

    private u c(Class cls, d0 d0Var) {
        b1 b1Var = new b1(d0Var, this.f23153e);
        if (d0Var != null) {
            this.f23150b.a(cls, b1Var);
        }
        return b1Var;
    }

    private u e(Class cls, d0 d0Var) {
        u1 u1Var = new u1(d0Var, this.f23153e);
        if (d0Var != null) {
            this.f23149a.a(cls, u1Var);
        }
        return u1Var;
    }

    public d0 a(Class cls) {
        d0 d0Var = (d0) this.f23151c.b(cls);
        if (d0Var != null) {
            return d0Var;
        }
        f0 f0Var = new f0(cls, this.f23152d);
        this.f23151c.a(cls, f0Var);
        return f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = a(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ep.u b(java.lang.Class r3) {
        /*
            r2 = this;
            jp.a r0 = r2.f23150b
            java.lang.Object r0 = r0.b(r3)
            ep.u r0 = (ep.u) r0
            if (r0 != 0) goto L_0x0014
            ep.d0 r1 = r2.a(r3)
            if (r1 == 0) goto L_0x0014
            ep.u r0 = r2.c(r3, r1)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.e0.b(java.lang.Class):ep.u");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = a(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ep.u d(java.lang.Class r3) {
        /*
            r2 = this;
            jp.a r0 = r2.f23149a
            java.lang.Object r0 = r0.b(r3)
            ep.u r0 = (ep.u) r0
            if (r0 != 0) goto L_0x0014
            ep.d0 r1 = r2.a(r3)
            if (r1 == 0) goto L_0x0014
            ep.u r0 = r2.e(r3, r1)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.e0.d(java.lang.Class):ep.u");
    }

    public e0(n3 n3Var, c cVar) {
        this.f23149a = new b();
        this.f23150b = new b();
        this.f23151c = new b();
        this.f23152d = cVar;
        this.f23153e = n3Var;
    }
}
