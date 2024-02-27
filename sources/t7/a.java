package t7;

import java.util.Hashtable;
import r7.b;
import v7.e;

public final class a {
    private static b b(e eVar, int i10, int i11) {
        byte b10;
        b c10 = eVar.c();
        int f10 = c10.f();
        int d10 = c10.d();
        int i12 = f10 + 8;
        int i13 = d10 + 8;
        int max = Math.max(i10, i12);
        int max2 = Math.max(i11, i13);
        int min = Math.min(max / i12, max2 / i13);
        int i14 = f10 * min;
        int i15 = (max - i14) / 2;
        int i16 = d10 * min;
        int i17 = (max2 - i16) / 2;
        b bVar = new b(max2, max);
        byte[][] c11 = bVar.c();
        byte[] bArr = new byte[max];
        int i18 = 0;
        while (true) {
            b10 = -1;
            if (i18 >= i17) {
                break;
            }
            c(c11[i18], (byte) -1);
            i18++;
        }
        byte[][] c12 = c10.c();
        int i19 = 0;
        while (i19 < d10) {
            for (int i20 = 0; i20 < i15; i20++) {
                bArr[i20] = b10;
            }
            int i21 = i15;
            int i22 = 0;
            while (i22 < f10) {
                byte[][] bArr2 = c12;
                byte b11 = c12[i19][i22] == 1 ? (byte) 0 : -1;
                for (int i23 = 0; i23 < min; i23++) {
                    bArr[i21 + i23] = b11;
                }
                i21 += min;
                i22++;
                c12 = bArr2;
            }
            byte[][] bArr3 = c12;
            for (int i24 = i15 + i14; i24 < max; i24++) {
                bArr[i24] = -1;
            }
            int i25 = (i19 * min) + i17;
            int i26 = 0;
            while (i26 < min) {
                System.arraycopy(bArr, 0, c11[i25 + i26], 0, max);
                i26++;
                i25 = i25;
            }
            i19++;
            c12 = bArr3;
            b10 = -1;
        }
        for (int i27 = i17 + i16; i27 < max2; i27++) {
            c(c11[i27], (byte) -1);
        }
        return bVar;
    }

    private static void c(byte[] bArr, byte b10) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = b10;
        }
    }

    public b a(String str, q7.a aVar, int i10, int i11, Hashtable hashtable) {
        u7.a aVar2;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != q7.a.f15222b) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can only encode QR_CODE, but got ");
            stringBuffer.append(aVar);
            throw new IllegalArgumentException(stringBuffer.toString());
        } else if (i10 < 0 || i11 < 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Requested dimensions are too small: ");
            stringBuffer2.append(i10);
            stringBuffer2.append('x');
            stringBuffer2.append(i11);
            throw new IllegalArgumentException(stringBuffer2.toString());
        } else {
            u7.a aVar3 = u7.a.f16932d;
            if (!(hashtable == null || (aVar2 = (u7.a) hashtable.get(q7.b.f15232a)) == null)) {
                aVar3 = aVar2;
            }
            e eVar = new e();
            v7.b.l(str, aVar3, eVar);
            return b(eVar, i10, i11);
        }
    }
}
