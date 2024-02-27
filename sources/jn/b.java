package jn;

import cm.l;
import in.e;
import in.h;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f24666a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(byte[] r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            if (r3 >= r2) goto L_0x01a1
            byte r6 = r0[r3]
            r7 = 65533(0xfffd, float:9.1831E-41)
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 10
            r13 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            if (r6 < 0) goto L_0x0064
            int r17 = r5 + 1
            if (r5 != r1) goto L_0x0024
            return r4
        L_0x0024:
            if (r6 == r12) goto L_0x0032
            if (r6 == r11) goto L_0x0032
            if (r6 < 0) goto L_0x002c
            if (r10 >= r6) goto L_0x0034
        L_0x002c:
            if (r8 <= r6) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            if (r9 < r6) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            if (r6 != r7) goto L_0x0035
        L_0x0034:
            return r16
        L_0x0035:
            if (r6 >= r13) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 2
        L_0x003a:
            int r4 = r4 + r5
            int r3 = r3 + 1
        L_0x003d:
            r5 = r17
            if (r3 >= r2) goto L_0x0008
            byte r6 = r0[r3]
            if (r6 < 0) goto L_0x0008
            int r3 = r3 + 1
            int r17 = r5 + 1
            if (r5 != r1) goto L_0x004c
            return r4
        L_0x004c:
            if (r6 == r12) goto L_0x005a
            if (r6 == r11) goto L_0x005a
            if (r6 < 0) goto L_0x0054
            if (r10 >= r6) goto L_0x005c
        L_0x0054:
            if (r8 <= r6) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            if (r9 < r6) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            if (r6 != r7) goto L_0x005d
        L_0x005c:
            return r16
        L_0x005d:
            if (r6 >= r13) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0061:
            r5 = 2
        L_0x0062:
            int r4 = r4 + r5
            goto L_0x003d
        L_0x0064:
            int r14 = r6 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.794E-43)
            if (r14 != r15) goto L_0x00ad
            int r14 = r3 + 1
            if (r2 > r14) goto L_0x0073
            if (r5 != r1) goto L_0x0072
            return r4
        L_0x0072:
            return r16
        L_0x0073:
            byte r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x00a9
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r14
            if (r6 >= r13) goto L_0x0084
            if (r5 != r1) goto L_0x0083
            return r4
        L_0x0083:
            return r16
        L_0x0084:
            int r13 = r5 + 1
            if (r5 != r1) goto L_0x0089
            return r4
        L_0x0089:
            if (r6 == r12) goto L_0x0097
            if (r6 == r11) goto L_0x0097
            if (r6 < 0) goto L_0x0091
            if (r10 >= r6) goto L_0x0099
        L_0x0091:
            if (r8 <= r6) goto L_0x0094
            goto L_0x0097
        L_0x0094:
            if (r9 < r6) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            if (r6 != r7) goto L_0x009a
        L_0x0099:
            return r16
        L_0x009a:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r5) goto L_0x00a0
            r14 = 1
            goto L_0x00a1
        L_0x00a0:
            r14 = 2
        L_0x00a1:
            int r4 = r4 + r14
            pl.x r5 = pl.x.f30437a
            int r3 = r3 + 2
            r5 = r13
            goto L_0x0008
        L_0x00a9:
            if (r5 != r1) goto L_0x00ac
            return r4
        L_0x00ac:
            return r16
        L_0x00ad:
            int r14 = r6 >> 4
            r7 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r14 != r15) goto L_0x011c
            int r14 = r3 + 2
            if (r2 > r14) goto L_0x00bf
            if (r5 != r1) goto L_0x00be
            return r4
        L_0x00be:
            return r16
        L_0x00bf:
            int r15 = r3 + 1
            byte r15 = r0[r15]
            r8 = r15 & 192(0xc0, float:2.69E-43)
            if (r8 != r13) goto L_0x0118
            byte r8 = r0[r14]
            r14 = r8 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L_0x0114
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r8 = r8 ^ r13
            int r13 = r15 << 6
            r8 = r8 ^ r13
            int r6 = r6 << 12
            r6 = r6 ^ r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r6 >= r8) goto L_0x00df
            if (r5 != r1) goto L_0x00de
            return r4
        L_0x00de:
            return r16
        L_0x00df:
            if (r7 <= r6) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            if (r9 < r6) goto L_0x00e8
            if (r5 != r1) goto L_0x00e7
            return r4
        L_0x00e7:
            return r16
        L_0x00e8:
            int r7 = r5 + 1
            if (r5 != r1) goto L_0x00ed
            return r4
        L_0x00ed:
            if (r6 == r12) goto L_0x00ff
            if (r6 == r11) goto L_0x00ff
            if (r6 < 0) goto L_0x00f5
            if (r10 >= r6) goto L_0x0104
        L_0x00f5:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 <= r6) goto L_0x00fa
            goto L_0x00ff
        L_0x00fa:
            r5 = 159(0x9f, float:2.23E-43)
            if (r5 < r6) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L_0x0105
        L_0x0104:
            return r16
        L_0x0105:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r5) goto L_0x010b
            r14 = 1
            goto L_0x010c
        L_0x010b:
            r14 = 2
        L_0x010c:
            int r4 = r4 + r14
            pl.x r5 = pl.x.f30437a
            int r3 = r3 + 3
        L_0x0111:
            r5 = r7
            goto L_0x0008
        L_0x0114:
            if (r5 != r1) goto L_0x0117
            return r4
        L_0x0117:
            return r16
        L_0x0118:
            if (r5 != r1) goto L_0x011b
            return r4
        L_0x011b:
            return r16
        L_0x011c:
            int r8 = r6 >> 3
            if (r8 != r15) goto L_0x019d
            int r8 = r3 + 3
            if (r2 > r8) goto L_0x0128
            if (r5 != r1) goto L_0x0127
            return r4
        L_0x0127:
            return r16
        L_0x0128:
            int r14 = r3 + 1
            byte r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0199
            int r15 = r3 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L_0x0195
            byte r8 = r0[r8]
            r10 = r8 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L_0x0191
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r8 = r8 ^ r10
            int r10 = r15 << 6
            r8 = r8 ^ r10
            int r10 = r14 << 12
            r8 = r8 ^ r10
            int r6 = r6 << 18
            r6 = r6 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r8) goto L_0x0154
            if (r5 != r1) goto L_0x0153
            return r4
        L_0x0153:
            return r16
        L_0x0154:
            if (r7 <= r6) goto L_0x0159
        L_0x0156:
            r7 = 65536(0x10000, float:9.18355E-41)
            goto L_0x015f
        L_0x0159:
            if (r9 < r6) goto L_0x0156
            if (r5 != r1) goto L_0x015e
            return r4
        L_0x015e:
            return r16
        L_0x015f:
            if (r6 >= r7) goto L_0x0165
            if (r5 != r1) goto L_0x0164
            return r4
        L_0x0164:
            return r16
        L_0x0165:
            int r7 = r5 + 1
            if (r5 != r1) goto L_0x016a
            return r4
        L_0x016a:
            if (r6 == r12) goto L_0x017e
            if (r6 == r11) goto L_0x017e
            if (r6 < 0) goto L_0x0174
            r5 = 31
            if (r5 >= r6) goto L_0x0183
        L_0x0174:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 <= r6) goto L_0x0179
            goto L_0x017e
        L_0x0179:
            r5 = 159(0x9f, float:2.23E-43)
            if (r5 < r6) goto L_0x017e
            goto L_0x0183
        L_0x017e:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L_0x0184
        L_0x0183:
            return r16
        L_0x0184:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r5) goto L_0x018a
            r14 = 1
            goto L_0x018b
        L_0x018a:
            r14 = 2
        L_0x018b:
            int r4 = r4 + r14
            pl.x r5 = pl.x.f30437a
            int r3 = r3 + 4
            goto L_0x0111
        L_0x0191:
            if (r5 != r1) goto L_0x0194
            return r4
        L_0x0194:
            return r16
        L_0x0195:
            if (r5 != r1) goto L_0x0198
            return r4
        L_0x0198:
            return r16
        L_0x0199:
            if (r5 != r1) goto L_0x019c
            return r4
        L_0x019c:
            return r16
        L_0x019d:
            if (r5 != r1) goto L_0x01a0
            return r4
        L_0x01a0:
            return r16
        L_0x01a1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jn.b.c(byte[], int):int");
    }

    public static final void d(h hVar, e eVar, int i10, int i11) {
        l.f(hVar, "$this$commonWrite");
        l.f(eVar, "buffer");
        eVar.a(hVar.e(), i10, i11);
    }

    /* access modifiers changed from: private */
    public static final int e(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        if ('a' <= c10 && 'f' >= c10) {
            return c10 - 'W';
        }
        if ('A' <= c10 && 'F' >= c10) {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] f() {
        return f24666a;
    }
}
