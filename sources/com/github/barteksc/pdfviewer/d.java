package com.github.barteksc.pdfviewer;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

class d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: e  reason: collision with root package name */
    private PDFView f5141e;

    /* renamed from: f  reason: collision with root package name */
    private a f5142f;

    /* renamed from: g  reason: collision with root package name */
    private GestureDetector f5143g;

    /* renamed from: h  reason: collision with root package name */
    private ScaleGestureDetector f5144h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5145i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5146j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5147k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5148l = false;

    public d(PDFView pDFView, a aVar) {
        this.f5141e = pDFView;
        this.f5142f = aVar;
        this.f5145i = false;
        this.f5146j = pDFView.D();
        this.f5143g = new GestureDetector(pDFView.getContext(), this);
        this.f5144h = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    private void b() {
        this.f5141e.getScrollHandle();
    }

    public void a(boolean z10) {
        if (z10) {
            this.f5143g.setOnDoubleTapListener(this);
        } else {
            this.f5143g.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) null);
        }
    }

    public boolean c() {
        return this.f5141e.E();
    }

    public void d(MotionEvent motionEvent) {
        this.f5141e.L();
        b();
    }

    public void e(boolean z10) {
        this.f5145i = z10;
    }

    public void f(boolean z10) {
        this.f5146j = z10;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        PDFView pDFView;
        float x10;
        float y10;
        float maxZoom;
        if (this.f5141e.getZoom() < this.f5141e.getMidZoom()) {
            pDFView = this.f5141e;
            x10 = motionEvent.getX();
            y10 = motionEvent.getY();
            maxZoom = this.f5141e.getMidZoom();
        } else if (this.f5141e.getZoom() < this.f5141e.getMaxZoom()) {
            pDFView = this.f5141e;
            x10 = motionEvent.getX();
            y10 = motionEvent.getY();
            maxZoom = this.f5141e.getMaxZoom();
        } else {
            this.f5141e.T();
            return true;
        }
        pDFView.b0(x10, y10, maxZoom);
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f5142f.j();
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        float W;
        int currentXOffset = (int) this.f5141e.getCurrentXOffset();
        int currentYOffset = (int) this.f5141e.getCurrentYOffset();
        if (this.f5141e.D()) {
            PDFView pDFView = this.f5141e;
            f12 = -(pDFView.W(pDFView.getOptimalPageWidth()) - ((float) this.f5141e.getWidth()));
            W = this.f5141e.p();
        } else {
            f12 = -(this.f5141e.p() - ((float) this.f5141e.getWidth()));
            PDFView pDFView2 = this.f5141e;
            W = pDFView2.W(pDFView2.getOptimalPageHeight());
        }
        this.f5142f.e(currentXOffset, currentYOffset, (int) f10, (int) f11, (int) f12, 0, (int) (-(W - ((float) this.f5141e.getHeight()))), 0);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        if (r1 > r2) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onScale(android.view.ScaleGestureDetector r5) {
        /*
            r4 = this;
            float r0 = r5.getScaleFactor()
            com.github.barteksc.pdfviewer.PDFView r1 = r4.f5141e
            float r1 = r1.getZoom()
            float r1 = r1 * r0
            float r2 = s2.b.C0212b.f15884b
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x001a
        L_0x0011:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f5141e
            float r0 = r0.getZoom()
            float r0 = r2 / r0
            goto L_0x0021
        L_0x001a:
            float r2 = s2.b.C0212b.f15883a
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            goto L_0x0011
        L_0x0021:
            com.github.barteksc.pdfviewer.PDFView r1 = r4.f5141e
            android.graphics.PointF r2 = new android.graphics.PointF
            float r3 = r5.getFocusX()
            float r5 = r5.getFocusY()
            r2.<init>(r3, r5)
            r1.X(r0, r2)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.d.onScale(android.view.ScaleGestureDetector):boolean");
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f5148l = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f5141e.L();
        b();
        this.f5148l = false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f5147k = true;
        if (c() || this.f5145i) {
            this.f5141e.M(-f10, -f11);
        }
        if (!this.f5148l || this.f5141e.t()) {
            this.f5141e.K();
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f5141e.getOnTapListener();
        this.f5141e.getScrollHandle();
        this.f5141e.performClick();
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10 = this.f5143g.onTouchEvent(motionEvent) || this.f5144h.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f5147k) {
            this.f5147k = false;
            d(motionEvent);
        }
        return z10;
    }
}
