package o;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g {

    /* renamed from: h  reason: collision with root package name */
    static Object[] f14300h;

    /* renamed from: i  reason: collision with root package name */
    static int f14301i;

    /* renamed from: j  reason: collision with root package name */
    static Object[] f14302j;

    /* renamed from: k  reason: collision with root package name */
    static int f14303k;

    /* renamed from: e  reason: collision with root package name */
    int[] f14304e;

    /* renamed from: f  reason: collision with root package name */
    Object[] f14305f;

    /* renamed from: g  reason: collision with root package name */
    int f14306g;

    public g() {
        this.f14304e = c.f14269a;
        this.f14305f = c.f14271c;
        this.f14306g = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                try {
                    Object[] objArr = f14302j;
                    if (objArr != null) {
                        this.f14305f = objArr;
                        f14302j = (Object[]) objArr[0];
                        this.f14304e = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f14303k--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                try {
                    Object[] objArr2 = f14300h;
                    if (objArr2 != null) {
                        this.f14305f = objArr2;
                        f14300h = (Object[]) objArr2[0];
                        this.f14304e = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f14301i--;
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f14304e = new int[i10];
        this.f14305f = new Object[(i10 << 1)];
    }

    private static int b(int[] iArr, int i10, int i11) {
        try {
            return c.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                try {
                    if (f14303k < 10) {
                        objArr[0] = f14302j;
                        objArr[1] = iArr;
                        for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f14302j = objArr;
                        f14303k++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                try {
                    if (f14301i < 10) {
                        objArr[0] = f14300h;
                        objArr[1] = iArr;
                        for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f14300h = objArr;
                        f14301i++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f14306g;
        int[] iArr = this.f14304e;
        if (iArr.length < i10) {
            Object[] objArr = this.f14305f;
            a(i10);
            if (this.f14306g > 0) {
                System.arraycopy(iArr, 0, this.f14304e, 0, i11);
                System.arraycopy(objArr, 0, this.f14305f, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f14306g != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f14306g;
        if (i10 > 0) {
            int[] iArr = this.f14304e;
            Object[] objArr = this.f14305f;
            this.f14304e = c.f14269a;
            this.f14305f = c.f14271c;
            this.f14306g = 0;
            d(iArr, objArr, i10);
        }
        if (this.f14306g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj, int i10) {
        int i11 = this.f14306g;
        if (i11 == 0) {
            return -1;
        }
        int b10 = b(this.f14304e, i11, i10);
        if (b10 < 0 || obj.equals(this.f14305f[b10 << 1])) {
            return b10;
        }
        int i12 = b10 + 1;
        while (i12 < i11 && this.f14304e[i12] == i10) {
            if (obj.equals(this.f14305f[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        int i13 = b10 - 1;
        while (i13 >= 0 && this.f14304e[i13] == i10) {
            if (obj.equals(this.f14305f[i13 << 1])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f14306g) {
                try {
                    Object i11 = i(i10);
                    Object m10 = m(i10);
                    Object obj2 = gVar.get(i11);
                    if (m10 == null) {
                        if (obj2 != null || !gVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!m10.equals(obj2)) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i12 = 0;
            while (i12 < this.f14306g) {
                try {
                    Object i13 = i(i12);
                    Object m11 = m(i12);
                    Object obj3 = map.get(i13);
                    if (m11 == null) {
                        if (obj3 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!m11.equals(obj3)) {
                        return false;
                    }
                    i12++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i10 = this.f14306g;
        if (i10 == 0) {
            return -1;
        }
        int b10 = b(this.f14304e, i10, 0);
        if (b10 < 0 || this.f14305f[b10 << 1] == null) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < i10 && this.f14304e[i11] == 0) {
            if (this.f14305f[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = b10 - 1;
        while (i12 >= 0 && this.f14304e[i12] == 0) {
            if (this.f14305f[i12 << 1] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f10 = f(obj);
        return f10 >= 0 ? this.f14305f[(f10 << 1) + 1] : obj2;
    }

    /* access modifiers changed from: package-private */
    public int h(Object obj) {
        int i10 = this.f14306g * 2;
        Object[] objArr = this.f14305f;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f14304e;
        Object[] objArr = this.f14305f;
        int i10 = this.f14306g;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public Object i(int i10) {
        return this.f14305f[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f14306g <= 0;
    }

    public void j(g gVar) {
        int i10 = gVar.f14306g;
        c(this.f14306g + i10);
        if (this.f14306g != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(gVar.i(i11), gVar.m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(gVar.f14304e, 0, this.f14304e, 0, i10);
            System.arraycopy(gVar.f14305f, 0, this.f14305f, 0, i10 << 1);
            this.f14306g = i10;
        }
    }

    public Object k(int i10) {
        Object[] objArr = this.f14305f;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f14306g;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f14304e, objArr, i12);
            this.f14304e = c.f14269a;
            this.f14305f = c.f14271c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f14304e;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr2 = this.f14305f;
                    System.arraycopy(objArr2, i16 << 1, objArr2, i11, i17 << 1);
                }
                Object[] objArr3 = this.f14305f;
                int i18 = i14 << 1;
                objArr3[i18] = null;
                objArr3[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.f14306g) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f14304e, 0, i10);
                        System.arraycopy(objArr, 0, this.f14305f, 0, i11);
                    }
                    if (i10 < i14) {
                        int i19 = i10 + 1;
                        int i20 = i14 - i10;
                        System.arraycopy(iArr, i19, this.f14304e, i10, i20);
                        System.arraycopy(objArr, i19 << 1, this.f14305f, i11, i20 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i13 = i14;
        }
        if (i12 == this.f14306g) {
            this.f14306g = i13;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object l(int i10, Object obj) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f14305f;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object m(int i10) {
        return this.f14305f[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12 = this.f14306g;
        if (obj == null) {
            i11 = g();
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            i11 = e(obj, hashCode);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            Object[] objArr = this.f14305f;
            Object obj3 = objArr[i13];
            objArr[i13] = obj2;
            return obj3;
        }
        int i14 = ~i11;
        int[] iArr = this.f14304e;
        if (i12 >= iArr.length) {
            int i15 = 8;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i15 = 4;
            }
            Object[] objArr2 = this.f14305f;
            a(i15);
            if (i12 == this.f14306g) {
                int[] iArr2 = this.f14304e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f14305f, 0, objArr2.length);
                }
                d(iArr, objArr2, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f14304e;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr3 = this.f14305f;
            System.arraycopy(objArr3, i14 << 1, objArr3, i16 << 1, (this.f14306g - i14) << 1);
        }
        int i17 = this.f14306g;
        if (i12 == i17) {
            int[] iArr4 = this.f14304e;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr4 = this.f14305f;
                int i18 = i14 << 1;
                objArr4[i18] = obj;
                objArr4[i18 + 1] = obj2;
                this.f14306g = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return k(f10);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return l(f10, obj2);
        }
        return null;
    }

    public int size() {
        return this.f14306g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14306g * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f14306g; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object i11 = i(i10);
            if (i11 != this) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object m10 = m(i10);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f14304e = c.f14269a;
            this.f14305f = c.f14271c;
        } else {
            a(i10);
        }
        this.f14306g = 0;
    }

    public boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        Object m10 = m(f10);
        if (obj2 != m10 && (obj2 == null || !obj2.equals(m10))) {
            return false;
        }
        k(f10);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        Object m10 = m(f10);
        if (m10 != obj2 && (obj2 == null || !obj2.equals(m10))) {
            return false;
        }
        l(f10, obj3);
        return true;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }
}
