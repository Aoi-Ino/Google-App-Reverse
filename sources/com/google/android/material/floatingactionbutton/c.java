package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import h5.b;
import i5.g;
import i5.k;
import java.util.ArrayList;

class c extends b {
    private StateListAnimator O;

    static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    c(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    private StateListAnimator g0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(b.I, h0(f10, f12));
        stateListAnimator.addState(b.J, h0(f10, f11));
        stateListAnimator.addState(b.K, h0(f10, f11));
        stateListAnimator.addState(b.L, h0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f6034w, "elevation", new float[]{f10}).setDuration(0));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f6034w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f6034w, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(b.D);
        stateListAnimator.addState(b.M, animatorSet);
        stateListAnimator.addState(b.N, h0(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator h0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f6034w, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f6034w, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(b.D);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public void B(int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    public void C(float f10, float f11, float f12) {
        if (this.f6034w.getStateListAnimator() == this.O) {
            StateListAnimator g02 = g0(f10, f11, f12);
            this.O = g02;
            this.f6034w.setStateListAnimator(g02);
        }
        if (W()) {
            c0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f6014c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(g5.b.a(colorStateList));
        } else {
            super.S(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean W() {
        return this.f6035x.c() || !Y();
    }

    /* access modifiers changed from: package-private */
    public void a0() {
    }

    /* access modifiers changed from: package-private */
    public a f0(int i10, ColorStateList colorStateList) {
        Context context = this.f6034w.getContext();
        a aVar = new a((k) androidx.core.util.g.g(this.f6012a));
        aVar.e(androidx.core.content.a.c(context, q4.c.design_fab_stroke_top_outer_color), androidx.core.content.a.c(context, q4.c.design_fab_stroke_top_inner_color), androidx.core.content.a.c(context, q4.c.design_fab_stroke_end_inner_color), androidx.core.content.a.c(context, q4.c.design_fab_stroke_end_outer_color));
        aVar.d((float) i10);
        aVar.c(colorStateList);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public g i0() {
        return new a((k) androidx.core.util.g.g(this.f6012a));
    }

    public float j() {
        return this.f6034w.getElevation();
    }

    /* access modifiers changed from: package-private */
    public void o(Rect rect) {
        if (this.f6035x.c()) {
            super.o(rect);
            return;
        }
        int sizeDimension = !Y() ? (this.f6022k - this.f6034w.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: package-private */
    public void u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        g i02 = i0();
        this.f6013b = i02;
        i02.setTintList(colorStateList);
        if (mode != null) {
            this.f6013b.setTintMode(mode);
        }
        this.f6013b.M(this.f6034w.getContext());
        if (i10 > 0) {
            this.f6015d = f0(i10, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) androidx.core.util.g.g(this.f6015d), (Drawable) androidx.core.util.g.g(this.f6013b)});
        } else {
            this.f6015d = null;
            drawable = this.f6013b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(g5.b.a(colorStateList2), drawable, (Drawable) null);
        this.f6014c = rippleDrawable;
        this.f6016e = rippleDrawable;
    }

    /* access modifiers changed from: package-private */
    public void x() {
    }

    /* access modifiers changed from: package-private */
    public void z() {
        c0();
    }
}
