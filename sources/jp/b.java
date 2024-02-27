package jp;

import java.util.concurrent.ConcurrentHashMap;

public class b extends ConcurrentHashMap implements a {
    public void a(Object obj, Object obj2) {
        put(obj, obj2);
    }

    public Object b(Object obj) {
        return get(obj);
    }

    public boolean contains(Object obj) {
        return containsKey(obj);
    }
}
