package a2;

import c2.b;
import c2.d;
import cm.l;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class c implements b {

    /* renamed from: e  reason: collision with root package name */
    private d f67e;

    /* renamed from: f  reason: collision with root package name */
    private long f68f = 1073741824;

    /* renamed from: g  reason: collision with root package name */
    private long f69g;

    private final boolean c(long j10) {
        return j10 + ((long) 8) < 4294967296L;
    }

    public final long a() {
        return this.f68f;
    }

    public long b() {
        return this.f69g;
    }

    public final void d(long j10) {
        this.f68f = j10;
    }

    public void e(WritableByteChannel writableByteChannel) {
        l.f(writableByteChannel, "writableByteChannel");
        ByteBuffer allocate = ByteBuffer.allocate(16);
        long f10 = f();
        if (!c(f10) || f10 < 0 || f10 > 4294967296L) {
            b2.d.g(allocate, 1);
        } else {
            b2.d.g(allocate, f10);
        }
        allocate.put(b2.b.y("mdat"));
        if (c(f10)) {
            allocate.put(new byte[8]);
        } else {
            if (f10 < 0) {
                f10 = 1;
            }
            b2.d.h(allocate, f10);
        }
        allocate.rewind();
        writableByteChannel.write(allocate);
    }

    public long f() {
        return ((long) 16) + this.f68f;
    }

    public void g(d dVar) {
        l.f(dVar, "parent");
        this.f67e = dVar;
    }

    public final void h(long j10) {
        this.f69g = j10;
    }
}
