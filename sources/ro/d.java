package ro;

import fo.e;
import ho.g;
import java.io.IOException;
import java.security.PublicKey;
import qn.f;
import wn.b;
import zo.a;

public class d implements PublicKey {

    /* renamed from: e  reason: collision with root package name */
    private g f31187e;

    public d(g gVar) {
        this.f31187e = gVar;
    }

    public a a() {
        return this.f31187e.a();
    }

    public int b() {
        return this.f31187e.b();
    }

    public int c() {
        return this.f31187e.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f31187e.b() == dVar.b() && this.f31187e.c() == dVar.c() && this.f31187e.a().equals(dVar.a());
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        try {
            return new b(new wn.a(e.f23628m), (f) new fo.d(this.f31187e.b(), this.f31187e.c(), this.f31187e.a())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f31187e.b() + (this.f31187e.c() * 37)) * 37) + this.f31187e.a().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n" + " length of the code         : " + this.f31187e.b() + "\n") + " error correction capability: " + this.f31187e.c() + "\n") + " generator matrix           : " + this.f31187e.a();
    }
}
