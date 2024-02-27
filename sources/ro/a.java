package ro;

import fo.e;
import ho.b;
import java.io.IOException;
import java.security.PrivateKey;
import zo.h;
import zo.i;

public class a implements PrivateKey {

    /* renamed from: e  reason: collision with root package name */
    private b f31184e;

    public a(b bVar) {
        this.f31184e = bVar;
    }

    public zo.b a() {
        return this.f31184e.b();
    }

    public i b() {
        return this.f31184e.c();
    }

    public zo.a c() {
        return this.f31184e.d();
    }

    public int d() {
        return this.f31184e.e();
    }

    public int e() {
        return this.f31184e.f();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e() == aVar.e() && d() == aVar.d() && a().equals(aVar.a()) && b().equals(aVar.b()) && f().equals(aVar.f()) && c().equals(aVar.c());
    }

    public h f() {
        return this.f31184e.g();
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            return new vn.b(new wn.a(e.f23629n), new fo.a(e(), d(), a(), b(), f(), g.a(this.f31184e.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.f31184e.e() * 37) + this.f31184e.f()) * 37) + this.f31184e.b().hashCode()) * 37) + this.f31184e.c().hashCode()) * 37) + this.f31184e.g().hashCode()) * 37) + this.f31184e.d().hashCode();
    }
}
