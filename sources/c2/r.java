package c2;

import b2.d;
import java.nio.ByteBuffer;
import mn.a;
import pn.b;
import w7.c;
import w7.e;

public class r extends c {
    private static final /* synthetic */ a.C0323a A = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4702u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4703v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4704w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4705x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4706y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4707z = null;

    /* renamed from: r  reason: collision with root package name */
    private long f4708r;

    /* renamed from: s  reason: collision with root package name */
    private long[] f4709s = new long[0];

    /* renamed from: t  reason: collision with root package name */
    int f4710t;

    static {
        n();
    }

    public r() {
        super("stsz");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("SampleSizeBox.java", r.class);
        f4702u = bVar.f("method-execution", bVar.e("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        f4703v = bVar.f("method-execution", bVar.e("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        f4704w = bVar.f("method-execution", bVar.e("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        f4705x = bVar.f("method-execution", bVar.e("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        f4706y = bVar.f("method-execution", bVar.e("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        f4707z = bVar.f("method-execution", bVar.e("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        A = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f4708r = b2.c.j(byteBuffer);
        int a10 = z7.b.a(b2.c.j(byteBuffer));
        this.f4710t = a10;
        if (this.f4708r == 0) {
            this.f4709s = new long[a10];
            for (int i10 = 0; i10 < this.f4710t; i10++) {
                this.f4709s[i10] = b2.c.j(byteBuffer);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.g(byteBuffer, this.f4708r);
        if (this.f4708r == 0) {
            d.g(byteBuffer, (long) this.f4709s.length);
            for (long g10 : this.f4709s) {
                d.g(byteBuffer, g10);
            }
            return;
        }
        d.g(byteBuffer, (long) this.f4710t);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f4708r == 0 ? this.f4709s.length * 4 : 0) + 12);
    }

    public String toString() {
        e.b().c(b.c(A, this, this));
        return "SampleSizeBox[sampleSize=" + v() + ";sampleCount=" + u() + "]";
    }

    public long u() {
        e.b().c(b.c(f4705x, this, this));
        return (long) (this.f4708r > 0 ? this.f4710t : this.f4709s.length);
    }

    public long v() {
        e.b().c(b.c(f4702u, this, this));
        return this.f4708r;
    }

    public void w(long[] jArr) {
        e.b().c(b.d(f4707z, this, this, jArr));
        this.f4709s = jArr;
    }
}
