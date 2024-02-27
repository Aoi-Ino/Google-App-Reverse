package xo;

import ap.a;
import java.io.IOException;
import java.security.PublicKey;
import no.c;
import oo.z;
import qn.u;
import wn.b;

public class d implements PublicKey {

    /* renamed from: e  reason: collision with root package name */
    private transient z f32824e;

    /* renamed from: f  reason: collision with root package name */
    private transient u f32825f;

    public d(b bVar) {
        a(bVar);
    }

    private void a(b bVar) {
        z zVar = (z) c.a(bVar);
        this.f32824e = zVar;
        this.f32825f = e.a(zVar.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            try {
                return this.f32825f.Y(dVar.f32825f) && a.a(this.f32824e.getEncoded(), dVar.f32824e.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return no.d.a(this.f32824e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return this.f32825f.hashCode() + (a.j(this.f32824e.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f32825f.hashCode();
        }
    }
}
