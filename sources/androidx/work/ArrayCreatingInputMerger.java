package androidx.work;

import androidx.work.b;
import cm.l;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m1.i;

public final class ArrayCreatingInputMerger extends i {
    private final Object b(Object obj, Object obj2, Class cls) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        l.e(newInstance, "newArray");
        return newInstance;
    }

    private final Object c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        l.c(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        l.e(newInstance, "newArray");
        return newInstance;
    }

    private final Object d(Object obj, Class cls) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        l.e(newInstance, "newArray");
        return newInstance;
    }

    public b a(List list) {
        l.f(list, "inputs");
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map k10 = ((b) it.next()).k();
            l.e(k10, "input.keyValueMap");
            Iterator it2 = k10.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    Class cls = value != null ? value.getClass() : String.class;
                    Object obj = hashMap.get(str);
                    l.e(str, "key");
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (l.a(cls2, cls)) {
                            l.e(value, "value");
                            value = c(obj, value);
                        } else if (l.a(cls2.getComponentType(), cls)) {
                            value = b(obj, value, cls);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (!cls.isArray()) {
                        value = d(value, cls);
                    }
                    l.e(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        aVar.d(hashMap);
        b a10 = aVar.a();
        l.e(a10, "output.build()");
        return a10;
    }
}
