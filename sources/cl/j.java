package cl;

import al.a;
import al.b;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import wk.g;

public class j extends k {
    public j(Paint paint, a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, vk.a aVar, int i10, int i11) {
        RectF rectF;
        float f10;
        if (aVar instanceof g) {
            g gVar = (g) aVar;
            int b10 = gVar.b();
            int a10 = gVar.a();
            int e10 = gVar.e() / 2;
            int k10 = this.f20204b.k();
            int r10 = this.f20204b.r();
            int n10 = this.f20204b.n();
            if (this.f20204b.e() == b.HORIZONTAL) {
                rectF = this.f20207c;
                rectF.left = (float) b10;
                rectF.right = (float) a10;
                rectF.top = (float) (i11 - e10);
                f10 = (float) (e10 + i11);
            } else {
                rectF = this.f20207c;
                rectF.left = (float) (i10 - e10);
                rectF.right = (float) (e10 + i10);
                rectF.top = (float) b10;
                f10 = (float) a10;
            }
            rectF.bottom = f10;
            this.f20203a.setColor(r10);
            float f11 = (float) i10;
            float f12 = (float) i11;
            float f13 = (float) k10;
            canvas.drawCircle(f11, f12, f13, this.f20203a);
            this.f20203a.setColor(n10);
            canvas.drawRoundRect(this.f20207c, f13, f13, this.f20203a);
        }
    }
}
