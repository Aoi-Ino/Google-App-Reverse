package e8;

import java.util.Arrays;
import java.util.HashMap;

public abstract class g1 {
    public static l0 a(HashMap hashMap, c2 c2Var) {
        HashMap hashMap2 = hashMap;
        c2 c2Var2 = c2Var;
        if (hashMap.isEmpty()) {
            return null;
        }
        Integer[] numArr = (Integer[]) hashMap.keySet().toArray(new Integer[hashMap.size()]);
        Arrays.sort(numArr);
        if (numArr.length <= 64) {
            l0 l0Var = new l0();
            b0 b0Var = new b0();
            for (int i10 = 0; i10 < numArr.length; i10++) {
                b0Var.m(new f1(numArr[i10].intValue()));
                b0Var.m((i1) hashMap2.get(numArr[i10]));
            }
            l0Var.r(c1.f10398p6, b0Var);
            return l0Var;
        }
        int length = (numArr.length + 63) / 64;
        x0[] x0VarArr = new x0[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 64;
            int min = Math.min(i12 + 64, numArr.length);
            l0 l0Var2 = new l0();
            b0 b0Var2 = new b0();
            b0Var2.m(new f1(numArr[i12].intValue()));
            b0Var2.m(new f1(numArr[min - 1].intValue()));
            l0Var2.r(c1.f10397p5, b0Var2);
            b0 b0Var3 = new b0();
            while (i12 < min) {
                b0Var3.m(new f1(numArr[i12].intValue()));
                b0Var3.m((i1) hashMap2.get(numArr[i12]));
                i12++;
            }
            l0Var2.r(c1.f10398p6, b0Var3);
            x0VarArr[i11] = c2Var2.n(l0Var2).a();
        }
        int i13 = 64;
        while (length > 64) {
            i13 *= 64;
            int length2 = ((numArr.length + i13) - 1) / i13;
            int i14 = 0;
            while (i14 < length2) {
                int i15 = i14 * 64;
                int min2 = Math.min(i15 + 64, length);
                l0 l0Var3 = new l0();
                b0 b0Var4 = new b0();
                b0Var4.m(new f1(numArr[i14 * i13].intValue()));
                int i16 = i14 + 1;
                b0Var4.m(new f1(numArr[Math.min(i16 * i13, numArr.length) - 1].intValue()));
                l0Var3.r(c1.f10397p5, b0Var4);
                b0 b0Var5 = new b0();
                while (i15 < min2) {
                    b0Var5.m(x0VarArr[i15]);
                    i15++;
                }
                l0Var3.r(c1.f10220b5, b0Var5);
                x0VarArr[i14] = c2Var2.n(l0Var3).a();
                i14 = i16;
            }
            length = length2;
        }
        b0 b0Var6 = new b0();
        for (int i17 = 0; i17 < length; i17++) {
            b0Var6.m(x0VarArr[i17]);
        }
        l0 l0Var4 = new l0();
        l0Var4.r(c1.f10220b5, b0Var6);
        return l0Var4;
    }
}
