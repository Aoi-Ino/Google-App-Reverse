package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

public class CircleImageView extends ImageView {

    /* renamed from: y  reason: collision with root package name */
    private static final ImageView.ScaleType f22746y = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: z  reason: collision with root package name */
    private static final Bitmap.Config f22747z = Bitmap.Config.ARGB_8888;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f22748e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final RectF f22749f;

    /* renamed from: g  reason: collision with root package name */
    private final Matrix f22750g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f22751h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f22752i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f22753j;

    /* renamed from: k  reason: collision with root package name */
    private int f22754k;

    /* renamed from: l  reason: collision with root package name */
    private int f22755l;

    /* renamed from: m  reason: collision with root package name */
    private int f22756m;

    /* renamed from: n  reason: collision with root package name */
    private Bitmap f22757n;

    /* renamed from: o  reason: collision with root package name */
    private BitmapShader f22758o;

    /* renamed from: p  reason: collision with root package name */
    private int f22759p;

    /* renamed from: q  reason: collision with root package name */
    private int f22760q;

    /* renamed from: r  reason: collision with root package name */
    private float f22761r;

    /* renamed from: s  reason: collision with root package name */
    private float f22762s;

    /* renamed from: t  reason: collision with root package name */
    private ColorFilter f22763t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f22764u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f22765v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f22766w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f22767x;

    private class b extends ViewOutlineProvider {
        private b() {
        }

        public void getOutline(View view, Outline outline) {
            if (CircleImageView.this.f22767x) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            CircleImageView.this.f22749f.roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c() {
        Paint paint = this.f22751h;
        if (paint != null) {
            paint.setColorFilter(this.f22763t);
        }
    }

    private RectF d() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f10 = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f10, f10 + paddingTop);
    }

