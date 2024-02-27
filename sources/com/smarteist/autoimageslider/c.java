package com.smarteist.autoimageslider;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.accessibility.y;
import androidx.core.view.c0;
import androidx.core.view.k1;
import androidx.core.view.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class c extends ViewGroup {

    /* renamed from: l0  reason: collision with root package name */
    static final int[] f22576l0 = {16842931};

    /* renamed from: m0  reason: collision with root package name */
    private static final Comparator f22577m0 = new a();
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public static final Interpolator f22578n0 = new b();

    /* renamed from: o0  reason: collision with root package name */
    private static final o f22579o0 = new o();
    private boolean A;
    private int B = 1;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L = -1;
    private VelocityTracker M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private boolean R;
    private EdgeEffect S;
    private EdgeEffect T;
    private boolean U = true;
    private boolean V = false;
    private boolean W;

    /* renamed from: a0  reason: collision with root package name */
    private int f22580a0;

    /* renamed from: b0  reason: collision with root package name */
    private List f22581b0;

    /* renamed from: c0  reason: collision with root package name */
    private j f22582c0;

    /* renamed from: d0  reason: collision with root package name */
    private j f22583d0;

    /* renamed from: e  reason: collision with root package name */
    private int f22584e;

    /* renamed from: e0  reason: collision with root package name */
    private List f22585e0;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f22586f = new ArrayList();

    /* renamed from: f0  reason: collision with root package name */
    private l f22587f0;

    /* renamed from: g  reason: collision with root package name */
    private final f f22588g = new f();

    /* renamed from: g0  reason: collision with root package name */
    private int f22589g0;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f22590h = new Rect();

    /* renamed from: h0  reason: collision with root package name */
    private int f22591h0;

    /* renamed from: i  reason: collision with root package name */
    l1.a f22592i;

    /* renamed from: i0  reason: collision with root package name */
    private ArrayList f22593i0;

    /* renamed from: j  reason: collision with root package name */
    int f22594j;

    /* renamed from: j0  reason: collision with root package name */
    private final Runnable f22595j0 = new C0278c();

    /* renamed from: k  reason: collision with root package name */
    private int f22596k = -1;

    /* renamed from: k0  reason: collision with root package name */
    private int f22597k0 = 0;

    /* renamed from: l  reason: collision with root package name */
    private Parcelable f22598l = null;

    /* renamed from: m  reason: collision with root package name */
    private ClassLoader f22599m = null;

    /* renamed from: n  reason: collision with root package name */
    private Scroller f22600n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f22601o;

    /* renamed from: p  reason: collision with root package name */
    private m f22602p;

    /* renamed from: q  reason: collision with root package name */
    private int f22603q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f22604r;

    /* renamed from: s  reason: collision with root package name */
    private int f22605s;

    /* renamed from: t  reason: collision with root package name */
    private int f22606t;

    /* renamed from: u  reason: collision with root package name */
    private float f22607u = -3.4028235E38f;

    /* renamed from: v  reason: collision with root package name */
    private float f22608v = Float.MAX_VALUE;

    /* renamed from: w  reason: collision with root package name */
    private int f22609w;

    /* renamed from: x  reason: collision with root package name */
    private int f22610x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f22611y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f22612z;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f22617b - fVar2.f22617b;
        }
    }

    class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: com.smarteist.autoimageslider.c$c  reason: collision with other inner class name */
    class C0278c implements Runnable {
        C0278c() {
        }

        public void run() {
            c.this.setScrollState(0);
            c.this.E();
        }
    }

    class d implements c0 {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f22614a = new Rect();

        d() {
        }

        public k1 a(View view, k1 k1Var) {
            k1 c02 = m0.c0(view, k1Var);
            if (c02.p()) {
                return c02;
            }
            Rect rect = this.f22614a;
            rect.left = c02.j();
            rect.top = c02.l();
            rect.right = c02.k();
            rect.bottom = c02.i();
            int childCount = c.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                k1 g10 = m0.g(c.this.getChildAt(i10), c02);
                rect.left = Math.min(g10.j(), rect.left);
                rect.top = Math.min(g10.l(), rect.top);
                rect.right = Math.min(g10.k(), rect.right);
                rect.bottom = Math.min(g10.i(), rect.bottom);
            }
            return c02.q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a  reason: collision with root package name */
        Object f22616a;

        /* renamed from: b  reason: collision with root package name */
        int f22617b;

        /* renamed from: c  reason: collision with root package name */
        boolean f22618c;

        /* renamed from: d  reason: collision with root package name */
        float f22619d;

        /* renamed from: e  reason: collision with root package name */
        float f22620e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22621a;

        /* renamed from: b  reason: collision with root package name */
        public int f22622b;

        /* renamed from: c  reason: collision with root package name */
        float f22623c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        boolean f22624d;

        /* renamed from: e  reason: collision with root package name */
        int f22625e;

        /* renamed from: f  reason: collision with root package name */
        int f22626f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f22576l0);
            this.f22622b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        private boolean n() {
            l1.a aVar = c.this.f22592i;
            return aVar != null && aVar.d() > 1;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            l1.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(c.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = c.this.f22592i) != null) {
                accessibilityEvent.setItemCount(aVar.d());
                accessibilityEvent.setFromIndex(c.this.f22594j);
                accessibilityEvent.setToIndex(c.this.f22594j);
            }
        }

        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.m0(c.class.getName());
            yVar.F0(n());
            if (c.this.canScrollHorizontally(1)) {
                yVar.a(4096);
            }
            if (c.this.canScrollHorizontally(-1)) {
                yVar.a(8192);
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            c cVar;
            int i11;
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !c.this.canScrollHorizontally(-1)) {
                    return false;
                }
                cVar = c.this;
                i11 = cVar.f22594j - 1;
            } else if (!c.this.canScrollHorizontally(1)) {
                return false;
            } else {
                cVar = c.this;
                i11 = cVar.f22594j + 1;
            }
            cVar.setCurrentItem(i11);
            return true;
        }
    }

    public interface i {
        void d(c cVar, l1.a aVar, l1.a aVar2);
    }

    public interface j {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    class k extends Scroller {

        /* renamed from: a  reason: collision with root package name */
        private int f22628a;

        k(Context context, int i10) {
            super(context, c.f22578n0);
            this.f22628a = i10;
        }

        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, this.f22628a);
        }

        k(Context context, int i10, Interpolator interpolator) {
            super(context, interpolator);
            this.f22628a = i10;
        }
    }

    public interface l {
        void a(View view, float f10);
    }

    private class m extends DataSetObserver {
        m() {
        }

        public void onChanged() {
            c.this.i();
        }

        public void onInvalidated() {
            c.this.i();
        }
    }

    public static class n extends b0.a {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        int f22631g;

        /* renamed from: h  reason: collision with root package name */
        Parcelable f22632h;

        /* renamed from: i  reason: collision with root package name */
        ClassLoader f22633i;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            /* renamed from: c */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f22631g = parcel.readInt();
            this.f22632h = parcel.readParcelable(classLoader);
            this.f22633i = classLoader;
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f22631g + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22631g);
            parcel.writeParcelable(this.f22632h, i10);
        }

        public n(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static class o implements Comparator {
        o() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f22621a;
            if (z10 != gVar2.f22621a) {
                return z10 ? 1 : -1;
            }
            return gVar.f22625e - gVar2.f22625e;
        }
    }

    public c(Context context) {
        super(context);
        v();
    }

    private boolean C(int i10) {
        if (this.f22586f.size() != 0) {
            f t10 = t();
            int clientWidth = getClientWidth();
            int i11 = this.f22603q;
            int i12 = clientWidth + i11;
            float f10 = (float) clientWidth;
            int i13 = t10.f22617b;
            float f11 = ((((float) i10) / f10) - t10.f22620e) / (t10.f22619d + (((float) i11) / f10));
            this.W = false;
            y(i13, f11, (int) (((float) i12) * f11));
            if (this.W) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.U) {
            return false;
        } else {
            this.W = false;
            y(0, 0.0f, 0);
            if (this.W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean D(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.H - f10;
        this.H = f10;
        float scrollX = ((float) getScrollX()) + f11;
        float clientWidth = (float) getClientWidth();
        float f12 = this.f22607u * clientWidth;
        float f13 = this.f22608v * clientWidth;
        boolean z12 = false;
        f fVar = (f) this.f22586f.get(0);
        ArrayList arrayList = this.f22586f;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f22617b != 0) {
            f12 = fVar.f22620e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f22617b != this.f22592i.d() - 1) {
            f13 = fVar2.f22620e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.S.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.T.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.H += scrollX - ((float) i10);
        scrollTo(i10, getScrollY());
        C(i10);
        return z12;
    }

    private void G(int i10, int i11, int i12, int i13) {
        int min;
        if (i11 <= 0 || this.f22586f.isEmpty()) {
            f u10 = u(this.f22594j);
            min = (int) ((u10 != null ? Math.min(u10.f22620e, this.f22608v) : 0.0f) * ((float) ((i10 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                h(false);
            } else {
                return;
            }
        } else if (!this.f22600n.isFinished()) {
            this.f22600n.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))) * ((float) (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)));
        }
        scrollTo(min, getScrollY());
    }

    private void H() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f22621a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void J(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean K() {
        this.L = -1;
        o();
        this.S.onRelease();
        this.T.onRelease();
        return this.S.isFinished() || this.T.isFinished();
    }

    private void L(int i10, boolean z10, int i11, boolean z11) {
        f u10 = u(i10);
        int clientWidth = u10 != null ? (int) (((float) getClientWidth()) * Math.max(this.f22607u, Math.min(u10.f22620e, this.f22608v))) : 0;
        if (z10) {
            S(clientWidth, 0, i11);
            if (z11) {
                U(i10);
                return;
            }
            return;
        }
        if (z11) {
            U(i10);
        }
        h(false);
        scrollTo(clientWidth, 0);
        C(clientWidth);
    }

    private void T() {
        if (this.f22591h0 != 0) {
            ArrayList arrayList = this.f22593i0;
            if (arrayList == null) {
                this.f22593i0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f22593i0.add(getChildAt(i10));
            }
            Collections.sort(this.f22593i0, f22579o0);
        }
    }

    private void U(int i10) {
        for (j jVar : this.f22581b0) {
            if (jVar != null) {
                l1.a aVar = this.f22592i;
                if (aVar instanceof el.a) {
                    jVar.c(((el.a) aVar).u(i10));
                } else {
                    jVar.c(i10);
                }
            }
        }
        j jVar2 = this.f22583d0;
        if (jVar2 != null) {
            jVar2.c(i10);
        }
    }

    private void f(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int d10 = this.f22592i.d();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? ((float) this.f22603q) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f22617b;
            int i14 = fVar.f22617b;
            if (i13 < i14) {
                float f11 = fVar2.f22620e + fVar2.f22619d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f22617b && i16 < this.f22586f.size()) {
                    while (true) {
                        fVar4 = (f) this.f22586f.get(i16);
                        if (i15 > fVar4.f22617b && i16 < this.f22586f.size() - 1) {
                            i16++;
                        }
                    }
                    while (i15 < fVar4.f22617b) {
                        f11 += this.f22592i.f(i15) + f10;
                        i15++;
                    }
                    fVar4.f22620e = f11;
                    f11 += fVar4.f22619d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f22586f.size() - 1;
                float f12 = fVar2.f22620e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f22617b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = (f) this.f22586f.get(size);
                        if (i13 < fVar3.f22617b && size > 0) {
                            size--;
                        }
                    }
                    while (i13 > fVar3.f22617b) {
                        f12 -= this.f22592i.f(i13) + f10;
                        i13--;
                    }
                    f12 -= fVar3.f22619d + f10;
                    fVar3.f22620e = f12;
                }
            }
        }
        int size2 = this.f22586f.size();
        float f13 = fVar.f22620e;
        int i17 = fVar.f22617b;
        int i18 = i17 - 1;
        this.f22607u = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = d10 - 1;
        this.f22608v = i17 == i19 ? (fVar.f22619d + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar5 = (f) this.f22586f.get(i20);
            while (true) {
                i12 = fVar5.f22617b;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.f22592i.f(i18) + f10;
                i18--;
            }
            f13 -= fVar5.f22619d + f10;
            fVar5.f22620e = f13;
            if (i12 == 0) {
                this.f22607u = f13;
            }
            i20--;
            i18--;
        }
        float f14 = fVar.f22620e + fVar.f22619d + f10;
        int i21 = fVar.f22617b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar6 = (f) this.f22586f.get(i22);
            while (true) {
                i11 = fVar6.f22617b;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.f22592i.f(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f22608v = (fVar6.f22619d + f14) - 1.0f;
            }
            fVar6.f22620e = f14;
            f14 += fVar6.f22619d + f10;
            i22++;
            i21++;
        }
        this.V = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(boolean z10) {
        boolean z11 = this.f22597k0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f22600n.isFinished()) {
                this.f22600n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f22600n.getCurrX();
                int currY = this.f22600n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        C(currX);
                    }
                }
            }
        }
        this.A = false;
        for (int i10 = 0; i10 < this.f22586f.size(); i10++) {
            f fVar = (f) this.f22586f.get(i10);
            if (fVar.f22618c) {
                fVar.f22618c = false;
                z11 = true;
            }
        }
        if (!z11) {
            return;
        }
        if (z10) {
            m0.i0(this, this.f22595j0);
        } else {
            this.f22595j0.run();
        }
    }

    private int j(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.P || Math.abs(i11) <= this.N) {
            i10 += (int) (f10 + (i10 >= this.f22594j ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f22586f.size() <= 0) {
            return i10;
        }
        ArrayList arrayList = this.f22586f;
        return Math.max(((f) this.f22586f.get(0)).f22617b, Math.min(i10, ((f) arrayList.get(arrayList.size() - 1)).f22617b));
    }

    private void k(int i10, float f10, int i11) {
        j jVar = this.f22582c0;
        if (jVar != null) {
            jVar.a(i10, f10, i11);
        }
        List list = this.f22581b0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = (j) this.f22581b0.get(i12);
                if (jVar2 != null) {
                    jVar2.a(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.f22583d0;
        if (jVar3 != null) {
            jVar3.a(i10, f10, i11);
        }
    }

    private void l(int i10) {
        j jVar = this.f22582c0;
        if (jVar != null) {
            jVar.b(i10);
        }
        List list = this.f22581b0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f22581b0.get(i11);
                if (jVar2 != null) {
                    jVar2.b(i10);
                }
            }
        }
        j jVar3 = this.f22583d0;
        if (jVar3 != null) {
            jVar3.b(i10);
        }
    }

    private void n(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f22589g0 : 0, (Paint) null);
        }
    }

    private void o() {
        this.C = false;
        this.D = false;
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.M = null;
        }
    }

    private Rect q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        int bottom = view.getBottom();
        while (true) {
            rect.bottom = bottom;
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                return rect;
            }
            view = (ViewGroup) parent;
            rect.left += view.getLeft();
            rect.right += view.getRight();
            rect.top += view.getTop();
            bottom = rect.bottom + view.getBottom();
        }
        return rect;
    }

    private void setAdapterViewPagerObserver(m mVar) {
        try {
            Method declaredMethod = l1.a.class.getDeclaredMethod("n", new Class[]{DataSetObserver.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f22592i, new Object[]{mVar});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f22612z != z10) {
            this.f22612z = z10;
        }
    }

    private f t() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f11 = clientWidth > 0 ? ((float) this.f22603q) / ((float) clientWidth) : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        f fVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f22586f.size()) {
            f fVar2 = (f) this.f22586f.get(i11);
            if (!z10 && fVar2.f22617b != (i10 = i12 + 1)) {
                fVar2 = this.f22588g;
                fVar2.f22620e = f10 + f12 + f11;
                fVar2.f22617b = i10;
                fVar2.f22619d = this.f22592i.f(i10);
                i11--;
            }
            f fVar3 = fVar2;
            f10 = fVar3.f22620e;
            float f13 = fVar3.f22619d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return fVar;
            }
            if (scrollX < f13 || i11 == this.f22586f.size() - 1) {
                return fVar3;
            }
            int i13 = fVar3.f22617b;
            float f14 = fVar3.f22619d;
            i11++;
            z10 = false;
            f fVar4 = fVar3;
            i12 = i13;
            f12 = f14;
            fVar = fVar4;
        }
        return fVar;
    }

    private static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean x(float f10, float f11) {
        return (f10 < ((float) this.F) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.F)) && f11 < 0.0f);
    }

    private void z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.L) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.H = motionEvent.getX(i10);
            this.L = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        int i10 = this.f22594j;
        if (i10 <= 0) {
            return false;
        }
        M(i10 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        l1.a aVar = this.f22592i;
        if (aVar == null || this.f22594j >= aVar.d() - 1) {
            return false;
        }
        M(this.f22594j + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void E() {
        F(this.f22594j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r10 >= 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cb, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d9, code lost:
        if (r10 >= 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e7, code lost:
        if (r10 >= 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013d, code lost:
        if (r4 < r0.f22586f.size()) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0148, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015b, code lost:
        if (r4 < r0.f22586f.size()) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016d, code lost:
        if (r4 < r0.f22586f.size()) goto L_0x013f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f22594j
            if (r2 == r1) goto L_0x000f
            com.smarteist.autoimageslider.c$f r2 = r0.u(r2)
            r0.f22594j = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            l1.a r1 = r0.f22592i
            if (r1 != 0) goto L_0x0018
            r17.T()
            return
        L_0x0018:
            boolean r1 = r0.A
            if (r1 == 0) goto L_0x0020
            r17.T()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            l1.a r1 = r0.f22592i
            r1.p(r0)
            int r1 = r0.B
            int r4 = r0.f22594j
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            l1.a r6 = r0.f22592i
            int r6 = r6.d()
            int r7 = r6 + -1
            int r8 = r0.f22594j
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f22584e
            if (r6 != r7) goto L_0x01f0
            r7 = r5
        L_0x004a:
            java.util.ArrayList r8 = r0.f22586f
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList r8 = r0.f22586f
            java.lang.Object r8 = r8.get(r7)
            com.smarteist.autoimageslider.c$f r8 = (com.smarteist.autoimageslider.c.f) r8
            int r9 = r8.f22617b
            int r10 = r0.f22594j
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f22594j
            com.smarteist.autoimageslider.c$f r8 = r0.b(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017d
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList r11 = r0.f22586f
            java.lang.Object r11 = r11.get(r10)
            com.smarteist.autoimageslider.c$f r11 = (com.smarteist.autoimageslider.c.f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = r9
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f22619d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f22594j
            int r3 = r3 + -1
            r15 = r9
        L_0x009d:
            if (r3 < 0) goto L_0x00ee
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00ce
            if (r3 >= r4) goto L_0x00ce
            if (r11 != 0) goto L_0x00a8
            goto L_0x00ee
        L_0x00a8:
            int r5 = r11.f22617b
            if (r3 != r5) goto L_0x00ea
            boolean r5 = r11.f22618c
            if (r5 != 0) goto L_0x00ea
            java.util.ArrayList r5 = r0.f22586f
            r5.remove(r10)
            l1.a r5 = r0.f22592i
            java.lang.Object r11 = r11.f22616a
            r5.a(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00cb
        L_0x00c2:
            java.util.ArrayList r5 = r0.f22586f
            java.lang.Object r5 = r5.get(r10)
            com.smarteist.autoimageslider.c$f r5 = (com.smarteist.autoimageslider.c.f) r5
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            r11 = r5
            goto L_0x00ea
        L_0x00ce:
            if (r11 == 0) goto L_0x00dc
            int r5 = r11.f22617b
            if (r3 != r5) goto L_0x00dc
            float r5 = r11.f22619d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00cb
            goto L_0x00c2
        L_0x00dc:
            int r5 = r10 + 1
            com.smarteist.autoimageslider.c$f r5 = r0.b(r3, r5)
            float r5 = r5.f22619d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00cb
            goto L_0x00c2
        L_0x00ea:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00ee:
            float r3 = r8.f22619d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0171
            java.util.ArrayList r5 = r0.f22586f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0107
            java.util.ArrayList r5 = r0.f22586f
            java.lang.Object r5 = r5.get(r4)
            com.smarteist.autoimageslider.c$f r5 = (com.smarteist.autoimageslider.c.f) r5
            goto L_0x0108
        L_0x0107:
            r5 = 0
        L_0x0108:
            if (r12 > 0) goto L_0x010c
            r10 = r9
            goto L_0x0114
        L_0x010c:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0114:
            int r11 = r0.f22594j
        L_0x0116:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0171
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x014a
            if (r11 <= r1) goto L_0x014a
            if (r5 != 0) goto L_0x0123
            goto L_0x0171
        L_0x0123:
            int r12 = r5.f22617b
            if (r11 != r12) goto L_0x0170
            boolean r12 = r5.f22618c
            if (r12 != 0) goto L_0x0170
            java.util.ArrayList r12 = r0.f22586f
            r12.remove(r4)
            l1.a r12 = r0.f22592i
            java.lang.Object r5 = r5.f22616a
            r12.a(r0, r11, r5)
            java.util.ArrayList r5 = r0.f22586f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0148
        L_0x013f:
            java.util.ArrayList r5 = r0.f22586f
            java.lang.Object r5 = r5.get(r4)
            com.smarteist.autoimageslider.c$f r5 = (com.smarteist.autoimageslider.c.f) r5
            goto L_0x0170
        L_0x0148:
            r5 = 0
            goto L_0x0170
        L_0x014a:
            if (r5 == 0) goto L_0x015e
            int r12 = r5.f22617b
            if (r11 != r12) goto L_0x015e
            float r5 = r5.f22619d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList r5 = r0.f22586f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0148
            goto L_0x013f
        L_0x015e:
            com.smarteist.autoimageslider.c$f r5 = r0.b(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f22619d
            float r3 = r3 + r5
            java.util.ArrayList r5 = r0.f22586f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0148
            goto L_0x013f
        L_0x0170:
            goto L_0x0116
        L_0x0171:
            r0.f(r8, r7, r2)
            l1.a r1 = r0.f22592i
            int r2 = r0.f22594j
            java.lang.Object r3 = r8.f22616a
            r1.m(r0, r2, r3)
        L_0x017d:
            l1.a r1 = r0.f22592i
            r1.c(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0187:
            if (r2 >= r1) goto L_0x01b0
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.smarteist.autoimageslider.c$g r4 = (com.smarteist.autoimageslider.c.g) r4
            r4.f22626f = r2
            boolean r5 = r4.f22621a
            if (r5 != 0) goto L_0x01ad
            float r5 = r4.f22623c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ad
            com.smarteist.autoimageslider.c$f r3 = r0.s(r3)
            if (r3 == 0) goto L_0x01ad
            float r5 = r3.f22619d
            r4.f22623c = r5
            int r3 = r3.f22617b
            r4.f22625e = r3
        L_0x01ad:
            int r2 = r2 + 1
            goto L_0x0187
        L_0x01b0:
            r17.T()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01ef
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c4
            com.smarteist.autoimageslider.c$f r3 = r0.r(r1)
            goto L_0x01c5
        L_0x01c4:
            r3 = 0
        L_0x01c5:
            if (r3 == 0) goto L_0x01cd
            int r1 = r3.f22617b
            int r2 = r0.f22594j
            if (r1 == r2) goto L_0x01ef
        L_0x01cd:
            r5 = 0
        L_0x01ce:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x01ef
            android.view.View r1 = r0.getChildAt(r5)
            com.smarteist.autoimageslider.c$f r2 = r0.s(r1)
            if (r2 == 0) goto L_0x01ec
            int r2 = r2.f22617b
            int r3 = r0.f22594j
            if (r2 != r3) goto L_0x01ec
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x01ec
            goto L_0x01ef
        L_0x01ec:
            int r5 = r5 + 1
            goto L_0x01ce
        L_0x01ef:
            return
        L_0x01f0:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01fd }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01fd }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01fd }
            goto L_0x0205
        L_0x01fd:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0205:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f22584e
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            l1.a r1 = r0.f22592i
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smarteist.autoimageslider.c.F(int):void");
    }

    public void I(j jVar) {
        List list = this.f22581b0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void M(int i10, boolean z10) {
        l1.a aVar = this.f22592i;
        if (aVar instanceof el.a) {
            i10 = ((el.a) aVar).r(i10);
        }
        this.A = false;
        N(i10, z10, false);
    }

    /* access modifiers changed from: package-private */
    public void N(int i10, boolean z10, boolean z11) {
        O(i10, z10, z11, 0);
    }

    /* access modifiers changed from: package-private */
    public void O(int i10, boolean z10, boolean z11, int i11) {
        l1.a aVar = this.f22592i;
        boolean z12 = false;
        if (aVar == null || aVar.d() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z11 || this.f22594j != i10 || this.f22586f.size() == 0) {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f22592i.d()) {
                i10 = this.f22592i.d() - 1;
            }
            int i12 = this.B;
            int i13 = this.f22594j;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f22586f.size(); i14++) {
                    ((f) this.f22586f.get(i14)).f22618c = true;
                }
            }
            if (this.f22594j != i10) {
                z12 = true;
            }
            if (this.U) {
                this.f22594j = i10;
                U(i10);
                requestLayout();
                return;
            }
            F(i10);
            L(i10, z10, i11, z12);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void P(boolean z10, l lVar) {
        Q(z10, lVar, 2);
    }

    public void Q(boolean z10, l lVar, int i10) {
        int i11 = 1;
        boolean z11 = lVar != null;
        boolean z12 = z11 != (this.f22587f0 != null);
        this.f22587f0 = lVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            if (z10) {
                i11 = 2;
            }
            this.f22591h0 = i11;
            this.f22589g0 = i10;
        } else {
            this.f22591h0 = 0;
        }
        if (z12) {
            E();
        }
    }

    public void R(int i10, Interpolator interpolator) {
        if (interpolator != null) {
            this.f22600n = new k(getContext(), i10, interpolator);
        } else {
            this.f22600n = new k(getContext(), i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f22600n;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f22601o ? this.f22600n.getCurrX() : this.f22600n.getStartX();
            this.f22600n.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            h(false);
            E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = (float) clientWidth;
        float f11 = (float) i16;
        float m10 = f11 + (m(Math.min(1.0f, (((float) Math.abs(i14)) * 1.0f) / f10)) * f11);
        int abs = Math.abs(i12);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m10 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i14)) / ((f10 * this.f22592i.f(this.f22594j)) + ((float) this.f22603q))) + 1.0f) * 100.0f), 600);
        this.f22601o = false;
        this.f22600n.startScroll(i13, scrollY, i14, i15, min);
        m0.h0(this);
    }

    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        f s10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f22617b == this.f22594j) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        f s10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f22617b == this.f22594j) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean w10 = gVar.f22621a | w(view);
        gVar.f22621a = w10;
        if (!this.f22611y) {
            super.addView(view, i10, layoutParams);
        } else if (!w10) {
            gVar.f22624d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: package-private */
    public f b(int i10, int i11) {
        f fVar = new f();
        fVar.f22617b = i10;
        fVar.f22616a = this.f22592i.g(this, i10);
        fVar.f22619d = this.f22592i.f(i10);
        if (i11 < 0 || i11 >= this.f22586f.size()) {
            this.f22586f.add(fVar);
        } else {
            this.f22586f.add(i11, fVar);
        }
        return fVar;
    }

    public void c(i iVar) {
        if (this.f22585e0 == null) {
            this.f22585e0 = new ArrayList();
        }
        this.f22585e0.add(iVar);
    }

    public boolean canScrollHorizontally(int i10) {
        if (this.f22592i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f22607u)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f22608v));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f22601o = true;
        if (this.f22600n.isFinished() || !this.f22600n.computeScrollOffset()) {
            h(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f22600n.getCurrX();
        int currY = this.f22600n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!C(currX)) {
                this.f22600n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        m0.h0(this);
    }

    public void d(j jVar) {
        if (this.f22581b0 == null) {
            this.f22581b0 = new ArrayList();
        }
        this.f22581b0.add(jVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f s10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f22617b == this.f22594j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        boolean z10;
        l1.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f22592i) != null && aVar.d() > 1)) {
            if (!this.S.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f22607u * ((float) width));
                this.S.setSize(height, width);
                z10 = this.S.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                z10 = false;
            }
            if (!this.T.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f22608v + 1.0f)) * ((float) width2));
                this.T.setSize(height2, width2);
                z10 |= this.T.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z10) {
                m0.h0(this);
                return;
            }
            return;
        }
        this.S.finish();
        this.T.finish();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f22604r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r2 >= r3) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (r2 <= r3) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        if (r5 != 2) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0063
        L_0x0009:
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r4) goto L_0x0016
            goto L_0x0063
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000f
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L_0x002f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x002f
        L_0x0048:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "SliderPager"
            android.util.Log.e(r2, r0)
            goto L_0x0007
        L_0x0063:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L_0x00a6
            if (r1 == r0) goto L_0x00a6
            if (r5 != r3) goto L_0x008f
            android.graphics.Rect r2 = r4.f22590h
            android.graphics.Rect r2 = r4.q(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f22590h
            android.graphics.Rect r3 = r4.q(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x008a
            if (r2 < r3) goto L_0x008a
            goto L_0x00b9
        L_0x008a:
            boolean r0 = r1.requestFocus()
            goto L_0x00bd
        L_0x008f:
            if (r5 != r2) goto L_0x00b2
            android.graphics.Rect r2 = r4.f22590h
            android.graphics.Rect r2 = r4.q(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f22590h
            android.graphics.Rect r3 = r4.q(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x008a
            if (r2 > r3) goto L_0x008a
            goto L_0x00b4
        L_0x00a6:
            if (r5 == r3) goto L_0x00b9
            r0 = 1
            if (r5 != r0) goto L_0x00ac
            goto L_0x00b9
        L_0x00ac:
            if (r5 == r2) goto L_0x00b4
            r0 = 2
            if (r5 != r0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r0 = 0
            goto L_0x00bd
        L_0x00b4:
            boolean r0 = r4.B()
            goto L_0x00bd
        L_0x00b9:
            boolean r0 = r4.A()
        L_0x00bd:
            if (r0 == 0) goto L_0x00c6
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        L_0x00c6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smarteist.autoimageslider.c.e(int):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean g(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom()) {
                    if (g(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public l1.a getAdapter() {
        return this.f22592i;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f22591h0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        ArrayList arrayList = this.f22593i0;
        if (arrayList == null || arrayList.size() != getChildCount()) {
            T();
        }
        return ((g) ((View) this.f22593i0.get(i11)).getLayoutParams()).f22626f;
    }

    public int getCurrentItem() {
        l1.a aVar = this.f22592i;
        return (!(aVar instanceof el.a) || ((el.a) aVar).t() <= 0) ? this.f22594j : ((el.a) this.f22592i).u(this.f22594j);
    }

    public int getOffscreenPageLimit() {
        return this.B;
    }

    public int getPageMargin() {
        return this.f22603q;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int d10 = this.f22592i.d();
        this.f22584e = d10;
        boolean z10 = this.f22586f.size() < (this.B * 2) + 1 && this.f22586f.size() < d10;
        int i10 = this.f22594j;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f22586f.size()) {
            f fVar = (f) this.f22586f.get(i11);
            int e10 = this.f22592i.e(fVar.f22616a);
            if (e10 != -1) {
                if (e10 == -2) {
                    this.f22586f.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f22592i.p(this);
                        z11 = true;
                    }
                    this.f22592i.a(this, fVar.f22617b, fVar.f22616a);
                    int i12 = this.f22594j;
                    if (i12 == fVar.f22617b) {
                        i10 = Math.max(0, Math.min(i12, d10 - 1));
                    }
                } else {
                    int i13 = fVar.f22617b;
                    if (i13 != e10) {
                        if (i13 == this.f22594j) {
                            i10 = e10;
                        }
                        fVar.f22617b = e10;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f22592i.c(this);
        }
        Collections.sort(this.f22586f, f22577m0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f22621a) {
                    gVar.f22623c = 0.0f;
                }
            }
            N(i10, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public float m(float f10) {
        return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f22595j0);
        Scroller scroller = this.f22600n;
        if (scroller != null && !scroller.isFinished()) {
            this.f22600n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f22603q
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.f22604r
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList r1 = r0.f22586f
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a8
            l1.a r1 = r0.f22592i
            if (r1 == 0) goto L_0x00a8
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f22603q
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList r5 = r0.f22586f
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            com.smarteist.autoimageslider.c$f r5 = (com.smarteist.autoimageslider.c.f) r5
            float r7 = r5.f22620e
            java.util.ArrayList r8 = r0.f22586f
            int r8 = r8.size()
            int r9 = r5.f22617b
            java.util.ArrayList r10 = r0.f22586f
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            com.smarteist.autoimageslider.c$f r10 = (com.smarteist.autoimageslider.c.f) r10
            int r10 = r10.f22617b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a8
        L_0x0047:
            int r11 = r5.f22617b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList r5 = r0.f22586f
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            com.smarteist.autoimageslider.c$f r5 = (com.smarteist.autoimageslider.c.f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0064
            float r7 = r5.f22620e
            float r11 = r5.f22619d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x006f
        L_0x0064:
            l1.a r11 = r0.f22592i
            float r11 = r11.f(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x006f:
            int r11 = r0.f22603q
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0097
            android.graphics.drawable.Drawable r11 = r0.f22604r
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f22605s
            int r15 = r0.f22603q
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f22606t
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f22604r
            r11 = r18
            r3.draw(r11)
            goto L_0x009b
        L_0x0097:
            r11 = r18
            r16 = r3
        L_0x009b:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smarteist.autoimageslider.c.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        try {
            int action = motionEvent.getAction() & 255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.C) {
                            return true;
                        }
                        if (this.D) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        float x10 = motionEvent.getX();
                        this.J = x10;
                        this.H = x10;
                        float y10 = motionEvent.getY();
                        this.K = y10;
                        this.I = y10;
                        this.L = motionEvent2.getPointerId(0);
                        this.D = false;
                        this.f22601o = true;
                        this.f22600n.computeScrollOffset();
                        if (this.f22597k0 != 2 || Math.abs(this.f22600n.getFinalX() - this.f22600n.getCurrX()) <= this.Q) {
                            h(false);
                            this.C = false;
                        } else {
                            this.f22600n.abortAnimation();
                            this.A = false;
                            E();
                            this.C = true;
                            J(true);
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i10 = this.L;
                        if (i10 != -1) {
                            int findPointerIndex = motionEvent2.findPointerIndex(i10);
                            float x11 = motionEvent2.getX(findPointerIndex);
                            float f10 = x11 - this.H;
                            float abs = Math.abs(f10);
                            float y11 = motionEvent2.getY(findPointerIndex);
                            float abs2 = Math.abs(y11 - this.K);
                            int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                            if (i11 != 0 && !x(this.H, f10)) {
                                if (g(this, false, (int) f10, (int) x11, (int) y11)) {
                                    this.H = x11;
                                    this.I = y11;
                                    this.D = true;
                                    return false;
                                }
                            }
                            int i12 = this.G;
                            if (abs > ((float) i12) && abs * 0.5f > abs2) {
                                this.C = true;
                                J(true);
                                setScrollState(1);
                                this.H = i11 > 0 ? this.J + ((float) this.G) : this.J - ((float) this.G);
                                this.I = y11;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) i12)) {
                                this.D = true;
                            }
                            if (this.C && D(x11)) {
                                m0.h0(this);
                            }
                        }
                    } else if (action == 6) {
                        z(motionEvent);
                    }
                    if (this.M == null) {
                        this.M = VelocityTracker.obtain();
                    }
                    this.M.addMovement(motionEvent2);
                    return this.C;
                }
            }
            K();
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            com.smarteist.autoimageslider.c$g r12 = (com.smarteist.autoimageslider.c.g) r12
            boolean r14 = r12.f22621a
            if (r14 == 0) goto L_0x00b4
            int r12 = r12.f22622b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x0061
            r15 = 3
            if (r14 == r15) goto L_0x005b
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006e
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L_0x0055:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L_0x006e
        L_0x005b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006e
        L_0x0061:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x0055
        L_0x006e:
            r15 = 16
            if (r12 == r15) goto L_0x0094
            r15 = 48
            if (r12 == r15) goto L_0x008e
            r15 = 80
            if (r12 == r15) goto L_0x007c
            r12 = r5
            goto L_0x00a1
        L_0x007c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L_0x0088:
            r17 = r12
            r12 = r5
            r5 = r17
            goto L_0x00a1
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x00a1
        L_0x0094:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L_0x0088
        L_0x00a1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00bb:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.smarteist.autoimageslider.c$g r9 = (com.smarteist.autoimageslider.c.g) r9
            boolean r10 = r9.f22621a
            if (r10 != 0) goto L_0x0105
            com.smarteist.autoimageslider.c$f r10 = r0.s(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f22620e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f22624d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f22624d = r14
            float r9 = r9.f22623c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00bb
        L_0x0108:
            r0.f22605s = r5
            int r3 = r3 - r7
            r0.f22606t = r3
            r0.f22580a0 = r11
            boolean r1 = r0.U
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f22594j
            r2 = 0
            r0.L(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.U = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smarteist.autoimageslider.c.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.F = Math.min(measuredWidth / 10, this.E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt.getVisibility() == 8 || (gVar2 = (g) childAt.getLayoutParams()) == null || !gVar2.f22621a)) {
                int i15 = gVar2.f22622b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (!(i16 == 3 || i16 == 5)) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = gVar2.width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = gVar2.height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f22609w = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f22610x = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f22611y = true;
        E();
        this.f22611y = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f22621a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * gVar.f22623c), 1073741824), this.f22610x);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f s10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i13 = 0;
            i11 = 1;
        } else {
            i13 = childCount - 1;
            i12 = -1;
            i11 = -1;
        }
        while (i13 != i12) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f22617b == this.f22594j && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i13 += i11;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.c());
        l1.a aVar = this.f22592i;
        if (aVar != null) {
            aVar.j(nVar.f22632h, nVar.f22633i);
            N(nVar.f22631g, false, true);
            return;
        }
        this.f22596k = nVar.f22631g;
        this.f22598l = nVar.f22632h;
        this.f22599m = nVar.f22633i;
    }

    public Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f22631g = this.f22594j;
        l1.a aVar = this.f22592i;
        if (aVar != null) {
            nVar.f22632h = aVar.k();
        }
        return nVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f22603q;
            G(i10, i12, i14, i14);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.R
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            l1.a r0 = r7.f22592i
            if (r0 == 0) goto L_0x0157
            int r0 = r0.d()
            if (r0 != 0) goto L_0x0020
            goto L_0x0157
        L_0x0020:
            android.view.VelocityTracker r0 = r7.M
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.M = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.M
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x0136
            if (r0 == r1) goto L_0x00e6
            r3 = 2
            if (r0 == r3) goto L_0x0079
            r3 = 3
            if (r0 == r3) goto L_0x006a
            r2 = 5
            if (r0 == r2) goto L_0x0058
            r2 = 6
            if (r0 == r2) goto L_0x0047
            goto L_0x0156
        L_0x0047:
            r7.z(r8)
            int r0 = r7.L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.H = r8
            goto L_0x0156
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r2 = r8.getX(r0)
            r7.H = r2
            int r8 = r8.getPointerId(r0)
        L_0x0066:
            r7.L = r8
            goto L_0x0156
        L_0x006a:
            boolean r8 = r7.C
            if (r8 == 0) goto L_0x0156
            int r8 = r7.f22594j
            r7.L(r8, r1, r2, r2)
        L_0x0073:
            boolean r8 = r7.K()
            goto L_0x0130
        L_0x0079:
            boolean r0 = r7.C
            if (r0 != 0) goto L_0x00d3
            int r0 = r7.L
            int r0 = r8.findPointerIndex(r0)
            r2 = -1
            if (r0 != r2) goto L_0x0087
            goto L_0x0073
        L_0x0087:
            float r2 = r8.getX(r0)
            float r3 = r7.H
            float r3 = r2 - r3
            float r3 = java.lang.Math.abs(r3)
            float r0 = r8.getY(r0)
            float r4 = r7.I
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r7.G
            float r5 = (float) r5
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d3
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d3
            r7.C = r1
            r7.J(r1)
            float r3 = r7.J
            float r2 = r2 - r3
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bc
            int r2 = r7.G
            float r2 = (float) r2
            float r3 = r3 + r2
            goto L_0x00c0
        L_0x00bc:
            int r2 = r7.G
            float r2 = (float) r2
            float r3 = r3 - r2
        L_0x00c0:
            r7.H = r3
            r7.I = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00d3
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00d3:
            boolean r0 = r7.C
            if (r0 == 0) goto L_0x0156
            int r0 = r7.L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.D(r8)
            goto L_0x0130
        L_0x00e6:
            boolean r0 = r7.C
            if (r0 == 0) goto L_0x0156
            android.view.VelocityTracker r0 = r7.M
            int r2 = r7.O
            float r2 = (float) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r3, r2)
            int r2 = r7.L
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.A = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            com.smarteist.autoimageslider.c$f r4 = r7.t()
            int r5 = r7.f22603q
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f22617b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f22620e
            float r3 = r3 - r2
            float r2 = r4.f22619d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.L
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.J
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.j(r6, r3, r0, r8)
            r7.O(r8, r1, r1, r0)
            goto L_0x0073
        L_0x0130:
            if (r8 == 0) goto L_0x0156
            androidx.core.view.m0.h0(r7)
            goto L_0x0156
        L_0x0136:
            android.widget.Scroller r0 = r7.f22600n
            r0.abortAnimation()
            r7.A = r2
            r7.E()
            float r0 = r8.getX()
            r7.J = r0
            r7.H = r0
            float r0 = r8.getY()
            r7.K = r0
            r7.I = r0
            int r8 = r8.getPointerId(r2)
            goto L_0x0066
        L_0x0156:
            return r1
        L_0x0157:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smarteist.autoimageslider.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(KeyEvent keyEvent) {
        int i10;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return e(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return e(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return B();
                } else {
                    i10 = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return A();
            } else {
                i10 = 17;
            }
            return e(i10);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public f r(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public void removeView(View view) {
        if (this.f22611y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    public f s(View view) {
        for (int i10 = 0; i10 < this.f22586f.size(); i10++) {
            f fVar = (f) this.f22586f.get(i10);
            if (this.f22592i.h(view, fVar.f22616a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(l1.a aVar) {
        if (this.f22592i != null) {
            setAdapterViewPagerObserver((m) null);
            this.f22592i.p(this);
            for (int i10 = 0; i10 < this.f22586f.size(); i10++) {
                f fVar = (f) this.f22586f.get(i10);
                this.f22592i.a(this, fVar.f22617b, fVar.f22616a);
            }
            this.f22592i.c(this);
            this.f22586f.clear();
            H();
            this.f22594j = 0;
            scrollTo(0, 0);
        }
        l1.a aVar2 = this.f22592i;
        this.f22592i = aVar;
        this.f22584e = 0;
        if (aVar != null) {
            if (this.f22602p == null) {
                this.f22602p = new m();
            }
            setAdapterViewPagerObserver(this.f22602p);
            try {
                this.f22592i.i(this.f22602p);
            } catch (Exception unused) {
            }
            this.A = false;
            boolean z10 = this.U;
            this.U = true;
            this.f22584e = this.f22592i.d();
            if (this.f22596k >= 0) {
                this.f22592i.j(this.f22598l, this.f22599m);
                N(this.f22596k, false, true);
                this.f22596k = -1;
                this.f22598l = null;
                this.f22599m = null;
            } else if (!z10) {
                E();
            } else {
                requestLayout();
            }
        }
        List list = this.f22585e0;
        if (list != null && !list.isEmpty()) {
            int size = this.f22585e0.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((i) this.f22585e0.get(i11)).d(this, aVar2, aVar);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.A = false;
        M(i10, !this.U);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("SliderPager", "Requested offscreen page limit " + i10 + " too small; defaulting to " + 1);
            i10 = 1;
        }
        if (i10 != this.B) {
            this.B = i10;
            E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f22582c0 = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f22603q;
        this.f22603q = i10;
        int width = getWidth();
        G(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(androidx.core.content.a.e(getContext(), i10));
    }

    public void setScrollDuration(int i10) {
        R(i10, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (this.f22597k0 != i10) {
            this.f22597k0 = i10;
            if (this.f22587f0 != null) {
                n(i10 != 0);
            }
            l(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public f u(int i10) {
        for (int i11 = 0; i11 < this.f22586f.size(); i11++) {
            f fVar = (f) this.f22586f.get(i11);
            if (fVar.f22617b == i10) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f22600n = new k(context, 250, f22578n0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.G = viewConfiguration.getScaledPagingTouchSlop();
        this.N = (int) (400.0f * f10);
        this.O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.S = new EdgeEffect(context);
        this.T = new EdgeEffect(context);
        this.P = (int) (25.0f * f10);
        this.Q = (int) (2.0f * f10);
        this.E = (int) (f10 * 16.0f);
        m0.q0(this, new h());
        if (m0.z(this) == 0) {
            m0.B0(this, 1);
        }
        m0.F0(this, new d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22604r;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f22580a0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L_0x001b:
            if (r7 >= r6) goto L_0x006c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.smarteist.autoimageslider.c$g r9 = (com.smarteist.autoimageslider.c.g) r9
            boolean r10 = r9.f22621a
            if (r10 != 0) goto L_0x002c
            goto L_0x0069
        L_0x002c:
            int r9 = r9.f22622b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x0050
            r10 = 3
            if (r9 == r10) goto L_0x004a
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005d
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L_0x0046:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L_0x005d
        L_0x004a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005d
        L_0x0050:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L_0x0046
        L_0x005d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0068
            r8.offsetLeftAndRight(r3)
        L_0x0068:
            r3 = r9
        L_0x0069:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006c:
            r12.k(r13, r14, r15)
            com.smarteist.autoimageslider.c$l r13 = r12.f22587f0
            if (r13 == 0) goto L_0x00a0
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007b:
            if (r1 >= r14) goto L_0x00a0
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.smarteist.autoimageslider.c$g r0 = (com.smarteist.autoimageslider.c.g) r0
            boolean r0 = r0.f22621a
            if (r0 == 0) goto L_0x008c
            goto L_0x009d
        L_0x008c:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.smarteist.autoimageslider.c$l r3 = r12.f22587f0
            r3.a(r15, r0)
        L_0x009d:
            int r1 = r1 + 1
            goto L_0x007b
        L_0x00a0:
            r12.W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smarteist.autoimageslider.c.y(int, float, int):void");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f22604r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
