package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class r0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0 f2656a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2657b;

    public /* synthetic */ r0(v0 v0Var, View view) {
        this.f2656a = v0Var;
        this.f2657b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2656a.a(this.f2657b);
    }
}
