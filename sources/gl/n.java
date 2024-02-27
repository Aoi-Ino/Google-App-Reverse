package gl;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class n extends InputStream {

    /* renamed from: e  reason: collision with root package name */
    private final InputStream f23868e;

    /* renamed from: f  reason: collision with root package name */
    private long f23869f;

    /* renamed from: g  reason: collision with root package name */
    private long f23870g;

    /* renamed from: h  reason: collision with root package name */
    private long f23871h;

    /* renamed from: i  reason: collision with root package name */
    private long f23872i;

    public n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void f(long j10) {
        try {
            long j11 = this.f23870g;
            long j12 = this.f23869f;
            if (j11 >= j12 || j12 > this.f23871h) {
                this.f23870g = j12;
                this.f23868e.mark((int) (j10 - j12));
            } else {
                this.f23868e.reset();
                this.f23868e.mark((int) (j10 - this.f23870g));
                g(this.f23870g, this.f23869f);
            }
            this.f23871h = j10;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    private void g(long j10, long j11) {
        while (j10 < j11) {
            long skip = this.f23868e.skip(j11 - j10);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j10 += skip;
        }
    }

    public int available() {
        return this.f23868e.available();
    }

    public void c(long j10) {
        if (this.f23869f > this.f23871h || j10 < this.f23870g) {
            throw new IOException("Cannot reset");
        }
        this.f23868e.reset();
        g(this.f23870g, j10);
        this.f23869f = j10;
    }

    public void close() {
        this.f23868e.close();
    }

    public long e(int i10) {
        long j10 = this.f23869f + ((long) i10);
        if (this.f23871h < j10) {
            f(j10);
        }
        return this.f23869f;
    }

    public void mark(int i10) {
        this.f23872i = e(i10);
    }

    public boolean markSupported() {
        return this.f23868e.markSupported();
    }

    public int read() {
        int read = this.f23868e.read();
        if (read != -1) {
            this.f23869f++;
        }
        return read;
    }

    public void reset() {
        c(this.f23872i);
    }

    public long skip(long j10) {
        long skip = this.f23868e.skip(j10);
        this.f23869f += skip;
        return skip;
    }

    public n(InputStream inputStream, int i10) {
        this.f23872i = -1;
        this.f23868e = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i10) : inputStream;
    }

    public int read(byte[] bArr) {
        int read = this.f23868e.read(bArr);
        if (read != -1) {
            this.f23869f += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f23868e.read(bArr, i10, i11);
        if (read != -1) {
            this.f23869f += (long) read;
        }
        return read;
    }
}
