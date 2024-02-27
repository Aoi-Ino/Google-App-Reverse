package jm;

import bm.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class p implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f24655a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l f24656b;

    public static final class a implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private final Iterator f24657e;

        /* renamed from: f  reason: collision with root package name */
        private int f24658f = -1;

        /* renamed from: g  reason: collision with root package name */
        private Object f24659g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f24660h;

        a(p pVar) {
            this.f24660h = pVar;
            this.f24657e = pVar.f24655a.iterator();
        }

        private final void a() {
            if (this.f24657e.hasNext()) {
                Object next = this.f24657e.next();
                if (((Boolean) this.f24660h.f24656b.invoke(next)).booleanValue()) {
                    this.f24658f = 1;
                    this.f24659g = next;
                    return;
                }
            }
            this.f24658f = 0;
        }

        public boolean hasNext() {
            if (this.f24658f == -1) {
                a();
            }
            return this.f24658f == 1;
        }

        public Object next() {
            if (this.f24658f == -1) {
                a();
            }
            if (this.f24658f != 0) {
                Object obj = this.f24659g;
                this.f24659g = null;
                this.f24658f = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p(g gVar, l lVar) {
        cm.l.f(gVar, "sequence");
        cm.l.f(lVar, "predicate");
        this.f24655a = gVar;
        this.f24656b = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
