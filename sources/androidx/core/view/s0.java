package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f2658a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f2659b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f2660c = null;

    /* renamed from: d  reason: collision with root package name */
    int f2661d = -1;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f2662a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2663b;

        a(t0 t0Var, View view) {
            this.f2662a = t0Var;
            this.f2663b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2662a.a(this.f2663b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2662a.b(this.f2663b);
        }

        public void onAnimationStart(Animator animator) {
            this.f2662a.c(this.f2663b);
        }
    }

    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    s0(View view) {
        this.f2658a = new WeakReference(view);
    }

    private void i(View view, t0 t0Var) {
        if (t0Var != null) {
            view.animate().setListener(new a(t0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public s0 b(float f10) {
        View view = (View) this.f2658a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f2658a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f2658a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public s0 f(long j10) {
        View view = (View) this.f2658a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public s0 g(Interpolator interpolator) {
        View view = (View) this.f2658a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public s0 h(t0 t0Var) {
        View view = (View) this.f2658a.get();
        if (view != null) {
            i(view, t0Var);
        }
        return this;
    }

    public s0 j(long j10) {
        View view = (View) this.f2658a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public s0 k(v0 v0Var) {
        View view = (View) this.f2658a.get();
        if (view != null) {
            b.a(view.animate(), v0Var != null ? new r0(v0Var, view) : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f2658a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public s0 m(float f10) {
        View view = (View) this.f2658a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
