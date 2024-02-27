package rl;

import cm.g;
import cm.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import ql.c;
import ql.e;
import ql.h;

public final class b extends e implements RandomAccess, Serializable {

    /* renamed from: k  reason: collision with root package name */
    private static final a f31114k = new a((g) null);

    /* renamed from: l  reason: collision with root package name */
    private static final b f31115l;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Object[] f31116e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f31117f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f31118g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f31119h;

    /* renamed from: i  reason: collision with root package name */
    private final b f31120i;

    /* renamed from: j  reason: collision with root package name */
    private final b f31121j;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: rl.b$b  reason: collision with other inner class name */
    private static final class C0345b implements ListIterator, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private final b f31122e;

        /* renamed from: f  reason: collision with root package name */
        private int f31123f;

        /* renamed from: g  reason: collision with root package name */
        private int f31124g = -1;

        public C0345b(b bVar, int i10) {
            l.f(bVar, "list");
            this.f31122e = bVar;
            this.f31123f = i10;
        }

        public void add(Object obj) {
            b bVar = this.f31122e;
            int i10 = this.f31123f;
            this.f31123f = i10 + 1;
            bVar.add(i10, obj);
            this.f31124g = -1;
        }

        public boolean hasNext() {
            return this.f31123f < this.f31122e.f31118g;
        }

        public boolean hasPrevious() {
            return this.f31123f > 0;
        }

