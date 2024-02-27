package jp;

import java.util.LinkedHashMap;
import java.util.Map;

public class c extends LinkedHashMap implements a {

    /* renamed from: e  reason: collision with root package name */
    private final int f24671e;

    public c() {
        this(50000);
    }

    public void a(Object obj, Object obj2) {
        put(obj, obj2);
    }

    public Object b(Object obj) {
        return get(obj);
    }

    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f24671e;
    }

    public c(int i10) {
        this.f24671e = i10;
    }
}
