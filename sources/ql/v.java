package ql;

import bm.l;
import cm.y;
import hm.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

abstract class v extends u {
    public static boolean A(Iterable iterable, l lVar) {
        cm.l.f(iterable, "<this>");
        cm.l.f(lVar, "predicate");
        return y(iterable, lVar, true);
    }

    public static boolean B(List list, l lVar) {
        cm.l.f(list, "<this>");
        cm.l.f(lVar, "predicate");
        return z(list, lVar, true);
    }

    public static Object C(List list) {
        cm.l.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object D(List list) {
        cm.l.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(q.k(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static boolean E(Iterable iterable, l lVar) {
        cm.l.f(iterable, "<this>");
        cm.l.f(lVar, "predicate");
        return y(iterable, lVar, false);
    }

    public static final boolean F(Collection collection, Iterable iterable) {
        cm.l.f(collection, "<this>");
        cm.l.f(iterable, "elements");
        return collection.retainAll(x(iterable));
    }

    public static boolean v(Collection collection, Iterable iterable) {
        cm.l.f(collection, "<this>");
        cm.l.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean w(Collection collection, Object[] objArr) {
        cm.l.f(collection, "<this>");
        cm.l.f(objArr, "elements");
        return collection.addAll(l.c(objArr));
    }

    public static final Collection x(Iterable iterable) {
        cm.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = y.t0(iterable);
        }
        return (Collection) iterable;
    }

    private static final boolean y(Iterable iterable, l lVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final boolean z(List list, l lVar, boolean z10) {
        if (!(list instanceof RandomAccess)) {
            cm.l.d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return y(y.b(list), lVar, z10);
        }
        e0 r10 = new c(0, q.k(list)).iterator();
        int i10 = 0;
        while (r10.hasNext()) {
            int a10 = r10.a();
            Object obj = list.get(a10);
            if (((Boolean) lVar.invoke(obj)).booleanValue() != z10) {
                if (i10 != a10) {
                    list.set(i10, obj);
                }
                i10++;
            }
        }
        if (i10 >= list.size()) {
            return false;
        }
        int k10 = q.k(list);
        if (i10 > k10) {
            return true;
        }
        while (true) {
            list.remove(k10);
            if (k10 == i10) {
                return true;
            }
            k10--;
        }
    }
}
