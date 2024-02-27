package c2;

import b2.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mn.a;
import pn.b;
import w7.c;
import w7.e;

public class t extends c {

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4711s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4712t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4713u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4714v = null;

    /* renamed from: r  reason: collision with root package name */
    List f4715r = Collections.emptyList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f4716a;

        /* renamed from: b  reason: collision with root package name */
        long f4717b;

        /* renamed from: c  reason: collision with root package name */
        long f4718c;

        public a(long j10, long j11, long j12) {
            this.f4716a = j10;
            this.f4717b = j11;
            this.f4718c = j12;
        }

        public long a() {
            return this.f4716a;
        }

        public long b() {
            return this.f4718c;
        }

        public long c() {
            return this.f4717b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4716a == aVar.f4716a && this.f4718c == aVar.f4718c && this.f4717b == aVar.f4717b;
        }

        public int hashCode() {
            long j10 = this.f4716a;
            long j11 = this.f4717b;
            long j12 = this.f4718c;
            return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
        }

        public String toString() {
            return "Entry{firstChunk=" + this.f4716a + ", samplesPerChunk=" + this.f4717b + ", sampleDescriptionIndex=" + this.f4718c + '}';
        }
    }

    static {
        n();
    }

    public t() {
        super("stsc");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("SampleToChunkBox.java", t.class);
        f4711s = bVar.f("method-execution", bVar.e("1", "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        f4712t = bVar.f("method-execution", bVar.e("1", "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        f4713u = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        f4714v = bVar.f("method-execution", bVar.e("1", "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int a10 = z7.b.a(b2.c.j(byteBuffer));
        this.f4715r = new ArrayList(a10);
        for (int i10 = 0; i10 < a10; i10++) {
            this.f4715r.add(new a(b2.c.j(byteBuffer), b2.c.j(byteBuffer), b2.c.j(byteBuffer)));
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.g(byteBuffer, (long) this.f4715r.size());
        for (a aVar : this.f4715r) {
            d.g(byteBuffer, aVar.a());
            d.g(byteBuffer, aVar.c());
            d.g(byteBuffer, aVar.b());
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) ((this.f4715r.size() * 12) + 8);
    }

    public String toString() {
        e.b().c(b.c(f4713u, this, this));
        return "SampleToChunkBox[entryCount=" + this.f4715r.size() + "]";
    }

    public List u() {
        e.b().c(b.c(f4711s, this, this));
        return this.f4715r;
    }

    public void v(List list) {
        e.b().c(b.d(f4712t, this, this, list));
        this.f4715r = list;
    }
}
