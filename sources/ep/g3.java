package ep;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

class g3 implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    private final j2 f23223e;

    /* renamed from: f  reason: collision with root package name */
    private final Constructor f23224f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f23225g;

    public g3(g3 g3Var) {
        this(g3Var.f23224f, g3Var.f23225g);
    }

    public boolean contains(Object obj) {
        return this.f23223e.containsKey(obj);
    }

    public Iterator iterator() {
        return this.f23223e.iterator();
    }

    public void l(h2 h2Var) {
        Object key = h2Var.getKey();
        if (key != null) {
            this.f23223e.put(key, h2Var);
        }
    }

    public g3 n() {
        g3 g3Var = new g3(this);
        Iterator it = iterator();
        while (it.hasNext()) {
            g3Var.l((h2) it.next());
        }
        return g3Var;
    }

    public Object o(Object[] objArr) {
        if (!this.f23224f.isAccessible()) {
            this.f23224f.setAccessible(true);
        }
        return this.f23224f.newInstance(objArr);
    }

    public h2 r(Object obj) {
        return (h2) this.f23223e.get(obj);
    }

    public List s() {
        return this.f23223e.r();
    }

    public int size() {
        return this.f23223e.size();
    }

    public String toString() {
        return this.f23224f.toString();
    }

    public Class v() {
        return this.f23225g;
    }

    public void y(Object obj, h2 h2Var) {
        this.f23223e.put(obj, h2Var);
    }

    public g3(Constructor constructor) {
        this(constructor, constructor.getDeclaringClass());
    }

    public g3(Constructor constructor, Class cls) {
        this.f23223e = new j2();
        this.f23224f = constructor;
        this.f23225g = cls;
    }
}
