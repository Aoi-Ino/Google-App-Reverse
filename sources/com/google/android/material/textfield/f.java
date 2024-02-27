package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import d5.h;
import q4.e;
import q4.i;

class f extends t {

    /* renamed from: e  reason: collision with root package name */
    private final int f6422e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6423f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f6424g;

    /* renamed from: h  reason: collision with root package name */
    private final TimeInterpolator f6425h;

    /* renamed from: i  reason: collision with root package name */
    private EditText f6426i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f6427j = new d(this);

    /* renamed from: k  reason: collision with root package name */
    private final View.OnFocusChangeListener f6428k = new e(this);

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f6429l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f6430m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationStart(Animator animator) {
            f.this.f6488b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            f.this.f6488b.a0(false);
        }
    }

    f(s sVar) {
        super(sVar);
        Context context = sVar.getContext();
        int i10 = q4.b.motionDurationShort3;
        this.f6422e = h.f(context, i10, 100);
        this.f6423f = h.f(sVar.getContext(), i10, 150);
        this.f6424g = h.g(sVar.getContext(), q4.b.motionEasingLinearInterpolator, r4.a.f15582a);
        this.f6425h = h.g(sVar.getContext(), q4.b.motionEasingEmphasizedInterpolator, r4.a.f15585d);
    }

    private void A(boolean z10) {
        boolean z11 = this.f6488b.F() == z10;
        if (z10 && !this.f6429l.isRunning()) {
            this.f6430m.cancel();
            this.f6429l.start();
            if (z11) {
                this.f6429l.end();
            }
        } else if (!z10) {
            this.f6429l.cancel();
            this.f6430m.start();
            if (z11) {
                this.f6430m.end();
            }
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f6424g);
        ofFloat.setDuration((long) this.f6422e);
        ofFloat.addUpdateListener(new c(this));
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f6425h);
        ofFloat.setDuration((long) this.f6423f);
        ofFloat.addUpdateListener(new b(this));
        return ofFloat;
    }

    private void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6429l = animatorSet;
        animatorSet.playTogether(new Animator[]{C, B});
        this.f6429l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.f6430m = B2;
        B2.addListener(new b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f6490d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6490d.setScaleX(floatValue);
        this.f6490d.setScaleY(floatValue);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f6426i;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            r();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z10) {
        A(J());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f6426i;
        return editText != null && (editText.hasFocus() || this.f6490d.hasFocus()) && this.f6426i.getText().length() > 0;
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
        if (this.f6488b.w() == null) {
            A(J());
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return i.clear_text_end_icon_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return e.mtrl_ic_cancel;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f6428k;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f6427j;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return this.f6428k;
    }

    public void n(EditText editText) {
        this.f6426i = editText;
        this.f6487a.setEndIconVisible(J());
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        if (this.f6488b.w() != null) {
            A(z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        D();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f6426i;
        if (editText != null) {
            editText.post(new a(this));
        }
    }
}
