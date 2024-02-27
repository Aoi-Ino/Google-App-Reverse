package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;

abstract class e {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f7064a;

        /* renamed from: b  reason: collision with root package name */
        public long f7065b;

        /* renamed from: c  reason: collision with root package name */
        public Object f7066c;

        /* renamed from: d  reason: collision with root package name */
        public final p f7067d;

        a(p pVar) {
            pVar.getClass();
            this.f7067d = pVar;
        }
    }

    static int A(int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int K = K(bArr, i11, aVar);
        while (true) {
            f0Var.n(i.c(aVar.f7065b));
            if (K >= i12) {
                break;
            }
            int H = H(bArr, K, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            K = K(bArr, H, aVar);
        }
        return K;
    }

    static int B(byte[] bArr, int i10, a aVar) {
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a;
        if (i11 < 0) {
            throw a0.f();
        } else if (i11 == 0) {
            aVar.f7066c = "";
            return H;
        } else {
            aVar.f7066c = new String(bArr, H, i11, z.f7292a);
            return H + i11;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int C(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.z.d r8, com.google.crypto.tink.shaded.protobuf.e.a r9) {
        /*
            int r6 = H(r5, r6, r9)
            int r0 = r9.f7064a
            if (r0 < 0) goto L_0x003f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.z.f7292a
            r2.<init>(r5, r6, r0, r3)
        L_0x0017:
            r8.add(r2)
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x003e
            int r0 = H(r5, r6, r9)
            int r2 = r9.f7064a
            if (r4 == r2) goto L_0x0026
            goto L_0x003e
        L_0x0026:
            int r6 = H(r5, r0, r9)
            int r0 = r9.f7064a
            if (r0 < 0) goto L_0x0039
            if (r0 != 0) goto L_0x0031
            goto L_0x000c
        L_0x0031:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.z.f7292a
            r2.<init>(r5, r6, r0, r3)
            goto L_0x0017
        L_0x0039:
            com.google.crypto.tink.shaded.protobuf.a0 r4 = com.google.crypto.tink.shaded.protobuf.a0.f()
            throw r4
        L_0x003e:
            return r6
        L_0x003f:
            com.google.crypto.tink.shaded.protobuf.a0 r4 = com.google.crypto.tink.shaded.protobuf.a0.f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.C(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int D(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.z.d r9, com.google.crypto.tink.shaded.protobuf.e.a r10) {
        /*
            int r7 = H(r6, r7, r10)
            int r0 = r10.f7064a
            if (r0 < 0) goto L_0x0059
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.o1.n(r6, r7, r2)
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.z.f7292a
            r3.<init>(r6, r7, r0, r4)
        L_0x001f:
            r9.add(r3)
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0053
            int r0 = H(r6, r7, r10)
            int r2 = r10.f7064a
            if (r5 == r2) goto L_0x002e
            goto L_0x0053
        L_0x002e:
            int r7 = H(r6, r0, r10)
            int r0 = r10.f7064a
            if (r0 < 0) goto L_0x004e
            if (r0 != 0) goto L_0x0039
            goto L_0x000c
        L_0x0039:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.o1.n(r6, r7, r2)
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.z.f7292a
            r3.<init>(r6, r7, r0, r4)
            goto L_0x001f
        L_0x0049:
            com.google.crypto.tink.shaded.protobuf.a0 r5 = com.google.crypto.tink.shaded.protobuf.a0.c()
            throw r5
        L_0x004e:
            com.google.crypto.tink.shaded.protobuf.a0 r5 = com.google.crypto.tink.shaded.protobuf.a0.f()
            throw r5
        L_0x0053:
            return r7
        L_0x0054:
            com.google.crypto.tink.shaded.protobuf.a0 r5 = com.google.crypto.tink.shaded.protobuf.a0.c()
            throw r5
        L_0x0059:
            com.google.crypto.tink.shaded.protobuf.a0 r5 = com.google.crypto.tink.shaded.protobuf.a0.f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    static int E(byte[] bArr, int i10, a aVar) {
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a;
        if (i11 < 0) {
            throw a0.f();
        } else if (i11 == 0) {
            aVar.f7066c = "";
            return H;
        } else {
            aVar.f7066c = o1.e(bArr, H, i11);
            return H + i11;
        }
    }

    static int F(int i10, byte[] bArr, int i11, int i12, k1 k1Var, a aVar) {
        if (p1.a(i10) != 0) {
            int b10 = p1.b(i10);
            if (b10 == 0) {
                int K = K(bArr, i11, aVar);
                k1Var.n(i10, Long.valueOf(aVar.f7065b));
                return K;
            } else if (b10 == 1) {
                k1Var.n(i10, Long.valueOf(i(bArr, i11)));
                return i11 + 8;
            } else if (b10 == 2) {
                int H = H(bArr, i11, aVar);
                int i13 = aVar.f7064a;
                if (i13 < 0) {
                    throw a0.f();
                } else if (i13 <= bArr.length - H) {
                    k1Var.n(i10, i13 == 0 ? h.f7078f : h.v(bArr, H, i13));
                    return H + i13;
                } else {
                    throw a0.j();
                }
            } else if (b10 == 3) {
                k1 l10 = k1.l();
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int H2 = H(bArr, i11, aVar);
                    int i16 = aVar.f7064a;
                    i15 = i16;
                    if (i16 == i14) {
                        i11 = H2;
                        break;
                    }
                    int F = F(i15, bArr, H2, i12, l10, aVar);
                    i15 = i16;
                    i11 = F;
                }
                if (i11 > i12 || i15 != i14) {
                    throw a0.g();
                }
                k1Var.n(i10, l10);
                return i11;
            } else if (b10 == 5) {
                k1Var.n(i10, Integer.valueOf(g(bArr, i11)));
                return i11 + 4;
            } else {
                throw a0.b();
            }
        } else {
            throw a0.b();
        }
    }

    static int G(int i10, byte[] bArr, int i11, a aVar) {
        int i12;
        int i13 = i10 & 127;
        int i14 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i12 = b10 << 7;
        } else {
            int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
            int i16 = i11 + 2;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                aVar.f7064a = i15 | (b11 << 14);
                return i16;
            }
            i13 = i15 | ((b11 & Byte.MAX_VALUE) << 14);
            i14 = i11 + 3;
            byte b12 = bArr[i16];
            if (b12 >= 0) {
                i12 = b12 << 21;
            } else {
                int i17 = i13 | ((b12 & Byte.MAX_VALUE) << 21);
                int i18 = i11 + 4;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    aVar.f7064a = i17 | (b13 << 28);
                    return i18;
                }
                int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i20 = i18 + 1;
                    if (bArr[i18] < 0) {
                        i18 = i20;
                    } else {
                        aVar.f7064a = i19;
                        return i20;
                    }
                }
            }
        }
        aVar.f7064a = i13 | i12;
        return i14;
    }

    static int H(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return G(b10, bArr, i11, aVar);
        }
        aVar.f7064a = b10;
        return i11;
    }

    static int I(int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i11, aVar);
        while (true) {
            yVar.n(aVar.f7064a);
            if (H >= i12) {
                break;
            }
            int H2 = H(bArr, H, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            H = H(bArr, H2, aVar);
        }
        return H;
    }

    static int J(long j10, byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i12;
            byte b12 = b11;
            i11 = i13;
            b10 = b12;
        }
        aVar.f7065b = j11;
        return i11;
    }

    static int K(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 < 0) {
            return J(j10, bArr, i11, aVar);
        }
        aVar.f7065b = j10;
        return i11;
    }

    static int L(int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int K = K(bArr, i11, aVar);
        while (true) {
            f0Var.n(aVar.f7065b);
            if (K >= i12) {
                break;
            }
            int H = H(bArr, K, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            K = K(bArr, H, aVar);
        }
        return K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x000e, code lost:
        if (r12.f7065b != 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r11.n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r9 >= r10) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = H(r8, r9, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r7 == r12.f7064a) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r9 = K(r8, r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r12.f7065b == 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(int r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.z.d r11, com.google.crypto.tink.shaded.protobuf.e.a r12) {
        /*
            com.google.crypto.tink.shaded.protobuf.f r11 = (com.google.crypto.tink.shaded.protobuf.f) r11
            int r9 = K(r8, r9, r12)
            long r0 = r12.f7065b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = r4
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            r11.n(r0)
            if (r9 >= r10) goto L_0x002c
            int r0 = H(r8, r9, r12)
            int r5 = r12.f7064a
            if (r7 == r5) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            int r9 = K(r8, r0, r12)
            long r5 = r12.f7065b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            goto L_0x0010
        L_0x002c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.a(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    static int b(byte[] bArr, int i10, a aVar) {
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a;
        if (i11 < 0) {
            throw a0.f();
        } else if (i11 > bArr.length - H) {
            throw a0.j();
        } else if (i11 == 0) {
            aVar.f7066c = h.f7078f;
            return H;
        } else {
            aVar.f7066c = h.v(bArr, H, i11);
            return H + i11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r4 = H(r3, r0, r7);
        r0 = r7.f7064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r0 < 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > (r3.length - r4)) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0 != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw com.google.crypto.tink.shaded.protobuf.a0.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        throw com.google.crypto.tink.shaded.protobuf.a0.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 == 0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.h.f7078f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.h.v(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r4 >= r5) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = H(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r2 == r7.f7064a) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.z.d r6, com.google.crypto.tink.shaded.protobuf.e.a r7) {
        /*
            int r4 = H(r3, r4, r7)
            int r0 = r7.f7064a
            if (r0 < 0) goto L_0x0046
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0041
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.h.f7078f
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.h.v(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x0040
            int r0 = H(r3, r4, r7)
            int r1 = r7.f7064a
            if (r2 == r1) goto L_0x0027
            goto L_0x0040
        L_0x0027:
            int r4 = H(r3, r0, r7)
            int r0 = r7.f7064a
            if (r0 < 0) goto L_0x003b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0036
            if (r0 != 0) goto L_0x0014
            goto L_0x000e
        L_0x0036:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = com.google.crypto.tink.shaded.protobuf.a0.j()
            throw r2
        L_0x003b:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = com.google.crypto.tink.shaded.protobuf.a0.f()
            throw r2
        L_0x0040:
            return r4
        L_0x0041:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = com.google.crypto.tink.shaded.protobuf.a0.j()
            throw r2
        L_0x0046:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = com.google.crypto.tink.shaded.protobuf.a0.f()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(i(bArr, i10));
    }

    static int e(int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        m mVar = (m) dVar;
        mVar.n(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int H = H(bArr, i13, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            mVar.n(d(bArr, H));
            i13 = H + 8;
        }
        return i13;
    }

    static int f(int i10, byte[] bArr, int i11, int i12, Object obj, o0 o0Var, j1 j1Var, a aVar) {
        aVar.f7067d.a(o0Var, i10 >>> 3);
        return F(i10, bArr, i11, i12, r0.u(obj), aVar);
    }

    static int g(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int h(int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        yVar.n(g(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int H = H(bArr, i13, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            yVar.n(g(bArr, H));
            i13 = H + 4;
        }
        return i13;
    }

    static long i(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static int j(int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        f0Var.n(i(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int H = H(bArr, i13, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            f0Var.n(i(bArr, H));
            i13 = H + 8;
        }
        return i13;
    }

    static float k(byte[] bArr, int i10) {
        return Float.intBitsToFloat(g(bArr, i10));
    }

    static int l(int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        v vVar = (v) dVar;
        vVar.n(k(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int H = H(bArr, i13, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            vVar.n(k(bArr, H));
            i13 = H + 4;
        }
        return i13;
    }

    static int m(d1 d1Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        r0 r0Var = (r0) d1Var;
        Object i13 = r0Var.i();
        int b02 = r0Var.b0(i13, bArr, i10, i11, i12, aVar);
        r0Var.e(i13);
        aVar.f7066c = i13;
        return b02;
    }

    static int n(d1 d1Var, int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        int i13 = (i10 & -8) | 4;
        int m10 = m(d1Var, bArr, i11, i12, i13, aVar);
        while (true) {
            dVar.add(aVar.f7066c);
            if (m10 >= i12) {
                break;
            }
            int H = H(bArr, m10, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            m10 = m(d1Var, bArr, H, i12, i13, aVar);
        }
        return m10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int o(com.google.crypto.tink.shaded.protobuf.d1 r6, byte[] r7, int r8, int r9, com.google.crypto.tink.shaded.protobuf.e.a r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = G(r8, r7, r0, r10)
            int r8 = r10.f7064a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.i()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.b(r1, r2, r3, r4, r5)
            r6.e(r9)
            r10.f7066c = r9
            return r8
        L_0x0025:
            com.google.crypto.tink.shaded.protobuf.a0 r6 = com.google.crypto.tink.shaded.protobuf.a0.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e.o(com.google.crypto.tink.shaded.protobuf.d1, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    static int p(d1 d1Var, int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        int o10 = o(d1Var, bArr, i11, i12, aVar);
        while (true) {
            dVar.add(aVar.f7066c);
            if (o10 >= i12) {
                break;
            }
            int H = H(bArr, o10, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            o10 = o(d1Var, bArr, H, i12, aVar);
        }
        return o10;
    }

    static int q(byte[] bArr, int i10, z.d dVar, a aVar) {
        f fVar = (f) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            H = K(bArr, H, aVar);
            fVar.n(aVar.f7065b != 0);
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int r(byte[] bArr, int i10, z.d dVar, a aVar) {
        m mVar = (m) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            mVar.n(d(bArr, H));
            H += 8;
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int s(byte[] bArr, int i10, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            yVar.n(g(bArr, H));
            H += 4;
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int t(byte[] bArr, int i10, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            f0Var.n(i(bArr, H));
            H += 8;
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int u(byte[] bArr, int i10, z.d dVar, a aVar) {
        v vVar = (v) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            vVar.n(k(bArr, H));
            H += 4;
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int v(byte[] bArr, int i10, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            H = H(bArr, H, aVar);
            yVar.n(i.b(aVar.f7064a));
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int w(byte[] bArr, int i10, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            H = K(bArr, H, aVar);
            f0Var.n(i.c(aVar.f7065b));
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int x(byte[] bArr, int i10, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            H = H(bArr, H, aVar);
            yVar.n(aVar.f7064a);
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int y(byte[] bArr, int i10, z.d dVar, a aVar) {
        f0 f0Var = (f0) dVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f7064a + H;
        while (H < i11) {
            H = K(bArr, H, aVar);
            f0Var.n(aVar.f7065b);
        }
        if (H == i11) {
            return H;
        }
        throw a0.j();
    }

    static int z(int i10, byte[] bArr, int i11, int i12, z.d dVar, a aVar) {
        y yVar = (y) dVar;
        int H = H(bArr, i11, aVar);
        while (true) {
            yVar.n(i.b(aVar.f7064a));
            if (H >= i12) {
                break;
            }
            int H2 = H(bArr, H, aVar);
            if (i10 != aVar.f7064a) {
                break;
            }
            H = H(bArr, H2, aVar);
        }
        return H;
    }
}
