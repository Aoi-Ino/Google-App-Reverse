package y7;

import java.nio.ByteBuffer;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f18586a;

    /* renamed from: b  reason: collision with root package name */
    int f18587b;

    /* renamed from: c  reason: collision with root package name */
    int f18588c = 0;

    public d(ByteBuffer byteBuffer) {
        this.f18586a = byteBuffer;
        this.f18587b = byteBuffer.position();
    }

    public void a(int i10, int i11) {
        int i12 = this.f18588c;
        int i13 = 8 - (i12 % 8);
        int i14 = 1;
        if (i11 <= i13) {
            int i15 = this.f18586a.get(this.f18587b + (i12 / 8));
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i10 << (i13 - i11));
            ByteBuffer byteBuffer = this.f18586a;
            int i17 = this.f18587b + (this.f18588c / 8);
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f18588c += i11;
        } else {
            int i18 = i11 - i13;
            a(i10 >> i18, i13);
            a(i10 & ((1 << i18) - 1), i18);
        }
        ByteBuffer byteBuffer2 = this.f18586a;
        int i19 = this.f18587b;
        int i20 = this.f18588c;
        int i21 = i19 + (i20 / 8);
        if (i20 % 8 <= 0) {
            i14 = 0;
        }
        byteBuffer2.position(i21 + i14);
    }
}
