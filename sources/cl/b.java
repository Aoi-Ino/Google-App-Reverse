package cl;

import al.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import xk.e;

public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private Paint f20205c;

    public b(Paint paint, a aVar) {
        super(paint, aVar);
        Paint paint2 = new Paint();
        this.f20205c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f20205c.setAntiAlias(true);
        this.f20205c.setStrokeWidth((float) aVar.q());
    }

    public void a(Canvas canvas, int i10, boolean z10, int i11, int i12) {
        Paint paint;
        float k10 = (float) this.f20204b.k();
        int q10 = this.f20204b.q();
        float m10 = this.f20204b.m();
        int n10 = this.f20204b.n();
        int r10 = this.f20204b.r();
        int o10 = this.f20204b.o();
        e b10 = this.f20204b.b();
        if ((b10 == e.SCALE && !z10) || (b10 == e.SCALE_DOWN && z10)) {
            k10 *= m10;
        }
        if (i10 != o10) {
            n10 = r10;
        }
        if (b10 != e.FILL || i10 == o10) {
            paint = this.f20203a;
        } else {
            paint = this.f20205c;
            paint.setStrokeWidth((float) q10);
        }
        paint.setColor(n10);
        canvas.drawCircle((float) i11, (float) i12, k10, paint);
    }
}
