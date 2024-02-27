package cm;

import bm.l;
import bm.p;
import bm.q;
import bm.r;
import bm.t;
import dm.a;
import dm.b;
import dm.c;
import dm.d;
import java.util.Collection;
import java.util.Map;

public abstract class y {
    public static Collection a(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            l(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            l(obj, "kotlin.collections.MutableIterable");
        }
        return f(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof a) && !(obj instanceof d)) {
            l(obj, "kotlin.collections.MutableMap");
        }
        return g(obj);
    }

    public static Object d(Object obj, int i10) {
        if (obj != null && !i(obj, i10)) {
            l(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw k(e10);
        }
    }

    public static Iterable f(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw k(e10);
        }
    }

    public static Map g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw k(e10);
        }
    }

    public static int h(Object obj) {
        if (obj instanceof i) {
            return ((i) obj).getArity();
        }
        if (obj instanceof bm.a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        return obj instanceof t ? 6 : -1;
    }

    public static boolean i(Object obj, int i10) {
        return (obj instanceof pl.c) && h(obj) == i10;
    }

    private static Throwable j(Throwable th2) {
        return l.l(th2, y.class.getName());
    }

    public static ClassCastException k(ClassCastException classCastException) {
        throw ((ClassCastException) j(classCastException));
    }

    public static void l(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m(name + " cannot be cast to " + str);
    }

    public static void m(String str) {
        throw k(new ClassCastException(str));
    }
}
