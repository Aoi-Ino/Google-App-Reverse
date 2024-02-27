package j0;

import java.nio.ByteBuffer;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f12687a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f12688b;

    /* renamed from: c  reason: collision with root package name */
    private int f12689c;

    /* renamed from: d  reason: collision with root package name */
    private int f12690d;

    /* renamed from: e  reason: collision with root package name */
    d f12691e = d.a();

    /* access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f12688b.getInt(i10);
    }

    /* access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f12690d) {
            return this.f12688b.getShort(this.f12689c + i10);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f12688b = byteBuffer;
        if (byteBuffer != null) {
            this.f12687a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f12689c = i11;
            s10 = this.f12688b.getShort(i11);
        } else {
            s10 = 0;
            this.f12687a = 0;
            this.f12689c = 0;
        }
        this.f12690d = s10;
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f12687a;
        return i11 + this.f12688b.getInt(i11) + 4;
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f12687a;
        return this.f12688b.getInt(i11 + this.f12688b.getInt(i11));
    }
}
