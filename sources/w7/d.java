package w7;

import c2.b;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import z7.e;

public abstract class d implements c2.d, Iterator, Closeable {

    /* renamed from: j  reason: collision with root package name */
    private static final b f17944j = new a("eof ");

    /* renamed from: k  reason: collision with root package name */
    private static e f17945k = e.a(d.class);

    /* renamed from: e  reason: collision with root package name */
    b f17946e = null;

    /* renamed from: f  reason: collision with root package name */
    long f17947f = 0;

    /* renamed from: g  reason: collision with root package name */
    long f17948g = 0;

    /* renamed from: h  reason: collision with root package name */
    long f17949h = 0;

    /* renamed from: i  reason: collision with root package name */
    private List f17950i = new ArrayList();

    class a extends a {
        a(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        public void a(ByteBuffer byteBuffer) {
        }

        /* access modifiers changed from: protected */
        public void b(ByteBuffer byteBuffer) {
        }

        /* access modifiers changed from: protected */
        public long c() {
            return 0;
        }
    }

    public void close() {
        throw null;
    }

    public void h(b bVar) {
        if (bVar != null) {
            this.f17950i = new ArrayList(l());
            bVar.g(this);
            this.f17950i.add(bVar);
        }
    }

    public boolean hasNext() {
        b bVar = this.f17946e;
        if (bVar == f17944j) {
            return false;
        }
        if (bVar != null) {
            return true;
        }
        try {
            this.f17946e = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f17946e = f17944j;
            return false;
        }
    }

    public List l() {
        return this.f17950i;
    }

    /* access modifiers changed from: protected */
    public long n() {
        long j10 = 0;
        for (int i10 = 0; i10 < l().size(); i10++) {
            j10 += ((b) this.f17950i.get(i10)).f();
        }
        return j10;
    }

    /* renamed from: o */
    public b next() {
        b bVar = this.f17946e;
        if (bVar == null || bVar == f17944j) {
            this.f17946e = f17944j;
            throw new NoSuchElementException();
        }
        this.f17946e = null;
        return bVar;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public final void s(WritableByteChannel writableByteChannel) {
        for (b e10 : l()) {
            e10.e(writableByteChannel);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.f17950i.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((b) this.f17950i.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
