package c2;

import b2.d;
import java.nio.ByteBuffer;
import mn.a;
import pn.b;
import w7.c;
import w7.e;

public class x extends c {

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4726s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4727t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4728u = null;

    /* renamed from: r  reason: collision with root package name */
    private long[] f4729r;

    static {
        n();
    }

    public x() {
        super("stss");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("SyncSampleBox.java", x.class);
        f4726s = bVar.f("method-execution", bVar.e("1", "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        f4727t = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        f4728u = bVar.f("method-execution", bVar.e("1", "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int a10 = z7.b.a(b2.c.j(byteBuffer));
        this.f4729r = new long[a10];
        for (int i10 = 0; i10 < a10; i10++) {
            this.f4729r[i10] = b2.c.j(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.g(byteBuffer, (long) this.f4729r.length);
        for (long g10 : this.f4729r) {
            d.g(byteBuffer, g10);
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f4729r.length * 4) + 8);
    }

    public String toString() {
        e.b().c(b.c(f4727t, this, this));
        return "SyncSampleBox[entryCount=" + this.f4729r.length + "]";
    }

    public void u(long[] jArr) {
        e.b().c(b.d(f4728u, this, this, jArr));
        this.f4729r = jArr;
    }
}
