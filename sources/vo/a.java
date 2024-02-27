package vo;

import fo.e;
import fo.h;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import mo.b;
import qn.d0;
import qn.q1;
import qn.u;

public class a implements PrivateKey, Key {

    /* renamed from: e  reason: collision with root package name */
    private transient u f32492e;

    /* renamed from: f  reason: collision with root package name */
    private transient b f32493f;

    /* renamed from: g  reason: collision with root package name */
    private transient d0 f32494g;

    public a(vn.b bVar) {
        a(bVar);
    }

    private void a(vn.b bVar) {
        this.f32494g = bVar.y();
        this.f32492e = h.y(bVar.E().E()).B().y();
        this.f32493f = (b) no.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f32492e.Y(aVar.f32492e) && ap.a.a(this.f32493f.b(), aVar.f32493f.b());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return (this.f32493f.a() != null ? no.b.a(this.f32493f, this.f32494g) : new vn.b(new wn.a(e.f23633r, new h(new wn.a(this.f32492e))), new q1(this.f32493f.b()), this.f32494g)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f32492e.hashCode() + (ap.a.j(this.f32493f.b()) * 37);
    }
}
