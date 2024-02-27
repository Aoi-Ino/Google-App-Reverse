package y7;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

public class o extends b {

    /* renamed from: e  reason: collision with root package name */
    private static Logger f18616e = Logger.getLogger(o.class.getName());

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f18617d;

    public void e(ByteBuffer byteBuffer) {
        this.f18617d = (ByteBuffer) byteBuffer.slice().limit(c());
    }

    public String toString() {
        return "UnknownDescriptor" + "{tag=" + this.f18580a + ", sizeOfInstance=" + this.f18581b + ", data=" + this.f18617d + '}';
    }
}
