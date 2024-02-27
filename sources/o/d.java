package o;

public class d implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    private static final Object f14272i = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f14273e;

    /* renamed from: f  reason: collision with root package name */
    private long[] f14274f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f14275g;

    /* renamed from: h  reason: collision with root package name */
    private int f14276h;

    public d() {
        this(10);
    }

    private void c() {
        int i10 = this.f14276h;
        long[] jArr = this.f14274f;
        Object[] objArr = this.f14275g;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f14272i) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f14273e = false;
        this.f14276h = i11;
    }

    public void a() {
        int i10 = this.f14276h;
        Object[] objArr = this.f14275g;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f14276h = 0;
        this.f14273e = false;
    }

    /* renamed from: b */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f14274f = (long[]) this.f14274f.clone();
            dVar.f14275g = (Object[]) this.f14275g.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public Object d(long j10) {
        return e(j10, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f14275g[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(long r3, java.lang.Object r5) {
        /*
            r2 = this;
            long[] r0 = r2.f14274f
            int r1 = r2.f14276h
            int r3 = o.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f14275g
            r3 = r4[r3]
            java.lang.Object r4 = f14272i
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.e(long, java.lang.Object):java.lang.Object");
    }

    public int f(long j10) {
        if (this.f14273e) {
            c();
        }
        return c.b(this.f14274f, this.f14276h, j10);
    }

    public long g(int i10) {
        if (this.f14273e) {
            c();
        }
        return this.f14274f[i10];
    }

    public void h(long j10, Object obj) {
        int b10 = c.b(this.f14274f, this.f14276h, j10);
        if (b10 >= 0) {
            this.f14275g[b10] = obj;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f14276h;
        if (i10 < i11) {
            Object[] objArr = this.f14275g;
            if (objArr[i10] == f14272i) {
                this.f14274f[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f14273e && i11 >= this.f14274f.length) {
            c();
            i10 = ~c.b(this.f14274f, this.f14276h, j10);
        }
        int i12 = this.f14276h;
        if (i12 >= this.f14274f.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f14274f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f14275g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f14274f = jArr;
            this.f14275g = objArr2;
        }
        int i13 = this.f14276h;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f14274f;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f14275g;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f14276h - i10);
        }
        this.f14274f[i10] = j10;
        this.f14275g[i10] = obj;
        this.f14276h++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f14275g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f14274f
            int r1 = r2.f14276h
            int r3 = o.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f14275g
            r0 = r4[r3]
            java.lang.Object r1 = f14272i
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f14273e = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.i(long):void");
    }

    public void j(int i10) {
        Object[] objArr = this.f14275g;
        Object obj = objArr[i10];
        Object obj2 = f14272i;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f14273e = true;
        }
    }

    public int k() {
        if (this.f14273e) {
            c();
        }
        return this.f14276h;
    }

    public Object m(int i10) {
        if (this.f14273e) {
            c();
        }
        return this.f14275g[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14276h * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f14276h; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i10));
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

    public d(int i10) {
        this.f14273e = false;
        if (i10 == 0) {
            this.f14274f = c.f14270b;
            this.f14275g = c.f14271c;
            return;
        }
        int f10 = c.f(i10);
        this.f14274f = new long[f10];
        this.f14275g = new Object[f10];
    }
}
