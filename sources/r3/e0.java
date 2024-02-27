package r3;

import com.google.android.gms.common.api.internal.LifecycleCallback;

final class e0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f15560e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f15561f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ f0 f15562g;

    e0(f0 f0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f15562g = f0Var;
        this.f15560e = lifecycleCallback;
        this.f15561f = str;
    }

    public final void run() {
        f0 f0Var = this.f15562g;
        if (f0Var.f15565i0 > 0) {
            this.f15560e.f(f0Var.f15566j0 != null ? f0Var.f15566j0.getBundle(this.f15561f) : null);
        }
        if (this.f15562g.f15565i0 >= 2) {
            this.f15560e.j();
        }
        if (this.f15562g.f15565i0 >= 3) {
            this.f15560e.h();
        }
        if (this.f15562g.f15565i0 >= 4) {
            this.f15560e.k();
        }
        if (this.f15562g.f15565i0 >= 5) {
            this.f15560e.g();
        }
    }
}
