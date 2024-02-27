package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import f.a;
import f.i;
import f.j;

public class b extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    private static final float f11917m = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final Paint f11918a;

    /* renamed from: b  reason: collision with root package name */
    private float f11919b;

    /* renamed from: c  reason: collision with root package name */
    private float f11920c;

    /* renamed from: d  reason: collision with root package name */
    private float f11921d;

    /* renamed from: e  reason: collision with root package name */
    private float f11922e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11923f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f11924g = new Path();

    /* renamed from: h  reason: collision with root package name */
    private final int f11925h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11926i = false;

    /* renamed from: j  reason: collision with root package name */
    private float f11927j;

    /* renamed from: k  reason: collision with root package name */
    private float f11928k;

    /* renamed from: l  reason: collision with root package name */
    private int f11929l = 2;

    public b(Context context) {
        Paint paint = new Paint();
        this.f11918a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, j.Z0, a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        d(obtainStyledAttributes.getColor(j.f11195d1, 0));
        c(obtainStyledAttributes.getDimension(j.f11215h1, 0.0f));
        f(obtainStyledAttributes.getBoolean(j.f11210g1, true));
        e((float) Math.round(obtainStyledAttributes.getDimension(j.f11205f1, 0.0f)));
        this.f11925h = obtainStyledAttributes.getDimensionPixelSize(j.f11200e1, 0);
        this.f11920c = (float) Math.round(obtainStyledAttributes.getDimension(j.f11190c1, 0.0f));
        this.f11919b = (float) Math.round(obtainStyledAttributes.getDimension(j.f11180a1, 0.0f));
        this.f11921d = obtainStyledAttributes.getDimension(j.f11185b1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float b(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public float a() {
        return this.f11927j;
    }

    public void c(float f10) {
        if (this.f11918a.getStrokeWidth() != f10) {
            this.f11918a.setStrokeWidth(f10);
            this.f11928k = (float) (((double) (f10 / 2.0f)) * Math.cos((double) f11917m));
            invalidateSelf();
        }
    }

    public void d(int i10) {
        if (i10 != this.f11918a.getColor()) {
            this.f11918a.setColor(i10);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i10 = this.f11929l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? androidx.core.graphics.drawable.a.f(this) == 0 : androidx.core.graphics.drawable.a.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f11919b;
        float b10 = b(this.f11920c, (float) Math.sqrt((double) (f10 * f10 * 2.0f)), this.f11927j);
        float b11 = b(this.f11920c, this.f11921d, this.f11927j);
        float round = (float) Math.round(b(0.0f, this.f11928k, this.f11927j));
        float b12 = b(0.0f, f11917m, this.f11927j);
        double d10 = (double) b10;
        float b13 = b(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f11927j);
        double d11 = (double) b12;
        boolean z11 = z10;
        float round2 = (float) Math.round(Math.cos(d11) * d10);
        float round3 = (float) Math.round(d10 * Math.sin(d11));
        this.f11924g.rewind();
        float b14 = b(this.f11922e + this.f11918a.getStrokeWidth(), -this.f11928k, this.f11927j);
        float f11 = (-b11) / 2.0f;
        this.f11924g.moveTo(f11 + round, 0.0f);
        this.f11924g.rLineTo(b11 - (round * 2.0f), 0.0f);
        this.f11924g.moveTo(f11, b14);
        this.f11924g.rLineTo(round2, round3);
        this.f11924g.moveTo(f11, -b14);
        this.f11924g.rLineTo(round2, -round3);
        this.f11924g.close();
        canvas.save();
        float strokeWidth = this.f11918a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f12 = this.f11922e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f12))) / 4) * 2)) + (strokeWidth * 1.5f) + f12);
        if (this.f11923f) {
            canvas2.rotate(b13 * ((float) (this.f11926i ^ z11 ? -1 : 1)));
        } else if (z11) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f11924g, this.f11918a);
        canvas.restore();
    }

    public void e(float f10) {
        if (f10 != this.f11922e) {
            this.f11922e = f10;
            invalidateSelf();
        }
    }

    public void f(boolean z10) {
        if (this.f11923f != z10) {
            this.f11923f = z10;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.f11925h;
    }

    public int getIntrinsicWidth() {
        return this.f11925h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i10) {
        if (i10 != this.f11918a.getAlpha()) {
            this.f11918a.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11918a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f11927j != f10) {
            this.f11927j = f10;
            invalidateSelf();
        }
    }
}
