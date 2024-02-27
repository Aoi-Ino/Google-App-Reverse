package c2;

import b2.d;
import java.nio.ByteBuffer;
import java.util.Date;
import mn.a;
import pn.b;
import w7.c;
import w7.e;

public class l extends c {
    private static final /* synthetic */ a.C0323a A = null;
    private static final /* synthetic */ a.C0323a B = null;
    private static final /* synthetic */ a.C0323a C = null;
    private static final /* synthetic */ a.C0323a D = null;
    private static final /* synthetic */ a.C0323a E = null;
    private static final /* synthetic */ a.C0323a F = null;
    private static final /* synthetic */ a.C0323a G = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4674w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4675x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4676y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4677z = null;

    /* renamed from: r  reason: collision with root package name */
    private Date f4678r = new Date();

    /* renamed from: s  reason: collision with root package name */
    private Date f4679s = new Date();

    /* renamed from: t  reason: collision with root package name */
    private long f4680t;

    /* renamed from: u  reason: collision with root package name */
    private long f4681u;

    /* renamed from: v  reason: collision with root package name */
    private String f4682v = "eng";

    static {
        n();
    }

    public l() {
        super("mdhd");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("MediaHeaderBox.java", l.class);
        f4674w = bVar.f("method-execution", bVar.e("1", "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        f4675x = bVar.f("method-execution", bVar.e("1", "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        G = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        f4676y = bVar.f("method-execution", bVar.e("1", "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 54);
        f4677z = bVar.f("method-execution", bVar.e("1", "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 58);
        A = bVar.f("method-execution", bVar.e("1", "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        B = bVar.f("method-execution", bVar.e("1", "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 79);
        C = bVar.f("method-execution", bVar.e("1", "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 83);
        D = bVar.f("method-execution", bVar.e("1", "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"), 87);
        E = bVar.f("method-execution", bVar.e("1", "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"), 91);
        F = bVar.f("method-execution", bVar.e("1", "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 95);
    }

    public void A(long j10) {
        e.b().c(b.d(E, this, this, on.a.e(j10)));
        this.f4681u = j10;
    }

    public void B(String str) {
        e.b().c(b.d(F, this, this, str));
        this.f4682v = str;
    }

    public void C(long j10) {
        e.b().c(b.d(D, this, this, on.a.e(j10)));
        this.f4680t = j10;
    }

    public void a(ByteBuffer byteBuffer) {
        long j10;
        q(byteBuffer);
        if (p() == 1) {
            this.f4678r = z7.c.b(b2.c.k(byteBuffer));
            this.f4679s = z7.c.b(b2.c.k(byteBuffer));
            this.f4680t = b2.c.j(byteBuffer);
            j10 = b2.c.k(byteBuffer);
        } else {
            this.f4678r = z7.c.b(b2.c.j(byteBuffer));
            this.f4679s = z7.c.b(b2.c.j(byteBuffer));
            this.f4680t = b2.c.j(byteBuffer);
            j10 = b2.c.j(byteBuffer);
        }
        this.f4681u = j10;
        this.f4682v = b2.c.f(byteBuffer);
        b2.c.h(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (p() == 1) {
            d.h(byteBuffer, z7.c.a(this.f4678r));
            d.h(byteBuffer, z7.c.a(this.f4679s));
            d.g(byteBuffer, this.f4680t);
            d.h(byteBuffer, this.f4681u);
        } else {
            d.g(byteBuffer, z7.c.a(this.f4678r));
            d.g(byteBuffer, z7.c.a(this.f4679s));
            d.g(byteBuffer, this.f4680t);
            d.g(byteBuffer, this.f4681u);
        }
        d.d(byteBuffer, this.f4682v);
        d.e(byteBuffer, 0);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (p() == 1 ? 32 : 20) + 4;
    }

    public String toString() {
        e.b().c(b.c(G, this, this));
        return "MediaHeaderBox[" + "creationTime=" + u() + ";" + "modificationTime=" + x() + ";" + "timescale=" + y() + ";" + "duration=" + v() + ";" + "language=" + w() + "]";
    }

    public Date u() {
        e.b().c(b.c(f4674w, this, this));
        return this.f4678r;
    }

    public long v() {
        e.b().c(b.c(f4677z, this, this));
        return this.f4681u;
    }

    public String w() {
        e.b().c(b.c(A, this, this));
        return this.f4682v;
    }

    public Date x() {
        e.b().c(b.c(f4675x, this, this));
        return this.f4679s;
    }

    public long y() {
        e.b().c(b.c(f4676y, this, this));
        return this.f4680t;
    }

    public void z(Date date) {
        e.b().c(b.d(B, this, this, date));
        this.f4678r = date;
    }
}
