package ql;

import cm.l;
import java.util.Map;
import java.util.NoSuchElementException;

abstract class g0 {
    public static final Object a(Map map, Object obj) {
        l.f(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
