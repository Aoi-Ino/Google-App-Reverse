package c2;

import b2.c;
import b2.d;
import java.nio.ByteBuffer;
import mn.a;
import pn.b;
import w7.e;

public class j extends a {

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4665v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4666w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4667x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4668y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4669z = null;

    /* renamed from: r  reason: collision with root package name */
    private int f4670r;

    /* renamed from: s  reason: collision with root package name */
    private int f4671s;

    /* renamed from: t  reason: collision with root package name */
    private long f4672t;

    /* renamed from: u  reason: collision with root package name */
    private long f4673u;

    static {
        n();
    }

    public j() {
        super("hmhd");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("HintMediaHeaderBox.java", j.class);
        f4665v = bVar.f("method-execution", bVar.e("1", "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 42);
        f4666w = bVar.f("method-execution", bVar.e("1", "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 46);
        f4667x = bVar.f("method-execution", bVar.e("1", "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 50);
        f4668y = bVar.f("method-execution", bVar.e("1", "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 54);
        f4669z = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f4670r = c.h(byteBuffer);
        this.f4671s = c.h(byteBuffer);
        this.f4672t = c.j(byteBuffer);
        this.f4673u = c.j(byteBuffer);
        c.j(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.e(byteBuffer, this.f4670r);
        d.e(byteBuffer, this.f4671s);
        d.g(byteBuffer, this.f4672t);
        d.g(byteBuffer, this.f4673u);
        d.g(byteBuffer, 0);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 20;
    }

    public String toString() {
        e.b().c(b.c(f4669z, this, this));
        return "HintMediaHeaderBox{maxPduSize=" + this.f4670r + ", avgPduSize=" + this.f4671s + ", maxBitrate=" + this.f4672t + ", avgBitrate=" + this.f4673u + '}';
    }
}
