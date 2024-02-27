package gl;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import gl.j;
import gl.t;
import gl.y;
import java.io.IOException;
import java.io.InputStream;

class r extends y {

    /* renamed from: a  reason: collision with root package name */
    private final j f23890a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f23891b;

    static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public r(j jVar, a0 a0Var) {
        this.f23890a = jVar;
        this.f23891b = a0Var;
    }

    public boolean c(w wVar) {
        String scheme = wVar.f23945d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return 2;
    }

    public y.a f(w wVar, int i10) {
        j.a a10 = this.f23890a.a(wVar.f23945d, wVar.f23944c);
        if (a10 == null) {
            return null;
        }
        t.e eVar = a10.f23857c ? t.e.DISK : t.e.NETWORK;
        Bitmap a11 = a10.a();
        if (a11 != null) {
            return new y.a(a11, eVar);
        }
        InputStream c10 = a10.c();
        if (c10 == null) {
            return null;
        }
        if (eVar == t.e.DISK && a10.b() == 0) {
            e0.e(c10);
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == t.e.NETWORK && a10.b() > 0) {
            this.f23891b.f(a10.b());
        }
        return new y.a(c10, eVar);
    }

    /* access modifiers changed from: package-private */
    public boolean h(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return true;
    }
}
