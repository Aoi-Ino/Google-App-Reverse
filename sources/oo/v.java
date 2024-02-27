package oo;

import oo.g;
import oo.i;
import oo.o;

abstract class v {
    static u a(k kVar, n nVar, i iVar) {
        double d10;
        if (nVar == null) {
            throw new NullPointerException("publicKey == null");
        } else if (iVar != null) {
            int a10 = kVar.d().a();
            byte[][] a11 = nVar.a();
            u[] uVarArr = new u[a11.length];
            for (int i10 = 0; i10 < a11.length; i10++) {
                uVarArr[i10] = new u(0, a11[i10]);
            }
            o.a f10 = ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(iVar.e()).o(0).p(iVar.g()).f(iVar.a());
            while (true) {
                i iVar2 = (i) ((i.b) f10).l();
                if (a10 <= 1) {
                    return uVarArr[0];
                }
                int i11 = 0;
                while (true) {
                    d10 = (double) (a10 / 2);
                    if (i11 >= ((int) Math.floor(d10))) {
                        break;
                    }
                    iVar2 = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar2.b())).h(iVar2.c())).n(iVar2.e()).o(iVar2.f()).p(i11).f(iVar2.a())).l();
                    int i12 = i11 * 2;
                    uVarArr[i11] = b(kVar, uVarArr[i12], uVarArr[i12 + 1], iVar2);
                    i11++;
                }
                if (a10 % 2 == 1) {
                    uVarArr[(int) Math.floor(d10)] = uVarArr[a10 - 1];
                }
                a10 = (int) Math.ceil(((double) a10) / 2.0d);
                f10 = ((i.b) ((i.b) new i.b().g(iVar2.b())).h(iVar2.c())).n(iVar2.e()).o(iVar2.f() + 1).p(iVar2.g()).f(iVar2.a());
            }
        } else {
            throw new NullPointerException("address == null");
        }
    }

    static u b(k kVar, u uVar, u uVar2, o oVar) {
        if (uVar == null) {
            throw new NullPointerException("left == null");
        } else if (uVar2 == null) {
            throw new NullPointerException("right == null");
        } else if (uVar.a() != uVar2.a()) {
            throw new IllegalStateException("height of both nodes must be equal");
        } else if (oVar != null) {
            byte[] f10 = kVar.f();
            if (oVar instanceof i) {
                i iVar = (i) oVar;
                oVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(iVar.e()).o(iVar.f()).p(iVar.g()).f(0)).l();
            } else if (oVar instanceof g) {
                g gVar = (g) oVar;
                oVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n(gVar.f()).f(0)).k();
            }
            byte[] c10 = kVar.c().c(f10, oVar.d());
            if (oVar instanceof i) {
                i iVar2 = (i) oVar;
                oVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar2.b())).h(iVar2.c())).n(iVar2.e()).o(iVar2.f()).p(iVar2.g()).f(1)).l();
            } else if (oVar instanceof g) {
                g gVar2 = (g) oVar;
                oVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e()).n(gVar2.f()).f(1)).k();
            }
            byte[] c11 = kVar.c().c(f10, oVar.d());
            if (oVar instanceof i) {
                i iVar3 = (i) oVar;
                oVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar3.b())).h(iVar3.c())).n(iVar3.e()).o(iVar3.f()).p(iVar3.g()).f(2)).l();
            } else if (oVar instanceof g) {
                g gVar3 = (g) oVar;
                oVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar3.b())).h(gVar3.c())).m(gVar3.e()).n(gVar3.f()).f(2)).k();
            }
            byte[] c12 = kVar.c().c(f10, oVar.d());
            int c13 = kVar.d().c();
            byte[] bArr = new byte[(c13 * 2)];
            for (int i10 = 0; i10 < c13; i10++) {
                bArr[i10] = (byte) (uVar.b()[i10] ^ c11[i10]);
            }
            for (int i11 = 0; i11 < c13; i11++) {
                bArr[i11 + c13] = (byte) (uVar2.b()[i11] ^ c12[i11]);
            }
            return new u(uVar.a(), kVar.c().b(c10, bArr));
        } else {
            throw new NullPointerException("address == null");
        }
    }
}
