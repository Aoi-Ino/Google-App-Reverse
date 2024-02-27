package ql;

import cm.l;
import java.lang.reflect.Array;

abstract class j {
    public static final Object[] a(Object[] objArr, int i10) {
        l.f(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
        l.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    public static final void b(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
        }
    }
}
