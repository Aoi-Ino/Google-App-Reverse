package no;

import fo.e;
import fo.h;
import fo.j;
import fo.l;
import fo.n;
import go.i;
import java.io.IOException;
import mo.c;
import oo.t;
import oo.z;
import qn.f;
import qn.q1;
import wn.b;
import zn.a;

public abstract class d {
    public static b a(a aVar) {
        if (aVar instanceof jo.b) {
            jo.b bVar = (jo.b) aVar;
            return new b(e.d(bVar.b()), bVar.a());
        } else if (aVar instanceof c) {
            c cVar = (c) aVar;
            return new b(new wn.a(e.f23633r, new h(e.f(cVar.a()))), cVar.b());
        } else if (aVar instanceof io.b) {
            return new b(new wn.a(e.f23637v), ((io.b) aVar).a());
        } else {
            if (aVar instanceof i) {
                return new b(new wn.a(vn.a.I0), (f) new q1(go.a.f().i(1).c((i) aVar).b()));
            } else if (aVar instanceof go.d) {
                go.d dVar = (go.d) aVar;
                return new b(new wn.a(vn.a.I0), (f) new q1(go.a.f().i(dVar.b()).c(dVar.c()).b()));
            } else if (aVar instanceof z) {
                z zVar = (z) aVar;
                byte[] c10 = zVar.c();
                byte[] d10 = zVar.d();
                byte[] encoded = zVar.getEncoded();
                return encoded.length > c10.length + d10.length ? new b(new wn.a(sn.a.f31326a), (f) new q1(encoded)) : new b(new wn.a(e.f23638w, new fo.i(zVar.b().b(), e.h(zVar.a()))), (f) new n(c10, d10));
            } else if (aVar instanceof t) {
                t tVar = (t) aVar;
                byte[] c11 = tVar.c();
                byte[] d11 = tVar.d();
                byte[] encoded2 = tVar.getEncoded();
                return encoded2.length > c11.length + d11.length ? new b(new wn.a(sn.a.f31327b), (f) new q1(encoded2)) : new b(new wn.a(e.F, new j(tVar.b().a(), tVar.b().b(), e.h(tVar.a()))), (f) new l(tVar.c(), tVar.d()));
            } else if (aVar instanceof ho.c) {
                ho.c cVar2 = (ho.c) aVar;
                return new b(new wn.a(e.f23629n), (f) new fo.b(cVar2.c(), cVar2.d(), cVar2.b(), e.a(cVar2.a())));
            } else {
                throw new IOException("key parameters not recognized");
            }
        }
    }
}
