package bp;

import java.io.ByteArrayOutputStream;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final g f20034a = new g();

    public static byte[] a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static byte[] b(byte[] bArr, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f20034a.b(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new e("exception encoding Hex string: " + e10.getMessage(), e10);
        }
    }
}
