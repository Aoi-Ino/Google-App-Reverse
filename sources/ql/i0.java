package ql;

import cm.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pl.o;

abstract class i0 extends h0 {
    public static Map g() {
        b0 b0Var = b0.f30754e;
        l.d(b0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return b0Var;
    }

    public static Object h(Map map, Object obj) {
        l.f(map, "<this>");
        return g0.a(map, obj);
    }

    public static Map i(o... oVarArr) {
        l.f(oVarArr, "pairs");
        return oVarArr.length > 0 ? q(oVarArr, new LinkedHashMap(h0.d(oVarArr.length))) : g();
    }

    public static final Map j(Map map) {
        l.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : h0.f(map);
        }
        return g();
    }

    public static Map k(Map map, o oVar) {
        l.f(map, "<this>");
        l.f(oVar, "pair");
        if (map.isEmpty()) {
            return h0.e(oVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(oVar.c(), oVar.d());
        return linkedHashMap;
    }

    public static final void l(Map map, Iterable iterable) {
        l.f(map, "<this>");
        l.f(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            map.put(oVar.a(), oVar.b());
        }
    }

    public static final void m(Map map, o[] oVarArr) {
        l.f(map, "<this>");
        l.f(oVarArr, "pairs");
        for (o oVar : oVarArr) {
            map.put(oVar.a(), oVar.b());
        }
    }

    public static Map n(Iterable iterable) {
        l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return j(o(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return o(iterable, new LinkedHashMap(h0.d(collection.size())));
        }
        return h0.e((o) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map o(Iterable iterable, Map map) {
        l.f(iterable, "<this>");
        l.f(map, "destination");
        l(map, iterable);
        return map;
    }

    public static Map p(Map map) {
        l.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? r(map) : h0.f(map);
        }
        return g();
    }

    public static final Map q(o[] oVarArr, Map map) {
        l.f(oVarArr, "<this>");
        l.f(map, "destination");
        m(map, oVarArr);
        return map;
    }

    public static Map r(Map map) {
        l.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
