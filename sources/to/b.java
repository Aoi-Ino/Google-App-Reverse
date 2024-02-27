package to;

import ap.a;
import java.io.IOException;
import java.security.PublicKey;
import no.c;
import no.d;

public class b implements PublicKey {

    /* renamed from: e  reason: collision with root package name */
    private transient jo.b f31725e;

    public b(wn.b bVar) {
        a(bVar);
    }

    private void a(wn.b bVar) {
        this.f31725e = (jo.b) c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f31725e.b() == bVar.f31725e.b() && a.a(this.f31725e.a(), bVar.f31725e.a());
    }

    public final String getAlgorithm() {
        return jo.c.a(this.f31725e.b());
    }

    public byte[] getEncoded() {
        try {
            return d.a(this.f31725e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f31725e.b() + (a.j(this.f31725e.a()) * 37);
    }
}
