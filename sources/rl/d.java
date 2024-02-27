package rl;

import cm.g;
import cm.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import ql.e0;

public final class d implements Map, Serializable, dm.d {

    /* renamed from: q  reason: collision with root package name */
    public static final a f31125q = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final d f31126r;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Object[] f31127e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Object[] f31128f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int[] f31129g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f31130h;

    /* renamed from: i  reason: collision with root package name */
    private int f31131i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f31132j;

    /* renamed from: k  reason: collision with root package name */
    private int f31133k;

    /* renamed from: l  reason: collision with root package name */
    private int f31134l;

    /* renamed from: m  reason: collision with root package name */
    private f f31135m;

    /* renamed from: n  reason: collision with root package name */
    private g f31136n;

    /* renamed from: o  reason: collision with root package name */
    private e f31137o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f31138p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(f.b(i10, 1) * 3);
        }

        /* access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f31126r;
        }
    }

    public static final class b extends C0346d implements Iterator, dm.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(dVar);
            l.f(dVar, "map");
        }

        /* renamed from: h */
        public c next() {
            if (a() < d().f31132j) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                c cVar = new c(d(), b());
                e();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void i(StringBuilder sb2) {
            l.f(sb2, "sb");
            if (a() < d().f31132j) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                Object obj = d().f31127e[b()];
                if (l.a(obj, d())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] f10 = d().f31128f;
                l.c(f10);
                Object obj2 = f10[b()];
                if (l.a(obj2, d())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                e();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int j() {
            if (a() < d().f31132j) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                Object obj = d().f31127e[b()];
                int i10 = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] f10 = d().f31128f;
                l.c(f10);
                Object obj2 = f10[b()];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                int i11 = hashCode ^ i10;
                e();
                return i11;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class c implements Map.Entry, dm.a {

        /* renamed from: e  reason: collision with root package name */
        private final d f31139e;

        /* renamed from: f  reason: collision with root package name */
        private final int f31140f;

        public c(d dVar, int i10) {
            l.f(dVar, "map");
            this.f31139e = dVar;
            this.f31140f = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
            }
        }

        public Object getKey() {
            return this.f31139e.f31127e[this.f31140f];
        }

        public Object getValue() {
            Object[] f10 = this.f31139e.f31128f;
            l.c(f10);
            return f10[this.f31140f];
        }

        public int hashCode() {
            Object key = getKey();
            int i10 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i10 = value.hashCode();
            }
            return hashCode ^ i10;
        }

        public Object setValue(Object obj) {
            this.f31139e.k();
            Object[] a10 = this.f31139e.i();
            int i10 = this.f31140f;
            Object obj2 = a10[i10];
            a10[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: rl.d$d  reason: collision with other inner class name */
    public static class C0346d {

        /* renamed from: e  reason: collision with root package name */
        private final d f31141e;

        /* renamed from: f  reason: collision with root package name */
        private int f31142f;

        /* renamed from: g  reason: collision with root package name */
        private int f31143g = -1;

        public C0346d(d dVar) {
            l.f(dVar, "map");
            this.f31141e = dVar;
            e();
        }

        public final int a() {
            return this.f31142f;
        }

        public final int b() {
            return this.f31143g;
        }

        public final d d() {
            return this.f31141e;
        }

        public final void e() {
            while (this.f31142f < this.f31141e.f31132j) {
                int[] e10 = this.f31141e.f31129g;
                int i10 = this.f31142f;
                if (e10[i10] < 0) {
                    this.f31142f = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public final void f(int i10) {
            this.f31142f = i10;
        }

        public final void g(int i10) {
            this.f31143g = i10;
        }

        public final boolean hasNext() {
            return this.f31142f < this.f31141e.f31132j;
        }

        public final void remove() {
            if (this.f31143g != -1) {
                this.f31141e.k();
                this.f31141e.J(this.f31143g);
                this.f31143g = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    public static final class e extends C0346d implements Iterator, dm.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(dVar);
            l.f(dVar, "map");
        }

        public Object next() {
            if (a() < d().f31132j) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                Object obj = d().f31127e[b()];
                e();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class f extends C0346d implements Iterator, dm.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(d dVar) {
            super(dVar);
            l.f(dVar, "map");
        }

        public Object next() {
            if (a() < d().f31132j) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                Object[] f10 = d().f31128f;
                l.c(f10);
                Object obj = f10[b()];
                e();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        d dVar = new d(0);
        dVar.f31138p = true;
        f31126r = dVar;
    }

    public d() {
        this(8);
    }

    private final int A(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * -1640531527) >>> this.f31133k;
    }

    private final boolean C(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        q(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (D((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean D(Map.Entry entry) {
        int h10 = h(entry.getKey());
        Object[] i10 = i();
        if (h10 >= 0) {
            i10[h10] = entry.getValue();
            return true;
        }
        int i11 = (-h10) - 1;
        if (l.a(entry.getValue(), i10[i11])) {
            return false;
        }
        i10[i11] = entry.getValue();
        return true;
    }

    private final boolean E(int i10) {
        int A = A(this.f31127e[i10]);
        int i11 = this.f31131i;
        while (true) {
            int[] iArr = this.f31130h;
            if (iArr[A] == 0) {
                iArr[A] = i10 + 1;
                this.f31129g[i10] = A;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            A = A == 0 ? w() - 1 : A - 1;
        }
    }

    private final void F(int i10) {
        if (this.f31132j > size()) {
            l();
        }
        int i11 = 0;
        if (i10 != w()) {
            this.f31130h = new int[i10];
            this.f31133k = f31125q.d(i10);
        } else {
            l.j(this.f31130h, 0, 0, w());
        }
        while (i11 < this.f31132j) {
            int i12 = i11 + 1;
            if (E(i11)) {
                i11 = i12;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void H(int i10) {
        int d10 = f.d(this.f31131i * 2, w() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? w() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f31131i) {
                this.f31130h[i12] = 0;
                return;
            }
            int[] iArr = this.f31130h;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((A(this.f31127e[i14]) - i10) & (w() - 1)) >= i11) {
                    this.f31130h[i12] = i13;
                    this.f31129g[i14] = i12;
                }
                d10--;
            }
            i12 = i10;
            i11 = 0;
            d10--;
        } while (d10 >= 0);
        this.f31130h[i12] = -1;
    }

    /* access modifiers changed from: private */
    public final void J(int i10) {
        c.f(this.f31127e, i10);
        H(this.f31129g[i10]);
        this.f31129g[i10] = -1;
        this.f31134l = size() - 1;
    }

    private final boolean L(int i10) {
        int u10 = u();
        int i11 = this.f31132j;
        int i12 = u10 - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= u() / 4;
    }

    /* access modifiers changed from: private */
    public final Object[] i() {
        Object[] objArr = this.f31128f;
        if (objArr != null) {
            return objArr;
        }
        Object[] d10 = c.d(u());
        this.f31128f = d10;
        return d10;
    }

    private final void l() {
        int i10;
        Object[] objArr = this.f31128f;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f31132j;
            if (i11 >= i10) {
                break;
            }
            if (this.f31129g[i11] >= 0) {
                Object[] objArr2 = this.f31127e;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                i12++;
            }
            i11++;
        }
        c.g(this.f31127e, i12, i10);
        if (objArr != null) {
            c.g(objArr, i12, this.f31132j);
        }
        this.f31132j = i12;
    }

    private final boolean o(Map map) {
        return size() == map.size() && m(map.entrySet());
    }

    private final void p(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        } else if (i10 > u()) {
            int u10 = (u() * 3) / 2;
            if (i10 <= u10) {
                i10 = u10;
            }
            this.f31127e = c.e(this.f31127e, i10);
            Object[] objArr = this.f31128f;
            this.f31128f = objArr != null ? c.e(objArr, i10) : null;
            int[] copyOf = Arrays.copyOf(this.f31129g, i10);
            l.e(copyOf, "copyOf(this, newSize)");
            this.f31129g = copyOf;
            int a10 = f31125q.c(i10);
            if (a10 > w()) {
                F(a10);
            }
        }
    }

    private final void q(int i10) {
        if (L(i10)) {
            F(w());
        } else {
            p(this.f31132j + i10);
        }
    }

    private final int s(Object obj) {
        int A = A(obj);
        int i10 = this.f31131i;
        while (true) {
            int i11 = this.f31130h[A];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (l.a(this.f31127e[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            A = A == 0 ? w() - 1 : A - 1;
        }
    }

    private final int t(Object obj) {
        int i10 = this.f31132j;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f31129g[i10] >= 0) {
                Object[] objArr = this.f31128f;
                l.c(objArr);
                if (l.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    private final int w() {
        return this.f31130h.length;
    }

    public final e B() {
        return new e(this);
    }

    public final boolean G(Map.Entry entry) {
        l.f(entry, "entry");
        k();
        int s10 = s(entry.getKey());
        if (s10 < 0) {
            return false;
        }
        Object[] objArr = this.f31128f;
        l.c(objArr);
        if (!l.a(objArr[s10], entry.getValue())) {
            return false;
        }
        J(s10);
        return true;
    }

    public final int I(Object obj) {
        k();
        int s10 = s(obj);
        if (s10 < 0) {
            return -1;
        }
        J(s10);
        return s10;
    }

    public final boolean K(Object obj) {
        k();
        int t10 = t(obj);
        if (t10 < 0) {
            return false;
        }
        J(t10);
        return true;
    }

    public final f M() {
        return new f(this);
    }

    public void clear() {
        k();
        e0 r10 = new hm.c(0, this.f31132j - 1).iterator();
        while (r10.hasNext()) {
            int a10 = r10.a();
            int[] iArr = this.f31129g;
            int i10 = iArr[a10];
            if (i10 >= 0) {
                this.f31130h[i10] = 0;
                iArr[a10] = -1;
            }
        }
        c.g(this.f31127e, 0, this.f31132j);
        Object[] objArr = this.f31128f;
        if (objArr != null) {
            c.g(objArr, 0, this.f31132j);
        }
        this.f31134l = 0;
        this.f31132j = 0;
    }

    public boolean containsKey(Object obj) {
        return s(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return t(obj) >= 0;
    }

    public final /* bridge */ Set entrySet() {
        return v();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && o((Map) obj));
    }

    public Object get(Object obj) {
        int s10 = s(obj);
        if (s10 < 0) {
            return null;
        }
        Object[] objArr = this.f31128f;
        l.c(objArr);
        return objArr[s10];
    }

    public final int h(Object obj) {
        k();
        while (true) {
            int A = A(obj);
            int d10 = f.d(this.f31131i * 2, w() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f31130h[A];
                if (i11 <= 0) {
                    if (this.f31132j >= u()) {
                        q(1);
                    } else {
                        int i12 = this.f31132j;
                        int i13 = i12 + 1;
                        this.f31132j = i13;
                        this.f31127e[i12] = obj;
                        this.f31129g[i12] = A;
                        this.f31130h[A] = i13;
                        this.f31134l = size() + 1;
                        if (i10 > this.f31131i) {
                            this.f31131i = i10;
                        }
                        return i12;
                    }
                } else if (l.a(this.f31127e[i11 - 1], obj)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > d10) {
                        F(w() * 2);
                        break;
                    }
                    A = A == 0 ? w() - 1 : A - 1;
                }
            }
        }
    }

    public int hashCode() {
        b r10 = r();
        int i10 = 0;
        while (r10.hasNext()) {
            i10 += r10.j();
        }
        return i10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final Map j() {
        k();
        this.f31138p = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f31126r;
        l.d(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void k() {
        if (this.f31138p) {
            throw new UnsupportedOperationException();
        }
    }

    public final /* bridge */ Set keySet() {
        return x();
    }

    public final boolean m(Collection collection) {
        l.f(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!n((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean n(Map.Entry entry) {
        l.f(entry, "entry");
        int s10 = s(entry.getKey());
        if (s10 < 0) {
            return false;
        }
        Object[] objArr = this.f31128f;
        l.c(objArr);
        return l.a(objArr[s10], entry.getValue());
    }

    public Object put(Object obj, Object obj2) {
        k();
        int h10 = h(obj);
        Object[] i10 = i();
        if (h10 < 0) {
            int i11 = (-h10) - 1;
            Object obj3 = i10[i11];
            i10[i11] = obj2;
            return obj3;
        }
        i10[h10] = obj2;
        return null;
    }

    public void putAll(Map map) {
        l.f(map, "from");
        k();
        C(map.entrySet());
    }

    public final b r() {
        return new b(this);
    }

    public Object remove(Object obj) {
        int I = I(obj);
        if (I < 0) {
            return null;
        }
        Object[] objArr = this.f31128f;
        l.c(objArr);
        Object obj2 = objArr[I];
        c.f(objArr, I);
        return obj2;
    }

    public final /* bridge */ int size() {
        return y();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b r10 = r();
        int i10 = 0;
        while (r10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            r10.i(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }

    public final int u() {
        return this.f31127e.length;
    }

    public Set v() {
        e eVar = this.f31137o;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f31137o = eVar2;
        return eVar2;
    }

    public final /* bridge */ Collection values() {
        return z();
    }

    public Set x() {
        f fVar = this.f31135m;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.f31135m = fVar2;
        return fVar2;
    }

    public int y() {
        return this.f31134l;
    }

    public Collection z() {
        g gVar = this.f31136n;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f31136n = gVar2;
        return gVar2;
    }

    public d(int i10) {
        this(c.d(i10), (Object[]) null, new int[i10], new int[f31125q.c(i10)], 2, 0);
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f31127e = objArr;
        this.f31128f = objArr2;
        this.f31129g = iArr;
        this.f31130h = iArr2;
        this.f31131i = i10;
        this.f31132j = i11;
        this.f31133k = f31125q.d(w());
    }
}
