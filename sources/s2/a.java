package s2;

import java.util.ArrayList;

public abstract class a {
    public static int[] a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length == 0) {
            return iArr2;
        }
        int i10 = 0;
        iArr2[0] = 0;
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (iArr[i11] != iArr[i11 - 1]) {
                i10++;
            }
            iArr2[i11] = i10;
        }
        return iArr2;
    }

    public static int[] b(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (int valueOf : iArr) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            if (i10 != valueOf2.intValue()) {
                arrayList.add(valueOf2);
            }
            i10 = valueOf2.intValue();
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }
}
