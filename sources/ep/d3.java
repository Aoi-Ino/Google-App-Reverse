package ep;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class d3 implements Map {

    /* renamed from: e  reason: collision with root package name */
    private final Map f23147e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final boolean f23148f;

    public d3(boolean z10) {
        this.f23148f = z10;
    }

    public Map a() {
        return this.f23147e;
    }

    public boolean b() {
        return this.f23148f;
    }

    public void clear() {
        this.f23147e.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f23147e.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f23147e.containsValue(obj);
    }

    public Set entrySet() {
        return this.f23147e.entrySet();
    }

    public Object get(Object obj) {
        return this.f23147e.get(obj);
    }

    public boolean isEmpty() {
        return this.f23147e.isEmpty();
    }

    public Set keySet() {
        return this.f23147e.keySet();
    }

    public Object put(Object obj, Object obj2) {
        return this.f23147e.put(obj, obj2);
    }

    public void putAll(Map map) {
        this.f23147e.putAll(map);
    }

    public Object remove(Object obj) {
        return this.f23147e.remove(obj);
    }

    public int size() {
        return this.f23147e.size();
    }

    public Collection values() {
        return this.f23147e.values();
    }
}
