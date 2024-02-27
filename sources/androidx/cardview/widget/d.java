package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f1636a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1637b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f1638c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f1639d;

    /* renamed from: e  reason: collision with root package name */
    private float f1640e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1641f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1642g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f1643h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f1644i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f1645j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f1646k = PorterDuff.Mode.SRC_IN;

    d(ColorStateList colorStateList, float f10) {
        this.f1636a = f10;
        this.f1637b = new Paint(5);
        e(colorStateList);
        this.f1638c = new RectF();
        this.f1639d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1643h = colorStateList;
        this.f1637b.setColor(colorStateList.getColorForState(getState(), this.f1643h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1638c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1639d.set(rect);
        if (this.f1641f) {
            float b10 = e.b(this.f1640e, this.f1636a, this.f1642g);
            this.f1639d.inset((int) Math.ceil((double) e.a(this.f1640e, this.f1636a, this.f1642g)), (int) Math.ceil((double) b10));
            this.f1638c.set(this.f1639d);
        }
    }

    public ColorStateList b() {
        return this.f1643h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f1640e;
    }

    public float d() {
        return this.f1636a;
    }

    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f1637b;
        if (this.f1644i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f1644i);
            z10 = true;
        }
        RectF rectF = this.f1638c;
        float f10 = this.f1636a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 != this.f1640e || this.f1641f != z10 || this.f1642g != z11) {
            this.f1640e = f10;
            this.f1641f = z10;
            this.f1642g = z11;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1639d, this.f1636a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 != this.f1636a) {
            this.f1636a = f10;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f1643h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1645j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f1643h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.d.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1643h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f1637b.getColor();
        if (z10) {
            this.f1637b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1645j;
        if (colorStateList2 == null || (mode = this.f1646k) == null) {
            return z10;
        }
        this.f1644i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i10) {
        this.f1637b.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1637b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1645j = colorStateList;
        this.f1644i = a(colorStateList, this.f1646k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1646k = mode;
        this.f1644i = a(this.f1645j, mode);
        invalidateSelf();
    }
}
