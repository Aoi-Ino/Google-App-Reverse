package ql;

import cm.b;
import cm.f;
import cm.l;
import dm.a;
import java.util.Collection;
import java.util.Iterator;

final class g implements Collection, a {

    /* renamed from: e  reason: collision with root package name */
    private final Object[] f30765e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f30766f;

    public g(Object[] objArr, boolean z10) {
        l.f(objArr, "values");
        this.f30765e = objArr;
        this.f30766f = z10;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return m.t(this.f30765e, obj);
    }

    public boolean containsAll(Collection collection) {
        l.f(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f30765e.length == 0;
    }

    public Iterator iterator() {
        return b.a(this.f30765e);
    }

    public int l() {
        return this.f30765e.length;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return l();
    }

    public final Object[] toArray() {
        return p.b(this.f30765e, this.f30766f);
    }

    public Object[] toArray(Object[] objArr) {
        l.f(objArr, "array");
        return f.b(this, objArr);
    }
}
