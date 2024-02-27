package y7;

import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f18583a;

    /* renamed from: b  reason: collision with root package name */
    int f18584b;

    /* renamed from: c  reason: collision with root package name */
    int f18585c;

    public c(ByteBuffer byteBuffer) {
        this.f18583a = byteBuffer;
        this.f18584b = byteBuffer.position();
    }

    public int a(int i10) {
        int i11;
        int i12 = this.f18583a.get(this.f18584b + (this.f18585c / 8));
        if (i12 < 0) {
            i12 += 256;
        }
        int i13 = this.f18585c;
        int i14 = 8 - (i13 % 8);
        if (i10 <= i14) {
            i11 = ((i12 << (i13 % 8)) & 255) >> ((i13 % 8) + (i14 - i10));
            this.f18585c = i13 + i10;
        } else {
            int i15 = i10 - i14;
            i11 = (a(i14) << i15) + a(i15);
        }
        this.f18583a.position(this.f18584b + ((int) Math.ceil(((double) this.f18585c) / 8.0d)));
        return i11;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public int c() {
        return (this.f18583a.limit() * 8) - this.f18585c;
    }
}
