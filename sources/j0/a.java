package j0;

import java.nio.ByteBuffer;

public final class a extends c {
    public a f(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
        return this;
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public int h(int i10) {
        int b10 = b(16);
        if (b10 != 0) {
            return this.f12688b.getInt(d(b10) + (i10 * 4));
        }
        return 0;
    }

    public int i() {
        int b10 = b(16);
        if (b10 != 0) {
            return e(b10);
        }
        return 0;
    }

    public boolean j() {
        int b10 = b(6);
        return (b10 == 0 || this.f12688b.get(b10 + this.f12687a) == 0) ? false : true;
    }

    public short k() {
        int b10 = b(14);
        if (b10 != 0) {
            return this.f12688b.getShort(b10 + this.f12687a);
        }
        return 0;
    }

    public int l() {
        int b10 = b(4);
        if (b10 != 0) {
            return this.f12688b.getInt(b10 + this.f12687a);
        }
        return 0;
    }

    public short m() {
        int b10 = b(8);
        if (b10 != 0) {
            return this.f12688b.getShort(b10 + this.f12687a);
        }
        return 0;
    }

    public short n() {
        int b10 = b(12);
        if (b10 != 0) {
            return this.f12688b.getShort(b10 + this.f12687a);
        }
        return 0;
    }
}
