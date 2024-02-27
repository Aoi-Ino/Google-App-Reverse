package y7;

import b2.c;
import b2.d;
import java.nio.ByteBuffer;

public class n extends b {

    /* renamed from: d  reason: collision with root package name */
    int f18615d;

    public void e(ByteBuffer byteBuffer) {
        this.f18615d = c.l(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f18615d == ((n) obj).f18615d;
    }

    public ByteBuffer f() {
        ByteBuffer allocate = ByteBuffer.allocate(3);
        d.i(allocate, 6);
        d.i(allocate, 1);
        d.i(allocate, this.f18615d);
        return allocate;
    }

    public int g() {
        return 3;
    }

    public void h(int i10) {
        this.f18615d = i10;
    }

    public int hashCode() {
        return this.f18615d;
    }

    public String toString() {
        return "SLConfigDescriptor" + "{predefined=" + this.f18615d + '}';
    }
}
