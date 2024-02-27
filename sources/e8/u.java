package e8;

import java.io.OutputStream;

public class u extends OutputStream {

    /* renamed from: e  reason: collision with root package name */
    protected OutputStream f11029e;

    /* renamed from: f  reason: collision with root package name */
    protected int f11030f = 0;

    public u(OutputStream outputStream) {
        this.f11029e = outputStream;
    }

    public int c() {
        return this.f11030f;
    }

    public void close() {
        this.f11029e.close();
    }

    public void flush() {
        this.f11029e.flush();
    }

    public void write(int i10) {
        this.f11030f++;
        this.f11029e.write(i10);
    }

    public void write(byte[] bArr) {
        this.f11030f += bArr.length;
        this.f11029e.write(bArr);
    }

    public void write(byte[] bArr, int i10, int i11) {
        this.f11030f += i11;
        this.f11029e.write(bArr, i10, i11);
    }
}
