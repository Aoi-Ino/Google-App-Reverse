package com.github.barteksc.pdfviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;

class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public PDFView f5116a;

    /* renamed from: b  reason: collision with root package name */
    private ValueAnimator f5117b;

    /* renamed from: c  reason: collision with root package name */
    private OverScroller f5118c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5119d = false;

    /* renamed from: com.github.barteksc.pdfviewer.a$a  reason: collision with other inner class name */
    class C0095a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        C0095a() {
        }

        public void onAnimationCancel(Animator animator) {
            a.this.f5116a.L();
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f5116a.L();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f5116a.N(((Float) valueAnimator.getAnimatedValue()).floatValue(), a.this.f5116a.getCurrentYOffset());
            a.this.f5116a.K();
        }
    }

    class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationCancel(Animator animator) {
            a.this.f5116a.L();
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f5116a.L();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f5116a.N(a.this.f5116a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            a.this.f5116a.K();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        private final float f5122a;

        /* renamed from: b  reason: collision with root package name */
        private final float f5123b;

        public c(float f10, float f11) {
            this.f5122a = f10;
            this.f5123b = f11;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f5116a.L();
            a.this.d();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f5116a.Y(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f5122a, this.f5123b));
        }
    }

    public a(PDFView pDFView) {
        this.f5116a = pDFView;
        this.f5118c = new OverScroller(pDFView.getContext());
    }

    /* access modifiers changed from: private */
    public void d() {
        this.f5116a.getScrollHandle();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f5118c.computeScrollOffset()) {
            this.f5116a.N((float) this.f5118c.getCurrX(), (float) this.f5118c.getCurrY());
            this.f5116a.K();
        } else if (this.f5119d) {
            this.f5119d = false;
            this.f5116a.L();
            d();
        }
    }

    public void e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        i();
        this.f5119d = true;
        this.f5118c.fling(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public void f(float f10, float f11) {
        i();
        this.f5117b = ValueAnimator.ofFloat(new float[]{f10, f11});
        C0095a aVar = new C0095a();
        this.f5117b.setInterpolator(new DecelerateInterpolator());
        this.f5117b.addUpdateListener(aVar);
        this.f5117b.addListener(aVar);
        this.f5117b.setDuration(400);
        this.f5117b.start();
    }

    public void g(float f10, float f11) {
        i();
        this.f5117b = ValueAnimator.ofFloat(new float[]{f10, f11});
        b bVar = new b();
        this.f5117b.setInterpolator(new DecelerateInterpolator());
        this.f5117b.addUpdateListener(bVar);
        this.f5117b.addListener(bVar);
        this.f5117b.setDuration(400);
        this.f5117b.start();
    }

    public void h(float f10, float f11, float f12, float f13) {
        i();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f12, f13});
        this.f5117b = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        c cVar = new c(f10, f11);
        this.f5117b.addUpdateListener(cVar);
        this.f5117b.addListener(cVar);
        this.f5117b.setDuration(400);
        this.f5117b.start();
    }

    public void i() {
        ValueAnimator valueAnimator = this.f5117b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5117b = null;
        }
        j();
    }

    public void j() {
        this.f5119d = false;
        this.f5118c.forceFinished(true);
    }
}
