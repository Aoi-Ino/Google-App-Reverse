package ep;

import java.util.Iterator;
import java.util.LinkedHashMap;

class n1 extends LinkedHashMap implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    private final p2 f23338e;

    public n1() {
        this((p2) null);
    }

    public boolean F(w wVar) {
        p2 p2Var = this.f23338e;
        boolean a10 = wVar.a();
        if (p2Var == null) {
            return a10;
        }
        return a10 && this.f23338e.a();
    }

    public Iterator iterator() {
        return values().iterator();
    }

    public j1 r(String str) {
        return (j1) remove(str);
    }

    public n1 v() {
        n1 n1Var = new n1(this.f23338e);
        Iterator it = iterator();
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            if (j1Var != null) {
                n1Var.put(j1Var.b(), j1Var);
            }
        }
        return n1Var;
    }

    public n1(p2 p2Var) {
        this.f23338e = p2Var;
    }
}
