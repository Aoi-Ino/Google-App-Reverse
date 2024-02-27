package so;

import ap.a;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import no.c;
import no.d;

public class b implements Key, PublicKey {

    /* renamed from: e  reason: collision with root package name */
    private transient io.b f31330e;

    public b(wn.b bVar) {
        a(bVar);
    }

    private void a(wn.b bVar) {
        this.f31330e = (io.b) c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return a.a(this.f31330e.a(), ((b) obj).f31330e.a());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return d.a(this.f31330e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return a.j(this.f31330e.a());
    }
}
