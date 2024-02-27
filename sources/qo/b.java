package qo;

import ap.a;
import go.g;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import no.c;
import no.d;

public class b implements PublicKey, Key {

    /* renamed from: e  reason: collision with root package name */
    private transient g f31019e;

    public b(wn.b bVar) {
        a(bVar);
    }

    private void a(wn.b bVar) {
        this.f31019e = (g) c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            try {
                return a.a(this.f31019e.getEncoded(), ((b) obj).f31019e.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "LMS";
    }

    public byte[] getEncoded() {
        try {
            return d.a(this.f31019e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return a.j(this.f31019e.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
