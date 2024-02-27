package zl;

import cm.l;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class a {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i10) {
        l.f(inputStream, "<this>");
        l.f(outputStream, "out");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
            read = inputStream.read(bArr);
        }
        return j10;
    }
}
