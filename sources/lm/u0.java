package lm;

import ql.h;

public abstract class u0 extends a0 {

    /* renamed from: g  reason: collision with root package name */
    private long f25024g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25025h;

    /* renamed from: i  reason: collision with root package name */
    private h f25026i;

    private final long F0(boolean z10) {
        return z10 ? 4294967296L : 1;
    }

    public static /* synthetic */ void J0(u0 u0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            u0Var.I0(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void E0(boolean z10) {
        long F0 = this.f25024g - F0(z10);
        this.f25024g = F0;
        if (F0 <= 0 && this.f25025h) {
            shutdown();
        }
    }

    public final void G0(o0 o0Var) {
        h hVar = this.f25026i;
        if (hVar == null) {
            hVar = new h();
            this.f25026i = hVar;
        }
        hVar.addLast(o0Var);
    }

    /* access modifiers changed from: protected */
    public long H0() {
        h hVar = this.f25026i;
        return (hVar != null && !hVar.isEmpty()) ? 0 : Long.MAX_VALUE;
    }

    public final void I0(boolean z10) {
        this.f25024g += F0(z10);
        if (!z10) {
            this.f25025h = true;
        }
    }

    public final boolean K0() {
        return this.f25024g >= F0(true);
    }

    public final boolean L0() {
        h hVar = this.f25026i;
        if (hVar != null) {
            return hVar.isEmpty();
        }
        return true;
    }

    public final boolean M0() {
        o0 o0Var;
        h hVar = this.f25026i;
        if (hVar == null || (o0Var = (o0) hVar.e0()) == null) {
            return false;
        }
        o0Var.run();
        return true;
    }

    public abstract void shutdown();
}
