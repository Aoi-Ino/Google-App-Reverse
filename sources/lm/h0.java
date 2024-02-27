package lm;

import pl.p;
import pl.q;
import qm.j;
import tl.d;

public abstract class h0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d dVar) {
        Object obj;
        if (dVar instanceof j) {
            return dVar.toString();
        }
        try {
            p.a aVar = p.f30426e;
            obj = p.a(dVar + '@' + b(dVar));
        } catch (Throwable th2) {
            p.a aVar2 = p.f30426e;
            obj = p.a(q.a(th2));
        }
        Throwable b10 = p.b(obj);
        String str = obj;
        if (b10 != null) {
            str = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str;
    }
}
