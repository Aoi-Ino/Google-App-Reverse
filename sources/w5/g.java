package w5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import t5.s;

public abstract class g {
    public static Object a(e eVar) {
        s.a(eVar, "Task must not be null");
        if (eVar.g()) {
            return d(eVar);
        }
        v vVar = new v((u) null);
        e(eVar, vVar);
        vVar.c();
        return d(eVar);
    }

    public static e b(Exception exc) {
        t tVar = new t();
        tVar.i(exc);
        return tVar;
    }

    public static e c(Object obj) {
        t tVar = new t();
        tVar.j(obj);
        return tVar;
    }

    private static Object d(e eVar) {
        if (eVar.h()) {
            return eVar.f();
        }
        throw new ExecutionException(eVar.e());
    }

    private static void e(e eVar, w wVar) {
        Executor executor = f.f17882b;
        eVar.c(executor, wVar);
        eVar.b(executor, wVar);
    }
}
