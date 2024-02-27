package rl;

import cm.l;
import java.util.Map;
import ql.f;

public abstract class a extends f {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return n((Map.Entry) obj);
    }

    public final boolean n(Map.Entry entry) {
        l.f(entry, "element");
        return o(entry);
    }

    public abstract boolean o(Map.Entry entry);

    public abstract /* bridge */ boolean r(Map.Entry entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return r((Map.Entry) obj);
    }
}
