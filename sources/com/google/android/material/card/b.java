package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.m0;
import d5.h;
import f5.c;
import i5.d;
import i5.e;
import i5.g;
import i5.k;
import q4.f;
import q4.j;

class b {
    private static final Drawable A = (Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null);

    /* renamed from: z  reason: collision with root package name */
    private static final double f5726z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final MaterialCardView f5727a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f5728b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final g f5729c;

    /* renamed from: d  reason: collision with root package name */
    private final g f5730d;

    /* renamed from: e  reason: collision with root package name */
    private int f5731e;

    /* renamed from: f  reason: collision with root package name */
    private int f5732f;

    /* renamed from: g  reason: collision with root package name */
    private int f5733g;

    /* renamed from: h  reason: collision with root package name */
    private int f5734h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f5735i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f5736j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f5737k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f5738l;

    /* renamed from: m  reason: collision with root package name */
    private k f5739m;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f5740n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f5741o;

    /* renamed from: p  reason: collision with root package name */
    private LayerDrawable f5742p;

    /* renamed from: q  reason: collision with root package name */
    private g f5743q;

    /* renamed from: r  reason: collision with root package name */
    private g f5744r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f5745s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f5746t;

    /* renamed from: u  reason: collision with root package name */
    private ValueAnimator f5747u;

    /* renamed from: v  reason: collision with root package name */
    private final TimeInterpolator f5748v;

    /* renamed from: w  reason: collision with root package name */
    private final int f5749w;

    /* renamed from: x  reason: collision with root package name */
    private final int f5750x;

    /* renamed from: y  reason: collision with root package name */
    private float f5751y = 0.0f;

