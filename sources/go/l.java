package go;

import ap.f;
import xn.a;

abstract class l {
    static byte[] a(e eVar, byte[] bArr, int i10, byte[] bArr2) {
        a a10 = b.a(eVar.b());
        byte[] b10 = a.f().d(bArr).i(i10).h(-32640).g(0, 22).b();
        a10.d(b10, 0, b10.length);
        a a11 = b.a(eVar.b());
        byte[] b11 = a.f().d(bArr).i(i10).g(0, a11.c() + 23).b();
        n nVar = new n(bArr, bArr2, b.a(eVar.b()));
        nVar.d(i10);
        nVar.c(0);
        int d10 = eVar.d();
        int c10 = eVar.c();
        int g10 = (1 << eVar.g()) - 1;
        int i11 = 0;
        while (i11 < d10) {
            nVar.a(b11, i11 < d10 + -1, 23);
            f.k((short) i11, b11, 20);
            for (int i12 = 0; i12 < g10; i12++) {
                b11[22] = (byte) i12;
                a11.d(b11, 0, b11.length);
                a11.a(b11, 23);
            }
            a10.d(b11, 23, c10);
            i11++;
        }
        byte[] bArr3 = new byte[a10.c()];
        a10.a(bArr3, 0);
        return bArr3;
    }
}
