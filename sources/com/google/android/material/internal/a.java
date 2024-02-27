package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.text.o;
import androidx.core.util.g;
import androidx.core.view.m0;
import f5.a;
import f5.d;
import f5.j;

public final class a {

    /* renamed from: t0  reason: collision with root package name */
    private static final boolean f6078t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    private static final Paint f6079u0 = null;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private f5.a D;
    private f5.a E;
    private TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean J = true;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    private final TextPaint V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* renamed from: a  reason: collision with root package name */
    private final View f6080a;

    /* renamed from: a0  reason: collision with root package name */
    private float f6081a0;

    /* renamed from: b  reason: collision with root package name */
    private float f6082b;

    /* renamed from: b0  reason: collision with root package name */
    private float f6083b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6084c;

    /* renamed from: c0  reason: collision with root package name */
    private ColorStateList f6085c0;

    /* renamed from: d  reason: collision with root package name */
    private float f6086d;

    /* renamed from: d0  reason: collision with root package name */
    private float f6087d0;

    /* renamed from: e  reason: collision with root package name */
    private float f6088e;

    /* renamed from: e0  reason: collision with root package name */
    private float f6089e0;

    /* renamed from: f  reason: collision with root package name */
    private int f6090f;

    /* renamed from: f0  reason: collision with root package name */
    private float f6091f0;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f6092g;

    /* renamed from: g0  reason: collision with root package name */
    private ColorStateList f6093g0;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f6094h;

    /* renamed from: h0  reason: collision with root package name */
    private float f6095h0;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f6096i;

    /* renamed from: i0  reason: collision with root package name */
    private float f6097i0;

    /* renamed from: j  reason: collision with root package name */
    private int f6098j = 16;

    /* renamed from: j0  reason: collision with root package name */
    private float f6099j0;

    /* renamed from: k  reason: collision with root package name */
    private int f6100k = 16;

    /* renamed from: k0  reason: collision with root package name */
    private StaticLayout f6101k0;

    /* renamed from: l  reason: collision with root package name */
    private float f6102l = 15.0f;

    /* renamed from: l0  reason: collision with root package name */
    private float f6103l0;

    /* renamed from: m  reason: collision with root package name */
    private float f6104m = 15.0f;

    /* renamed from: m0  reason: collision with root package name */
    private float f6105m0;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f6106n;

    /* renamed from: n0  reason: collision with root package name */
    private float f6107n0;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f6108o;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f6109o0;

    /* renamed from: p  reason: collision with root package name */
    private int f6110p;

    /* renamed from: p0  reason: collision with root package name */
    private int f6111p0 = 1;

    /* renamed from: q  reason: collision with root package name */
    private float f6112q;

    /* renamed from: q0  reason: collision with root package name */
    private float f6113q0 = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f6114r;

    /* renamed from: r0  reason: collision with root package name */
    private float f6115r0 = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    private float f6116s;

    /* renamed from: s0  reason: collision with root package name */
    private int f6117s0 = n.f6184n;

    /* renamed from: t  reason: collision with root package name */
    private float f6118t;

    /* renamed from: u  reason: collision with root package name */
    private float f6119u;

    /* renamed from: v  reason: collision with root package name */
    private float f6120v;

    /* renamed from: w  reason: collision with root package name */
    private Typeface f6121w;

    /* renamed from: x  reason: collision with root package name */
    private Typeface f6122x;

    /* renamed from: y  reason: collision with root package name */
    private Typeface f6123y;

