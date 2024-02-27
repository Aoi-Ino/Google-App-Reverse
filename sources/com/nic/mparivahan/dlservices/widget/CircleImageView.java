package com.nic.mparivahan.dlservices.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import cm.g;
import cm.l;
import cm.x;
import java.util.Arrays;
import m8.b;

public final class CircleImageView extends AppCompatImageView {
    public static final a B = new a((g) null);
    private static final ImageView.ScaleType C = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config D = Bitmap.Config.ARGB_8888;
    private boolean A;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f22382h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f22383i;

    /* renamed from: j  reason: collision with root package name */
    private final Matrix f22384j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f22385k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f22386l;

    /* renamed from: m  reason: collision with root package name */
    private final Paint f22387m;

    /* renamed from: n  reason: collision with root package name */
    private int f22388n;

    /* renamed from: o  reason: collision with root package name */
    private int f22389o;

    /* renamed from: p  reason: collision with root package name */
    private int f22390p;

    /* renamed from: q  reason: collision with root package name */
    private Bitmap f22391q;

    /* renamed from: r  reason: collision with root package name */
    private BitmapShader f22392r;

    /* renamed from: s  reason: collision with root package name */
    private int f22393s;

    /* renamed from: t  reason: collision with root package name */
    private int f22394t;

    /* renamed from: u  reason: collision with root package name */
    private float f22395u;

    /* renamed from: v  reason: collision with root package name */
    private float f22396v;

