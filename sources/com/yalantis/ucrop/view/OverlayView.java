package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import hl.a;
import hl.b;
import hl.h;
import il.d;
import ll.g;

public class OverlayView extends View {
    private int A;
    private int B;
    private int C;
    private int D;
    private d E;
    private boolean F;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f22662e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f22663f;

    /* renamed from: g  reason: collision with root package name */
    protected int f22664g;

    /* renamed from: h  reason: collision with root package name */
    protected int f22665h;

    /* renamed from: i  reason: collision with root package name */
    protected float[] f22666i;

    /* renamed from: j  reason: collision with root package name */
    protected float[] f22667j;

    /* renamed from: k  reason: collision with root package name */
    private int f22668k;

    /* renamed from: l  reason: collision with root package name */
    private int f22669l;

    /* renamed from: m  reason: collision with root package name */
    private float f22670m;

    /* renamed from: n  reason: collision with root package name */
    private float[] f22671n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f22672o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f22673p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f22674q;

    /* renamed from: r  reason: collision with root package name */
    private int f22675r;

    /* renamed from: s  reason: collision with root package name */
    private Path f22676s;

    /* renamed from: t  reason: collision with root package name */
    private Paint f22677t;

    /* renamed from: u  reason: collision with root package name */
    private Paint f22678u;

    /* renamed from: v  reason: collision with root package name */
    private Paint f22679v;

    /* renamed from: w  reason: collision with root package name */
    private Paint f22680w;

    /* renamed from: x  reason: collision with root package name */
    private int f22681x;

    /* renamed from: y  reason: collision with root package name */
    private float f22682y;

