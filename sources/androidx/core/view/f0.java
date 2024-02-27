package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

public final class f0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e  reason: collision with root package name */
    private final View f2581e;

    /* renamed from: f  reason: collision with root package name */
    private ViewTreeObserver f2582f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f2583g;

    private f0(View view, Runnable runnable) {
        this.f2581e = view;
        this.f2582f = view.getViewTreeObserver();
        this.f2583g = runnable;
    }

    public static f0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            f0 f0Var = new f0(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(f0Var);
            view.addOnAttachStateChangeListener(f0Var);
            return f0Var;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        (this.f2582f.isAlive() ? this.f2582f : this.f2581e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2581e.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f2583g.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2582f = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
