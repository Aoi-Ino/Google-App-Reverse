package u6;

import java.io.OutputStream;

final class b extends OutputStream {

    /* renamed from: e  reason: collision with root package name */
    private long f16906e = 0;

    b() {
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f16906e;
    }

    public void write(int i10) {
        this.f16906e++;
    }

    public void write(byte[] bArr) {
        this.f16906e += (long) bArr.length;
    }

    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f16906e += (long) i11;
    }
}
