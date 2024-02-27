package ql;

import cm.l;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class m0 extends c {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final List f30775f;

    public static final class a implements ListIterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private final ListIterator f30776e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m0 f30777f;

        a(m0 m0Var, int i10) {
            this.f30777f = m0Var;
            this.f30776e = m0Var.f30775f.listIterator(w.M(m0Var, i10));
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return this.f30776e.hasPrevious();
        }

        public boolean hasPrevious() {
            return this.f30776e.hasNext();
        }

        public Object next() {
            return this.f30776e.previous();
        }

        public int nextIndex() {
            return w.L(this.f30777f, this.f30776e.previousIndex());
        }

        public Object previous() {
            return this.f30776e.next();
        }

        public int previousIndex() {
            return w.L(this.f30777f, this.f30776e.nextIndex());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m0(List list) {
        l.f(list, "delegate");
        this.f30775f = list;
    }

    public Object get(int i10) {
        return this.f30775f.get(w.K(this, i10));
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public int l() {
        return this.f30775f.size();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public ListIterator listIterator(int i10) {
        return new a(this, i10);
    }
}
