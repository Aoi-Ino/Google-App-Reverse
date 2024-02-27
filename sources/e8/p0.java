package e8;

import a8.j;
import java.security.MessageDigest;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f10988a = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, Byte.MIN_VALUE, 47, 12, -87, -2, 100, 83, 105, 122};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f10989b = {115, 65, 108, 84};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f10990c = {-1, -1, -1, -1};

    /* renamed from: d  reason: collision with root package name */
    static long f10991d = System.currentTimeMillis();

    public static byte[] a() {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            long currentTimeMillis = System.currentTimeMillis();
            long freeMemory = Runtime.getRuntime().freeMemory();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(currentTimeMillis);
            sb2.append("+");
            sb2.append(freeMemory);
            sb2.append("+");
            long j10 = f10991d;
            f10991d = 1 + j10;
            sb2.append(j10);
            return instance.digest(sb2.toString().getBytes());
        } catch (Exception e10) {
            throw new j(e10);
        }
    }

    public static i1 b(byte[] bArr) {
        f fVar = new f(90);
        fVar.e('[').e('<');
        for (int i10 = 0; i10 < 16; i10++) {
            fVar.y(bArr[i10]);
        }
        fVar.e('>').e('<');
        byte[] a10 = a();
        for (int i11 = 0; i11 < 16; i11++) {
            fVar.y(a10[i11]);
        }
        fVar.e('>').e(']');
        return new a1(fVar.Z());
    }
}
