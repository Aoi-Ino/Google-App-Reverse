package bp;

import java.io.ByteArrayOutputStream;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final d f20028a = new b();

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            f20028a.c(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new c("unable to decode base64 data: " + e10.getMessage(), e10);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        d dVar = f20028a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(dVar.a(i11));
        try {
            dVar.b(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new e("exception encoding base64 string: " + e10.getMessage(), e10);
        }
    }
}
