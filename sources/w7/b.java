package w7;

import c2.d;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class b extends d implements c2.b {

    /* renamed from: l  reason: collision with root package name */
    d f17937l;

    /* renamed from: m  reason: collision with root package name */
    protected String f17938m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f17939n;

    public b(String str) {
        this.f17938m = str;
    }

    public void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(y());
        s(writableByteChannel);
    }

    public long f() {
        long n10 = n();
        return n10 + ((long) ((this.f17939n || 8 + n10 >= 4294967296L) ? 16 : 8));
    }

    public void g(d dVar) {
        this.f17937l = dVar;
    }

    /* access modifiers changed from: protected */
    public ByteBuffer y() {
        ByteBuffer byteBuffer;
        if (this.f17939n || f() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.f17938m.getBytes()[0];
            bArr[5] = this.f17938m.getBytes()[1];
            bArr[6] = this.f17938m.getBytes()[2];
            bArr[7] = this.f17938m.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(bArr);
            byteBuffer.position(8);
            b2.d.h(byteBuffer, f());
        } else {
            byte[] bArr2 = new byte[8];
            bArr2[4] = this.f17938m.getBytes()[0];
            bArr2[5] = this.f17938m.getBytes()[1];
            bArr2[6] = this.f17938m.getBytes()[2];
            bArr2[7] = this.f17938m.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(bArr2);
            b2.d.g(byteBuffer, f());
        }
        byteBuffer.rewind();
        return byteBuffer;
    }
}
