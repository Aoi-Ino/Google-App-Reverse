package qn;

import cp.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

class o2 extends t2 {

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f30969i = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    private final int f30970g;

    /* renamed from: h  reason: collision with root package name */
    private int f30971h;

    o2(InputStream inputStream, int i10, int i11) {
        super(inputStream, i11);
        if (i10 <= 0) {
            if (i10 >= 0) {
                e(true);
            } else {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
        }
        this.f30970g = i10;
        this.f30971h = i10;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f30971h;
    }

    /* access modifiers changed from: package-private */
    public void g(byte[] bArr) {
        int i10 = this.f30971h;
        if (i10 != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        } else if (i10 != 0) {
            int c10 = c();
            int i11 = this.f30971h;
            if (i11 < c10) {
                int d10 = i11 - a.d(this.f30994e, bArr, 0, bArr.length);
                this.f30971h = d10;
                if (d10 == 0) {
                    e(true);
                    return;
                }
                throw new EOFException("DEF length " + this.f30970g + " object truncated by " + this.f30971h);
            }
            throw new IOException("corrupted stream - out of bounds length found: " + this.f30971h + " >= " + c10);
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] h() {
        if (this.f30971h == 0) {
            return f30969i;
        }
        int c10 = c();
        int i10 = this.f30971h;
        if (i10 < c10) {
            byte[] bArr = new byte[i10];
            int d10 = i10 - a.d(this.f30994e, bArr, 0, i10);
            this.f30971h = d10;
            if (d10 == 0) {
                e(true);
                return bArr;
            }
            throw new EOFException("DEF length " + this.f30970g + " object truncated by " + this.f30971h);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + this.f30971h + " >= " + c10);
    }

    public int read() {
        if (this.f30971h == 0) {
            return -1;
        }
        int read = this.f30994e.read();
        if (read >= 0) {
            int i10 = this.f30971h - 1;
            this.f30971h = i10;
            if (i10 == 0) {
                e(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f30970g + " object truncated by " + this.f30971h);
    }

    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f30971h;
        if (i12 == 0) {
            return -1;
        }
        int read = this.f30994e.read(bArr, i10, Math.min(i11, i12));
        if (read >= 0) {
            int i13 = this.f30971h - read;
            this.f30971h = i13;
            if (i13 == 0) {
                e(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f30970g + " object truncated by " + this.f30971h);
    }
}
