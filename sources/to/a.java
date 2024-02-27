package to;

import java.io.IOException;
import java.security.PrivateKey;
import jo.c;
import qn.d0;
import vn.b;

public class a implements PrivateKey {

    /* renamed from: e  reason: collision with root package name */
    private transient jo.a f31723e;

    /* renamed from: f  reason: collision with root package name */
    private transient d0 f31724f;

    public a(b bVar) {
        a(bVar);
    }

    private void a(b bVar) {
        this.f31724f = bVar.y();
        this.f31723e = (jo.a) no.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f31723e.b() == aVar.f31723e.b() && ap.a.a(this.f31723e.a(), aVar.f31723e.a());
    }

    public final String getAlgorithm() {
        return c.a(this.f31723e.b());
    }

    public byte[] getEncoded() {
        try {
            return no.b.a(this.f31723e, this.f31724f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f31723e.b() + (ap.a.j(this.f31723e.a()) * 37);
    }
}
