package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.p;
import com.google.android.material.internal.u;
import f5.d;
import g5.b;
import i5.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import r4.f;
import z4.e;

public class a extends g implements Drawable.Callback, p.b {
    private static final int[] N0 = {16842910};
    private static final ShapeDrawable O0 = new ShapeDrawable(new OvalShape());
    private int A0 = 255;
    private ColorFilter B0;
    private PorterDuffColorFilter C0;
    private ColorStateList D;
    private ColorStateList D0;
    private ColorStateList E;
    private PorterDuff.Mode E0 = PorterDuff.Mode.SRC_IN;
    private float F;
    private int[] F0;
    private float G = -1.0f;
    private boolean G0;
    private ColorStateList H;
    private ColorStateList H0;
    private float I;
    private WeakReference I0 = new WeakReference((Object) null);
    private ColorStateList J;
    private TextUtils.TruncateAt J0;
    private CharSequence K;
    private boolean K0;
    private boolean L;
    private int L0;
    private Drawable M;
    private boolean M0;
    private ColorStateList N;
    private float O;
    private boolean P;
    private boolean Q;
    private Drawable R;
    private Drawable S;
    private ColorStateList T;
    private float U;
    private CharSequence V;
    private boolean W;
    private boolean X;
    private Drawable Y;
    private ColorStateList Z;

    /* renamed from: a0  reason: collision with root package name */
    private f f5831a0;

    /* renamed from: b0  reason: collision with root package name */
    private f f5832b0;

    /* renamed from: c0  reason: collision with root package name */
    private float f5833c0;

    /* renamed from: d0  reason: collision with root package name */
    private float f5834d0;

    /* renamed from: e0  reason: collision with root package name */
    private float f5835e0;

    /* renamed from: f0  reason: collision with root package name */
    private float f5836f0;

    /* renamed from: g0  reason: collision with root package name */
    private float f5837g0;

    /* renamed from: h0  reason: collision with root package name */
    private float f5838h0;

    /* renamed from: i0  reason: collision with root package name */
    private float f5839i0;

    /* renamed from: j0  reason: collision with root package name */
    private float f5840j0;

    /* renamed from: k0  reason: collision with root package name */
    private final Context f5841k0;

    /* renamed from: l0  reason: collision with root package name */
    private final Paint f5842l0 = new Paint(1);

    /* renamed from: m0  reason: collision with root package name */
    private final Paint f5843m0;

    /* renamed from: n0  reason: collision with root package name */
    private final Paint.FontMetrics f5844n0 = new Paint.FontMetrics();

    /* renamed from: o0  reason: collision with root package name */
    private final RectF f5845o0 = new RectF();

    /* renamed from: p0  reason: collision with root package name */
    private final PointF f5846p0 = new PointF();

    /* renamed from: q0  reason: collision with root package name */
    private final Path f5847q0 = new Path();

    /* renamed from: r0  reason: collision with root package name */
    private final p f5848r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f5849s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f5850t0;

    /* renamed from: u0  reason: collision with root package name */
    private int f5851u0;

    /* renamed from: v0  reason: collision with root package name */
    private int f5852v0;

    /* renamed from: w0  reason: collision with root package name */
    private int f5853w0;

    /* renamed from: x0  reason: collision with root package name */
    private int f5854x0;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f5855y0;

