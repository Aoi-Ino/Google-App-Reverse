package qn;

import java.io.EOFException;
import java.io.InputStream;

class q2 extends t2 {

    /* renamed from: g  reason: collision with root package name */
    private int f30978g;

    /* renamed from: h  reason: collision with root package name */
    private int f30979h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f30980i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f30981j = true;

    q2(InputStream inputStream, int i10) {
        super(inputStream, i10);
        this.f30978g = inputStream.read();
        int read = inputStream.read();
        this.f30979h = read;
        if (read >= 0) {
            f();
            return;
        }
        throw new EOFException();
    }

    private boolean f() {
        if (!this.f30980i && this.f30981j && this.f30978g == 0 && this.f30979h == 0) {
            this.f30980i = true;
            e(true);
        }
        return this.f30980i;
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        this.f30981j = z10;
        f();
    }

    public int read() {
        if (f()) {
            return -1;
        }
        int read = this.f30994e.read();
        if (read >= 0) {
            int i10 = this.f30978g;
            this.f30978g = this.f30979h;
            this.f30979h = read;
            return i10;
        }
        throw new EOFException();
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (this.f30981j || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this.f30980i) {
            return -1;
        }
        int read = this.f30994e.read(bArr, i10 + 2, i11 - 2);
        if (read >= 0) {
            bArr[i10] = (byte) this.f30978g;
            bArr[i10 + 1] = (byte) this.f30979h;
            this.f30978g = this.f30994e.read();
            int read2 = this.f30994e.read();
            this.f30979h = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
