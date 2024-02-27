package cn;

import androidx.constraintlayout.widget.i;
import cm.l;
import in.f;
import in.g;
import in.h;
import vm.b;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f20448a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, i.f1939d3, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f20449b;

    /* renamed from: c  reason: collision with root package name */
    private static final a f20450c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final k f20451d;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final a[] f20452a;

        /* renamed from: b  reason: collision with root package name */
        private final int f20453b;

        /* renamed from: c  reason: collision with root package name */
        private final int f20454c;

        public a() {
            this.f20452a = new a[256];
            this.f20453b = 0;
            this.f20454c = 0;
        }

        public final a[] a() {
            return this.f20452a;
        }

        public final int b() {
            return this.f20453b;
        }

        public final int c() {
            return this.f20454c;
        }

        public a(int i10, int i11) {
            this.f20452a = null;
            this.f20453b = i10;
            int i12 = i11 & 7;
            this.f20454c = i12 == 0 ? 8 : i12;
        }
    }

    static {
        k kVar = new k();
        f20451d = kVar;
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f20449b = bArr;
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            kVar.a(i10, f20448a[i10], f20449b[i10]);
        }
    }

    private k() {
    }

    private final void a(int i10, int i11, int i12) {
        a aVar = new a(i10, i12);
        a aVar2 = f20450c;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            a[] a10 = aVar2.a();
            l.c(a10);
            a aVar3 = a10[i13];
            if (aVar3 == null) {
                aVar3 = new a();
                a10[i13] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        a[] a11 = aVar2.a();
        l.c(a11);
        l.k(a11, aVar, i15, (1 << i14) + i15);
    }

    public final void b(g gVar, long j10, f fVar) {
        l.f(gVar, "source");
        l.f(fVar, "sink");
        a aVar = f20450c;
        int i10 = 0;
        int i11 = 0;
        for (long j11 = 0; j11 < j10; j11++) {
            i10 = (i10 << 8) | b.b(gVar.readByte(), 255);
            i11 += 8;
            while (i11 >= 8) {
                int i12 = i11 - 8;
                a[] a10 = aVar.a();
                l.c(a10);
                aVar = a10[(i10 >>> i12) & 255];
                l.c(aVar);
                if (aVar.a() == null) {
                    fVar.Q(aVar.b());
                    i11 -= aVar.c();
                    aVar = f20450c;
                } else {
                    i11 = i12;
                }
            }
        }
        while (i11 > 0) {
            a[] a11 = aVar.a();
            l.c(a11);
            a aVar2 = a11[(i10 << (8 - i11)) & 255];
            l.c(aVar2);
            if (aVar2.a() == null && aVar2.c() <= i11) {
                fVar.Q(aVar2.b());
                i11 -= aVar2.c();
                aVar = f20450c;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(in.h r9, in.f r10) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            cm.l.f(r9, r0)
            java.lang.String r0 = "sink"
            cm.l.f(r10, r0)
            int r0 = r9.q()
            r1 = 0
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r3 >= r0) goto L_0x003a
            byte r5 = r9.d(r3)
            r6 = 255(0xff, float:3.57E-43)
            int r5 = vm.b.b(r5, r6)
            int[] r6 = f20448a
            r6 = r6[r5]
            byte[] r7 = f20449b
            byte r5 = r7[r5]
            long r1 = r1 << r5
            long r6 = (long) r6
            long r1 = r1 | r6
            int r4 = r4 + r5
        L_0x002a:
            r5 = 8
            if (r4 < r5) goto L_0x0037
            int r4 = r4 + -8
            long r5 = r1 >> r4
            int r5 = (int) r5
            r10.Q(r5)
            goto L_0x002a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x003a:
            if (r4 <= 0) goto L_0x0048
            int r9 = 8 - r4
            long r0 = r1 << r9
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 >>> r4
            long r0 = r0 | r2
            int r9 = (int) r0
            r10.Q(r9)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.k.c(in.h, in.f):void");
    }

    public final int d(h hVar) {
        l.f(hVar, "bytes");
        int q10 = hVar.q();
        long j10 = 0;
        for (int i10 = 0; i10 < q10; i10++) {
            j10 += (long) f20449b[b.b(hVar.d(i10), 255)];
        }
        return (int) ((j10 + ((long) 7)) >> 3);
    }
}
