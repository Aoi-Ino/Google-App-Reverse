package w7;

import c2.b;
import c2.d;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import z7.e;

public abstract class a implements b {

    /* renamed from: m  reason: collision with root package name */
    private static e f17928m = e.a(a.class);

    /* renamed from: e  reason: collision with root package name */
    protected String f17929e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f17930f;

    /* renamed from: g  reason: collision with root package name */
    private d f17931g;

    /* renamed from: h  reason: collision with root package name */
    boolean f17932h;

    /* renamed from: i  reason: collision with root package name */
    boolean f17933i;

    /* renamed from: j  reason: collision with root package name */
    private ByteBuffer f17934j;

    /* renamed from: k  reason: collision with root package name */
    long f17935k = -1;

    /* renamed from: l  reason: collision with root package name */
    private ByteBuffer f17936l = null;

    protected a(String str) {
        this.f17929e = str;
        this.f17933i = true;
        this.f17932h = true;
    }

    private void d(ByteBuffer byteBuffer) {
        if (k()) {
            b2.d.g(byteBuffer, f());
            byteBuffer.put(b2.b.y(h()));
        } else {
            b2.d.g(byteBuffer, 1);
            byteBuffer.put(b2.b.y(h()));
            b2.d.h(byteBuffer, f());
        }
        if ("uuid".equals(h())) {
            byteBuffer.put(i());
        }
    }

    private boolean k() {
        int i10 = "uuid".equals(h()) ? 24 : 8;
        if (!this.f17933i) {
            return this.f17935k + ((long) i10) < 4294967296L;
        }
        if (!this.f17932h) {
            return ((long) (this.f17934j.limit() + i10)) < 4294967296L;
        }
        long c10 = c();
        ByteBuffer byteBuffer = this.f17936l;
        return (c10 + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i10) < 4294967296L;
    }

    private synchronized void m() {
        try {
            if (!this.f17933i) {
                e eVar = f17928m;
                eVar.b("mem mapping " + h());
                throw null;
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void b(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract long c();

    public void e(WritableByteChannel writableByteChannel) {
        Buffer position;
        int i10 = 8;
        int i11 = 0;
        int i12 = 16;
        if (this.f17933i) {
            if (this.f17932h) {
                ByteBuffer allocate = ByteBuffer.allocate(z7.b.a(f()));
                d(allocate);
                b(allocate);
                ByteBuffer byteBuffer = this.f17936l;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    while (this.f17936l.remaining() > 0) {
                        allocate.put(this.f17936l);
                    }
                }
                position = allocate.rewind();
            } else {
                if (!k()) {
                    i10 = 16;
                }
                if (!"uuid".equals(h())) {
                    i12 = 0;
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i10 + i12);
                d(allocate2);
                writableByteChannel.write((ByteBuffer) allocate2.rewind());
                position = this.f17934j.position(0);
            }
            writableByteChannel.write((ByteBuffer) position);
            return;
        }
        if (!k()) {
            i10 = 16;
        }
        if ("uuid".equals(h())) {
            i11 = 16;
        }
        ByteBuffer allocate3 = ByteBuffer.allocate(i10 + i11);
        d(allocate3);
        writableByteChannel.write((ByteBuffer) allocate3.rewind());
        throw null;
    }

    public long f() {
        long j10;
        int i10 = 0;
        if (!this.f17933i) {
            j10 = this.f17935k;
        } else if (this.f17932h) {
            j10 = c();
        } else {
            ByteBuffer byteBuffer = this.f17934j;
            j10 = (long) (byteBuffer != null ? byteBuffer.limit() : 0);
        }
        long j11 = j10 + ((long) ((j10 >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(h()) ? 16 : 0)));
        ByteBuffer byteBuffer2 = this.f17936l;
        if (byteBuffer2 != null) {
            i10 = byteBuffer2.limit();
        }
        return j11 + ((long) i10);
    }

    public void g(d dVar) {
        this.f17931g = dVar;
    }

    public String h() {
        return this.f17929e;
    }

    public byte[] i() {
        return this.f17930f;
    }

    public boolean j() {
        return this.f17932h;
    }

    public final synchronized void l() {
        try {
            m();
            e eVar = f17928m;
            eVar.b("parsing details of " + h());
            ByteBuffer byteBuffer = this.f17934j;
            if (byteBuffer != null) {
                this.f17932h = true;
                byteBuffer.rewind();
                a(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.f17936l = byteBuffer.slice();
                }
                this.f17934j = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
