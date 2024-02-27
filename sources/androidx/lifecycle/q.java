package androidx.lifecycle;

import cm.l;
import lm.d2;
import lm.k1;
import lm.q0;

public abstract class q {
    public static final l a(k kVar) {
        m mVar;
        l.f(kVar, "<this>");
        do {
            m mVar2 = (m) kVar.c().get();
            if (mVar2 != null) {
                return mVar2;
            }
            mVar = new m(kVar, d2.b((k1) null, 1, (Object) null).l(q0.c().E0()));
        } while (!p.a(kVar.c(), (Object) null, mVar));
        mVar.j();
        return mVar;
    }
}
