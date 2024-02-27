package ql;

import cm.l;
import java.util.LinkedHashSet;
import java.util.Set;

abstract class r0 extends q0 {
    public static Set h(Set set, Object obj) {
        l.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(h0.d(set.size()));
        boolean z10 = false;
        for (Object next : set) {
            boolean z11 = true;
            if (!z10 && l.a(next, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static Set i(Set set, Object obj) {
        l.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(h0.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
