package ep;

import java.util.ArrayList;
import java.util.Iterator;

class y1 extends ArrayList {
    public void F(w1 w1Var) {
        int f10 = w1Var.f();
        int size = size();
        for (int i10 = 0; i10 < f10; i10++) {
            if (i10 >= size) {
                add((Object) null);
            }
            int i11 = f10 - 1;
            if (i10 == i11) {
                set(i11, w1Var);
            }
        }
    }

    public w1 T() {
        while (!isEmpty()) {
            w1 w1Var = (w1) remove(0);
            if (!w1Var.isEmpty()) {
                return w1Var;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        Iterator it = iterator();
        while (it.hasNext()) {
            w1 w1Var = (w1) it.next();
            if (w1Var != null && !w1Var.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public y1 r() {
        y1 y1Var = new y1();
        Iterator it = iterator();
        while (it.hasNext()) {
            y1Var.F((w1) it.next());
        }
        return y1Var;
    }

    public w1 v(int i10) {
        if (i10 <= size()) {
            return (w1) get(i10 - 1);
        }
        return null;
    }
}
