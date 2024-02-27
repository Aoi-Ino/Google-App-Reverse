package go;

import xn.a;

class n {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f24056a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f24057b;

    /* renamed from: c  reason: collision with root package name */
    private final a f24058c;

    /* renamed from: d  reason: collision with root package name */
    private int f24059d;

    /* renamed from: e  reason: collision with root package name */
    private int f24060e;

    public n(byte[] bArr, byte[] bArr2, a aVar) {
        this.f24056a = bArr;
        this.f24057b = bArr2;
        this.f24058c = aVar;
    }

    public void a(byte[] bArr, boolean z10, int i10) {
        b(bArr, i10);
        if (z10) {
            this.f24060e++;
        }
    }

    public byte[] b(byte[] bArr, int i10) {
        if (bArr.length >= this.f24058c.c()) {
            a aVar = this.f24058c;
            byte[] bArr2 = this.f24056a;
            aVar.d(bArr2, 0, bArr2.length);
            this.f24058c.e((byte) (this.f24059d >>> 24));
            this.f24058c.e((byte) (this.f24059d >>> 16));
            this.f24058c.e((byte) (this.f24059d >>> 8));
            this.f24058c.e((byte) this.f24059d);
            this.f24058c.e((byte) (this.f24060e >>> 8));
            this.f24058c.e((byte) this.f24060e);
            this.f24058c.e((byte) -1);
            a aVar2 = this.f24058c;
            byte[] bArr3 = this.f24057b;
            aVar2.d(bArr3, 0, bArr3.length);
            this.f24058c.a(bArr, i10);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public void c(int i10) {
        this.f24060e = i10;
    }

    public void d(int i10) {
        this.f24059d = i10;
    }
}
