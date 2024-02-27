package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import androidx.core.view.o0;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements androidx.core.view.x {
    private static final int[] E0 = {16843830};
    static final boolean F0 = false;
    static final boolean G0 = true;
    static final boolean H0 = true;
    static final boolean I0 = true;
    private static final boolean J0 = false;
    private static final boolean K0 = false;
    private static final Class[] L0;
    static final Interpolator M0 = new c();
    boolean A;
    private boolean A0;
    boolean B;
    private int B0;
    private boolean C;
    private int C0;
    private int D;
    private final p.b D0;
    boolean E;
    private final AccessibilityManager F;
    private List G;
    boolean H;
    boolean I;
    private int J;
    private int K;
    private l L;
    private EdgeEffect M;
    private EdgeEffect N;
    private EdgeEffect O;
    private EdgeEffect P;
    m Q;
    private int R;
    private int S;
    private VelocityTracker T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a0  reason: collision with root package name */
    private int f3546a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f3547b0;

    /* renamed from: c0  reason: collision with root package name */
    private r f3548c0;

    /* renamed from: d0  reason: collision with root package name */
    private final int f3549d0;

    /* renamed from: e  reason: collision with root package name */
    private final x f3550e;

    /* renamed from: e0  reason: collision with root package name */
    private final int f3551e0;

    /* renamed from: f  reason: collision with root package name */
    final v f3552f;

    /* renamed from: f0  reason: collision with root package name */
    private float f3553f0;

    /* renamed from: g  reason: collision with root package name */
    y f3554g;

    /* renamed from: g0  reason: collision with root package name */
    private float f3555g0;

    /* renamed from: h  reason: collision with root package name */
    a f3556h;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f3557h0;

    /* renamed from: i  reason: collision with root package name */
    b f3558i;

    /* renamed from: i0  reason: collision with root package name */
    final c0 f3559i0;

    /* renamed from: j  reason: collision with root package name */
    final p f3560j;

    /* renamed from: j0  reason: collision with root package name */
    e f3561j0;

    /* renamed from: k  reason: collision with root package name */
    boolean f3562k;

    /* renamed from: k0  reason: collision with root package name */
    e.b f3563k0;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f3564l;

    /* renamed from: l0  reason: collision with root package name */
    final a0 f3565l0;

    /* renamed from: m  reason: collision with root package name */
    final Rect f3566m;

    /* renamed from: m0  reason: collision with root package name */
    private t f3567m0;

    /* renamed from: n  reason: collision with root package name */
    private final Rect f3568n;

    /* renamed from: n0  reason: collision with root package name */
    private List f3569n0;

    /* renamed from: o  reason: collision with root package name */
    final RectF f3570o;

    /* renamed from: o0  reason: collision with root package name */
    boolean f3571o0;

    /* renamed from: p  reason: collision with root package name */
    h f3572p;

    /* renamed from: p0  reason: collision with root package name */
    boolean f3573p0;

    /* renamed from: q  reason: collision with root package name */
    p f3574q;

    /* renamed from: q0  reason: collision with root package name */
    private m.b f3575q0;

    /* renamed from: r  reason: collision with root package name */
    final List f3576r;

    /* renamed from: r0  reason: collision with root package name */
    boolean f3577r0;

    /* renamed from: s  reason: collision with root package name */
    final ArrayList f3578s;

    /* renamed from: s0  reason: collision with root package name */
    k f3579s0;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList f3580t;

    /* renamed from: t0  reason: collision with root package name */
    private final int[] f3581t0;

    /* renamed from: u  reason: collision with root package name */
    private s f3582u;

    /* renamed from: u0  reason: collision with root package name */
    private androidx.core.view.y f3583u0;

    /* renamed from: v  reason: collision with root package name */
    boolean f3584v;

    /* renamed from: v0  reason: collision with root package name */
    private final int[] f3585v0;

    /* renamed from: w  reason: collision with root package name */
    boolean f3586w;

    /* renamed from: w0  reason: collision with root package name */
    private final int[] f3587w0;

    /* renamed from: x  reason: collision with root package name */
    boolean f3588x;

    /* renamed from: x0  reason: collision with root package name */
    final int[] f3589x0;

    /* renamed from: y  reason: collision with root package name */
    boolean f3590y;

    /* renamed from: y0  reason: collision with root package name */
    final List f3591y0;

    /* renamed from: z  reason: collision with root package name */
    private int f3592z;

    /* renamed from: z0  reason: collision with root package name */
    private Runnable f3593z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3590y && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f3584v) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.B) {
                    recyclerView2.A = true;
                } else {
                    recyclerView2.u();
                }
            }
        }
    }

    public static class a0 {

        /* renamed from: a  reason: collision with root package name */
        int f3595a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray f3596b;

        /* renamed from: c  reason: collision with root package name */
        int f3597c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f3598d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f3599e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f3600f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f3601g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f3602h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f3603i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f3604j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f3605k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f3606l = false;

        /* renamed from: m  reason: collision with root package name */
        int f3607m;

        /* renamed from: n  reason: collision with root package name */
        long f3608n;

        /* renamed from: o  reason: collision with root package name */
        int f3609o;

        /* renamed from: p  reason: collision with root package name */
        int f3610p;

        /* renamed from: q  reason: collision with root package name */
        int f3611q;

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if ((this.f3599e & i10) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f3599e));
            }
        }

        public int b() {
            return this.f3602h ? this.f3597c - this.f3598d : this.f3600f;
        }

        public int c() {
            return this.f3595a;
        }

        public boolean d() {
            return this.f3595a != -1;
        }

        public boolean e() {
            return this.f3602h;
        }

        /* access modifiers changed from: package-private */
        public void f(h hVar) {
            this.f3599e = 1;
            this.f3600f = hVar.e();
            this.f3602h = false;
            this.f3603i = false;
            this.f3604j = false;
        }

        public boolean g() {
            return this.f3606l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3595a + ", mData=" + this.f3596b + ", mItemCount=" + this.f3600f + ", mIsMeasuring=" + this.f3604j + ", mPreviousLayoutItemCount=" + this.f3597c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3598d + ", mStructureChanged=" + this.f3601g + ", mInPreLayout=" + this.f3602h + ", mRunSimpleAnimations=" + this.f3605k + ", mRunPredictiveAnimations=" + this.f3606l + '}';
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            m mVar = RecyclerView.this.Q;
            if (mVar != null) {
                mVar.v();
            }
            RecyclerView.this.f3577r0 = false;
        }
    }

    public static abstract class b0 {
    }

    class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class c0 implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private int f3613e;

        /* renamed from: f  reason: collision with root package name */
        private int f3614f;

        /* renamed from: g  reason: collision with root package name */
        OverScroller f3615g;

        /* renamed from: h  reason: collision with root package name */
        Interpolator f3616h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f3617i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3618j = false;

        c0() {
            Interpolator interpolator = RecyclerView.M0;
            this.f3616h = interpolator;
            this.f3615g = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            m0.i0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f3614f = 0;
            this.f3613e = 0;
            Interpolator interpolator = this.f3616h;
            Interpolator interpolator2 = RecyclerView.M0;
            if (interpolator != interpolator2) {
                this.f3616h = interpolator2;
                this.f3615g = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3615g.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f3617i) {
                this.f3618j = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.M0;
            }
            if (this.f3616h != interpolator) {
                this.f3616h = interpolator;
                this.f3615g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3614f = 0;
            this.f3613e = 0;
            RecyclerView.this.setScrollState(2);
            this.f3615g.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f3615g.abortAnimation();
        }

        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3574q == null) {
                f();
                return;
            }
            this.f3618j = false;
            this.f3617i = true;
            recyclerView.u();
            OverScroller overScroller = this.f3615g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f3613e;
                int i13 = currY - this.f3614f;
                this.f3613e = currX;
                this.f3614f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3589x0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i12, i13, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3589x0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3572p != null) {
                    int[] iArr3 = recyclerView3.f3589x0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.i1(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3589x0;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    i12 -= i10;
                    i13 -= i11;
                    z zVar = recyclerView4.f3574q.f3668g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b10 = RecyclerView.this.f3565l0.b();
                        if (b10 == 0) {
                            zVar.r();
                        } else {
                            if (zVar.f() >= b10) {
                                zVar.p(b10 - 1);
                            }
                            zVar.j(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f3578s.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3589x0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i10, i11, i12, i13, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3589x0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (!(i10 == 0 && i11 == 0)) {
                    recyclerView6.I(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                z zVar2 = RecyclerView.this.f3574q.f3668g;
                if ((zVar2 == null || !zVar2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i16, currVelocity);
                    }
                    if (RecyclerView.I0) {
                        RecyclerView.this.f3563k0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    e eVar = recyclerView7.f3561j0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            z zVar3 = RecyclerView.this.f3574q.f3668g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f3617i = false;
            if (this.f3618j) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.v1(1);
        }
    }

    class d implements p.b {
        d() {
        }

        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3574q.s1(d0Var.f3622e, recyclerView.f3552f);
        }

        public void b(d0 d0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.l(d0Var, cVar, cVar2);
        }

        public void c(d0 d0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.f3552f.J(d0Var);
            RecyclerView.this.n(d0Var, cVar, cVar2);
        }

        public void d(d0 d0Var, m.c cVar, m.c cVar2) {
            d0Var.I(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z10 = recyclerView.H;
            m mVar = recyclerView.Q;
            if (z10) {
                if (!mVar.b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!mVar.d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.O0();
        }
    }

    public static abstract class d0 {

        /* renamed from: x  reason: collision with root package name */
        private static final List f3621x = Collections.emptyList();

        /* renamed from: e  reason: collision with root package name */
        public final View f3622e;

        /* renamed from: f  reason: collision with root package name */
        WeakReference f3623f;

        /* renamed from: g  reason: collision with root package name */
        int f3624g = -1;

        /* renamed from: h  reason: collision with root package name */
        int f3625h = -1;

        /* renamed from: i  reason: collision with root package name */
        long f3626i = -1;

        /* renamed from: j  reason: collision with root package name */
        int f3627j = -1;

        /* renamed from: k  reason: collision with root package name */
        int f3628k = -1;

        /* renamed from: l  reason: collision with root package name */
        d0 f3629l = null;

        /* renamed from: m  reason: collision with root package name */
        d0 f3630m = null;

        /* renamed from: n  reason: collision with root package name */
        int f3631n;

        /* renamed from: o  reason: collision with root package name */
        List f3632o = null;

        /* renamed from: p  reason: collision with root package name */
        List f3633p = null;

        /* renamed from: q  reason: collision with root package name */
        private int f3634q = 0;

        /* renamed from: r  reason: collision with root package name */
        v f3635r = null;

        /* renamed from: s  reason: collision with root package name */
        boolean f3636s = false;

        /* renamed from: t  reason: collision with root package name */
        private int f3637t = 0;

        /* renamed from: u  reason: collision with root package name */
        int f3638u = -1;

        /* renamed from: v  reason: collision with root package name */
        RecyclerView f3639v;

        /* renamed from: w  reason: collision with root package name */
        h f3640w;

        public d0(View view) {
            if (view != null) {
                this.f3622e = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.f3632o == null) {
                ArrayList arrayList = new ArrayList();
                this.f3632o = arrayList;
                this.f3633p = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean A() {
            return (this.f3631n & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean B() {
            return (this.f3631n & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void C(int i10, boolean z10) {
            if (this.f3625h == -1) {
                this.f3625h = this.f3624g;
            }
            if (this.f3628k == -1) {
                this.f3628k = this.f3624g;
            }
            if (z10) {
                this.f3628k += i10;
            }
            this.f3624g += i10;
            if (this.f3622e.getLayoutParams() != null) {
                ((q) this.f3622e.getLayoutParams()).f3688c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void D(RecyclerView recyclerView) {
            int i10 = this.f3638u;
            if (i10 == -1) {
                i10 = m0.z(this.f3622e);
            }
            this.f3637t = i10;
            recyclerView.l1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void E(RecyclerView recyclerView) {
            recyclerView.l1(this, this.f3637t);
            this.f3637t = 0;
        }

        /* access modifiers changed from: package-private */
        public void F() {
            this.f3631n = 0;
            this.f3624g = -1;
            this.f3625h = -1;
            this.f3626i = -1;
            this.f3628k = -1;
            this.f3634q = 0;
            this.f3629l = null;
            this.f3630m = null;
            d();
            this.f3637t = 0;
            this.f3638u = -1;
            RecyclerView.r(this);
        }

        /* access modifiers changed from: package-private */
        public void G() {
            if (this.f3625h == -1) {
                this.f3625h = this.f3624g;
            }
        }

        /* access modifiers changed from: package-private */
        public void H(int i10, int i11) {
            this.f3631n = (i10 & i11) | (this.f3631n & (~i11));
        }

        public final void I(boolean z10) {
            int i10;
            int i11 = this.f3634q;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f3634q = i12;
            if (i12 < 0) {
                this.f3634q = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f3631n | 16;
            } else if (z10 && i12 == 0) {
                i10 = this.f3631n & -17;
            } else {
                return;
            }
            this.f3631n = i10;
        }

        /* access modifiers changed from: package-private */
        public void J(v vVar, boolean z10) {
            this.f3635r = vVar;
            this.f3636s = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean K() {
            return (this.f3631n & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean L() {
            return (this.f3631n & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void M() {
            this.f3635r.J(this);
        }

        /* access modifiers changed from: package-private */
        public boolean N() {
            return (this.f3631n & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f3631n) == 0) {
                g();
                this.f3632o.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            this.f3631n = i10 | this.f3631n;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f3625h = -1;
            this.f3628k = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            List list = this.f3632o;
            if (list != null) {
                list.clear();
            }
            this.f3631n &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f3631n &= -33;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f3631n &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return (this.f3631n & 16) == 0 && m0.R(this.f3622e);
        }

        /* access modifiers changed from: package-private */
        public void i(int i10, int i11, boolean z10) {
            b(8);
            C(i11, z10);
            this.f3624g = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f3639v;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final int k() {
            return l();
        }

        public final int l() {
            RecyclerView recyclerView;
            h adapter;
            int b02;
            if (this.f3640w == null || (recyclerView = this.f3639v) == null || (adapter = recyclerView.getAdapter()) == null || (b02 = this.f3639v.b0(this)) == -1) {
                return -1;
            }
            return adapter.d(this.f3640w, this, b02);
        }

        public final long m() {
            return this.f3626i;
        }

        public final int n() {
            return this.f3627j;
        }

        public final int o() {
            int i10 = this.f3628k;
            return i10 == -1 ? this.f3624g : i10;
        }

        public final int p() {
            return this.f3625h;
        }

        /* access modifiers changed from: package-private */
        public List q() {
            if ((this.f3631n & 1024) != 0) {
                return f3621x;
            }
            List list = this.f3632o;
            return (list == null || list.size() == 0) ? f3621x : this.f3633p;
        }

        /* access modifiers changed from: package-private */
        public boolean r(int i10) {
            return (i10 & this.f3631n) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.f3631n & 512) != 0 || v();
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            return (this.f3622e.getParent() == null || this.f3622e.getParent() == this.f3639v) ? false : true;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3624g + " id=" + this.f3626i + ", oldPos=" + this.f3625h + ", pLpos:" + this.f3628k);
            if (y()) {
                sb2.append(" scrap ");
                sb2.append(this.f3636s ? "[changeScrap]" : "[attachedScrap]");
            }
            if (v()) {
                sb2.append(" invalid");
            }
            if (!u()) {
                sb2.append(" unbound");
            }
            if (B()) {
                sb2.append(" update");
            }
            if (x()) {
                sb2.append(" removed");
            }
            if (L()) {
                sb2.append(" ignored");
            }
            if (z()) {
                sb2.append(" tmpDetached");
            }
            if (!w()) {
                sb2.append(" not recyclable(" + this.f3634q + ")");
            }
            if (s()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f3622e.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public boolean u() {
            return (this.f3631n & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return (this.f3631n & 4) != 0;
        }

        public final boolean w() {
            return (this.f3631n & 16) == 0 && !m0.R(this.f3622e);
        }

        /* access modifiers changed from: package-private */
        public boolean x() {
            return (this.f3631n & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean y() {
            return this.f3635r != null;
        }

        /* access modifiers changed from: package-private */
        public boolean z() {
            return (this.f3631n & 256) != 0;
        }
    }

    class e implements b.C0065b {
        e() {
        }

        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        public void b(View view) {
            d0 f02 = RecyclerView.f0(view);
            if (f02 != null) {
                f02.D(RecyclerView.this);
            }
        }

        public d0 c(View view) {
            return RecyclerView.f0(view);
        }

        public void d(int i10) {
            d0 f02;
            View a10 = a(i10);
            if (!(a10 == null || (f02 = RecyclerView.f0(a10)) == null)) {
                if (!f02.z() || f02.L()) {
                    f02.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + f02 + RecyclerView.this.P());
                }
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        public void e(View view) {
            d0 f02 = RecyclerView.f0(view);
            if (f02 != null) {
                f02.E(RecyclerView.this);
            }
        }

        public void f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.y(view);
        }

        public int g() {
            return RecyclerView.this.getChildCount();
        }

        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        public void i() {
            int g10 = g();
            for (int i10 = 0; i10 < g10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.z(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            d0 f02 = RecyclerView.f0(view);
            if (f02 != null) {
                if (f02.z() || f02.L()) {
                    f02.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f02 + RecyclerView.this.P());
                }
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }

        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    class f implements a.C0064a {
        f() {
        }

        public void a(int i10, int i11) {
            RecyclerView.this.E0(i10, i11);
            RecyclerView.this.f3571o0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public d0 c(int i10) {
            d0 Z = RecyclerView.this.Z(i10, true);
            if (Z != null && !RecyclerView.this.f3558i.n(Z.f3622e)) {
                return Z;
            }
            return null;
        }

        public void d(int i10, int i11) {
            RecyclerView.this.F0(i10, i11, false);
            RecyclerView.this.f3571o0 = true;
        }

        public void e(int i10, int i11) {
            RecyclerView.this.D0(i10, i11);
            RecyclerView.this.f3571o0 = true;
        }

        public void f(int i10, int i11) {
            RecyclerView.this.F0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3571o0 = true;
            recyclerView.f3565l0.f3598d += i11;
        }

        public void g(a.b bVar) {
            i(bVar);
        }

        public void h(int i10, int i11, Object obj) {
            RecyclerView.this.y1(i10, i11, obj);
            RecyclerView.this.f3573p0 = true;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i10 = bVar.f3769a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3574q.X0(recyclerView, bVar.f3770b, bVar.f3772d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3574q.a1(recyclerView2, bVar.f3770b, bVar.f3772d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3574q.c1(recyclerView3, bVar.f3770b, bVar.f3772d, bVar.f3771c);
            } else if (i10 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3574q.Z0(recyclerView4, bVar.f3770b, bVar.f3772d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3643a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.h.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3643a = r0
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.h.a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3643a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.h.a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g.<clinit>():void");
        }
    }

    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        private final i f3644a = new i();

        /* renamed from: b  reason: collision with root package name */
        private boolean f3645b = false;

        /* renamed from: c  reason: collision with root package name */
        private a f3646c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(d0 d0Var, int i10) {
            boolean z10 = d0Var.f3640w == null;
            if (z10) {
                d0Var.f3624g = i10;
                if (i()) {
                    d0Var.f3626i = f(i10);
                }
                d0Var.H(1, 519);
                androidx.core.os.l.a("RV OnBindView");
            }
            d0Var.f3640w = this;
            q(d0Var, i10, d0Var.q());
            if (z10) {
                d0Var.d();
                ViewGroup.LayoutParams layoutParams = d0Var.f3622e.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f3688c = true;
                }
                androidx.core.os.l.b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10 = g.f3643a[this.f3646c.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 != 2) {
                return true;
            }
            return e() > 0;
        }

        public final d0 c(ViewGroup viewGroup, int i10) {
            try {
                androidx.core.os.l.a("RV CreateView");
                d0 r10 = r(viewGroup, i10);
                if (r10.f3622e.getParent() == null) {
                    r10.f3627j = i10;
                    return r10;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.l.b();
            }
        }

        public int d(h hVar, d0 d0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i10) {
            return -1;
        }

        public int g(int i10) {
            return 0;
        }

        public final boolean h() {
            return this.f3644a.a();
        }

        public final boolean i() {
            return this.f3645b;
        }

        public final void j() {
            this.f3644a.b();
        }

        public final void k(int i10) {
            this.f3644a.c(i10, 1);
        }

        public final void l(int i10, Object obj) {
            this.f3644a.d(i10, 1, obj);
        }

        public final void m(int i10, int i11) {
            this.f3644a.c(i10, i11);
        }

        public final void n(int i10) {
            this.f3644a.e(i10, 1);
        }

        public void o(RecyclerView recyclerView) {
        }

        public abstract void p(d0 d0Var, int i10);

        public void q(d0 d0Var, int i10, List list) {
            p(d0Var, i10);
        }

        public abstract d0 r(ViewGroup viewGroup, int i10);

        public void s(RecyclerView recyclerView) {
        }

        public boolean t(d0 d0Var) {
            return false;
        }

        public void u(d0 d0Var) {
        }

        public void v(d0 d0Var) {
        }

        public void w(d0 d0Var) {
        }

        public void x(j jVar) {
            this.f3644a.registerObserver(jVar);
        }

        public void y(boolean z10) {
            if (!h()) {
                this.f3645b = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void z(j jVar) {
            this.f3644a.unregisterObserver(jVar);
        }
    }

    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            d(i10, i11, (Object) null);
        }

        public void d(int i10, int i11, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void e(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).d(i10, i11);
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }
    }

    public interface k {
    }

    public static class l {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        private b f3651a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList f3652b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private long f3653c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f3654d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f3655e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f3656f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(d0 d0Var);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f3657a;

            /* renamed from: b  reason: collision with root package name */
            public int f3658b;

            /* renamed from: c  reason: collision with root package name */
            public int f3659c;

            /* renamed from: d  reason: collision with root package name */
            public int f3660d;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i10) {
                View view = d0Var.f3622e;
                this.f3657a = view.getLeft();
                this.f3658b = view.getTop();
                this.f3659c = view.getRight();
                this.f3660d = view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i10 = d0Var.f3631n;
            int i11 = i10 & 14;
            if (d0Var.v()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i11;
            }
            int p10 = d0Var.p();
            int j10 = d0Var.j();
            return (p10 == -1 || j10 == -1 || p10 == j10) ? i11 : i11 | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            s(d0Var);
            b bVar = this.f3651a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.f3652b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a) this.f3652b.get(i10)).a();
            }
            this.f3652b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.f3653c;
        }

        public long m() {
            return this.f3656f;
        }

        public long n() {
            return this.f3655e;
        }

        public long o() {
            return this.f3654d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean p10 = p();
            if (aVar != null) {
                if (!p10) {
                    aVar.a();
                } else {
                    this.f3652b.add(aVar);
                }
            }
            return p10;
        }

        public c r() {
            return new c();
        }

        public void s(d0 d0Var) {
        }

        public c t(a0 a0Var, d0 d0Var) {
            return r().a(d0Var);
        }

        public c u(a0 a0Var, d0 d0Var, int i10, List list) {
            return r().a(d0Var);
        }

        public abstract void v();

        /* access modifiers changed from: package-private */
        public void w(b bVar) {
            this.f3651a = bVar;
        }
    }

    private class n implements m.b {
        n() {
        }

        public void a(d0 d0Var) {
            d0Var.I(true);
            if (d0Var.f3629l != null && d0Var.f3630m == null) {
                d0Var.f3629l = null;
            }
            d0Var.f3630m = null;
            if (!d0Var.K() && !RecyclerView.this.X0(d0Var.f3622e) && d0Var.z()) {
                RecyclerView.this.removeDetachedView(d0Var.f3622e, false);
            }
        }
    }

    public static abstract class o {
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class p {

        /* renamed from: a  reason: collision with root package name */
        b f3662a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f3663b;

        /* renamed from: c  reason: collision with root package name */
        private final o.b f3664c;

        /* renamed from: d  reason: collision with root package name */
        private final o.b f3665d;

        /* renamed from: e  reason: collision with root package name */
        o f3666e;

        /* renamed from: f  reason: collision with root package name */
        o f3667f;

        /* renamed from: g  reason: collision with root package name */
        z f3668g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3669h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f3670i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f3671j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f3672k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f3673l = true;

        /* renamed from: m  reason: collision with root package name */
        int f3674m;

        /* renamed from: n  reason: collision with root package name */
        boolean f3675n;

        /* renamed from: o  reason: collision with root package name */
        private int f3676o;

        /* renamed from: p  reason: collision with root package name */
        private int f3677p;

        /* renamed from: q  reason: collision with root package name */
        private int f3678q;

        /* renamed from: r  reason: collision with root package name */
        private int f3679r;

        class a implements o.b {
            a() {
            }

            public View a(int i10) {
                return p.this.N(i10);
            }

            public int b() {
                return p.this.u0() - p.this.k0();
            }

            public int c(View view) {
                return p.this.V(view) - ((q) view.getLayoutParams()).leftMargin;
            }

            public int d() {
                return p.this.j0();
            }

            public int e(View view) {
                return p.this.Y(view) + ((q) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements o.b {
            b() {
            }

            public View a(int i10) {
                return p.this.N(i10);
            }

            public int b() {
                return p.this.b0() - p.this.h0();
            }

            public int c(View view) {
                return p.this.Z(view) - ((q) view.getLayoutParams()).topMargin;
            }

            public int d() {
                return p.this.m0();
            }

            public int e(View view) {
                return p.this.T(view) + ((q) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f3682a;

            /* renamed from: b  reason: collision with root package name */
            public int f3683b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f3684c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f3685d;
        }

        public p() {
            a aVar = new a();
            this.f3664c = aVar;
            b bVar = new b();
            this.f3665d = bVar;
            this.f3666e = new o(aVar);
            this.f3667f = new o(bVar);
        }

        private void B1(v vVar, int i10, View view) {
            d0 f02 = RecyclerView.f0(view);
            if (!f02.L()) {
                if (!f02.v() || f02.x() || this.f3663b.f3572p.i()) {
                    C(i10);
                    vVar.D(view);
                    this.f3663b.f3560j.k(f02);
                    return;
                }
                w1(i10);
                vVar.C(f02);
            }
        }

        private static boolean C0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void D(int i10, View view) {
            this.f3662a.d(i10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
            if (r5 == 1073741824) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001d
                if (r7 < 0) goto L_0x0012
            L_0x0010:
                r5 = r3
                goto L_0x0030
            L_0x0012:
                if (r7 != r1) goto L_0x001a
                if (r5 == r2) goto L_0x0022
                if (r5 == 0) goto L_0x001a
                if (r5 == r3) goto L_0x0022
            L_0x001a:
                r5 = r6
                r7 = r5
                goto L_0x0030
            L_0x001d:
                if (r7 < 0) goto L_0x0020
                goto L_0x0010
            L_0x0020:
                if (r7 != r1) goto L_0x0024
            L_0x0022:
                r7 = r4
                goto L_0x0030
            L_0x0024:
                if (r7 != r0) goto L_0x001a
                if (r5 == r2) goto L_0x002e
                if (r5 != r3) goto L_0x002b
                goto L_0x002e
            L_0x002b:
                r7 = r4
                r5 = r6
                goto L_0x0030
            L_0x002e:
                r7 = r4
                r5 = r2
            L_0x0030:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.P(int, int, int, int, boolean):int");
        }

        private int[] Q(View view, Rect rect) {
            int[] iArr = new int[2];
            int j02 = j0();
            int m02 = m0();
            int u02 = u0() - k0();
            int b02 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - j02;
            int min = Math.min(0, i10);
            int i11 = top - m02;
            int min2 = Math.min(0, i11);
            int i12 = width - u02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - b02);
            if (d0() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void k(View view, int i10, boolean z10) {
            d0 f02 = RecyclerView.f0(view);
            if (z10 || f02.x()) {
                this.f3663b.f3560j.b(f02);
            } else {
                this.f3663b.f3560j.p(f02);
            }
            q qVar = (q) view.getLayoutParams();
            if (f02.N() || f02.y()) {
                if (f02.y()) {
                    f02.M();
                } else {
                    f02.e();
                }
                this.f3662a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3663b) {
                int m10 = this.f3662a.m(view);
                if (i10 == -1) {
                    i10 = this.f3662a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3663b.indexOfChild(view) + this.f3663b.P());
                } else if (m10 != i10) {
                    this.f3663b.f3574q.H0(m10, i10);
                }
            } else {
                this.f3662a.a(view, i10, false);
                qVar.f3688c = true;
                z zVar = this.f3668g;
                if (zVar != null && zVar.h()) {
                    this.f3668g.k(view);
                }
            }
            if (qVar.f3689d) {
                f02.f3622e.invalidate();
                qVar.f3689d = false;
            }
        }

        public static d o0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0.c.f18158f, i10, i11);
            dVar.f3682a = obtainStyledAttributes.getInt(x0.c.f18159g, 1);
            dVar.f3683b = obtainStyledAttributes.getInt(x0.c.f18169q, 1);
            dVar.f3684c = obtainStyledAttributes.getBoolean(x0.c.f18168p, false);
            dVar.f3685d = obtainStyledAttributes.getBoolean(x0.c.f18170r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private boolean z0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int j02 = j0();
            int m02 = m0();
            int u02 = u0() - k0();
            int b02 = b0() - h0();
            Rect rect = this.f3663b.f3566m;
            U(focusedChild, rect);
            return rect.left - i10 < u02 && rect.right - i10 > j02 && rect.top - i11 < b02 && rect.bottom - i11 > m02;
        }

        public abstract int A(a0 a0Var);

        public final boolean A0() {
            return this.f3673l;
        }

        public void A1() {
            this.f3669h = true;
        }

        public void B(v vVar) {
            for (int O = O() - 1; O >= 0; O--) {
                B1(vVar, O, N(O));
            }
        }

        public boolean B0(v vVar, a0 a0Var) {
            return false;
        }

        public void C(int i10) {
            D(i10, N(i10));
        }

        public abstract int C1(int i10, v vVar, a0 a0Var);

        public boolean D0() {
            z zVar = this.f3668g;
            return zVar != null && zVar.h();
        }

        public abstract void D1(int i10);

        /* access modifiers changed from: package-private */
        public void E(RecyclerView recyclerView) {
            this.f3670i = true;
            M0(recyclerView);
        }

        public boolean E0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f3666e.b(view, 24579) && this.f3667f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract int E1(int i10, v vVar, a0 a0Var);

        /* access modifiers changed from: package-private */
        public void F(RecyclerView recyclerView, v vVar) {
            this.f3670i = false;
            O0(recyclerView, vVar);
        }

        public void F0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f3687b;
            view.layout(i10 + rect.left + qVar.leftMargin, i11 + rect.top + qVar.topMargin, (i12 - rect.right) - qVar.rightMargin, (i13 - rect.bottom) - qVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        public void F1(RecyclerView recyclerView) {
            G1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public View G(View view) {
            View R;
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView == null || (R = recyclerView.R(view)) == null || this.f3662a.n(R)) {
                return null;
            }
            return R;
        }

        public void G0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect j02 = this.f3663b.j0(view);
            int i12 = i10 + j02.left + j02.right;
            int i13 = i11 + j02.top + j02.bottom;
            int P = P(u0(), v0(), j0() + k0() + qVar.leftMargin + qVar.rightMargin + i12, qVar.width, p());
            int P2 = P(b0(), c0(), m0() + h0() + qVar.topMargin + qVar.bottomMargin + i13, qVar.height, q());
            if (L1(view, P, P2, qVar)) {
                view.measure(P, P2);
            }
        }

        /* access modifiers changed from: package-private */
        public void G1(int i10, int i11) {
            this.f3678q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f3676o = mode;
            if (mode == 0 && !RecyclerView.G0) {
                this.f3678q = 0;
            }
            this.f3679r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3677p = mode2;
            if (mode2 == 0 && !RecyclerView.G0) {
                this.f3679r = 0;
            }
        }

        public View H(int i10) {
            int O = O();
            for (int i11 = 0; i11 < O; i11++) {
                View N = N(i11);
                d0 f02 = RecyclerView.f0(N);
                if (f02 != null && f02.o() == i10 && !f02.L() && (this.f3663b.f3565l0.e() || !f02.x())) {
                    return N;
                }
            }
            return null;
        }

        public void H0(int i10, int i11) {
            View N = N(i10);
            if (N != null) {
                C(i10);
                m(N, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f3663b.toString());
        }

        public void H1(int i10, int i11) {
            this.f3663b.setMeasuredDimension(i10, i11);
        }

        public abstract q I();

        public void I0(int i10) {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                recyclerView.B0(i10);
            }
        }

        public void I1(Rect rect, int i10, int i11) {
            H1(s(i10, rect.width() + j0() + k0(), g0()), s(i11, rect.height() + m0() + h0(), f0()));
        }

        public q J(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void J0(int i10) {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                recyclerView.C0(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void J1(int i10, int i11) {
            int O = O();
            if (O == 0) {
                this.f3663b.w(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < O; i16++) {
                View N = N(i16);
                Rect rect = this.f3663b.f3566m;
                U(N, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f3663b.f3566m.set(i15, i13, i12, i14);
            I1(this.f3663b.f3566m, i10, i11);
        }

        public q K(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void K0(h hVar, h hVar2) {
        }

        /* access modifiers changed from: package-private */
        public void K1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f3663b = null;
                this.f3662a = null;
                height = 0;
                this.f3678q = 0;
            } else {
                this.f3663b = recyclerView;
                this.f3662a = recyclerView.f3558i;
                this.f3678q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f3679r = height;
            this.f3676o = 1073741824;
            this.f3677p = 1073741824;
        }

        public int L() {
            return -1;
        }

        public boolean L0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean L1(View view, int i10, int i11, q qVar) {
            return view.isLayoutRequested() || !this.f3672k || !C0(view.getWidth(), i10, qVar.width) || !C0(view.getHeight(), i11, qVar.height);
        }

        public int M(View view) {
            return ((q) view.getLayoutParams()).f3687b.bottom;
        }

        public void M0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean M1() {
            return false;
        }

        public View N(int i10) {
            b bVar = this.f3662a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public void N0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean N1(View view, int i10, int i11, q qVar) {
            return !this.f3672k || !C0(view.getMeasuredWidth(), i10, qVar.width) || !C0(view.getMeasuredHeight(), i11, qVar.height);
        }

        public int O() {
            b bVar = this.f3662a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(RecyclerView recyclerView, v vVar) {
            N0(recyclerView);
        }

        public abstract void O1(RecyclerView recyclerView, a0 a0Var, int i10);

        public abstract View P0(View view, int i10, v vVar, a0 a0Var);

        public void P1(z zVar) {
            z zVar2 = this.f3668g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.h())) {
                this.f3668g.r();
            }
            this.f3668g = zVar;
            zVar.q(this.f3663b, this);
        }

        public void Q0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3663b;
            R0(recyclerView.f3552f, recyclerView.f3565l0, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        public void Q1() {
            z zVar = this.f3668g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public boolean R() {
            RecyclerView recyclerView = this.f3663b;
            return recyclerView != null && recyclerView.f3562k;
        }

        public void R0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3663b.canScrollVertically(-1) && !this.f3663b.canScrollHorizontally(-1) && !this.f3663b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                h hVar = this.f3663b.f3572p;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.e());
                }
            }
        }

        public boolean R1() {
            return false;
        }

        public int S(v vVar, a0 a0Var) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        public void S0(androidx.core.view.accessibility.y yVar) {
            RecyclerView recyclerView = this.f3663b;
            T0(recyclerView.f3552f, recyclerView.f3565l0, yVar);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void T0(v vVar, a0 a0Var, androidx.core.view.accessibility.y yVar) {
            if (this.f3663b.canScrollVertically(-1) || this.f3663b.canScrollHorizontally(-1)) {
                yVar.a(8192);
                yVar.F0(true);
            }
            if (this.f3663b.canScrollVertically(1) || this.f3663b.canScrollHorizontally(1)) {
                yVar.a(4096);
                yVar.F0(true);
            }
            yVar.o0(y.f.b(q0(vVar, a0Var), S(vVar, a0Var), B0(vVar, a0Var), r0(vVar, a0Var)));
        }

        public void U(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        /* access modifiers changed from: package-private */
        public void U0(View view, androidx.core.view.accessibility.y yVar) {
            d0 f02 = RecyclerView.f0(view);
            if (f02 != null && !f02.x() && !this.f3662a.n(f02.f3622e)) {
                RecyclerView recyclerView = this.f3663b;
                V0(recyclerView.f3552f, recyclerView.f3565l0, view, yVar);
            }
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(v vVar, a0 a0Var, View view, androidx.core.view.accessibility.y yVar) {
        }

        public int W(View view) {
            Rect rect = ((q) view.getLayoutParams()).f3687b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View W0(View view, int i10) {
            return null;
        }

        public int X(View view) {
            Rect rect = ((q) view.getLayoutParams()).f3687b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int Y(View view) {
            return view.getRight() + p0(view);
        }

        public void Y0(RecyclerView recyclerView) {
        }

        public int Z(View view) {
            return view.getTop() - s0(view);
        }

        public void Z0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3662a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int b0() {
            return this.f3679r;
        }

        public void b1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int c0() {
            return this.f3677p;
        }

        public void c1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            b1(recyclerView, i10, i11);
        }

        public int d0() {
            return m0.B(this.f3663b);
        }

        public abstract void d1(v vVar, a0 a0Var);

        public int e() {
            RecyclerView recyclerView = this.f3663b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public int e0(View view) {
            return ((q) view.getLayoutParams()).f3687b.left;
        }

        public void e1(a0 a0Var) {
        }

        public int f0() {
            return m0.C(this.f3663b);
        }

        public void f1(v vVar, a0 a0Var, int i10, int i11) {
            this.f3663b.w(i10, i11);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return m0.D(this.f3663b);
        }

        public boolean g1(RecyclerView recyclerView, View view, View view2) {
            return D0() || recyclerView.v0();
        }

        public void h(View view, int i10) {
            k(view, i10, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean h1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return g1(recyclerView, view, view2);
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                return m0.F(recyclerView);
            }
            return 0;
        }

        public void i1(Parcelable parcelable) {
        }

        public void j(View view, int i10) {
            k(view, i10, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable j1() {
            return null;
        }

        public int k0() {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void k1(int i10) {
        }

        public void l(String str) {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int l0() {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                return m0.G(recyclerView);
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void l1(z zVar) {
            if (this.f3668g == zVar) {
                this.f3668g = null;
            }
        }

        public void m(View view, int i10) {
            n(view, i10, (q) view.getLayoutParams());
        }

        public int m0() {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean m1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3663b;
            return n1(recyclerView.f3552f, recyclerView.f3565l0, i10, bundle);
        }

        public void n(View view, int i10, q qVar) {
            d0 f02 = RecyclerView.f0(view);
            if (f02.x()) {
                this.f3663b.f3560j.b(f02);
            } else {
                this.f3663b.f3560j.p(f02);
            }
            this.f3662a.c(view, i10, qVar, f02.x());
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean n1(androidx.recyclerview.widget.RecyclerView.v r8, androidx.recyclerview.widget.RecyclerView.a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f3663b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0047
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x0074
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.b0()
                int r11 = r7.m0()
                int r8 = r8 - r11
                int r11 = r7.h0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = r9
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f3663b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0044
                int r10 = r7.u0()
                int r11 = r7.j0()
                int r10 = r10 - r11
                int r11 = r7.k0()
                int r10 = r10 - r11
                int r10 = -r10
            L_0x0041:
                r3 = r8
                r2 = r10
                goto L_0x0074
            L_0x0044:
                r3 = r8
                r2 = r9
                goto L_0x0074
            L_0x0047:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x005c
                int r8 = r7.b0()
                int r10 = r7.m0()
                int r8 = r8 - r10
                int r10 = r7.h0()
                int r8 = r8 - r10
                goto L_0x005d
            L_0x005c:
                r8 = r9
            L_0x005d:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f3663b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0044
                int r10 = r7.u0()
                int r11 = r7.j0()
                int r10 = r10 - r11
                int r11 = r7.k0()
                int r10 = r10 - r11
                goto L_0x0041
            L_0x0074:
                if (r3 != 0) goto L_0x0079
                if (r2 != 0) goto L_0x0079
                return r9
            L_0x0079:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f3663b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.q1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.n1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        /* access modifiers changed from: package-private */
        public boolean o1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3663b;
            return p1(recyclerView.f3552f, recyclerView.f3565l0, view, i10, bundle);
        }

        public abstract boolean p();

        public int p0(View view) {
            return ((q) view.getLayoutParams()).f3687b.right;
        }

        public boolean p1(v vVar, a0 a0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public abstract boolean q();

        public int q0(v vVar, a0 a0Var) {
            return -1;
        }

        public void q1(v vVar) {
            for (int O = O() - 1; O >= 0; O--) {
                if (!RecyclerView.f0(N(O)).L()) {
                    t1(O, vVar);
                }
            }
        }

        public boolean r(q qVar) {
            return qVar != null;
        }

        public int r0(v vVar, a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void r1(v vVar) {
            int j10 = vVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = vVar.n(i10);
                d0 f02 = RecyclerView.f0(n10);
                if (!f02.L()) {
                    f02.I(false);
                    if (f02.z()) {
                        this.f3663b.removeDetachedView(n10, false);
                    }
                    m mVar = this.f3663b.Q;
                    if (mVar != null) {
                        mVar.j(f02);
                    }
                    f02.I(true);
                    vVar.y(n10);
                }
            }
            vVar.e();
            if (j10 > 0) {
                this.f3663b.invalidate();
            }
        }

        public int s0(View view) {
            return ((q) view.getLayoutParams()).f3687b.top;
        }

        public void s1(View view, v vVar) {
            v1(view);
            vVar.B(view);
        }

        public void t(int i10, int i11, a0 a0Var, c cVar) {
        }

        public void t0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f3687b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3663b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3663b.f3570o;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void t1(int i10, v vVar) {
            View N = N(i10);
            w1(i10);
            vVar.B(N);
        }

        public void u(int i10, c cVar) {
        }

        public int u0() {
            return this.f3678q;
        }

        public boolean u1(Runnable runnable) {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public abstract int v(a0 a0Var);

        public int v0() {
            return this.f3676o;
        }

        public void v1(View view) {
            this.f3662a.p(view);
        }

        public abstract int w(a0 a0Var);

        /* access modifiers changed from: package-private */
        public boolean w0() {
            int O = O();
            for (int i10 = 0; i10 < O; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void w1(int i10) {
            if (N(i10) != null) {
                this.f3662a.q(i10);
            }
        }

        public abstract int x(a0 a0Var);

        public boolean x0() {
            return this.f3670i;
        }

        public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return y1(recyclerView, view, rect, z10, false);
        }

        public abstract int y(a0 a0Var);

        public boolean y0() {
            return this.f3671j;
        }

        public boolean y1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] Q = Q(view, rect);
            int i10 = Q[0];
            int i11 = Q[1];
            if ((z11 && !z0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.n1(i10, i11);
            }
            return true;
        }

        public abstract int z(a0 a0Var);

        public void z1() {
            RecyclerView recyclerView = this.f3663b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        d0 f3686a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f3687b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f3688c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f3689d = false;

        public q(int i10, int i11) {
            super(i10, i11);
        }

        public int a() {
            return this.f3686a.o();
        }

        public boolean b() {
            return this.f3686a.A();
        }

        public boolean c() {
            return this.f3686a.x();
        }

        public boolean d() {
            return this.f3686a.v();
        }

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public q(q qVar) {
            super(qVar);
        }
    }

    public static abstract class r {
        public abstract boolean a(int i10, int i11);
    }

    public interface s {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public abstract void b(RecyclerView recyclerView, int i10, int i11);
    }

    public static class u {

        /* renamed from: a  reason: collision with root package name */
        SparseArray f3690a = new SparseArray();

        /* renamed from: b  reason: collision with root package name */
        private int f3691b = 0;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList f3692a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            int f3693b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f3694c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f3695d = 0;

            a() {
            }
        }

        private a g(int i10) {
            a aVar = (a) this.f3690a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3690a.put(i10, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3691b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f3690a.size(); i10++) {
                ((a) this.f3690a.valueAt(i10)).f3692a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f3691b--;
        }

        /* access modifiers changed from: package-private */
        public void d(int i10, long j10) {
            a g10 = g(i10);
            g10.f3695d = j(g10.f3695d, j10);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, long j10) {
            a g10 = g(i10);
            g10.f3694c = j(g10.f3694c, j10);
        }

        public d0 f(int i10) {
            a aVar = (a) this.f3690a.get(i10);
            if (aVar == null || aVar.f3692a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f3692a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((d0) arrayList.get(size)).t()) {
                    return (d0) arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void h(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                c();
            }
            if (!z10 && this.f3691b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int n10 = d0Var.n();
            ArrayList arrayList = g(n10).f3692a;
            if (((a) this.f3690a.get(n10)).f3693b > arrayList.size()) {
                d0Var.F();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        /* access modifiers changed from: package-private */
        public boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f3695d;
            return j12 == 0 || j10 + j12 < j11;
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f3694c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class v {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList f3696a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList f3697b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList f3698c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f3699d;

        /* renamed from: e  reason: collision with root package name */
        private int f3700e;

        /* renamed from: f  reason: collision with root package name */
        int f3701f;

        /* renamed from: g  reason: collision with root package name */
        u f3702g;

        public v() {
            ArrayList arrayList = new ArrayList();
            this.f3696a = arrayList;
            this.f3699d = Collections.unmodifiableList(arrayList);
            this.f3700e = 2;
            this.f3701f = 2;
        }

        private boolean H(d0 d0Var, int i10, int i11, long j10) {
            d0Var.f3640w = null;
            d0Var.f3639v = RecyclerView.this;
            int n10 = d0Var.n();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f3702g.k(n10, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f3572p.a(d0Var, i10);
            this.f3702g.d(d0Var.n(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.f3565l0.e()) {
                return true;
            }
            d0Var.f3628k = i11;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.t0()) {
                View view = d0Var.f3622e;
                if (m0.z(view) == 0) {
                    m0.B0(view, 1);
                }
                k kVar = RecyclerView.this.f3579s0;
                if (kVar != null) {
                    androidx.core.view.a n10 = kVar.n();
                    if (n10 instanceof k.a) {
                        ((k.a) n10).o(view);
                    }
                    m0.q0(view, n10);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.f3622e;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i10) {
            a((d0) this.f3698c.get(i10), true);
            this.f3698c.remove(i10);
        }

        public void B(View view) {
            d0 f02 = RecyclerView.f0(view);
            if (f02.z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f02.y()) {
                f02.M();
            } else if (f02.N()) {
                f02.e();
            }
            C(f02);
            if (RecyclerView.this.Q != null && !f02.w()) {
                RecyclerView.this.Q.j(f02);
            }
        }

        /* access modifiers changed from: package-private */
        public void C(d0 d0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (d0Var.y() || d0Var.f3622e.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(d0Var.y());
                sb2.append(" isAttached:");
                if (d0Var.f3622e.getParent() != null) {
                    z11 = true;
                }
                sb2.append(z11);
                sb2.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb2.toString());
            } else if (d0Var.z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.P());
            } else if (!d0Var.L()) {
                boolean h10 = d0Var.h();
                h hVar = RecyclerView.this.f3572p;
                if ((hVar != null && h10 && hVar.t(d0Var)) || d0Var.w()) {
                    if (this.f3701f <= 0 || d0Var.r(526)) {
                        z10 = false;
                    } else {
                        int size = this.f3698c.size();
                        if (size >= this.f3701f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.I0 && size > 0 && !RecyclerView.this.f3563k0.d(d0Var.f3624g)) {
                            int i10 = size - 1;
                            while (i10 >= 0) {
                                if (!RecyclerView.this.f3563k0.d(((d0) this.f3698c.get(i10)).f3624g)) {
                                    break;
                                }
                                i10--;
                            }
                            size = i10 + 1;
                        }
                        this.f3698c.add(size, d0Var);
                        z10 = true;
                    }
                    if (!z10) {
                        a(d0Var, true);
                    } else {
                        z12 = false;
                    }
                    z11 = z10;
                } else {
                    z12 = false;
                }
                RecyclerView.this.f3560j.q(d0Var);
                if (!z11 && !z12 && h10) {
                    d0Var.f3640w = null;
                    d0Var.f3639v = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            ArrayList arrayList;
            d0 f02 = RecyclerView.f0(view);
            if (!f02.r(12) && f02.A() && !RecyclerView.this.p(f02)) {
                if (this.f3697b == null) {
                    this.f3697b = new ArrayList();
                }
                f02.J(this, true);
                arrayList = this.f3697b;
            } else if (!f02.v() || f02.x() || RecyclerView.this.f3572p.i()) {
                f02.J(this, false);
                arrayList = this.f3696a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
            arrayList.add(f02);
        }

        /* access modifiers changed from: package-private */
        public void E(u uVar) {
            u uVar2 = this.f3702g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f3702g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3702g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(b0 b0Var) {
        }

        public void G(int i10) {
            this.f3700e = i10;
            K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014e  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x017a  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01b8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01d4
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3565l0
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x01d4
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3565l0
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.y()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f3622e
                r5.removeDetachedView(r9, r8)
                r1.M()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.N()
                if (r5 == 0) goto L_0x0057
                r1.e()
            L_0x0057:
                r6.C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x00f5
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f3556h
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x00f7
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f3572p
                int r9 = r9.e()
                if (r5 >= r9) goto L_0x00f7
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f3572p
                int r9 = r9.g(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r10 = r10.f3572p
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r1 = r1.f3572p
                long r10 = r1.f(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f3624g = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.F()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.F0
                if (r1 == 0) goto L_0x00ac
                r6.r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x00f5
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f3702g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.l(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r5 = r2.f3572p
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.c(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.I0
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.f3622e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.V(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3623f = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f3702g
                long r10 = r10 - r0
                r5.e(r9, r10)
                r9 = r2
            L_0x00f3:
                r10 = r4
                goto L_0x012f
            L_0x00f5:
                r9 = r1
                goto L_0x00f3
            L_0x00f7:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f3565l0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012f:
                if (r10 == 0) goto L_0x0167
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3565l0
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x0167
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.r(r0)
                if (r1 == 0) goto L_0x0167
                r9.H(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3565l0
                boolean r0 = r0.f3605k
                if (r0 == 0) goto L_0x0167
                int r0 = androidx.recyclerview.widget.RecyclerView.m.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$m r2 = r1.Q
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3565l0
                java.util.List r4 = r9.q()
                androidx.recyclerview.widget.RecyclerView$m$c r0 = r2.u(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.T0(r9, r0)
            L_0x0167:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3565l0
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x017a
                boolean r0 = r9.u()
                if (r0 == 0) goto L_0x017a
                r9.f3628k = r3
                goto L_0x018d
            L_0x017a:
                boolean r0 = r9.u()
                if (r0 == 0) goto L_0x018f
                boolean r0 = r9.B()
                if (r0 != 0) goto L_0x018f
                boolean r0 = r9.v()
                if (r0 == 0) goto L_0x018d
                goto L_0x018f
            L_0x018d:
                r0 = r8
                goto L_0x01a2
            L_0x018f:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f3556h
                int r2 = r0.m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.H(r1, r2, r3, r4)
            L_0x01a2:
                android.view.View r1 = r9.f3622e
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b8
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x01b0:
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.q) r1
                android.view.View r2 = r9.f3622e
                r2.setLayoutParams(r1)
                goto L_0x01c9
            L_0x01b8:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01c7
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x01b0
            L_0x01c7:
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.q) r1
            L_0x01c9:
                r1.f3686a = r9
                if (r10 == 0) goto L_0x01d0
                if (r0 == 0) goto L_0x01d0
                goto L_0x01d1
            L_0x01d0:
                r7 = r8
            L_0x01d1:
                r1.f3689d = r7
                return r9
            L_0x01d4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f3565l0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        public void J(d0 d0Var) {
            (d0Var.f3636s ? this.f3697b : this.f3696a).remove(d0Var);
            d0Var.f3635r = null;
            d0Var.f3636s = false;
            d0Var.e();
        }

        /* access modifiers changed from: package-private */
        public void K() {
            p pVar = RecyclerView.this.f3574q;
            this.f3701f = this.f3700e + (pVar != null ? pVar.f3674m : 0);
            for (int size = this.f3698c.size() - 1; size >= 0 && this.f3698c.size() > this.f3701f; size--) {
                A(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean L(d0 d0Var) {
            if (d0Var.x()) {
                return RecyclerView.this.f3565l0.e();
            }
            int i10 = d0Var.f3624g;
            if (i10 < 0 || i10 >= RecyclerView.this.f3572p.e()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.P());
            } else if (!RecyclerView.this.f3565l0.e() && RecyclerView.this.f3572p.g(d0Var.f3624g) != d0Var.n()) {
                return false;
            } else {
                if (RecyclerView.this.f3572p.i()) {
                    return d0Var.m() == RecyclerView.this.f3572p.f(d0Var.f3624g);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3698c.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f3698c.get(size);
                if (d0Var != null && (i12 = d0Var.f3624g) >= i10 && i12 < i13) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(d0 d0Var, boolean z10) {
            RecyclerView.r(d0Var);
            View view = d0Var.f3622e;
            k kVar = RecyclerView.this.f3579s0;
            if (kVar != null) {
                androidx.core.view.a n10 = kVar.n();
                m0.q0(view, n10 instanceof k.a ? ((k.a) n10).n(view) : null);
            }
            if (z10) {
                g(d0Var);
            }
            d0Var.f3640w = null;
            d0Var.f3639v = null;
            i().i(d0Var);
        }

        public void c() {
            this.f3696a.clear();
            z();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.f3698c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) this.f3698c.get(i10)).c();
            }
            int size2 = this.f3696a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((d0) this.f3696a.get(i11)).c();
            }
            ArrayList arrayList = this.f3697b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((d0) this.f3697b.get(i12)).c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f3696a.clear();
            ArrayList arrayList = this.f3697b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f3565l0.b()) {
                return !RecyclerView.this.f3565l0.e() ? i10 : RecyclerView.this.f3556h.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f3565l0.b() + RecyclerView.this.P());
        }

        /* access modifiers changed from: package-private */
        public void g(d0 d0Var) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f3576r.size() <= 0) {
                h hVar = RecyclerView.this.f3572p;
                if (hVar != null) {
                    hVar.w(d0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f3565l0 != null) {
                    recyclerView.f3560j.q(d0Var);
                    return;
                }
                return;
            }
            android.support.v4.media.session.b.a(RecyclerView.this.f3576r.get(0));
            throw null;
        }

        /* access modifiers changed from: package-private */
        public d0 h(int i10) {
            int size;
            int m10;
            ArrayList arrayList = this.f3697b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    d0 d0Var = (d0) this.f3697b.get(i12);
                    if (d0Var.N() || d0Var.o() != i10) {
                        i12++;
                    } else {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f3572p.i() && (m10 = RecyclerView.this.f3556h.m(i10)) > 0 && m10 < RecyclerView.this.f3572p.e()) {
                    long f10 = RecyclerView.this.f3572p.f(m10);
                    while (i11 < size) {
                        d0 d0Var2 = (d0) this.f3697b.get(i11);
                        if (d0Var2.N() || d0Var2.m() != f10) {
                            i11++;
                        } else {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public u i() {
            if (this.f3702g == null) {
                this.f3702g = new u();
            }
            return this.f3702g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f3696a.size();
        }

        public List k() {
            return this.f3699d;
        }

        /* access modifiers changed from: package-private */
        public d0 l(long j10, int i10, boolean z10) {
            for (int size = this.f3696a.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f3696a.get(size);
                if (d0Var.m() == j10 && !d0Var.N()) {
                    if (i10 == d0Var.n()) {
                        d0Var.b(32);
                        if (d0Var.x() && !RecyclerView.this.f3565l0.e()) {
                            d0Var.H(2, 14);
                        }
                        return d0Var;
                    } else if (!z10) {
                        this.f3696a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f3622e, false);
                        y(d0Var.f3622e);
                    }
                }
            }
            int size2 = this.f3698c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = (d0) this.f3698c.get(size2);
                if (d0Var2.m() == j10 && !d0Var2.t()) {
                    if (i10 == d0Var2.n()) {
                        if (!z10) {
                            this.f3698c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z10) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public d0 m(int i10, boolean z10) {
            View e10;
            int size = this.f3696a.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                d0 d0Var = (d0) this.f3696a.get(i12);
                if (d0Var.N() || d0Var.o() != i10 || d0Var.v() || (!RecyclerView.this.f3565l0.f3602h && d0Var.x())) {
                    i12++;
                } else {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z10 || (e10 = RecyclerView.this.f3558i.e(i10)) == null) {
                int size2 = this.f3698c.size();
                while (i11 < size2) {
                    d0 d0Var2 = (d0) this.f3698c.get(i11);
                    if (d0Var2.v() || d0Var2.o() != i10 || d0Var2.t()) {
                        i11++;
                    } else {
                        if (!z10) {
                            this.f3698c.remove(i11);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 f02 = RecyclerView.f0(e10);
            RecyclerView.this.f3558i.s(e10);
            int m10 = RecyclerView.this.f3558i.m(e10);
            if (m10 != -1) {
                RecyclerView.this.f3558i.d(m10);
                D(e10);
                f02.b(8224);
                return f02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f02 + RecyclerView.this.P());
        }

        /* access modifiers changed from: package-private */
        public View n(int i10) {
            return ((d0) this.f3696a.get(i10)).f3622e;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i10, boolean z10) {
            return I(i10, z10, Long.MAX_VALUE).f3622e;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f3698c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((d0) this.f3698c.get(i10)).f3622e.getLayoutParams();
                if (qVar != null) {
                    qVar.f3688c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.f3698c.size();
            for (int i10 = 0; i10 < size; i10++) {
                d0 d0Var = (d0) this.f3698c.get(i10);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a((Object) null);
                }
            }
            h hVar = RecyclerView.this.f3572p;
            if (hVar == null || !hVar.i()) {
                z();
            }
        }

        /* access modifiers changed from: package-private */
        public void u(int i10, int i11) {
            int size = this.f3698c.size();
            for (int i12 = 0; i12 < size; i12++) {
                d0 d0Var = (d0) this.f3698c.get(i12);
                if (d0Var != null && d0Var.f3624g >= i10) {
                    d0Var.C(i11, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i14 = -1;
                i13 = i10;
                i12 = i11;
            } else {
                i14 = 1;
                i12 = i10;
                i13 = i11;
            }
            int size = this.f3698c.size();
            for (int i16 = 0; i16 < size; i16++) {
                d0 d0Var = (d0) this.f3698c.get(i16);
                if (d0Var != null && (i15 = d0Var.f3624g) >= i13 && i15 <= i12) {
                    if (i15 == i10) {
                        d0Var.C(i11 - i10, false);
                    } else {
                        d0Var.C(i14, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f3698c.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f3698c.get(size);
                if (d0Var != null) {
                    int i13 = d0Var.f3624g;
                    if (i13 >= i12) {
                        d0Var.C(-i11, z10);
                    } else if (i13 >= i10) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(h hVar, h hVar2, boolean z10) {
            c();
            i().h(hVar, hVar2, z10);
        }

        /* access modifiers changed from: package-private */
        public void y(View view) {
            d0 f02 = RecyclerView.f0(view);
            f02.f3635r = null;
            f02.f3636s = false;
            f02.e();
            C(f02);
        }

        /* access modifiers changed from: package-private */
        public void z() {
            for (int size = this.f3698c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f3698c.clear();
            if (RecyclerView.I0) {
                RecyclerView.this.f3563k0.b();
            }
        }
    }

    public interface w {
    }

    private class x extends j {
        x() {
        }

        public void a() {
            RecyclerView.this.o((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3565l0.f3601g = true;
            recyclerView.R0(true);
            if (!RecyclerView.this.f3556h.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.o((String) null);
            if (RecyclerView.this.f3556h.r(i10, i11, obj)) {
                e();
            }
        }

        public void d(int i10, int i11) {
            RecyclerView.this.o((String) null);
            if (RecyclerView.this.f3556h.s(i10, i11)) {
                e();
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (RecyclerView.H0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f3586w && recyclerView.f3584v) {
                    m0.i0(recyclerView, recyclerView.f3564l);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.E = true;
            recyclerView2.requestLayout();
        }
    }

    public static class y extends b0.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        Parcelable f3705g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            /* renamed from: c */
            public y[] newArray(int i10) {
                return new y[i10];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3705g = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void d(y yVar) {
            this.f3705g = yVar.f3705g;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3705g, 0);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static abstract class z {

        /* renamed from: a  reason: collision with root package name */
        private int f3706a = -1;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f3707b;

        /* renamed from: c  reason: collision with root package name */
        private p f3708c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3709d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3710e;

        /* renamed from: f  reason: collision with root package name */
        private View f3711f;

        /* renamed from: g  reason: collision with root package name */
        private final a f3712g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        private boolean f3713h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f3714a;

            /* renamed from: b  reason: collision with root package name */
            private int f3715b;

            /* renamed from: c  reason: collision with root package name */
            private int f3716c;

            /* renamed from: d  reason: collision with root package name */
            private int f3717d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f3718e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f3719f;

            /* renamed from: g  reason: collision with root package name */
            private int f3720g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, (Interpolator) null);
            }

            private void e() {
                if (this.f3718e != null && this.f3716c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3716c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                return this.f3717d >= 0;
            }

            public void b(int i10) {
                this.f3717d = i10;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i10 = this.f3717d;
                if (i10 >= 0) {
                    this.f3717d = -1;
                    recyclerView.x0(i10);
                    this.f3719f = false;
                } else if (this.f3719f) {
                    e();
                    recyclerView.f3559i0.e(this.f3714a, this.f3715b, this.f3716c, this.f3718e);
                    int i11 = this.f3720g + 1;
                    this.f3720g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3719f = false;
                } else {
                    this.f3720g = 0;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3714a = i10;
                this.f3715b = i11;
                this.f3716c = i12;
                this.f3718e = interpolator;
                this.f3719f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3717d = -1;
                this.f3719f = false;
                this.f3720g = 0;
                this.f3714a = i10;
                this.f3715b = i11;
                this.f3716c = i12;
                this.f3718e = interpolator;
            }
        }

        public interface b {
            PointF d(int i10);
        }

        public PointF a(int i10) {
            p e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).d(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f3707b.f3574q.H(i10);
        }

        public int c() {
            return this.f3707b.f3574q.O();
        }

        public int d(View view) {
            return this.f3707b.d0(view);
        }

        public p e() {
            return this.f3708c;
        }

        public int f() {
            return this.f3706a;
        }

        public boolean g() {
            return this.f3709d;
        }

        public boolean h() {
            return this.f3710e;
        }

        /* access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f3707b;
            if (this.f3706a == -1 || recyclerView == null) {
                r();
            }
            if (this.f3709d && this.f3711f == null && this.f3708c != null && (a10 = a(this.f3706a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.i1((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            this.f3709d = false;
            View view = this.f3711f;
            if (view != null) {
                if (d(view) == this.f3706a) {
                    o(this.f3711f, recyclerView.f3565l0, this.f3712g);
                    this.f3712g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3711f = null;
                }
            }
            if (this.f3710e) {
                l(i10, i11, recyclerView.f3565l0, this.f3712g);
                boolean a11 = this.f3712g.a();
                this.f3712g.c(recyclerView);
                if (a11 && this.f3710e) {
                    this.f3709d = true;
                    recyclerView.f3559i0.d();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k(View view) {
            if (d(view) == f()) {
                this.f3711f = view;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i10, int i11, a0 a0Var, a aVar);

        /* access modifiers changed from: protected */
        public abstract void m();

        /* access modifiers changed from: protected */
        public abstract void n();

        /* access modifiers changed from: protected */
        public abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i10) {
            this.f3706a = i10;
        }

        /* access modifiers changed from: package-private */
        public void q(RecyclerView recyclerView, p pVar) {
            recyclerView.f3559i0.f();
            if (this.f3713h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3707b = recyclerView;
            this.f3708c = pVar;
            int i10 = this.f3706a;
            if (i10 != -1) {
                recyclerView.f3565l0.f3595a = i10;
                this.f3710e = true;
                this.f3709d = true;
                this.f3711f = b(f());
                m();
                this.f3707b.f3559i0.d();
                this.f3713h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void r() {
            if (this.f3710e) {
                this.f3710e = false;
                n();
                this.f3707b.f3565l0.f3595a = -1;
                this.f3711f = null;
                this.f3706a = -1;
                this.f3709d = false;
                this.f3708c.l1(this);
                this.f3708c = null;
                this.f3707b = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        L0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x0.a.recyclerViewStyle);
    }

    private void A() {
        int i10 = this.D;
        this.D = 0;
        if (i10 != 0 && t0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            androidx.core.view.accessibility.b.b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void A0(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.f3574q;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.B) {
            int[] iArr = this.f3589x0;
            int i13 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean p10 = pVar.p();
            boolean q10 = this.f3574q.q();
            t1(q10 ? p10 | true : p10 ? 1 : 0, i12);
            if (F(p10 ? i10 : 0, q10 ? i11 : 0, this.f3589x0, this.f3585v0, i12)) {
                int[] iArr2 = this.f3589x0;
                i10 -= iArr2[0];
                i11 -= iArr2[1];
            }
            int i14 = p10 ? i10 : 0;
            if (q10) {
                i13 = i11;
            }
            h1(i14, i13, motionEvent, i12);
            e eVar = this.f3561j0;
            if (!(eVar == null || (i10 == 0 && i11 == 0))) {
                eVar.f(this, i10, i11);
            }
            v1(i12);
        }
    }

    private void C() {
        boolean z10 = true;
        this.f3565l0.a(1);
        Q(this.f3565l0);
        this.f3565l0.f3604j = false;
        s1();
        this.f3560j.f();
        I0();
        Q0();
        f1();
        a0 a0Var = this.f3565l0;
        if (!a0Var.f3605k || !this.f3573p0) {
            z10 = false;
        }
        a0Var.f3603i = z10;
        this.f3573p0 = false;
        this.f3571o0 = false;
        a0Var.f3602h = a0Var.f3606l;
        a0Var.f3600f = this.f3572p.e();
        U(this.f3581t0);
        if (this.f3565l0.f3605k) {
            int g10 = this.f3558i.g();
            for (int i10 = 0; i10 < g10; i10++) {
                d0 f02 = f0(this.f3558i.f(i10));
                if (!f02.L() && (!f02.v() || this.f3572p.i())) {
                    this.f3560j.e(f02, this.Q.u(this.f3565l0, f02, m.e(f02), f02.q()));
                    if (this.f3565l0.f3603i && f02.A() && !f02.x() && !f02.L() && !f02.v()) {
                        this.f3560j.c(c0(f02), f02);
                    }
                }
            }
        }
        if (this.f3565l0.f3606l) {
            g1();
            a0 a0Var2 = this.f3565l0;
            boolean z11 = a0Var2.f3601g;
            a0Var2.f3601g = false;
            this.f3574q.d1(this.f3552f, a0Var2);
            this.f3565l0.f3601g = z11;
            for (int i11 = 0; i11 < this.f3558i.g(); i11++) {
                d0 f03 = f0(this.f3558i.f(i11));
                if (!f03.L() && !this.f3560j.i(f03)) {
                    int e10 = m.e(f03);
                    boolean r10 = f03.r(8192);
                    if (!r10) {
                        e10 |= 4096;
                    }
                    m.c u10 = this.Q.u(this.f3565l0, f03, e10, f03.q());
                    if (r10) {
                        T0(f03, u10);
                    } else {
                        this.f3560j.a(f03, u10);
                    }
                }
            }
        }
        s();
        J0();
        u1(false);
        this.f3565l0.f3599e = 2;
    }

    private void D() {
        s1();
        I0();
        this.f3565l0.a(6);
        this.f3556h.j();
        this.f3565l0.f3600f = this.f3572p.e();
        this.f3565l0.f3598d = 0;
        if (this.f3554g != null && this.f3572p.b()) {
            Parcelable parcelable = this.f3554g.f3705g;
            if (parcelable != null) {
                this.f3574q.i1(parcelable);
            }
            this.f3554g = null;
        }
        a0 a0Var = this.f3565l0;
        a0Var.f3602h = false;
        this.f3574q.d1(this.f3552f, a0Var);
        a0 a0Var2 = this.f3565l0;
        a0Var2.f3601g = false;
        a0Var2.f3605k = a0Var2.f3605k && this.Q != null;
        a0Var2.f3599e = 4;
        J0();
        u1(false);
    }

    private void E() {
        this.f3565l0.a(4);
        s1();
        I0();
        a0 a0Var = this.f3565l0;
        a0Var.f3599e = 1;
        if (a0Var.f3605k) {
            for (int g10 = this.f3558i.g() - 1; g10 >= 0; g10--) {
                d0 f02 = f0(this.f3558i.f(g10));
                if (!f02.L()) {
                    long c02 = c0(f02);
                    m.c t10 = this.Q.t(this.f3565l0, f02);
                    d0 g11 = this.f3560j.g(c02);
                    if (g11 != null && !g11.L()) {
                        boolean h10 = this.f3560j.h(g11);
                        boolean h11 = this.f3560j.h(f02);
                        if (!h10 || g11 != f02) {
                            m.c n10 = this.f3560j.n(g11);
                            this.f3560j.d(f02, t10);
                            m.c m10 = this.f3560j.m(f02);
                            if (n10 == null) {
                                k0(c02, f02, g11);
                            } else {
                                m(g11, f02, n10, m10, h10, h11);
                            }
                        }
                    }
                    this.f3560j.d(f02, t10);
                }
            }
            this.f3560j.o(this.D0);
        }
        this.f3574q.r1(this.f3552f);
        a0 a0Var2 = this.f3565l0;
        a0Var2.f3597c = a0Var2.f3600f;
        this.H = false;
        this.I = false;
        a0Var2.f3605k = false;
        a0Var2.f3606l = false;
        this.f3574q.f3669h = false;
        ArrayList arrayList = this.f3552f.f3697b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.f3574q;
        if (pVar.f3675n) {
            pVar.f3674m = 0;
            pVar.f3675n = false;
            this.f3552f.K();
        }
        this.f3574q.e1(this.f3565l0);
        J0();
        u1(false);
        this.f3560j.f();
        int[] iArr = this.f3581t0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        U0();
        d1();
    }

    private boolean K(MotionEvent motionEvent) {
        s sVar = this.f3582u;
        if (sVar != null) {
            sVar.b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f3582u = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return T(motionEvent);
        }
    }

    private void L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.W = x10;
            this.U = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f3546a0 = y10;
            this.V = y10;
        }
    }

    private boolean P0() {
        return this.Q != null && this.f3574q.R1();
    }

    private void Q0() {
        boolean z10;
        if (this.H) {
            this.f3556h.w();
            if (this.I) {
                this.f3574q.Y0(this);
            }
        }
        if (P0()) {
            this.f3556h.u();
        } else {
            this.f3556h.j();
        }
        boolean z11 = true;
        boolean z12 = this.f3571o0 || this.f3573p0;
        this.f3565l0.f3605k = this.f3590y && this.Q != null && ((z10 = this.H) || z12 || this.f3574q.f3669h) && (!z10 || this.f3572p.i());
        a0 a0Var = this.f3565l0;
        if (!a0Var.f3605k || !z12 || this.H || !P0()) {
            z11 = false;
        }
        a0Var.f3606l = z11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void S0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 >= 0) goto L_0x0020
            r6.M()
            android.widget.EdgeEffect r1 = r6.M
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r3 - r9
        L_0x001c:
            androidx.core.widget.d.c(r1, r4, r9)
            goto L_0x0038
        L_0x0020:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0037
            r6.N()
            android.widget.EdgeEffect r1 = r6.O
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0037:
            r2 = 0
        L_0x0038:
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0052
            r6.O()
            android.widget.EdgeEffect r8 = r6.N
            float r9 = -r10
            int r10 = r6.getHeight()
            float r10 = (float) r10
            float r9 = r9 / r10
            int r10 = r6.getWidth()
            float r10 = (float) r10
            float r7 = r7 / r10
            androidx.core.widget.d.c(r8, r9, r7)
            goto L_0x0076
        L_0x0052:
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x006c
            r6.L()
            android.widget.EdgeEffect r8 = r6.P
            int r9 = r6.getHeight()
            float r9 = (float) r9
            float r10 = r10 / r9
            int r9 = r6.getWidth()
            float r9 = (float) r9
            float r7 = r7 / r9
            float r3 = r3 - r7
            androidx.core.widget.d.c(r8, r10, r3)
            goto L_0x0076
        L_0x006c:
            if (r2 != 0) goto L_0x0076
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0076
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0079
        L_0x0076:
            androidx.core.view.m0.h0(r6)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S0(float, float, float, float):void");
    }

    private boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3580t.size();
        int i10 = 0;
        while (i10 < size) {
            s sVar = (s) this.f3580t.get(i10);
            if (!sVar.a(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.f3582u = sVar;
                return true;
            }
        }
        return false;
    }

    private void U(int[] iArr) {
        int g10 = this.f3558i.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < g10; i12++) {
            d0 f02 = f0(this.f3558i.f(i12));
            if (!f02.L()) {
                int o10 = f02.o();
                if (o10 < i10) {
                    i10 = o10;
                }
                if (o10 > i11) {
                    i11 = o10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    private void U0() {
        View findViewById;
        if (this.f3557h0 && this.f3572p != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!K0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f3558i.n(focusedChild)) {
                            return;
                        }
                    } else if (this.f3558i.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                d0 Y = (this.f3565l0.f3608n == -1 || !this.f3572p.i()) ? null : Y(this.f3565l0.f3608n);
                if (Y != null && !this.f3558i.n(Y.f3622e) && Y.f3622e.hasFocusable()) {
                    view = Y.f3622e;
                } else if (this.f3558i.g() > 0) {
                    view = W();
                }
                if (view != null) {
                    int i10 = this.f3565l0.f3609o;
                    if (!(((long) i10) == -1 || (findViewById = view.findViewById(i10)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView V2 = V(viewGroup.getChildAt(i10));
            if (V2 != null) {
                return V2;
            }
        }
        return null;
    }

    private void V0() {
        boolean z10;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.M.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.P.isFinished();
        }
        if (z10) {
            m0.h0(this);
        }
    }

    private View W() {
        d0 X;
        a0 a0Var = this.f3565l0;
        int i10 = a0Var.f3607m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = a0Var.b();
        int i11 = i10;
        while (i11 < b10) {
            d0 X2 = X(i11);
            if (X2 == null) {
                break;
            } else if (X2.f3622e.hasFocusable()) {
                return X2.f3622e;
            } else {
                i11++;
            }
        }
        int min = Math.min(b10, i10);
        while (true) {
            min--;
            if (min < 0 || (X = X(min)) == null) {
                return null;
            }
            if (X.f3622e.hasFocusable()) {
                return X.f3622e;
            }
        }
    }

    private void c1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3566m.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f3688c) {
                Rect rect = qVar.f3687b;
                Rect rect2 = this.f3566m;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3566m);
            offsetRectIntoDescendantCoords(view, this.f3566m);
        }
        this.f3574q.y1(this, view, this.f3566m, !this.f3590y, view2 == null);
    }

    private void d1() {
        a0 a0Var = this.f3565l0;
        a0Var.f3608n = -1;
        a0Var.f3607m = -1;
        a0Var.f3609o = -1;
    }

    private void e1() {
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        v1(0);
        V0();
    }

    static d0 f0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f3686a;
    }

    private void f1() {
        d0 d0Var = null;
        View focusedChild = (!this.f3557h0 || !hasFocus() || this.f3572p == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = S(focusedChild);
        }
        if (d0Var == null) {
            d1();
            return;
        }
        this.f3565l0.f3608n = this.f3572p.i() ? d0Var.m() : -1;
        this.f3565l0.f3607m = this.H ? -1 : d0Var.x() ? d0Var.f3625h : d0Var.j();
        this.f3565l0.f3609o = h0(d0Var.f3622e);
    }

    private void g(d0 d0Var) {
        View view = d0Var.f3622e;
        boolean z10 = view.getParent() == this;
        this.f3552f.J(e0(view));
        if (d0Var.z()) {
            this.f3558i.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        b bVar = this.f3558i;
        if (!z10) {
            bVar.b(view, true);
        } else {
            bVar.k(view);
        }
    }

    static void g0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f3687b;
        rect.set((view.getLeft() - rect2.left) - qVar.leftMargin, (view.getTop() - rect2.top) - qVar.topMargin, view.getRight() + rect2.right + qVar.rightMargin, view.getBottom() + rect2.bottom + qVar.bottomMargin);
    }

    private androidx.core.view.y getScrollingChildHelper() {
        if (this.f3583u0 == null) {
            this.f3583u0 = new androidx.core.view.y(this);
        }
        return this.f3583u0;
    }

    private int h0(View view) {
        int id2;
        loop0:
        while (true) {
            id2 = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id2;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id2;
    }

    private String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private void k0(long j10, d0 d0Var, d0 d0Var2) {
        int g10 = this.f3558i.g();
        for (int i10 = 0; i10 < g10; i10++) {
            d0 f02 = f0(this.f3558i.f(i10));
            if (f02 != d0Var && c0(f02) == j10) {
                h hVar = this.f3572p;
                if (hVar == null || !hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f02 + " \n View Holder 2:" + d0Var + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f02 + " \n View Holder 2:" + d0Var + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + P());
    }

    private void k1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f3572p;
        if (hVar2 != null) {
            hVar2.z(this.f3550e);
            this.f3572p.s(this);
        }
        if (!z10 || z11) {
            W0();
        }
        this.f3556h.w();
        h hVar3 = this.f3572p;
        this.f3572p = hVar;
        if (hVar != null) {
            hVar.x(this.f3550e);
            hVar.o(this);
        }
        p pVar = this.f3574q;
        if (pVar != null) {
            pVar.K0(hVar3, this.f3572p);
        }
        this.f3552f.x(hVar3, this.f3572p, z10);
        this.f3565l0.f3601g = true;
    }

    private void m(d0 d0Var, d0 d0Var2, m.c cVar, m.c cVar2, boolean z10, boolean z11) {
        d0Var.I(false);
        if (z10) {
            g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z11) {
                g(d0Var2);
            }
            d0Var.f3629l = d0Var2;
            g(d0Var);
            this.f3552f.J(d0Var);
            d0Var2.I(false);
            d0Var2.f3630m = d0Var;
        }
        if (this.Q.b(d0Var, d0Var2, cVar, cVar2)) {
            O0();
        }
    }

    private boolean n0() {
        int g10 = this.f3558i.g();
        for (int i10 = 0; i10 < g10; i10++) {
            d0 f02 = f0(this.f3558i.f(i10));
            if (f02 != null && !f02.L() && f02.A()) {
                return true;
            }
        }
        return false;
    }

    private void p0() {
        if (m0.A(this) == 0) {
            m0.D0(this, 8);
        }
    }

    private void q() {
        e1();
        setScrollState(0);
    }

    private void q0() {
        this.f3558i = new b(new e());
    }

    static void r(d0 d0Var) {
        WeakReference weakReference = d0Var.f3623f;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        d0Var.f3623f = null;
                        return;
                    } else if (view != d0Var.f3622e) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void v(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String i02 = i0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(i02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                    try {
                        constructor = asSubclass.getConstructor(L0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(e10);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + i02, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + i02, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i02, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i02, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + i02, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + i02, e16);
                }
            }
        }
    }

    private boolean w0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.f3566m.set(0, 0, view.getWidth(), view.getHeight());
        this.f3568n.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3566m);
        offsetDescendantRectToMyCoords(view2, this.f3568n);
        char c10 = 65535;
        int i12 = this.f3574q.d0() == 1 ? -1 : 1;
        Rect rect = this.f3566m;
        int i13 = rect.left;
        Rect rect2 = this.f3568n;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + P());
    }

    private boolean x(int i10, int i11) {
        U(this.f3581t0);
        int[] iArr = this.f3581t0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void x1() {
        this.f3559i0.f();
        p pVar = this.f3574q;
        if (pVar != null) {
            pVar.Q1();
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        if (this.f3572p == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f3574q == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f3565l0.f3604j = false;
            boolean z10 = this.A0 && !(this.B0 == getWidth() && this.C0 == getHeight());
            this.B0 = 0;
            this.C0 = 0;
            this.A0 = false;
            if (this.f3565l0.f3599e == 1) {
                C();
            } else if (!this.f3556h.q() && !z10 && this.f3574q.u0() == getWidth() && this.f3574q.b0() == getHeight()) {
                this.f3574q.F1(this);
                E();
            }
            this.f3574q.F1(this);
            D();
            E();
        }
    }

    public void B0(int i10) {
        int g10 = this.f3558i.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f3558i.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void C0(int i10) {
        int g10 = this.f3558i.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f3558i.f(i11).offsetTopAndBottom(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void D0(int i10, int i11) {
        int j10 = this.f3558i.j();
        for (int i12 = 0; i12 < j10; i12++) {
            d0 f02 = f0(this.f3558i.i(i12));
            if (f02 != null && !f02.L() && f02.f3624g >= i10) {
                f02.C(i11, false);
                this.f3565l0.f3601g = true;
            }
        }
        this.f3552f.u(i10, i11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void E0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.f3558i.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            d0 f02 = f0(this.f3558i.i(i16));
            if (f02 != null && (i15 = f02.f3624g) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    f02.C(i11 - i10, false);
                } else {
                    f02.C(i14, false);
                }
                this.f3565l0.f3601g = true;
            }
        }
        this.f3552f.v(i10, i11);
        requestLayout();
    }

    public boolean F(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    /* access modifiers changed from: package-private */
    public void F0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.f3558i.j();
        for (int i13 = 0; i13 < j10; i13++) {
            d0 f02 = f0(this.f3558i.i(i13));
            if (f02 != null && !f02.L()) {
                int i14 = f02.f3624g;
                if (i14 >= i12) {
                    f02.C(-i11, z10);
                } else if (i14 >= i10) {
                    f02.i(i10 - 1, -i11, z10);
                }
                this.f3565l0.f3601g = true;
            }
        }
        this.f3552f.w(i10, i11, z10);
        requestLayout();
    }

    public final void G(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void G0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void H(int i10) {
        p pVar = this.f3574q;
        if (pVar != null) {
            pVar.k1(i10);
        }
        M0(i10);
        t tVar = this.f3567m0;
        if (tVar != null) {
            tVar.a(this, i10);
        }
        List list = this.f3569n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f3569n0.get(size)).a(this, i10);
            }
        }
    }

    public void H0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void I(int i10, int i11) {
        this.K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        N0(i10, i11);
        t tVar = this.f3567m0;
        if (tVar != null) {
            tVar.b(this, i10, i11);
        }
        List list = this.f3569n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f3569n0.get(size)).b(this, i10, i11);
            }
        }
        this.K--;
    }

    /* access modifiers changed from: package-private */
    public void I0() {
        this.J++;
    }

    /* access modifiers changed from: package-private */
    public void J() {
        int i10;
        for (int size = this.f3591y0.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) this.f3591y0.get(size);
            if (d0Var.f3622e.getParent() == this && !d0Var.L() && (i10 = d0Var.f3638u) != -1) {
                m0.B0(d0Var.f3622e, i10);
                d0Var.f3638u = -1;
            }
        }
        this.f3591y0.clear();
    }

    /* access modifiers changed from: package-private */
    public void J0() {
        K0(true);
    }

    /* access modifiers changed from: package-private */
    public void K0(boolean z10) {
        int i10 = this.J - 1;
        this.J = i10;
        if (i10 < 1) {
            this.J = 0;
            if (z10) {
                A();
                J();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void L() {
        int measuredWidth;
        int measuredHeight;
        if (this.P == null) {
            EdgeEffect a10 = this.L.a(this, 3);
            this.P = a10;
            if (this.f3562k) {
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
            }
            a10.setSize(measuredWidth, measuredHeight);
        }
    }

    /* access modifiers changed from: package-private */
    public void M() {
        int measuredHeight;
        int measuredWidth;
        if (this.M == null) {
            EdgeEffect a10 = this.L.a(this, 0);
            this.M = a10;
            if (this.f3562k) {
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredHeight = getMeasuredHeight();
                measuredWidth = getMeasuredWidth();
            }
            a10.setSize(measuredHeight, measuredWidth);
        }
    }

    public void M0(int i10) {
    }

    /* access modifiers changed from: package-private */
    public void N() {
        int measuredHeight;
        int measuredWidth;
        if (this.O == null) {
            EdgeEffect a10 = this.L.a(this, 2);
            this.O = a10;
            if (this.f3562k) {
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredHeight = getMeasuredHeight();
                measuredWidth = getMeasuredWidth();
            }
            a10.setSize(measuredHeight, measuredWidth);
        }
    }

    public void N0(int i10, int i11) {
    }

    /* access modifiers changed from: package-private */
    public void O() {
        int measuredWidth;
        int measuredHeight;
        if (this.N == null) {
            EdgeEffect a10 = this.L.a(this, 1);
            this.N = a10;
            if (this.f3562k) {
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
            }
            a10.setSize(measuredWidth, measuredHeight);
        }
    }

    /* access modifiers changed from: package-private */
    public void O0() {
        if (!this.f3577r0 && this.f3584v) {
            m0.i0(this, this.f3593z0);
            this.f3577r0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    public String P() {
        return " " + super.toString() + ", adapter:" + this.f3572p + ", layout:" + this.f3574q + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void Q(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3559i0.f3615g;
            a0Var.f3610p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3611q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f3610p = 0;
        a0Var.f3611q = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View R(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.R(android.view.View):android.view.View");
    }

    /* access modifiers changed from: package-private */
    public void R0(boolean z10) {
        this.I = z10 | this.I;
        this.H = true;
        z0();
    }

    public d0 S(View view) {
        View R2 = R(view);
        if (R2 == null) {
            return null;
        }
        return e0(R2);
    }

    /* access modifiers changed from: package-private */
    public void T0(d0 d0Var, m.c cVar) {
        d0Var.H(0, 8192);
        if (this.f3565l0.f3603i && d0Var.A() && !d0Var.x() && !d0Var.L()) {
            this.f3560j.c(c0(d0Var), d0Var);
        }
        this.f3560j.e(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void W0() {
        m mVar = this.Q;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f3574q;
        if (pVar != null) {
            pVar.q1(this.f3552f);
            this.f3574q.r1(this.f3552f);
        }
        this.f3552f.c();
    }

    public d0 X(int i10) {
        d0 d0Var = null;
        if (this.H) {
            return null;
        }
        int j10 = this.f3558i.j();
        for (int i11 = 0; i11 < j10; i11++) {
            d0 f02 = f0(this.f3558i.i(i11));
            if (f02 != null && !f02.x() && b0(f02) == i10) {
                if (!this.f3558i.n(f02.f3622e)) {
                    return f02;
                }
                d0Var = f02;
            }
        }
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    public boolean X0(View view) {
        s1();
        boolean r10 = this.f3558i.r(view);
        if (r10) {
            d0 f02 = f0(view);
            this.f3552f.J(f02);
            this.f3552f.C(f02);
        }
        u1(!r10);
        return r10;
    }

    public d0 Y(long j10) {
        h hVar = this.f3572p;
        d0 d0Var = null;
        if (hVar != null && hVar.i()) {
            int j11 = this.f3558i.j();
            for (int i10 = 0; i10 < j11; i10++) {
                d0 f02 = f0(this.f3558i.i(i10));
                if (f02 != null && !f02.x() && f02.m() == j10) {
                    if (!this.f3558i.n(f02.f3622e)) {
                        return f02;
                    }
                    d0Var = f02;
                }
            }
        }
        return d0Var;
    }

    public void Y0(o oVar) {
        p pVar = this.f3574q;
        if (pVar != null) {
            pVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3578s.remove(oVar);
        if (this.f3578s.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        y0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public d0 Z(int i10, boolean z10) {
        int j10 = this.f3558i.j();
        d0 d0Var = null;
        for (int i11 = 0; i11 < j10; i11++) {
            d0 f02 = f0(this.f3558i.i(i11));
            if (f02 != null && !f02.x()) {
                if (z10) {
                    if (f02.f3624g != i10) {
                        continue;
                    }
                } else if (f02.o() != i10) {
                    continue;
                }
                if (!this.f3558i.n(f02.f3622e)) {
                    return f02;
                }
                d0Var = f02;
            }
        }
        return d0Var;
    }

    public void Z0(s sVar) {
        this.f3580t.remove(sVar);
        if (this.f3582u == sVar) {
            this.f3582u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i10, int i11) {
        if (i10 < 0) {
            M();
            if (this.M.isFinished()) {
                this.M.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            N();
            if (this.O.isFinished()) {
                this.O.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            O();
            if (this.N.isFinished()) {
                this.N.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            L();
            if (this.P.isFinished()) {
                this.P.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            m0.h0(this);
        }
    }

    public boolean a0(int i10, int i11) {
        p pVar = this.f3574q;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.B) {
            return false;
        } else {
            boolean p10 = pVar.p();
            boolean q10 = this.f3574q.q();
            if (!p10 || Math.abs(i10) < this.f3549d0) {
                i10 = 0;
            }
            if (!q10 || Math.abs(i11) < this.f3549d0) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            float f10 = (float) i10;
            float f11 = (float) i11;
            if (!dispatchNestedPreFling(f10, f11)) {
                boolean z10 = p10 || q10;
                dispatchNestedFling(f10, f11, z10);
                r rVar = this.f3548c0;
                if (rVar != null && rVar.a(i10, i11)) {
                    return true;
                }
                if (z10) {
                    if (q10) {
                        p10 |= true;
                    }
                    t1(p10 ? 1 : 0, 1);
                    int i12 = this.f3551e0;
                    int max = Math.max(-i12, Math.min(i10, i12));
                    int i13 = this.f3551e0;
                    this.f3559i0.b(max, Math.max(-i13, Math.min(i11, i13)));
                    return true;
                }
            }
            return false;
        }
    }

    public void a1(t tVar) {
        List list = this.f3569n0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        p pVar = this.f3574q;
        if (pVar == null || !pVar.L0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public int b0(d0 d0Var) {
        if (d0Var.r(524) || !d0Var.u()) {
            return -1;
        }
        return this.f3556h.e(d0Var.f3624g);
    }

    /* access modifiers changed from: package-private */
    public void b1() {
        d0 d0Var;
        int g10 = this.f3558i.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f10 = this.f3558i.f(i10);
            d0 e02 = e0(f10);
            if (!(e02 == null || (d0Var = e02.f3630m) == null)) {
                View view = d0Var.f3622e;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public long c0(d0 d0Var) {
        return this.f3572p.i() ? d0Var.m() : (long) d0Var.f3624g;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f3574q.r((q) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        p pVar = this.f3574q;
        if (pVar != null && pVar.p()) {
            return this.f3574q.v(this.f3565l0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        p pVar = this.f3574q;
        if (pVar != null && pVar.p()) {
            return this.f3574q.w(this.f3565l0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        p pVar = this.f3574q;
        if (pVar != null && pVar.p()) {
            return this.f3574q.x(this.f3565l0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        p pVar = this.f3574q;
        if (pVar != null && pVar.q()) {
            return this.f3574q.y(this.f3565l0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        p pVar = this.f3574q;
        if (pVar != null && pVar.q()) {
            return this.f3574q.z(this.f3565l0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        p pVar = this.f3574q;
        if (pVar != null && pVar.q()) {
            return this.f3574q.A(this.f3565l0);
        }
        return 0;
    }

    public int d0(View view) {
        d0 f02 = f0(view);
        if (f02 != null) {
            return f02.o();
        }
        return -1;
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z10;
        float f10;
        int i10;
        super.draw(canvas);
        int size = this.f3578s.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ((o) this.f3578s.get(i11)).i(canvas, this, this.f3565l0);
        }
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3562k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.M;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3562k) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.N;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3562k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.O;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3562k) {
                f10 = (float) ((-getWidth()) + getPaddingRight());
                i10 = (-getHeight()) + getPaddingBottom();
            } else {
                f10 = (float) (-getWidth());
                i10 = -getHeight();
            }
            canvas.translate(f10, (float) i10);
            EdgeEffect edgeEffect8 = this.P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if ((!z10 && this.Q != null && this.f3578s.size() > 0 && this.Q.p()) || z10) {
            m0.h0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public d0 e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View W0 = this.f3574q.W0(view, i10);
        if (W0 != null) {
            return W0;
        }
        boolean z11 = true;
        boolean z12 = this.f3572p != null && this.f3574q != null && !v0() && !this.B;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z12 || !(i10 == 2 || i10 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i10);
            if (findNextFocus != null || !z12) {
                view2 = findNextFocus;
            } else {
                u();
                if (R(view) == null) {
                    return null;
                }
                s1();
                view2 = this.f3574q.P0(view, i10, this.f3552f, this.f3565l0);
                u1(false);
            }
        } else {
            if (this.f3574q.q()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = instance.findNextFocus(this, view, i11) == null;
                if (J0) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f3574q.p()) {
                int i12 = (this.f3574q.d0() == 1) ^ (i10 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i12) != null) {
                    z11 = false;
                }
                if (J0) {
                    i10 = i12;
                }
                z10 = z11;
            }
            if (z10) {
                u();
                if (R(view) == null) {
                    return null;
                }
                s1();
                this.f3574q.P0(view, i10, this.f3552f, this.f3565l0);
                u1(false);
            }
            view2 = instance.findNextFocus(this, view, i10);
        }
        if (view2 == null || view2.hasFocusable()) {
            return w0(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        c1(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: package-private */
    public void g1() {
        int j10 = this.f3558i.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 f02 = f0(this.f3558i.i(i10));
            if (!f02.L()) {
                f02.G();
            }
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f3574q;
        if (pVar != null) {
            return pVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f3574q;
        if (pVar != null) {
            return pVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f3572p;
    }

    public int getBaseline() {
        p pVar = this.f3574q;
        return pVar != null ? pVar.L() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.f3562k;
    }

    public k getCompatAccessibilityDelegate() {
        return this.f3579s0;
    }

    public l getEdgeEffectFactory() {
        return this.L;
    }

    public m getItemAnimator() {
        return this.Q;
    }

    public int getItemDecorationCount() {
        return this.f3578s.size();
    }

    public p getLayoutManager() {
        return this.f3574q;
    }

    public int getMaxFlingVelocity() {
        return this.f3551e0;
    }

    public int getMinFlingVelocity() {
        return this.f3549d0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (I0) {
            return System.nanoTime();
        }
        return 0;
    }

    public r getOnFlingListener() {
        return this.f3548c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3557h0;
    }

    public u getRecycledViewPool() {
        return this.f3552f.i();
    }

    public int getScrollState() {
        return this.R;
    }

    public void h(o oVar) {
        i(oVar, -1);
    }

    /* access modifiers changed from: package-private */
    public boolean h1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        int i18 = i11;
        MotionEvent motionEvent2 = motionEvent;
        u();
        if (this.f3572p != null) {
            int[] iArr = this.f3589x0;
            iArr[0] = 0;
            iArr[1] = 0;
            i1(i17, i18, iArr);
            int[] iArr2 = this.f3589x0;
            int i19 = iArr2[0];
            int i20 = iArr2[1];
            i16 = i20;
            i15 = i19;
            i14 = i17 - i19;
            i13 = i18 - i20;
        } else {
            i16 = 0;
            i15 = 0;
            i14 = 0;
            i13 = 0;
        }
        if (!this.f3578s.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3589x0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i15, i16, i14, i13, this.f3585v0, i12, iArr3);
        int[] iArr4 = this.f3589x0;
        int i21 = iArr4[0];
        int i22 = i14 - i21;
        int i23 = iArr4[1];
        int i24 = i13 - i23;
        boolean z10 = (i21 == 0 && i23 == 0) ? false : true;
        int i25 = this.W;
        int[] iArr5 = this.f3585v0;
        int i26 = iArr5[0];
        this.W = i25 - i26;
        int i27 = this.f3546a0;
        int i28 = iArr5[1];
        this.f3546a0 = i27 - i28;
        int[] iArr6 = this.f3587w0;
        iArr6[0] = iArr6[0] + i26;
        iArr6[1] = iArr6[1] + i28;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !androidx.core.view.w.a(motionEvent2, 8194)) {
                S0(motionEvent.getX(), (float) i22, motionEvent.getY(), (float) i24);
            }
            t(i10, i11);
        }
        if (!(i15 == 0 && i16 == 0)) {
            I(i15, i16);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i15 == 0 && i16 == 0) ? false : true;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(o oVar, int i10) {
        p pVar = this.f3574q;
        if (pVar != null) {
            pVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3578s.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f3578s.add(oVar);
        } else {
            this.f3578s.add(i10, oVar);
        }
        y0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void i1(int i10, int i11, int[] iArr) {
        s1();
        I0();
        androidx.core.os.l.a("RV Scroll");
        Q(this.f3565l0);
        int C1 = i10 != 0 ? this.f3574q.C1(i10, this.f3552f, this.f3565l0) : 0;
        int E1 = i11 != 0 ? this.f3574q.E1(i11, this.f3552f, this.f3565l0) : 0;
        androidx.core.os.l.b();
        b1();
        J0();
        u1(false);
        if (iArr != null) {
            iArr[0] = C1;
            iArr[1] = E1;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f3584v;
    }

    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        this.f3580t.add(sVar);
    }

    /* access modifiers changed from: package-private */
    public Rect j0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f3688c) {
            return qVar.f3687b;
        }
        if (this.f3565l0.e() && (qVar.b() || qVar.d())) {
            return qVar.f3687b;
        }
        Rect rect = qVar.f3687b;
        rect.set(0, 0, 0, 0);
        int size = this.f3578s.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3566m.set(0, 0, 0, 0);
            ((o) this.f3578s.get(i10)).e(this.f3566m, view, this, this.f3565l0);
            int i11 = rect.left;
            Rect rect2 = this.f3566m;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f3688c = false;
        return rect;
    }

    public void j1(int i10) {
        if (!this.B) {
            w1();
            p pVar = this.f3574q;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            pVar.D1(i10);
            awakenScrollBars();
        }
    }

    public void k(t tVar) {
        if (this.f3569n0 == null) {
            this.f3569n0 = new ArrayList();
        }
        this.f3569n0.add(tVar);
    }

    /* access modifiers changed from: package-private */
    public void l(d0 d0Var, m.c cVar, m.c cVar2) {
        d0Var.I(false);
        if (this.Q.a(d0Var, cVar, cVar2)) {
            O0();
        }
    }

    public boolean l0() {
        return this.f3586w;
    }

    /* access modifiers changed from: package-private */
    public boolean l1(d0 d0Var, int i10) {
        if (v0()) {
            d0Var.f3638u = i10;
            this.f3591y0.add(d0Var);
            return false;
        }
        m0.B0(d0Var.f3622e, i10);
        return true;
    }

    public boolean m0() {
        return !this.f3590y || this.H || this.f3556h.p();
    }

    /* access modifiers changed from: package-private */
    public boolean m1(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (!v0()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
        if (a10 != 0) {
            i10 = a10;
        }
        this.D |= i10;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void n(d0 d0Var, m.c cVar, m.c cVar2) {
        g(d0Var);
        d0Var.I(false);
        if (this.Q.c(d0Var, cVar, cVar2)) {
            O0();
        }
    }

    public void n1(int i10, int i11) {
        o1(i10, i11, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    public void o(String str) {
        if (v0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
            }
            throw new IllegalStateException(str);
        } else if (this.K > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        this.f3556h = new a(new f());
    }

    public void o1(int i10, int i11, Interpolator interpolator) {
        p1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r1 >= 30.0f) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.J = r0
            r1 = 1
            r5.f3584v = r1
            boolean r2 = r5.f3590y
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r5.f3590y = r1
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f3574q
            if (r1 == 0) goto L_0x001e
            r1.E(r5)
        L_0x001e:
            r5.f3577r0 = r0
            boolean r0 = I0
            if (r0 == 0) goto L_0x0061
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f3860i
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f3561j0 = r1
            if (r1 != 0) goto L_0x005c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f3561j0 = r1
            android.view.Display r1 = androidx.core.view.m0.v(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0050:
            androidx.recyclerview.widget.e r2 = r5.f3561j0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3864g = r3
            r0.set(r2)
        L_0x005c:
            androidx.recyclerview.widget.e r0 = r5.f3561j0
            r0.a(r5)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        m mVar = this.Q;
        if (mVar != null) {
            mVar.k();
        }
        w1();
        this.f3584v = false;
        p pVar = this.f3574q;
        if (pVar != null) {
            pVar.F(this, this.f3552f);
        }
        this.f3591y0.clear();
        removeCallbacks(this.f3593z0);
        this.f3560j.j();
        if (I0 && (eVar = this.f3561j0) != null) {
            eVar.j(this);
            this.f3561j0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3578s.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f3578s.get(i10)).g(canvas, this, this.f3565l0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.f3574q != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f11 = this.f3574q.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3574q.p()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (!(f11 == 0.0f && f10 == 0.0f)) {
                        A0((int) (f10 * this.f3553f0), (int) (f11 * this.f3555g0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3574q.q()) {
                        f11 = -axisValue;
                    } else if (this.f3574q.p()) {
                        f10 = axisValue;
                        f11 = 0.0f;
                        A0((int) (f10 * this.f3553f0), (int) (f11 * this.f3555g0), motionEvent, 1);
                    }
                }
                f11 = 0.0f;
                f10 = 0.0f;
                A0((int) (f10 * this.f3553f0), (int) (f11 * this.f3555g0), motionEvent, 1);
            }
            f10 = 0.0f;
            A0((int) (f10 * this.f3553f0), (int) (f11 * this.f3555g0), motionEvent, 1);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if (r0 != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.B
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r8.f3582u = r0
            boolean r0 = r8.T(r9)
            r2 = 1
            if (r0 == 0) goto L_0x0014
            r8.q()
            return r2
        L_0x0014:
            androidx.recyclerview.widget.RecyclerView$p r0 = r8.f3574q
            if (r0 != 0) goto L_0x0019
            return r1
        L_0x0019:
            boolean r0 = r0.p()
            androidx.recyclerview.widget.RecyclerView$p r3 = r8.f3574q
            boolean r3 = r3.q()
            android.view.VelocityTracker r4 = r8.T
            if (r4 != 0) goto L_0x002d
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.T = r4
        L_0x002d:
            android.view.VelocityTracker r4 = r8.T
            r4.addMovement(r9)
            int r4 = r9.getActionMasked()
            int r5 = r9.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L_0x00dd
            if (r4 == r2) goto L_0x00d4
            if (r4 == r6) goto L_0x0074
            r0 = 3
            if (r4 == r0) goto L_0x006f
            r0 = 5
            if (r4 == r0) goto L_0x0053
            r0 = 6
            if (r4 == r0) goto L_0x004e
            goto L_0x011b
        L_0x004e:
            r8.L0(r9)
            goto L_0x011b
        L_0x0053:
            int r0 = r9.getPointerId(r5)
            r8.S = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.W = r0
            r8.U = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.f3546a0 = r9
            r8.V = r9
            goto L_0x011b
        L_0x006f:
            r8.q()
            goto L_0x011b
        L_0x0074:
            int r4 = r8.S
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x009a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r9.append(r0)
            int r0 = r8.S
            r9.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r9)
            return r1
        L_0x009a:
            float r5 = r9.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r9 = r9.getY(r4)
            float r9 = r9 + r7
            int r9 = (int) r9
            int r4 = r8.R
            if (r4 == r2) goto L_0x011b
            int r4 = r8.U
            int r4 = r5 - r4
            int r6 = r8.V
            int r6 = r9 - r6
            if (r0 == 0) goto L_0x00c0
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.f3547b0
            if (r0 <= r4) goto L_0x00c0
            r8.W = r5
            r0 = r2
            goto L_0x00c1
        L_0x00c0:
            r0 = r1
        L_0x00c1:
            if (r3 == 0) goto L_0x00ce
            int r3 = java.lang.Math.abs(r6)
            int r4 = r8.f3547b0
            if (r3 <= r4) goto L_0x00ce
            r8.f3546a0 = r9
            goto L_0x00d0
        L_0x00ce:
            if (r0 == 0) goto L_0x011b
        L_0x00d0:
            r8.setScrollState(r2)
            goto L_0x011b
        L_0x00d4:
            android.view.VelocityTracker r9 = r8.T
            r9.clear()
            r8.v1(r1)
            goto L_0x011b
        L_0x00dd:
            boolean r4 = r8.C
            if (r4 == 0) goto L_0x00e3
            r8.C = r1
        L_0x00e3:
            int r4 = r9.getPointerId(r1)
            r8.S = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.W = r4
            r8.U = r4
            float r9 = r9.getY()
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.f3546a0 = r9
            r8.V = r9
            int r9 = r8.R
            if (r9 != r6) goto L_0x010e
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.setScrollState(r2)
            r8.v1(r2)
        L_0x010e:
            int[] r9 = r8.f3587w0
            r9[r2] = r1
            r9[r1] = r1
            if (r3 == 0) goto L_0x0118
            r0 = r0 | 2
        L_0x0118:
            r8.t1(r0, r1)
        L_0x011b:
            int r9 = r8.R
            if (r9 != r2) goto L_0x0120
            r1 = r2
        L_0x0120:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.l.a("RV OnLayout");
        B();
        androidx.core.os.l.b();
        this.f3590y = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        p pVar = this.f3574q;
        if (pVar == null) {
            w(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.y0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3574q.f1(this.f3552f, this.f3565l0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.A0 = z10;
            if (!z10 && this.f3572p != null) {
                if (this.f3565l0.f3599e == 1) {
                    C();
                }
                this.f3574q.G1(i10, i11);
                this.f3565l0.f3604j = true;
                D();
                this.f3574q.J1(i10, i11);
                if (this.f3574q.M1()) {
                    this.f3574q.G1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3565l0.f3604j = true;
                    D();
                    this.f3574q.J1(i10, i11);
                }
                this.B0 = getMeasuredWidth();
                this.C0 = getMeasuredHeight();
            }
        } else if (this.f3586w) {
            this.f3574q.f1(this.f3552f, this.f3565l0, i10, i11);
        } else {
            if (this.E) {
                s1();
                I0();
                Q0();
                J0();
                a0 a0Var = this.f3565l0;
                if (a0Var.f3606l) {
                    a0Var.f3602h = true;
                } else {
                    this.f3556h.j();
                    this.f3565l0.f3602h = false;
                }
                this.E = false;
                u1(false);
            } else if (this.f3565l0.f3606l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.f3572p;
            if (hVar != null) {
                this.f3565l0.f3600f = hVar.e();
            } else {
                this.f3565l0.f3600f = 0;
            }
            s1();
            this.f3574q.f1(this.f3552f, this.f3565l0, i10, i11);
            u1(false);
            this.f3565l0.f3602h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (v0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.f3554g = yVar;
        super.onRestoreInstanceState(yVar.c());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.f3554g;
        if (yVar2 != null) {
            yVar.d(yVar2);
        } else {
            p pVar = this.f3574q;
            yVar.f3705g = pVar != null ? pVar.j1() : null;
        }
        return yVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            s0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.B
            r8 = 0
            if (r0 != 0) goto L_0x01d8
            boolean r0 = r6.C
            if (r0 == 0) goto L_0x000f
            goto L_0x01d8
        L_0x000f:
            boolean r0 = r17.K(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.q()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f3574q
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.p()
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f3574q
            boolean r11 = r0.q()
            android.view.VelocityTracker r0 = r6.T
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.T = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f3587w0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f3587w0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01ae
            if (r0 == r9) goto L_0x016d
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01cf
        L_0x0066:
            r17.L0(r18)
            goto L_0x01cf
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.S = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.W = r0
            r6.U = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3546a0 = r0
            r6.V = r0
            goto L_0x01cf
        L_0x0087:
            r17.q()
            goto L_0x01cf
        L_0x008c:
            int r0 = r6.S
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.S
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.W
            int r0 = r0 - r13
            int r1 = r6.f3546a0
            int r1 = r1 - r14
            int r2 = r6.R
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00dd
            int r2 = r6.f3547b0
            if (r0 <= 0) goto L_0x00d4
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d9
        L_0x00d4:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d9:
            if (r0 == 0) goto L_0x00dd
            r2 = r9
            goto L_0x00de
        L_0x00dd:
            r2 = r8
        L_0x00de:
            if (r11 == 0) goto L_0x00f2
            int r3 = r6.f3547b0
            if (r1 <= 0) goto L_0x00ea
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00ea:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = r9
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.R
            if (r0 != r9) goto L_0x01cf
            int[] r3 = r6.f3589x0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = r8
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = r8
        L_0x010f:
            int[] r4 = r6.f3585v0
            r5 = 0
            r0 = r17
            boolean r0 = r0.F(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013c
            int[] r0 = r6.f3589x0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f3587w0
            r1 = r0[r8]
            int[] r2 = r6.f3585v0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013c:
            r0 = r16
            int[] r1 = r6.f3585v0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.W = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f3546a0 = r14
            if (r10 == 0) goto L_0x014e
            r1 = r15
            goto L_0x014f
        L_0x014e:
            r1 = r8
        L_0x014f:
            if (r11 == 0) goto L_0x0153
            r2 = r0
            goto L_0x0154
        L_0x0153:
            r2 = r8
        L_0x0154:
            boolean r1 = r6.h1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0161
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0161:
            androidx.recyclerview.widget.e r1 = r6.f3561j0
            if (r1 == 0) goto L_0x01cf
            if (r15 != 0) goto L_0x0169
            if (r0 == 0) goto L_0x01cf
        L_0x0169:
            r1.f(r6, r15, r0)
            goto L_0x01cf
        L_0x016d:
            android.view.VelocityTracker r0 = r6.T
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.T
            int r1 = r6.f3551e0
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x0189
            android.view.VelocityTracker r1 = r6.T
            int r2 = r6.S
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018a
        L_0x0189:
            r1 = r0
        L_0x018a:
            if (r11 == 0) goto L_0x0196
            android.view.VelocityTracker r2 = r6.T
            int r3 = r6.S
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0197
        L_0x0196:
            r2 = r0
        L_0x0197:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a7
        L_0x019f:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.a0(r0, r1)
            if (r0 != 0) goto L_0x01aa
        L_0x01a7:
            r6.setScrollState(r8)
        L_0x01aa:
            r17.e1()
            goto L_0x01d4
        L_0x01ae:
            int r0 = r7.getPointerId(r8)
            r6.S = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.W = r0
            r6.U = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3546a0 = r0
            r6.V = r0
            if (r11 == 0) goto L_0x01cc
            r10 = r10 | 2
        L_0x01cc:
            r6.t1(r10, r8)
        L_0x01cf:
            android.view.VelocityTracker r0 = r6.T
            r0.addMovement(r12)
        L_0x01d4:
            r12.recycle()
            return r9
        L_0x01d8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean p(d0 d0Var) {
        m mVar = this.Q;
        return mVar == null || mVar.g(d0Var, d0Var.q());
    }

    public void p1(int i10, int i11, Interpolator interpolator, int i12) {
        q1(i10, i11, interpolator, i12, false);
    }

    /* access modifiers changed from: package-private */
    public void q1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.f3574q;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.B) {
            int i13 = 0;
            if (!pVar.p()) {
                i10 = 0;
            }
            if (!this.f3574q.q()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (i12 == Integer.MIN_VALUE || i12 > 0) {
                    if (z10) {
                        if (i10 != 0) {
                            i13 = 1;
                        }
                        if (i11 != 0) {
                            i13 |= 2;
                        }
                        t1(i13, 1);
                    }
                    this.f3559i0.e(i10, i11, i12, interpolator);
                    return;
                }
                scrollBy(i10, i11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(x0.b.fastscroll_default_thickness), resources.getDimensionPixelSize(x0.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(x0.b.fastscroll_margin));
    }

    public void r1(int i10) {
        if (!this.B) {
            p pVar = this.f3574q;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                pVar.O1(this, this.f3565l0, i10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z10) {
        d0 f02 = f0(view);
        if (f02 != null) {
            if (f02.z()) {
                f02.f();
            } else if (!f02.L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f02 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z10);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3574q.h1(this, this.f3565l0, view, view2) && view2 != null) {
            c1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f3574q.x1(this, view, rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f3580t.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f3580t.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        if (this.f3592z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        int j10 = this.f3558i.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 f02 = f0(this.f3558i.i(i10));
            if (!f02.L()) {
                f02.c();
            }
        }
        this.f3552f.d();
    }

    /* access modifiers changed from: package-private */
    public void s0() {
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    /* access modifiers changed from: package-private */
    public void s1() {
        int i10 = this.f3592z + 1;
        this.f3592z = i10;
        if (i10 == 1 && !this.B) {
            this.A = false;
        }
    }

    public void scrollBy(int i10, int i11) {
        p pVar = this.f3574q;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.B) {
            boolean p10 = pVar.p();
            boolean q10 = this.f3574q.q();
            if (p10 || q10) {
                if (!p10) {
                    i10 = 0;
                }
                if (!q10) {
                    i11 = 0;
                }
                h1(i10, i11, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(k kVar) {
        this.f3579s0 = kVar;
        m0.q0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        k1(hVar, false, true);
        R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.f3562k) {
            s0();
        }
        this.f3562k = z10;
        super.setClipToPadding(z10);
        if (this.f3590y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        androidx.core.util.g.g(lVar);
        this.L = lVar;
        s0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f3586w = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.Q;
        if (mVar2 != null) {
            mVar2.k();
            this.Q.w((m.b) null);
        }
        this.Q = mVar;
        if (mVar != null) {
            mVar.w(this.f3575q0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f3552f.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar != this.f3574q) {
            w1();
            if (this.f3574q != null) {
                m mVar = this.Q;
                if (mVar != null) {
                    mVar.k();
                }
                this.f3574q.q1(this.f3552f);
                this.f3574q.r1(this.f3552f);
                this.f3552f.c();
                if (this.f3584v) {
                    this.f3574q.F(this, this.f3552f);
                }
                this.f3574q.K1((RecyclerView) null);
                this.f3574q = null;
            } else {
                this.f3552f.c();
            }
            this.f3558i.o();
            this.f3574q = pVar;
            if (pVar != null) {
                if (pVar.f3663b == null) {
                    pVar.K1(this);
                    if (this.f3584v) {
                        this.f3574q.E(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f3663b.P());
                }
            }
            this.f3552f.K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(r rVar) {
        this.f3548c0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.f3567m0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f3557h0 = z10;
    }

    public void setRecycledViewPool(u uVar) {
        this.f3552f.E(uVar);
    }

    @Deprecated
    public void setRecyclerListener(w wVar) {
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (i10 != this.R) {
            this.R = i10;
            if (i10 != 2) {
                x1();
            }
            H(i10);
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f3547b0 = scaledTouchSlop;
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f3547b0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.f3552f.F(b0Var);
    }

    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public final void suppressLayout(boolean z10) {
        if (z10 != this.B) {
            o("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.B = false;
                if (!(!this.A || this.f3574q == null || this.f3572p == null)) {
                    requestLayout();
                }
                this.A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.B = true;
            this.C = true;
            w1();
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.M.onRelease();
            z10 = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.O.onRelease();
            z10 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.N.onRelease();
            z10 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.P.onRelease();
            z10 |= this.P.isFinished();
        }
        if (z10) {
            m0.h0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean t0() {
        AccessibilityManager accessibilityManager = this.F;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean t1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (!this.f3590y || this.H) {
            androidx.core.os.l.a("RV FullInvalidate");
            B();
            androidx.core.os.l.b();
        } else if (this.f3556h.p()) {
            if (this.f3556h.o(4) && !this.f3556h.o(11)) {
                androidx.core.os.l.a("RV PartialInvalidate");
                s1();
                I0();
                this.f3556h.u();
                if (!this.A) {
                    if (n0()) {
                        B();
                    } else {
                        this.f3556h.i();
                    }
                }
                u1(true);
                J0();
            } else if (this.f3556h.p()) {
                androidx.core.os.l.a("RV FullInvalidate");
                B();
            } else {
                return;
            }
            androidx.core.os.l.b();
        }
    }

    public boolean u0() {
        m mVar = this.Q;
        return mVar != null && mVar.p();
    }

    /* access modifiers changed from: package-private */
    public void u1(boolean z10) {
        if (this.f3592z < 1) {
            this.f3592z = 1;
        }
        if (!z10 && !this.B) {
            this.A = false;
        }
        if (this.f3592z == 1) {
            if (z10 && this.A && !this.B && this.f3574q != null && this.f3572p != null) {
                B();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.f3592z--;
    }

    public boolean v0() {
        return this.J > 0;
    }

    public void v1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    /* access modifiers changed from: package-private */
    public void w(int i10, int i11) {
        setMeasuredDimension(p.s(i10, getPaddingLeft() + getPaddingRight(), m0.D(this)), p.s(i11, getPaddingTop() + getPaddingBottom(), m0.C(this)));
    }

    public void w1() {
        setScrollState(0);
        x1();
    }

    /* access modifiers changed from: package-private */
    public void x0(int i10) {
        if (this.f3574q != null) {
            setScrollState(2);
            this.f3574q.D1(i10);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void y(View view) {
        int size;
        d0 f02 = f0(view);
        G0(view);
        h hVar = this.f3572p;
        if (!(hVar == null || f02 == null)) {
            hVar.u(f02);
        }
        List list = this.G;
        if (list != null && list.size() - 1 >= 0) {
            android.support.v4.media.session.b.a(this.G.get(size));
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void y0() {
        int j10 = this.f3558i.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((q) this.f3558i.i(i10).getLayoutParams()).f3688c = true;
        }
        this.f3552f.s();
    }

    /* access modifiers changed from: package-private */
    public void y1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.f3558i.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.f3558i.i(i14);
            d0 f02 = f0(i15);
            if (f02 != null && !f02.L() && (i12 = f02.f3624g) >= i10 && i12 < i13) {
                f02.b(2);
                f02.a(obj);
                ((q) i15.getLayoutParams()).f3688c = true;
            }
        }
        this.f3552f.M(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void z(View view) {
        int size;
        d0 f02 = f0(view);
        H0(view);
        h hVar = this.f3572p;
        if (!(hVar == null || f02 == null)) {
            hVar.v(f02);
        }
        List list = this.G;
        if (list != null && list.size() - 1 >= 0) {
            android.support.v4.media.session.b.a(this.G.get(size));
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void z0() {
        int j10 = this.f3558i.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 f02 = f0(this.f3558i.i(i10));
            if (f02 != null && !f02.L()) {
                f02.b(6);
            }
        }
        y0();
        this.f3552f.t();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        this.f3550e = new x();
        this.f3552f = new v();
        this.f3560j = new p();
        this.f3564l = new a();
        this.f3566m = new Rect();
        this.f3568n = new Rect();
        this.f3570o = new RectF();
        this.f3576r = new ArrayList();
        this.f3578s = new ArrayList();
        this.f3580t = new ArrayList();
        this.f3592z = 0;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        this.L = new l();
        this.Q = new c();
        this.R = 0;
        this.S = -1;
        this.f3553f0 = Float.MIN_VALUE;
        this.f3555g0 = Float.MIN_VALUE;
        this.f3557h0 = true;
        this.f3559i0 = new c0();
        this.f3563k0 = I0 ? new e.b() : null;
        this.f3565l0 = new a0();
        this.f3571o0 = false;
        this.f3573p0 = false;
        this.f3575q0 = new n();
        this.f3577r0 = false;
        this.f3581t0 = new int[2];
        this.f3585v0 = new int[2];
        this.f3587w0 = new int[2];
        this.f3589x0 = new int[2];
        this.f3591y0 = new ArrayList();
        this.f3593z0 = new b();
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3547b0 = viewConfiguration.getScaledTouchSlop();
        this.f3553f0 = o0.c(viewConfiguration, context2);
        this.f3555g0 = o0.e(viewConfiguration, context2);
        this.f3549d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3551e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.Q.w(this.f3575q0);
        o0();
        q0();
        p0();
        if (m0.z(this) == 0) {
            m0.B0(this, 1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new k(this));
        int[] iArr = x0.c.f18158f;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        m0.o0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(x0.c.f18167o);
        if (obtainStyledAttributes.getInt(x0.c.f18161i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3562k = obtainStyledAttributes.getBoolean(x0.c.f18160h, true);
        boolean z10 = obtainStyledAttributes.getBoolean(x0.c.f18162j, false);
        this.f3588x = z10;
        if (z10) {
            r0((StateListDrawable) obtainStyledAttributes.getDrawable(x0.c.f18165m), obtainStyledAttributes.getDrawable(x0.c.f18166n), (StateListDrawable) obtainStyledAttributes.getDrawable(x0.c.f18163k), obtainStyledAttributes.getDrawable(x0.c.f18164l));
        }
        obtainStyledAttributes.recycle();
        v(context, string, attributeSet, i10, 0);
        int[] iArr2 = E0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i11, 0);
        m0.o0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f3574q;
        if (pVar != null) {
            return pVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}
