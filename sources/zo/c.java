package zo;

import java.lang.reflect.Array;

public abstract class c {
    public static a a(b bVar, i iVar) {
        int d10 = bVar.d();
        int i10 = 1 << d10;
        int g10 = iVar.g();
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{g10, i10});
        int[][] iArr2 = (int[][]) Array.newInstance(cls, new int[]{g10, i10});
        for (int i11 = 0; i11 < i10; i11++) {
            iArr2[0][i11] = bVar.f(iVar.e(i11));
        }
        for (int i12 = 1; i12 < g10; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                iArr2[i12][i13] = bVar.h(iArr2[i12 - 1][i13], i13);
            }
        }
        for (int i14 = 0; i14 < g10; i14++) {
            for (int i15 = 0; i15 < i10; i15++) {
                for (int i16 = 0; i16 <= i14; i16++) {
                    int[] iArr3 = iArr[i14];
                    iArr3[i15] = bVar.a(iArr3[i15], bVar.h(iArr2[i16][i15], iVar.f((g10 + i16) - i14)));
                }
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{g10 * d10, (i10 + 31) >>> 5});
        for (int i17 = 0; i17 < i10; i17++) {
            int i18 = i17 >>> 5;
            int i19 = 1 << (i17 & 31);
            for (int i20 = 0; i20 < g10; i20++) {
                int i21 = iArr[i20][i17];
                for (int i22 = 0; i22 < d10; i22++) {
                    if (((i21 >>> i22) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i20 + 1) * d10) - i22) - 1];
                        iArr5[i18] = iArr5[i18] ^ i19;
                    }
                }
            }
        }
        return new a(i10, iArr4);
    }
}
