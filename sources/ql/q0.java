package ql;

import cm.l;
import java.util.LinkedHashSet;
import java.util.Set;

abstract class q0 extends p0 {
    public static Set d() {
        return c0.f30762e;
    }

    public static Set e(Object... objArr) {
        l.f(objArr, "elements");
        return (Set) m.F(objArr, new LinkedHashSet(h0.d(objArr.length)));
    }

    public static final Set f(Set set) {
        l.f(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : p0.c(set.iterator().next());
        }
        return d();
    }

    public static Set g(Object... objArr) {
        l.f(objArr, "elements");
        return objArr.length > 0 ? m.J(objArr) : d();
    }
}
