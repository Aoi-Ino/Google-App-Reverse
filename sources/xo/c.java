package xo;

import fo.i;
import java.io.IOException;
import java.security.PrivateKey;
import no.a;
import oo.y;
import qn.d0;
import qn.u;
import vn.b;

public class c implements PrivateKey {

    /* renamed from: e  reason: collision with root package name */
    private transient y f32821e;

    /* renamed from: f  reason: collision with root package name */
    private transient u f32822f;

    /* renamed from: g  reason: collision with root package name */
    private transient d0 f32823g;

    public c(b bVar) {
        a(bVar);
    }

    private void a(b bVar) {
        this.f32823g = bVar.y();
        this.f32822f = i.B(bVar.E().E()).E().y();
        this.f32821e = (y) a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f32822f.Y(cVar.f32822f) && ap.a.a(this.f32821e.c(), cVar.f32821e.c());
    }

    public String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return no.b.a(this.f32821e, this.f32823g).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f32822f.hashCode() + (ap.a.j(this.f32821e.c()) * 37);
    }
}
