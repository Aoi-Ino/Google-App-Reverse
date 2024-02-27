package vo;

import ap.a;
import fo.e;
import fo.h;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import mo.c;
import no.d;
import qn.u;

public class b implements PublicKey, Key {

    /* renamed from: e  reason: collision with root package name */
    private transient u f32495e;

    /* renamed from: f  reason: collision with root package name */
    private transient c f32496f;

    public b(wn.b bVar) {
        a(bVar);
    }

    private void a(wn.b bVar) {
        this.f32495e = h.y(bVar.y().E()).B().y();
        this.f32496f = (c) no.c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f32495e.Y(bVar.f32495e) && a.a(this.f32496f.b(), bVar.f32496f.b());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return (this.f32496f.a() != null ? d.a(this.f32496f) : new wn.b(new wn.a(e.f23633r, new h(new wn.a(this.f32495e))), this.f32496f.b())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f32495e.hashCode() + (a.j(this.f32496f.b()) * 37);
    }
}
