package e8;

import java.util.Arrays;
import java.util.HashMap;

public abstract class d1 {
    public static l0 a(HashMap hashMap, c2 c2Var) {
        HashMap hashMap2 = hashMap;
        c2 c2Var2 = c2Var;
        if (hashMap.isEmpty()) {
            return null;
        }
        String[] strArr = (String[]) hashMap.keySet().toArray(new String[hashMap.size()]);
        Arrays.sort(strArr);
        int i10 = 64;
        if (strArr.length <= 64) {
            l0 l0Var = new l0();
            b0 b0Var = new b0();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                b0Var.m(new y1(strArr[i11], (String) null));
                b0Var.m((i1) hashMap2.get(strArr[i11]));
            }
            l0Var.r(c1.f10209a6, b0Var);
            return l0Var;
        }
        int length = (strArr.length + 63) / 64;
        x0[] x0VarArr = new x0[length];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 * 64;
            int min = Math.min(i13 + 64, strArr.length);
            l0 l0Var2 = new l0();
            b0 b0Var2 = new b0();
            b0Var2.m(new y1(strArr[i13], (String) null));
            b0Var2.m(new y1(strArr[min - 1], (String) null));
            l0Var2.r(c1.f10397p5, b0Var2);
            b0 b0Var3 = new b0();
            while (i13 < min) {
                b0Var3.m(new y1(strArr[i13], (String) null));
                b0Var3.m((i1) hashMap2.get(strArr[i13]));
                i13++;
            }
            l0Var2.r(c1.f10209a6, b0Var3);
            x0VarArr[i12] = c2Var2.n(l0Var2).a();
        }
        int i14 = 64;
        while (length > i10) {
            i14 *= i10;
            int length2 = ((strArr.length + i14) - 1) / i14;
            int i15 = 0;
            while (i15 < length2) {
                int i16 = i15 * 64;
                int min2 = Math.min(i16 + 64, length);
                l0 l0Var3 = new l0();
                b0 b0Var4 = new b0();
                b0Var4.m(new y1(strArr[i15 * i14], (String) null));
                int i17 = i15 + 1;
                b0Var4.m(new y1(strArr[Math.min(i17 * i14, strArr.length) - 1], (String) null));
                l0Var3.r(c1.f10397p5, b0Var4);
                b0 b0Var5 = new b0();
                while (i16 < min2) {
                    b0Var5.m(x0VarArr[i16]);
                    i16++;
                }
                l0Var3.r(c1.f10220b5, b0Var5);
                x0VarArr[i15] = c2Var2.n(l0Var3).a();
                i15 = i17;
                i10 = 64;
            }
            length = length2;
        }
        b0 b0Var6 = new b0();
        for (int i18 = 0; i18 < length; i18++) {
            b0Var6.m(x0VarArr[i18]);
        }
        l0 l0Var4 = new l0();
        l0Var4.r(c1.f10220b5, b0Var6);
        return l0Var4;
    }
}
