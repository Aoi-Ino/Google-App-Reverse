package ro;

import ho.f;
import java.security.PrivateKey;
import zo.a;
import zo.b;
import zo.h;
import zo.i;

public class c implements PrivateKey {

    /* renamed from: e  reason: collision with root package name */
    private f f31186e;

    public c(f fVar) {
        this.f31186e = fVar;
    }

    public b a() {
        return this.f31186e.a();
    }

    public i b() {
        return this.f31186e.b();
    }

    public int c() {
        return this.f31186e.c();
    }

    public int d() {
        return this.f31186e.d();
    }

    public h e() {
        return this.f31186e.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return d() == cVar.d() && c() == cVar.c() && a().equals(cVar.a()) && b().equals(cVar.b()) && g().equals(cVar.g()) && e().equals(cVar.e()) && f().equals(cVar.f());
    }

    public h f() {
        return this.f31186e.f();
    }

    public a g() {
        return this.f31186e.g();
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            fo.c r8 = new fo.c
            ho.f r0 = r9.f31186e
            int r1 = r0.d()
            ho.f r0 = r9.f31186e
            int r2 = r0.c()
            ho.f r0 = r9.f31186e
            zo.b r3 = r0.a()
            ho.f r0 = r9.f31186e
            zo.i r4 = r0.b()
            ho.f r0 = r9.f31186e
            zo.h r5 = r0.e()
            ho.f r0 = r9.f31186e
            zo.h r6 = r0.f()
            ho.f r0 = r9.f31186e
            zo.a r7 = r0.g()
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            wn.a r1 = new wn.a     // Catch:{ IOException -> 0x0041 }
            qn.u r2 = fo.e.f23628m     // Catch:{ IOException -> 0x0041 }
            r1.<init>((qn.u) r2)     // Catch:{ IOException -> 0x0041 }
            vn.b r2 = new vn.b     // Catch:{ IOException -> 0x0041 }
            r2.<init>(r1, r8)     // Catch:{ IOException -> 0x0041 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.c.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.f31186e.c() * 37) + this.f31186e.d()) * 37) + this.f31186e.a().hashCode()) * 37) + this.f31186e.b().hashCode()) * 37) + this.f31186e.e().hashCode()) * 37) + this.f31186e.f().hashCode()) * 37) + this.f31186e.g().hashCode();
    }
}
