package gl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import gl.t;
import gl.y;

class z extends y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23992a;

    z(Context context) {
        this.f23992a = context;
    }

    private static Bitmap j(Resources resources, int i10, w wVar) {
        BitmapFactory.Options d10 = y.d(wVar);
        if (y.g(d10)) {
            BitmapFactory.decodeResource(resources, i10, d10);
            y.b(wVar.f23949h, wVar.f23950i, d10, wVar);
        }
        return BitmapFactory.decodeResource(resources, i10, d10);
    }

    public boolean c(w wVar) {
        if (wVar.f23946e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f23945d.getScheme());
    }

    public y.a f(w wVar, int i10) {
        Resources o10 = e0.o(this.f23992a, wVar);
        return new y.a(j(o10, e0.n(o10, wVar), wVar), t.e.DISK);
    }
}
