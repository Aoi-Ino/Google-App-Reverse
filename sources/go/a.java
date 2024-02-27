package go;

import ap.c;
import java.io.ByteArrayOutputStream;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f23998a = new ByteArrayOutputStream();

    private a() {
    }

    public static a f() {
        return new a();
    }

    public a a(boolean z10) {
        this.f23998a.write(z10 ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.f23998a.toByteArray();
    }

    public a c(c cVar) {
        try {
            this.f23998a.write(cVar.getEncoded());
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public a d(byte[] bArr) {
        try {
            this.f23998a.write(bArr);
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public a e(byte[][] bArr) {
        try {
            for (byte[] write : bArr) {
                this.f23998a.write(write);
            }
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public a g(int i10, int i11) {
        while (this.f23998a.size() < i11) {
            this.f23998a.write(i10);
        }
        return this;
    }

    public a h(int i10) {
        int i11 = i10 & 65535;
        this.f23998a.write((byte) (i11 >>> 8));
        this.f23998a.write((byte) i11);
        return this;
    }

    public a i(int i10) {
        this.f23998a.write((byte) (i10 >>> 24));
        this.f23998a.write((byte) (i10 >>> 16));
        this.f23998a.write((byte) (i10 >>> 8));
        this.f23998a.write((byte) i10);
        return this;
    }

    public a j(long j10) {
        i((int) (j10 >>> 32));
        i((int) j10);
        return this;
    }
}
