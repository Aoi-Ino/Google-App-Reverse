package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a extends g implements Map {

    /* renamed from: l  reason: collision with root package name */
    f f14256l;

    /* renamed from: o.a$a  reason: collision with other inner class name */
    class C0191a extends f {
        C0191a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i10, int i11) {
            return a.this.f14305f[(i10 << 1) + i11];
        }

        /* access modifiers changed from: protected */
        public Map c() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return a.this.f14306g;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return a.this.f(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return a.this.h(obj);
        }

        /* access modifiers changed from: protected */
        public void g(Object obj, Object obj2) {
            a.this.put(obj, obj2);
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            a.this.k(i10);
        }

        /* access modifiers changed from: protected */
        public Object i(int i10, Object obj) {
            return a.this.l(i10, obj);
        }
    }

    public a() {
    }

    private f n() {
        if (this.f14256l == null) {
            this.f14256l = new C0191a();
        }
        return this.f14256l;
    }

    public Set entrySet() {
        return n().l();
    }

    public Set keySet() {
        return n().m();
    }

    public boolean o(Collection collection) {
        return f.p(this, collection);
    }

    public void putAll(Map map) {
        c(this.f14306g + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        return n().n();
    }

    public a(int i10) {
        super(i10);
    }

    public a(g gVar) {
        super(gVar);
    }
}
