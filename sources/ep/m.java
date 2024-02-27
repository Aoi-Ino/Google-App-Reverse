package ep;

import java.util.Iterator;
import java.util.LinkedHashMap;

class m implements z {

    /* renamed from: e  reason: collision with root package name */
    private final b f23319e = new b();

    /* renamed from: f  reason: collision with root package name */
    private final b f23320f = new b();

    private static class b extends LinkedHashMap {
        private b() {
        }

        public Iterator a() {
            return keySet().iterator();
        }
    }

    public void X(j1 j1Var, Object obj) {
        b4 b4Var = new b4(j1Var, obj);
        if (j1Var != null) {
            String[] m10 = j1Var.m();
            Object key = j1Var.getKey();
            for (String put : m10) {
                this.f23320f.put(put, b4Var);
            }
            this.f23319e.put(key, b4Var);
        }
    }

    public void f0(Object obj) {
        for (b4 b4Var : this.f23319e.values()) {
            b4Var.q().d(obj, b4Var.c());
        }
    }

    public b4 get(Object obj) {
        return (b4) this.f23319e.get(obj);
    }

    public Iterator iterator() {
        return this.f23319e.a();
    }

    public b4 m(j1 j1Var) {
        if (j1Var == null) {
            return null;
        }
        return (b4) this.f23319e.get(j1Var.getKey());
    }

    public b4 p(String str) {
        return (b4) this.f23320f.get(str);
    }

    public b4 remove(Object obj) {
        return (b4) this.f23319e.remove(obj);
    }
}
