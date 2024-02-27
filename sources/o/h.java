package o;

public class h implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    private static final Object f14307i = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f14308e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f14309f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f14310g;

    /* renamed from: h  reason: collision with root package name */
    private int f14311h;

    public h() {
        this(10);
    }

    private void d() {
        int i10 = this.f14311h;
        int[] iArr = this.f14309f;
        Object[] objArr = this.f14310g;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f14307i) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f14308e = false;
        this.f14311h = i11;
    }

    public void a(int i10, Object obj) {
        int i11 = this.f14311h;
        if (i11 == 0 || i10 > this.f14309f[i11 - 1]) {
            if (this.f14308e && i11 >= this.f14309f.length) {
                d();
            }
            int i12 = this.f14311h;
            if (i12 >= this.f14309f.length) {
                int e10 = c.e(i12 + 1);
                int[] iArr = new int[e10];
                Object[] objArr = new Object[e10];
                int[] iArr2 = this.f14309f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f14310g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f14309f = iArr;
                this.f14310g = objArr;
            }
            this.f14309f[i12] = i10;
            this.f14310g[i12] = obj;
            this.f14311h = i12 + 1;
            return;
        }
        k(i10, obj);
    }

    public void b() {
        int i10 = this.f14311h;
        Object[] objArr = this.f14310g;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f14311h = 0;
        this.f14308e = false;
    }

    /* renamed from: c */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f14309f = (int[]) this.f14309f.clone();
            hVar.f14310g = (Object[]) this.f14310g.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public Object e(int i10) {
        return f(i10, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f14310g[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(int r3, java.lang.Object r4) {
        /*
            r2 = this;
            int[] r0 = r2.f14309f
            int r1 = r2.f14311h
            int r3 = o.c.a(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f14310g
            r3 = r0[r3]
            java.lang.Object r0 = f14307i
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.f(int, java.lang.Object):java.lang.Object");
    }

    public int g(int i10) {
        if (this.f14308e) {
            d();
        }
        return c.a(this.f14309f, this.f14311h, i10);
    }

    public int h(Object obj) {
        if (this.f14308e) {
            d();
        }
        for (int i10 = 0; i10 < this.f14311h; i10++) {
            if (this.f14310g[i10] == obj) {
                return i10;
            }
        }
        return -1;
    }

    public boolean i() {
        return q() == 0;
    }

    public int j(int i10) {
        if (this.f14308e) {
            d();
        }
        return this.f14309f[i10];
    }

    public void k(int i10, Object obj) {
        int a10 = c.a(this.f14309f, this.f14311h, i10);
        if (a10 >= 0) {
            this.f14310g[a10] = obj;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f14311h;
        if (i11 < i12) {
            Object[] objArr = this.f14310g;
            if (objArr[i11] == f14307i) {
                this.f14309f[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f14308e && i12 >= this.f14309f.length) {
            d();
            i11 = ~c.a(this.f14309f, this.f14311h, i10);
        }
        int i13 = this.f14311h;
        if (i13 >= this.f14309f.length) {
            int e10 = c.e(i13 + 1);
            int[] iArr = new int[e10];
            Object[] objArr2 = new Object[e10];
            int[] iArr2 = this.f14309f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f14310g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f14309f = iArr;
            this.f14310g = objArr2;
        }
        int i14 = this.f14311h;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f14309f;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f14310g;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f14311h - i11);
        }
        this.f14309f[i11] = i10;
        this.f14310g[i11] = obj;
        this.f14311h++;
    }

    public void m(int i10) {
        Object[] objArr = this.f14310g;
        Object obj = objArr[i10];
        Object obj2 = f14307i;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f14308e = true;
        }
    }

    public Object p(int i10, Object obj) {
        int g10 = g(i10);
        if (g10 < 0) {
            return null;
        }
        Object[] objArr = this.f14310g;
        Object obj2 = objArr[g10];
        objArr[g10] = obj;
        return obj2;
    }

    public int q() {
        if (this.f14308e) {
            d();
        }
        return this.f14311h;
    }

    public Object r(int i10) {
        if (this.f14308e) {
            d();
        }
        return this.f14310g[i10];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14311h * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f14311h; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            Object r10 = r(i10);
            if (r10 != this) {
                sb2.append(r10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i10) {
        this.f14308e = false;
        if (i10 == 0) {
            this.f14309f = c.f14269a;
            this.f14310g = c.f14271c;
            return;
        }
        int e10 = c.e(i10);
        this.f14309f = new int[e10];
        this.f14310g = new Object[e10];
    }
}