    /* renamed from: z  reason: collision with root package name */
    private float f22683z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int c(float f10, float f11) {
        double d10 = (double) this.B;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11 += 2) {
            double sqrt = Math.sqrt(Math.pow((double) (f10 - this.f22666i[i11]), 2.0d) + Math.pow((double) (f11 - this.f22666i[i11 + 1]), 2.0d));
            if (sqrt < d10) {
                i10 = i11 / 2;
                d10 = sqrt;
            }
        }
        if (this.f22681x != 1 || i10 >= 0 || !this.f22662e.contains(f10, f11)) {
            return i10;
        }
        return 4;
    }

    private void e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(h.f24139a0, getResources().getDimensionPixelSize(b.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(h.Z, getResources().getColor(a.ucrop_color_default_crop_frame));
        this.f22679v.setStrokeWidth((float) dimensionPixelSize);
        this.f22679v.setColor(color);
        Paint paint = this.f22679v;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f22680w.setStrokeWidth((float) (dimensionPixelSize * 3));
        this.f22680w.setColor(color);
        this.f22680w.setStyle(style);
    }

    private void f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(h.f24147e0, getResources().getDimensionPixelSize(b.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(h.f24141b0, getResources().getColor(a.ucrop_color_default_crop_grid));
        this.f22678u.setStrokeWidth((float) dimensionPixelSize);
        this.f22678u.setColor(color);
        this.f22668k = typedArray.getInt(h.f24145d0, 2);
        this.f22669l = typedArray.getInt(h.f24143c0, 2);
    }

    private void i(float f10, float f11) {
        this.f22663f.set(this.f22662e);
        int i10 = this.A;
        boolean z10 = true;
        if (i10 == 0) {
            RectF rectF = this.f22663f;
            RectF rectF2 = this.f22662e;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i10 == 1) {
            RectF rectF3 = this.f22663f;
            RectF rectF4 = this.f22662e;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i10 == 2) {
            RectF rectF5 = this.f22663f;
            RectF rectF6 = this.f22662e;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i10 == 3) {
            RectF rectF7 = this.f22663f;
            RectF rectF8 = this.f22662e;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i10 == 4) {
            this.f22663f.offset(f10 - this.f22682y, f11 - this.f22683z);
            if (this.f22663f.left > ((float) getLeft()) && this.f22663f.top > ((float) getTop()) && this.f22663f.right < ((float) getRight()) && this.f22663f.bottom < ((float) getBottom())) {
                this.f22662e.set(this.f22663f);
                j();
                postInvalidate();
                return;
            }
            return;
        }
        boolean z11 = this.f22663f.height() >= ((float) this.C);
        if (this.f22663f.width() < ((float) this.C)) {
            z10 = false;
        }
        RectF rectF9 = this.f22662e;
        rectF9.set(z10 ? this.f22663f.left : rectF9.left, z11 ? this.f22663f.top : rectF9.top, z10 ? this.f22663f.right : rectF9.right, z11 ? this.f22663f.bottom : rectF9.bottom);
        if (z11 || z10) {
            j();
            postInvalidate();
        }
    }

    private void j() {
        this.f22666i = g.b(this.f22662e);
        this.f22667j = g.a(this.f22662e);
        this.f22671n = null;
        this.f22676s.reset();
        this.f22676s.addCircle(this.f22662e.centerX(), this.f22662e.centerY(), Math.min(this.f22662e.width(), this.f22662e.height()) / 2.0f, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas) {
        if (this.f22673p) {
            if (this.f22671n == null && !this.f22662e.isEmpty()) {
                this.f22671n = new float[((this.f22668k * 4) + (this.f22669l * 4))];
                int i10 = 0;
                for (int i11 = 0; i11 < this.f22668k; i11++) {
                    float[] fArr = this.f22671n;
                    RectF rectF = this.f22662e;
                    fArr[i10] = rectF.left;
                    float f10 = ((float) i11) + 1.0f;
                    float height = rectF.height() * (f10 / ((float) (this.f22668k + 1)));
                    RectF rectF2 = this.f22662e;
                    fArr[i10 + 1] = height + rectF2.top;
                    float[] fArr2 = this.f22671n;
                    int i12 = i10 + 3;
                    fArr2[i10 + 2] = rectF2.right;
                    i10 += 4;
                    fArr2[i12] = (rectF2.height() * (f10 / ((float) (this.f22668k + 1)))) + this.f22662e.top;
                }
                for (int i13 = 0; i13 < this.f22669l; i13++) {
                    float[] fArr3 = this.f22671n;
                    float f11 = ((float) i13) + 1.0f;
                    float width = this.f22662e.width() * (f11 / ((float) (this.f22669l + 1)));
                    RectF rectF3 = this.f22662e;
                    fArr3[i10] = width + rectF3.left;
                    float[] fArr4 = this.f22671n;
                    fArr4[i10 + 1] = rectF3.top;
                    int i14 = i10 + 3;
                    float width2 = rectF3.width() * (f11 / ((float) (this.f22669l + 1)));
                    RectF rectF4 = this.f22662e;
                    fArr4[i10 + 2] = width2 + rectF4.left;
                    i10 += 4;
                    this.f22671n[i14] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f22671n;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f22678u);
            }
        }
        if (this.f22672o) {
            canvas.drawRect(this.f22662e, this.f22679v);
        }
        if (this.f22681x != 0) {
            canvas.save();
            this.f22663f.set(this.f22662e);
            RectF rectF5 = this.f22663f;
            int i15 = this.D;
            rectF5.inset((float) i15, (float) (-i15));
            RectF rectF6 = this.f22663f;
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF6, op);
            this.f22663f.set(this.f22662e);
            RectF rectF7 = this.f22663f;
            int i16 = this.D;
            rectF7.inset((float) (-i16), (float) i16);
            canvas.clipRect(this.f22663f, op);
            canvas.drawRect(this.f22662e, this.f22680w);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public void b(Canvas canvas) {
        canvas.save();
        if (this.f22674q) {
            canvas.clipPath(this.f22676s, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f22662e, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f22675r);
        canvas.restore();
        if (this.f22674q) {
            canvas.drawCircle(this.f22662e.centerX(), this.f22662e.centerY(), Math.min(this.f22662e.width(), this.f22662e.height()) / 2.0f, this.f22677t);
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: protected */
    public void g(TypedArray typedArray) {
        this.f22674q = typedArray.getBoolean(h.X, false);
        int color = typedArray.getColor(h.Y, getResources().getColor(a.ucrop_color_default_dimmed));
        this.f22675r = color;
        this.f22677t.setColor(color);
        this.f22677t.setStyle(Paint.Style.STROKE);
        this.f22677t.setStrokeWidth(1.0f);
        e(typedArray);
        this.f22672o = typedArray.getBoolean(h.f24149f0, true);
        f(typedArray);
        this.f22673p = typedArray.getBoolean(h.f24151g0, true);
    }

    public RectF getCropViewRect() {
        return this.f22662e;
    }

    public int getFreestyleCropMode() {
        return this.f22681x;
    }

    public d getOverlayViewChangeListener() {
        return this.E;
    }

    public void h() {
        int i10 = this.f22664g;
        float f10 = this.f22670m;
        int i11 = (int) (((float) i10) / f10);
        int i12 = this.f22665h;
        if (i11 > i12) {
            int i13 = (int) (((float) i12) * f10);
            int i14 = (i10 - i13) / 2;
            this.f22662e.set((float) (getPaddingLeft() + i14), (float) getPaddingTop(), (float) (getPaddingLeft() + i13 + i14), (float) (getPaddingTop() + this.f22665h));
        } else {
            int i15 = (i12 - i11) / 2;
            this.f22662e.set((float) getPaddingLeft(), (float) (getPaddingTop() + i15), (float) (getPaddingLeft() + this.f22664g), (float) (getPaddingTop() + i11 + i15));
        }
        d dVar = this.E;
        if (dVar != null) {
            dVar.a(this.f22662e);
        }
        j();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f22664g = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f22665h = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.F) {
                this.F = false;
                setTargetAspectRatio(this.f22670m);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.f22662e.isEmpty() && this.f22681x != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c10 = c(x10, y10);
                this.A = c10;
                if (c10 != -1) {
                    z10 = true;
                }
                if (!z10) {
                    this.f22682y = -1.0f;
                    this.f22683z = -1.0f;
                } else if (this.f22682y < 0.0f) {
                    this.f22682y = x10;
                    this.f22683z = y10;
                }
                return z10;
            } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.A != -1) {
                float min = Math.min(Math.max(x10, (float) getPaddingLeft()), (float) (getWidth() - getPaddingRight()));
                float min2 = Math.min(Math.max(y10, (float) getPaddingTop()), (float) (getHeight() - getPaddingBottom()));
                i(min, min2);
                this.f22682y = min;
                this.f22683z = min2;
                return true;
            } else if ((motionEvent.getAction() & 255) == 1) {
                this.f22682y = -1.0f;
                this.f22683z = -1.0f;
                this.A = -1;
                d dVar = this.E;
                if (dVar != null) {
                    dVar.a(this.f22662e);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.f22674q = z10;
    }

    public void setCropFrameColor(int i10) {
        this.f22679v.setColor(i10);
    }

    public void setCropFrameStrokeWidth(int i10) {
        this.f22679v.setStrokeWidth((float) i10);
    }

    public void setCropGridColor(int i10) {
        this.f22678u.setColor(i10);
    }

    public void setCropGridColumnCount(int i10) {
        this.f22669l = i10;
        this.f22671n = null;
    }

    public void setCropGridRowCount(int i10) {
        this.f22668k = i10;
        this.f22671n = null;
    }

    public void setCropGridStrokeWidth(int i10) {
        this.f22678u.setStrokeWidth((float) i10);
    }

    public void setDimmedColor(int i10) {
        this.f22675r = i10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.f22681x = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        this.f22681x = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.E = dVar;
    }

    public void setShowCropFrame(boolean z10) {
        this.f22672o = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.f22673p = z10;
    }

    public void setTargetAspectRatio(float f10) {
        this.f22670m = f10;
        if (this.f22664g > 0) {
            h();
            postInvalidate();
            return;
        }
        this.F = true;
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22662e = new RectF();
        this.f22663f = new RectF();
        this.f22671n = null;
        this.f22676s = new Path();
        this.f22677t = new Paint(1);
        this.f22678u = new Paint(1);
        this.f22679v = new Paint(1);
        this.f22680w = new Paint(1);
        this.f22681x = 0;
        this.f22682y = -1.0f;
        this.f22683z = -1.0f;
        this.A = -1;
        this.B = getResources().getDimensionPixelSize(b.ucrop_default_crop_rect_corner_touch_threshold);
        this.C = getResources().getDimensionPixelSize(b.ucrop_default_crop_rect_min_size);
        this.D = getResources().getDimensionPixelSize(b.ucrop_default_crop_rect_corner_touch_area_line_length);
        d();
    }
}
