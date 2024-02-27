package com.google.android.material.sidesheet;

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
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d0;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import androidx.core.view.o;
import c0.d;
import i5.g;
import i5.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import q4.i;
import q4.j;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c implements d5.b {
    private static final int D = i.side_sheet_accessibility_pane_title;
    private static final int E = j.Widget_Material3_SideSheet;
    private int A;
    private final Set B = new LinkedHashSet();
    private final d.c C = new a();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public c f6244e;

    /* renamed from: f  reason: collision with root package name */
    private float f6245f;

    /* renamed from: g  reason: collision with root package name */
    private g f6246g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f6247h;

    /* renamed from: i  reason: collision with root package name */
    private k f6248i;

    /* renamed from: j  reason: collision with root package name */
    private final d f6249j = new d();

    /* renamed from: k  reason: collision with root package name */
    private float f6250k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f6251l = true;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f6252m = 5;

    /* renamed from: n  reason: collision with root package name */
    private int f6253n = 5;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public c0.d f6254o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6255p;

    /* renamed from: q  reason: collision with root package name */
    private float f6256q = 0.1f;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f6257r;

    /* renamed from: s  reason: collision with root package name */
    private int f6258s;

    /* renamed from: t  reason: collision with root package name */
    private int f6259t;

    /* renamed from: u  reason: collision with root package name */
    private int f6260u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public WeakReference f6261v;

    /* renamed from: w  reason: collision with root package name */
    private WeakReference f6262w;

    /* renamed from: x  reason: collision with root package name */
    private int f6263x = -1;

    /* renamed from: y  reason: collision with root package name */
    private VelocityTracker f6264y;

    /* renamed from: z  reason: collision with root package name */
    private d5.g f6265z;

    class a extends d.c {
        a() {
        }

        public int a(View view, int i10, int i11) {
            return y.a.b(i10, SideSheetBehavior.this.f6244e.g(), SideSheetBehavior.this.f6244e.f());
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            return SideSheetBehavior.this.f6257r + SideSheetBehavior.this.k0();
        }

        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f6251l) {
                SideSheetBehavior.this.J0(1);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View f02 = SideSheetBehavior.this.f0();
            if (!(f02 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) == null)) {
                SideSheetBehavior.this.f6244e.p(marginLayoutParams, view.getLeft(), view.getRight());
                f02.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        public void l(View view, float f10, float f11) {
            int Q = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.O0(view, Q, sideSheetBehavior.N0());
        }

        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f6252m == 1 || SideSheetBehavior.this.f6261v == null || SideSheetBehavior.this.f6261v.get() != view) ? false : true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.J0(5);
            if (SideSheetBehavior.this.f6261v != null && SideSheetBehavior.this.f6261v.get() != null) {
                ((View) SideSheetBehavior.this.f6261v.get()).requestLayout();
            }
        }
    }

    protected static class c extends b0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        final int f6268g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            /* renamed from: c */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6268g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6268g);
        }

        public c(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f6268g = sideSheetBehavior.f6252m;
        }
    }

    class d {

        /* renamed from: a  reason: collision with root package name */
        private int f6269a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f6270b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f6271c = new e(this);

        d() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f6270b = false;
            if (SideSheetBehavior.this.f6254o != null && SideSheetBehavior.this.f6254o.m(true)) {
                b(this.f6269a);
            } else if (SideSheetBehavior.this.f6252m == 2) {
                SideSheetBehavior.this.J0(this.f6269a);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            if (SideSheetBehavior.this.f6261v != null && SideSheetBehavior.this.f6261v.get() != null) {
                this.f6269a = i10;
                if (!this.f6270b) {
                    m0.i0((View) SideSheetBehavior.this.f6261v.get(), this.f6271c);
                    this.f6270b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
    }

    private void A0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View findViewById;
        if (this.f6262w == null && (i10 = this.f6263x) != -1 && (findViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f6262w = new WeakReference(findViewById);
        }
    }

    private void B0(View view, y.a aVar, int i10) {
        m0.m0(view, aVar, (CharSequence) null, Y(i10));
    }

    private void C0() {
        VelocityTracker velocityTracker = this.f6264y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6264y = null;
        }
    }

    private void D0(View view, Runnable runnable) {
        if (v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void G0(int i10) {
        c cVar = this.f6244e;
        if (cVar != null && cVar.j() == i10) {
            return;
        }
        if (i10 == 0) {
            this.f6244e = new b(this);
            if (this.f6248i != null && !s0()) {
                k.b v10 = this.f6248i.v();
                v10.E(0.0f).w(0.0f);
                R0(v10.m());
            }
        } else if (i10 == 1) {
            this.f6244e = new a(this);
            if (this.f6248i != null && !r0()) {
                k.b v11 = this.f6248i.v();
                v11.A(0.0f).s(0.0f);
                R0(v11.m());
            }
        } else {
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be " + 0 + " or " + 1 + ".");
        }
    }

    private void H0(View view, int i10) {
        G0(o.b(((CoordinatorLayout.f) view.getLayoutParams()).f2172c, i10) == 3 ? 1 : 0);
    }

    private boolean K0() {
        return this.f6254o != null && (this.f6251l || this.f6252m == 1);
    }

    private boolean M0(View view) {
        return (view.isShown() || m0.p(view) != null) && this.f6251l;
    }

    /* access modifiers changed from: private */
    public void O0(View view, int i10, boolean z10) {
        if (w0(view, i10, z10)) {
            J0(2);
            this.f6249j.b(i10);
            return;
        }
        J0(i10);
    }

    private void P0() {
        View view;
        WeakReference weakReference = this.f6261v;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            m0.k0(view, 262144);
            m0.k0(view, 1048576);
            if (this.f6252m != 5) {
                B0(view, y.a.f2554y, 5);
            }
            if (this.f6252m != 3) {
                B0(view, y.a.f2552w, 3);
            }
        }
    }

    private void Q0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f6261v;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) this.f6261v.get();
            View f02 = f0();
            if (f02 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) != null) {
                this.f6244e.o(marginLayoutParams, (int) ((((float) this.f6257r) * view.getScaleX()) + ((float) this.f6260u)));
                f02.requestLayout();
            }
        }
    }

    private void R0(k kVar) {
        g gVar = this.f6246g;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void S0(View view) {
        int i10 = this.f6252m == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int U(int i10, View view) {
        int i11 = this.f6252m;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f6244e.h(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f6244e.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f6252m);
    }

    private float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* access modifiers changed from: private */
    public int W(View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (L0(view, f10)) {
            if (!this.f6244e.m(f10, f11) && !this.f6244e.l(view)) {
                return 3;
            }
        } else if (f10 == 0.0f || !d.a(f10, f11)) {
            int left = view.getLeft();
            if (Math.abs(left - g0()) < Math.abs(left - this.f6244e.e())) {
                return 3;
            }
        }
        return 5;
    }

    private void X() {
        WeakReference weakReference = this.f6262w;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6262w = null;
    }

    private d0 Y(int i10) {
        return new j5.a(this, i10);
    }

    private void Z(Context context) {
        if (this.f6248i != null) {
            g gVar = new g(this.f6248i);
            this.f6246g = gVar;
            gVar.M(context);
            ColorStateList colorStateList = this.f6247h;
            if (colorStateList != null) {
                this.f6246g.W(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f6246g.setTint(typedValue.data);
        }
    }

    /* access modifiers changed from: private */
    public void a0(View view, int i10) {
        if (!this.B.isEmpty()) {
            this.f6244e.b(i10);
            Iterator it = this.B.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    private void b0(View view) {
        if (m0.p(view) == null) {
            m0.t0(view, view.getResources().getString(D));
        }
    }

    private int c0(int i10, int i11, int i12, int i13) {
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

    private ValueAnimator.AnimatorUpdateListener e0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View f02 = f0();
        if (f02 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) == null) {
            return null;
        }
        return new j5.b(this, marginLayoutParams, this.f6244e.c(marginLayoutParams), f02);
    }

    private int h0() {
        c cVar = this.f6244e;
        return (cVar == null || cVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        View view;
        WeakReference weakReference = this.f6261v;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean r0() {
        CoordinatorLayout.f q02 = q0();
        return q02 != null && q02.leftMargin > 0;
    }

    private boolean s0() {
        CoordinatorLayout.f q02 = q0();
        return q02 != null && q02.rightMargin > 0;
    }

    private boolean t0(MotionEvent motionEvent) {
        return K0() && V((float) this.A, motionEvent.getX()) > ((float) this.f6254o.z());
    }

    private boolean u0(float f10) {
        return this.f6244e.k(f10);
    }

    private boolean v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && m0.T(view);
    }

    private boolean w0(View view, int i10, boolean z10) {
        int l02 = l0(i10);
        c0.d p02 = p0();
        return p02 != null && (!z10 ? p02.Q(view, l02, view.getTop()) : p02.O(l02, view.getTop()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean x0(int i10, View view, d0.a aVar) {
        I0(i10);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        this.f6244e.o(marginLayoutParams, r4.a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z0(int i10) {
        View view = (View) this.f6261v.get();
        if (view != null) {
            O0(view, i10, false);
        }
    }

    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.c() != null) {
            super.B(coordinatorLayout, view, cVar.c());
        }
        int i10 = cVar.f6268g;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f6252m = i10;
        this.f6253n = i10;
    }

    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new c(super.C(coordinatorLayout, view), this);
    }

    public void E0(int i10) {
        this.f6263x = i10;
        X();
        WeakReference weakReference = this.f6261v;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 != -1 && m0.U(view)) {
                view.requestLayout();
            }
        }
    }

    public void F0(boolean z10) {
        this.f6251l = z10;
    }

    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6252m == 1 && actionMasked == 0) {
            return true;
        }
        if (K0()) {
            this.f6254o.F(motionEvent);
        }
        if (actionMasked == 0) {
            C0();
        }
        if (this.f6264y == null) {
            this.f6264y = VelocityTracker.obtain();
        }
        this.f6264y.addMovement(motionEvent);
        if (K0() && actionMasked == 2 && !this.f6255p && t0(motionEvent)) {
            this.f6254o.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f6255p;
    }

    public void I0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f6261v;
        if (weakReference == null || weakReference.get() == null) {
            J0(i10);
        } else {
            D0((View) this.f6261v.get(), new j5.c(this, i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void J0(int i10) {
        View view;
        if (this.f6252m != i10) {
            this.f6252m = i10;
            if (i10 == 3 || i10 == 5) {
                this.f6253n = i10;
            }
            WeakReference weakReference = this.f6261v;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                S0(view);
                Iterator it = this.B.iterator();
                if (!it.hasNext()) {
                    P0();
                } else {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean L0(View view, float f10) {
        return this.f6244e.n(view, f10);
    }

    public boolean N0() {
        return true;
    }

    public void a() {
        d5.g gVar = this.f6265z;
        if (gVar != null) {
            androidx.activity.b c10 = gVar.c();
            if (c10 == null || Build.VERSION.SDK_INT < 34) {
                I0(5);
            } else {
                this.f6265z.h(c10, h0(), new b(), e0());
            }
        }
    }

    public void b(androidx.activity.b bVar) {
        d5.g gVar = this.f6265z;
        if (gVar != null) {
            gVar.j(bVar);
        }
    }

    public void c(androidx.activity.b bVar) {
        d5.g gVar = this.f6265z;
        if (gVar != null) {
            gVar.l(bVar, h0());
            Q0();
        }
    }

    public void d() {
        d5.g gVar = this.f6265z;
        if (gVar != null) {
            gVar.f();
        }
    }

    /* access modifiers changed from: package-private */
    public int d0() {
        return this.f6257r;
    }

    public View f0() {
        WeakReference weakReference = this.f6262w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f6244e.d();
    }

    public float i0() {
        return this.f6256q;
    }

    /* access modifiers changed from: package-private */
    public float j0() {
        return 0.5f;
    }

    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f6261v = null;
        this.f6254o = null;
        this.f6265z = null;
    }

    /* access modifiers changed from: package-private */
    public int k0() {
        return this.f6260u;
    }

    /* access modifiers changed from: package-private */
    public int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f6244e.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    /* access modifiers changed from: package-private */
    public int m0() {
        return this.f6259t;
    }

    public void n() {
        super.n();
        this.f6261v = null;
        this.f6254o = null;
        this.f6265z = null;
    }

    /* access modifiers changed from: package-private */
    public int n0() {
        return this.f6258s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3 = r2.f6254o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r2.M0(r4)
            r4 = 1
            r0 = 0
            if (r3 != 0) goto L_0x000b
            r2.f6255p = r4
            return r0
        L_0x000b:
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L_0x0014
            r2.C0()
        L_0x0014:
            android.view.VelocityTracker r1 = r2.f6264y
            if (r1 != 0) goto L_0x001e
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r2.f6264y = r1
        L_0x001e:
            android.view.VelocityTracker r1 = r2.f6264y
            r1.addMovement(r5)
            if (r3 == 0) goto L_0x0032
            if (r3 == r4) goto L_0x002b
            r1 = 3
            if (r3 == r1) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            boolean r3 = r2.f6255p
            if (r3 == 0) goto L_0x0039
            r2.f6255p = r0
            return r0
        L_0x0032:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.A = r3
        L_0x0039:
            boolean r3 = r2.f6255p
            if (r3 != 0) goto L_0x0048
            c0.d r3 = r2.f6254o
            if (r3 == 0) goto L_0x0048
            boolean r3 = r3.P(r5)
            if (r3 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = r0
        L_0x0049:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.o(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public int o0() {
        return 500;
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (m0.y(coordinatorLayout) && !m0.y(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f6261v == null) {
            this.f6261v = new WeakReference(view);
            this.f6265z = new d5.g(view);
            g gVar = this.f6246g;
            if (gVar != null) {
                m0.u0(view, gVar);
                g gVar2 = this.f6246g;
                float f10 = this.f6250k;
                if (f10 == -1.0f) {
                    f10 = m0.w(view);
                }
                gVar2.V(f10);
            } else {
                ColorStateList colorStateList = this.f6247h;
                if (colorStateList != null) {
                    m0.v0(view, colorStateList);
                }
            }
            S0(view);
            P0();
            if (m0.z(view) == 0) {
                m0.B0(view, 1);
            }
            b0(view);
        }
        H0(view, i10);
        if (this.f6254o == null) {
            this.f6254o = c0.d.o(coordinatorLayout, this.C);
        }
        int h10 = this.f6244e.h(view);
        coordinatorLayout.I(view, i10);
        this.f6258s = coordinatorLayout.getWidth();
        this.f6259t = this.f6244e.i(coordinatorLayout);
        this.f6257r = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f6260u = marginLayoutParams != null ? this.f6244e.a(marginLayoutParams) : 0;
        m0.a0(view, U(h10, view));
        A0(coordinatorLayout);
        for (Object a10 : this.B) {
            android.support.v4.media.session.b.a(a10);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public c0.d p0() {
        return this.f6254o;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q4.k.O5);
        int i10 = q4.k.Q5;
        if (obtainStyledAttributes.hasValue(i10)) {
            this.f6247h = f5.c.a(context, obtainStyledAttributes, i10);
        }
        if (obtainStyledAttributes.hasValue(q4.k.T5)) {
            this.f6248i = k.e(context, attributeSet, 0, E).m();
        }
        int i11 = q4.k.S5;
        if (obtainStyledAttributes.hasValue(i11)) {
            E0(obtainStyledAttributes.getResourceId(i11, -1));
        }
        Z(context);
        this.f6250k = obtainStyledAttributes.getDimension(q4.k.P5, -1.0f);
        F0(obtainStyledAttributes.getBoolean(q4.k.R5, true));
        obtainStyledAttributes.recycle();
        this.f6245f = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
