package jm;

import cm.l;
import java.util.Iterator;

public final class b implements g, c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f24630a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f24631b;

    public static final class a implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private final Iterator f24632e;

        /* renamed from: f  reason: collision with root package name */
        private int f24633f;

        a(b bVar) {
            this.f24632e = bVar.f24630a.iterator();
            this.f24633f = bVar.f24631b;
        }

        private final void a() {
            while (this.f24633f > 0 && this.f24632e.hasNext()) {
                this.f24632e.next();
                this.f24633f--;
            }
        }

        public boolean hasNext() {
            a();
            return this.f24632e.hasNext();
        }

        public Object next() {
            a();
            return this.f24632e.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(g gVar, int i10) {
        l.f(gVar, "sequence");
        this.f24630a = gVar;
        this.f24631b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    public g a(int i10) {
        int i11 = this.f24631b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f24630a, i11);
    }

    public Iterator iterator() {
        return new a(this);
    }
}
