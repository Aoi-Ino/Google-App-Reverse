package hp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

class i0 extends ArrayList {

    /* renamed from: e  reason: collision with root package name */
    private final Set f24252e;

    private class a implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        private int f24253e;

        public a() {
            this.f24253e = i0.this.size();
        }

        /* renamed from: a */
        public g0 next() {
            if (!hasNext()) {
                return null;
            }
            i0 i0Var = i0.this;
            int i10 = this.f24253e - 1;
            this.f24253e = i10;
            return (g0) i0Var.get(i10);
        }

        public boolean hasNext() {
            return this.f24253e > 0;
        }

        public void remove() {
            i0.this.F(this.f24253e);
        }
    }

    public i0(Set set) {
        this.f24252e = set;
    }

    public g0 F(int i10) {
        g0 g0Var = (g0) remove(i10);
        if (g0Var != null) {
            this.f24252e.remove(g0Var);
        }
        return g0Var;
    }

    public g0 T(g0 g0Var) {
        this.f24252e.add(g0Var);
        add(g0Var);
        return g0Var;
    }

    public g0 Y() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return (g0) get(size - 1);
    }

    public Iterator iterator() {
        return new a();
    }

    public g0 r() {
        if (size() <= 0) {
            return null;
        }
        return (g0) get(0);
    }

    public g0 v() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return F(size - 1);
    }
}
