package l3;

import android.util.SparseArray;
import java.util.HashMap;
import y2.e;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray f13269a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap f13270b;

    static {
        HashMap hashMap = new HashMap();
        f13270b = hashMap;
        hashMap.put(e.DEFAULT, 0);
        f13270b.put(e.VERY_LOW, 1);
        f13270b.put(e.HIGHEST, 2);
        for (e eVar : f13270b.keySet()) {
            f13269a.append(((Integer) f13270b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = (Integer) f13270b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i10) {
        e eVar = (e) f13269a.get(i10);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