    private Bitmap e(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f22747z) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f22747z);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private boolean f(float f10, float f11) {
        return this.f22749f.isEmpty() || Math.pow((double) (f10 - this.f22749f.centerX()), 2.0d) + Math.pow((double) (f11 - this.f22749f.centerY()), 2.0d) <= Math.pow((double) this.f22762s, 2.0d);
    }

    private void g() {
        super.setScaleType(f22746y);
        this.f22764u = true;
        setOutlineProvider(new b());
        if (this.f22765v) {
            i();
            this.f22765v = false;
        }
    }

    private void h() {
        this.f22757n = this.f22767x ? null : e(getDrawable());
        i();
    }

    private void i() {
        int i10;
        if (!this.f22764u) {
            this.f22765v = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f22757n == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.f22757n;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f22758o = new BitmapShader(bitmap, tileMode, tileMode);
            this.f22751h.setAntiAlias(true);
            this.f22751h.setDither(true);
            this.f22751h.setFilterBitmap(true);
            this.f22751h.setShader(this.f22758o);
            this.f22752i.setStyle(Paint.Style.STROKE);
            this.f22752i.setAntiAlias(true);
            this.f22752i.setColor(this.f22754k);
            this.f22752i.setStrokeWidth((float) this.f22755l);
            this.f22753j.setStyle(Paint.Style.FILL);
            this.f22753j.setAntiAlias(true);
            this.f22753j.setColor(this.f22756m);
            this.f22760q = this.f22757n.getHeight();
            this.f22759p = this.f22757n.getWidth();
            this.f22749f.set(d());
            this.f22762s = Math.min((this.f22749f.height() - ((float) this.f22755l)) / 2.0f, (this.f22749f.width() - ((float) this.f22755l)) / 2.0f);
            this.f22748e.set(this.f22749f);
            if (!this.f22766w && (i10 = this.f22755l) > 0) {
                this.f22748e.inset(((float) i10) - 1.0f, ((float) i10) - 1.0f);
            }
            this.f22761r = Math.min(this.f22748e.height() / 2.0f, this.f22748e.width() / 2.0f);
            c();
            j();
            invalidate();
        }
    }

    private void j() {
        float f10;
        float f11;
        this.f22750g.set((Matrix) null);
        float f12 = 0.0f;
        if (((float) this.f22759p) * this.f22748e.height() > this.f22748e.width() * ((float) this.f22760q)) {
            f11 = this.f22748e.height() / ((float) this.f22760q);
            f10 = 0.0f;
            f12 = (this.f22748e.width() - (((float) this.f22759p) * f11)) * 0.5f;
        } else {
            f11 = this.f22748e.width() / ((float) this.f22759p);
            f10 = (this.f22748e.height() - (((float) this.f22760q) * f11)) * 0.5f;
        }
        this.f22750g.setScale(f11, f11);
        Matrix matrix = this.f22750g;
        RectF rectF = this.f22748e;
        matrix.postTranslate(((float) ((int) (f12 + 0.5f))) + rectF.left, ((float) ((int) (f10 + 0.5f))) + rectF.top);
        this.f22758o.setLocalMatrix(this.f22750g);
    }

    public int getBorderColor() {
        return this.f22754k;
    }

    public int getBorderWidth() {
        return this.f22755l;
    }

    public int getCircleBackgroundColor() {
        return this.f22756m;
    }

    public ColorFilter getColorFilter() {
        return this.f22763t;
    }

    public ImageView.ScaleType getScaleType() {
        return f22746y;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f22767x) {
            super.onDraw(canvas);
        } else if (this.f22757n != null) {
            if (this.f22756m != 0) {
                canvas.drawCircle(this.f22748e.centerX(), this.f22748e.centerY(), this.f22761r, this.f22753j);
            }
            canvas.drawCircle(this.f22748e.centerX(), this.f22748e.centerY(), this.f22761r, this.f22751h);
            if (this.f22755l > 0) {
                canvas.drawCircle(this.f22749f.centerX(), this.f22749f.centerY(), this.f22762s, this.f22752i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        i();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22767x ? super.onTouchEvent(motionEvent) : f(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    public void setAdjustViewBounds(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i10) {
        if (i10 != this.f22754k) {
            this.f22754k = i10;
            this.f22752i.setColor(i10);
            invalidate();
        }
    }

    public void setBorderOverlay(boolean z10) {
        if (z10 != this.f22766w) {
            this.f22766w = z10;
            i();
        }
    }

    public void setBorderWidth(int i10) {
        if (i10 != this.f22755l) {
            this.f22755l = i10;
            i();
        }
    }

    public void setCircleBackgroundColor(int i10) {
        if (i10 != this.f22756m) {
            this.f22756m = i10;
            this.f22753j.setColor(i10);
            invalidate();
        }
    }

    public void setCircleBackgroundColorResource(int i10) {
        setCircleBackgroundColor(getContext().getResources().getColor(i10));
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f22763t) {
            this.f22763t = colorFilter;
            c();
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z10) {
        if (this.f22767x != z10) {
            this.f22767x = z10;
            h();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        h();
    }

    public void setImageResource(int i10) {
        super.setImageResource(i10);
        h();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h();
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        i();
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        i();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f22746y) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22748e = new RectF();
        this.f22749f = new RectF();
        this.f22750g = new Matrix();
        this.f22751h = new Paint();
        this.f22752i = new Paint();
        this.f22753j = new Paint();
        this.f22754k = -16777216;
        this.f22755l = 0;
        this.f22756m = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ml.a.f25113a, i10, 0);
        this.f22755l = obtainStyledAttributes.getDimensionPixelSize(ml.a.f25116d, 0);
        this.f22754k = obtainStyledAttributes.getColor(ml.a.f25114b, -16777216);
        this.f22766w = obtainStyledAttributes.getBoolean(ml.a.f25115c, false);
        this.f22756m = obtainStyledAttributes.getColor(ml.a.f25117e, 0);
        obtainStyledAttributes.recycle();
        g();
    }
}
