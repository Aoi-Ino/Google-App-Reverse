package c2;

import b2.c;
import b2.d;
import f.j;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import mn.a;
import pn.b;
import w7.a;
import w7.e;

public class h extends a {

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4647q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4648r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4649s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4650t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4651u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4652v = null;

    /* renamed from: n  reason: collision with root package name */
    private String f4653n;

    /* renamed from: o  reason: collision with root package name */
    private long f4654o;

    /* renamed from: p  reason: collision with root package name */
    private List f4655p;

    static {
        n();
    }

    public h(String str, long j10, List list) {
        super("ftyp");
        Collections.emptyList();
        this.f4653n = str;
        this.f4654o = j10;
        this.f4655p = list;
    }

    private static /* synthetic */ void n() {
        b bVar = new b("FileTypeBox.java", h.class);
        f4647q = bVar.f("method-execution", bVar.e("1", "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        f4648r = bVar.f("method-execution", bVar.e("1", "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        f4649s = bVar.f("method-execution", bVar.e("1", "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "", "void"), 103);
        f4650t = bVar.f("method-execution", bVar.e("1", "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "long"), 113);
        f4651u = bVar.f("method-execution", bVar.e("1", "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        f4652v = bVar.f("method-execution", bVar.e("1", "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), j.M0);
    }

    public void a(ByteBuffer byteBuffer) {
        this.f4653n = c.b(byteBuffer);
        this.f4654o = c.j(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f4655p = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f4655p.add(c.b(byteBuffer));
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        byteBuffer.put(b2.b.y(this.f4653n));
        d.g(byteBuffer, this.f4654o);
        for (String y10 : this.f4655p) {
            byteBuffer.put(b2.b.y(y10));
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f4655p.size() * 4) + 8);
    }

    public String o() {
        e.b().c(b.c(f4647q, this, this));
        return this.f4653n;
    }

    public long p() {
        e.b().c(b.c(f4650t, this, this));
        return this.f4654o;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FileTypeBox[");
        sb2.append("majorBrand=");
        sb2.append(o());
        sb2.append(";");
        sb2.append("minorVersion=");
        sb2.append(p());
        for (String append : this.f4655p) {
            sb2.append(";");
            sb2.append("compatibleBrand=");
            sb2.append(append);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
