package rl;

import cm.l;
import java.util.Collection;
import java.util.Iterator;

public final class f extends ql.f {

    /* renamed from: e  reason: collision with root package name */
    private final d f31145e;

    public f(d dVar) {
        l.f(dVar, "backing");
        this.f31145e = dVar;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f31145e.clear();
    }

    public boolean contains(Object obj) {
        return this.f31145e.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f31145e.isEmpty();
    }

    public Iterator iterator() {
        return this.f31145e.B();
    }

    public int l() {
        return this.f31145e.size();
    }

    public boolean remove(Object obj) {
        return this.f31145e.I(obj) >= 0;
    }

    public boolean removeAll(Collection collection) {
        l.f(collection, "elements");
        this.f31145e.k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l.f(collection, "elements");
        this.f31145e.k();
        return super.retainAll(collection);
    }
}
