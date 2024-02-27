package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import ll.h;

public class GestureCropImageView extends a {
    private ScaleGestureDetector I;
    private h J;
    private GestureDetector K;
    /* access modifiers changed from: private */
    public float L;
    /* access modifiers changed from: private */
    public float M;
    private boolean N;
    private boolean O;
    private int P;

    private class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.B(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            GestureCropImageView.this.m(-f10, -f11);
            return true;
        }
    }

    private class c extends h.b {
        private c() {
        }

        public boolean a(h hVar) {
            GestureCropImageView.this.k(hVar.c(), GestureCropImageView.this.L, GestureCropImageView.this.M);
            return true;
        }
    }

    private class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.l(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.L, GestureCropImageView.this.M);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void I() {
        this.K = new GestureDetector(getContext(), new b(), (Handler) null, true);
        this.I = new ScaleGestureDetector(getContext(), new d());
        this.J = new h(new c());
    }

    public int getDoubleTapScaleSteps() {
        return this.P;
    }

    /* access modifiers changed from: protected */
    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.P))));
    }

    /* access modifiers changed from: protected */
    public void i() {
        super.i();
        I();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            t();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.L = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.M = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.K.onTouchEvent(motionEvent);
        if (this.O) {
            this.I.onTouchEvent(motionEvent);
        }
        if (this.N) {
            this.J.d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            z();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i10) {
        this.P = i10;
    }

    public void setRotateEnabled(boolean z10) {
        this.N = z10;
    }

    public void setScaleEnabled(boolean z10) {
        this.O = z10;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.N = true;
        this.O = true;
        this.P = 5;
    }
}
