package rl;

import cm.l;
import java.util.Arrays;
import java.util.List;

public abstract class c {
    public static final Object[] d(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final Object[] e(Object[] objArr, int i10) {
        l.f(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i10);
        l.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final void f(Object[] objArr, int i10) {
        l.f(objArr, "<this>");
        objArr[i10] = null;
    }

    public static final void g(Object[] objArr, int i10, int i11) {
        l.f(objArr, "<this>");
        while (i10 < i11) {
            f(objArr, i10);
            i10++;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean h(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!l.a(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final int i(Object[] objArr, int i10, int i11) {
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i10 + i13];
            i12 = (i12 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i12;
    }

    /* access modifiers changed from: private */
    public static final String j(Object[] objArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(objArr[i10 + i12]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }
}
