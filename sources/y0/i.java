package y0;

import cm.l;
import d1.k;

public abstract class i extends a0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(u uVar) {
        super(uVar);
        l.f(uVar, "database");
    }

    /* access modifiers changed from: protected */
    public abstract void i(k kVar, Object obj);

    public final void j(Object obj) {
        k b10 = b();
        try {
            i(b10, obj);
            b10.v0();
        } finally {
            h(b10);
        }
    }
}
