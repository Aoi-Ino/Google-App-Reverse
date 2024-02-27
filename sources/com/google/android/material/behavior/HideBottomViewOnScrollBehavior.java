package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d5.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q4.b;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: n  reason: collision with root package name */
    private static final int f5559n = b.motionDurationLong2;

    /* renamed from: o  reason: collision with root package name */
    private static final int f5560o = b.motionDurationMedium4;

    /* renamed from: p  reason: collision with root package name */
    private static final int f5561p = b.motionEasingEmphasizedInterpolator;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet f5562e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    private int f5563f;

    /* renamed from: g  reason: collision with root package name */
    private int f5564g;

    /* renamed from: h  reason: collision with root package name */
    private TimeInterpolator f5565h;

    /* renamed from: i  reason: collision with root package name */
    private TimeInterpolator f5566i;

    /* renamed from: j  reason: collision with root package name */
    private int f5567j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f5568k = 2;

    /* renamed from: l  reason: collision with root package name */
    private int f5569l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public ViewPropertyAnimator f5570m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f5570m = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    private void J(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f5570m = view.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void Q(View view, int i10) {
        this.f5568k = i10;
        Iterator it = this.f5562e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean K() {
        return this.f5568k == 1;
    }

    public boolean L() {
        return this.f5568k == 2;
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z10) {
        if (!K()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f5570m;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            Q(view, 1);
            int i10 = this.f5567j + this.f5569l;
            if (z10) {
                J(view, i10, (long) this.f5564g, this.f5566i);
                return;
            }
            view.setTranslationY((float) i10);
        }
    }

    public void O(View view) {
        P(view, true);
    }

    public void P(View view, boolean z10) {
        if (!L()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f5570m;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            Q(view, 2);
            if (z10) {
                J(view, 0, (long) this.f5563f, this.f5565h);
                return;
            }
            view.setTranslationY((float) 0);
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f5567j = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f5563f = h.f(view.getContext(), f5559n, 225);
        this.f5564g = h.f(view.getContext(), f5560o, 175);
        Context context = view.getContext();
        int i11 = f5561p;
        this.f5565h = h.g(context, i11, r4.a.f15585d);
        this.f5566i = h.g(view.getContext(), i11, r4.a.f15584c);
        return super.p(coordinatorLayout, view, i10);
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            M(view);
        } else if (i11 < 0) {
            O(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
