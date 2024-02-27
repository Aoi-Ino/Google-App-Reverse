package t0;

import bm.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class g {
    public static final List a(Map map, l lVar) {
        cm.l.f(map, "<this>");
        cm.l.f(lVar, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            f fVar = (f) entry.getValue();
            if (fVar != null && !fVar.c() && !fVar.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object next : keySet) {
            if (((Boolean) lVar.invoke((String) next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
