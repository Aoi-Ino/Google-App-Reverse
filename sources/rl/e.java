package rl;

import cm.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class e extends a {

    /* renamed from: e  reason: collision with root package name */
    private final d f31144e;

    public e(d dVar) {
        l.f(dVar, "backing");
        this.f31144e = dVar;
    }

    public boolean addAll(Collection collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f31144e.clear();
    }

    public boolean containsAll(Collection collection) {
        l.f(collection, "elements");
        return this.f31144e.m(collection);
    }

    public boolean isEmpty() {
        return this.f31144e.isEmpty();
    }

    public Iterator iterator() {
        return this.f31144e.r();
    }

    public int l() {
        return this.f31144e.size();
    }

    public boolean o(Map.Entry entry) {
        l.f(entry, "element");
        return this.f31144e.n(entry);
    }

    public boolean r(Map.Entry entry) {
        l.f(entry, "element");
        return this.f31144e.G(entry);
    }

    public boolean removeAll(Collection collection) {
        l.f(collection, "elements");
        this.f31144e.k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l.f(collection, "elements");
        this.f31144e.k();
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public boolean add(Map.Entry entry) {
        l.f(entry, "element");
        throw new UnsupportedOperationException();
    }
}
