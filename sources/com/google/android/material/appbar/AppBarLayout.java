package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d0;
import androidx.core.view.accessibility.y;
import androidx.core.view.c0;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.core.view.x;
import i5.g;
import i5.h;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import q4.j;
import q4.k;
import z4.e;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int D = j.Widget_Design_AppBarLayout;
    private Integer A;
    private final float B;
    private Behavior C;

    /* renamed from: e  reason: collision with root package name */
    private int f5469e;

    /* renamed from: f  reason: collision with root package name */
    private int f5470f;

    /* renamed from: g  reason: collision with root package name */
    private int f5471g;

    /* renamed from: h  reason: collision with root package name */
    private int f5472h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5473i;

    /* renamed from: j  reason: collision with root package name */
    private int f5474j;

    /* renamed from: k  reason: collision with root package name */
    private k1 f5475k;

    /* renamed from: l  reason: collision with root package name */
    private List f5476l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5477m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5478n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5479o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5480p;

    /* renamed from: q  reason: collision with root package name */
    private int f5481q;

    /* renamed from: r  reason: collision with root package name */
    private WeakReference f5482r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f5483s;

    /* renamed from: t  reason: collision with root package name */
    private ValueAnimator f5484t;

    /* renamed from: u  reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f5485u;

    /* renamed from: v  reason: collision with root package name */
    private final List f5486v;

    /* renamed from: w  reason: collision with root package name */
    private final long f5487w;

    /* renamed from: x  reason: collision with root package name */
    private final TimeInterpolator f5488x;

    /* renamed from: y  reason: collision with root package name */
    private int[] f5489y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f5490z;

    protected static class BaseBehavior<T extends AppBarLayout> extends d {
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f5491o;

        /* renamed from: p  reason: collision with root package name */
        private int f5492p;

        /* renamed from: q  reason: collision with root package name */
        private ValueAnimator f5493q;

        /* renamed from: r  reason: collision with root package name */
        private e f5494r;

        /* renamed from: s  reason: collision with root package name */
        private WeakReference f5495s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public boolean f5496t;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f5497a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f5498b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f5497a = coordinatorLayout;
                this.f5498b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f5497a, this.f5498b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends androidx.core.view.a {
            b() {
            }

            public void g(View view, y yVar) {
                super.g(view, yVar);
                yVar.F0(BaseBehavior.this.f5496t);
                yVar.m0(ScrollView.class.getName());
            }
        }

        class c implements d0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f5501a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f5502b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f5503c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f5504d;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f5501a = coordinatorLayout;
                this.f5502b = appBarLayout;
                this.f5503c = view;
                this.f5504d = i10;
            }

            public boolean a(View view, d0.a aVar) {
                BaseBehavior.this.u(this.f5501a, this.f5502b, this.f5503c, 0, this.f5504d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class d implements d0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f5506a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f5507b;

            d(AppBarLayout appBarLayout, boolean z10) {
                this.f5506a = appBarLayout;
                this.f5507b = z10;
            }

            public boolean a(View view, d0.a aVar) {
                this.f5506a.setExpanded(this.f5507b);
                return true;
            }
        }

        protected static class e extends b0.a {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* renamed from: g  reason: collision with root package name */
            boolean f5509g;

            /* renamed from: h  reason: collision with root package name */
            boolean f5510h;

            /* renamed from: i  reason: collision with root package name */
            int f5511i;

            /* renamed from: j  reason: collision with root package name */
            float f5512j;

            /* renamed from: k  reason: collision with root package name */
            boolean f5513k;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                /* renamed from: a */
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                /* renamed from: c */
                public e[] newArray(int i10) {
                    return new e[i10];
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10 = true;
                this.f5509g = parcel.readByte() != 0;
                this.f5510h = parcel.readByte() != 0;
                this.f5511i = parcel.readInt();
                this.f5512j = parcel.readFloat();
                this.f5513k = parcel.readByte() == 0 ? false : z10;
            }

            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f5509g ? (byte) 1 : 0);
                parcel.writeByte(this.f5510h ? (byte) 1 : 0);
                parcel.writeInt(this.f5511i);
                parcel.writeFloat(this.f5512j);
                parcel.writeByte(this.f5513k ? (byte) 1 : 0);
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior() {
        }

        private void A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int Q = Q() - topInset;
            int i02 = i0(appBarLayout, Q);
            if (i02 >= 0) {
                View childAt = appBarLayout.getChildAt(i02);
                d dVar = (d) childAt.getLayoutParams();
                int c10 = dVar.c();
                if ((c10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (i02 == 0 && m0.y(appBarLayout) && m0.y(childAt)) {
                        i10 -= appBarLayout.getTopInset();
                    }
                    if (e0(c10, 2)) {
                        i11 += m0.C(childAt);
                    } else if (e0(c10, 5)) {
                        int C = m0.C(childAt) + i11;
                        if (Q < C) {
                            i10 = C;
                        } else {
                            i11 = C;
                        }
                    }
                    if (e0(c10, 32)) {
                        i10 += dVar.topMargin;
                        i11 -= dVar.bottomMargin;
                    }
                    Z(coordinatorLayout, appBarLayout, y.a.b(b0(Q, i11, i10) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View j02;
            m0.k0(coordinatorLayout, y.a.f2546q.b());
            m0.k0(coordinatorLayout, y.a.f2547r.b());
            if (appBarLayout.getTotalScrollRange() != 0 && (j02 = j0(coordinatorLayout)) != null && f0(appBarLayout)) {
                if (!m0.O(coordinatorLayout)) {
                    m0.q0(coordinatorLayout, new b());
                }
                this.f5496t = X(coordinatorLayout, appBarLayout, j02);
            }
        }

        private void C0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View h02 = h0(appBarLayout, i10);
            boolean z11 = false;
            if (h02 != null) {
                int c10 = ((d) h02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int C = m0.C(h02);
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (h02.getBottom() - C) - appBarLayout.getTopInset()) : (-i10) >= (h02.getBottom() - C) - appBarLayout.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (appBarLayout.o()) {
                z11 = appBarLayout.B(g0(coordinatorLayout));
            }
            boolean y10 = appBarLayout.y(z11);
            if (z10 || (y10 && z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private boolean X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            boolean z10 = false;
            if (Q() != (-appBarLayout.getTotalScrollRange())) {
                Y(coordinatorLayout, appBarLayout, y.a.f2546q, false);
                z10 = true;
            }
            if (Q() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i10 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        m0.m0(coordinatorLayout, y.a.f2547r, (CharSequence) null, new c(coordinatorLayout, appBarLayout, view, i10));
                        return true;
                    }
                } else {
                    Y(coordinatorLayout, appBarLayout, y.a.f2547r, true);
                    return true;
                }
            }
            return z10;
        }

        private void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, y.a aVar, boolean z10) {
            m0.m0(coordinatorLayout, aVar, (CharSequence) null, new d(appBarLayout, z10));
        }

        private void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int abs = Math.abs(Q() - i10);
            float abs2 = Math.abs(f10);
            a0(coordinatorLayout, appBarLayout, i10, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f));
        }

        private void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int Q = Q();
            if (Q == i10) {
                ValueAnimator valueAnimator = this.f5493q;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f5493q.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f5493q;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f5493q = valueAnimator3;
                valueAnimator3.setInterpolator(r4.a.f15586e);
                this.f5493q.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f5493q.setDuration((long) Math.min(i11, 600));
            this.f5493q.setIntValues(new int[]{Q, i10});
            this.f5493q.start();
        }

        private int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((d) appBarLayout.getChildAt(i10).getLayoutParams()).f5517a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof x) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (e0(dVar.c(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i12);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator d10 = dVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (d10 != null) {
                    int c10 = dVar.c();
                    if ((c10 & 1) != 0) {
                        i11 = childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((c10 & 2) != 0) {
                            i11 -= m0.C(childAt);
                        }
                    }
                    if (m0.y(childAt)) {
                        i11 -= appBarLayout.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = (float) i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation(((float) (abs - childAt.getTop())) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List s10 = coordinatorLayout.s(appBarLayout);
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) ((View) s10.get(i10)).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).O() != 0;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int Q() {
            return I() + this.f5491o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public boolean L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f5495s;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k0 */
        public int O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l0 */
        public int P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n0 */
        public void R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.o()) {
                appBarLayout.y(appBarLayout.B(g0(coordinatorLayout)));
            }
        }

        /* renamed from: o0 */
        public boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int i11;
            boolean p10 = super.p(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            e eVar = this.f5494r;
            if (eVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            Z(coordinatorLayout, appBarLayout, i11, 0.0f);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        }
                        T(coordinatorLayout, appBarLayout, 0);
                    }
                }
                appBarLayout.u();
                this.f5494r = null;
                K(y.a.b(I(), -appBarLayout.getTotalScrollRange(), 0));
                C0(coordinatorLayout, appBarLayout, I(), 0, true);
                appBarLayout.s(I());
                B0(coordinatorLayout, appBarLayout);
                return p10;
            } else if (eVar.f5509g) {
                i11 = -appBarLayout.getTotalScrollRange();
            } else {
                if (!eVar.f5510h) {
                    View childAt = appBarLayout.getChildAt(eVar.f5511i);
                    T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f5494r.f5513k ? m0.C(childAt) + appBarLayout.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f5494r.f5512j)));
                    appBarLayout.u();
                    this.f5494r = null;
                    K(y.a.b(I(), -appBarLayout.getTotalScrollRange(), 0));
                    C0(coordinatorLayout, appBarLayout, I(), 0, true);
                    appBarLayout.s(I());
                    B0(coordinatorLayout, appBarLayout);
                    return p10;
                }
                T(coordinatorLayout, appBarLayout, 0);
                appBarLayout.u();
                this.f5494r = null;
                K(y.a.b(I(), -appBarLayout.getTotalScrollRange(), 0));
                C0(coordinatorLayout, appBarLayout, I(), 0, true);
                appBarLayout.s(I());
                B0(coordinatorLayout, appBarLayout);
                return p10;
            }
            T(coordinatorLayout, appBarLayout, i11);
            appBarLayout.u();
            this.f5494r = null;
            K(y.a.b(I(), -appBarLayout.getTotalScrollRange(), 0));
            C0(coordinatorLayout, appBarLayout, I(), 0, true);
            appBarLayout.s(I());
            B0(coordinatorLayout, appBarLayout);
            return p10;
        }

        /* renamed from: p0 */
        public boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.J(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* renamed from: q0 */
        public void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    i14 = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                int i15 = i13;
                int i16 = i14;
                if (i15 != i16) {
                    iArr[1] = S(coordinatorLayout, appBarLayout, i11, i15, i16);
                }
            }
            if (appBarLayout.o()) {
                appBarLayout.y(appBarLayout.B(view));
            }
        }

        /* renamed from: r0 */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = S(coordinatorLayout, appBarLayout, i13, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                B0(coordinatorLayout, appBarLayout);
            }
        }

        /* renamed from: s0 */
        public void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof e) {
                w0((e) parcelable, true);
                super.B(coordinatorLayout, appBarLayout, this.f5494r.c());
                return;
            }
            super.B(coordinatorLayout, appBarLayout, parcelable);
            this.f5494r = null;
        }

        /* renamed from: t0 */
        public Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable C = super.C(coordinatorLayout, appBarLayout);
            e x02 = x0(C, appBarLayout);
            return x02 == null ? C : x02;
        }

        /* renamed from: u0 */
        public boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.o() || d0(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f5493q) != null) {
                valueAnimator.cancel();
            }
            this.f5495s = null;
            this.f5492p = i11;
            return z10;
        }

        /* renamed from: v0 */
        public void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f5492p == 0 || i10 == 1) {
                A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.o()) {
                    appBarLayout.y(appBarLayout.B(view));
                }
            }
            this.f5495s = new WeakReference(view);
        }

        /* access modifiers changed from: package-private */
        public void w0(e eVar, boolean z10) {
            if (this.f5494r == null || z10) {
                this.f5494r = eVar;
            }
        }

        /* access modifiers changed from: package-private */
        public e x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int I = I();
            int childCount = appBarLayout.getChildCount();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I > 0 || bottom < 0) {
                    i10++;
                } else {
                    if (parcelable == null) {
                        parcelable = b0.a.f4390f;
                    }
                    e eVar = new e(parcelable);
                    boolean z11 = I == 0;
                    eVar.f5510h = z11;
                    eVar.f5509g = !z11 && (-I) >= appBarLayout.getTotalScrollRange();
                    eVar.f5511i = i10;
                    if (bottom == m0.C(childAt) + appBarLayout.getTopInset()) {
                        z10 = true;
                    }
                    eVar.f5513k = z10;
                    eVar.f5512j = ((float) bottom) / ((float) childAt.getHeight());
                    return eVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y0 */
        public int U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int Q = Q();
            int i13 = 0;
            if (i11 == 0 || Q < i11 || Q > i12) {
                this.f5491o = 0;
            } else {
                int b10 = y.a.b(i10, i11, i12);
                if (Q != b10) {
                    int m02 = appBarLayout.i() ? m0(appBarLayout, b10) : b10;
                    boolean K = K(m02);
                    int i14 = Q - b10;
                    this.f5491o = b10 - m02;
                    int i15 = 1;
                    if (K) {
                        while (i13 < appBarLayout.getChildCount()) {
                            d dVar = (d) appBarLayout.getChildAt(i13).getLayoutParams();
                            b b11 = dVar.b();
                            if (!(b11 == null || (dVar.c() & 1) == 0)) {
                                b11.a(appBarLayout, appBarLayout.getChildAt(i13), (float) I());
                            }
                            i13++;
                        }
                    }
                    if (!K && appBarLayout.i()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.s(I());
                    if (b10 < Q) {
                        i15 = -1;
                    }
                    C0(coordinatorLayout, appBarLayout, b10, i15, false);
                    i13 = i14;
                }
            }
            B0(coordinatorLayout, appBarLayout);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ boolean o0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        public /* bridge */ /* synthetic */ boolean p0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        public /* bridge */ /* synthetic */ void q0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        public /* bridge */ /* synthetic */ void r0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        public /* bridge */ /* synthetic */ void s0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable t0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean u0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        public /* bridge */ /* synthetic */ void v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        private static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).Q();
            }
            return 0;
        }

        private void W(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                m0.b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f5491o) + Q()) - M(view2));
            }
        }

        private void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.y(appBarLayout.B(view));
                }
            }
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout U = L(coordinatorLayout.r(view));
            if (U != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f5544h;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    U.v(false, !z10);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int V = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + V > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) V) / ((float) i10)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public AppBarLayout L(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                m0.k0(coordinatorLayout, y.a.f2546q.b());
                m0.k0(coordinatorLayout, y.a.f2547r.b());
                m0.q0(coordinatorLayout, (androidx.core.view.a) null);
            }
        }

        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f15203y5);
            S(obtainStyledAttributes.getDimensionPixelSize(k.f15212z5, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements c0 {
        a() {
        }

        public k1 a(View view, k1 k1Var) {
            return AppBarLayout.this.t(k1Var);
        }
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f5515a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f5516b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f5515a, appBarLayout, view);
            float abs = ((float) this.f5515a.top) - Math.abs(f10);
            if (abs <= 0.0f) {
                float a10 = 1.0f - y.a.a(Math.abs(abs / ((float) this.f5515a.height())), 0.0f, 1.0f);
                float height = (-abs) - ((((float) this.f5515a.height()) * 0.3f) * (1.0f - (a10 * a10)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f5516b);
                this.f5516b.offset(0, (int) (-height));
                m0.x0(view, this.f5516b);
                return;
            }
            m0.x0(view, (Rect) null);
            view.setTranslationY(0.0f);
        }
    }

    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f5517a = 1;

        /* renamed from: b  reason: collision with root package name */
        private b f5518b;

        /* renamed from: c  reason: collision with root package name */
        Interpolator f5519c;

        public d(int i10, int i11) {
            super(i10, i11);
        }

        private b a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.f5518b;
        }

        public int c() {
            return this.f5517a;
        }

        public Interpolator d() {
            return this.f5519c;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            int i10 = this.f5517a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f5518b = a(i10);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f15170v);
            this.f5517a = obtainStyledAttributes.getInt(k.f15188x, 0);
            f(obtainStyledAttributes.getInt(k.f15179w, 0));
            int i10 = k.f15197y;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f5519c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.appBarLayoutStyle);
    }

    private boolean A() {
        return this.f5490z != null && getTopInset() > 0;
    }

    private boolean C() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !m0.y(childAt);
    }

    private void D(float f10, float f11) {
        ValueAnimator valueAnimator = this.f5484t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, f11});
        this.f5484t = ofFloat;
        ofFloat.setDuration(this.f5487w);
        this.f5484t.setInterpolator(this.f5488x);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f5485u;
        if (animatorUpdateListener != null) {
            this.f5484t.addUpdateListener(animatorUpdateListener);
        }
        this.f5484t.start();
    }

    private void E() {
        setWillNotDraw(!A());
    }

    private void c() {
        WeakReference weakReference = this.f5482r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5482r = null;
    }

    private Integer d() {
        int defaultColor;
        Drawable drawable = this.f5490z;
        if (drawable instanceof g) {
            defaultColor = ((g) drawable).A();
        } else {
            ColorStateList f10 = e.f(drawable);
            if (f10 == null) {
                return null;
            }
            defaultColor = f10.getDefaultColor();
        }
        return Integer.valueOf(defaultColor);
    }

    private View e(View view) {
        int i10;
        if (this.f5482r == null && (i10 = this.f5481q) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f5481q);
            }
            if (findViewById != null) {
                this.f5482r = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.f5482r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(g gVar, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.f5485u = new b(this, colorStateList, colorStateList2, gVar, x4.a.f(getContext(), q4.b.colorSurface));
        m0.u0(this, gVar);
    }

    private void m(Context context, g gVar) {
        gVar.M(context);
        this.f5485u = new c(this, gVar);
        m0.u0(this, gVar);
    }

    private void n() {
        Behavior behavior = this.C;
        BaseBehavior.e x02 = (behavior == null || this.f5470f == -1 || this.f5474j != 0) ? null : behavior.x0(b0.a.f4390f, this);
        this.f5470f = -1;
        this.f5471g = -1;
        this.f5472h = -1;
        if (x02 != null) {
            this.C.w0(x02, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof g;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(ColorStateList colorStateList, ColorStateList colorStateList2, g gVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int j10 = x4.a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        gVar.W(ColorStateList.valueOf(j10));
        if (!(this.f5490z == null || (num2 = this.A) == null || !num2.equals(num))) {
            androidx.core.graphics.drawable.a.n(this.f5490z, j10);
        }
        if (!this.f5486v.isEmpty()) {
            for (Object a10 : this.f5486v) {
                android.support.v4.media.session.b.a(a10);
                if (gVar.x() != null) {
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(g gVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.V(floatValue);
        Drawable drawable = this.f5490z;
        if (drawable instanceof g) {
            ((g) drawable).V(floatValue);
        }
        Iterator it = this.f5486v.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            gVar.A();
            throw null;
        }
    }

    private void w(boolean z10, boolean z11, boolean z12) {
        int i10 = 0;
        int i11 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i10 = 8;
        }
        this.f5474j = i11 | i10;
        requestLayout();
    }

    private boolean x(boolean z10) {
        if (this.f5478n == z10) {
            return false;
        }
        this.f5478n = z10;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean B(View view) {
        View e10 = e(view);
        if (e10 != null) {
            view = e10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (A()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f5469e));
            this.f5490z.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5490z;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    /* renamed from: g */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.C = behavior;
        return behavior;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i10;
        int C2;
        int i11 = this.f5471g;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = dVar.f5517a;
                if ((i13 & 5) == 5) {
                    int i14 = dVar.topMargin + dVar.bottomMargin;
                    if ((i13 & 8) != 0) {
                        C2 = m0.C(childAt);
                    } else if ((i13 & 2) != 0) {
                        C2 = measuredHeight - m0.C(childAt);
                    } else {
                        i10 = i14 + measuredHeight;
                        if (childCount == 0 && m0.y(childAt)) {
                            i10 = Math.min(i10, measuredHeight - getTopInset());
                        }
                        i12 += i10;
                    }
                    i10 = i14 + C2;
                    i10 = Math.min(i10, measuredHeight - getTopInset());
                    i12 += i10;
                } else if (i12 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i12);
        this.f5471g = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i10 = this.f5472h;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
                int i13 = dVar.f5517a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    i12 -= m0.C(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f5472h = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f5481q;
    }

    public g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof g) {
            return (g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C2 = m0.C(this);
        if (C2 == 0) {
            int childCount = getChildCount();
            C2 = childCount >= 1 ? m0.C(getChildAt(childCount - 1)) : 0;
            if (C2 == 0) {
                return getHeight() / 3;
            }
        }
        return (C2 * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f5474j;
    }

    public Drawable getStatusBarForeground() {
        return this.f5490z;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        k1 k1Var = this.f5475k;
        if (k1Var != null) {
            return k1Var.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f5470f;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = dVar.f5517a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
                if (i11 == 0 && m0.y(childAt)) {
                    i12 -= getTopInset();
                }
                if ((i13 & 2) != 0) {
                    i12 -= m0.C(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f5470f = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f5473i;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f5480p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        if (this.f5489y == null) {
            this.f5489y = new int[4];
        }
        int[] iArr = this.f5489y;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f5478n;
        int i11 = q4.b.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (!z10 || !this.f5479o) ? -q4.b.state_lifted : q4.b.state_lifted;
        int i12 = q4.b.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (!z10 || !this.f5479o) ? -q4.b.state_collapsed : q4.b.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (m0.y(this) && C()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                m0.b0(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f5473i = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((d) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f5473i = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f5490z;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f5477m) {
            if (!this.f5480p && !j()) {
                z11 = false;
            }
            x(z11);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && m0.y(this) && C()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = y.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        this.f5469e = i10;
        if (!willNotDraw()) {
            m0.h0(this);
        }
        List list = this.f5476l;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                android.support.v4.media.session.b.a(this.f5476l.get(i11));
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        v(z10, m0.U(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f5480p = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f5481q = -1;
        if (view == null) {
            c();
        } else {
            this.f5482r = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f5481q = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f5477m = z10;
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f5490z;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f5490z = drawable3;
            this.A = d();
            Drawable drawable4 = this.f5490z;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f5490z.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f5490z, m0.B(this));
                this.f5490z.setVisible(getVisibility() == 0, false);
                this.f5490z.setCallback(this);
            }
            E();
            m0.h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(g.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        h.b(this, f10);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f5490z;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    /* access modifiers changed from: package-private */
    public k1 t(k1 k1Var) {
        k1 k1Var2 = m0.y(this) ? k1Var : null;
        if (!androidx.core.util.c.a(this.f5475k, k1Var2)) {
            this.f5475k = k1Var2;
            E();
            requestLayout();
        }
        return k1Var;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.f5474j = 0;
    }

    public void v(boolean z10, boolean z11) {
        w(z10, z11, true);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5490z;
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        return z(z10, !this.f5477m);
    }

    /* access modifiers changed from: package-private */
    public boolean z(boolean z10, boolean z11) {
        if (!z11 || this.f5479o == z10) {
            return false;
        }
        this.f5479o = z10;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        float f10 = 0.0f;
        if (this.f5483s) {
            float f11 = z10 ? 0.0f : 1.0f;
            if (z10) {
                f10 = 1.0f;
            }
            D(f11, f10);
            return true;
        } else if (!this.f5480p) {
            return true;
        } else {
            float f12 = z10 ? 0.0f : this.B;
            if (z10) {
                f10 = this.B;
            }
            D(f12, f10);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = D
            android.content.Context r11 = m5.a.c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.f5470f = r11
            r10.f5471g = r11
            r10.f5472h = r11
            r6 = 0
            r10.f5474j = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f5486v = r0
            android.content.Context r7 = r10.getContext()
            r8 = 1
            r10.setOrientation(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r10.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            com.google.android.material.appbar.h.a(r10)
        L_0x002f:
            com.google.android.material.appbar.h.c(r10, r12, r13, r4)
            int[] r2 = q4.k.f15067k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.r.i(r0, r1, r2, r3, r4, r5)
            int r13 = q4.k.f15077l
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            androidx.core.view.m0.u0(r10, r13)
            int r13 = q4.k.f15134r
            android.content.res.ColorStateList r13 = f5.c.a(r7, r12, r13)
            if (r13 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r8 = r6
        L_0x0050:
            r10.f5483s = r8
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            android.content.res.ColorStateList r0 = z4.e.f(r0)
            if (r0 == 0) goto L_0x006d
            i5.g r1 = new i5.g
            r1.<init>()
            r1.W(r0)
            if (r13 == 0) goto L_0x006a
            r10.l(r1, r0, r13)
            goto L_0x006d
        L_0x006a:
            r10.m(r7, r1)
        L_0x006d:
            int r13 = q4.b.motionDurationMedium2
            android.content.res.Resources r0 = r10.getResources()
            int r1 = q4.g.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            int r13 = d5.h.f(r7, r13, r0)
            long r0 = (long) r13
            r10.f5487w = r0
            int r13 = q4.b.motionEasingStandardInterpolator
            android.animation.TimeInterpolator r0 = r4.a.f15582a
            android.animation.TimeInterpolator r13 = d5.h.g(r7, r13, r0)
            r10.f5488x = r13
            int r13 = q4.k.f15116p
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0099
            boolean r13 = r12.getBoolean(r13, r6)
            r10.w(r13, r6, r6)
        L_0x0099:
            int r13 = q4.k.f15107o
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00a9
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            com.google.android.material.appbar.h.b(r10, r13)
        L_0x00a9:
            r13 = 26
            if (r9 < r13) goto L_0x00cb
            int r13 = q4.k.f15097n
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00bc
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        L_0x00bc:
            int r13 = q4.k.f15087m
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00cb
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        L_0x00cb:
            android.content.res.Resources r13 = r10.getResources()
            int r0 = q4.d.design_appbar_elevation
            float r13 = r13.getDimension(r0)
            r10.B = r13
            int r13 = q4.k.f15125q
            boolean r13 = r12.getBoolean(r13, r6)
            r10.f5480p = r13
            int r13 = q4.k.f15143s
            int r11 = r12.getResourceId(r13, r11)
            r10.f5481q = r11
            int r11 = q4.k.f15152t
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$a r11 = new com.google.android.material.appbar.AppBarLayout$a
            r11.<init>()
            androidx.core.view.m0.F0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
