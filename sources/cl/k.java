package cl;

import al.a;
import al.b;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import wk.h;

public class k extends a {

    /* renamed from: c  reason: collision with root package name */
    public RectF f20207c = new RectF();

    public k(Paint paint, a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, vk.a aVar, int i10, int i11) {
        RectF rectF;
        if (aVar instanceof h) {
            h hVar = (h) aVar;
            int b10 = hVar.b();
            int a10 = hVar.a();
            int k10 = this.f20204b.k();
            int r10 = this.f20204b.r();
            int n10 = this.f20204b.n();
            if (this.f20204b.e() == b.HORIZONTAL) {
                rectF = this.f20207c;
                rectF.left = (float) b10;
                rectF.right = (float) a10;
                rectF.top = (float) (i11 - k10);
                a10 = i11 + k10;
            } else {
                rectF = this.f20207c;
                rectF.left = (float) (i10 - k10);
                rectF.right = (float) (i10 + k10);
                rectF.top = (float) b10;
            }
            rectF.bottom = (float) a10;
            this.f20203a.setColor(r10);
            float f10 = (float) i10;
            float f11 = (float) i11;
            float f12 = (float) k10;
            canvas.drawCircle(f10, f11, f12, this.f20203a);
            this.f20203a.setColor(n10);
            canvas.drawRoundRect(this.f20207c, f12, f12, this.f20203a);
        }
    }
}
