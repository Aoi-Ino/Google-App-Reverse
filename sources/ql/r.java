package ql;

import cm.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

abstract class r extends q {
    public static int s(Iterable iterable, int i10) {
        l.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static List t(Iterable iterable) {
        l.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            boolean unused = v.v(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
