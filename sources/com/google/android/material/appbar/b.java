package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import i5.g;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5527a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ColorStateList f5528b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ColorStateList f5529c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f5530d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Integer f5531e;

    public /* synthetic */ b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, g gVar, Integer num) {
        this.f5527a = appBarLayout;
        this.f5528b = colorStateList;
        this.f5529c = colorStateList2;
        this.f5530d = gVar;
        this.f5531e = num;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5527a.q(this.f5528b, this.f5529c, this.f5530d, this.f5531e, valueAnimator);
    }
}