    /* renamed from: w  reason: collision with root package name */
    private ColorFilter f22397w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f22398x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f22399y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f22400z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (g) null);
        l.f(context, "context");
    }

    private final void c() {
        Paint paint = this.f22385k;
        if (paint != null) {
            paint.setColorFilter(this.f22397w);
        }
    }

    private final RectF d() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f10 = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f10, f10 + paddingTop);
    }

    private final Bitmap e(Drawable drawable) {
        Bitmap bitmap = null;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, D) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), D);
            l.c(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmap = createBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return bitmap;
    }

    private final void f() {
        super.setScaleType(C);
        this.f22398x = true;
        if (this.f22399y) {
            h();
            this.f22399y = false;
        }
    }

    private final void g() {
        this.f22391q = this.A ? null : e(getDrawable());
        h();
    }

    private final void h() {
        int i10;
        if (!this.f22398x) {
            this.f22399y = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f22391q == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.f22391q;
            l.c(bitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f22392r = new BitmapShader(bitmap, tileMode, tileMode);
            Paint paint = this.f22385k;
            l.c(paint);
            paint.setAntiAlias(true);
            this.f22385k.setShader(this.f22392r);
            this.f22386l.setStyle(Paint.Style.STROKE);
            this.f22386l.setAntiAlias(true);
            this.f22386l.setColor(this.f22388n);
            this.f22386l.setStrokeWidth((float) this.f22389o);
            this.f22387m.setStyle(Paint.Style.FILL);
            this.f22387m.setAntiAlias(true);
            this.f22387m.setColor(this.f22390p);
            Bitmap bitmap2 = this.f22391q;
            l.c(bitmap2);
            this.f22394t = bitmap2.getHeight();
            Bitmap bitmap3 = this.f22391q;
            l.c(bitmap3);
            this.f22393s = bitmap3.getWidth();
            this.f22383i.set(d());
            this.f22396v = Math.min((this.f22383i.height() - ((float) this.f22389o)) / 2.0f, (this.f22383i.width() - ((float) this.f22389o)) / 2.0f);
            this.f22382h.set(this.f22383i);
            if (!this.f22400z && (i10 = this.f22389o) > 0) {
                this.f22382h.inset(((float) i10) - 1.0f, ((float) i10) - 1.0f);
            }
            this.f22395u = Math.min(this.f22382h.height() / 2.0f, this.f22382h.width() / 2.0f);
            c();
            i();
            invalidate();
        }
    }

    private final void i() {
        float f10;
        float f11;
        this.f22384j.set((Matrix) null);
        float f12 = 0.0f;
        if (((float) this.f22393s) * this.f22382h.height() > this.f22382h.width() * ((float) this.f22394t)) {
            f11 = this.f22382h.height() / ((float) this.f22394t);
            f10 = 0.0f;
            f12 = (this.f22382h.width() - (((float) this.f22393s) * f11)) * 0.5f;
        } else {
            f11 = this.f22382h.width() / ((float) this.f22393s);
            f10 = (this.f22382h.height() - (((float) this.f22394t) * f11)) * 0.5f;
        }
        this.f22384j.setScale(f11, f11);
        Matrix matrix = this.f22384j;
        RectF rectF = this.f22382h;
        matrix.postTranslate(((float) ((int) (f12 + 0.5f))) + rectF.left, ((float) ((int) (f10 + 0.5f))) + rectF.top);
        BitmapShader bitmapShader = this.f22392r;
        l.c(bitmapShader);
        bitmapShader.setLocalMatrix(this.f22384j);
    }

    public final int getBorderColor() {
        return this.f22388n;
    }

    public final int getBorderWidth() {
        return this.f22389o;
    }

    public ColorFilter getColorFilter() {
        ColorFilter colorFilter = this.f22397w;
        l.c(colorFilter);
        return colorFilter;
    }

    public final int getFillColor() {
        return this.f22390p;
    }

    public ImageView.ScaleType getScaleType() {
        return C;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        if (this.A) {
            super.onDraw(canvas);
        } else if (this.f22391q != null) {
            if (this.f22390p != 0) {
                canvas.drawCircle(this.f22382h.centerX(), this.f22382h.centerY(), this.f22395u, this.f22387m);
            }
            float centerX = this.f22382h.centerX();
            float centerY = this.f22382h.centerY();
            float f10 = this.f22395u;
            Paint paint = this.f22385k;
            l.c(paint);
            canvas.drawCircle(centerX, centerY, f10, paint);
            if (this.f22389o > 0) {
                canvas.drawCircle(this.f22383i.centerX(), this.f22383i.centerY(), this.f22396v, this.f22386l);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h();
    }

    public void setAdjustViewBounds(boolean z10) {
        if (!(!z10)) {
            throw new IllegalArgumentException("adjustViewBounds not supported.".toString());
        }
    }

    public final void setBorderColor(int i10) {
        if (i10 != this.f22388n) {
            this.f22388n = i10;
            this.f22386l.setColor(i10);
            invalidate();
        }
    }

    public final void setBorderColorResource(int i10) {
        setBorderColor(getContext().getResources().getColor(i10));
    }

    public final void setBorderOverlay(boolean z10) {
        if (z10 != this.f22400z) {
            this.f22400z = z10;
            h();
        }
    }

    public final void setBorderWidth(int i10) {
        if (i10 != this.f22389o) {
            this.f22389o = i10;
            h();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        l.f(colorFilter, "cf");
        if (colorFilter != this.f22397w) {
            this.f22397w = colorFilter;
            c();
            invalidate();
        }
    }

    public final void setDisableCircularTransformation(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            g();
        }
    }

    public final void setFillColor(int i10) {
        if (i10 != this.f22390p) {
            this.f22390p = i10;
            this.f22387m.setColor(i10);
            invalidate();
        }
    }

    public final void setFillColorResource(int i10) {
        setFillColor(getContext().getResources().getColor(i10));
    }

    public void setImageBitmap(Bitmap bitmap) {
        l.f(bitmap, "bm");
        super.setImageBitmap(bitmap);
        g();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        g();
    }

    public void setImageResource(int i10) {
        super.setImageResource(i10);
        g();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        g();
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        h();
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        h();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        l.f(scaleType, "scaleType");
        if (scaleType != C) {
            x xVar = x.f20237a;
            String format = String.format("ScaleType %s not supported.", Arrays.copyOf(new Object[]{scaleType}, 1));
            l.e(format, "format(format, *args)");
            throw new IllegalArgumentException(format.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircleImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        l.f(context, "context");
        this.f22382h = new RectF();
        this.f22383i = new RectF();
        this.f22384j = new Matrix();
        this.f22385k = new Paint();
        this.f22386l = new Paint();
        this.f22387m = new Paint();
        this.f22388n = -16777216;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.K, i10, 0);
        l.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f22389o = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f22388n = obtainStyledAttributes.getColor(0, -16777216);
        this.f22400z = obtainStyledAttributes.getBoolean(1, false);
        this.f22390p = obtainStyledAttributes.getColor(4, 0);
        obtainStyledAttributes.recycle();
        f();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CircleImageView(Context context, AttributeSet attributeSet, int i10, int i11, g gVar) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
