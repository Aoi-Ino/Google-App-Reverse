package ql;

import bm.l;
import hm.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class m extends l {
    public static final Appendable A(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar) {
        cm.l.f(objArr, "<this>");
        cm.l.f(appendable, "buffer");
        cm.l.f(charSequence, "separator");
        cm.l.f(charSequence2, "prefix");
        cm.l.f(charSequence3, "postfix");
        cm.l.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            h.a(appendable, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String B(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar) {
        cm.l.f(objArr, "<this>");
        cm.l.f(charSequence, "separator");
        cm.l.f(charSequence2, "prefix");
        cm.l.f(charSequence3, "postfix");
        cm.l.f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) A(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        cm.l.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String C(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return B(objArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static char D(char[] cArr) {
        cm.l.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static Object E(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final Collection F(Object[] objArr, Collection collection) {
        cm.l.f(objArr, "<this>");
        cm.l.f(collection, "destination");
        for (Object add : objArr) {
            collection.add(add);
        }
        return collection;
    }

    public static List G(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? I(objArr) : p.d(objArr[0]);
        }
        return q.i();
    }

    public static List H(int[] iArr) {
        cm.l.f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List I(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        return new ArrayList(q.f(objArr));
    }

    public static final Set J(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? (Set) F(objArr, new LinkedHashSet(h0.d(objArr.length))) : p0.c(objArr[0]);
        }
        return q0.d();
    }

    public static final boolean t(Object[] objArr, Object obj) {
        cm.l.f(objArr, "<this>");
        return z(objArr, obj) >= 0;
    }

    public static List u(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        return (List) v(objArr, new ArrayList());
    }

    public static final Collection v(Object[] objArr, Collection collection) {
        cm.l.f(objArr, "<this>");
        cm.l.f(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static c w(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        return new c(0, x(objArr));
    }

    public static int x(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object y(Object[] objArr, int i10) {
        cm.l.f(objArr, "<this>");
        if (i10 < 0 || i10 > x(objArr)) {
            return null;
        }
        return objArr[i10];
    }

    public static final int z(Object[] objArr, Object obj) {
        cm.l.f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (cm.l.a(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
