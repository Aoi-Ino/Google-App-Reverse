package ro;

import fo.e;
import ho.c;
import java.io.IOException;
import java.security.PublicKey;
import qn.f;
import zo.a;

public class b implements PublicKey {

    /* renamed from: e  reason: collision with root package name */
    private c f31185e;

    public b(c cVar) {
        this.f31185e = cVar;
    }

    public a a() {
        return this.f31185e.b();
    }

    public int b() {
        return this.f31185e.c();
    }

    public int c() {
        return this.f31185e.d();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f31185e.c() == bVar.b() && this.f31185e.d() == bVar.c() && this.f31185e.b().equals(bVar.a());
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            return new wn.b(new wn.a(e.f23629n), (f) new fo.b(this.f31185e.c(), this.f31185e.d(), this.f31185e.b(), g.a(this.f31185e.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f31185e.c() + (this.f31185e.d() * 37)) * 37) + this.f31185e.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n" + " length of the code         : " + this.f31185e.c() + "\n") + " error correction capability: " + this.f31185e.d() + "\n") + " generator matrix           : " + this.f31185e.b().toString();
    }
}
