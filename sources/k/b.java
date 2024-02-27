package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    c f12866e;

    /* renamed from: f  reason: collision with root package name */
    private c f12867f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakHashMap f12868g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    private int f12869h = 0;

    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c b(c cVar) {
            return cVar.f12873h;
        }

        /* access modifiers changed from: package-private */
        public c d(c cVar) {
            return cVar.f12872g;
        }
    }

    /* renamed from: k.b$b  reason: collision with other inner class name */
    private static class C0167b extends e {
        C0167b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c b(c cVar) {
            return cVar.f12872g;
        }

        /* access modifiers changed from: package-private */
        public c d(c cVar) {
            return cVar.f12873h;
        }
    }

    static class c implements Map.Entry {

        /* renamed from: e  reason: collision with root package name */
        final Object f12870e;

        /* renamed from: f  reason: collision with root package name */
        final Object f12871f;

        /* renamed from: g  reason: collision with root package name */
        c f12872g;

        /* renamed from: h  reason: collision with root package name */
        c f12873h;

        c(Object obj, Object obj2) {
            this.f12870e = obj;
            this.f12871f = obj2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f12870e.equals(cVar.f12870e) && this.f12871f.equals(cVar.f12871f);
        }

        public Object getKey() {
            return this.f12870e;
        }

        public Object getValue() {
            return this.f12871f;
        }

        public int hashCode() {
            return this.f12870e.hashCode() ^ this.f12871f.hashCode();
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f12870e + "=" + this.f12871f;
        }
    }

    public class d extends f implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        private c f12874e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f12875f = true;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(c cVar) {
            c cVar2 = this.f12874e;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f12873h;
                this.f12874e = cVar3;
                this.f12875f = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry next() {
            c cVar;
            if (this.f12875f) {
                this.f12875f = false;
                cVar = b.this.f12866e;
            } else {
                c cVar2 = this.f12874e;
                cVar = cVar2 != null ? cVar2.f12872g : null;
            }
            this.f12874e = cVar;
            return this.f12874e;
        }

        public boolean hasNext() {
            if (this.f12875f) {
                return b.this.f12866e != null;
            }
            c cVar = this.f12874e;
            return (cVar == null || cVar.f12872g == null) ? false : true;
        }
    }

    private static abstract class e extends f implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        c f12877e;

        /* renamed from: f  reason: collision with root package name */
        c f12878f;

        e(c cVar, c cVar2) {
            this.f12877e = cVar2;
            this.f12878f = cVar;
        }

        private c f() {
            c cVar = this.f12878f;
            c cVar2 = this.f12877e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        public void a(c cVar) {
            if (this.f12877e == cVar && cVar == this.f12878f) {
                this.f12878f = null;
                this.f12877e = null;
            }
            c cVar2 = this.f12877e;
            if (cVar2 == cVar) {
                this.f12877e = b(cVar2);
            }
            if (this.f12878f == cVar) {
                this.f12878f = f();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c b(c cVar);

        /* access modifiers changed from: package-private */
        public abstract c d(c cVar);

        /* renamed from: e */
        public Map.Entry next() {
            c cVar = this.f12878f;
            this.f12878f = f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f12878f != null;
        }
    }

    public static abstract class f {
        /* access modifiers changed from: package-private */
        public abstract void a(c cVar);
    }

    public Iterator descendingIterator() {
        C0167b bVar = new C0167b(this.f12867f, this.f12866e);
        this.f12868g.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    public Iterator iterator() {
        a aVar = new a(this.f12866e, this.f12867f);
        this.f12868g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Map.Entry l() {
        return this.f12866e;
    }

    /* access modifiers changed from: protected */
    public c n(Object obj) {
        c cVar = this.f12866e;
        while (cVar != null && !cVar.f12870e.equals(obj)) {
            cVar = cVar.f12872g;
        }
        return cVar;
    }

    public d o() {
        d dVar = new d();
        this.f12868g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry r() {
        return this.f12867f;
    }

    /* access modifiers changed from: package-private */
    public c s(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f12869h++;
        c cVar2 = this.f12867f;
        if (cVar2 == null) {
            this.f12866e = cVar;
        } else {
            cVar2.f12872g = cVar;
            cVar.f12873h = cVar2;
        }
        this.f12867f = cVar;
        return cVar;
    }

    public int size() {
        return this.f12869h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public Object v(Object obj, Object obj2) {
        c n10 = n(obj);
        if (n10 != null) {
            return n10.f12871f;
        }
        s(obj, obj2);
        return null;
    }

    public Object y(Object obj) {
        c n10 = n(obj);
        if (n10 == null) {
            return null;
        }
        this.f12869h--;
        if (!this.f12868g.isEmpty()) {
            for (f a10 : this.f12868g.keySet()) {
                a10.a(n10);
            }
        }
        c cVar = n10.f12873h;
        c cVar2 = n10.f12872g;
        if (cVar != null) {
            cVar.f12872g = cVar2;
        } else {
            this.f12866e = cVar2;
        }
        c cVar3 = n10.f12872g;
        if (cVar3 != null) {
            cVar3.f12873h = cVar;
        } else {
            this.f12867f = cVar;
        }
        n10.f12872g = null;
        n10.f12873h = null;
        return n10.f12871f;
    }
}
