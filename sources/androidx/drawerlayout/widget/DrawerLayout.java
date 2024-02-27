package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.d0;
import androidx.core.view.accessibility.y;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.core.view.o;
import c0.d;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup implements c0.c {
    private static final int[] P = {16843828};
    static final int[] Q = {16842931};
    static final boolean R = true;
    private static final boolean S = true;
    private static boolean T;
    private Drawable A;
    private Drawable B;
    private Drawable C;
    private CharSequence D;
    private CharSequence E;
    private Object F;
    private boolean G;
    private Drawable H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private final ArrayList L;
    private Rect M;
    private Matrix N;
    private final d0 O;

    /* renamed from: e  reason: collision with root package name */
    private final d f2796e;

    /* renamed from: f  reason: collision with root package name */
    private float f2797f;

    /* renamed from: g  reason: collision with root package name */
    private int f2798g;

    /* renamed from: h  reason: collision with root package name */
    private int f2799h;

    /* renamed from: i  reason: collision with root package name */
    private float f2800i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f2801j;

    /* renamed from: k  reason: collision with root package name */
    private final c0.d f2802k;

    /* renamed from: l  reason: collision with root package name */
    private final c0.d f2803l;

    /* renamed from: m  reason: collision with root package name */
    private final i f2804m;

    /* renamed from: n  reason: collision with root package name */
    private final i f2805n;

    /* renamed from: o  reason: collision with root package name */
    private int f2806o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2807p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2808q;

    /* renamed from: r  reason: collision with root package name */
    private int f2809r;

    /* renamed from: s  reason: collision with root package name */
    private int f2810s;

    /* renamed from: t  reason: collision with root package name */
    private int f2811t;

    /* renamed from: u  reason: collision with root package name */
    private int f2812u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f2813v;

    /* renamed from: w  reason: collision with root package name */
    private e f2814w;

    /* renamed from: x  reason: collision with root package name */
    private List f2815x;

    /* renamed from: y  reason: collision with root package name */
    private float f2816y;

    /* renamed from: z  reason: collision with root package name */
    private float f2817z;

    class a implements d0 {
        a() {
        }

        public boolean a(View view, d0.a aVar) {
            if (!DrawerLayout.this.D(view) || DrawerLayout.this.s(view) == 2) {
                return false;
            }
            DrawerLayout.this.g(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).R(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f2820d = new Rect();

        c() {
        }

        private void n(y yVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.B(childAt)) {
                    yVar.c(childAt);
                }
            }
        }

        private void o(y yVar, y yVar2) {
            Rect rect = this.f2820d;
            yVar2.n(rect);
            yVar.j0(rect);
            yVar.N0(yVar2.Y());
            yVar.A0(yVar2.y());
            yVar.m0(yVar2.q());
            yVar.q0(yVar2.t());
            yVar.s0(yVar2.N());
            yVar.v0(yVar2.P());
            yVar.g0(yVar2.I());
            yVar.G0(yVar2.V());
            yVar.a(yVar2.k());
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence t10;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View q10 = DrawerLayout.this.q();
            if (q10 == null || (t10 = DrawerLayout.this.t(DrawerLayout.this.u(q10))) == null) {
                return true;
            }
            text.add(t10);
            return true;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public void g(View view, y yVar) {
            if (DrawerLayout.R) {
                super.g(view, yVar);
            } else {
                y b02 = y.b0(yVar);
                super.g(view, b02);
                yVar.I0(view);
                ViewParent H = m0.H(view);
                if (H instanceof View) {
                    yVar.C0((View) H);
                }
                o(yVar, b02);
                b02.d0();
                n(yVar, (ViewGroup) view);
            }
            yVar.m0("androidx.drawerlayout.widget.DrawerLayout");
            yVar.u0(false);
            yVar.v0(false);
            yVar.e0(y.a.f2534e);
            yVar.e0(y.a.f2535f);
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.R || DrawerLayout.B(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends androidx.core.view.a {
        d() {
        }

        public void g(View view, y yVar) {
            super.g(view, yVar);
            if (!DrawerLayout.B(view)) {
                yVar.C0((View) null);
            }
        }
    }

    public interface e {
        void a(int i10);

        void b(View view, float f10);

        void c(View view);

        void d(View view);
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2822a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f2823b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2824c;

        /* renamed from: d  reason: collision with root package name */
        int f2825d;

        public f(int i10, int i11) {
            super(i10, i11);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.Q);
            this.f2822a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super(fVar);
            this.f2822a = fVar.f2822a;
        }
    }

    protected static class g extends b0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        int f2826g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f2827h;

        /* renamed from: i  reason: collision with root package name */
        int f2828i;

        /* renamed from: j  reason: collision with root package name */
        int f2829j;

        /* renamed from: k  reason: collision with root package name */
        int f2830k;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2826g = parcel.readInt();
            this.f2827h = parcel.readInt();
            this.f2828i = parcel.readInt();
            this.f2829j = parcel.readInt();
            this.f2830k = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2826g);
            parcel.writeInt(this.f2827h);
            parcel.writeInt(this.f2828i);
            parcel.writeInt(this.f2829j);
            parcel.writeInt(this.f2830k);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static abstract class h implements e {
        public void a(int i10) {
        }

        public void b(View view, float f10) {
        }
    }

    private class i extends d.c {

        /* renamed from: a  reason: collision with root package name */
        private final int f2831a;

        /* renamed from: b  reason: collision with root package name */
        private c0.d f2832b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f2833c = new a();

        class a implements Runnable {
            a() {
            }

            public void run() {
                i.this.o();
            }
        }

        i(int i10) {
            this.f2831a = i10;
        }

        private void n() {
            int i10 = 3;
            if (this.f2831a == 3) {
                i10 = 5;
            }
            View o10 = DrawerLayout.this.o(i10);
            if (o10 != null) {
                DrawerLayout.this.g(o10);
            }
        }

        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            if (DrawerLayout.this.d(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i10, width));
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void f(int i10, int i11) {
            DrawerLayout drawerLayout;
            int i12;
            if ((i10 & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i12 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i12 = 5;
            }
            View o10 = drawerLayout.o(i12);
            if (o10 != null && DrawerLayout.this.s(o10) == 0) {
                this.f2832b.b(o10, i11);
            }
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f2833c, 160);
        }

        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f2824c = false;
            n();
        }

        public void j(int i10) {
            DrawerLayout.this.W(i10, this.f2832b.v());
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.d(view, 3) ? (float) (i10 + width) : (float) (DrawerLayout.this.getWidth() - i10)) / ((float) width);
            DrawerLayout.this.T(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void l(View view, float f10, float f11) {
            int i10;
            float v10 = DrawerLayout.this.v(view);
            int width = view.getWidth();
            if (DrawerLayout.this.d(view, 3)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                i10 = (i11 > 0 || (i11 == 0 && v10 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && v10 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f2832b.O(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public boolean m(View view, int i10) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.d(view, this.f2831a) && DrawerLayout.this.s(view) == 0;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            View view;
            int i10;
            int x10 = this.f2832b.x();
            int i11 = 0;
            boolean z10 = this.f2831a == 3;
            if (z10) {
                view = DrawerLayout.this.o(3);
                if (view != null) {
                    i11 = -view.getWidth();
                }
                i10 = i11 + x10;
            } else {
                view = DrawerLayout.this.o(5);
                i10 = DrawerLayout.this.getWidth() - x10;
            }
            if (view == null) {
                return;
            }
            if (((z10 && view.getLeft() < i10) || (!z10 && view.getLeft() > i10)) && DrawerLayout.this.s(view) == 0) {
                this.f2832b.Q(view, i10, view.getTop());
                ((f) view.getLayoutParams()).f2824c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.c();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f2833c);
        }

        public void q(c0.d dVar) {
            this.f2832b = dVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 < 29) {
            z10 = false;
        }
        T = z10;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h0.a.drawerLayoutStyle);
    }

    private boolean A() {
        return q() != null;
    }

    static boolean B(View view) {
        return (m0.z(view) == 4 || m0.z(view) == 2) ? false : true;
    }

    private boolean G(float f10, float f11, View view) {
        if (this.M == null) {
            this.M = new Rect();
        }
        view.getHitRect(this.M);
        return this.M.contains((int) f10, (int) f11);
    }

    private void H(Drawable drawable, int i10) {
        if (drawable != null && androidx.core.graphics.drawable.a.h(drawable)) {
            androidx.core.graphics.drawable.a.m(drawable, i10);
        }
    }

    private Drawable O() {
        int B2 = m0.B(this);
        if (B2 == 0) {
            Drawable drawable = this.H;
            if (drawable != null) {
                H(drawable, B2);
                return this.H;
            }
        } else {
            Drawable drawable2 = this.I;
            if (drawable2 != null) {
                H(drawable2, B2);
                return this.I;
            }
        }
        return this.J;
    }

    private Drawable P() {
        int B2 = m0.B(this);
        if (B2 == 0) {
            Drawable drawable = this.I;
            if (drawable != null) {
                H(drawable, B2);
                return this.I;
            }
        } else {
            Drawable drawable2 = this.H;
            if (drawable2 != null) {
                H(drawable2, B2);
                return this.H;
            }
        }
        return this.K;
    }

    private void Q() {
        if (!S) {
            this.B = O();
            this.C = P();
        }
    }

    private void U(View view) {
        y.a aVar = y.a.f2554y;
        m0.k0(view, aVar.b());
        if (D(view) && s(view) != 2) {
            m0.m0(view, aVar, (CharSequence) null, this.O);
        }
    }

    private void V(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            m0.B0(childAt, ((z10 || E(childAt)) && (!z10 || childAt != view)) ? 4 : 1);
        }
    }

    private boolean n(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent w10 = w(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(w10);
            w10.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent w(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.N == null) {
                this.N = new Matrix();
            }
            matrix.invert(this.N);
            obtain.transform(this.N);
        }
        return obtain;
    }

    static String x(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean y(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean z() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f2824c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean C(View view) {
        return ((f) view.getLayoutParams()).f2822a == 0;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).f2825d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public boolean E(View view) {
        int b10 = o.b(((f) view.getLayoutParams()).f2822a, m0.B(view));
        return ((b10 & 3) == 0 && (b10 & 5) == 0) ? false : true;
    }

    public boolean F(View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).f2823b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public void I(View view, float f10) {
        float v10 = v(view);
        float width = (float) view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (v10 * width));
        if (!d(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        T(view, f10);
    }

    public void J(int i10) {
        K(i10, true);
    }

    public void K(int i10, boolean z10) {
        View o10 = o(i10);
        if (o10 != null) {
            M(o10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + x(i10));
    }

    public void L(View view) {
        M(view, true);
    }

    public void M(View view, boolean z10) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f2808q) {
                fVar.f2823b = 1.0f;
                fVar.f2825d = 1;
                V(view, true);
                U(view);
            } else if (z10) {
                fVar.f2825d |= 2;
                if (d(view, 3)) {
                    this.f2802k.Q(view, 0, view.getTop());
                } else {
                    this.f2803l.Q(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                I(view, 1.0f);
                W(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void N(e eVar) {
        List list;
        if (eVar != null && (list = this.f2815x) != null) {
            list.remove(eVar);
        }
    }

    public void R(Object obj, boolean z10) {
        this.F = obj;
        this.G = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void S(int i10, int i11) {
        View o10;
        int b10 = o.b(i11, m0.B(this));
        if (i11 == 3) {
            this.f2809r = i10;
        } else if (i11 == 5) {
            this.f2810s = i10;
        } else if (i11 == 8388611) {
            this.f2811t = i10;
        } else if (i11 == 8388613) {
            this.f2812u = i10;
        }
        if (i10 != 0) {
            (b10 == 3 ? this.f2802k : this.f2803l).a();
        }
        if (i10 == 1) {
            View o11 = o(b10);
            if (o11 != null) {
                g(o11);
            }
        } else if (i10 == 2 && (o10 = o(b10)) != null) {
            L(o10);
        }
    }

    /* access modifiers changed from: package-private */
    public void T(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 != fVar.f2823b) {
            fVar.f2823b = f10;
            m(view, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void W(int i10, View view) {
        int i11;
        int A2 = this.f2802k.A();
        int A3 = this.f2803l.A();
        if (A2 == 1 || A3 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (!(A2 == 2 || A3 == 2)) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f2823b;
            if (f10 == 0.0f) {
                k(view);
            } else if (f10 == 1.0f) {
                l(view);
            }
        }
        if (i11 != this.f2806o) {
            this.f2806o = i11;
            List list = this.f2815x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f2815x.get(size)).a(i11);
                }
            }
        }
    }

    public void a() {
        J(8388611);
    }

    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z10 = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!E(childAt)) {
                    this.L.add(childAt);
                } else if (D(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            }
            if (!z10) {
                int size = this.L.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = (View) this.L.get(i13);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i10, i11);
                    }
                }
            }
            this.L.clear();
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        m0.B0(view, (p() != null || E(view)) ? 4 : 1);
        if (!R) {
            m0.q0(view, this.f2796e);
        }
    }

    public void b(e eVar) {
        if (eVar != null) {
            if (this.f2815x == null) {
                this.f2815x = new ArrayList();
            }
            this.f2815x.add(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (!this.f2813v) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f2813v = true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        e(8388611);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((f) getChildAt(i10).getLayoutParams()).f2823b);
        }
        this.f2800i = f10;
        boolean m10 = this.f2802k.m(true);
        boolean m11 = this.f2803l.m(true);
        if (m10 || m11) {
            m0.h0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d(View view, int i10) {
        return (u(view) & i10) == i10;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2800i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (G(x10, y10, childAt) && !C(childAt) && n(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean C2 = C(view2);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (C2) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view2 && childAt.getVisibility() == 0 && y(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (d(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f2800i;
        if (f10 <= 0.0f || !C2) {
            if (this.B != null && d(view2, 3)) {
                int intrinsicWidth = this.B.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f2802k.x()), 1.0f));
                this.B.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.B.setAlpha((int) (max * 255.0f));
                drawable = this.B;
            } else if (this.C != null && d(view2, 5)) {
                int intrinsicWidth2 = this.C.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f2803l.x()), 1.0f));
                this.C.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.C.setAlpha((int) (max2 * 255.0f));
                drawable = this.C;
            }
            drawable.draw(canvas);
        } else {
            int i13 = this.f2799h;
            this.f2801j.setColor((i13 & 16777215) | (((int) (((float) ((-16777216 & i13) >>> 24)) * f10)) << 24));
            canvas.drawRect((float) i10, 0.0f, (float) width, (float) getHeight(), this.f2801j);
        }
        return drawChild;
    }

    public void e(int i10) {
        f(i10, true);
    }

    public void f(int i10, boolean z10) {
        View o10 = o(i10);
        if (o10 != null) {
            h(o10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + x(i10));
    }

    public void g(View view) {
        h(view, true);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public float getDrawerElevation() {
        if (S) {
            return this.f2797f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.A;
    }

    public void h(View view, boolean z10) {
        c0.d dVar;
        int width;
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f2808q) {
                fVar.f2823b = 0.0f;
                fVar.f2825d = 0;
            } else if (z10) {
                fVar.f2825d |= 4;
                if (d(view, 3)) {
                    dVar = this.f2802k;
                    width = -view.getWidth();
                } else {
                    dVar = this.f2803l;
                    width = getWidth();
                }
                dVar.Q(view, width, view.getTop());
            } else {
                I(view, 0.0f);
                W(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void i() {
        j(false);
    }

    /* access modifiers changed from: package-private */
    public void j(boolean z10) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z10 || fVar.f2824c)) {
                z11 |= d(childAt, 3) ? this.f2802k.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2803l.Q(childAt, getWidth(), childAt.getTop());
                fVar.f2824c = false;
            }
        }
        this.f2804m.p();
        this.f2805n.p();
        if (z11) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f2825d & 1) == 1) {
            fVar.f2825d = 0;
            List list = this.f2815x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f2815x.get(size)).d(view);
                }
            }
            V(view, false);
            U(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f2825d & 1) == 0) {
            fVar.f2825d = 1;
            List list = this.f2815x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f2815x.get(size)).c(view);
                }
            }
            V(view, true);
            U(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(View view, float f10) {
        List list = this.f2815x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.f2815x.get(size)).b(view, f10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View o(int i10) {
        int b10 = o.b(i10, m0.B(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((u(childAt) & 7) == b10) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2808q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2808q = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.G && this.A != null) {
            Object obj = this.F;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.A.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.A.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.f2802k.t((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            c0.d r1 = r6.f2802k
            boolean r1 = r1.P(r7)
            c0.d r2 = r6.f2803l
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            c0.d r7 = r6.f2802k
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$i r7 = r6.f2804m
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$i r7 = r6.f2805n
            r7.p()
            goto L_0x0036
        L_0x0031:
            r6.j(r2)
            r6.f2813v = r3
        L_0x0036:
            r7 = r3
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2816y = r0
            r6.f2817z = r7
            float r4 = r6.f2800i
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            c0.d r4 = r6.f2802k
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.C(r7)
            if (r7 == 0) goto L_0x005d
            r7 = r2
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            r6.f2813v = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.z()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f2813v
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !A()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View q10 = q();
        if (q10 != null && s(q10) == 0) {
            i();
        }
        return q10 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        int measuredHeight;
        int i15;
        int i16;
        boolean z11 = true;
        this.f2807p = true;
        int i17 = i12 - i10;
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (C(childAt)) {
                    int i19 = fVar.leftMargin;
                    childAt.layout(i19, fVar.topMargin, childAt.getMeasuredWidth() + i19, fVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (d(childAt, 3)) {
                        float f11 = (float) measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f2823b * f11));
                        f10 = ((float) (measuredWidth + i14)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i20 = i17 - ((int) (fVar.f2823b * f12));
                        f10 = ((float) (i17 - i20)) / f12;
                        i14 = i20;
                    }
                    boolean z12 = f10 != fVar.f2823b ? z11 : false;
                    int i21 = fVar.f2822a & 112;
                    if (i21 != 16) {
                        if (i21 != 80) {
                            measuredHeight = fVar.topMargin;
                            i15 = measuredWidth + i14;
                            i16 = measuredHeight2 + measuredHeight;
                        } else {
                            int i22 = i13 - i11;
                            measuredHeight = (i22 - fVar.bottomMargin) - childAt.getMeasuredHeight();
                            i15 = measuredWidth + i14;
                            i16 = i22 - fVar.bottomMargin;
                        }
                        childAt.layout(i14, measuredHeight, i15, i16);
                    } else {
                        int i23 = i13 - i11;
                        int i24 = (i23 - measuredHeight2) / 2;
                        int i25 = fVar.topMargin;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = i24 + measuredHeight2;
                            int i27 = fVar.bottomMargin;
                            if (i26 > i23 - i27) {
                                i24 = (i23 - i27) - measuredHeight2;
                            }
                        }
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight2 + i24);
                    }
                    if (z12) {
                        T(childAt, f10);
                    }
                    int i28 = fVar.f2823b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i28) {
                        childAt.setVisibility(i28);
                    }
                }
            }
            i18++;
            z11 = true;
        }
        if (T && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.f h10 = k1.w(rootWindowInsets).h();
            c0.d dVar = this.f2802k;
            dVar.L(Math.max(dVar.w(), h10.f2373a));
            c0.d dVar2 = this.f2803l;
            dVar2.L(Math.max(dVar2.w(), h10.f2375c));
        }
        this.f2807p = false;
        this.f2808q = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.F != null && m0.y(this);
        int B2 = m0.B(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int b10 = o.b(fVar.f2822a, B2);
                    boolean y10 = m0.y(childAt);
                    WindowInsets windowInsets = (WindowInsets) this.F;
                    if (y10) {
                        if (b10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        if (b10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        fVar.leftMargin = windowInsets.getSystemWindowInsetLeft();
                        fVar.topMargin = windowInsets.getSystemWindowInsetTop();
                        fVar.rightMargin = windowInsets.getSystemWindowInsetRight();
                        fVar.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (C(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - fVar.leftMargin) - fVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - fVar.topMargin) - fVar.bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (S) {
                        float w10 = m0.w(childAt);
                        float f10 = this.f2797f;
                        if (w10 != f10) {
                            m0.y0(childAt, f10);
                        }
                    }
                    int u10 = u(childAt) & 7;
                    boolean z13 = u10 == 3;
                    if ((!z13 || !z11) && (z13 || !z12)) {
                        if (z13) {
                            z11 = true;
                        } else {
                            z12 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f2798g + fVar.leftMargin + fVar.rightMargin, fVar.width), ViewGroup.getChildMeasureSpec(i11, fVar.topMargin + fVar.bottomMargin, fVar.height));
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + x(u10) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i13 = i10;
            int i14 = i11;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View o10;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.c());
        int i10 = gVar.f2826g;
        if (!(i10 == 0 || (o10 = o(i10)) == null)) {
            L(o10);
        }
        int i11 = gVar.f2827h;
        if (i11 != 3) {
            S(i11, 3);
        }
        int i12 = gVar.f2828i;
        if (i12 != 3) {
            S(i12, 5);
        }
        int i13 = gVar.f2829j;
        if (i13 != 3) {
            S(i13, 8388611);
        }
        int i14 = gVar.f2830k;
        if (i14 != 3) {
            S(i14, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        Q();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f2825d;
            boolean z10 = true;
            boolean z11 = i11 == 1;
            if (i11 != 2) {
                z10 = false;
            }
            if (z11 || z10) {
                gVar.f2826g = fVar.f2822a;
            } else {
                i10++;
            }
        }
        gVar.f2827h = this.f2809r;
        gVar.f2828i = this.f2810s;
        gVar.f2829j = this.f2811t;
        gVar.f2830k = this.f2812u;
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (s(r7) != 2) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            c0.d r0 = r6.f2802k
            r0.F(r7)
            c0.d r0 = r6.f2803l
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006c
        L_0x001a:
            r6.j(r2)
        L_0x001d:
            r6.f2813v = r1
            goto L_0x006c
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            c0.d r3 = r6.f2802k
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L_0x005a
            boolean r3 = r6.C(r3)
            if (r3 == 0) goto L_0x005a
            float r3 = r6.f2816y
            float r0 = r0 - r3
            float r3 = r6.f2817z
            float r7 = r7 - r3
            c0.d r3 = r6.f2802k
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            android.view.View r7 = r6.p()
            if (r7 == 0) goto L_0x005a
            int r7 = r6.s(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            r6.j(r1)
            goto L_0x006c
        L_0x005f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2816y = r0
            r6.f2817z = r7
            goto L_0x001d
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f2825d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View q() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt) && F(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int r(int i10) {
        int B2 = m0.B(this);
        if (i10 == 3) {
            int i11 = this.f2809r;
            if (i11 != 3) {
                return i11;
            }
            int i12 = B2 == 0 ? this.f2811t : this.f2812u;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        } else if (i10 == 5) {
            int i13 = this.f2810s;
            if (i13 != 3) {
                return i13;
            }
            int i14 = B2 == 0 ? this.f2812u : this.f2811t;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        } else if (i10 == 8388611) {
            int i15 = this.f2811t;
            if (i15 != 3) {
                return i15;
            }
            int i16 = B2 == 0 ? this.f2809r : this.f2810s;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        } else if (i10 != 8388613) {
            return 0;
        } else {
            int i17 = this.f2812u;
            if (i17 != 3) {
                return i17;
            }
            int i18 = B2 == 0 ? this.f2810s : this.f2809r;
            if (i18 != 3) {
                return i18;
            }
            return 0;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            j(true);
        }
    }

    public void requestLayout() {
        if (!this.f2807p) {
            super.requestLayout();
        }
    }

    public int s(View view) {
        if (E(view)) {
            return r(((f) view.getLayoutParams()).f2822a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerElevation(float f10) {
        this.f2797f = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt)) {
                m0.y0(childAt, this.f2797f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f2814w;
        if (eVar2 != null) {
            N(eVar2);
        }
        if (eVar != null) {
            b(eVar);
        }
        this.f2814w = eVar;
    }

    public void setDrawerLockMode(int i10) {
        S(i10, 3);
        S(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f2799h = i10;
        invalidate();
    }

    public void setStatusBarBackground(int i10) {
        this.A = i10 != 0 ? androidx.core.content.a.e(getContext(), i10) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.A = new ColorDrawable(i10);
        invalidate();
    }

    public CharSequence t(int i10) {
        int b10 = o.b(i10, m0.B(this));
        if (b10 == 3) {
            return this.D;
        }
        if (b10 == 5) {
            return this.E;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int u(View view) {
        return o.b(((f) view.getLayoutParams()).f2822a, m0.B(this));
    }

    /* access modifiers changed from: package-private */
    public float v(View view) {
        return ((f) view.getLayoutParams()).f2823b;
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2796e = new d();
        this.f2799h = -1728053248;
        this.f2801j = new Paint();
        this.f2808q = true;
        this.f2809r = 3;
        this.f2810s = 3;
        this.f2811t = 3;
        this.f2812u = 3;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.O = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f2798g = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        i iVar = new i(3);
        this.f2804m = iVar;
        i iVar2 = new i(5);
        this.f2805n = iVar2;
        c0.d n10 = c0.d.n(this, 1.0f, iVar);
        this.f2802k = n10;
        n10.M(1);
        n10.N(f11);
        iVar.q(n10);
        c0.d n11 = c0.d.n(this, 1.0f, iVar2);
        this.f2803l = n11;
        n11.M(2);
        n11.N(f11);
        iVar2.q(n11);
        setFocusableInTouchMode(true);
        m0.B0(this, 1);
        m0.q0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (m0.y(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(P);
            try {
                this.A = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h0.c.f11931b, i10, 0);
        try {
            int i11 = h0.c.f11932c;
            this.f2797f = obtainStyledAttributes2.hasValue(i11) ? obtainStyledAttributes2.getDimension(i11, 0.0f) : getResources().getDimension(h0.b.def_drawer_elevation);
            obtainStyledAttributes2.recycle();
            this.L = new ArrayList();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.A = drawable;
        invalidate();
    }
}
