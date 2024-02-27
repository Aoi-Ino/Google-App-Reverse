package rl;

import cm.l;
import java.util.Collection;
import java.util.Iterator;
import ql.d;

public final class g extends d {

    /* renamed from: e  reason: collision with root package name */
    private final d f31146e;

    public g(d dVar) {
        l.f(dVar, "backing");
        this.f31146e = dVar;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f31146e.clear();
    }

    public boolean contains(Object obj) {
        return this.f31146e.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f31146e.isEmpty();
    }

    public Iterator iterator() {
        return this.f31146e.M();
    }

    public int l() {
        return this.f31146e.size();
    }

    public boolean remove(Object obj) {
        return this.f31146e.K(obj);
    }

    public boolean removeAll(Collection collection) {
        l.f(collection, "elements");
        this.f31146e.k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l.f(collection, "elements");
        this.f31146e.k();
        return super.retainAll(collection);
    }
}
