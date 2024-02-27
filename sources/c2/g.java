package c2;

import b2.d;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import w7.b;

public class g extends b {

    /* renamed from: o  reason: collision with root package name */
    private int f4645o;

    /* renamed from: p  reason: collision with root package name */
    private int f4646p;

    public g() {
        super("dref");
    }

    public void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(y());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        d.i(allocate, this.f4645o);
        d.f(allocate, this.f4646p);
        d.g(allocate, (long) l().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        s(writableByteChannel);
    }

    public long f() {
        long n10 = n();
        return 8 + n10 + ((long) ((this.f17939n || n10 + 16 >= 4294967296L) ? 16 : 8));
    }
}
