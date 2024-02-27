package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b implements Collection, Set {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f14258i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final Object[] f14259j = new Object[0];

    /* renamed from: k  reason: collision with root package name */
    private static Object[] f14260k;

    /* renamed from: l  reason: collision with root package name */
    private static int f14261l;

    /* renamed from: m  reason: collision with root package name */
    private static Object[] f14262m;

    /* renamed from: n  reason: collision with root package name */
    private static int f14263n;

    /* renamed from: e  reason: collision with root package name */
    private int[] f14264e;

    /* renamed from: f  reason: collision with root package name */
    Object[] f14265f;

    /* renamed from: g  reason: collision with root package name */
    int f14266g;

    /* renamed from: h  reason: collision with root package name */
    private f f14267h;

    class a extends f {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i10, int i11) {
            return b.this.f14265f[i10];
        }

        /* access modifiers changed from: protected */
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.f14266g;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            b.this.y(i10);
        }

        /* access modifiers changed from: protected */
        public Object i(int i10, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void l(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f14262m;
                    if (objArr != null) {
                        this.f14265f = objArr;
                        f14262m = (Object[]) objArr[0];
                        this.f14264e = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f14263n--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f14260k;
                    if (objArr2 != null) {
                        this.f14265f = objArr2;
                        f14260k = (Object[]) objArr2[0];
                        this.f14264e = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f14261l--;
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f14264e = new int[i10];
        this.f14265f = new Object[i10];
    }

    private static void o(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f14263n < 10) {
                        objArr[0] = f14262m;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f14262m = objArr;
                        f14263n++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f14261l < 10) {
                        objArr[0] = f14260k;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f14260k = objArr;
                        f14261l++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private f r() {
        if (this.f14267h == null) {
            this.f14267h = new a();
        }
        return this.f14267h;
    }

    private int s(Object obj, int i10) {
        int i11 = this.f14266g;
        if (i11 == 0) {
            return -1;
        }
        int a10 = c.a(this.f14264e, i11, i10);
        if (a10 < 0 || obj.equals(this.f14265f[a10])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f14264e[i12] == i10) {
            if (obj.equals(this.f14265f[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f14264e[i13] == i10) {
            if (obj.equals(this.f14265f[i13])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    private int v() {
        int i10 = this.f14266g;
        if (i10 == 0) {
            return -1;
        }
        int a10 = c.a(this.f14264e, i10, 0);
        if (a10 < 0 || this.f14265f[a10] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f14264e[i11] == 0) {
            if (this.f14265f[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f14264e[i12] == 0) {
            if (this.f14265f[i12] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public Object B(int i10) {
        return this.f14265f[i10];
    }

    public boolean add(Object obj) {
        int i10;
        int i11;
        if (obj == null) {
            i11 = v();
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            i11 = s(obj, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f14266g;
        int[] iArr = this.f14264e;
        if (i13 >= iArr.length) {
            int i14 = 8;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 < 4) {
                i14 = 4;
            }
            Object[] objArr = this.f14265f;
            l(i14);
            int[] iArr2 = this.f14264e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f14265f, 0, objArr.length);
            }
            o(iArr, objArr, this.f14266g);
        }
        int i15 = this.f14266g;
        if (i12 < i15) {
            int[] iArr3 = this.f14264e;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f14265f;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f14266g - i12);
        }
        this.f14264e[i12] = i10;
        this.f14265f[i12] = obj;
        this.f14266g++;
        return true;
    }

    public boolean addAll(Collection collection) {
        n(this.f14266g + collection.size());
        boolean z10 = false;
        for (Object add : collection) {
            z10 |= add(add);
        }
        return z10;
    }

    public void clear() {
        int i10 = this.f14266g;
        if (i10 != 0) {
            o(this.f14264e, this.f14265f, i10);
            this.f14264e = f14258i;
            this.f14265f = f14259j;
            this.f14266g = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f14266g) {
                try {
                    if (!set.contains(B(i10))) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f14264e;
        int i10 = this.f14266g;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? v() : s(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f14266g <= 0;
    }

    public Iterator iterator() {
        return r().m().iterator();
    }

    public void n(int i10) {
        int[] iArr = this.f14264e;
        if (iArr.length < i10) {
            Object[] objArr = this.f14265f;
            l(i10);
            int i11 = this.f14266g;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f14264e, 0, i11);
                System.arraycopy(objArr, 0, this.f14265f, 0, this.f14266g);
            }
            o(iArr, objArr, this.f14266g);
        }
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        y(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public boolean retainAll(Collection collection) {
        boolean z10 = false;
        for (int i10 = this.f14266g - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f14265f[i10])) {
                y(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public int size() {
        return this.f14266g;
    }

    public Object[] toArray() {
        int i10 = this.f14266g;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f14265f, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14266g * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f14266g; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object B = B(i10);
            if (B != this) {
                sb2.append(B);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object y(int i10) {
        Object[] objArr = this.f14265f;
        Object obj = objArr[i10];
        int i11 = this.f14266g;
        if (i11 <= 1) {
            o(this.f14264e, objArr, i11);
            this.f14264e = f14258i;
            this.f14265f = f14259j;
            this.f14266g = 0;
        } else {
            int[] iArr = this.f14264e;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f14266g = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr2 = this.f14265f;
                    System.arraycopy(objArr2, i14, objArr2, i10, this.f14266g - i10);
                }
                this.f14265f[this.f14266g] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                l(i12);
                this.f14266g--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f14264e, 0, i10);
                    System.arraycopy(objArr, 0, this.f14265f, 0, i10);
                }
                int i15 = this.f14266g;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f14264e, i10, i15 - i10);
                    System.arraycopy(objArr, i16, this.f14265f, i10, this.f14266g - i10);
                }
            }
        }
        return obj;
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f14264e = f14258i;
            this.f14265f = f14259j;
        } else {
            l(i10);
        }
        this.f14266g = 0;
    }

    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f14266g) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f14266g);
        }
        System.arraycopy(this.f14265f, 0, objArr, 0, this.f14266g);
        int length = objArr.length;
        int i10 = this.f14266g;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
