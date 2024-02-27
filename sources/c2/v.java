package c2;

import b2.c;
import b2.d;
import java.nio.ByteBuffer;
import mn.a;
import pn.b;
import w7.e;

public class v extends c {

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4722t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4723u = null;

    /* renamed from: s  reason: collision with root package name */
    private long[] f4724s = new long[0];

    static {
        n();
    }

    public v() {
        super("stco");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("StaticChunkOffsetBox.java", v.class);
        f4722t = bVar.f("method-execution", bVar.e("1", "getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "", "[J"), 39);
        f4723u = bVar.f("method-execution", bVar.e("1", "setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"), 48);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int a10 = z7.b.a(c.j(byteBuffer));
        this.f4724s = new long[a10];
        for (int i10 = 0; i10 < a10; i10++) {
            this.f4724s[i10] = c.j(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.g(byteBuffer, (long) this.f4724s.length);
        for (long g10 : this.f4724s) {
            d.g(byteBuffer, g10);
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f4724s.length * 4) + 8);
    }

    public long[] u() {
        e.b().c(b.c(f4722t, this, this));
        return this.f4724s;
    }

    public void v(long[] jArr) {
        e.b().c(b.d(f4723u, this, this, jArr));
        this.f4724s = jArr;
    }
}
