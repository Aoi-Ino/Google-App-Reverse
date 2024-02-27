package k7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class h extends AbstractMap implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private static final Comparator f13057m = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Comparator f13058e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f13059f;

    /* renamed from: g  reason: collision with root package name */
    e f13060g;

    /* renamed from: h  reason: collision with root package name */
    int f13061h;

    /* renamed from: i  reason: collision with root package name */
    int f13062i;

    /* renamed from: j  reason: collision with root package name */
    final e f13063j;

    /* renamed from: k  reason: collision with root package name */
    private b f13064k;

    /* renamed from: l  reason: collision with root package name */
    private c f13065l;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        public Iterator iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            e c10;
            if (!(obj instanceof Map.Entry) || (c10 = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(c10, true);
            return true;
        }

        public int size() {
            return h.this.f13061h;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            public Object next() {
                return a().f13079j;
            }
        }

        c() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        public Iterator iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        public int size() {
            return h.this.f13061h;
        }
    }

    private abstract class d implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        e f13070e;

        /* renamed from: f  reason: collision with root package name */
        e f13071f = null;

        /* renamed from: g  reason: collision with root package name */
        int f13072g;

        d() {
            this.f13070e = h.this.f13063j.f13077h;
            this.f13072g = h.this.f13062i;
        }

        /* access modifiers changed from: package-private */
        public final e a() {
            e eVar = this.f13070e;
            h hVar = h.this;
            if (eVar == hVar.f13063j) {
                throw new NoSuchElementException();
            } else if (hVar.f13062i == this.f13072g) {
                this.f13070e = eVar.f13077h;
                this.f13071f = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f13070e != h.this.f13063j;
        }

        public final void remove() {
            e eVar = this.f13071f;
            if (eVar != null) {
                h.this.f(eVar, true);
                this.f13071f = null;
                this.f13072g = h.this.f13062i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static final class e implements Map.Entry {

        /* renamed from: e  reason: collision with root package name */
        e f13074e;

        /* renamed from: f  reason: collision with root package name */
        e f13075f;

        /* renamed from: g  reason: collision with root package name */
        e f13076g;

        /* renamed from: h  reason: collision with root package name */
        e f13077h;

        /* renamed from: i  reason: collision with root package name */
        e f13078i;

        /* renamed from: j  reason: collision with root package name */
        final Object f13079j;

        /* renamed from: k  reason: collision with root package name */
        final boolean f13080k;

        /* renamed from: l  reason: collision with root package name */
        Object f13081l;

        /* renamed from: m  reason: collision with root package name */
        int f13082m;

        e(boolean z10) {
            this.f13079j = null;
            this.f13080k = z10;
            this.f13078i = this;
            this.f13077h = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f13075f; eVar2 != null; eVar2 = eVar2.f13075f) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f13076g; eVar2 != null; eVar2 = eVar2.f13076g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r3.f13079j
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                java.lang.Object r0 = r3.f13081l
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k7.h.e.equals(java.lang.Object):boolean");
        }

        public Object getKey() {
            return this.f13079j;
        }

        public Object getValue() {
            return this.f13081l;
        }

        public int hashCode() {
            Object obj = this.f13079j;
            int i10 = 0;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f13081l;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            return hashCode ^ i10;
        }

        public Object setValue(Object obj) {
            if (obj != null || this.f13080k) {
                Object obj2 = this.f13081l;
                this.f13081l = obj;
                return obj2;
            }
            throw new NullPointerException("value == null");
        }

        public String toString() {
            return this.f13079j + "=" + this.f13081l;
        }

        e(boolean z10, e eVar, Object obj, e eVar2, e eVar3) {
            this.f13074e = eVar;
            this.f13079j = obj;
            this.f13080k = z10;
            this.f13082m = 1;
            this.f13077h = eVar2;
            this.f13078i = eVar3;
            eVar3.f13077h = this;
            eVar2.f13078i = this;
        }
    }

    public h() {
        this(f13057m, true);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e eVar, boolean z10) {
        while (eVar != null) {
            e eVar2 = eVar.f13075f;
            e eVar3 = eVar.f13076g;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.f13082m : 0;
            int i12 = eVar3 != null ? eVar3.f13082m : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e eVar4 = eVar3.f13075f;
                e eVar5 = eVar3.f13076g;
                int i14 = eVar5 != null ? eVar5.f13082m : 0;
                if (eVar4 != null) {
                    i10 = eVar4.f13082m;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    j(eVar3);
                }
                i(eVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                e eVar6 = eVar2.f13075f;
                e eVar7 = eVar2.f13076g;
                int i16 = eVar7 != null ? eVar7.f13082m : 0;
                if (eVar6 != null) {
                    i10 = eVar6.f13082m;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    i(eVar2);
                }
                j(eVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f13082m = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f13082m = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f13074e;
        }
    }

    private void h(e eVar, e eVar2) {
        e eVar3 = eVar.f13074e;
        eVar.f13074e = null;
        if (eVar2 != null) {
            eVar2.f13074e = eVar3;
        }
        if (eVar3 == null) {
            this.f13060g = eVar2;
        } else if (eVar3.f13075f == eVar) {
            eVar3.f13075f = eVar2;
        } else {
            eVar3.f13076g = eVar2;
        }
    }

    private void i(e eVar) {
        e eVar2 = eVar.f13075f;
        e eVar3 = eVar.f13076g;
        e eVar4 = eVar3.f13075f;
        e eVar5 = eVar3.f13076g;
        eVar.f13076g = eVar4;
        if (eVar4 != null) {
            eVar4.f13074e = eVar;
        }
        h(eVar, eVar3);
        eVar3.f13075f = eVar;
        eVar.f13074e = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f13082m : 0, eVar4 != null ? eVar4.f13082m : 0) + 1;
        eVar.f13082m = max;
        if (eVar5 != null) {
            i10 = eVar5.f13082m;
        }
        eVar3.f13082m = Math.max(max, i10) + 1;
    }

    private void j(e eVar) {
        e eVar2 = eVar.f13075f;
        e eVar3 = eVar.f13076g;
        e eVar4 = eVar2.f13075f;
        e eVar5 = eVar2.f13076g;
        eVar.f13075f = eVar5;
        if (eVar5 != null) {
            eVar5.f13074e = eVar;
        }
        h(eVar, eVar2);
        eVar2.f13076g = eVar;
        eVar.f13074e = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f13082m : 0, eVar5 != null ? eVar5.f13082m : 0) + 1;
        eVar.f13082m = max;
        if (eVar4 != null) {
            i10 = eVar4.f13082m;
        }
        eVar2.f13082m = Math.max(max, i10) + 1;
    }

    /* access modifiers changed from: package-private */
    public e b(Object obj, boolean z10) {
        int i10;
        e eVar;
        Comparator comparator = this.f13058e;
        e eVar2 = this.f13060g;
        if (eVar2 != null) {
            Comparable comparable = comparator == f13057m ? (Comparable) obj : null;
            while (true) {
                Object obj2 = eVar2.f13079j;
                i10 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i10 == 0) {
                    return eVar2;
                }
                e eVar3 = i10 < 0 ? eVar2.f13075f : eVar2.f13076g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e eVar4 = this.f13063j;
        if (eVar2 != null) {
            eVar = new e(this.f13059f, eVar2, obj, eVar4, eVar4.f13078i);
            if (i10 < 0) {
                eVar2.f13075f = eVar;
            } else {
                eVar2.f13076g = eVar;
            }
            e(eVar2, true);
        } else if (comparator != f13057m || (obj instanceof Comparable)) {
            eVar = new e(this.f13059f, eVar2, obj, eVar4, eVar4.f13078i);
            this.f13060g = eVar;
        } else {
            throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
        }
        this.f13061h++;
        this.f13062i++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public e c(Map.Entry entry) {
        e d10 = d(entry.getKey());
        if (d10 == null || !a(d10.f13081l, entry.getValue())) {
            return null;
        }
        return d10;
    }

    public void clear() {
        this.f13060g = null;
        this.f13061h = 0;
        this.f13062i++;
        e eVar = this.f13063j;
        eVar.f13078i = eVar;
        eVar.f13077h = eVar;
    }

    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public e d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set entrySet() {
        b bVar = this.f13064k;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f13064k = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public void f(e eVar, boolean z10) {
        int i10;
        if (z10) {
            e eVar2 = eVar.f13078i;
            eVar2.f13077h = eVar.f13077h;
            eVar.f13077h.f13078i = eVar2;
        }
        e eVar3 = eVar.f13075f;
        e eVar4 = eVar.f13076g;
        e eVar5 = eVar.f13074e;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f13075f = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f13076g = null;
            } else {
                h(eVar, (e) null);
            }
            e(eVar5, false);
            this.f13061h--;
            this.f13062i++;
            return;
        }
        e b10 = eVar3.f13082m > eVar4.f13082m ? eVar3.b() : eVar4.a();
        f(b10, false);
        e eVar6 = eVar.f13075f;
        if (eVar6 != null) {
            i10 = eVar6.f13082m;
            b10.f13075f = eVar6;
            eVar6.f13074e = b10;
            eVar.f13075f = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f13076g;
        if (eVar7 != null) {
            i11 = eVar7.f13082m;
            b10.f13076g = eVar7;
            eVar7.f13074e = b10;
            eVar.f13076g = null;
        }
        b10.f13082m = Math.max(i10, i11) + 1;
        h(eVar, b10);
    }

    /* access modifiers changed from: package-private */
    public e g(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    public Object get(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            return d10.f13081l;
        }
        return null;
    }

    public Set keySet() {
        c cVar = this.f13065l;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f13065l = cVar2;
        return cVar2;
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        } else if (obj2 != null || this.f13059f) {
            e b10 = b(obj, true);
            Object obj3 = b10.f13081l;
            b10.f13081l = obj2;
            return obj3;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public Object remove(Object obj) {
        e g10 = g(obj);
        if (g10 != null) {
            return g10.f13081l;
        }
        return null;
    }

    public int size() {
        return this.f13061h;
    }

    public h(Comparator comparator, boolean z10) {
        this.f13061h = 0;
        this.f13062i = 0;
        this.f13058e = comparator == null ? f13057m : comparator;
        this.f13059f = z10;
        this.f13063j = new e(z10);
    }

    public h(boolean z10) {
        this(f13057m, z10);
    }
}
