package n6;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import m6.c;

abstract class a {
    a() {
    }

    /* access modifiers changed from: package-private */
    public final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        c.a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
