package jm;

import bm.l;
import java.util.Iterator;

public final class q implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f24661a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l f24662b;

    public static final class a implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private final Iterator f24663e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f24664f;

        a(q qVar) {
            this.f24664f = qVar;
            this.f24663e = qVar.f24661a.iterator();
        }

        public boolean hasNext() {
            return this.f24663e.hasNext();
        }

        public Object next() {
            return this.f24664f.f24662b.invoke(this.f24663e.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(g gVar, l lVar) {
        cm.l.f(gVar, "sequence");
        cm.l.f(lVar, "transformer");
        this.f24661a = gVar;
        this.f24662b = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
