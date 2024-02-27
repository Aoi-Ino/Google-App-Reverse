package androidx.work;

import androidx.work.b;
import cm.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m1.i;

public final class OverwritingInputMerger extends i {
    public b a(List list) {
        l.f(list, "inputs");
        b.a aVar = new b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map k10 = ((b) it.next()).k();
            l.e(k10, "input.keyValueMap");
            linkedHashMap.putAll(k10);
        }
        aVar.d(linkedHashMap);
        b a10 = aVar.a();
        l.e(a10, "output.build()");
        return a10;
    }
}
