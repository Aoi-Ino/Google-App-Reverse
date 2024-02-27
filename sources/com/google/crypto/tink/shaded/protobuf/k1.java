package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q1;
import java.util.Arrays;

public final class k1 {

    /* renamed from: f  reason: collision with root package name */
    private static final k1 f7120f = new k1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f7121a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f7122b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f7123c;

    /* renamed from: d  reason: collision with root package name */
    private int f7124d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7125e;

    private k1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10 = this.f7121a;
        int[] iArr = this.f7122b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f7122b = Arrays.copyOf(iArr, i11);
            this.f7123c = Arrays.copyOf(this.f7123c, i11);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static k1 e() {
        return f7120f;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    static k1 k(k1 k1Var, k1 k1Var2) {
        int i10 = k1Var.f7121a + k1Var2.f7121a;
        int[] copyOf = Arrays.copyOf(k1Var.f7122b, i10);
        System.arraycopy(k1Var2.f7122b, 0, copyOf, k1Var.f7121a, k1Var2.f7121a);
        Object[] copyOf2 = Arrays.copyOf(k1Var.f7123c, i10);
        System.arraycopy(k1Var2.f7123c, 0, copyOf2, k1Var.f7121a, k1Var2.f7121a);
        return new k1(i10, copyOf, copyOf2, true);
    }

    static k1 l() {
        return new k1();
    }

    private static void p(int i10, Object obj, q1 q1Var) {
        int a10 = p1.a(i10);
        int b10 = p1.b(i10);
        if (b10 == 0) {
            q1Var.d(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            q1Var.z(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            q1Var.v(a10, (h) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                q1Var.n(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(a0.d());
        } else if (q1Var.A() == q1.a.ASCENDING) {
            q1Var.j(a10);
            ((k1) obj).q(q1Var);
            q1Var.E(a10);
        } else {
            q1Var.E(a10);
            ((k1) obj).q(q1Var);
            q1Var.j(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f7125e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        int i10 = this.f7121a;
        return i10 == k1Var.f7121a && c(this.f7122b, k1Var.f7122b, i10) && d(this.f7123c, k1Var.f7123c, this.f7121a);
    }

    public int f() {
        int O;
        int i10 = this.f7124d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7121a; i12++) {
            int i13 = this.f7122b[i12];
            int a10 = p1.a(i13);
            int b10 = p1.b(i13);
            if (b10 == 0) {
                O = k.O(a10, ((Long) this.f7123c[i12]).longValue());
            } else if (b10 == 1) {
                O = k.n(a10, ((Long) this.f7123c[i12]).longValue());
            } else if (b10 == 2) {
                O = k.f(a10, (h) this.f7123c[i12]);
            } else if (b10 == 3) {
                O = (k.L(a10) * 2) + ((k1) this.f7123c[i12]).f();
            } else if (b10 == 5) {
                O = k.l(a10, ((Integer) this.f7123c[i12]).intValue());
            } else {
                throw new IllegalStateException(a0.d());
            }
            i11 += O;
        }
        this.f7124d = i11;
        return i11;
    }

    public int g() {
        int i10 = this.f7124d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7121a; i12++) {
            i11 += k.A(p1.a(this.f7122b[i12]), (h) this.f7123c[i12]);
        }
        this.f7124d = i11;
        return i11;
    }

    public int hashCode() {
        int i10 = this.f7121a;
        return ((((527 + i10) * 31) + h(this.f7122b, i10)) * 31) + i(this.f7123c, this.f7121a);
    }

    public void j() {
        this.f7125e = false;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f7121a; i11++) {
            q0.c(sb2, i10, String.valueOf(p1.a(this.f7122b[i11])), this.f7123c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f7122b;
        int i11 = this.f7121a;
        iArr[i11] = i10;
        this.f7123c[i11] = obj;
        this.f7121a = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public void o(q1 q1Var) {
        if (q1Var.A() == q1.a.DESCENDING) {
            for (int i10 = this.f7121a - 1; i10 >= 0; i10--) {
                q1Var.h(p1.a(this.f7122b[i10]), this.f7123c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f7121a; i11++) {
            q1Var.h(p1.a(this.f7122b[i11]), this.f7123c[i11]);
        }
    }

    public void q(q1 q1Var) {
        if (this.f7121a != 0) {
            if (q1Var.A() == q1.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f7121a; i10++) {
                    p(this.f7122b[i10], this.f7123c[i10], q1Var);
                }
                return;
            }
            for (int i11 = this.f7121a - 1; i11 >= 0; i11--) {
                p(this.f7122b[i11], this.f7123c[i11], q1Var);
            }
        }
    }

    private k1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7124d = -1;
        this.f7121a = i10;
        this.f7122b = iArr;
        this.f7123c = objArr;
        this.f7125e = z10;
    }
}
