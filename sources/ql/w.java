package ql;

import cm.l;
import hm.c;
import java.util.List;

abstract class w extends v {
    public static List J(List list) {
        l.f(list, "<this>");
        return new m0(list);
    }

    /* access modifiers changed from: private */
    public static final int K(List list, int i10) {
        if (new c(0, q.k(list)).v(i10)) {
            return q.k(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new c(0, q.k(list)) + "].");
    }

    /* access modifiers changed from: private */
    public static final int L(List list, int i10) {
        return q.k(list) - i10;
    }

    /* access modifiers changed from: private */
    public static final int M(List list, int i10) {
        if (new c(0, list.size()).v(i10)) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new c(0, list.size()) + "].");
    }
}
