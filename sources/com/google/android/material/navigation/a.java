package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f6237a;

    public /* synthetic */ a(DrawerLayout drawerLayout) {
        this.f6237a = drawerLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6237a.setScrimColor(androidx.core.graphics.a.k(-1728053248, r4.a.c(b.f6238a, 0, valueAnimator.getAnimatedFraction())));
    }
}
