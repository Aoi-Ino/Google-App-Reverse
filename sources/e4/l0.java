package e4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class l0 extends i0 implements List, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    private static final o0 f10069f = new j0(m0.f10072i, 0);

    l0() {
    }

    static l0 B(Object[] objArr, int i10) {
        return i10 == 0 ? m0.f10072i : new m0(objArr, i10);
    }

    public static l0 E(Collection collection) {
        if (collection instanceof i0) {
            l0 r10 = ((i0) collection).r();
            if (!r10.s()) {
                return r10;
            }
            Object[] array = r10.toArray();
            return B(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i10 = 0;
        while (i10 < length) {
            if (array2[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException("at index " + i10);
            }
        }
        return B(array2, length);
    }

    public static l0 F() {
        return m0.f10072i;
    }

    /* renamed from: H */
    public final o0 listIterator(int i10) {
        f0.b(i10, size(), "index");
        return isEmpty() ? f10069f : new j0(this, i10);
    }

    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (e0.a(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!e0.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public int l(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public final l0 r() {
        return this;
    }

    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: y */
    public l0 subList(int i10, int i11) {
        f0.c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? m0.f10072i : new k0(this, i10, i12);
    }
}
