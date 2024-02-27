package lm;

import tl.g;

public final class g2 extends a0 {

    /* renamed from: g  reason: collision with root package name */
    public static final g2 f24961g = new g2();

    private g2() {
    }

    public void A0(g gVar, Runnable runnable) {
        k2 k2Var = (k2) gVar.f(k2.f24979g);
        if (k2Var != null) {
            k2Var.f24980f = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean C0(g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
