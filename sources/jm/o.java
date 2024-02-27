package jm;

import bm.l;
import cm.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

abstract class o extends n {

    public static final class a implements Iterable, dm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f24653e;

        public a(g gVar) {
            this.f24653e = gVar;
        }

        public Iterator iterator() {
            return this.f24653e.iterator();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f24654e = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    public static Iterable e(g gVar) {
        cm.l.f(gVar, "<this>");
        return new a(gVar);
    }

    public static boolean f(g gVar, Object obj) {
        cm.l.f(gVar, "<this>");
        return k(gVar, obj) >= 0;
    }

    public static g g(g gVar, int i10) {
        cm.l.f(gVar, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return gVar;
        } else {
            return gVar instanceof c ? ((c) gVar).a(i10) : new b(gVar, i10);
        }
    }

    public static final g h(g gVar, l lVar) {
        cm.l.f(gVar, "<this>");
        cm.l.f(lVar, "predicate");
        return new e(gVar, false, lVar);
    }

    public static g i(g gVar) {
        cm.l.f(gVar, "<this>");
        g h10 = h(gVar, b.f24654e);
        cm.l.d(h10, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return h10;
    }

    public static Object j(g gVar) {
        cm.l.f(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final int k(g gVar, Object obj) {
        cm.l.f(gVar, "<this>");
        int i10 = 0;
        for (Object next : gVar) {
            if (i10 < 0) {
                q.r();
            }
            if (cm.l.a(obj, next)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable l(g gVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar) {
        cm.l.f(gVar, "<this>");
        cm.l.f(appendable, "buffer");
        cm.l.f(charSequence, "separator");
        cm.l.f(charSequence2, "prefix");
        cm.l.f(charSequence3, "postfix");
        cm.l.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object next : gVar) {
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

    public static final String m(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar) {
        cm.l.f(gVar, "<this>");
        cm.l.f(charSequence, "separator");
        cm.l.f(charSequence2, "prefix");
        cm.l.f(charSequence3, "postfix");
        cm.l.f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) l(gVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        cm.l.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String n(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
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
        return m(gVar, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static Object o(g gVar) {
        Object next;
        cm.l.f(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static g p(g gVar, l lVar) {
        cm.l.f(gVar, "<this>");
        cm.l.f(lVar, "transform");
        return new q(gVar, lVar);
    }

    public static g q(g gVar, l lVar) {
        cm.l.f(gVar, "<this>");
        cm.l.f(lVar, "transform");
        return i(new q(gVar, lVar));
    }

    public static g r(g gVar, l lVar) {
        cm.l.f(gVar, "<this>");
        cm.l.f(lVar, "predicate");
        return new p(gVar, lVar);
    }

    public static List s(g gVar) {
        cm.l.f(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return q.i();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return p.d(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
