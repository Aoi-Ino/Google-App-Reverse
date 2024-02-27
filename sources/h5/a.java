package h5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f12012i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f12013j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f12014k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f12015l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f12016a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f12017b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f12018c;

    /* renamed from: d  reason: collision with root package name */
    private int f12019d;

    /* renamed from: e  reason: collision with root package name */
    private int f12020e;

    /* renamed from: f  reason: collision with root package name */
    private int f12021f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f12022g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f12023h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i11 = i10;
        float f12 = f11;
        boolean z10 = f12 < 0.0f;
        Path path = this.f12022g;
        if (z10) {
            int[] iArr = f12014k;
            iArr[0] = 0;
            iArr[1] = this.f12021f;
            iArr[2] = this.f12020e;
            iArr[3] = this.f12019d;
            float f13 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f10, f12);
            path.close();
            float f14 = (float) (-i11);
            rectF2.inset(f14, f14);
            int[] iArr2 = f12014k;
            iArr2[0] = 0;
            iArr2[1] = this.f12019d;
            iArr2[2] = this.f12020e;
            iArr2[3] = this.f12021f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f15 = 1.0f - (((float) i11) / width);
            float[] fArr = f12015l;
            fArr[1] = f15;
            fArr[2] = ((1.0f - f15) / 2.0f) + f15;
            this.f12017b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f12014k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f12023h);
            }
            canvas.drawArc(rectF, f10, f11, true, this.f12017b);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += (float) i10;
        rectF.offset(0.0f, (float) (-i10));
        int[] iArr = f12012i;
        iArr[0] = this.f12021f;
        iArr[1] = this.f12020e;
        iArr[2] = this.f12019d;
        Paint paint = this.f12018c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f12013j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f12018c);
        canvas.restore();
    }

    public Paint c() {
        return this.f12016a;
    }

    public void d(int i10) {
        this.f12019d = androidx.core.graphics.a.k(i10, 68);
        this.f12020e = androidx.core.graphics.a.k(i10, 20);
        this.f12021f = androidx.core.graphics.a.k(i10, 0);
        this.f12016a.setColor(this.f12019d);
    }

    public a(int i10) {
        this.f12022g = new Path();
        Paint paint = new Paint();
        this.f12023h = paint;
        this.f12016a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f12017b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f12018c = new Paint(paint2);
    }
}
