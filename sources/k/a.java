package k;

import java.util.HashMap;
import java.util.Map;
import k.b;

public class a extends b {

    /* renamed from: i  reason: collision with root package name */
    private final HashMap f12865i = new HashMap();

    public Map.Entry B(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f12865i.get(obj)).f12873h;
        }
        return null;
    }

    public boolean contains(Object obj) {
        return this.f12865i.containsKey(obj);
    }

    /* access modifiers changed from: protected */
    public b.c n(Object obj) {
        return (b.c) this.f12865i.get(obj);
    }

    public Object v(Object obj, Object obj2) {
        b.c n10 = n(obj);
        if (n10 != null) {
            return n10.f12871f;
        }
        this.f12865i.put(obj, s(obj, obj2));
        return null;
    }

    public Object y(Object obj) {
        Object y10 = super.y(obj);
        this.f12865i.remove(obj);
        return y10;
    }
}
