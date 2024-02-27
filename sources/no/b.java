package no;

import ap.f;
import fo.e;
import fo.h;
import fo.i;
import fo.j;
import fo.k;
import fo.m;
import go.c;
import java.io.IOException;
import oo.a0;
import oo.s;
import oo.y;
import qn.d0;
import qn.q1;
import zn.a;

public abstract class b {
    public static vn.b a(a aVar, d0 d0Var) {
        if (aVar instanceof jo.a) {
            jo.a aVar2 = (jo.a) aVar;
            return new vn.b(e.d(aVar2.b()), new q1(aVar2.a()), d0Var);
        } else if (aVar instanceof mo.b) {
            mo.b bVar = (mo.b) aVar;
            return new vn.b(new wn.a(e.f23633r, new h(e.f(bVar.a()))), new q1(bVar.b()));
        } else if (aVar instanceof io.a) {
            wn.a aVar3 = new wn.a(e.f23637v);
            short[] a10 = ((io.a) aVar).a();
            byte[] bArr = new byte[(a10.length * 2)];
            for (int i10 = 0; i10 != a10.length; i10++) {
                f.l(a10[i10], bArr, i10 * 2);
            }
            return new vn.b(aVar3, new q1(bArr));
        } else if (aVar instanceof go.h) {
            go.h hVar = (go.h) aVar;
            byte[] b10 = go.a.f().i(1).c(hVar).b();
            return new vn.b(new wn.a(vn.a.I0), new q1(b10), d0Var, go.a.f().i(1).c(hVar.i()).b());
        } else if (aVar instanceof c) {
            c cVar = (c) aVar;
            byte[] b11 = go.a.f().i(cVar.c()).c(cVar).b();
            return new vn.b(new wn.a(vn.a.I0), new q1(b11), d0Var, go.a.f().i(cVar.c()).c(cVar.d().c()).b());
        } else if (aVar instanceof y) {
            y yVar = (y) aVar;
            return new vn.b(new wn.a(e.f23638w, new i(yVar.b().b(), e.h(yVar.a()))), b(yVar), d0Var);
        } else if (aVar instanceof s) {
            s sVar = (s) aVar;
            return new vn.b(new wn.a(e.F, new j(sVar.b().a(), sVar.b().b(), e.h(sVar.a()))), c(sVar), d0Var);
        } else if (aVar instanceof ho.b) {
            ho.b bVar2 = (ho.b) aVar;
            return new vn.b(new wn.a(e.f23629n), new fo.a(bVar2.f(), bVar2.e(), bVar2.b(), bVar2.c(), bVar2.g(), e.a(bVar2.a())));
        } else {
            throw new IOException("key parameters not recognized");
        }
    }

    private static m b(y yVar) {
        byte[] encoded = yVar.getEncoded();
        int h10 = yVar.b().h();
        int b10 = yVar.b().b();
        int a10 = (int) a0.a(encoded, 0, 4);
        if (a0.l(b10, (long) a10)) {
            byte[] g10 = a0.g(encoded, 4, h10);
            int i10 = 4 + h10;
            byte[] g11 = a0.g(encoded, i10, h10);
            int i11 = i10 + h10;
            byte[] g12 = a0.g(encoded, i11, h10);
            int i12 = i11 + h10;
            byte[] g13 = a0.g(encoded, i12, h10);
            int i13 = i12 + h10;
            byte[] g14 = a0.g(encoded, i13, encoded.length - i13);
            try {
                oo.a aVar = (oo.a) a0.f(g14, oo.a.class);
                return aVar.c() != (1 << b10) - 1 ? new m(a10, g10, g11, g12, g13, g14, aVar.c()) : new m(a10, g10, g11, g12, g13, g14);
            } catch (ClassNotFoundException e10) {
                throw new IOException("cannot parse BDS: " + e10.getMessage());
            }
        } else {
            throw new IllegalArgumentException("index out of bounds");
        }
    }

    private static k c(s sVar) {
        byte[] encoded = sVar.getEncoded();
        int f10 = sVar.b().f();
        int a10 = sVar.b().a();
        int i10 = (a10 + 7) / 8;
        long a11 = (long) ((int) a0.a(encoded, 0, i10));
        if (a0.l(a10, a11)) {
            byte[] g10 = a0.g(encoded, i10, f10);
            int i11 = i10 + f10;
            byte[] g11 = a0.g(encoded, i11, f10);
            int i12 = i11 + f10;
            byte[] g12 = a0.g(encoded, i12, f10);
            int i13 = i12 + f10;
            byte[] g13 = a0.g(encoded, i13, f10);
            int i14 = i13 + f10;
            byte[] g14 = a0.g(encoded, i14, encoded.length - i14);
            try {
                oo.b bVar = (oo.b) a0.f(g14, oo.b.class);
                return bVar.b() != (1 << a10) - 1 ? new k(a11, g10, g11, g12, g13, g14, bVar.b()) : new k(a11, g10, g11, g12, g13, g14);
            } catch (ClassNotFoundException e10) {
                throw new IOException("cannot parse BDSStateMap: " + e10.getMessage());
            }
        } else {
            throw new IllegalArgumentException("index out of bounds");
        }
    }
}
