package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.m0;

abstract class d extends f {

    /* renamed from: h  reason: collision with root package name */
    private Runnable f5534h;

    /* renamed from: i  reason: collision with root package name */
    OverScroller f5535i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5536j;

    /* renamed from: k  reason: collision with root package name */
    private int f5537k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f5538l;

    /* renamed from: m  reason: collision with root package name */
    private int f5539m = -1;

    /* renamed from: n  reason: collision with root package name */
    private VelocityTracker f5540n;

    private class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final CoordinatorLayout f5541e;

        /* renamed from: f  reason: collision with root package name */
        private final View f5542f;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f5541e = coordinatorLayout;
            this.f5542f = view;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f5542f != null && (overScroller = d.this.f5535i) != null) {
                if (overScroller.computeScrollOffset()) {
                    d dVar = d.this;
                    dVar.T(this.f5541e, this.f5542f, dVar.f5535i.getCurrY());
                    m0.i0(this.f5542f, this);
                    return;
                }
                d.this.R(this.f5541e, this.f5542f);
            }
        }
    }

    public d() {
    }

    private void M() {
        if (this.f5540n == null) {
            this.f5540n = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f5537k = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f5538l = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f5537k
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f5538l
            int r7 = r1 - r0
            r11.f5538l = r0
            int r8 = r11.O(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.S(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f5540n
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f5540n
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f5540n
            int r4 = r11.f5537k
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.P(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.N(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f5536j = r3
            r11.f5537k = r1
            android.view.VelocityTracker r13 = r11.f5540n
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f5540n = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f5540n
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f5536j
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.d.H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract boolean L(View view);

    /* access modifiers changed from: package-private */
    public final boolean N(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        View view2 = view;
        Runnable runnable = this.f5534h;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f5534h = null;
        }
        if (this.f5535i == null) {
            this.f5535i = new OverScroller(view.getContext());
        }
        this.f5535i.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f5535i.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            a aVar = new a(coordinatorLayout, view);
            this.f5534h = aVar;
            m0.i0(view, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        R(coordinatorLayout, view);
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract int O(View view);

    /* access modifiers changed from: package-private */
    public abstract int P(View view);

    /* access modifiers changed from: package-private */
    public abstract int Q();

    /* access modifiers changed from: package-private */
    public abstract void R(CoordinatorLayout coordinatorLayout, View view);

    /* access modifiers changed from: package-private */
    public final int S(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return U(coordinatorLayout, view, Q() - i10, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public int T(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return U(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public abstract int U(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f5539m < 0) {
            this.f5539m = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f5536j) {
            int i10 = this.f5537k;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f5538l) > this.f5539m) {
                this.f5538l = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f5537k = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(view) && coordinatorLayout.B(view, x10, y11);
            this.f5536j = z10;
            if (z10) {
                this.f5538l = y11;
                this.f5537k = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f5535i;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f5535i.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f5540n;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
