package ql;

import cm.l;
import hm.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import jm.g;
import pl.t;

abstract class y extends x {

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f30801a;

        public a(Iterable iterable) {
            this.f30801a = iterable;
        }

        public Iterator iterator() {
            return this.f30801a.iterator();
        }
    }

    public static List A0(Iterable iterable, Iterable iterable2) {
        l.f(iterable, "<this>");
        l.f(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.s(iterable, 10), r.s(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(t.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static g O(Iterable iterable) {
        l.f(iterable, "<this>");
        return new a(iterable);
    }

    public static List P(Iterable iterable, int i10) {
        l.f(iterable, "<this>");
        return y0(iterable, i10, i10, true);
    }

    public static List Q(Iterable iterable, int i10, bm.l lVar) {
        l.f(iterable, "<this>");
        l.f(lVar, "transform");
        return z0(iterable, i10, i10, true, lVar);
    }

    public static boolean R(Iterable iterable, Object obj) {
        l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return X(iterable, obj) >= 0;
    }

    public static List S(List list, int i10) {
        l.f(list, "<this>");
        if (i10 >= 0) {
            return p0(list, f.b(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final Object T(Iterable iterable) {
        l.f(iterable, "<this>");
        if (iterable instanceof List) {
            return U((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object U(List list) {
        l.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object V(List list) {
        l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object W(List list, int i10) {
        l.f(list, "<this>");
        if (i10 < 0 || i10 > q.k(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final int X(Iterable iterable, Object obj) {
        l.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 < 0) {
                q.r();
            }
            if (l.a(obj, next)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int Y(List list, Object obj) {
        l.f(list, "<this>");
        return list.indexOf(obj);
    }

    public static Set Z(Iterable iterable, Iterable iterable2) {
        l.f(iterable, "<this>");
        l.f(iterable2, "other");
        Set w02 = w0(iterable);
        v.F(w02, iterable2);
        return w02;
    }

    public static final Appendable a0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bm.l lVar) {
        l.f(iterable, "<this>");
        l.f(appendable, "buffer");
        l.f(charSequence, "separator");
        l.f(charSequence2, "prefix");
        l.f(charSequence3, "postfix");
        l.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            h.a(appendable, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static /* synthetic */ Appendable b0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bm.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return a0(iterable, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final String c0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bm.l lVar) {
        l.f(iterable, "<this>");
        l.f(charSequence, "separator");
        l.f(charSequence2, "prefix");
        l.f(charSequence3, "postfix");
        l.f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) a0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String d0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, bm.l lVar, int i11, Object obj) {
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
        return c0(iterable, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static Object e0(List list) {
        l.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(q.k(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object f0(List list) {
        l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable g0(Iterable iterable) {
        l.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable h0(Iterable iterable) {
        l.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List i0(Collection collection, Iterable iterable) {
        l.f(collection, "<this>");
        l.f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = v.v(arrayList2, iterable);
        return arrayList2;
    }

    public static List j0(Collection collection, Object obj) {
        l.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List k0(Iterable iterable) {
        l.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return t0(iterable);
        }
        List u02 = u0(iterable);
        x.N(u02);
        return u02;
    }

    public static Object l0(Iterable iterable) {
        l.f(iterable, "<this>");
        if (iterable instanceof List) {
            return m0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object m0(List list) {
        l.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static List n0(List list, c cVar) {
        l.f(list, "<this>");
        l.f(cVar, "indices");
        return cVar.isEmpty() ? q.i() : t0(list.subList(cVar.B().intValue(), cVar.y().intValue() + 1));
    }

    public static List o0(Iterable iterable) {
        l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return t0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            l.s((Comparable[]) array);
            return l.c(array);
        }
        List u02 = u0(iterable);
        u.u(u02);
        return u02;
    }

    public static List p0(Iterable iterable, int i10) {
        l.f(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return q.i();
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return t0(iterable);
                }
                if (i10 == 1) {
                    return p.d(T(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (Object add : iterable) {
                arrayList.add(add);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return q.o(arrayList);
        }
    }

    public static List q0(List list, int i10) {
        l.f(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return q.i();
        } else {
            int size = list.size();
            if (i10 >= size) {
                return t0(list);
            }
            if (i10 == 1) {
                return p.d(e0(list));
            }
            ArrayList arrayList = new ArrayList(i10);
            if (list instanceof RandomAccess) {
                for (int i11 = size - i10; i11 < size; i11++) {
                    arrayList.add(list.get(i11));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i10);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static final Collection r0(Iterable iterable, Collection collection) {
        l.f(iterable, "<this>");
        l.f(collection, "destination");
        for (Object add : iterable) {
            collection.add(add);
        }
        return collection;
    }

    public static int[] s0(Collection collection) {
        l.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List t0(Iterable iterable) {
        l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return q.o(u0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return q.i();
        }
        if (size != 1) {
            return v0(collection);
        }
        return p.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List u0(Iterable iterable) {
        l.f(iterable, "<this>");
        return iterable instanceof Collection ? v0((Collection) iterable) : (List) r0(iterable, new ArrayList());
    }

    public static List v0(Collection collection) {
        l.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set w0(Iterable iterable) {
        l.f(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) r0(iterable, new LinkedHashSet());
    }

    public static Set x0(Iterable iterable) {
        l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return q0.f((Set) r0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return q0.d();
        }
        if (size != 1) {
            return (Set) r0(iterable, new LinkedHashSet(h0.d(collection.size())));
        }
        return p0.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List y0(Iterable iterable, int i10, int i11, boolean z10) {
        l.f(iterable, "<this>");
        s0.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b10 = s0.b(iterable.iterator(), i10, i11, z10, false);
            while (b10.hasNext()) {
                arrayList.add((List) b10.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int d10 = f.d(i10, size - i12);
            if (d10 < i10 && !z10) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(d10);
            for (int i13 = 0; i13 < d10; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static final List z0(Iterable iterable, int i10, int i11, boolean z10, bm.l lVar) {
        l.f(iterable, "<this>");
        l.f(lVar, "transform");
        s0.a(i10, i11);
        int i12 = 1;
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b10 = s0.b(iterable.iterator(), i10, i11, z10, true);
            while (b10.hasNext()) {
                arrayList.add(lVar.invoke((List) b10.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i13 = size / i11;
        int i14 = 0;
        if (size % i11 == 0) {
            i12 = 0;
        }
        ArrayList arrayList2 = new ArrayList(i13 + i12);
        l0 l0Var = new l0(list);
        while (i14 >= 0 && i14 < size) {
            int d10 = f.d(i10, size - i14);
            if (!z10 && d10 < i10) {
                break;
            }
            l0Var.n(i14, d10 + i14);
            arrayList2.add(lVar.invoke(l0Var));
            i14 += i11;
        }
        return arrayList2;
    }
}
