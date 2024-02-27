package ql;

import cm.g;
import cm.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class c extends a implements List {

    /* renamed from: e  reason: collision with root package name */
    public static final a f30755e = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final boolean d(Collection collection, Collection collection2) {
            l.f(collection, "c");
            l.f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a10 : collection) {
                if (!l.a(a10, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection collection) {
            l.f(collection, "c");
            Iterator it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    private class b implements Iterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private int f30756e;

        public b() {
        }

        /* access modifiers changed from: protected */
        public final int a() {
            return this.f30756e;
        }

        /* access modifiers changed from: protected */
        public final void b(int i10) {
            this.f30756e = i10;
        }

        public boolean hasNext() {
            return this.f30756e < c.this.size();
        }

        public Object next() {
            if (hasNext()) {
                c cVar = c.this;
                int i10 = this.f30756e;
                this.f30756e = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ql.c$c  reason: collision with other inner class name */
    private class C0342c extends b implements ListIterator {
        public C0342c(int i10) {
            super();
            c.f30755e.b(i10, c.this.size());
            b(i10);
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return a() > 0;
        }

        public int nextIndex() {
            return a();
        }

        public Object previous() {
            if (hasPrevious()) {
                c cVar = c.this;
                b(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return a() - 1;
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private static final class d extends c implements RandomAccess {

        /* renamed from: f  reason: collision with root package name */
        private final c f30759f;

        /* renamed from: g  reason: collision with root package name */
        private final int f30760g;

        /* renamed from: h  reason: collision with root package name */
        private int f30761h;

        public d(c cVar, int i10, int i11) {
            l.f(cVar, "list");
            this.f30759f = cVar;
            this.f30760g = i10;
            c.f30755e.c(i10, i11, cVar.size());
            this.f30761h = i11 - i10;
        }

        public Object get(int i10) {
            c.f30755e.a(i10, this.f30761h);
            return this.f30759f.get(this.f30760g + i10);
        }

        public int l() {
            return this.f30761h;
        }
    }

    protected c() {
    }

    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f30755e.d(this, (Collection) obj);
    }

    public abstract Object get(int i10);

    public int hashCode() {
        return f30755e.e(this);
    }

    public int indexOf(Object obj) {
        int i10 = 0;
        for (Object a10 : this) {
            if (l.a(a10, obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (l.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C0342c(0);
    }

    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public ListIterator listIterator(int i10) {
        return new C0342c(i10);
    }
}
