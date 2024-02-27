package lm;

import qm.j;
import tl.d;

public abstract class m {
    public static final void a(j jVar, r0 r0Var) {
        jVar.i(new s0(r0Var));
    }

    public static final k b(d dVar) {
        if (!(dVar instanceof j)) {
            return new k(dVar, 1);
        }
        k j10 = ((j) dVar).j();
        if (j10 != null) {
            if (!j10.I()) {
                j10 = null;
            }
            if (j10 != null) {
                return j10;
            }
        }
        return new k(dVar, 2);
    }
}
