package cl;

import al.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import wk.b;

public class d extends a {
    public d(Paint paint, a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, vk.a aVar, int i10, int i11) {
        float a10;
        int c10;
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            int r10 = this.f20204b.r();
            int n10 = this.f20204b.n();
            this.f20203a.setColor(r10);
            canvas.drawCircle((float) i10, (float) i11, (float) this.f20204b.k(), this.f20203a);
            this.f20203a.setColor(n10);
            if (this.f20204b.e() == al.b.HORIZONTAL) {
                a10 = (float) bVar.c();
                c10 = bVar.a();
            } else {
                a10 = (float) bVar.a();
                c10 = bVar.c();
            }
            canvas.drawCircle(a10, (float) c10, (float) bVar.b(), this.f20203a);
        }
    }
}
