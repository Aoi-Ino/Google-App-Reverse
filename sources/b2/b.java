package b2;

import w7.d;
import z7.e;

public abstract class b extends d {

    /* renamed from: l  reason: collision with root package name */
    private static e f4408l = e.a(b.class);

    public static byte[] y(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i10 = 0; i10 < Math.min(4, str.length()); i10++) {
                bArr[i10] = (byte) str.charAt(i10);
            }
        }
        return bArr;
    }
}
