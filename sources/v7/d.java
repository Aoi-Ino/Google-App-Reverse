package v7;

import androidx.constraintlayout.widget.i;
import f.j;
import q7.c;
import r7.b;
import u7.a;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final int[][] f17362a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b  reason: collision with root package name */
    private static final int[][] f17363b = {new int[]{0, 0, 0, 0, 0, 0, 0, 0}};

    /* renamed from: c  reason: collision with root package name */
    private static final int[][] f17364c = {new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f17365d = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: e  reason: collision with root package name */
    private static final int[][] f17366e = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, i.f1939d3, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, j.M0, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, j.M0, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, i.f1939d3, 136, 162}, new int[]{6, 26, 54, 82, i.f1939d3, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: f  reason: collision with root package name */
    private static final int[][] f17367f = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(a aVar, a aVar2, int i10, int i11, b bVar) {
        c(bVar);
        d(i10, bVar);
        l(aVar2, i11, bVar);
        t(i10, bVar);
        f(aVar, i11, bVar);
    }

    public static int b(int i10, int i11) {
        int n10 = n(i11);
        int i12 = i10 << (n10 - 1);
        while (n(i12) >= n10) {
            i12 ^= i11 << (n(i12) - n10);
        }
        return i12;
    }

    public static void c(b bVar) {
        bVar.a((byte) -1);
    }

    public static void d(int i10, b bVar) {
        j(bVar);
        e(bVar);
        s(i10, bVar);
        k(bVar);
    }

    private static void e(b bVar) {
        if (bVar.b(bVar.d() - 8, 8) != 0) {
            bVar.e(bVar.d() - 8, 8, 1);
            return;
        }
        throw new c();
    }

    public static void f(a aVar, int i10, b bVar) {
        int i11;
        int f10 = bVar.f() - 1;
        int d10 = bVar.d() - 1;
        int i12 = 0;
        int i13 = -1;
        while (f10 > 0) {
            if (f10 == 6) {
                f10--;
            }
            while (d10 >= 0 && d10 < bVar.d()) {
                for (int i14 = 0; i14 < 2; i14++) {
                    int i15 = f10 - i14;
                    if (o(bVar.b(d10, i15))) {
                        if (i12 < aVar.g()) {
                            i11 = aVar.e(i12);
                            i12++;
                        } else {
                            i11 = 0;
                        }
                        if (i10 != -1 && c.f(i10, i15, d10)) {
                            i11 ^= 1;
                        }
                        bVar.e(d10, i15, i11);
                    }
                }
                d10 += i13;
            }
            i13 = -i13;
            d10 += i13;
            f10 -= 2;
        }
        if (i12 != aVar.g()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Not all bits consumed: ");
            stringBuffer.append(i12);
            stringBuffer.append('/');
            stringBuffer.append(aVar.g());
            throw new c(stringBuffer.toString());
        }
    }

    private static void g(int i10, int i11, b bVar) {
        int[][] iArr = f17363b;
        if (iArr[0].length == 8 && iArr.length == 1) {
            int i12 = 0;
            while (i12 < 8) {
                int i13 = i10 + i12;
                if (o(bVar.b(i11, i13))) {
                    bVar.e(i11, i13, f17363b[0][i12]);
                    i12++;
                } else {
                    throw new c();
                }
            }
            return;
        }
        throw new c("Bad horizontal separation pattern");
    }

    private static void h(int i10, int i11, b bVar) {
        int[][] iArr = f17365d;
        if (iArr[0].length == 5 && iArr.length == 5) {
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = 0;
                while (i13 < 5) {
                    int i14 = i11 + i12;
                    int i15 = i10 + i13;
                    if (o(bVar.b(i14, i15))) {
                        bVar.e(i14, i15, f17365d[i12][i13]);
                        i13++;
                    } else {
                        throw new c();
                    }
                }
            }
            return;
        }
        throw new c("Bad position adjustment");
    }

    private static void i(int i10, int i11, b bVar) {
        int[][] iArr = f17362a;
        if (iArr[0].length == 7 && iArr.length == 7) {
            for (int i12 = 0; i12 < 7; i12++) {
                int i13 = 0;
                while (i13 < 7) {
                    int i14 = i11 + i12;
                    int i15 = i10 + i13;
                    if (o(bVar.b(i14, i15))) {
                        bVar.e(i14, i15, f17362a[i12][i13]);
                        i13++;
                    } else {
                        throw new c();
                    }
                }
            }
            return;
        }
        throw new c("Bad position detection pattern");
    }

    private static void j(b bVar) {
        int length = f17362a[0].length;
        i(0, 0, bVar);
        i(bVar.f() - length, 0, bVar);
        i(0, bVar.f() - length, bVar);
        int length2 = f17363b[0].length;
        int i10 = length2 - 1;
        g(0, i10, bVar);
        g(bVar.f() - length2, i10, bVar);
        g(0, bVar.f() - length2, bVar);
        int length3 = f17364c.length;
        m(length3, 0, bVar);
        m((bVar.d() - length3) - 1, 0, bVar);
        m(length3, bVar.d() - length3, bVar);
    }

    private static void k(b bVar) {
        int i10 = 8;
        while (i10 < bVar.f() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (p(bVar.b(6, i10))) {
                if (o(bVar.b(6, i10))) {
                    bVar.e(6, i10, i12);
                }
                if (p(bVar.b(i10, 6))) {
                    if (o(bVar.b(i10, 6))) {
                        bVar.e(i10, 6, i12);
                    }
                    i10 = i11;
                } else {
                    throw new c();
                }
            } else {
                throw new c();
            }
        }
    }

    public static void l(a aVar, int i10, b bVar) {
        a aVar2 = new a();
        q(aVar, i10, aVar2);
        for (int i11 = 0; i11 < aVar2.g(); i11++) {
            int e10 = aVar2.e((aVar2.g() - 1) - i11);
            int[] iArr = f17367f[i11];
            bVar.e(iArr[1], iArr[0], e10);
            if (i11 < 8) {
                bVar.e(8, (bVar.f() - i11) - 1, e10);
            } else {
                bVar.e((bVar.d() - 7) + (i11 - 8), 8, e10);
            }
        }
    }

    private static void m(int i10, int i11, b bVar) {
        int[][] iArr = f17364c;
        if (iArr[0].length == 1 && iArr.length == 7) {
            int i12 = 0;
            while (i12 < 7) {
                int i13 = i11 + i12;
                if (o(bVar.b(i13, i10))) {
                    bVar.e(i13, i10, f17364c[i12][0]);
                    i12++;
                } else {
                    throw new c();
                }
            }
            return;
        }
        throw new c("Bad vertical separation pattern");
    }

    public static int n(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    private static boolean o(int i10) {
        return i10 == -1;
    }

    private static boolean p(int i10) {
        return i10 == -1 || i10 == 0 || i10 == 1;
    }

    public static void q(a aVar, int i10, a aVar2) {
        if (e.j(i10)) {
            int a10 = (aVar.a() << 3) | i10;
            aVar2.c(a10, 5);
            aVar2.c(b(a10, 1335), 10);
            a aVar3 = new a();
            aVar3.c(21522, 15);
            aVar2.i(aVar3);
            if (aVar2.g() != 15) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("should not happen but we got: ");
                stringBuffer.append(aVar2.g());
                throw new c(stringBuffer.toString());
            }
            return;
        }
        throw new c("Invalid mask pattern");
    }

    public static void r(int i10, a aVar) {
        aVar.c(i10, 6);
        aVar.c(b(i10, 7973), 12);
        if (aVar.g() != 18) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("should not happen but we got: ");
            stringBuffer.append(aVar.g());
            throw new c(stringBuffer.toString());
        }
    }

    private static void s(int i10, b bVar) {
        if (i10 >= 2) {
            int[] iArr = f17366e[i10 - 1];
            for (int i11 = 0; i11 < r0; i11++) {
                for (int i12 : iArr) {
                    int i13 = iArr[i11];
                    if (!(i12 == -1 || i13 == -1 || !o(bVar.b(i13, i12)))) {
                        h(i12 - 2, i13 - 2, bVar);
                    }
                }
            }
        }
    }

    public static void t(int i10, b bVar) {
        if (i10 >= 7) {
            a aVar = new a();
            r(i10, aVar);
            int i11 = 17;
            for (int i12 = 0; i12 < 6; i12++) {
                for (int i13 = 0; i13 < 3; i13++) {
                    int e10 = aVar.e(i11);
                    i11--;
                    bVar.e((bVar.d() - 11) + i13, i12, e10);
                    bVar.e(i12, (bVar.d() - 11) + i13, e10);
                }
            }
        }
    }
}
