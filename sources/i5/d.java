package i5;

import android.graphics.RectF;

public abstract class d {
    public abstract void a(m mVar, float f10, float f11, float f12);

    public void b(m mVar, float f10, float f11, RectF rectF, c cVar) {
        a(mVar, f10, f11, cVar.a(rectF));
    }
}
