package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f6238a = Color.alpha(-1728053248);

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DrawerLayout f6239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6240b;

        a(DrawerLayout drawerLayout, View view) {
            this.f6239a = drawerLayout;
            this.f6240b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6239a.h(this.f6240b, false);
            this.f6239a.setScrimColor(-1728053248);
        }
    }

    public static Animator.AnimatorListener b(DrawerLayout drawerLayout, View view) {
        return new a(drawerLayout, view);
    }

    public static ValueAnimator.AnimatorUpdateListener c(DrawerLayout drawerLayout) {
        return new a(drawerLayout);
    }
}
