package ql;

import cm.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rl.b;

abstract class p {
    public static List a(List list) {
        l.f(list, "builder");
        return ((b) list).B();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        l.f(objArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z10 && l.a(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        l.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static List c() {
        return new b();
    }

    public static List d(Object obj) {
        List singletonList = Collections.singletonList(obj);
        l.e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
