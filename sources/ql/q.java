package ql;

import cm.l;
import hm.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class q extends p {
    public static ArrayList e(Object... objArr) {
        l.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new g(objArr, true));
    }

    public static final Collection f(Object[] objArr) {
        l.f(objArr, "<this>");
        return new g(objArr, false);
    }

    public static final int g(List list, Comparable comparable, int i10, int i11) {
        l.f(list, "<this>");
        p(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int a10 = b.a((Comparable) list.get(i13), comparable);
            if (a10 < 0) {
                i10 = i13 + 1;
            } else if (a10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int h(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return g(list, comparable, i10, i11);
    }

    public static List i() {
        return a0.f30750e;
    }

    public static c j(Collection collection) {
        l.f(collection, "<this>");
        return new c(0, collection.size() - 1);
    }

    public static int k(List list) {
        l.f(list, "<this>");
        return list.size() - 1;
    }

    public static List l(Object... objArr) {
        l.f(objArr, "elements");
        return objArr.length > 0 ? l.c(objArr) : i();
    }

    public static List m(Object... objArr) {
        l.f(objArr, "elements");
        return m.u(objArr);
    }

    public static List n(Object... objArr) {
        l.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new g(objArr, true));
    }

    public static final List o(List list) {
        l.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : p.d(list.get(0));
        }
        return i();
    }

    private static final void p(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        } else if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        } else if (i12 > i10) {
            throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
        }
    }

    public static void q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
