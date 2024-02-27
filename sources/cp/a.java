package cp;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f22744a = 4096;

    public static void a(InputStream inputStream, OutputStream outputStream) {
        b(inputStream, outputStream, f22744a);
    }

    public static void b(InputStream inputStream, OutputStream outputStream, int i10) {
        byte[] bArr = new byte[i10];
        while (true) {
            int read = inputStream.read(bArr, 0, i10);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int d(InputStream inputStream, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (read < 0) {
                break;
            }
            i12 += read;
        }
        return i12;
    }
}
