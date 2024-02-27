package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d0;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import c0.d;
import com.google.android.material.internal.u;
import i5.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import q4.j;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c implements d5.b {

    /* renamed from: m0  reason: collision with root package name */
    private static final int f5598m0 = j.Widget_Design_BottomSheet_Modal;
    /* access modifiers changed from: private */
    public int A;
    /* access modifiers changed from: private */
    public int B;
    private boolean C;
    private k D;
    private boolean E;
    private final i F = new i(this, (a) null);
    private ValueAnimator G;
    int H;
    int I;
    int J;
    float K = 0.5f;
    int L;
    float M = -1.0f;
    boolean N;
    /* access modifiers changed from: private */
    public boolean O;
    /* access modifiers changed from: private */
    public boolean P = true;
    int Q = 4;
    int R = 4;
    c0.d S;
    private boolean T;
    private int U;
    private boolean V;
    private float W = 0.1f;
    private int X;
    int Y;
    int Z;

    /* renamed from: a0  reason: collision with root package name */
    WeakReference f5599a0;

    /* renamed from: b0  reason: collision with root package name */
    WeakReference f5600b0;

    /* renamed from: c0  reason: collision with root package name */
    WeakReference f5601c0;

    /* renamed from: d0  reason: collision with root package name */
    private final ArrayList f5602d0 = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f5603e = 0;

    /* renamed from: e0  reason: collision with root package name */
    private VelocityTracker f5604e0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f5605f = true;

    /* renamed from: f0  reason: collision with root package name */
    d5.f f5606f0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5607g = false;

    /* renamed from: g0  reason: collision with root package name */
    int f5608g0;

    /* renamed from: h  reason: collision with root package name */
    private float f5609h;

    /* renamed from: h0  reason: collision with root package name */
    private int f5610h0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f5611i;

    /* renamed from: i0  reason: collision with root package name */
    boolean f5612i0;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f5613j;

    /* renamed from: j0  reason: collision with root package name */
    private Map f5614j0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5615k;

    /* renamed from: k0  reason: collision with root package name */
    final SparseIntArray f5616k0 = new SparseIntArray();

    /* renamed from: l  reason: collision with root package name */
    private int f5617l;

    /* renamed from: l0  reason: collision with root package name */
    private final d.c f5618l0 = new e();

    /* renamed from: m  reason: collision with root package name */
    private int f5619m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public i5.g f5620n;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f5621o;

    /* renamed from: p  reason: collision with root package name */
    private int f5622p = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f5623q = -1;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f5624r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f5625s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f5626t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f5627u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f5628v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f5629w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f5630x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public boolean f5631y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public boolean f5632z;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f5633e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5634f;

        a(View view, int i10) {
            this.f5633e = view;
            this.f5634f = i10;
        }

        public void run() {
            BottomSheetBehavior.this.c1(this.f5633e, this.f5634f, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.V0(5);
            WeakReference weakReference = BottomSheetBehavior.this.f5599a0;
            if (weakReference != null && weakReference.get() != null) {
                ((View) BottomSheetBehavior.this.f5599a0.get()).requestLayout();
            }
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f5620n != null) {
                BottomSheetBehavior.this.f5620n.X(floatValue);
            }
        }
    }

    class d implements u.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f5638a;

        d(boolean z10) {
            this.f5638a = z10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
            if (r6 != false) goto L_0x00a6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.view.k1 a(android.view.View r11, androidx.core.view.k1 r12, com.google.android.material.internal.u.d r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.k1.m.d()
                androidx.core.graphics.f r0 = r12.f(r0)
                int r1 = androidx.core.view.k1.m.c()
                androidx.core.graphics.f r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f2374b
                int unused = r2.B = r3
                boolean r2 = com.google.android.material.internal.u.g(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f5626t
                if (r6 == 0) goto L_0x0041
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.i()
                int unused = r3.A = r6
                int r3 = r13.f6216d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.A
                int r3 = r3 + r6
            L_0x0041:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f5627u
                if (r6 == 0) goto L_0x0053
                if (r2 == 0) goto L_0x004e
                int r4 = r13.f6215c
                goto L_0x0050
            L_0x004e:
                int r4 = r13.f6213a
            L_0x0050:
                int r6 = r0.f2373a
                int r4 = r4 + r6
            L_0x0053:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f5628v
                if (r6 == 0) goto L_0x0066
                if (r2 == 0) goto L_0x0060
                int r13 = r13.f6213a
                goto L_0x0062
            L_0x0060:
                int r13 = r13.f6215c
            L_0x0062:
                int r2 = r0.f2375c
                int r5 = r13 + r2
            L_0x0066:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = r2.f5630x
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L_0x0080
                int r2 = r13.leftMargin
                int r8 = r0.f2373a
                if (r2 == r8) goto L_0x0080
                r13.leftMargin = r8
                r2 = r6
                goto L_0x0081
            L_0x0080:
                r2 = r7
            L_0x0081:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f5631y
                if (r8 == 0) goto L_0x0092
                int r8 = r13.rightMargin
                int r9 = r0.f2375c
                if (r8 == r9) goto L_0x0092
                r13.rightMargin = r9
                goto L_0x0093
            L_0x0092:
                r6 = r2
            L_0x0093:
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = r2.f5632z
                if (r2 == 0) goto L_0x00a4
                int r2 = r13.topMargin
                int r0 = r0.f2374b
                if (r2 == r0) goto L_0x00a4
                r13.topMargin = r0
                goto L_0x00a6
            L_0x00a4:
                if (r6 == 0) goto L_0x00a9
            L_0x00a6:
                r11.setLayoutParams(r13)
            L_0x00a9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f5638a
                if (r11 == 0) goto L_0x00bb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f2376d
                int unused = r11.f5624r = r13
            L_0x00bb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = r11.f5626t
                if (r11 != 0) goto L_0x00c7
                boolean r11 = r10.f5638a
                if (r11 == 0) goto L_0x00cc
            L_0x00c7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r11.h1(r7)
            L_0x00cc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, androidx.core.view.k1, com.google.android.material.internal.u$d):androidx.core.view.k1");
        }
    }

    class e extends d.c {

        /* renamed from: a  reason: collision with root package name */
        private long f5640a;

        e() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.Z + bottomSheetBehavior.s0()) / 2;
        }

        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        public int b(View view, int i10, int i11) {
            return y.a.b(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.Z : BottomSheetBehavior.this.L;
        }

        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.P) {
                BottomSheetBehavior.this.V0(1);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r9 > r7.f5641b.J) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f5641b.s0()) < java.lang.Math.abs(r8.getTop() - r7.f5641b.J)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
            if (r7.f5641b.a1() == false) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
            if (java.lang.Math.abs(r9 - r7.f5641b.I) < java.lang.Math.abs(r9 - r7.f5641b.L)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
            if (r7.f5641b.a1() != false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
            if (r7.f5641b.a1() == false) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
            if (r10.X0(r0, (((float) r9) * 100.0f) / ((float) r10.Z)) != false) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 6
                r3 = 3
                r4 = 4
                if (r1 >= 0) goto L_0x003f
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f5605f
                if (r9 == 0) goto L_0x0013
            L_0x0010:
                r2 = r3
                goto L_0x012a
            L_0x0013:
                int r9 = r8.getTop()
                long r0 = java.lang.System.currentTimeMillis()
                long r5 = r7.f5640a
                long r0 = r0 - r5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.a1()
                if (r10 == 0) goto L_0x0037
                float r9 = (float) r9
                r10 = 1120403456(0x42c80000, float:100.0)
                float r9 = r9 * r10
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r2 = r10.Z
                float r2 = (float) r2
                float r9 = r9 / r2
                boolean r9 = r10.X0(r0, r9)
                if (r9 == 0) goto L_0x00ad
                goto L_0x0010
            L_0x0037:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.J
                if (r9 <= r10) goto L_0x0010
                goto L_0x012a
            L_0x003f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.N
                if (r5 == 0) goto L_0x0094
                boolean r1 = r1.Z0(r8, r10)
                if (r1 == 0) goto L_0x0094
                float r9 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r10)
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0062
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f5611i
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x0068
            L_0x0062:
                boolean r9 = r7.n(r8)
                if (r9 == 0) goto L_0x006b
            L_0x0068:
                r2 = 5
                goto L_0x012a
            L_0x006b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f5605f
                if (r9 == 0) goto L_0x0074
                goto L_0x0010
            L_0x0074:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.s0()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.J
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x012a
                goto L_0x0010
            L_0x0094:
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00d2
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x00a5
                goto L_0x00d2
            L_0x00a5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f5605f
                if (r9 == 0) goto L_0x00b0
            L_0x00ad:
                r2 = r4
                goto L_0x012a
            L_0x00b0:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.J
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.L
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.a1()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x00d2:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f5605f
                if (r10 == 0) goto L_0x00f5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.I
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.L
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                goto L_0x0010
            L_0x00f5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.J
                if (r9 >= r0) goto L_0x0110
                int r10 = r10.L
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0107
                goto L_0x0010
            L_0x0107:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.a1()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x0110:
                int r10 = r9 - r0
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.L
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.a1()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x012a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.b1()
                r9.c1(r8, r2, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.Q;
            if (i11 == 1 || bottomSheetBehavior.f5612i0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f5608g0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f5601c0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f5640a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f5599a0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements d0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5642a;

        f(int i10) {
            this.f5642a = i10;
        }

        public boolean a(View view, d0.a aVar) {
            BottomSheetBehavior.this.U0(this.f5642a);
            return true;
        }
    }

    public static abstract class g {
        /* access modifiers changed from: package-private */
        public void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    protected static class h extends b0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        final int f5644g;

        /* renamed from: h  reason: collision with root package name */
        int f5645h;

        /* renamed from: i  reason: collision with root package name */
        boolean f5646i;

        /* renamed from: j  reason: collision with root package name */
        boolean f5647j;

        /* renamed from: k  reason: collision with root package name */
        boolean f5648k;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5644g = parcel.readInt();
            this.f5645h = parcel.readInt();
            boolean z10 = false;
            this.f5646i = parcel.readInt() == 1;
            this.f5647j = parcel.readInt() == 1;
            this.f5648k = parcel.readInt() == 1 ? true : z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5644g);
            parcel.writeInt(this.f5645h);
            parcel.writeInt(this.f5646i ? 1 : 0);
            parcel.writeInt(this.f5647j ? 1 : 0);
            parcel.writeInt(this.f5648k ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f5644g = bottomSheetBehavior.Q;
            this.f5645h = bottomSheetBehavior.f5613j;
            this.f5646i = bottomSheetBehavior.f5605f;
            this.f5647j = bottomSheetBehavior.N;
            this.f5648k = bottomSheetBehavior.O;
        }
    }

    private class i {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f5649a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f5650b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f5651c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                boolean unused = i.this.f5650b = false;
                c0.d dVar = BottomSheetBehavior.this.S;
                if (dVar == null || !dVar.m(true)) {
                    i iVar = i.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.Q == 2) {
                        bottomSheetBehavior.V0(iVar.f5649a);
                        return;
                    }
                    return;
                }
                i iVar2 = i.this;
                iVar2.c(iVar2.f5649a);
            }
        }

        private i() {
            this.f5651c = new a();
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f5599a0;
            if (weakReference != null && weakReference.get() != null) {
                this.f5649a = i10;
                if (!this.f5650b) {
                    m0.i0((View) BottomSheetBehavior.this.f5599a0.get(), this.f5651c);
                    this.f5650b = true;
                }
            }
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior() {
    }

    private boolean B0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && m0.T(view);
    }

    private void D0(View view, y.a aVar, int i10) {
        m0.m0(view, aVar, (CharSequence) null, l0(i10));
    }

    private void E0() {
        this.f5608g0 = -1;
        this.f5610h0 = -1;
        VelocityTracker velocityTracker = this.f5604e0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5604e0 = null;
        }
    }

    private void F0(h hVar) {
        int i10 = this.f5603e;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f5613j = hVar.f5645h;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f5605f = hVar.f5646i;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.N = hVar.f5647j;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.O = hVar.f5648k;
            }
        }
    }

    private void G0(View view, Runnable runnable) {
        if (B0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void W0(View view) {
        boolean z10 = Build.VERSION.SDK_INT >= 29 && !y0() && !this.f5615k;
        if (this.f5626t || this.f5627u || this.f5628v || this.f5630x || this.f5631y || this.f5632z || z10) {
            u.b(view, new d(z10));
        }
    }

    private boolean Y0() {
        return this.S != null && (this.P || this.Q == 1);
    }

    private int b0(View view, int i10, int i11) {
        return m0.c(view, view.getResources().getString(i10), l0(i11));
    }

    /* access modifiers changed from: private */
    public void c1(View view, int i10, boolean z10) {
        int u02 = u0(i10);
        c0.d dVar = this.S;
        if (dVar == null || (!z10 ? !dVar.Q(view, view.getLeft(), u02) : !dVar.O(view.getLeft(), u02))) {
            V0(i10);
            return;
        }
        V0(2);
        f1(i10, true);
        this.F.c(i10);
    }

    private void d0() {
        int h02 = h0();
        if (this.f5605f) {
            this.L = Math.max(this.Z - h02, this.I);
        } else {
            this.L = this.Z - h02;
        }
    }

    private void d1() {
        WeakReference weakReference = this.f5599a0;
        if (weakReference != null) {
            e1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f5600b0;
        if (weakReference2 != null) {
            e1((View) weakReference2.get(), 1);
        }
    }

    private float e0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float a10 = (float) roundedCorner.getRadius();
            if (a10 > 0.0f && f10 > 0.0f) {
                return a10 / f10;
            }
        }
        return 0.0f;
    }

    private void e1(View view, int i10) {
        y.a aVar;
        if (view != null) {
            k0(view, i10);
            int i11 = 6;
            if (!this.f5605f && this.Q != 6) {
                this.f5616k0.put(i10, b0(view, q4.i.bottomsheet_action_expand_halfway, 6));
            }
            if (this.N && A0() && this.Q != 5) {
                D0(view, y.a.f2554y, 5);
            }
            int i12 = this.Q;
            if (i12 == 3) {
                if (this.f5605f) {
                    i11 = 4;
                }
                aVar = y.a.f2553x;
            } else if (i12 == 4) {
                if (this.f5605f) {
                    i11 = 3;
                }
                aVar = y.a.f2552w;
            } else if (i12 == 6) {
                D0(view, y.a.f2553x, 4);
                D0(view, y.a.f2552w, 3);
                return;
            } else {
                return;
            }
            D0(view, aVar, i11);
        }
    }

    private void f0() {
        this.J = (int) (((float) this.Z) * (1.0f - this.K));
    }

    private void f1(int i10, boolean z10) {
        boolean x02;
        ValueAnimator valueAnimator;
        if (i10 != 2 && this.E != (x02 = x0()) && this.f5620n != null) {
            this.E = x02;
            float f10 = 1.0f;
            if (!z10 || (valueAnimator = this.G) == null) {
                ValueAnimator valueAnimator2 = this.G;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.G.cancel();
                }
                i5.g gVar = this.f5620n;
                if (this.E) {
                    f10 = g0();
                }
                gVar.X(f10);
            } else if (valueAnimator.isRunning()) {
                this.G.reverse();
            } else {
                float y10 = this.f5620n.y();
                if (x02) {
                    f10 = g0();
                }
                this.G.setFloatValues(new float[]{y10, f10});
                this.G.start();
            }
        }
    }

    private float g0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f5620n == null || (weakReference = this.f5599a0) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f5599a0.get();
        if (!w0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f5620n.F(), rootWindowInsets.getRoundedCorner(0)), e0(this.f5620n.G(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void g1(boolean z10) {
        Map map;
        int intValue;
        WeakReference weakReference = this.f5599a0;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.f5614j0 == null) {
                        this.f5614j0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.f5599a0.get()) {
                        if (z10) {
                            this.f5614j0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f5607g) {
                                intValue = 4;
                            }
                        } else if (this.f5607g && (map = this.f5614j0) != null && map.containsKey(childAt)) {
                            intValue = ((Integer) this.f5614j0.get(childAt)).intValue();
                        }
                        m0.B0(childAt, intValue);
                    }
                }
                if (!z10) {
                    this.f5614j0 = null;
                } else if (this.f5607g) {
                    ((View) this.f5599a0.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f5624r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int h0() {
        /*
            r3 = this;
            boolean r0 = r3.f5615k
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f5617l
            int r1 = r3.Z
            int r2 = r3.Y
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.X
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.A
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f5625s
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f5626t
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f5624r
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f5613j
            int r2 = r3.f5619m
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f5613j
            int r1 = r3.A
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h0():int");
    }

    /* access modifiers changed from: private */
    public void h1(boolean z10) {
        View view;
        if (this.f5599a0 != null) {
            d0();
            if (this.Q == 4 && (view = (View) this.f5599a0.get()) != null) {
                if (z10) {
                    U0(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    private float i0(int i10) {
        float f10;
        float f11;
        int i11 = this.L;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.L;
            f10 = (float) (i12 - i10);
            f11 = (float) (this.Z - i12);
        } else {
            int i13 = this.L;
            f10 = (float) (i13 - i10);
            f11 = (float) (i13 - s0());
        }
        return f10 / f11;
    }

    /* access modifiers changed from: private */
    public boolean j0() {
        return z0() && A0();
    }

    private void k0(View view, int i10) {
        if (view != null) {
            m0.k0(view, 524288);
            m0.k0(view, 262144);
            m0.k0(view, 1048576);
            int i11 = this.f5616k0.get(i10, -1);
            if (i11 != -1) {
                m0.k0(view, i11);
                this.f5616k0.delete(i10);
            }
        }
    }

    private d0 l0(int i10) {
        return new f(i10);
    }

    private void m0(Context context) {
        if (this.D != null) {
            i5.g gVar = new i5.g(this.D);
            this.f5620n = gVar;
            gVar.M(context);
            ColorStateList colorStateList = this.f5621o;
            if (colorStateList != null) {
                this.f5620n.W(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f5620n.setTint(typedValue.data);
        }
    }

    private void n0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{g0(), 1.0f});
        this.G = ofFloat;
        ofFloat.setDuration(500);
        this.G.addUpdateListener(new c());
    }

    public static BottomSheetBehavior q0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
            if (f10 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f10;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int r0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private int u0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.L;
        }
        if (i10 == 5) {
            return this.Z;
        }
        if (i10 == 6) {
            return this.J;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float v0() {
        VelocityTracker velocityTracker = this.f5604e0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f5609h);
        return this.f5604e0.getYVelocity(this.f5608g0);
    }

    private boolean w0() {
        WeakReference weakReference = this.f5599a0;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f5599a0.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean x0() {
        return this.Q == 3 && (this.C || w0());
    }

    public boolean A0() {
        return true;
    }

    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, view, hVar.c());
        F0(hVar);
        int i10 = hVar.f5644g;
        if (i10 == 1 || i10 == 2) {
            i10 = 4;
        }
        this.Q = i10;
        this.R = i10;
    }

    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new h(super.C(coordinatorLayout, view), this);
    }

    public boolean C0() {
        return true;
    }

    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.U = 0;
        this.V = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4.getTop() <= r2.J) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.I) < java.lang.Math.abs(r3 - r2.L)) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (a1() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.L)) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.J) < java.lang.Math.abs(r3 - r2.L)) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.s0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.V0(r0)
            return
        L_0x000f:
            boolean r3 = r2.C0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference r3 = r2.f5601c0
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.V
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.U
            r5 = 6
            if (r3 <= 0) goto L_0x0039
            boolean r3 = r2.f5605f
            if (r3 == 0) goto L_0x002f
            goto L_0x00aa
        L_0x002f:
            int r3 = r4.getTop()
            int r6 = r2.J
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x0039:
            boolean r3 = r2.N
            if (r3 == 0) goto L_0x0049
            float r3 = r2.v0()
            boolean r3 = r2.Z0(r4, r3)
            if (r3 == 0) goto L_0x0049
            r0 = 5
            goto L_0x00aa
        L_0x0049:
            int r3 = r2.U
            r6 = 4
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f5605f
            if (r1 == 0) goto L_0x0068
            int r5 = r2.I
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.L
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.J
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.L
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.a1()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.L
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f5605f
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = r6
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.J
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.L
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = r5
        L_0x00aa:
            r3 = 0
            r2.c1(r4, r0, r3)
            r2.V = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.Q == 1 && actionMasked == 0) {
            return true;
        }
        if (Y0()) {
            this.S.F(motionEvent);
        }
        if (actionMasked == 0) {
            E0();
        }
        if (this.f5604e0 == null) {
            this.f5604e0 = VelocityTracker.obtain();
        }
        this.f5604e0.addMovement(motionEvent);
        if (Y0() && actionMasked == 2 && !this.T && Math.abs(((float) this.f5610h0) - motionEvent.getY()) > ((float) this.S.z())) {
            this.S.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.T;
    }

    public void H0(boolean z10) {
        this.P = z10;
    }

    public void I0(int i10) {
        if (i10 >= 0) {
            this.H = i10;
            f1(this.Q, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void J0(boolean z10) {
        if (this.f5605f != z10) {
            this.f5605f = z10;
            if (this.f5599a0 != null) {
                d0();
            }
            V0((!this.f5605f || this.Q != 6) ? this.Q : 3);
            f1(this.Q, true);
            d1();
        }
    }

    public void K0(boolean z10) {
        this.f5625s = z10;
    }

    public void L0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.K = f10;
        if (this.f5599a0 != null) {
            f0();
        }
    }

    public void M0(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            if (!z10 && this.Q == 5) {
                U0(4);
            }
            d1();
        }
    }

    public void N0(int i10) {
        this.f5623q = i10;
    }

    public void O0(int i10) {
        this.f5622p = i10;
    }

    public void P0(int i10) {
        Q0(i10, false);
    }

    public final void Q0(int i10, boolean z10) {
        if (i10 == -1) {
            if (!this.f5615k) {
                this.f5615k = true;
            } else {
                return;
            }
        } else if (this.f5615k || this.f5613j != i10) {
            this.f5615k = false;
            this.f5613j = Math.max(0, i10);
        } else {
            return;
        }
        h1(z10);
    }

    public void R0(int i10) {
        this.f5603e = i10;
    }

    public void S0(int i10) {
        this.f5611i = i10;
    }

    public void T0(boolean z10) {
        this.O = z10;
    }

    public void U0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        } else if (this.N || i10 != 5) {
            int i11 = (i10 != 6 || !this.f5605f || u0(i10) > this.I) ? i10 : 3;
            WeakReference weakReference = this.f5599a0;
            if (weakReference == null || weakReference.get() == null) {
                V0(i10);
                return;
            }
            View view = (View) this.f5599a0.get();
            G0(view, new a(view, i11));
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void V0(int i10) {
        View view;
        if (this.Q != i10) {
            this.Q = i10;
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.N && i10 == 5)) {
                this.R = i10;
            }
            WeakReference weakReference = this.f5599a0;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i10 == 3) {
                    g1(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    g1(false);
                }
                f1(i10, true);
                for (int i11 = 0; i11 < this.f5602d0.size(); i11++) {
                    ((g) this.f5602d0.get(i11)).c(view, i10);
                }
                d1();
            }
        }
    }

    public boolean X0(long j10, float f10) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean Z0(View view, float f10) {
        if (this.O) {
            return true;
        }
        if (!A0() || view.getTop() < this.L) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * this.W)) - ((float) this.L)) / ((float) h0()) > 0.5f;
    }

    public void a() {
        d5.f fVar = this.f5606f0;
        if (fVar != null) {
            androidx.activity.b c10 = fVar.c();
            int i10 = 4;
            if (c10 == null || Build.VERSION.SDK_INT < 34) {
                if (this.N) {
                    i10 = 5;
                }
                U0(i10);
            } else if (this.N) {
                this.f5606f0.h(c10, new b());
            } else {
                this.f5606f0.i(c10, (Animator.AnimatorListener) null);
                U0(4);
            }
        }
    }

    public boolean a1() {
        return false;
    }

    public void b(androidx.activity.b bVar) {
        d5.f fVar = this.f5606f0;
        if (fVar != null) {
            fVar.j(bVar);
        }
    }

    public boolean b1() {
        return true;
    }

    public void c(androidx.activity.b bVar) {
        d5.f fVar = this.f5606f0;
        if (fVar != null) {
            fVar.l(bVar);
        }
    }

    public void c0(g gVar) {
        if (!this.f5602d0.contains(gVar)) {
            this.f5602d0.add(gVar);
        }
    }

    public void d() {
        d5.f fVar = this.f5606f0;
        if (fVar != null) {
            fVar.f();
        }
    }

    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f5599a0 = null;
        this.S = null;
        this.f5606f0 = null;
    }

    public void n() {
        super.n();
        this.f5599a0 = null;
        this.S = null;
        this.f5606f0 = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r9.P
            if (r0 != 0) goto L_0x000e
            goto L_0x00d4
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.E0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f5604e0
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f5604e0 = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f5604e0
            r3.addMovement(r12)
            r3 = 0
            r4 = 2
            r5 = -1
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f5612i0 = r1
            r9.f5608g0 = r5
            boolean r11 = r9.T
            if (r11 == 0) goto L_0x007f
            r9.T = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f5610h0 = r7
            int r7 = r9.Q
            if (r7 == r4) goto L_0x006e
            java.lang.ref.WeakReference r7 = r9.f5601c0
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f5610h0
            boolean r7 = r10.B(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f5608g0 = r7
            r9.f5612i0 = r2
        L_0x006e:
            int r7 = r9.f5608g0
            if (r7 != r5) goto L_0x007c
            int r7 = r9.f5610h0
            boolean r11 = r10.B(r11, r6, r7)
            if (r11 != 0) goto L_0x007c
            r11 = r2
            goto L_0x007d
        L_0x007c:
            r11 = r1
        L_0x007d:
            r9.T = r11
        L_0x007f:
            boolean r11 = r9.T
            if (r11 != 0) goto L_0x008e
            c0.d r11 = r9.S
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.P(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference r11 = r9.f5601c0
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r4) goto L_0x00d3
            if (r3 == 0) goto L_0x00d3
            boolean r11 = r9.T
            if (r11 != 0) goto L_0x00d3
            int r11 = r9.Q
            if (r11 == r2) goto L_0x00d3
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.B(r3, r11, r0)
            if (r10 != 0) goto L_0x00d3
            c0.d r10 = r9.S
            if (r10 == 0) goto L_0x00d3
            int r10 = r9.f5610h0
            if (r10 == r5) goto L_0x00d3
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            c0.d r11 = r9.S
            int r11 = r11.z()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d3
            r1 = r2
        L_0x00d3:
            return r1
        L_0x00d4:
            r9.T = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.o(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void o0(int i10) {
        View view = (View) this.f5599a0.get();
        if (view != null && !this.f5602d0.isEmpty()) {
            float i02 = i0(i10);
            for (int i11 = 0; i11 < this.f5602d0.size(); i11++) {
                ((g) this.f5602d0.get(i11)).b(view, i02);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r5 == -1) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        if (r5 == -1) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103 A[LOOP:0: B:52:0x00fb->B:54:0x0103, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
        /*
            r4 = this;
            boolean r0 = androidx.core.view.m0.y(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.m0.y(r6)
            if (r0 != 0) goto L_0x0010
            r6.setFitsSystemWindows(r1)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r4.f5599a0
            if (r0 != 0) goto L_0x0065
            android.content.res.Resources r0 = r5.getResources()
            int r2 = q4.d.design_bottom_sheet_peek_height_min
            int r0 = r0.getDimensionPixelSize(r2)
            r4.f5617l = r0
            r4.W0(r6)
            com.google.android.material.bottomsheet.a r0 = new com.google.android.material.bottomsheet.a
            r0.<init>(r6)
            androidx.core.view.m0.K0(r6, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r4.f5599a0 = r0
            d5.f r0 = new d5.f
            r0.<init>(r6)
            r4.f5606f0 = r0
            i5.g r0 = r4.f5620n
            if (r0 == 0) goto L_0x0052
            androidx.core.view.m0.u0(r6, r0)
            i5.g r0 = r4.f5620n
            float r2 = r4.M
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x004e
            float r2 = androidx.core.view.m0.w(r6)
        L_0x004e:
            r0.V(r2)
            goto L_0x0059
        L_0x0052:
            android.content.res.ColorStateList r0 = r4.f5621o
            if (r0 == 0) goto L_0x0059
            androidx.core.view.m0.v0(r6, r0)
        L_0x0059:
            r4.d1()
            int r0 = androidx.core.view.m0.z(r6)
            if (r0 != 0) goto L_0x0065
            androidx.core.view.m0.B0(r6, r1)
        L_0x0065:
            c0.d r0 = r4.S
            if (r0 != 0) goto L_0x0071
            c0.d$c r0 = r4.f5618l0
            c0.d r0 = c0.d.o(r5, r0)
            r4.S = r0
        L_0x0071:
            int r0 = r6.getTop()
            r5.I(r6, r7)
            int r7 = r5.getWidth()
            r4.Y = r7
            int r5 = r5.getHeight()
            r4.Z = r5
            int r5 = r6.getHeight()
            r4.X = r5
            int r7 = r4.Z
            int r5 = r7 - r5
            int r2 = r4.B
            if (r5 >= r2) goto L_0x00a9
            boolean r5 = r4.f5629w
            r3 = -1
            if (r5 == 0) goto L_0x00a3
            int r5 = r4.f5623q
            if (r5 != r3) goto L_0x009c
            goto L_0x00a0
        L_0x009c:
            int r7 = java.lang.Math.min(r7, r5)
        L_0x00a0:
            r4.X = r7
            goto L_0x00a9
        L_0x00a3:
            int r7 = r7 - r2
            int r5 = r4.f5623q
            if (r5 != r3) goto L_0x009c
            goto L_0x00a0
        L_0x00a9:
            int r5 = r4.Z
            int r7 = r4.X
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r4.I = r5
            r4.f0()
            r4.d0()
            int r5 = r4.Q
            r2 = 3
            if (r5 != r2) goto L_0x00c8
            int r5 = r4.s0()
        L_0x00c4:
            androidx.core.view.m0.b0(r6, r5)
            goto L_0x00eb
        L_0x00c8:
            r2 = 6
            if (r5 != r2) goto L_0x00ce
            int r5 = r4.J
            goto L_0x00c4
        L_0x00ce:
            boolean r2 = r4.N
            if (r2 == 0) goto L_0x00d8
            r2 = 5
            if (r5 != r2) goto L_0x00d8
            int r5 = r4.Z
            goto L_0x00c4
        L_0x00d8:
            r2 = 4
            if (r5 != r2) goto L_0x00de
            int r5 = r4.L
            goto L_0x00c4
        L_0x00de:
            if (r5 == r1) goto L_0x00e3
            r2 = 2
            if (r5 != r2) goto L_0x00eb
        L_0x00e3:
            int r5 = r6.getTop()
            int r0 = r0 - r5
            androidx.core.view.m0.b0(r6, r0)
        L_0x00eb:
            int r5 = r4.Q
            r4.f1(r5, r7)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r0 = r4.p0(r6)
            r5.<init>(r0)
            r4.f5601c0 = r5
        L_0x00fb:
            java.util.ArrayList r5 = r4.f5602d0
            int r5 = r5.size()
            if (r7 >= r5) goto L_0x0111
            java.util.ArrayList r5 = r4.f5602d0
            java.lang.Object r5 = r5.get(r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior$g r5 = (com.google.android.material.bottomsheet.BottomSheetBehavior.g) r5
            r5.a(r6)
            int r7 = r7 + 1
            goto L_0x00fb
        L_0x0111:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* access modifiers changed from: package-private */
    public View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (m0.V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View p02 = p0(viewGroup.getChildAt(i10));
                if (p02 != null) {
                    return p02;
                }
            }
        }
        return null;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f5622p, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f5623q, marginLayoutParams.height));
        return true;
    }

    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        if (!C0() || (weakReference = this.f5601c0) == null || view2 != weakReference.get()) {
            return false;
        }
        return this.Q != 3 || super.s(coordinatorLayout, view, view2, f10, f11);
    }

    public int s0() {
        if (this.f5605f) {
            return this.I;
        }
        return Math.max(this.H, this.f5629w ? 0 : this.B);
    }

    public int t0() {
        return this.Q;
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        int i13;
        if (i12 != 1) {
            WeakReference weakReference = this.f5601c0;
            View view3 = weakReference != null ? (View) weakReference.get() : null;
            if (!C0() || view2 == view3) {
                int top = view.getTop();
                int i14 = top - i11;
                if (i11 <= 0) {
                    if (i11 < 0 && !view2.canScrollVertically(-1)) {
                        if (i14 > this.L && !j0()) {
                            int i15 = top - this.L;
                            iArr[1] = i15;
                            m0.b0(view, -i15);
                            i13 = 4;
                        } else if (this.P) {
                            iArr[1] = i11;
                            m0.b0(view, -i11);
                            V0(1);
                        } else {
                            return;
                        }
                    }
                    o0(view.getTop());
                    this.U = i11;
                    this.V = true;
                } else if (i14 < s0()) {
                    int s02 = top - s0();
                    iArr[1] = s02;
                    m0.b0(view, -s02);
                    i13 = 3;
                } else if (this.P) {
                    iArr[1] = i11;
                    m0.b0(view, -i11);
                    V0(1);
                    o0(view.getTop());
                    this.U = i11;
                    this.V = true;
                } else {
                    return;
                }
                V0(i13);
                o0(view.getTop());
                this.U = i11;
                this.V = true;
            }
        }
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public boolean y0() {
        return this.f5625s;
    }

    public boolean z0() {
        return this.N;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f5619m = context.getResources().getDimensionPixelSize(q4.d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q4.k.J);
        int i11 = q4.k.N;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f5621o = f5.c.a(context, obtainStyledAttributes, i11);
        }
        if (obtainStyledAttributes.hasValue(q4.k.f15018f0)) {
            this.D = k.e(context, attributeSet, q4.b.bottomSheetStyle, f5598m0).m();
        }
        m0(context);
        n0();
        this.M = obtainStyledAttributes.getDimension(q4.k.M, -1.0f);
        int i12 = q4.k.K;
        if (obtainStyledAttributes.hasValue(i12)) {
            O0(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = q4.k.L;
        if (obtainStyledAttributes.hasValue(i13)) {
            N0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = q4.k.T;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i14);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            P0(obtainStyledAttributes.getDimensionPixelSize(i14, -1));
        } else {
            P0(i10);
        }
        M0(obtainStyledAttributes.getBoolean(q4.k.S, false));
        K0(obtainStyledAttributes.getBoolean(q4.k.X, false));
        J0(obtainStyledAttributes.getBoolean(q4.k.Q, true));
        T0(obtainStyledAttributes.getBoolean(q4.k.W, false));
        H0(obtainStyledAttributes.getBoolean(q4.k.O, true));
        R0(obtainStyledAttributes.getInt(q4.k.U, 0));
        L0(obtainStyledAttributes.getFloat(q4.k.R, 0.5f));
        int i15 = q4.k.P;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i15);
        I0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i15, 0) : peekValue2.data);
        S0(obtainStyledAttributes.getInt(q4.k.V, 500));
        this.f5626t = obtainStyledAttributes.getBoolean(q4.k.f14978b0, false);
        this.f5627u = obtainStyledAttributes.getBoolean(q4.k.f14988c0, false);
        this.f5628v = obtainStyledAttributes.getBoolean(q4.k.f14998d0, false);
        this.f5629w = obtainStyledAttributes.getBoolean(q4.k.f15008e0, true);
        this.f5630x = obtainStyledAttributes.getBoolean(q4.k.Y, false);
        this.f5631y = obtainStyledAttributes.getBoolean(q4.k.Z, false);
        this.f5632z = obtainStyledAttributes.getBoolean(q4.k.f14968a0, false);
        this.C = obtainStyledAttributes.getBoolean(q4.k.f15028g0, true);
        obtainStyledAttributes.recycle();
        this.f5609h = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