    class a extends InsetDrawable {
        a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f5727a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f5729c = gVar;
        gVar.M(materialCardView.getContext());
        gVar.b0(-12303292);
        k.b v10 = gVar.D().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, q4.k.f15058j0, i10, j.f14966a);
        int i12 = q4.k.f15068k0;
        if (obtainStyledAttributes.hasValue(i12)) {
            v10.o(obtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f5730d = new g();
        Z(v10.m());
        this.f5748v = h.g(materialCardView.getContext(), q4.b.motionEasingLinearInterpolator, r4.a.f15582a);
        this.f5749w = h.f(materialCardView.getContext(), q4.b.motionDurationShort2, 300);
        this.f5750x = h.f(materialCardView.getContext(), q4.b.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    private Drawable D(Drawable drawable) {
        int i10;
        int i11;
        if (this.f5727a.getUseCompatPadding()) {
            i10 = (int) Math.ceil((double) f());
            i11 = (int) Math.ceil((double) e());
        } else {
            i11 = 0;
            i10 = 0;
        }
        return new a(drawable, i11, i10, i11, i10);
    }

    private boolean G() {
        return (this.f5733g & 80) == 80;
    }

    private boolean H() {
        return (this.f5733g & 8388613) == 8388613;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5736j.setAlpha((int) (255.0f * floatValue));
        this.f5751y = floatValue;
    }

    private float c() {
        return Math.max(Math.max(d(this.f5739m.q(), this.f5729c.F()), d(this.f5739m.s(), this.f5729c.G())), Math.max(d(this.f5739m.k(), this.f5729c.t()), d(this.f5739m.i(), this.f5729c.s())));
    }

    private float d(d dVar, float f10) {
        if (dVar instanceof i5.j) {
            return (float) ((1.0d - f5726z) * ((double) f10));
        }
        if (dVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f5727a.getPreventCornerOverlap() && !g();
    }

    private float e() {
        return this.f5727a.getMaxCardElevation() + (e0() ? c() : 0.0f);
    }

    private boolean e0() {
        return this.f5727a.getPreventCornerOverlap() && g() && this.f5727a.getUseCompatPadding();
    }

    private float f() {
        return (this.f5727a.getMaxCardElevation() * 1.5f) + (e0() ? c() : 0.0f);
    }

    private boolean f0() {
        if (this.f5727a.isClickable()) {
            return true;
        }
        View view = this.f5727a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private boolean g() {
        return this.f5729c.P();
    }

    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g j10 = j();
        this.f5743q = j10;
        j10.W(this.f5737k);
        stateListDrawable.addState(new int[]{16842919}, this.f5743q);
        return stateListDrawable;
    }

    private Drawable i() {
        if (!g5.b.f11634a) {
            return h();
        }
        this.f5744r = j();
        return new RippleDrawable(this.f5737k, (Drawable) null, this.f5744r);
    }

    private g j() {
        return new g(this.f5739m);
    }

    private void j0(Drawable drawable) {
        if (this.f5727a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f5727a.getForeground()).setDrawable(drawable);
        } else {
            this.f5727a.setForeground(D(drawable));
        }
    }

    private void l0() {
        Drawable drawable;
        if (!g5.b.f11634a || (drawable = this.f5741o) == null) {
            g gVar = this.f5743q;
            if (gVar != null) {
                gVar.W(this.f5737k);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f5737k);
    }

    private Drawable t() {
        if (this.f5741o == null) {
            this.f5741o = i();
        }
        if (this.f5742p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f5741o, this.f5730d, this.f5736j});
            this.f5742p = layerDrawable;
            layerDrawable.setId(2, f.mtrl_card_checked_layer_id);
        }
        return this.f5742p;
    }

    private float v() {
        if (!this.f5727a.getPreventCornerOverlap() || !this.f5727a.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - f5726z) * ((double) this.f5727a.getCardViewRadius()));
    }

    /* access modifiers changed from: package-private */
    public ColorStateList A() {
        return this.f5740n;
    }

    /* access modifiers changed from: package-private */
    public int B() {
        return this.f5734h;
    }

    /* access modifiers changed from: package-private */
    public Rect C() {
        return this.f5728b;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.f5745s;
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f5746t;
    }

    /* access modifiers changed from: package-private */
    public void J(TypedArray typedArray) {
        ColorStateList a10 = c.a(this.f5727a.getContext(), typedArray, q4.k.G3);
        this.f5740n = a10;
        if (a10 == null) {
            this.f5740n = ColorStateList.valueOf(-1);
        }
        this.f5734h = typedArray.getDimensionPixelSize(q4.k.H3, 0);
        boolean z10 = typedArray.getBoolean(q4.k.f15201y3, false);
        this.f5746t = z10;
        this.f5727a.setLongClickable(z10);
        this.f5738l = c.a(this.f5727a.getContext(), typedArray, q4.k.E3);
        R(c.d(this.f5727a.getContext(), typedArray, q4.k.A3));
        U(typedArray.getDimensionPixelSize(q4.k.D3, 0));
        T(typedArray.getDimensionPixelSize(q4.k.C3, 0));
        this.f5733g = typedArray.getInteger(q4.k.B3, 8388661);
        ColorStateList a11 = c.a(this.f5727a.getContext(), typedArray, q4.k.F3);
        this.f5737k = a11;
        if (a11 == null) {
            this.f5737k = ColorStateList.valueOf(x4.a.d(this.f5727a, q4.b.f14962g));
        }
        N(c.a(this.f5727a.getContext(), typedArray, q4.k.f15210z3));
        l0();
        i0();
        m0();
        this.f5727a.setBackgroundInternal(D(this.f5729c));
        Drawable t10 = f0() ? t() : this.f5730d;
        this.f5735i = t10;
        this.f5727a.setForeground(D(t10));
    }

    /* access modifiers changed from: package-private */
    public void K(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f5742p != null) {
            if (this.f5727a.getUseCompatPadding()) {
                i13 = (int) Math.ceil((double) (f() * 2.0f));
                i12 = (int) Math.ceil((double) (e() * 2.0f));
            } else {
                i13 = 0;
                i12 = 0;
            }
            int i16 = H() ? ((i10 - this.f5731e) - this.f5732f) - i12 : this.f5731e;
            int i17 = G() ? this.f5731e : ((i11 - this.f5731e) - this.f5732f) - i13;
            int i18 = H() ? this.f5731e : ((i10 - this.f5731e) - this.f5732f) - i12;
            int i19 = G() ? ((i11 - this.f5731e) - this.f5732f) - i13 : this.f5731e;
            if (m0.B(this.f5727a) == 1) {
                i15 = i18;
                i14 = i16;
            } else {
                i14 = i18;
                i15 = i16;
            }
            this.f5742p.setLayerInset(2, i15, i19, i14, i17);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        this.f5745s = z10;
    }

    /* access modifiers changed from: package-private */
    public void M(ColorStateList colorStateList) {
        this.f5729c.W(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void N(ColorStateList colorStateList) {
        g gVar = this.f5730d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.W(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z10) {
        this.f5746t = z10;
    }

    public void P(boolean z10) {
        Q(z10, false);
    }

    public void Q(boolean z10, boolean z11) {
        Drawable drawable = this.f5736j;
        if (drawable == null) {
            return;
        }
        if (z11) {
            b(z10);
            return;
        }
        drawable.setAlpha(z10 ? 255 : 0);
        this.f5751y = z10 ? 1.0f : 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void R(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f5736j = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f5738l);
            P(this.f5727a.isChecked());
        } else {
            this.f5736j = A;
        }
        LayerDrawable layerDrawable = this.f5742p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.mtrl_card_checked_layer_id, this.f5736j);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(int i10) {
        this.f5733g = i10;
        K(this.f5727a.getMeasuredWidth(), this.f5727a.getMeasuredHeight());
    }

    /* access modifiers changed from: package-private */
    public void T(int i10) {
        this.f5731e = i10;
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        this.f5732f = i10;
    }

    /* access modifiers changed from: package-private */
    public void V(ColorStateList colorStateList) {
        this.f5738l = colorStateList;
        Drawable drawable = this.f5736j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void W(float f10) {
        Z(this.f5739m.w(f10));
        this.f5735i.invalidateSelf();
        if (e0() || d0()) {
            h0();
        }
        if (e0()) {
            k0();
        }
    }

    /* access modifiers changed from: package-private */
    public void X(float f10) {
        this.f5729c.X(f10);
        g gVar = this.f5730d;
        if (gVar != null) {
            gVar.X(f10);
        }
        g gVar2 = this.f5744r;
        if (gVar2 != null) {
            gVar2.X(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y(ColorStateList colorStateList) {
        this.f5737k = colorStateList;
        l0();
    }

    /* access modifiers changed from: package-private */
    public void Z(k kVar) {
        this.f5739m = kVar;
        this.f5729c.setShapeAppearanceModel(kVar);
        g gVar = this.f5729c;
        gVar.a0(!gVar.P());
        g gVar2 = this.f5730d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f5744r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        g gVar4 = this.f5743q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(ColorStateList colorStateList) {
        if (this.f5740n != colorStateList) {
            this.f5740n = colorStateList;
            m0();
        }
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f5751y : this.f5751y;
        ValueAnimator valueAnimator = this.f5747u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5747u = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f5751y, f10});
        this.f5747u = ofFloat;
        ofFloat.addUpdateListener(new a(this));
        this.f5747u.setInterpolator(this.f5748v);
        this.f5747u.setDuration((long) (((float) (z10 ? this.f5749w : this.f5750x)) * f11));
        this.f5747u.start();
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10) {
        if (i10 != this.f5734h) {
            this.f5734h = i10;
            m0();
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(int i10, int i11, int i12, int i13) {
        this.f5728b.set(i10, i11, i12, i13);
        h0();
    }

    /* access modifiers changed from: package-private */
    public void g0() {
        Drawable drawable = this.f5735i;
        Drawable t10 = f0() ? t() : this.f5730d;
        this.f5735i = t10;
        if (drawable != t10) {
            j0(t10);
        }
    }

    /* access modifiers changed from: package-private */
    public void h0() {
        int c10 = (int) (((d0() || e0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f5727a;
        Rect rect = this.f5728b;
        materialCardView.g(rect.left + c10, rect.top + c10, rect.right + c10, rect.bottom + c10);
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        this.f5729c.V(this.f5727a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    public void k() {
        Drawable drawable = this.f5741o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f5741o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f5741o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0() {
        if (!E()) {
            this.f5727a.setBackgroundInternal(D(this.f5729c));
        }
        this.f5727a.setForeground(D(this.f5735i));
    }

    /* access modifiers changed from: package-private */
    public g l() {
        return this.f5729c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList m() {
        return this.f5729c.x();
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        this.f5730d.d0((float) this.f5734h, this.f5740n);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList n() {
        return this.f5730d.x();
    }

    /* access modifiers changed from: package-private */
    public Drawable o() {
        return this.f5736j;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f5733g;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.f5731e;
    }

    /* access modifiers changed from: package-private */
    public int r() {
        return this.f5732f;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList s() {
        return this.f5738l;
    }

    /* access modifiers changed from: package-private */
    public float u() {
        return this.f5729c.F();
    }

    /* access modifiers changed from: package-private */
    public float w() {
        return this.f5729c.y();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f5737k;
    }

    /* access modifiers changed from: package-private */
    public k y() {
        return this.f5739m;
    }

    /* access modifiers changed from: package-private */
    public int z() {
        ColorStateList colorStateList = this.f5740n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
