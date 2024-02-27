package o5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

public final class i extends InputStream {

    /* renamed from: e  reason: collision with root package name */
    private final Enumeration f14441e;

    /* renamed from: f  reason: collision with root package name */
    private InputStream f14442f;

    public i(Enumeration enumeration) {
        this.f14441e = enumeration;
        c();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        InputStream inputStream = this.f14442f;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f14442f = this.f14441e.hasMoreElements() ? new FileInputStream((File) this.f14441e.nextElement()) : null;
    }

    public final void close() {
        super.close();
        InputStream inputStream = this.f14442f;
        if (inputStream != null) {
            inputStream.close();
            this.f14442f = null;
        }
    }

    public final int read() {
        while (true) {
            InputStream inputStream = this.f14442f;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            c();
        }
    }

    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f14442f == null) {
            return -1;
        }
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        } else if (i11 == 0) {
            return 0;
        } else {
            do {
                int read = this.f14442f.read(bArr, i10, i11);
                if (read > 0) {
                    return read;
                }
                c();
            } while (this.f14442f != null);
            return -1;
        }
    }
}
