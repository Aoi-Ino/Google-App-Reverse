package qo;

import go.g;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import qn.d0;
import vn.b;

public class a implements PrivateKey, Key {

    /* renamed from: e  reason: collision with root package name */
    private transient g f31017e;

    /* renamed from: f  reason: collision with root package name */
    private transient d0 f31018f;

    public a(b bVar) {
        a(bVar);
    }

    private void a(b bVar) {
        this.f31018f = bVar.y();
        this.f31017e = (g) no.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            return ap.a.a(this.f31017e.getEncoded(), ((a) obj).f31017e.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    public String getAlgorithm() {
        return "LMS";
    }

    public byte[] getEncoded() {
        try {
            return no.b.a(this.f31017e, this.f31018f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return ap.a.j(this.f31017e.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
