package e4;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class i0 extends AbstractCollection implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f10063e = new Object[0];

    i0() {
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract int l(Object[] objArr, int i10);

    /* access modifiers changed from: package-private */
    public abstract int n();

    /* access modifiers changed from: package-private */
    public abstract int o();

    public abstract l0 r();

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean s();

    public final Object[] toArray() {
        return toArray(f10063e);
    }

    /* access modifiers changed from: package-private */
    public abstract Object[] v();

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] v10 = v();
            if (v10 != null) {
                return Arrays.copyOfRange(v10, o(), n(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        l(objArr, 0);
        return objArr;
    }
}
