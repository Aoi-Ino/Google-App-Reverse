package rl;

import cm.g;
import cm.l;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import ql.f;

public final class h extends f implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    private static final a f31147f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    private static final h f31148g = new h(d.f31125q.e());

    /* renamed from: e  reason: collision with root package name */
    private final d f31149e;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public h() {
        this(new d());
    }

    public boolean add(Object obj) {
        return this.f31149e.h(obj) >= 0;
    }

    public boolean addAll(Collection collection) {
        l.f(collection, "elements");
        this.f31149e.k();
        return super.addAll(collection);
    }

    public void clear() {
        this.f31149e.clear();
    }

    public boolean contains(Object obj) {
        return this.f31149e.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f31149e.isEmpty();
    }

    public Iterator iterator() {
        return this.f31149e.B();
    }

    public int l() {
        return this.f31149e.size();
    }

    public final Set n() {
        this.f31149e.j();
        return size() > 0 ? this : f31148g;
    }

    public boolean remove(Object obj) {
        return this.f31149e.I(obj) >= 0;
    }

    public boolean removeAll(Collection collection) {
        l.f(collection, "elements");
        this.f31149e.k();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l.f(collection, "elements");
        this.f31149e.k();
        return super.retainAll(collection);
    }

    public h(d dVar) {
        l.f(dVar, "backing");
        this.f31149e = dVar;
    }
}
