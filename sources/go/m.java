package go;

import xn.a;

abstract class m {
    static void a(byte[] bArr, a aVar) {
        aVar.d(bArr, 0, bArr.length);
    }

    static void b(short s10, a aVar) {
        aVar.e((byte) (s10 >>> 8));
        aVar.e((byte) s10);
    }

    static void c(int i10, a aVar) {
        aVar.e((byte) (i10 >>> 24));
        aVar.e((byte) (i10 >>> 16));
        aVar.e((byte) (i10 >>> 8));
        aVar.e((byte) i10);
    }
}
