package qm;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import lm.v1;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f30865a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f30866b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final v1 f30867c;

    static {
        w wVar = new w();
        f30865a = wVar;
        i0.f("kotlinx.coroutines.fast.service.loader", true);
        f30867c = wVar.a();
    }

    private w() {
    }

    private final v1 a() {
        Object obj;
        v1 e10;
        Class<v> cls = v.class;
        try {
            List c10 = f30866b ? l.f30828a.c() : o.s(m.b(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator it = c10.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c11 = ((v) obj).c();
                    do {
                        Object next = it.next();
                        int c12 = ((v) next).c();
                        if (c11 < c12) {
                            obj = next;
                            c11 = c12;
                        }
                    } while (it.hasNext());
                }
            }
            v vVar = (v) obj;
            return (vVar == null || (e10 = x.e(vVar, c10)) == null) ? x.b((Throwable) null, (String) null, 3, (Object) null) : e10;
        } catch (Throwable th2) {
            return x.b(th2, (String) null, 2, (Object) null);
        }
    }
}
