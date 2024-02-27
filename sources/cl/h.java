package cl;

import al.a;
import al.b;
import android.graphics.Canvas;
import android.graphics.Paint;
import wk.e;

public class h extends a {
    public h(Paint paint, a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, vk.a aVar, int i10, int i11) {
        if (aVar instanceof e) {
            int a10 = ((e) aVar).a();
            int r10 = this.f20204b.r();
            int n10 = this.f20204b.n();
            int k10 = this.f20204b.k();
            this.f20203a.setColor(r10);
            float f10 = (float) i10;
            float f11 = (float) i11;
            float f12 = (float) k10;
            canvas.drawCircle(f10, f11, f12, this.f20203a);
            this.f20203a.setColor(n10);
            float f13 = (float) a10;
            if (this.f20204b.e() == b.HORIZONTAL) {
                canvas.drawCircle(f13, f11, f12, this.f20203a);
            } else {
                canvas.drawCircle(f10, f13, f12, this.f20203a);
            }
        }
    }
}
