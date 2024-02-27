package lm;

import bm.l;
import bm.p;
import tl.d;
import tl.g;

public abstract class a extends r1 implements d, d0 {

    /* renamed from: g  reason: collision with root package name */
    private final g f24939g;

    public a(g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            e0((k1) gVar.f(k1.f24977b));
        }
        this.f24939g = gVar.l(this);
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
        z(obj);
    }

    /* access modifiers changed from: protected */
    public String J() {
        return h0.a(this) + " was cancelled";
    }

    /* access modifiers changed from: protected */
    public void J0(Throwable th2, boolean z10) {
    }

    /* access modifiers changed from: protected */
    public void K0(Object obj) {
    }

    public final void L0(f0 f0Var, Object obj, p pVar) {
        f0Var.b(pVar, obj, this);
    }

    public boolean c() {
        return super.c();
    }

    public final void d0(Throwable th2) {
        c0.a(this.f24939g, th2);
    }

    public final g getContext() {
        return this.f24939g;
    }

    public g h() {
        return this.f24939g;
    }

    public String n0() {
        String b10 = z.b(this.f24939g);
        if (b10 == null) {
            return super.n0();
        }
        return '\"' + b10 + "\":" + super.n0();
    }

    public final void resumeWith(Object obj) {
        Object l02 = l0(y.d(obj, (l) null, 1, (Object) null));
        if (l02 != s1.f25009b) {
            I0(l02);
        }
    }

    /* access modifiers changed from: protected */
    public final void s0(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            J0(uVar.f25023a, uVar.a());
            return;
        }
        K0(obj);
    }
}
