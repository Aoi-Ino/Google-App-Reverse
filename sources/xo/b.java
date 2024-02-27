package xo;

import ap.a;
import java.io.IOException;
import java.security.PublicKey;
import no.c;
import no.d;
import oo.t;
import qn.u;

public class b implements PublicKey {

    /* renamed from: e  reason: collision with root package name */
    private transient u f32819e;

    /* renamed from: f  reason: collision with root package name */
    private transient t f32820f;

    public b(wn.b bVar) {
        a(bVar);
    }

    private void a(wn.b bVar) {
        t tVar = (t) c.a(bVar);
        this.f32820f = tVar;
        this.f32819e = e.a(tVar.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f32819e.Y(bVar.f32819e) && a.a(this.f32820f.e(), bVar.f32820f.e());
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return d.a(this.f32820f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f32819e.hashCode() + (a.j(this.f32820f.e()) * 37);
    }
}
