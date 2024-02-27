package v7;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;
import q7.c;
import u7.d;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f17359a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final r7.a f17360a;

        /* renamed from: b  reason: collision with root package name */
        private final r7.a f17361b;

        a(r7.a aVar, r7.a aVar2) {
            this.f17360a = aVar;
            this.f17361b = aVar2;
        }

        public r7.a a() {
            return this.f17360a;
        }

        public r7.a b() {
            return this.f17361b;
        }
    }

    static void a(String str, a aVar, String str2) {
        try {
            byte[] bytes = str.getBytes(str2);
            for (byte c10 : bytes) {
                aVar.c(c10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new c(e10.toString());
        }
    }

    static void b(String str, a aVar) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int n10 = n(str.charAt(i10));
            if (n10 != -1) {
                int i11 = i10 + 1;
                if (i11 < length) {
                    int n11 = n(str.charAt(i11));
                    if (n11 != -1) {
                        aVar.c((n10 * 45) + n11, 11);
                        i10 += 2;
                    } else {
                        throw new c();
                    }
                } else {
                    aVar.c(n10, 6);
                    i10 = i11;
                }
            } else {
                throw new c();
            }
        }
    }

    static void c(String str, u7.b bVar, a aVar, String str2) {
        if (bVar.equals(u7.b.f16941e)) {
            g(str, aVar);
        } else if (bVar.equals(u7.b.f16942f)) {
            b(str, aVar);
        } else if (bVar.equals(u7.b.f16944h)) {
            a(str, aVar, str2);
        } else if (bVar.equals(u7.b.f16946j)) {
            d(str, aVar);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid mode: ");
            stringBuffer.append(bVar);
            throw new c(stringBuffer.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void d(java.lang.String r6, v7.a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = r4
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.c(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            q7.c r6 = new q7.c
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            q7.c r7 = new q7.c
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.b.d(java.lang.String, v7.a):void");
    }

    static void e(int i10, int i11, u7.b bVar, a aVar) {
        int b10 = bVar.b(d.e(i11));
        int i12 = (1 << b10) - 1;
        if (i10 <= i12) {
            aVar.c(i10, b10);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i10);
        stringBuffer.append("is bigger than");
        stringBuffer.append(i12);
        throw new c(stringBuffer.toString());
    }

    static void f(u7.b bVar, a aVar) {
        aVar.c(bVar.a(), 4);
    }

    static void g(String str, a aVar) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = str.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((charAt * 100) + ((str.charAt(i10 + 1) - '0') * 10) + (str.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((charAt * 10) + (str.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(charAt, 4);
                }
            }
        }
    }

    private static int h(r7.b bVar) {
        return c.a(bVar) + c.c(bVar) + c.d(bVar) + c.e(bVar);
    }

    private static int i(a aVar, u7.a aVar2, int i10, r7.b bVar) {
        int i11 = Integer.MAX_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < 8; i13++) {
            d.a(aVar, aVar2, i10, i13, bVar);
            int h10 = h(bVar);
            if (h10 < i11) {
                i12 = i13;
                i11 = h10;
            }
        }
        return i12;
    }

    public static u7.b j(String str) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else if (n(charAt) == -1) {
                return u7.b.f16944h;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            return u7.b.f16942f;
        }
        return z11 ? u7.b.f16941e : u7.b.f16944h;
    }

    public static void k(String str, u7.a aVar, Hashtable hashtable, e eVar) {
        String str2 = hashtable == null ? null : (String) hashtable.get(q7.b.f15233b);
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        u7.b j10 = j(str);
        a aVar2 = new a();
        c(str, j10, aVar2, str2);
        p(aVar2.h(), aVar, j10, eVar);
        a aVar3 = new a();
        f(j10, aVar3);
        e(str.length(), eVar.h(), j10, aVar3);
        aVar3.b(aVar2);
        r(eVar.e(), aVar3);
        a aVar4 = new a();
        q(aVar3, eVar.g(), eVar.e(), eVar.f(), aVar4);
        r7.b bVar = new r7.b(eVar.d(), eVar.d());
        eVar.l(i(aVar4, eVar.a(), eVar.h(), bVar));
        d.a(aVar4, eVar.a(), eVar.h(), eVar.b(), bVar);
        eVar.m(bVar);
        if (!eVar.i()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid QR code: ");
            stringBuffer.append(eVar.toString());
            throw new c(stringBuffer.toString());
        }
    }

    public static void l(String str, u7.a aVar, e eVar) {
        k(str, aVar, (Hashtable) null, eVar);
    }

    static r7.a m(r7.a aVar, int i10) {
        int d10 = aVar.d();
        int[] iArr = new int[(d10 + i10)];
        for (int i11 = 0; i11 < d10; i11++) {
            iArr[i11] = aVar.a(i11);
        }
        new s7.c(s7.a.f16054e).b(iArr, i10);
        r7.a aVar2 = new r7.a(i10);
        for (int i12 = 0; i12 < i10; i12++) {
            aVar2.b(i12, iArr[d10 + i12]);
        }
        return aVar2;
    }

    static int n(int i10) {
        int[] iArr = f17359a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void o(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 < i12) {
            int i14 = i10 % i12;
            int i15 = i12 - i14;
            int i16 = i10 / i12;
            int i17 = i16 + 1;
            int i18 = i11 / i12;
            int i19 = i18 + 1;
            int i20 = i16 - i18;
            int i21 = i17 - i19;
            if (i20 != i21) {
                throw new c("EC bytes mismatch");
            } else if (i12 != i15 + i14) {
                throw new c("RS blocks mismatch");
            } else if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
                throw new c("Total bytes mismatch");
            } else if (i13 < i15) {
                iArr[0] = i18;
                iArr2[0] = i20;
            } else {
                iArr[0] = i19;
                iArr2[0] = i21;
            }
        } else {
            throw new c("Block ID too large");
        }
    }

    private static void p(int i10, u7.a aVar, u7.b bVar, e eVar) {
        eVar.k(aVar);
        eVar.o(bVar);
        for (int i11 = 1; i11 <= 40; i11++) {
            d e10 = d.e(i11);
            int d10 = e10.d();
            d.b c10 = e10.c(aVar);
            int d11 = c10.d();
            int c11 = c10.c();
            int i12 = d10 - d11;
            if (i12 >= i10 + 3) {
                eVar.t(i11);
                eVar.s(d10);
                eVar.p(i12);
                eVar.r(c11);
                eVar.q(d11);
                eVar.n(e10.b());
                return;
            }
        }
        throw new c("Cannot find proper rs block info (input data too big?)");
    }

    static void q(a aVar, int i10, int i11, int i12, a aVar2) {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        a aVar3 = aVar2;
        if (aVar.h() == i14) {
            Vector vector = new Vector(i15);
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int[] iArr3 = iArr;
                o(i10, i11, i12, i19, iArr, iArr2);
                r7.a aVar4 = new r7.a();
                aVar4.c(aVar.f(), i16, iArr3[0]);
                r7.a m10 = m(aVar4, iArr2[0]);
                vector.addElement(new a(aVar4, m10));
                i17 = Math.max(i17, aVar4.d());
                i18 = Math.max(i18, m10.d());
                i16 += iArr3[0];
            }
            if (i14 == i16) {
                for (int i20 = 0; i20 < i17; i20++) {
                    for (int i21 = 0; i21 < vector.size(); i21++) {
                        r7.a a10 = ((a) vector.elementAt(i21)).a();
                        if (i20 < a10.d()) {
                            aVar3.c(a10.a(i20), 8);
                        }
                    }
                }
                for (int i22 = 0; i22 < i18; i22++) {
                    for (int i23 = 0; i23 < vector.size(); i23++) {
                        r7.a b10 = ((a) vector.elementAt(i23)).b();
                        if (i22 < b10.d()) {
                            aVar3.c(b10.a(i22), 8);
                        }
                    }
                }
                if (i13 != aVar2.h()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Interleaving error: ");
                    stringBuffer.append(i13);
                    stringBuffer.append(" and ");
                    stringBuffer.append(aVar2.h());
                    stringBuffer.append(" differ.");
                    throw new c(stringBuffer.toString());
                }
                return;
            }
            throw new c("Data bytes does not match offset");
        }
        throw new c("Number of bits and data bytes does not match");
    }

    static void r(int i10, a aVar) {
        int i11 = i10 << 3;
        if (aVar.g() <= i11) {
            for (int i12 = 0; i12 < 4 && aVar.g() < i11; i12++) {
                aVar.a(0);
            }
            int g10 = aVar.g() % 8;
            if (g10 > 0) {
                int i13 = 8 - g10;
                for (int i14 = 0; i14 < i13; i14++) {
                    aVar.a(0);
                }
            }
            if (aVar.g() % 8 == 0) {
                int h10 = i10 - aVar.h();
                for (int i15 = 0; i15 < h10; i15++) {
                    aVar.c(i15 % 2 == 0 ? 236 : 17, 8);
                }
                if (aVar.g() != i11) {
                    throw new c("Bits size does not equal capacity");
                }
                return;
            }
            throw new c("Number of bits is not a multiple of 8");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("data bits cannot fit in the QR Code");
        stringBuffer.append(aVar.g());
        stringBuffer.append(" > ");
        stringBuffer.append(i11);
        throw new c(stringBuffer.toString());
    }
}
