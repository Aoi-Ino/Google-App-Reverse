package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import i5.g;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5532a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f5533b;

    public /* synthetic */ c(AppBarLayout appBarLayout, g gVar) {
        this.f5532a = appBarLayout;
        this.f5533b = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5532a.r(this.f5533b, valueAnimator);
    }
}
