package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.m0;
import com.google.android.material.internal.u;
import f5.c;
import i5.g;
import i5.k;
import i5.n;
import q4.b;

class a {

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f5695u = true;

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f5696v = false;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f5697a;

    /* renamed from: b  reason: collision with root package name */
    private k f5698b;

    /* renamed from: c  reason: collision with root package name */
    private int f5699c;

    /* renamed from: d  reason: collision with root package name */
    private int f5700d;

    /* renamed from: e  reason: collision with root package name */
    private int f5701e;

    /* renamed from: f  reason: collision with root package name */
    private int f5702f;

    /* renamed from: g  reason: collision with root package name */
    private int f5703g;

    /* renamed from: h  reason: collision with root package name */
    private int f5704h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f5705i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f5706j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f5707k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f5708l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f5709m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5710n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5711o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5712p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5713q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f5714r = true;

    /* renamed from: s  reason: collision with root package name */
    private LayerDrawable f5715s;

    /* renamed from: t  reason: collision with root package name */
    private int f5716t;

    a(MaterialButton materialButton, k kVar) {
        this.f5697a = materialButton;
        this.f5698b = kVar;
    }

    private void G(int i10, int i11) {
        int G = m0.G(this.f5697a);
        int paddingTop = this.f5697a.getPaddingTop();
        int F = m0.F(this.f5697a);
        int paddingBottom = this.f5697a.getPaddingBottom();
        int i12 = this.f5701e;
        int i13 = this.f5702f;
        this.f5702f = i11;
        this.f5701e = i10;
        if (!this.f5711o) {
            H();
        }
        m0.G0(this.f5697a, G, (paddingTop + i10) - i12, F, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f5697a.setInternalBackground(a());
        g f10 = f();
        if (f10 != null) {
            f10.V((float) this.f5716t);
            f10.setState(this.f5697a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (!f5696v || this.f5711o) {
            if (f() != null) {
                f().setShapeAppearanceModel(kVar);
            }
            if (n() != null) {
                n().setShapeAppearanceModel(kVar);
            }
            if (e() != null) {
                e().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        int G = m0.G(this.f5697a);
        int paddingTop = this.f5697a.getPaddingTop();
        int F = m0.F(this.f5697a);
        int paddingBottom = this.f5697a.getPaddingBottom();
        H();
        m0.G0(this.f5697a, G, paddingTop, F, paddingBottom);
    }

    private void J() {
        g f10 = f();
        g n10 = n();
        if (f10 != null) {
            f10.d0((float) this.f5704h, this.f5707k);
            if (n10 != null) {
                n10.c0((float) this.f5704h, this.f5710n ? x4.a.d(this.f5697a, b.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f5699c, this.f5701e, this.f5700d, this.f5702f);
    }

    private Drawable a() {
        g gVar = new g(this.f5698b);
        gVar.M(this.f5697a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f5706j);
        PorterDuff.Mode mode = this.f5705i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.d0((float) this.f5704h, this.f5707k);
        g gVar2 = new g(this.f5698b);
        gVar2.setTint(0);
        gVar2.c0((float) this.f5704h, this.f5710n ? x4.a.d(this.f5697a, b.colorSurface) : 0);
        if (f5695u) {
            g gVar3 = new g(this.f5698b);
            this.f5709m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(g5.b.a(this.f5708l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f5709m);
            this.f5715s = rippleDrawable;
            return rippleDrawable;
        }
        g5.a aVar = new g5.a(this.f5698b);
        this.f5709m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, g5.b.a(this.f5708l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f5709m});
        this.f5715s = layerDrawable;
        return K(layerDrawable);
    }

    private g g(boolean z10) {
        LayerDrawable layerDrawable = this.f5715s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f5695u ? (LayerDrawable) ((InsetDrawable) this.f5715s.getDrawable(0)).getDrawable() : this.f5715s).getDrawable(z10 ^ true ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    /* access modifiers changed from: package-private */
    public void A(boolean z10) {
        this.f5710n = z10;
        J();
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        if (this.f5707k != colorStateList) {
            this.f5707k = colorStateList;
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i10) {
        if (this.f5704h != i10) {
            this.f5704h = i10;
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        if (this.f5706j != colorStateList) {
            this.f5706j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f5706j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E(PorterDuff.Mode mode) {
        if (this.f5705i != mode) {
            this.f5705i = mode;
            if (f() != null && this.f5705i != null) {
                androidx.core.graphics.drawable.a.p(f(), this.f5705i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z10) {
        this.f5714r = z10;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f5703g;
    }

    public int c() {
        return this.f5702f;
    }

    public int d() {
        return this.f5701e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f5715s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f5715s.getNumberOfLayers() > 2 ? this.f5715s.getDrawable(2) : this.f5715s.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    public g f() {
        return g(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f5708l;
    }

    /* access modifiers changed from: package-private */
    public k i() {
        return this.f5698b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f5707k;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f5704h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f5706j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f5705i;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f5711o;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f5713q;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f5714r;
    }

    /* access modifiers changed from: package-private */
    public void r(TypedArray typedArray) {
        this.f5699c = typedArray.getDimensionPixelOffset(q4.k.E2, 0);
        this.f5700d = typedArray.getDimensionPixelOffset(q4.k.F2, 0);
        this.f5701e = typedArray.getDimensionPixelOffset(q4.k.G2, 0);
        this.f5702f = typedArray.getDimensionPixelOffset(q4.k.H2, 0);
        int i10 = q4.k.L2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f5703g = dimensionPixelSize;
            z(this.f5698b.w((float) dimensionPixelSize));
            this.f5712p = true;
        }
        this.f5704h = typedArray.getDimensionPixelSize(q4.k.V2, 0);
        this.f5705i = u.i(typedArray.getInt(q4.k.K2, -1), PorterDuff.Mode.SRC_IN);
        this.f5706j = c.a(this.f5697a.getContext(), typedArray, q4.k.J2);
        this.f5707k = c.a(this.f5697a.getContext(), typedArray, q4.k.U2);
        this.f5708l = c.a(this.f5697a.getContext(), typedArray, q4.k.T2);
        this.f5713q = typedArray.getBoolean(q4.k.I2, false);
        this.f5716t = typedArray.getDimensionPixelSize(q4.k.M2, 0);
        this.f5714r = typedArray.getBoolean(q4.k.W2, true);
        int G = m0.G(this.f5697a);
        int paddingTop = this.f5697a.getPaddingTop();
        int F = m0.F(this.f5697a);
        int paddingBottom = this.f5697a.getPaddingBottom();
        if (typedArray.hasValue(q4.k.D2)) {
            t();
        } else {
            H();
        }
        m0.G0(this.f5697a, G + this.f5699c, paddingTop + this.f5701e, F + this.f5700d, paddingBottom + this.f5702f);
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f5711o = true;
        this.f5697a.setSupportBackgroundTintList(this.f5706j);
        this.f5697a.setSupportBackgroundTintMode(this.f5705i);
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z10) {
        this.f5713q = z10;
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        if (!this.f5712p || this.f5703g != i10) {
            this.f5703g = i10;
            this.f5712p = true;
            z(this.f5698b.w((float) i10));
        }
    }

    public void w(int i10) {
        G(this.f5701e, i10);
    }

    public void x(int i10) {
        G(i10, this.f5702f);
    }

    /* access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f5708l != colorStateList) {
            this.f5708l = colorStateList;
            boolean z10 = f5695u;
            if (z10 && (this.f5697a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f5697a.getBackground()).setColor(g5.b.a(colorStateList));
            } else if (!z10 && (this.f5697a.getBackground() instanceof g5.a)) {
                ((g5.a) this.f5697a.getBackground()).setTintList(g5.b.a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(k kVar) {
        this.f5698b = kVar;
        I(kVar);
    }
}
