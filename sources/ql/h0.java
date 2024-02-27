package ql;

import cm.l;
import java.util.Collections;
import java.util.Map;
import pl.o;
import rl.d;

abstract class h0 extends g0 {
    public static Map b(Map map) {
        l.f(map, "builder");
        return ((d) map).j();
    }

    public static Map c() {
        return new d();
    }

    public static int d(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((((float) i10) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map e(o oVar) {
        l.f(oVar, "pair");
        Map singletonMap = Collections.singletonMap(oVar.c(), oVar.d());
        l.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final Map f(Map map) {
        l.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        l.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
