package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import i5.k;
import i5.l;
import z4.e;

class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final l f5995a = l.k();

    /* renamed from: b  reason: collision with root package name */
    private final Paint f5996b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f5997c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f5998d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f5999e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final RectF f6000f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final b f6001g = new b();

    /* renamed from: h  reason: collision with root package name */
    float f6002h;

    /* renamed from: i  reason: collision with root package name */
    private int f6003i;

    /* renamed from: j  reason: collision with root package name */
    private int f6004j;

    /* renamed from: k  reason: collision with root package name */
    private int f6005k;

    /* renamed from: l  reason: collision with root package name */
    private int f6006l;

    /* renamed from: m  reason: collision with root package name */
    private int f6007m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6008n = true;

    /* renamed from: o  reason: collision with root package name */
    private k f6009o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f6010p;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return a.this;
        }
    }

    a(k kVar) {
        this.f6009o = kVar;
        Paint paint = new Paint(1);
        this.f5996b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.f5998d;
        copyBounds(rect);
        float height = this.f6002h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{androidx.core.graphics.a.g(this.f6003i, this.f6007m), androidx.core.graphics.a.g(this.f6004j, this.f6007m), androidx.core.graphics.a.g(androidx.core.graphics.a.k(this.f6004j, 0), this.f6007m), androidx.core.graphics.a.g(androidx.core.graphics.a.k(this.f6006l, 0), this.f6007m), androidx.core.graphics.a.g(this.f6006l, this.f6007m), androidx.core.graphics.a.g(this.f6005k, this.f6007m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: protected */
    public RectF b() {
        this.f6000f.set(getBounds());
        return this.f6000f;
    }

    /* access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f6007m = colorStateList.getColorForState(getState(), this.f6007m);
        }
        this.f6010p = colorStateList;
        this.f6008n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f6002h != f10) {
            this.f6002h = f10;
            this.f5996b.setStrokeWidth(f10 * 1.3333f);
            this.f6008n = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f6008n) {
            this.f5996b.setShader(a());
            this.f6008n = false;
        }
        float strokeWidth = this.f5996b.getStrokeWidth() / 2.0f;
        copyBounds(this.f5998d);
        this.f5999e.set(this.f5998d);
        float min = Math.min(this.f6009o.r().a(b()), this.f5999e.width() / 2.0f);
        if (this.f6009o.u(b())) {
            this.f5999e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f5999e, min, min, this.f5996b);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i10, int i11, int i12, int i13) {
        this.f6003i = i10;
        this.f6004j = i11;
        this.f6005k = i12;
        this.f6006l = i13;
    }

    public void f(k kVar) {
        this.f6009o = kVar;
        invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f6001g;
    }

    public int getOpacity() {
        return this.f6002h > 0.0f ? -3 : -2;
    }

    public void getOutline(Outline outline) {
        if (this.f6009o.u(b())) {
            outline.setRoundRect(getBounds(), this.f6009o.r().a(b()));
            return;
        }
        copyBounds(this.f5998d);
        this.f5999e.set(this.f5998d);
        this.f5995a.d(this.f6009o, 1.0f, this.f5999e, this.f5997c);
        e.i(outline, this.f5997c);
    }

    public boolean getPadding(Rect rect) {
        if (!this.f6009o.u(b())) {
            return true;
        }
        int round = Math.round(this.f6002h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f6010p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f6008n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f6010p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f6007m)) == this.f6007m)) {
            this.f6008n = true;
            this.f6007m = colorForState;
        }
        if (this.f6008n) {
            invalidateSelf();
        }
        return this.f6008n;
    }

    public void setAlpha(int i10) {
        this.f5996b.setAlpha(i10);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5996b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
