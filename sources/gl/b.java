package gl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import gl.t;
import gl.y;

class b extends y {

    /* renamed from: b  reason: collision with root package name */
    private static final int f23782b = 22;

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f23783a;

    public b(Context context) {
        this.f23783a = context.getAssets();
    }

    static String j(w wVar) {
        return wVar.f23945d.toString().substring(f23782b);
    }

    public boolean c(w wVar) {
        Uri uri = wVar.f23945d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public y.a f(w wVar, int i10) {
        return new y.a(this.f23783a.open(j(wVar)), t.e.DISK);
    }
}