    /* renamed from: z0  reason: collision with root package name */
    private int f5856z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0098a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        M(context);
        this.f5841k0 = context;
        p pVar = new p(this);
        this.f5848r0 = pVar;
        this.K = "";
        pVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f5843m0 = null;
        int[] iArr = N0;
        setState(iArr);
        k2(iArr);
        this.K0 = true;
        if (b.f11634a) {
            O0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (O2()) {
            n0(rect, this.f5845o0);
            RectF rectF = this.f5845o0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.R.setBounds(0, 0, (int) this.f5845o0.width(), (int) this.f5845o0.height());
            if (b.f11634a) {
                this.S.setBounds(this.R.getBounds());
                this.S.jumpToCurrentState();
                drawable = this.S;
            } else {
                drawable = this.R;
            }
            drawable.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        this.f5842l0.setColor(this.f5853w0);
        this.f5842l0.setStyle(Paint.Style.FILL);
        this.f5845o0.set(rect);
        if (!this.M0) {
            canvas.drawRoundRect(this.f5845o0, H0(), H0(), this.f5842l0);
            return;
        }
        h(new RectF(rect), this.f5847q0);
        super.p(canvas, this.f5842l0, this.f5847q0, u());
    }

    private void C0(Canvas canvas, Rect rect) {
        Paint paint = this.f5843m0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.k(-16777216, 127));
            canvas.drawRect(rect, this.f5843m0);
            if (N2() || M2()) {
                k0(rect, this.f5845o0);
                canvas.drawRect(this.f5845o0, this.f5843m0);
            }
            if (this.K != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f5843m0);
            }
            if (O2()) {
                n0(rect, this.f5845o0);
                canvas.drawRect(this.f5845o0, this.f5843m0);
            }
            this.f5843m0.setColor(androidx.core.graphics.a.k(-65536, 127));
            m0(rect, this.f5845o0);
            canvas.drawRect(this.f5845o0, this.f5843m0);
            this.f5843m0.setColor(androidx.core.graphics.a.k(-16711936, 127));
            o0(rect, this.f5845o0);
            canvas.drawRect(this.f5845o0, this.f5843m0);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.K != null) {
            Paint.Align s02 = s0(rect, this.f5846p0);
            q0(rect, this.f5845o0);
            if (this.f5848r0.e() != null) {
                this.f5848r0.f().drawableState = getState();
                this.f5848r0.l(this.f5841k0);
            }
            this.f5848r0.f().setTextAlign(s02);
            int i10 = 0;
            boolean z10 = Math.round(this.f5848r0.g(g1().toString())) > Math.round(this.f5845o0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f5845o0);
            }
            CharSequence charSequence = this.K;
            if (z10 && this.J0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f5848r0.f(), this.f5845o0.width(), this.J0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f5846p0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f5848r0.f());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    private boolean M2() {
        return this.X && this.Y != null && this.f5855y0;
    }

    private boolean N2() {
        return this.L && this.M != null;
    }

    private boolean O2() {
        return this.Q && this.R != null;
    }

    private void P2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void Q2() {
        this.H0 = this.G0 ? b.a(this.J) : null;
    }

    private void R2() {
        this.S = new RippleDrawable(b.a(e1()), this.R, O0);
    }

    private float Y0() {
        Drawable drawable = this.f5855y0 ? this.Y : this.M;
        float f10 = this.O;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil((double) u.c(this.f5841k0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f10) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    private float Z0() {
        Drawable drawable = this.f5855y0 ? this.Y : this.M;
        float f10 = this.O;
        return (f10 > 0.0f || drawable == null) ? f10 : (float) drawable.getIntrinsicWidth();
    }

    private void a2(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            onStateChange(getState());
        }
    }

    private void j0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.R) {
                if (drawable.isStateful()) {
                    drawable.setState(V0());
                }
                androidx.core.graphics.drawable.a.o(drawable, this.T);
                return;
            }
            Drawable drawable2 = this.M;
            if (drawable == drawable2 && this.P) {
                androidx.core.graphics.drawable.a.o(drawable2, this.N);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2() || M2()) {
            float f10 = this.f5833c0 + this.f5834d0;
            float Z0 = Z0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = ((float) rect.left) + f10;
                rectF.left = f11;
                rectF.right = f11 + Z0;
            } else {
                float f12 = ((float) rect.right) - f10;
                rectF.right = f12;
                rectF.left = f12 - Z0;
            }
            float Y0 = Y0();
            float exactCenterY = rect.exactCenterY() - (Y0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + Y0;
        }
    }

    private ColorFilter k1() {
        ColorFilter colorFilter = this.B0;
        return colorFilter != null ? colorFilter : this.C0;
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (O2()) {
            float f10 = this.f5840j0 + this.f5839i0 + this.U + this.f5838h0 + this.f5837g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f10;
            } else {
                rectF.left = ((float) rect.left) + f10;
            }
        }
    }

    private static boolean m1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f10 = this.f5840j0 + this.f5839i0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = ((float) rect.right) - f10;
                rectF.right = f11;
                rectF.left = f11 - this.U;
            } else {
                float f12 = ((float) rect.left) + f10;
                rectF.left = f12;
                rectF.right = f12 + this.U;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.U;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f10 = this.f5840j0 + this.f5839i0 + this.U + this.f5838h0 + this.f5837g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = (float) rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = (float) i10;
                rectF.right = ((float) i10) + f10;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.K != null) {
            float l02 = this.f5833c0 + l0() + this.f5836f0;
            float p02 = this.f5840j0 + p0() + this.f5837g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = ((float) rect.left) + l02;
                rectF.right = ((float) rect.right) - p02;
            } else {
                rectF.left = ((float) rect.left) + p02;
                rectF.right = ((float) rect.right) - l02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float r0() {
        this.f5848r0.f().getFontMetrics(this.f5844n0);
        Paint.FontMetrics fontMetrics = this.f5844n0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean r1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean s1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private boolean t0() {
        return this.X && this.Y != null && this.W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f5841k0
            int[] r2 = q4.k.f15108o0
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.r.i(r0, r1, r2, r3, r4, r5)
            int r10 = q4.k.Z0
            boolean r10 = r9.hasValue(r10)
            r7.M0 = r10
            android.content.Context r10 = r7.f5841k0
            int r0 = q4.k.M0
            android.content.res.ColorStateList r10 = f5.c.a(r10, r9, r0)
            r7.a2(r10)
            android.content.Context r10 = r7.f5841k0
            int r0 = q4.k.f15207z0
            android.content.res.ColorStateList r10 = f5.c.a(r10, r9, r0)
            r7.E1(r10)
            int r10 = q4.k.H0
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.S1(r10)
            int r10 = q4.k.A0
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L_0x0045
            float r10 = r9.getDimension(r10, r0)
            r7.G1(r10)
        L_0x0045:
            android.content.Context r10 = r7.f5841k0
            int r1 = q4.k.K0
            android.content.res.ColorStateList r10 = f5.c.a(r10, r9, r1)
            r7.W1(r10)
            int r10 = q4.k.L0
            float r10 = r9.getDimension(r10, r0)
            r7.Y1(r10)
            android.content.Context r10 = r7.f5841k0
            int r1 = q4.k.Y0
            android.content.res.ColorStateList r10 = f5.c.a(r10, r9, r1)
            r7.x2(r10)
            int r10 = q4.k.f15153t0
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.C2(r10)
            android.content.Context r10 = r7.f5841k0
            int r1 = q4.k.f15117p0
            f5.d r10 = f5.c.f(r10, r9, r1)
            int r1 = q4.k.f15126q0
            float r2 = r10.j()
            float r1 = r9.getDimension(r1, r2)
            r10.l(r1)
            r7.D2(r10)
            int r10 = q4.k.f15135r0
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto L_0x009e
            r1 = 2
            if (r10 == r1) goto L_0x009b
            r1 = 3
            if (r10 == r1) goto L_0x0095
            goto L_0x00a1
        L_0x0095:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
        L_0x0097:
            r7.p2(r10)
            goto L_0x00a1
        L_0x009b:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0097
        L_0x009e:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
            goto L_0x0097
        L_0x00a1:
            int r10 = q4.k.G0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.R1(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00c7
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x00c7
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x00c7
            int r1 = q4.k.D0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.R1(r1)
        L_0x00c7:
            android.content.Context r1 = r7.f5841k0
            int r2 = q4.k.C0
            android.graphics.drawable.Drawable r1 = f5.c.d(r1, r9, r2)
            r7.K1(r1)
            int r1 = q4.k.F0
            boolean r2 = r9.hasValue(r1)
            if (r2 == 0) goto L_0x00e3
            android.content.Context r2 = r7.f5841k0
            android.content.res.ColorStateList r1 = f5.c.a(r2, r9, r1)
            r7.O1(r1)
        L_0x00e3:
            int r1 = q4.k.E0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r9.getDimension(r1, r2)
            r7.M1(r1)
            int r1 = q4.k.T0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.n2(r1)
            if (r8 == 0) goto L_0x0112
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0112
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x0112
            int r1 = q4.k.O0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.n2(r1)
        L_0x0112:
            android.content.Context r1 = r7.f5841k0
            int r2 = q4.k.N0
            android.graphics.drawable.Drawable r1 = f5.c.d(r1, r9, r2)
            r7.b2(r1)
            android.content.Context r1 = r7.f5841k0
            int r2 = q4.k.S0
            android.content.res.ColorStateList r1 = f5.c.a(r1, r9, r2)
            r7.l2(r1)
            int r1 = q4.k.Q0
            float r1 = r9.getDimension(r1, r0)
            r7.g2(r1)
            int r1 = q4.k.f15162u0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.w1(r1)
            int r1 = q4.k.f15198y0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.D1(r1)
            if (r8 == 0) goto L_0x015e
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x015e
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L_0x015e
            int r8 = q4.k.f15180w0
            boolean r8 = r9.getBoolean(r8, r6)
            r7.D1(r8)
        L_0x015e:
            android.content.Context r8 = r7.f5841k0
            int r10 = q4.k.f15171v0
            android.graphics.drawable.Drawable r8 = f5.c.d(r8, r9, r10)
            r7.y1(r8)
            int r8 = q4.k.f15189x0
            boolean r10 = r9.hasValue(r8)
            if (r10 == 0) goto L_0x017a
            android.content.Context r10 = r7.f5841k0
            android.content.res.ColorStateList r8 = f5.c.a(r10, r9, r8)
            r7.A1(r8)
        L_0x017a:
            android.content.Context r8 = r7.f5841k0
            int r10 = q4.k.f14969a1
            r4.f r8 = r4.f.b(r8, r9, r10)
            r7.A2(r8)
            android.content.Context r8 = r7.f5841k0
            int r10 = q4.k.V0
            r4.f r8 = r4.f.b(r8, r9, r10)
            r7.q2(r8)
            int r8 = q4.k.J0
            float r8 = r9.getDimension(r8, r0)
            r7.U1(r8)
            int r8 = q4.k.X0
            float r8 = r9.getDimension(r8, r0)
            r7.u2(r8)
            int r8 = q4.k.W0
            float r8 = r9.getDimension(r8, r0)
            r7.s2(r8)
            int r8 = q4.k.f14989c1
            float r8 = r9.getDimension(r8, r0)
            r7.I2(r8)
            int r8 = q4.k.f14979b1
            float r8 = r9.getDimension(r8, r0)
            r7.F2(r8)
            int r8 = q4.k.R0
            float r8 = r9.getDimension(r8, r0)
            r7.i2(r8)
            int r8 = q4.k.P0
            float r8 = r9.getDimension(r8, r0)
            r7.d2(r8)
            int r8 = q4.k.B0
            float r8 = r9.getDimension(r8, r0)
            r7.I1(r8)
            int r8 = q4.k.f15144s0
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.w2(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.t1(android.util.AttributeSet, int, int):void");
    }

    public static a u0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.t1(attributeSet, i10, i11);
        return aVar;
    }

    private void v0(Canvas canvas, Rect rect) {
        if (M2()) {
            k0(rect, this.f5845o0);
            RectF rectF = this.f5845o0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.Y.setBounds(0, 0, (int) this.f5845o0.width(), (int) this.f5845o0.height());
            this.Y.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean v1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.D;
        int l10 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f5849s0) : 0);
        boolean z11 = true;
        if (this.f5849s0 != l10) {
            this.f5849s0 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.E;
        int l11 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f5850t0) : 0);
        if (this.f5850t0 != l11) {
            this.f5850t0 = l11;
            onStateChange = true;
        }
        int i10 = x4.a.i(l10, l11);
        if ((this.f5851u0 != i10) || (x() == null)) {
            this.f5851u0 = i10;
            W(ColorStateList.valueOf(i10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.H;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f5852v0) : 0;
        if (this.f5852v0 != colorForState) {
            this.f5852v0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.H0 == null || !b.b(iArr)) ? 0 : this.H0.getColorForState(iArr, this.f5853w0);
        if (this.f5853w0 != colorForState2) {
            this.f5853w0 = colorForState2;
            if (this.G0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f5848r0.e() == null || this.f5848r0.e().i() == null) ? 0 : this.f5848r0.e().i().getColorForState(iArr, this.f5854x0);
        if (this.f5854x0 != colorForState3) {
            this.f5854x0 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = m1(getState(), 16842912) && this.W;
        if (this.f5855y0 == z12 || this.Y == null) {
            z10 = false;
        } else {
            float l02 = l0();
            this.f5855y0 = z12;
            if (l02 != l0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.D0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f5856z0) : 0;
        if (this.f5856z0 != colorForState4) {
            this.f5856z0 = colorForState4;
            this.C0 = e.j(this, this.D0, this.E0);
        } else {
            z11 = onStateChange;
        }
        if (r1(this.M)) {
            z11 |= this.M.setState(iArr);
        }
        if (r1(this.Y)) {
            z11 |= this.Y.setState(iArr);
        }
        if (r1(this.R)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.R.setState(iArr3);
        }
        if (b.f11634a && r1(this.S)) {
            z11 |= this.S.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            u1();
        }
        return z11;
    }

    private void w0(Canvas canvas, Rect rect) {
        if (!this.M0) {
            this.f5842l0.setColor(this.f5850t0);
            this.f5842l0.setStyle(Paint.Style.FILL);
            this.f5842l0.setColorFilter(k1());
            this.f5845o0.set(rect);
            canvas.drawRoundRect(this.f5845o0, H0(), H0(), this.f5842l0);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        if (N2()) {
            k0(rect, this.f5845o0);
            RectF rectF = this.f5845o0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.M.setBounds(0, 0, (int) this.f5845o0.width(), (int) this.f5845o0.height());
            this.M.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (this.I > 0.0f && !this.M0) {
            this.f5842l0.setColor(this.f5852v0);
            this.f5842l0.setStyle(Paint.Style.STROKE);
            if (!this.M0) {
                this.f5842l0.setColorFilter(k1());
            }
            RectF rectF = this.f5845o0;
            float f10 = this.I;
            rectF.set(((float) rect.left) + (f10 / 2.0f), ((float) rect.top) + (f10 / 2.0f), ((float) rect.right) - (f10 / 2.0f), ((float) rect.bottom) - (f10 / 2.0f));
            float f11 = this.G - (this.I / 2.0f);
            canvas.drawRoundRect(this.f5845o0, f11, f11, this.f5842l0);
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        if (!this.M0) {
            this.f5842l0.setColor(this.f5849s0);
            this.f5842l0.setStyle(Paint.Style.FILL);
            this.f5845o0.set(rect);
            canvas.drawRoundRect(this.f5845o0, H0(), H0(), this.f5842l0);
        }
    }

    public void A1(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (t0()) {
                androidx.core.graphics.drawable.a.o(this.Y, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void A2(f fVar) {
        this.f5831a0 = fVar;
    }

    public void B1(int i10) {
        A1(g.a.a(this.f5841k0, i10));
    }

    public void B2(int i10) {
        A2(f.c(this.f5841k0, i10));
    }

    public void C1(int i10) {
        D1(this.f5841k0.getResources().getBoolean(i10));
    }

    public void C2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.K, charSequence)) {
            this.K = charSequence;
            this.f5848r0.k(true);
            invalidateSelf();
            u1();
        }
    }

    public void D1(boolean z10) {
        if (this.X != z10) {
            boolean M2 = M2();
            this.X = z10;
            boolean M22 = M2();
            if (M2 != M22) {
                if (M22) {
                    j0(this.Y);
                } else {
                    P2(this.Y);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public void D2(d dVar) {
        this.f5848r0.j(dVar, this.f5841k0);
    }

    public Drawable E0() {
        return this.Y;
    }

    public void E1(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            onStateChange(getState());
        }
    }

    public void E2(int i10) {
        D2(new d(this.f5841k0, i10));
    }

    public ColorStateList F0() {
        return this.Z;
    }

    public void F1(int i10) {
        E1(g.a.a(this.f5841k0, i10));
    }

    public void F2(float f10) {
        if (this.f5837g0 != f10) {
            this.f5837g0 = f10;
            invalidateSelf();
            u1();
        }
    }

    public ColorStateList G0() {
        return this.E;
    }

    public void G1(float f10) {
        if (this.G != f10) {
            this.G = f10;
            setShapeAppearanceModel(D().w(f10));
        }
    }

    public void G2(int i10) {
        F2(this.f5841k0.getResources().getDimension(i10));
    }

    public float H0() {
        return this.M0 ? F() : this.G;
    }

    public void H1(int i10) {
        G1(this.f5841k0.getResources().getDimension(i10));
    }

    public void H2(float f10) {
        d h12 = h1();
        if (h12 != null) {
            h12.l(f10);
            this.f5848r0.f().setTextSize(f10);
            a();
        }
    }

    public float I0() {
        return this.f5840j0;
    }

    public void I1(float f10) {
        if (this.f5840j0 != f10) {
            this.f5840j0 = f10;
            invalidateSelf();
            u1();
        }
    }

    public void I2(float f10) {
        if (this.f5836f0 != f10) {
            this.f5836f0 = f10;
            invalidateSelf();
            u1();
        }
    }

    public Drawable J0() {
        Drawable drawable = this.M;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void J1(int i10) {
        I1(this.f5841k0.getResources().getDimension(i10));
    }

    public void J2(int i10) {
        I2(this.f5841k0.getResources().getDimension(i10));
    }

    public float K0() {
        return this.O;
    }

    public void K1(Drawable drawable) {
        Drawable J02 = J0();
        if (J02 != drawable) {
            float l02 = l0();
            this.M = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float l03 = l0();
            P2(J02);
            if (N2()) {
                j0(this.M);
            }
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public void K2(boolean z10) {
        if (this.G0 != z10) {
            this.G0 = z10;
            Q2();
            onStateChange(getState());
        }
    }

    public ColorStateList L0() {
        return this.N;
    }

    public void L1(int i10) {
        K1(g.a.b(this.f5841k0, i10));
    }

    /* access modifiers changed from: package-private */
    public boolean L2() {
        return this.K0;
    }

    public float M0() {
        return this.F;
    }

    public void M1(float f10) {
        if (this.O != f10) {
            float l02 = l0();
            this.O = f10;
            float l03 = l0();
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public float N0() {
        return this.f5833c0;
    }

    public void N1(int i10) {
        M1(this.f5841k0.getResources().getDimension(i10));
    }

    public ColorStateList O0() {
        return this.H;
    }

    public void O1(ColorStateList colorStateList) {
        this.P = true;
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (N2()) {
                androidx.core.graphics.drawable.a.o(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float P0() {
        return this.I;
    }

    public void P1(int i10) {
        O1(g.a.a(this.f5841k0, i10));
    }

    public Drawable Q0() {
        Drawable drawable = this.R;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void Q1(int i10) {
        R1(this.f5841k0.getResources().getBoolean(i10));
    }

    public CharSequence R0() {
        return this.V;
    }

    public void R1(boolean z10) {
        if (this.L != z10) {
            boolean N2 = N2();
            this.L = z10;
            boolean N22 = N2();
            if (N2 != N22) {
                if (N22) {
                    j0(this.M);
                } else {
                    P2(this.M);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public float S0() {
        return this.f5839i0;
    }

    public void S1(float f10) {
        if (this.F != f10) {
            this.F = f10;
            invalidateSelf();
            u1();
        }
    }

    public float T0() {
        return this.U;
    }

    public void T1(int i10) {
        S1(this.f5841k0.getResources().getDimension(i10));
    }

    public float U0() {
        return this.f5838h0;
    }

    public void U1(float f10) {
        if (this.f5833c0 != f10) {
            this.f5833c0 = f10;
            invalidateSelf();
            u1();
        }
    }

    public int[] V0() {
        return this.F0;
    }

    public void V1(int i10) {
        U1(this.f5841k0.getResources().getDimension(i10));
    }

    public ColorStateList W0() {
        return this.T;
    }

    public void W1(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (this.M0) {
                e0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X0(RectF rectF) {
        o0(getBounds(), rectF);
    }

    public void X1(int i10) {
        W1(g.a.a(this.f5841k0, i10));
    }

    public void Y1(float f10) {
        if (this.I != f10) {
            this.I = f10;
            this.f5842l0.setStrokeWidth(f10);
            if (this.M0) {
                super.f0(f10);
            }
            invalidateSelf();
        }
    }

    public void Z1(int i10) {
        Y1(this.f5841k0.getResources().getDimension(i10));
    }

    public void a() {
        u1();
        invalidateSelf();
    }

    public TextUtils.TruncateAt a1() {
        return this.J0;
    }

    public f b1() {
        return this.f5832b0;
    }

    public void b2(Drawable drawable) {
        Drawable Q0 = Q0();
        if (Q0 != drawable) {
            float p02 = p0();
            this.R = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f11634a) {
                R2();
            }
            float p03 = p0();
            P2(Q0);
            if (O2()) {
                j0(this.R);
            }
            invalidateSelf();
            if (p02 != p03) {
                u1();
            }
        }
    }

    public float c1() {
        return this.f5835e0;
    }

    public void c2(CharSequence charSequence) {
        if (this.V != charSequence) {
            this.V = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float d1() {
        return this.f5834d0;
    }

    public void d2(float f10) {
        if (this.f5839i0 != f10) {
            this.f5839i0 = f10;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    public void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i11 = this.A0;
            if (i11 < 255) {
                i10 = t4.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i11);
            } else {
                i10 = 0;
            }
            z0(canvas, bounds);
            w0(canvas, bounds);
            if (this.M0) {
                super.draw(canvas);
            }
            y0(canvas, bounds);
            B0(canvas, bounds);
            x0(canvas, bounds);
            v0(canvas, bounds);
            if (this.K0) {
                D0(canvas, bounds);
            }
            A0(canvas, bounds);
            C0(canvas, bounds);
            if (this.A0 < 255) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public ColorStateList e1() {
        return this.J;
    }

    public void e2(int i10) {
        d2(this.f5841k0.getResources().getDimension(i10));
    }

    public f f1() {
        return this.f5831a0;
    }

    public void f2(int i10) {
        b2(g.a.b(this.f5841k0, i10));
    }

    public CharSequence g1() {
        return this.K;
    }

    public void g2(float f10) {
        if (this.U != f10) {
            this.U = f10;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    public int getAlpha() {
        return this.A0;
    }

    public ColorFilter getColorFilter() {
        return this.B0;
    }

    public int getIntrinsicHeight() {
        return (int) this.F;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f5833c0 + l0() + this.f5836f0 + this.f5848r0.g(g1().toString()) + this.f5837g0 + p0() + this.f5840j0), this.L0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.M0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.G);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.G);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public d h1() {
        return this.f5848r0.e();
    }

    public void h2(int i10) {
        g2(this.f5841k0.getResources().getDimension(i10));
    }

    public float i1() {
        return this.f5837g0;
    }

    public void i2(float f10) {
        if (this.f5838h0 != f10) {
            this.f5838h0 = f10;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return q1(this.D) || q1(this.E) || q1(this.H) || (this.G0 && q1(this.H0)) || s1(this.f5848r0.e()) || t0() || r1(this.M) || r1(this.Y) || q1(this.D0);
    }

    public float j1() {
        return this.f5836f0;
    }

    public void j2(int i10) {
        i2(this.f5841k0.getResources().getDimension(i10));
    }

    public boolean k2(int[] iArr) {
        if (Arrays.equals(this.F0, iArr)) {
            return false;
        }
        this.F0 = iArr;
        if (O2()) {
            return v1(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float l0() {
        if (N2() || M2()) {
            return this.f5834d0 + Z0() + this.f5835e0;
        }
        return 0.0f;
    }

    public boolean l1() {
        return this.G0;
    }

    public void l2(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (O2()) {
                androidx.core.graphics.drawable.a.o(this.R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void m2(int i10) {
        l2(g.a.a(this.f5841k0, i10));
    }

    public boolean n1() {
        return this.W;
    }

    public void n2(boolean z10) {
        if (this.Q != z10) {
            boolean O2 = O2();
            this.Q = z10;
            boolean O22 = O2();
            if (O2 != O22) {
                if (O22) {
                    j0(this.R);
                } else {
                    P2(this.R);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public boolean o1() {
        return r1(this.R);
    }

    public void o2(C0098a aVar) {
        this.I0 = new WeakReference(aVar);
    }

    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (N2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.M, i10);
        }
        if (M2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.Y, i10);
        }
        if (O2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.R, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (N2()) {
            onLevelChange |= this.M.setLevel(i10);
        }
        if (M2()) {
            onLevelChange |= this.Y.setLevel(i10);
        }
        if (O2()) {
            onLevelChange |= this.R.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.M0) {
            super.onStateChange(iArr);
        }
        return v1(iArr, V0());
    }

    /* access modifiers changed from: package-private */
    public float p0() {
        if (O2()) {
            return this.f5838h0 + this.U + this.f5839i0;
        }
        return 0.0f;
    }

    public boolean p1() {
        return this.Q;
    }

    public void p2(TextUtils.TruncateAt truncateAt) {
        this.J0 = truncateAt;
    }

    public void q2(f fVar) {
        this.f5832b0 = fVar;
    }

    public void r2(int i10) {
        q2(f.c(this.f5841k0, i10));
    }

    /* access modifiers changed from: package-private */
    public Paint.Align s0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.K != null) {
            float l02 = this.f5833c0 + l0() + this.f5836f0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = ((float) rect.left) + l02;
            } else {
                pointF.x = ((float) rect.right) - l02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - r0();
        }
        return align;
    }

    public void s2(float f10) {
        if (this.f5835e0 != f10) {
            float l02 = l0();
            this.f5835e0 = f10;
            float l03 = l0();
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (this.A0 != i10) {
            this.A0 = i10;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.B0 != colorFilter) {
            this.B0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.E0 != mode) {
            this.E0 = mode;
            this.C0 = e.j(this, this.D0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (N2()) {
            visible |= this.M.setVisible(z10, z11);
        }
        if (M2()) {
            visible |= this.Y.setVisible(z10, z11);
        }
        if (O2()) {
            visible |= this.R.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(int i10) {
        s2(this.f5841k0.getResources().getDimension(i10));
    }

    /* access modifiers changed from: protected */
    public void u1() {
        C0098a aVar = (C0098a) this.I0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void u2(float f10) {
        if (this.f5834d0 != f10) {
            float l02 = l0();
            this.f5834d0 = f10;
            float l03 = l0();
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(int i10) {
        u2(this.f5841k0.getResources().getDimension(i10));
    }

    public void w1(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            float l02 = l0();
            if (!z10 && this.f5855y0) {
                this.f5855y0 = false;
            }
            float l03 = l0();
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public void w2(int i10) {
        this.L0 = i10;
    }

    public void x1(int i10) {
        w1(this.f5841k0.getResources().getBoolean(i10));
    }

    public void x2(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            Q2();
            onStateChange(getState());
        }
    }

    public void y1(Drawable drawable) {
        if (this.Y != drawable) {
            float l02 = l0();
            this.Y = drawable;
            float l03 = l0();
            P2(this.Y);
            j0(this.Y);
            invalidateSelf();
            if (l02 != l03) {
                u1();
            }
        }
    }

    public void y2(int i10) {
        x2(g.a.a(this.f5841k0, i10));
    }

    public void z1(int i10) {
        y1(g.a.b(this.f5841k0, i10));
    }

    /* access modifiers changed from: package-private */
    public void z2(boolean z10) {
        this.K0 = z10;
    }
}
