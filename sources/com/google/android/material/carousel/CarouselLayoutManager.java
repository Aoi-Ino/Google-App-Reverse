package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.carousel.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q4.k;

public class CarouselLayoutManager extends RecyclerView.p implements b, RecyclerView.z.b {
    private int A;
    private Map B;
    private c C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;

    /* renamed from: s  reason: collision with root package name */
    int f5753s;

    /* renamed from: t  reason: collision with root package name */
    int f5754t;

    /* renamed from: u  reason: collision with root package name */
    int f5755u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5756v;

    /* renamed from: w  reason: collision with root package name */
    private final c f5757w;

    /* renamed from: x  reason: collision with root package name */
    private d f5758x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public g f5759y;

    /* renamed from: z  reason: collision with root package name */
    private f f5760z;

    class a extends g {
        a(Context context) {
            super(context);
        }

        public PointF a(int i10) {
            return CarouselLayoutManager.this.d(i10);
        }

        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f5759y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.n0(view));
        }

        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f5759y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.n0(view));
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        final View f5762a;

        /* renamed from: b  reason: collision with root package name */
        final float f5763b;

        /* renamed from: c  reason: collision with root package name */
        final float f5764c;

        /* renamed from: d  reason: collision with root package name */
        final d f5765d;

        b(View view, float f10, float f11, d dVar) {
            this.f5762a = view;
            this.f5763b = f10;
            this.f5764c = f11;
            this.f5765d = dVar;
        }
    }

    private static class c extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Paint f5766a;

        /* renamed from: b  reason: collision with root package name */
        private List f5767b = Collections.unmodifiableList(new ArrayList());

        c() {
            Paint paint = new Paint();
            this.f5766a = paint;
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            float X1;
            float f10;
            float Y1;
            float f11;
            super.i(canvas, recyclerView, a0Var);
            this.f5766a.setStrokeWidth(recyclerView.getResources().getDimension(q4.d.m3_carousel_debug_keyline_width));
            for (f.c cVar : this.f5767b) {
                this.f5766a.setColor(androidx.core.graphics.a.c(-65281, -16776961, cVar.f5796c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    X1 = cVar.f5795b;
                    f10 = (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2();
                    Y1 = cVar.f5795b;
                    f11 = (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2();
                } else {
                    X1 = (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).x2();
                    f10 = cVar.f5795b;
                    Y1 = (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2();
                    f11 = cVar.f5795b;
                }
                canvas.drawLine(X1, f10, Y1, f11, this.f5766a);
            }
        }

        /* access modifiers changed from: package-private */
        public void j(List list) {
            this.f5767b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final f.c f5768a;

        /* renamed from: b  reason: collision with root package name */
        final f.c f5769b;

        d(f.c cVar, f.c cVar2) {
            androidx.core.util.g.a(cVar.f5794a <= cVar2.f5794a);
            this.f5768a = cVar;
            this.f5769b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    /* access modifiers changed from: private */
    public int A2() {
        return this.C.j();
    }

    private int B2(int i10, f fVar) {
        return E2() ? (int) (((((float) p2()) - fVar.h().f5794a) - (((float) i10) * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((((float) i10) * fVar.f()) - fVar.a().f5794a) + (fVar.f() / 2.0f));
    }

    private int C2(int i10, f fVar) {
        int i11 = Integer.MAX_VALUE;
        for (f.c cVar : fVar.e()) {
            float f10 = (((float) i10) * fVar.f()) + (fVar.f() / 2.0f);
            int p22 = (E2() ? (int) ((((float) p2()) - cVar.f5794a) - f10) : (int) (f10 - cVar.f5794a)) - this.f5753s;
            if (Math.abs(i11) > Math.abs(p22)) {
                i11 = p22;
            }
        }
        return i11;
    }

    private static d D2(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            f.c cVar = (f.c) list.get(i14);
            float f15 = z10 ? cVar.f5795b : cVar.f5794a;
            float abs = Math.abs(f15 - f10);
            if (f15 <= f10 && abs <= f11) {
                i10 = i14;
                f11 = abs;
            }
            if (f15 > f10 && abs <= f13) {
                i12 = i14;
                f13 = abs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((f.c) list.get(i10), (f.c) list.get(i12));
    }

    private boolean F2(float f10, d dVar) {
        float b22 = b2(f10, s2(f10, dVar) / 2.0f);
        if (E2()) {
            if (b22 >= 0.0f) {
                return false;
            }
        } else if (b22 <= ((float) p2())) {
            return false;
        }
        return true;
    }

    private boolean G2(float f10, d dVar) {
        float a22 = a2(f10, s2(f10, dVar) / 2.0f);
        if (E2()) {
            if (a22 <= ((float) p2())) {
                return false;
            }
        } else if (a22 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H2(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
            view.post(new u4.b(this));
        }
    }

    private void I2() {
        if (this.f5756v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < O(); i10++) {
                View N = N(i10);
                float q22 = q2(N);
                Log.d("CarouselLayoutManager", "item position " + n0(N) + ", center:" + q22 + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b J2(RecyclerView.v vVar, float f10, int i10) {
        View o10 = vVar.o(i10);
        G0(o10, 0, 0);
        float a22 = a2(f10, this.f5760z.f() / 2.0f);
        d D2 = D2(this.f5760z.g(), a22, false);
        return new b(o10, a22, f2(o10, a22, D2), D2);
    }

    private float K2(View view, float f10, float f11, Rect rect) {
        float a22 = a2(f10, f11);
        d D2 = D2(this.f5760z.g(), a22, false);
        float f22 = f2(view, a22, D2);
        super.U(view, rect);
        U2(view, a22, D2);
        this.C.l(view, rect, f11, f22);
        return f22;
    }

    private void L2(RecyclerView.v vVar) {
        View o10 = vVar.o(0);
        G0(o10, 0, 0);
        f c10 = this.f5758x.c(this, o10);
        if (E2()) {
            c10 = f.m(c10, (float) p2());
        }
        this.f5759y = g.f(this, c10);
    }

    /* access modifiers changed from: private */
    public void M2() {
        this.f5759y = null;
        z1();
    }

    private void N2(RecyclerView.v vVar) {
        while (O() > 0) {
            View N = N(0);
            float q22 = q2(N);
            if (!G2(q22, D2(this.f5760z.g(), q22, true))) {
                break;
            }
            s1(N, vVar);
        }
        while (O() - 1 >= 0) {
            View N2 = N(O() - 1);
            float q23 = q2(N2);
            if (F2(q23, D2(this.f5760z.g(), q23, true))) {
                s1(N2, vVar);
            } else {
                return;
            }
        }
    }

    private int O2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f5759y == null) {
            L2(vVar);
        }
        int j22 = j2(i10, this.f5753s, this.f5754t, this.f5755u);
        this.f5753s += j22;
        V2(this.f5759y);
        float f10 = this.f5760z.f() / 2.0f;
        float g22 = g2(n0(N(0)));
        Rect rect = new Rect();
        float f11 = (E2() ? this.f5760z.h() : this.f5760z.a()).f5795b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < O(); i11++) {
            View N = N(i11);
            float abs = Math.abs(f11 - K2(N, g22, f10, rect));
            if (N != null && abs < f12) {
                this.F = n0(N);
                f12 = abs;
            }
            g22 = a2(g22, this.f5760z.f());
        }
        m2(vVar, a0Var);
        return j22;
    }

    private void P2(RecyclerView recyclerView, int i10) {
        if (f()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    private void R2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f15078l0);
            Q2(obtainStyledAttributes.getInt(k.f15088m0, 0));
            T2(obtainStyledAttributes.getInt(k.f15176v5, 0));
            obtainStyledAttributes.recycle();
        }
    }

    private void U2(View view, float f10, d dVar) {
    }

    private void V2(g gVar) {
        int i10 = this.f5755u;
        int i11 = this.f5754t;
        this.f5760z = i10 <= i11 ? E2() ? gVar.h() : gVar.l() : gVar.j((float) this.f5753s, (float) i11, (float) i10);
        this.f5757w.j(this.f5760z.g());
    }

    private void W2() {
        int e10 = e();
        int i10 = this.E;
        if (e10 != i10 && this.f5759y != null) {
            if (this.f5758x.d(this, i10)) {
                M2();
            }
            this.E = e10;
        }
    }

    private void X2() {
        if (this.f5756v && O() >= 1) {
            int i10 = 0;
            while (i10 < O() - 1) {
                int n02 = n0(N(i10));
                int i11 = i10 + 1;
                int n03 = n0(N(i11));
                if (n02 <= n03) {
                    i10 = i11;
                } else {
                    I2();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + n02 + "] and child at index [" + i11 + "] had adapter position [" + n03 + "].");
                }
            }
        }
    }

    private void Z1(View view, int i10, b bVar) {
        float f10 = this.f5760z.f() / 2.0f;
        j(view, i10);
        float f11 = bVar.f5764c;
        this.C.k(view, (int) (f11 - f10), (int) (f11 + f10));
        U2(view, bVar.f5763b, bVar.f5765d);
    }

    private float a2(float f10, float f11) {
        return E2() ? f10 - f11 : f10 + f11;
    }

    private float b2(float f10, float f11) {
        return E2() ? f10 + f11 : f10 - f11;
    }

    private void c2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 >= 0 && i10 < e()) {
            b J2 = J2(vVar, g2(i10), i10);
            Z1(J2.f5762a, i11, J2);
        }
    }

    private void d2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        float g22 = g2(i10);
        while (i10 < a0Var.b()) {
            b J2 = J2(vVar, g22, i10);
            if (!F2(J2.f5764c, J2.f5765d)) {
                g22 = a2(g22, this.f5760z.f());
                if (!G2(J2.f5764c, J2.f5765d)) {
                    Z1(J2.f5762a, -1, J2);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void e2(RecyclerView.v vVar, int i10) {
        float g22 = g2(i10);
        while (i10 >= 0) {
            b J2 = J2(vVar, g22, i10);
            if (!G2(J2.f5764c, J2.f5765d)) {
                g22 = b2(g22, this.f5760z.f());
                if (!F2(J2.f5764c, J2.f5765d)) {
                    Z1(J2.f5762a, 0, J2);
                }
                i10--;
            } else {
                return;
            }
        }
    }

    private float f2(View view, float f10, d dVar) {
        f.c cVar = dVar.f5768a;
        float f11 = cVar.f5795b;
        f.c cVar2 = dVar.f5769b;
        float b10 = r4.a.b(f11, cVar2.f5795b, cVar.f5794a, cVar2.f5794a, f10);
        if (dVar.f5769b != this.f5760z.c() && dVar.f5768a != this.f5760z.j()) {
            return b10;
        }
        float d10 = this.C.d((RecyclerView.q) view.getLayoutParams()) / this.f5760z.f();
        f.c cVar3 = dVar.f5769b;
        return b10 + ((f10 - cVar3.f5794a) * ((1.0f - cVar3.f5796c) + d10));
    }

    private float g2(int i10) {
        return a2((float) (z2() - this.f5753s), this.f5760z.f() * ((float) i10));
    }

    private int h2(RecyclerView.a0 a0Var, g gVar) {
        boolean E2 = E2();
        f l10 = E2 ? gVar.l() : gVar.h();
        f.c a10 = E2 ? l10.a() : l10.h();
        int b10 = (int) (((((((float) (a0Var.b() - 1)) * l10.f()) + ((float) i0())) * (E2 ? -1.0f : 1.0f)) - (a10.f5794a - ((float) z2()))) + (((float) w2()) - a10.f5794a));
        return E2 ? Math.min(0, b10) : Math.max(0, b10);
    }

    private static int j2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    private int k2(g gVar) {
        boolean E2 = E2();
        f h10 = E2 ? gVar.h() : gVar.l();
        return (int) ((((float) (l0() * (E2 ? 1 : -1))) + ((float) z2())) - b2((E2 ? h10.h() : h10.a()).f5794a, h10.f() / 2.0f));
    }

    private int l2(int i10) {
        int u22 = u2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 17) {
            if (i10 == 33) {
                return u22 == 1 ? -1 : Integer.MIN_VALUE;
            }
            if (i10 != 66) {
                if (i10 == 130) {
                    return u22 == 1 ? 1 : Integer.MIN_VALUE;
                }
                Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
                return Integer.MIN_VALUE;
            } else if (u22 == 0) {
                return E2() ? -1 : 1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (u22 == 0) {
            return E2() ? 1 : -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    private void m2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        N2(vVar);
        if (O() == 0) {
            e2(vVar, this.A - 1);
            d2(vVar, a0Var, this.A);
        } else {
            int n02 = n0(N(0));
            int n03 = n0(N(O() - 1));
            e2(vVar, n02 - 1);
            d2(vVar, a0Var, n03 + 1);
        }
        X2();
    }

    private View n2() {
        return N(E2() ? 0 : O() - 1);
    }

    private View o2() {
        return N(E2() ? O() - 1 : 0);
    }

    private int p2() {
        return f() ? a() : c();
    }

    private float q2(View view) {
        Rect rect = new Rect();
        super.U(view, rect);
        return (float) (f() ? rect.centerX() : rect.centerY());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (com.google.android.material.carousel.f) r0.get(java.lang.Integer.valueOf(y.a.b(r4, 0, java.lang.Math.max(0, e() - 1))));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.material.carousel.f r2(int r4) {
        /*
            r3 = this;
            java.util.Map r0 = r3.B
            if (r0 == 0) goto L_0x0020
            int r1 = r3.e()
            int r1 = r1 + -1
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r4 = y.a.b(r4, r2, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.material.carousel.f r4 = (com.google.android.material.carousel.f) r4
            if (r4 == 0) goto L_0x0020
            return r4
        L_0x0020:
            com.google.android.material.carousel.g r4 = r3.f5759y
            com.google.android.material.carousel.f r4 = r4.g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.r2(int):com.google.android.material.carousel.f");
    }

    private float s2(float f10, d dVar) {
        f.c cVar = dVar.f5768a;
        float f11 = cVar.f5797d;
        f.c cVar2 = dVar.f5769b;
        return r4.a.b(f11, cVar2.f5797d, cVar.f5795b, cVar2.f5795b, f10);
    }

    /* access modifiers changed from: private */
    public int v2() {
        return this.C.e();
    }

    private int w2() {
        return this.C.f();
    }

    /* access modifiers changed from: private */
    public int x2() {
        return this.C.g();
    }

    /* access modifiers changed from: private */
    public int y2() {
        return this.C.h();
    }

    private int z2() {
        return this.C.i();
    }

    public int A(RecyclerView.a0 a0Var) {
        return this.f5755u - this.f5754t;
    }

    public int C1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (p()) {
            return O2(i10, vVar, a0Var);
        }
        return 0;
    }

    public void D1(int i10) {
        this.F = i10;
        if (this.f5759y != null) {
            this.f5753s = B2(i10, r2(i10));
            this.A = y.a.b(i10, 0, Math.max(0, e() - 1));
            V2(this.f5759y);
            z1();
        }
    }

    public int E1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (q()) {
            return O2(i10, vVar, a0Var);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean E2() {
        return f() && d0() == 1;
    }

    public void G0(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    public void M0(RecyclerView recyclerView) {
        super.M0(recyclerView);
        M2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    public void O0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.O0(recyclerView, vVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    public void O1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        P1(aVar);
    }

    public View P0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int l22;
        if (O() == 0 || (l22 = l2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        int n02 = n0(view);
        if (l22 == -1) {
            if (n02 == 0) {
                return null;
            }
            c2(vVar, n0(N(0)) - 1, 0);
            return o2();
        } else if (n02 == e() - 1) {
            return null;
        } else {
            c2(vVar, n0(N(O() - 1)) + 1, -1);
            return n2();
        }
    }

    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(n0(N(0)));
            accessibilityEvent.setToIndex(n0(N(O() - 1)));
        }
    }

    public void Q2(int i10) {
        this.G = i10;
        M2();
    }

    public void S2(d dVar) {
        this.f5758x = dVar;
        M2();
    }

    public void T2(int i10) {
        if (i10 == 0 || i10 == 1) {
            l((String) null);
            c cVar = this.C;
            if (cVar == null || i10 != cVar.f5778a) {
                this.C = c.b(this, i10);
                M2();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public void U(View view, Rect rect) {
        super.U(view, rect);
        float centerY = (float) rect.centerY();
        if (f()) {
            centerY = (float) rect.centerX();
        }
        float s22 = s2(centerY, D2(this.f5760z.g(), centerY, true));
        float f10 = 0.0f;
        float width = f() ? (((float) rect.width()) - s22) / 2.0f : 0.0f;
        if (!f()) {
            f10 = (((float) rect.height()) - s22) / 2.0f;
        }
        rect.set((int) (((float) rect.left) + width), (int) (((float) rect.top) + f10), (int) (((float) rect.right) - width), (int) (((float) rect.bottom) - f10));
    }

    public void X0(RecyclerView recyclerView, int i10, int i11) {
        super.X0(recyclerView, i10, i11);
        W2();
    }

    public int a() {
        return u0();
    }

    public void a1(RecyclerView recyclerView, int i10, int i11) {
        super.a1(recyclerView, i10, i11);
        W2();
    }

    public int b() {
        return this.G;
    }

    public int c() {
        return b0();
    }

    public PointF d(int i10) {
        if (this.f5759y == null) {
            return null;
        }
        int t22 = t2(i10, r2(i10));
        return f() ? new PointF((float) t22, 0.0f) : new PointF(0.0f, (float) t22);
    }

    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.b() <= 0 || ((float) p2()) <= 0.0f) {
            q1(vVar);
            this.A = 0;
            return;
        }
        boolean E2 = E2();
        boolean z10 = this.f5759y == null;
        if (z10) {
            L2(vVar);
        }
        int k22 = k2(this.f5759y);
        int h22 = h2(a0Var, this.f5759y);
        this.f5754t = E2 ? h22 : k22;
        if (E2) {
            h22 = k22;
        }
        this.f5755u = h22;
        if (z10) {
            this.f5753s = k22;
            this.B = this.f5759y.i(e(), this.f5754t, this.f5755u, E2());
            int i10 = this.F;
            if (i10 != -1) {
                this.f5753s = B2(i10, r2(i10));
            }
        }
        int i11 = this.f5753s;
        this.f5753s = i11 + j2(0, i11, this.f5754t, this.f5755u);
        this.A = y.a.b(this.A, 0, a0Var.b());
        V2(this.f5759y);
        B(vVar);
        m2(vVar, a0Var);
        this.E = e();
    }

    public void e1(RecyclerView.a0 a0Var) {
        super.e1(a0Var);
        if (O() == 0) {
            this.A = 0;
        } else {
            this.A = n0(N(0));
        }
        X2();
    }

    public boolean f() {
        return this.C.f5778a == 0;
    }

    /* access modifiers changed from: package-private */
    public int i2(int i10) {
        return (int) (((float) this.f5753s) - ((float) B2(i10, r2(i10))));
    }

    public boolean p() {
        return f();
    }

    public boolean q() {
        return !f();
    }

    /* access modifiers changed from: package-private */
    public int t2(int i10, f fVar) {
        return B2(i10, fVar) - this.f5753s;
    }

    public int u2() {
        return this.C.f5778a;
    }

    public int v(RecyclerView.a0 a0Var) {
        if (O() == 0 || this.f5759y == null || e() <= 1) {
            return 0;
        }
        return (int) (((float) u0()) * (this.f5759y.g().f() / ((float) x(a0Var))));
    }

    public int w(RecyclerView.a0 a0Var) {
        return this.f5753s;
    }

    public int x(RecyclerView.a0 a0Var) {
        return this.f5755u - this.f5754t;
    }

    public int y(RecyclerView.a0 a0Var) {
        if (O() == 0 || this.f5759y == null || e() <= 1) {
            return 0;
        }
        return (int) (((float) b0()) * (this.f5759y.g().f() / ((float) A(a0Var))));
    }

    public boolean y1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int C2;
        if (this.f5759y == null || (C2 = C2(n0(view), r2(n0(view)))) == 0) {
            return false;
        }
        P2(recyclerView, C2(n0(view), this.f5759y.j((float) (this.f5753s + j2(C2, this.f5753s, this.f5754t, this.f5755u)), (float) this.f5754t, (float) this.f5755u)));
        return true;
    }

    public int z(RecyclerView.a0 a0Var) {
        return this.f5753s;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f5756v = false;
        this.f5757w = new c();
        this.A = 0;
        this.D = new u4.a(this);
        this.F = -1;
        this.G = 0;
        S2(new h());
        R2(context, attributeSet);
    }

    public CarouselLayoutManager(d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(d dVar, int i10) {
        this.f5756v = false;
        this.f5757w = new c();
        this.A = 0;
        this.D = new u4.a(this);
        this.F = -1;
        this.G = 0;
        S2(dVar);
        T2(i10);
    }
}
