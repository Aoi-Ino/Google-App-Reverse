package y7;

import b2.c;
import java.nio.ByteBuffer;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    int f18580a;

    /* renamed from: b  reason: collision with root package name */
    int f18581b;

    /* renamed from: c  reason: collision with root package name */
    int f18582c;

    public int a() {
        return this.f18581b + 1 + this.f18582c;
    }

    public int b() {
        return this.f18582c;
    }

    public int c() {
        return this.f18581b;
    }

    public final void d(int i10, ByteBuffer byteBuffer) {
        this.f18580a = i10;
        int l10 = c.l(byteBuffer);
        this.f18581b = l10 & 127;
        int i11 = 1;
        while ((l10 >>> 7) == 1) {
            l10 = c.l(byteBuffer);
            i11++;
            this.f18581b = (this.f18581b << 7) | (l10 & 127);
        }
        this.f18582c = i11;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f18581b);
        e(slice);
        byteBuffer.position(byteBuffer.position() + this.f18581b);
    }

    public abstract void e(ByteBuffer byteBuffer);
}
