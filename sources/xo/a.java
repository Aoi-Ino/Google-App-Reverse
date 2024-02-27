package xo;

import fo.j;
import java.io.IOException;
import java.security.PrivateKey;
import oo.s;
import qn.d0;
import qn.u;
import vn.b;

public class a implements PrivateKey {

    /* renamed from: e  reason: collision with root package name */
    private transient u f32816e;

    /* renamed from: f  reason: collision with root package name */
    private transient s f32817f;

    /* renamed from: g  reason: collision with root package name */
    private transient d0 f32818g;

    public a(b bVar) {
        a(bVar);
    }

    private void a(b bVar) {
        this.f32818g = bVar.y();
        this.f32816e = j.B(bVar.E().E()).F().y();
        this.f32817f = (s) no.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f32816e.Y(aVar.f32816e) && ap.a.a(this.f32817f.c(), aVar.f32817f.c());
    }

    public String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return no.b.a(this.f32817f, this.f32818g).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f32816e.hashCode() + (ap.a.j(this.f32817f.c()) * 37);
    }
}