    /* renamed from: z  reason: collision with root package name */
    private Typeface f6124z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C0103a implements a.C0144a {
        C0103a() {
        }

        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f6080a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f6094h = new Rect();
        this.f6092g = new Rect();
        this.f6096i = new RectF();
        this.f6088e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f6102l);
        textPaint.setTypeface(this.f6124z);
        textPaint.setLetterSpacing(this.f6097i0);
    }

    private void B(float f10) {
        if (this.f6084c) {
            this.f6096i.set(f10 < this.f6088e ? this.f6092g : this.f6094h);
            return;
        }
        this.f6096i.left = G((float) this.f6092g.left, (float) this.f6094h.left, f10, this.X);
        this.f6096i.top = G(this.f6112q, this.f6114r, f10, this.X);
        this.f6096i.right = G((float) this.f6092g.right, (float) this.f6094h.right, f10, this.X);
        this.f6096i.bottom = G((float) this.f6092g.bottom, (float) this.f6094h.bottom, f10, this.X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return m0.B(this.f6080a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? o.f2507d : o.f2506c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return r4.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f6105m0 = f10;
        m0.h0(this.f6080a);
    }

    private boolean U(Typeface typeface) {
        f5.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f6123y == typeface) {
            return false;
        }
        this.f6123y = typeface;
        Typeface b10 = j.b(this.f6080a.getContext().getResources().getConfiguration(), typeface);
        this.f6122x = b10;
        if (b10 == null) {
            b10 = this.f6123y;
        }
        this.f6121w = b10;
        return true;
    }

    private void Y(float f10) {
        this.f6107n0 = f10;
        m0.h0(this.f6080a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i10)) * f11) + (((float) Color.alpha(i11)) * f10)), Math.round((((float) Color.red(i10)) * f11) + (((float) Color.red(i11)) * f10)), Math.round((((float) Color.green(i10)) * f11) + (((float) Color.green(i11)) * f10)), Math.round((((float) Color.blue(i10)) * f11) + (((float) Color.blue(i11)) * f10)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r10) {
        /*
            r9 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.i(r0, r10)
            java.lang.CharSequence r0 = r9.H
            if (r0 == 0) goto L_0x001c
            android.text.StaticLayout r1 = r9.f6101k0
            if (r1 == 0) goto L_0x001c
            android.text.TextPaint r2 = r9.V
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r3 = r9.F
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r0, r2, r1, r3)
            r9.f6109o0 = r0
        L_0x001c:
            java.lang.CharSequence r0 = r9.f6109o0
            r1 = 0
            if (r0 == 0) goto L_0x002a
            android.text.TextPaint r2 = r9.V
            float r0 = r9.I(r2, r0)
            r9.f6103l0 = r0
            goto L_0x002c
        L_0x002a:
            r9.f6103l0 = r1
        L_0x002c:
            int r0 = r9.f6100k
            boolean r2 = r9.I
            int r0 = androidx.core.view.o.b(r0, r2)
            r2 = r0 & 112(0x70, float:1.57E-43)
            r3 = 80
            r4 = 48
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r4) goto L_0x0068
            if (r2 == r3) goto L_0x0059
            android.text.TextPaint r2 = r9.V
            float r2 = r2.descent()
            android.text.TextPaint r6 = r9.V
            float r6 = r6.ascent()
            float r2 = r2 - r6
            float r2 = r2 / r5
            android.graphics.Rect r6 = r9.f6094h
            int r6 = r6.centerY()
            float r6 = (float) r6
            float r6 = r6 - r2
            r9.f6114r = r6
            goto L_0x006e
        L_0x0059:
            android.graphics.Rect r2 = r9.f6094h
            int r2 = r2.bottom
            float r2 = (float) r2
            android.text.TextPaint r6 = r9.V
            float r6 = r6.ascent()
            float r2 = r2 + r6
        L_0x0065:
            r9.f6114r = r2
            goto L_0x006e
        L_0x0068:
            android.graphics.Rect r2 = r9.f6094h
            int r2 = r2.top
            float r2 = (float) r2
            goto L_0x0065
        L_0x006e:
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            r6 = 5
            r7 = 1
            if (r0 == r7) goto L_0x0089
            if (r0 == r6) goto L_0x0080
            android.graphics.Rect r0 = r9.f6094h
            int r0 = r0.left
            float r0 = (float) r0
        L_0x007d:
            r9.f6118t = r0
            goto L_0x0094
        L_0x0080:
            android.graphics.Rect r0 = r9.f6094h
            int r0 = r0.right
            float r0 = (float) r0
            float r8 = r9.f6103l0
        L_0x0087:
            float r0 = r0 - r8
            goto L_0x007d
        L_0x0089:
            android.graphics.Rect r0 = r9.f6094h
            int r0 = r0.centerX()
            float r0 = (float) r0
            float r8 = r9.f6103l0
            float r8 = r8 / r5
            goto L_0x0087
        L_0x0094:
            r9.i(r1, r10)
            android.text.StaticLayout r10 = r9.f6101k0
            if (r10 == 0) goto L_0x00a1
            int r10 = r10.getHeight()
            float r10 = (float) r10
            goto L_0x00a2
        L_0x00a1:
            r10 = r1
        L_0x00a2:
            android.text.StaticLayout r0 = r9.f6101k0
            if (r0 == 0) goto L_0x00b0
            int r8 = r9.f6111p0
            if (r8 <= r7) goto L_0x00b0
            int r0 = r0.getWidth()
            float r1 = (float) r0
            goto L_0x00ba
        L_0x00b0:
            java.lang.CharSequence r0 = r9.H
            if (r0 == 0) goto L_0x00ba
            android.text.TextPaint r1 = r9.V
            float r1 = r9.I(r1, r0)
        L_0x00ba:
            android.text.StaticLayout r0 = r9.f6101k0
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.getLineCount()
            goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            r9.f6110p = r0
            int r0 = r9.f6098j
            boolean r8 = r9.I
            int r0 = androidx.core.view.o.b(r0, r8)
            r8 = r0 & 112(0x70, float:1.57E-43)
            if (r8 == r4) goto L_0x00ee
            if (r8 == r3) goto L_0x00e0
            float r10 = r10 / r5
            android.graphics.Rect r3 = r9.f6092g
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r10
        L_0x00dd:
            r9.f6112q = r3
            goto L_0x00f5
        L_0x00e0:
            android.graphics.Rect r3 = r9.f6092g
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r10
            android.text.TextPaint r10 = r9.V
            float r10 = r10.descent()
            float r3 = r3 + r10
            goto L_0x00dd
        L_0x00ee:
            android.graphics.Rect r10 = r9.f6092g
            int r10 = r10.top
            float r10 = (float) r10
            r9.f6112q = r10
        L_0x00f5:
            r10 = r0 & r2
            if (r10 == r7) goto L_0x010a
            if (r10 == r6) goto L_0x0103
            android.graphics.Rect r10 = r9.f6092g
            int r10 = r10.left
            float r10 = (float) r10
        L_0x0100:
            r9.f6116s = r10
            goto L_0x0113
        L_0x0103:
            android.graphics.Rect r10 = r9.f6092g
            int r10 = r10.right
            float r10 = (float) r10
        L_0x0108:
            float r10 = r10 - r1
            goto L_0x0100
        L_0x010a:
            android.graphics.Rect r10 = r9.f6092g
            int r10 = r10.centerX()
            float r10 = (float) r10
            float r1 = r1 / r5
            goto L_0x0108
        L_0x0113:
            r9.j()
            float r10 = r9.f6082b
            r9.d0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.b(boolean):void");
    }

    private boolean b0(Typeface typeface) {
        f5.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface b10 = j.b(this.f6080a.getContext().getResources().getConfiguration(), typeface);
        this.A = b10;
        if (b10 == null) {
            b10 = this.B;
        }
        this.f6124z = b10;
        return true;
    }

    private void c() {
        g(this.f6082b);
    }

    private float d(float f10) {
        float f11 = this.f6088e;
        return f10 <= f11 ? r4.a.b(1.0f, 0.0f, this.f6086d, f11, f10) : r4.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private void d0(float f10) {
        h(f10);
        boolean z10 = f6078t0 && this.N != 1.0f;
        this.K = z10;
        if (z10) {
            n();
        }
        m0.h0(this.f6080a);
    }

    private float e() {
        float f10 = this.f6086d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean D2 = D();
        return this.J ? F(charSequence, D2) : D2;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f6084c) {
            this.f6119u = G(this.f6116s, this.f6118t, f10, this.X);
            this.f6120v = G(this.f6112q, this.f6114r, f10, this.X);
            d0(f10);
            f11 = f10;
        } else if (f10 < this.f6088e) {
            this.f6119u = this.f6116s;
            this.f6120v = this.f6112q;
            d0(0.0f);
            f11 = 0.0f;
        } else {
            this.f6119u = this.f6118t;
            this.f6120v = this.f6114r - ((float) Math.max(0, this.f6090f));
            d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = r4.a.f15583b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f6108o != this.f6106n) {
            this.V.setColor(a(v(), t(), f11));
        } else {
            this.V.setColor(t());
        }
        float f12 = this.f6095h0;
        float f13 = this.f6097i0;
        if (f12 != f13) {
            this.V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f12);
        }
        this.P = G(this.f6087d0, this.Z, f10, (TimeInterpolator) null);
        this.Q = G(this.f6089e0, this.f6081a0, f10, (TimeInterpolator) null);
        this.R = G(this.f6091f0, this.f6083b0, f10, (TimeInterpolator) null);
        int a10 = a(u(this.f6093g0), u(this.f6085c0), f10);
        this.S = a10;
        this.V.setShadowLayer(this.P, this.Q, this.R, a10);
        if (this.f6084c) {
            this.V.setAlpha((int) (d(f10) * ((float) this.V.getAlpha())));
        }
        m0.h0(this.f6080a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.G != null) {
            float width = (float) this.f6094h.width();
            float width2 = (float) this.f6092g.width();
            if (C(f10, 1.0f)) {
                f12 = this.f6104m;
                f11 = this.f6095h0;
                this.N = 1.0f;
                typeface = this.f6121w;
            } else {
                float f13 = this.f6102l;
                float f14 = this.f6097i0;
                Typeface typeface2 = this.f6124z;
                if (C(f10, 0.0f)) {
                    this.N = 1.0f;
                } else {
                    this.N = G(this.f6102l, this.f6104m, f10, this.Y) / this.f6102l;
                }
                float f15 = this.f6104m / this.f6102l;
                width = (z10 || this.f6084c || width2 * f15 <= width) ? width2 : Math.min(width / f15, width2);
                f12 = f13;
                f11 = f14;
                typeface = typeface2;
            }
            int i10 = 1;
            boolean z11 = false;
            if (width > 0.0f) {
                boolean z12 = this.O != f12;
                boolean z13 = this.f6099j0 != f11;
                boolean z14 = this.C != typeface;
                StaticLayout staticLayout = this.f6101k0;
                boolean z15 = z12 || z13 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.U;
                this.O = f12;
                this.f6099j0 = f11;
                this.C = typeface;
                this.U = false;
                TextPaint textPaint = this.V;
                if (this.N != 1.0f) {
                    z11 = true;
                }
                textPaint.setLinearText(z11);
                z11 = z15;
            }
            if (this.H == null || z11) {
                this.V.setTextSize(this.O);
                this.V.setTypeface(this.C);
                this.V.setLetterSpacing(this.f6099j0);
                this.I = f(this.G);
                if (j0()) {
                    i10 = this.f6111p0;
                }
                StaticLayout k10 = k(i10, width, this.I);
                this.f6101k0 = k10;
                this.H = k10.getText();
            }
        }
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private boolean j0() {
        return this.f6111p0 > 1 && (!this.I || this.f6084c) && !this.K;
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) g.g(n.b(this.G, this.V, (int) f10).d(this.F).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f6113q0, this.f6115r0).e(this.f6117s0).j((o) null).a());
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f6084c) {
            this.V.setAlpha((int) (this.f6107n0 * ((float) alpha)));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, x4.a.a(this.S, textPaint.getAlpha()));
            }
            Canvas canvas2 = canvas;
            this.f6101k0.draw(canvas);
        } else {
            Canvas canvas3 = canvas;
        }
        if (!this.f6084c) {
            this.V.setAlpha((int) (this.f6105m0 * ((float) alpha)));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, x4.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f6101k0.getLineBaseline(0);
        CharSequence charSequence = this.f6109o0;
        float f12 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (!this.f6084c) {
            String trim = this.f6109o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f6101k0.getLineEnd(0), str.length()), 0.0f, f12, this.V);
        }
    }

    private void n() {
        if (this.L == null && !this.f6092g.isEmpty() && !TextUtils.isEmpty(this.H)) {
            g(0.0f);
            int width = this.f6101k0.getWidth();
            int height = this.f6101k0.getHeight();
            if (width > 0 && height > 0) {
                this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f6101k0.draw(new Canvas(this.L));
                if (this.M == null) {
                    this.M = new Paint(3);
                }
            }
        }
    }

    private float r(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (((float) i10) / 2.0f) - (this.f6103l0 / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? (float) this.f6094h.left : ((float) this.f6094h.right) - this.f6103l0 : this.I ? ((float) this.f6094h.right) - this.f6103l0 : (float) this.f6094h.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (((float) i10) / 2.0f) + (this.f6103l0 / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? rectF.left + this.f6103l0 : (float) this.f6094h.right : this.I ? (float) this.f6094h.right : rectF.left + this.f6103l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f6106n);
    }

    private Layout.Alignment y() {
        int b10 = androidx.core.view.o.b(this.f6098j, this.I ? 1 : 0) & 7;
        if (b10 != 1) {
            return b10 != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f6104m);
        textPaint.setTypeface(this.f6121w);
        textPaint.setLetterSpacing(this.f6095h0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f6106n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6108o
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f6106n
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.E():boolean");
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f6123y;
            if (typeface != null) {
                this.f6122x = j.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f6122x;
            if (typeface3 == null) {
                typeface3 = this.f6123y;
            }
            this.f6121w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f6124z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z10) {
        if ((this.f6080a.getHeight() > 0 && this.f6080a.getWidth() > 0) || z10) {
            b(z10);
            c();
        }
    }

    public void M(ColorStateList colorStateList) {
        if (this.f6108o != colorStateList || this.f6106n != colorStateList) {
            this.f6108o = colorStateList;
            this.f6106n = colorStateList;
            J();
        }
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (!L(this.f6094h, i10, i11, i12, i13)) {
            this.f6094h.set(i10, i11, i12, i13);
            this.U = true;
        }
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        d dVar = new d(this.f6080a.getContext(), i10);
        if (dVar.i() != null) {
            this.f6108o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f6104m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f11333c;
        if (colorStateList != null) {
            this.f6085c0 = colorStateList;
        }
        this.f6081a0 = dVar.f11338h;
        this.f6083b0 = dVar.f11339i;
        this.Z = dVar.f11340j;
        this.f6095h0 = dVar.f11342l;
        f5.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new f5.a(new C0103a(), dVar.e());
        dVar.h(this.f6080a.getContext(), this.E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f6108o != colorStateList) {
            this.f6108o = colorStateList;
            J();
        }
    }

    public void S(int i10) {
        if (this.f6100k != i10) {
            this.f6100k = i10;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (!L(this.f6092g, i10, i11, i12, i13)) {
            this.f6092g.set(i10, i11, i12, i13);
            this.U = true;
        }
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f6097i0 != f10) {
            this.f6097i0 = f10;
            J();
        }
    }

    public void Z(int i10) {
        if (this.f6098j != i10) {
            this.f6098j = i10;
            J();
        }
    }

    public void a0(float f10) {
        if (this.f6102l != f10) {
            this.f6102l = f10;
            J();
        }
    }

    public void c0(float f10) {
        float a10 = y.a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f6082b) {
            this.f6082b = a10;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean U2 = U(typeface);
        boolean b02 = b0(typeface);
        if (U2 || b02) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.H != null && this.f6096i.width() > 0.0f && this.f6096i.height() > 0.0f) {
            this.V.setTextSize(this.O);
            float f10 = this.f6119u;
            float f11 = this.f6120v;
            boolean z10 = this.K && this.L != null;
            float f12 = this.N;
            if (f12 != 1.0f && !this.f6084c) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (z10) {
                canvas.drawBitmap(this.L, f10, f11, this.M);
                canvas.restoreToCount(save);
                return;
            }
            if (!j0() || (this.f6084c && this.f6082b <= this.f6088e)) {
                canvas.translate(f10, f11);
                this.f6101k0.draw(canvas);
            } else {
                m(canvas, this.f6119u - ((float) this.f6101k0.getLineStart(0)), f11);
            }
            canvas.restoreToCount(save);
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = Math.max(r(i10, i11), (float) this.f6094h.left);
        rectF.top = (float) this.f6094h.top;
        rectF.right = Math.min(s(rectF, i10, i11), (float) this.f6094h.right);
        rectF.bottom = ((float) this.f6094h.top) + q();
    }

    public ColorStateList p() {
        return this.f6108o;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public int t() {
        return u(this.f6108o);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.f6082b;
    }
}
