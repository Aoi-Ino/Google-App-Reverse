package gl;

import android.content.Context;
import gl.t;
import gl.y;
import java.io.InputStream;

class g extends y {

    /* renamed from: a  reason: collision with root package name */
    final Context f23832a;

    g(Context context) {
        this.f23832a = context;
    }

    public boolean c(w wVar) {
        return "content".equals(wVar.f23945d.getScheme());
    }

    public y.a f(w wVar, int i10) {
        return new y.a(j(wVar), t.e.DISK);
    }

    /* access modifiers changed from: package-private */
    public InputStream j(w wVar) {
        return this.f23832a.getContentResolver().openInputStream(wVar.f23945d);
    }
}
