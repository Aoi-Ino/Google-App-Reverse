package ep;

import java.util.Iterator;
import java.util.LinkedHashMap;

class z1 extends LinkedHashMap implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    private final d0 f23444e;

    public z1(d0 d0Var) {
        this.f23444e = d0Var;
    }

    public w1 D(String str, int i10) {
        y1 y1Var = (y1) get(str);
        if (y1Var != null) {
            return y1Var.v(i10);
        }
        return null;
    }

    public z1 U() {
        z1 z1Var = new z1(this.f23444e);
        for (String str : keySet()) {
            y1 y1Var = (y1) get(str);
            if (y1Var != null) {
                y1Var = y1Var.r();
            }
            if (!z1Var.containsKey(str)) {
                z1Var.put(str, y1Var);
            } else {
                throw new k2("Path with name '%s' is a duplicate in %s ", str, this.f23444e);
            }
        }
        return z1Var;
    }

    public Iterator iterator() {
        return values().iterator();
    }

    public void r(String str, w1 w1Var) {
        y1 y1Var = (y1) get(str);
        if (y1Var == null) {
            y1Var = new y1();
            put(str, y1Var);
        }
        y1Var.F(w1Var);
    }
}
