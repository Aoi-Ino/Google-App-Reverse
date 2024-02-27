package c2;

import b2.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import mn.a;
import pn.b;
import w7.c;
import w7.e;

public class y extends c {

    /* renamed from: s  reason: collision with root package name */
    static Map f4730s = new WeakHashMap();

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4731t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4732u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4733v = null;

    /* renamed from: r  reason: collision with root package name */
    List f4734r = Collections.emptyList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f4735a;

        /* renamed from: b  reason: collision with root package name */
        long f4736b;

        public a(long j10, long j11) {
            this.f4735a = j10;
            this.f4736b = j11;
        }

        public long a() {
            return this.f4735a;
        }

        public long b() {
            return this.f4736b;
        }

        public void c(long j10) {
            this.f4735a = j10;
        }

        public String toString() {
            return "Entry{count=" + this.f4735a + ", delta=" + this.f4736b + '}';
        }
    }

    static {
        n();
    }

    public y() {
        super("stts");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("TimeToSampleBox.java", y.class);
        f4731t = bVar.f("method-execution", bVar.e("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        f4732u = bVar.f("method-execution", bVar.e("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        f4733v = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int a10 = z7.b.a(b2.c.j(byteBuffer));
        this.f4734r = new ArrayList(a10);
        for (int i10 = 0; i10 < a10; i10++) {
            this.f4734r.add(new a(b2.c.j(byteBuffer), b2.c.j(byteBuffer)));
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.g(byteBuffer, (long) this.f4734r.size());
        for (a aVar : this.f4734r) {
            d.g(byteBuffer, aVar.a());
            d.g(byteBuffer, aVar.b());
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f4734r.size() * 8) + 8);
    }

    public String toString() {
        e.b().c(b.c(f4733v, this, this));
        return "TimeToSampleBox[entryCount=" + this.f4734r.size() + "]";
    }

    public void u(List list) {
        e.b().c(b.d(f4732u, this, this, list));
        this.f4734r = list;
    }
}
