package so;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import qn.d0;
import vn.b;

public class a implements Key, PrivateKey {

    /* renamed from: e  reason: collision with root package name */
    private transient io.a f31328e;

    /* renamed from: f  reason: collision with root package name */
    private transient d0 f31329f;

    public a(b bVar) {
        a(bVar);
    }

    private void a(b bVar) {
        this.f31329f = bVar.y();
        this.f31328e = (io.a) no.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return ap.a.c(this.f31328e.a(), ((a) obj).f31328e.a());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return no.b.a(this.f31328e, this.f31329f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return ap.a.n(this.f31328e.a());
    }
}
