package r3;

import com.google.android.gms.common.api.internal.LifecycleCallback;

final class c0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f15552e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f15553f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d0 f15554g;

    c0(d0 d0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f15554g = d0Var;
        this.f15552e = lifecycleCallback;
        this.f15553f = str;
    }

    public final void run() {
        d0 d0Var = this.f15554g;
        if (d0Var.f15557f > 0) {
            this.f15552e.f(d0Var.f15558g != null ? d0Var.f15558g.getBundle(this.f15553f) : null);
        }
        if (this.f15554g.f15557f >= 2) {
            this.f15552e.j();
        }
        if (this.f15554g.f15557f >= 3) {
            this.f15552e.h();
        }
        if (this.f15554g.f15557f >= 4) {
            this.f15552e.k();
        }
        if (this.f15554g.f15557f >= 5) {
            this.f15552e.g();
        }
    }
}