        public Object next() {
            if (this.f31123f < this.f31122e.f31118g) {
                int i10 = this.f31123f;
                this.f31123f = i10 + 1;
                this.f31124g = i10;
                return this.f31122e.f31116e[this.f31122e.f31117f + this.f31124g];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f31123f;
        }

        public Object previous() {
            int i10 = this.f31123f;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f31123f = i11;
                this.f31124g = i11;
                return this.f31122e.f31116e[this.f31122e.f31117f + this.f31124g];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f31123f - 1;
        }

        public void remove() {
            int i10 = this.f31124g;
            if (i10 != -1) {
                this.f31122e.remove(i10);
                this.f31123f = this.f31124g;
                this.f31124g = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(Object obj) {
            int i10 = this.f31124g;
            if (i10 != -1) {
                this.f31122e.set(i10, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        b bVar = new b(0);
        bVar.f31119h = true;
        f31115l = bVar;
    }

    public b() {
        this(10);
    }

    private final void E() {
        if (e0()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean F(List list) {
        return c.h(this.f31116e, this.f31117f, this.f31118g, list);
    }

    private final void H(int i10) {
        if (this.f31120i != null) {
            throw new IllegalStateException();
        } else if (i10 >= 0) {
            Object[] objArr = this.f31116e;
            if (i10 > objArr.length) {
                this.f31116e = c.e(this.f31116e, h.f30767h.a(objArr.length, i10));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    private final void T(int i10) {
        H(this.f31118g + i10);
    }

    private final void Y(int i10, int i11) {
        T(i11);
        Object[] objArr = this.f31116e;
        Object[] unused = l.e(objArr, objArr, i10 + i11, i10, this.f31117f + this.f31118g);
        this.f31118g += i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f31121j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean e0() {
        /*
            r1 = this;
            boolean r0 = r1.f31119h
            if (r0 != 0) goto L_0x000f
            rl.b r0 = r1.f31121j
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.f31119h
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rl.b.e0():boolean");
    }

    private final Object g0(int i10) {
        b bVar = this.f31120i;
        if (bVar != null) {
            this.f31118g--;
            return bVar.g0(i10);
        }
        Object[] objArr = this.f31116e;
        Object obj = objArr[i10];
        Object[] unused = l.e(objArr, objArr, i10, i10 + 1, this.f31117f + this.f31118g);
        c.f(this.f31116e, (this.f31117f + this.f31118g) - 1);
        this.f31118g--;
        return obj;
    }

    private final void h0(int i10, int i11) {
        b bVar = this.f31120i;
        if (bVar != null) {
            bVar.h0(i10, i11);
        } else {
            Object[] objArr = this.f31116e;
            Object[] unused = l.e(objArr, objArr, i10, i10 + i11, this.f31118g);
            Object[] objArr2 = this.f31116e;
            int i12 = this.f31118g;
            c.g(objArr2, i12 - i11, i12);
        }
        this.f31118g -= i11;
    }

    private final int i0(int i10, int i11, Collection collection, boolean z10) {
        b bVar = this.f31120i;
        if (bVar != null) {
            int i02 = bVar.i0(i10, i11, collection, z10);
            this.f31118g -= i02;
            return i02;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f31116e[i14]) == z10) {
                Object[] objArr = this.f31116e;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f31116e;
        Object[] unused = l.e(objArr2, objArr2, i10 + i13, i11 + i10, this.f31118g);
        Object[] objArr3 = this.f31116e;
        int i16 = this.f31118g;
        c.g(objArr3, i16 - i15, i16);
        this.f31118g -= i15;
        return i15;
    }

    private final void v(int i10, Collection collection, int i11) {
        b bVar = this.f31120i;
        if (bVar != null) {
            bVar.v(i10, collection, i11);
            this.f31116e = this.f31120i.f31116e;
            this.f31118g += i11;
            return;
        }
        Y(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f31116e[i10 + i12] = it.next();
        }
    }

    private final void y(int i10, Object obj) {
        b bVar = this.f31120i;
        if (bVar != null) {
            bVar.y(i10, obj);
            this.f31116e = this.f31120i.f31116e;
            this.f31118g++;
            return;
        }
        Y(i10, 1);
        this.f31116e[i10] = obj;
    }

    public final List B() {
        if (this.f31120i == null) {
            E();
            this.f31119h = true;
            return this.f31118g > 0 ? this : f31115l;
        }
        throw new IllegalStateException();
    }

    public void add(int i10, Object obj) {
        E();
        c.f30755e.b(i10, this.f31118g);
        y(this.f31117f + i10, obj);
    }

    public boolean addAll(int i10, Collection collection) {
        l.f(collection, "elements");
        E();
        c.f30755e.b(i10, this.f31118g);
        int size = collection.size();
        v(this.f31117f + i10, collection, size);
        return size > 0;
    }

    public void clear() {
        E();
        h0(this.f31117f, this.f31118g);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && F((List) obj));
    }

    public Object get(int i10) {
        c.f30755e.a(i10, this.f31118g);
        return this.f31116e[this.f31117f + i10];
    }

    public int hashCode() {
        return c.i(this.f31116e, this.f31117f, this.f31118g);
    }

    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f31118g; i10++) {
            if (l.a(this.f31116e[this.f31117f + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f31118g == 0;
    }

    public Iterator iterator() {
        return new C0345b(this, 0);
    }

    public int l() {
        return this.f31118g;
    }

    public int lastIndexOf(Object obj) {
        for (int i10 = this.f31118g - 1; i10 >= 0; i10--) {
            if (l.a(this.f31116e[this.f31117f + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C0345b(this, 0);
    }

    public Object n(int i10) {
        E();
        c.f30755e.a(i10, this.f31118g);
        return g0(this.f31117f + i10);
    }

    public boolean remove(Object obj) {
        E();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(Collection collection) {
        l.f(collection, "elements");
        E();
        return i0(this.f31117f, this.f31118g, collection, false) > 0;
    }

    public boolean retainAll(Collection collection) {
        l.f(collection, "elements");
        E();
        return i0(this.f31117f, this.f31118g, collection, true) > 0;
    }

    public Object set(int i10, Object obj) {
        E();
        c.f30755e.a(i10, this.f31118g);
        Object[] objArr = this.f31116e;
        int i11 = this.f31117f;
        Object obj2 = objArr[i11 + i10];
        objArr[i11 + i10] = obj;
        return obj2;
    }

    public List subList(int i10, int i11) {
        c.f30755e.c(i10, i11, this.f31118g);
        Object[] objArr = this.f31116e;
        int i12 = this.f31117f + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f31119h;
        b bVar = this.f31121j;
        return new b(objArr, i12, i13, z10, this, bVar == null ? this : bVar);
    }

    public Object[] toArray() {
        Object[] objArr = this.f31116e;
        int i10 = this.f31117f;
        return l.i(objArr, i10, this.f31118g + i10);
    }

    public String toString() {
        return c.j(this.f31116e, this.f31117f, this.f31118g);
    }

    public b(int i10) {
        this(c.d(i10), 0, 0, false, (b) null, (b) null);
    }

    public boolean add(Object obj) {
        E();
        y(this.f31117f + this.f31118g, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        l.f(collection, "elements");
        E();
        int size = collection.size();
        v(this.f31117f + this.f31118g, collection, size);
        return size > 0;
    }

    public ListIterator listIterator(int i10) {
        c.f30755e.b(i10, this.f31118g);
        return new C0345b(this, i10);
    }

    public Object[] toArray(Object[] objArr) {
        l.f(objArr, "destination");
        int length = objArr.length;
        int i10 = this.f31118g;
        if (length < i10) {
            Object[] objArr2 = this.f31116e;
            int i11 = this.f31117f;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i11, i10 + i11, objArr.getClass());
            l.e(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        Object[] objArr3 = this.f31116e;
        int i12 = this.f31117f;
        Object[] unused = l.e(objArr3, objArr, 0, i12, i10 + i12);
        int length2 = objArr.length;
        int i13 = this.f31118g;
        if (length2 > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }

    private b(Object[] objArr, int i10, int i11, boolean z10, b bVar, b bVar2) {
        this.f31116e = objArr;
        this.f31117f = i10;
        this.f31118g = i11;
        this.f31119h = z10;
        this.f31120i = bVar;
        this.f31121j = bVar2;
    }
}
