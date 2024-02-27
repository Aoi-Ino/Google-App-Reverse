package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.b;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.q1;
import com.google.crypto.tink.shaded.protobuf.z;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class r0 implements d1 {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f7208r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f7209s = n1.B();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f7210a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f7211b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7212c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7213d;

    /* renamed from: e  reason: collision with root package name */
    private final o0 f7214e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7215f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f7216g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f7217h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7218i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f7219j;

    /* renamed from: k  reason: collision with root package name */
    private final int f7220k;

    /* renamed from: l  reason: collision with root package name */
    private final int f7221l;

    /* renamed from: m  reason: collision with root package name */
    private final t0 f7222m;

    /* renamed from: n  reason: collision with root package name */
    private final e0 f7223n;

    /* renamed from: o  reason: collision with root package name */
    private final j1 f7224o;

    /* renamed from: p  reason: collision with root package name */
    private final q f7225p;

    /* renamed from: q  reason: collision with root package name */
    private final j0 f7226q;

    private r0(int[] iArr, Object[] objArr, int i10, int i11, o0 o0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, t0 t0Var, e0 e0Var, j1 j1Var, q qVar, j0 j0Var) {
        this.f7210a = iArr;
        this.f7211b = objArr;
        this.f7212c = i10;
        this.f7213d = i11;
        this.f7216g = o0Var instanceof x;
        this.f7217h = z10;
        this.f7215f = qVar != null && qVar.e(o0Var);
        this.f7218i = z11;
        this.f7219j = iArr2;
        this.f7220k = i12;
        this.f7221l = i13;
        this.f7222m = t0Var;
        this.f7223n = e0Var;
        this.f7224o = j1Var;
        this.f7225p = qVar;
        this.f7214e = o0Var;
        this.f7226q = j0Var;
    }

    private boolean A(Object obj, int i10) {
        if (this.f7217h) {
            int q02 = q0(i10);
            long T = T(q02);
            switch (p0(q02)) {
                case 0:
                    return n1.v(obj, T) != 0.0d;
                case 1:
                    return n1.w(obj, T) != 0.0f;
                case 2:
                    return n1.y(obj, T) != 0;
                case 3:
                    return n1.y(obj, T) != 0;
                case 4:
                    return n1.x(obj, T) != 0;
                case 5:
                    return n1.y(obj, T) != 0;
                case 6:
                    return n1.x(obj, T) != 0;
                case 7:
                    return n1.p(obj, T);
                case 8:
                    Object A = n1.A(obj, T);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof h) {
                        return !h.f7078f.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return n1.A(obj, T) != null;
                case 10:
                    return !h.f7078f.equals(n1.A(obj, T));
                case 11:
                    return n1.x(obj, T) != 0;
                case 12:
                    return n1.x(obj, T) != 0;
                case 13:
                    return n1.x(obj, T) != 0;
                case 14:
                    return n1.y(obj, T) != 0;
                case 15:
                    return n1.x(obj, T) != 0;
                case 16:
                    return n1.y(obj, T) != 0;
                case 17:
                    return n1.A(obj, T) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int g02 = g0(i10);
            return (n1.x(obj, (long) (g02 & 1048575)) & (1 << (g02 >>> 20))) != 0;
        }
    }

    private boolean B(Object obj, int i10, int i11, int i12) {
        if (this.f7217h) {
            return A(obj, i10);
        }
        return (i11 & i12) != 0;
    }

    private static boolean C(Object obj, int i10, d1 d1Var) {
        return d1Var.f(n1.A(obj, T(i10)));
    }

    private boolean D(Object obj, int i10, int i11) {
        List list = (List) n1.A(obj, T(i10));
        if (list.isEmpty()) {
            return true;
        }
        d1 t10 = t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!t10.f(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean E(Object obj, int i10, int i11) {
        if (this.f7226q.g(n1.A(obj, T(i10))).isEmpty()) {
            return true;
        }
        this.f7226q.f(s(i11));
        throw null;
    }

    private boolean F(Object obj, Object obj2, int i10) {
        long g02 = (long) (g0(i10) & 1048575);
        return n1.x(obj, g02) == n1.x(obj2, g02);
    }

    private boolean G(Object obj, int i10, int i11) {
        return n1.x(obj, (long) (g0(i11) & 1048575)) == i10;
    }

    private static boolean H(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List I(Object obj, long j10) {
        return (List) n1.A(obj, j10);
    }

    private static long J(Object obj, long j10) {
        return n1.y(obj, j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d4, code lost:
        r13.x(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02e3, code lost:
        r13.E(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03d5, code lost:
        com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e9, code lost:
        m0(r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04e7, code lost:
        if (r10.q(r13) != false) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04ed, code lost:
        if (r13.A() == false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04ef, code lost:
        r11 = r9.f7220k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04f3, code lost:
        if (r11 < r9.f7221l) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04f5, code lost:
        r8 = p(r12, r9.f7219j[r11], r8, r10);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0500, code lost:
        if (r8 != null) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0502, code lost:
        r10.o(r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0506, code lost:
        if (r8 == null) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r8 = r10.f(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0511, code lost:
        if (r10.m(r8, r13) == false) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0513, code lost:
        r11 = r9.f7220k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0517, code lost:
        if (r11 < r9.f7221l) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0519, code lost:
        r8 = p(r12, r9.f7219j[r11], r8, r10);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0524, code lost:
        if (r8 != null) goto L_0x0526;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0526, code lost:
        r10.o(r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b7, code lost:
        n0(r12, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0219, code lost:
        r13.k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0228, code lost:
        r13.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0237, code lost:
        r13.G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0246, code lost:
        r13.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025b, code lost:
        r8 = com.google.crypto.tink.shaded.protobuf.f1.z(r1, r2, (com.google.crypto.tink.shaded.protobuf.z.c) null, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x026b, code lost:
        r13.m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027a, code lost:
        r13.n(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0289, code lost:
        r13.g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0298, code lost:
        r13.K(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a7, code lost:
        r13.L(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b6, code lost:
        r13.u(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c5, code lost:
        r13.F(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x04e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void K(com.google.crypto.tink.shaded.protobuf.j1 r10, com.google.crypto.tink.shaded.protobuf.q r11, java.lang.Object r12, com.google.crypto.tink.shaded.protobuf.c1 r13, com.google.crypto.tink.shaded.protobuf.p r14) {
        /*
            r9 = this;
            r0 = 0
            r8 = r0
        L_0x0002:
            int r1 = r13.r()     // Catch:{ all -> 0x0045 }
            int r4 = r9.e0(r1)     // Catch:{ all -> 0x0045 }
            if (r4 >= 0) goto L_0x007a
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0028
            int r11 = r9.f7220k
        L_0x0013:
            int r13 = r9.f7221l
            if (r11 >= r13) goto L_0x0022
            int[] r13 = r9.f7219j
            r13 = r13[r11]
            java.lang.Object r8 = r9.p(r12, r13, r8, r10)
            int r11 = r11 + 1
            goto L_0x0013
        L_0x0022:
            if (r8 == 0) goto L_0x0027
            r10.o(r12, r8)
        L_0x0027:
            return
        L_0x0028:
            boolean r2 = r9.f7215f     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x002e
            r3 = r0
            goto L_0x0035
        L_0x002e:
            com.google.crypto.tink.shaded.protobuf.o0 r2 = r9.f7214e     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r11.b(r14, r2, r1)     // Catch:{ all -> 0x0045 }
            r3 = r1
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            com.google.crypto.tink.shaded.protobuf.t r5 = r11.d(r12)     // Catch:{ all -> 0x0045 }
            r1 = r11
            r2 = r13
            r4 = r14
            r6 = r8
            r7 = r10
            java.lang.Object r8 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0045 }
            goto L_0x0002
        L_0x0045:
            r11 = move-exception
            goto L_0x052a
        L_0x0048:
            boolean r1 = r10.q(r13)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0055
            boolean r1 = r13.A()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0063
            goto L_0x0002
        L_0x0055:
            if (r8 != 0) goto L_0x005c
            java.lang.Object r1 = r10.f(r12)     // Catch:{ all -> 0x0045 }
            r8 = r1
        L_0x005c:
            boolean r1 = r10.m(r8, r13)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0063
            goto L_0x0002
        L_0x0063:
            int r11 = r9.f7220k
        L_0x0065:
            int r13 = r9.f7221l
            if (r11 >= r13) goto L_0x0074
            int[] r13 = r9.f7219j
            r13 = r13[r11]
            java.lang.Object r8 = r9.p(r12, r13, r8, r10)
            int r11 = r11 + 1
            goto L_0x0065
        L_0x0074:
            if (r8 == 0) goto L_0x0079
            r10.o(r12, r8)
        L_0x0079:
            return
        L_0x007a:
            int r3 = r9.q0(r4)     // Catch:{ all -> 0x0045 }
            int r2 = p0(r3)     // Catch:{ a -> 0x04e3 }
            switch(r2) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04c9;
                case 2: goto L_0x04bc;
                case 3: goto L_0x04af;
                case 4: goto L_0x04a2;
                case 5: goto L_0x0495;
                case 6: goto L_0x0488;
                case 7: goto L_0x047b;
                case 8: goto L_0x0476;
                case 9: goto L_0x0445;
                case 10: goto L_0x0439;
                case 11: goto L_0x042d;
                case 12: goto L_0x041e;
                case 13: goto L_0x0412;
                case 14: goto L_0x0406;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03b7;
                case 18: goto L_0x03ab;
                case 19: goto L_0x039f;
                case 20: goto L_0x0393;
                case 21: goto L_0x0387;
                case 22: goto L_0x037b;
                case 23: goto L_0x036f;
                case 24: goto L_0x0363;
                case 25: goto L_0x0357;
                case 26: goto L_0x0352;
                case 27: goto L_0x0345;
                case 28: goto L_0x0336;
                case 29: goto L_0x032a;
                case 30: goto L_0x0318;
                case 31: goto L_0x030c;
                case 32: goto L_0x0300;
                case 33: goto L_0x02f4;
                case 34: goto L_0x02e8;
                case 35: goto L_0x02d9;
                case 36: goto L_0x02ca;
                case 37: goto L_0x02bb;
                case 38: goto L_0x02ac;
                case 39: goto L_0x029d;
                case 40: goto L_0x028e;
                case 41: goto L_0x027f;
                case 42: goto L_0x0270;
                case 43: goto L_0x0261;
                case 44: goto L_0x024b;
                case 45: goto L_0x023c;
                case 46: goto L_0x022d;
                case 47: goto L_0x021e;
                case 48: goto L_0x020f;
                case 49: goto L_0x01fc;
                case 50: goto L_0x01ef;
                case 51: goto L_0x01de;
                case 52: goto L_0x01cd;
                case 53: goto L_0x01bc;
                case 54: goto L_0x01ab;
                case 55: goto L_0x019a;
                case 56: goto L_0x0189;
                case 57: goto L_0x0178;
                case 58: goto L_0x0167;
                case 59: goto L_0x0162;
                case 60: goto L_0x012b;
                case 61: goto L_0x011f;
                case 62: goto L_0x010f;
                case 63: goto L_0x00fc;
                case 64: goto L_0x00ec;
                case 65: goto L_0x00dc;
                case 66: goto L_0x00cc;
                case 67: goto L_0x00bc;
                case 68: goto L_0x00a8;
                default: goto L_0x0085;
            }     // Catch:{ a -> 0x04e3 }
        L_0x0085:
            if (r8 != 0) goto L_0x008b
            java.lang.Object r8 = r10.n()     // Catch:{ a -> 0x04e3 }
        L_0x008b:
            boolean r1 = r10.m(r8, r13)     // Catch:{ a -> 0x04e3 }
            if (r1 != 0) goto L_0x0002
            int r11 = r9.f7220k
        L_0x0093:
            int r13 = r9.f7221l
            if (r11 >= r13) goto L_0x00a2
            int[] r13 = r9.f7219j
            r13 = r13[r11]
            java.lang.Object r8 = r9.p(r12, r13, r8, r10)
            int r11 = r11 + 1
            goto L_0x0093
        L_0x00a2:
            if (r8 == 0) goto L_0x00a7
            r10.o(r12, r8)
        L_0x00a7:
            return
        L_0x00a8:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.d1 r5 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r5 = r13.a(r5, r14)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
        L_0x00b7:
            r9.n0(r12, r1, r4)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x00bc:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.l()     // Catch:{ a -> 0x04e3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x00cc:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r5 = r13.j()     // Catch:{ a -> 0x04e3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x00dc:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.t()     // Catch:{ a -> 0x04e3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x00ec:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r5 = r13.B()     // Catch:{ a -> 0x04e3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x00fc:
            int r2 = r13.c()     // Catch:{ a -> 0x04e3 }
            r9.r(r4)     // Catch:{ a -> 0x04e3 }
            long r5 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r5, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x010f:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r5 = r13.y()     // Catch:{ a -> 0x04e3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x011f:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.h r5 = r13.w()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x012b:
            boolean r2 = r9.G(r12, r1, r4)     // Catch:{ a -> 0x04e3 }
            if (r2 == 0) goto L_0x014e
            long r5 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.n1.A(r12, r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.d1 r5 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r5 = r13.d(r5, r14)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.z.h(r2, r5)     // Catch:{ a -> 0x04e3 }
            long r5 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r5, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x014e:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.d1 r5 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r5 = r13.d(r5, r14)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            r9.m0(r12, r4)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x0162:
            r9.j0(r12, r3, r13)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x0167:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            boolean r5 = r13.q()     // Catch:{ a -> 0x04e3 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x0178:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r5 = r13.p()     // Catch:{ a -> 0x04e3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x0189:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.h()     // Catch:{ a -> 0x04e3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x019a:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r5 = r13.z()     // Catch:{ a -> 0x04e3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x01ab:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.f()     // Catch:{ a -> 0x04e3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x01bc:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.I()     // Catch:{ a -> 0x04e3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x01cd:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            float r5 = r13.readFloat()     // Catch:{ a -> 0x04e3 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x01de:
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            double r5 = r13.readDouble()     // Catch:{ a -> 0x04e3 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x00b7
        L_0x01ef:
            java.lang.Object r5 = r9.s(r4)     // Catch:{ a -> 0x04e3 }
            r2 = r9
            r3 = r12
            r6 = r14
            r7 = r13
            r2.L(r3, r4, r5, r6, r7)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x01fc:
            long r5 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.d1 r7 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            r1 = r9
            r2 = r12
            r3 = r5
            r5 = r13
            r6 = r7
            r7 = r14
            r1.h0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x020f:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x0219:
            r13.k(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x021e:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x0228:
            r13.b(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x022d:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x0237:
            r13.G(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x023c:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x0246:
            r13.i(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x024b:
            com.google.crypto.tink.shaded.protobuf.e0 r2 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r5 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r2 = r2.e(r12, r5)     // Catch:{ a -> 0x04e3 }
            r13.M(r2)     // Catch:{ a -> 0x04e3 }
            r9.r(r4)     // Catch:{ a -> 0x04e3 }
        L_0x025b:
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.f1.z(r1, r2, r0, r8, r10)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x0261:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x026b:
            r13.m(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x0270:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x027a:
            r13.n(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x027f:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x0289:
            r13.g(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x028e:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x0298:
            r13.K(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x029d:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x02a7:
            r13.L(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x02ac:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x02b6:
            r13.u(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x02bb:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x02c5:
            r13.F(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x02ca:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x02d4:
            r13.x(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x02d9:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
        L_0x02e3:
            r13.E(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x02e8:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x0219
        L_0x02f4:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x0228
        L_0x0300:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x0237
        L_0x030c:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x0246
        L_0x0318:
            com.google.crypto.tink.shaded.protobuf.e0 r2 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r5 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r2 = r2.e(r12, r5)     // Catch:{ a -> 0x04e3 }
            r13.M(r2)     // Catch:{ a -> 0x04e3 }
            r9.r(r4)     // Catch:{ a -> 0x04e3 }
            goto L_0x025b
        L_0x032a:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x026b
        L_0x0336:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            r13.C(r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x0345:
            com.google.crypto.tink.shaded.protobuf.d1 r5 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            r1 = r9
            r2 = r12
            r4 = r13
            r6 = r14
            r1.i0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x0352:
            r9.k0(r12, r3, r13)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x0357:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x027a
        L_0x0363:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x0289
        L_0x036f:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x0298
        L_0x037b:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x02a7
        L_0x0387:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x02b6
        L_0x0393:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x02c5
        L_0x039f:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x02d4
        L_0x03ab:
            com.google.crypto.tink.shaded.protobuf.e0 r1 = r9.f7223n     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.util.List r1 = r1.e(r12, r2)     // Catch:{ a -> 0x04e3 }
            goto L_0x02e3
        L_0x03b7:
            boolean r1 = r9.A(r12, r4)     // Catch:{ a -> 0x04e3 }
            if (r1 == 0) goto L_0x03da
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.n1.A(r12, r1)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.d1 r2 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r2 = r13.a(r2, r14)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.z.h(r1, r2)     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
        L_0x03d5:
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r2, r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x03da:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.d1 r3 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r3 = r13.a(r3, r14)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
        L_0x03e9:
            r9.m0(r12, r4)     // Catch:{ a -> 0x04e3 }
            goto L_0x0002
        L_0x03ee:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.l()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.N(r12, r1, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x03fa:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r3 = r13.j()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.M(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x0406:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.t()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.N(r12, r1, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x0412:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r3 = r13.B()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.M(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x041e:
            int r1 = r13.c()     // Catch:{ a -> 0x04e3 }
            r9.r(r4)     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.M(r12, r2, r1)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x042d:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r3 = r13.y()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.M(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x0439:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.h r3 = r13.w()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x0445:
            boolean r1 = r9.A(r12, r4)     // Catch:{ a -> 0x04e3 }
            if (r1 == 0) goto L_0x0465
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.n1.A(r12, r1)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.d1 r2 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r2 = r13.d(r2, r14)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.z.h(r1, r2)     // Catch:{ a -> 0x04e3 }
            long r2 = T(r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03d5
        L_0x0465:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.d1 r3 = r9.t(r4)     // Catch:{ a -> 0x04e3 }
            java.lang.Object r3 = r13.d(r3, r14)     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.O(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x0476:
            r9.j0(r12, r3, r13)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x047b:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            boolean r3 = r13.q()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.E(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x0488:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r3 = r13.p()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.M(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x0495:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.h()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.N(r12, r1, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x04a2:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            int r3 = r13.z()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.M(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x04af:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.f()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.N(r12, r1, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x04bc:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            long r5 = r13.I()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.N(r12, r1, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x04c9:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            float r3 = r13.readFloat()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.L(r12, r1, r3)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x04d6:
            long r1 = T(r3)     // Catch:{ a -> 0x04e3 }
            double r5 = r13.readDouble()     // Catch:{ a -> 0x04e3 }
            com.google.crypto.tink.shaded.protobuf.n1.K(r12, r1, r5)     // Catch:{ a -> 0x04e3 }
            goto L_0x03e9
        L_0x04e3:
            boolean r1 = r10.q(r13)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0506
            boolean r1 = r13.A()     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0002
            int r11 = r9.f7220k
        L_0x04f1:
            int r13 = r9.f7221l
            if (r11 >= r13) goto L_0x0500
            int[] r13 = r9.f7219j
            r13 = r13[r11]
            java.lang.Object r8 = r9.p(r12, r13, r8, r10)
            int r11 = r11 + 1
            goto L_0x04f1
        L_0x0500:
            if (r8 == 0) goto L_0x0505
            r10.o(r12, r8)
        L_0x0505:
            return
        L_0x0506:
            if (r8 != 0) goto L_0x050d
            java.lang.Object r1 = r10.f(r12)     // Catch:{ all -> 0x0045 }
            r8 = r1
        L_0x050d:
            boolean r1 = r10.m(r8, r13)     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0002
            int r11 = r9.f7220k
        L_0x0515:
            int r13 = r9.f7221l
            if (r11 >= r13) goto L_0x0524
            int[] r13 = r9.f7219j
            r13 = r13[r11]
            java.lang.Object r8 = r9.p(r12, r13, r8, r10)
            int r11 = r11 + 1
            goto L_0x0515
        L_0x0524:
            if (r8 == 0) goto L_0x0529
            r10.o(r12, r8)
        L_0x0529:
            return
        L_0x052a:
            int r13 = r9.f7220k
        L_0x052c:
            int r14 = r9.f7221l
            if (r13 >= r14) goto L_0x053b
            int[] r14 = r9.f7219j
            r14 = r14[r13]
            java.lang.Object r8 = r9.p(r12, r14, r8, r10)
            int r13 = r13 + 1
            goto L_0x052c
        L_0x053b:
            if (r8 == 0) goto L_0x0540
            r10.o(r12, r8)
        L_0x0540:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.K(com.google.crypto.tink.shaded.protobuf.j1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.c1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    private final void L(Object obj, int i10, Object obj2, p pVar, c1 c1Var) {
        long T = T(q0(i10));
        Object A = n1.A(obj, T);
        if (A == null) {
            A = this.f7226q.b(obj2);
            n1.O(obj, T, A);
        } else if (this.f7226q.d(A)) {
            Object b10 = this.f7226q.b(obj2);
            this.f7226q.a(b10, A);
            n1.O(obj, T, b10);
            A = b10;
        }
        Map h10 = this.f7226q.h(A);
        this.f7226q.f(obj2);
        c1Var.D(h10, (h0.a) null, pVar);
    }

    private void M(Object obj, Object obj2, int i10) {
        long T = T(q0(i10));
        if (A(obj2, i10)) {
            Object A = n1.A(obj, T);
            Object A2 = n1.A(obj2, T);
            if (A != null && A2 != null) {
                A2 = z.h(A, A2);
            } else if (A2 == null) {
                return;
            }
            n1.O(obj, T, A2);
            m0(obj, i10);
        }
    }

    private void N(Object obj, Object obj2, int i10) {
        int q02 = q0(i10);
        int S = S(i10);
        long T = T(q02);
        if (G(obj2, S, i10)) {
            Object A = n1.A(obj, T);
            Object A2 = n1.A(obj2, T);
            if (A != null && A2 != null) {
                A2 = z.h(A, A2);
            } else if (A2 == null) {
                return;
            }
            n1.O(obj, T, A2);
            n0(obj, S, i10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        com.google.crypto.tink.shaded.protobuf.n1.N(r6, r1, com.google.crypto.tink.shaded.protobuf.n1.y(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        m0(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        com.google.crypto.tink.shaded.protobuf.n1.M(r6, r1, com.google.crypto.tink.shaded.protobuf.n1.x(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        com.google.crypto.tink.shaded.protobuf.n1.O(r6, r1, com.google.crypto.tink.shaded.protobuf.n1.A(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        com.google.crypto.tink.shaded.protobuf.n1.O(r6, r1, com.google.crypto.tink.shaded.protobuf.n1.A(r7, r1));
        n0(r6, r3, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void O(java.lang.Object r6, java.lang.Object r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.q0(r8)
            long r1 = T(r0)
            int r3 = r5.S(r8)
            int r0 = p0(r0)
            switch(r0) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00a5;
                case 7: goto L_0x0097;
                case 8: goto L_0x0090;
                case 9: goto L_0x0041;
                case 10: goto L_0x0082;
                case 11: goto L_0x007b;
                case 12: goto L_0x0074;
                case 13: goto L_0x006d;
                case 14: goto L_0x0066;
                case 15: goto L_0x0058;
                case 16: goto L_0x0046;
                case 17: goto L_0x0041;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x0033;
                case 51: goto L_0x002c;
                case 52: goto L_0x002c;
                case 53: goto L_0x002c;
                case 54: goto L_0x002c;
                case 55: goto L_0x002c;
                case 56: goto L_0x002c;
                case 57: goto L_0x002c;
                case 58: goto L_0x002c;
                case 59: goto L_0x002c;
                case 60: goto L_0x0015;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x00e6
        L_0x0015:
            r5.N(r6, r7, r8)
            goto L_0x00e6
        L_0x001a:
            boolean r0 = r5.G(r7, r3, r8)
            if (r0 == 0) goto L_0x00e6
        L_0x0020:
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.n1.A(r7, r1)
            com.google.crypto.tink.shaded.protobuf.n1.O(r6, r1, r7)
            r5.n0(r6, r3, r8)
            goto L_0x00e6
        L_0x002c:
            boolean r0 = r5.G(r7, r3, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x0020
        L_0x0033:
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r5.f7226q
            com.google.crypto.tink.shaded.protobuf.f1.E(r8, r6, r7, r1)
            goto L_0x00e6
        L_0x003a:
            com.google.crypto.tink.shaded.protobuf.e0 r8 = r5.f7223n
            r8.d(r6, r7, r1)
            goto L_0x00e6
        L_0x0041:
            r5.M(r6, r7, r8)
            goto L_0x00e6
        L_0x0046:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
        L_0x004c:
            long r3 = com.google.crypto.tink.shaded.protobuf.n1.y(r7, r1)
            com.google.crypto.tink.shaded.protobuf.n1.N(r6, r1, r3)
        L_0x0053:
            r5.m0(r6, r8)
            goto L_0x00e6
        L_0x0058:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
        L_0x005e:
            int r7 = com.google.crypto.tink.shaded.protobuf.n1.x(r7, r1)
            com.google.crypto.tink.shaded.protobuf.n1.M(r6, r1, r7)
            goto L_0x0053
        L_0x0066:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x004c
        L_0x006d:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x005e
        L_0x0074:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x005e
        L_0x007b:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x005e
        L_0x0082:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
        L_0x0088:
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.n1.A(r7, r1)
            com.google.crypto.tink.shaded.protobuf.n1.O(r6, r1, r7)
            goto L_0x0053
        L_0x0090:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x0088
        L_0x0097:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            boolean r7 = com.google.crypto.tink.shaded.protobuf.n1.p(r7, r1)
            com.google.crypto.tink.shaded.protobuf.n1.E(r6, r1, r7)
            goto L_0x0053
        L_0x00a5:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x005e
        L_0x00ac:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x004c
        L_0x00b3:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x005e
        L_0x00ba:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x004c
        L_0x00c1:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            goto L_0x004c
        L_0x00c8:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            float r7 = com.google.crypto.tink.shaded.protobuf.n1.w(r7, r1)
            com.google.crypto.tink.shaded.protobuf.n1.L(r6, r1, r7)
            goto L_0x0053
        L_0x00d7:
            boolean r0 = r5.A(r7, r8)
            if (r0 == 0) goto L_0x00e6
            double r3 = com.google.crypto.tink.shaded.protobuf.n1.v(r7, r1)
            com.google.crypto.tink.shaded.protobuf.n1.K(r6, r1, r3)
            goto L_0x0053
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.O(java.lang.Object, java.lang.Object, int):void");
    }

    static r0 P(Class cls, m0 m0Var, t0 t0Var, e0 e0Var, j1 j1Var, q qVar, j0 j0Var) {
        if (m0Var instanceof b1) {
            return R((b1) m0Var, t0Var, e0Var, j1Var, qVar, j0Var);
        }
        b.a(m0Var);
        return Q((g1) null, t0Var, e0Var, j1Var, qVar, j0Var);
    }

    static r0 Q(g1 g1Var, t0 t0Var, e0 e0Var, j1 j1Var, q qVar, j0 j0Var) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.crypto.tink.shaded.protobuf.r0 R(com.google.crypto.tink.shaded.protobuf.b1 r35, com.google.crypto.tink.shaded.protobuf.t0 r36, com.google.crypto.tink.shaded.protobuf.e0 r37, com.google.crypto.tink.shaded.protobuf.j1 r38, com.google.crypto.tink.shaded.protobuf.q r39, com.google.crypto.tink.shaded.protobuf.j0 r40) {
        /*
            com.google.crypto.tink.shaded.protobuf.y0 r0 = r35.b()
            com.google.crypto.tink.shaded.protobuf.y0 r1 = com.google.crypto.tink.shaded.protobuf.y0.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r35.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = f7208r
            r9 = r2
            r11 = r9
            r12 = r11
            r14 = r12
            r15 = r14
            r13 = r8
            r8 = r15
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r34 = r13
            r13 = r2
            r2 = r9
            r9 = r34
        L_0x0177:
            sun.misc.Unsafe r5 = f7209s
            java.lang.Object[] r18 = r35.d()
            com.google.crypto.tink.shaded.protobuf.o0 r19 = r35.c()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03f2
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b6
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x0226:
            int r33 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r15 = r15 | r9
            int r32 = r32 + 13
            r11 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r32
            r15 = r15 | r9
            r11 = r33
        L_0x0240:
            int r9 = r10 + -51
            r32 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0263
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0263
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x0270
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x0270
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x0261:
            r14 = r11
            goto L_0x0270
        L_0x0263:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x0261
        L_0x0270:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
        L_0x027a:
            r11 = r6
            r33 = r7
            goto L_0x0287
        L_0x027e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = l0(r3, r9)
            r18[r15] = r9
            goto L_0x027a
        L_0x0287:
            long r6 = r5.objectFieldOffset(r9)
            int r6 = (int) r6
            int r15 = r15 + 1
            r7 = r18[r15]
            boolean r9 = r7 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0298
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
        L_0x0296:
            r9 = r6
            goto L_0x02a1
        L_0x0298:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = l0(r3, r7)
            r18[r15] = r7
            goto L_0x0296
        L_0x02a1:
            long r6 = r5.objectFieldOffset(r7)
            int r6 = (int) r6
            r27 = r2
            r19 = r4
            r4 = r6
            r6 = r9
            r2 = r14
            r7 = r32
            r14 = 0
            r9 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03bb
        L_0x02b6:
            r11 = r6
            r33 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = l0(r3, r7)
            r9 = 9
            if (r10 == r9) goto L_0x02cb
            r9 = 17
            if (r10 != r9) goto L_0x02d0
        L_0x02cb:
            r27 = r2
            r2 = 1
            goto L_0x0339
        L_0x02d0:
            r9 = 27
            if (r10 == r9) goto L_0x02d8
            r9 = 49
            if (r10 != r9) goto L_0x02dc
        L_0x02d8:
            r27 = r2
            r2 = 1
            goto L_0x032d
        L_0x02dc:
            r9 = 12
            if (r10 == r9) goto L_0x0318
            r9 = 30
            if (r10 == r9) goto L_0x0318
            r9 = 44
            if (r10 != r9) goto L_0x02e9
            goto L_0x0318
        L_0x02e9:
            r9 = 50
            if (r10 != r9) goto L_0x0314
            int r9 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r14 + 2
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x030d
            int r23 = r23 + 1
            int r6 = r14 + 3
            r14 = r18[r27]
            r12[r23] = r14
            r27 = r2
            r23 = r9
        L_0x030b:
            r9 = r3
            goto L_0x0345
        L_0x030d:
            r23 = r9
            r6 = r27
            r27 = r2
            goto L_0x030b
        L_0x0314:
            r27 = r2
            r2 = 1
            goto L_0x030b
        L_0x0318:
            r9 = r4 & 1
            r27 = r2
            r2 = 1
            if (r9 != r2) goto L_0x030b
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r2
            int r14 = r14 + 2
            r6 = r18[r6]
            r12[r9] = r6
        L_0x032a:
            r9 = r3
            r6 = r14
            goto L_0x0345
        L_0x032d:
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r2
            int r14 = r14 + 2
            r6 = r18[r6]
            r12[r9] = r6
            goto L_0x032a
        L_0x0339:
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r2
            java.lang.Class r14 = r7.getType()
            r12[r9] = r14
            goto L_0x030b
        L_0x0345:
            long r2 = r5.objectFieldOffset(r7)
            int r2 = (int) r2
            r3 = r4 & 1
            r7 = 1
            if (r3 != r7) goto L_0x03a0
            r3 = 17
            if (r10 > r3) goto L_0x03a0
            int r3 = r15 + 1
            char r14 = r0.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r15) goto L_0x0379
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0362:
            int r20 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r15) goto L_0x0374
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r19
            r14 = r14 | r3
            int r19 = r19 + 13
            r3 = r20
            goto L_0x0362
        L_0x0374:
            int r3 = r3 << r19
            r14 = r14 | r3
            r3 = r20
        L_0x0379:
            int r19 = r8 * 2
            int r20 = r14 / 32
            int r19 = r19 + r20
            r7 = r18[r19]
            boolean r15 = r7 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x038b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
        L_0x0387:
            r15 = r3
            r19 = r4
            goto L_0x0394
        L_0x038b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = l0(r9, r7)
            r18[r19] = r7
            goto L_0x0387
        L_0x0394:
            long r3 = r5.objectFieldOffset(r7)
            int r3 = (int) r3
            int r14 = r14 % 32
            r4 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03a7
        L_0x03a0:
            r19 = r4
            r3 = 55296(0xd800, float:7.7486E-41)
            r4 = 0
            r14 = 0
        L_0x03a7:
            r7 = 18
            if (r10 < r7) goto L_0x03b5
            r7 = 49
            if (r10 > r7) goto L_0x03b5
            int r7 = r24 + 1
            r13[r24] = r2
            r24 = r7
        L_0x03b5:
            r7 = r15
            r34 = r6
            r6 = r2
            r2 = r34
        L_0x03bb:
            int r15 = r22 + 1
            r11[r22] = r33
            int r30 = r22 + 2
            r3 = r1 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03c8
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03c9
        L_0x03c8:
            r3 = 0
        L_0x03c9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03d0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03d1
        L_0x03d0:
            r1 = 0
        L_0x03d1:
            r1 = r1 | r3
            int r3 = r10 << 20
            r1 = r1 | r3
            r1 = r1 | r6
            r11[r15] = r1
            int r22 = r22 + 3
            int r1 = r14 << 20
            r1 = r1 | r4
            r11[r30] = r1
            r14 = r2
            r3 = r9
            r6 = r11
            r4 = r19
            r11 = r25
            r1 = r26
            r2 = r27
            r15 = r28
            r10 = r29
            r9 = r31
            goto L_0x0196
        L_0x03f2:
            r27 = r2
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            com.google.crypto.tink.shaded.protobuf.r0 r0 = new com.google.crypto.tink.shaded.protobuf.r0
            com.google.crypto.tink.shaded.protobuf.o0 r9 = r35.c()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r27
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.R(com.google.crypto.tink.shaded.protobuf.b1, com.google.crypto.tink.shaded.protobuf.t0, com.google.crypto.tink.shaded.protobuf.e0, com.google.crypto.tink.shaded.protobuf.j1, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.j0):com.google.crypto.tink.shaded.protobuf.r0");
    }

    private int S(int i10) {
        return this.f7210a[i10];
    }

    private static long T(int i10) {
        return (long) (i10 & 1048575);
    }

    private static boolean U(Object obj, long j10) {
        return ((Boolean) n1.A(obj, j10)).booleanValue();
    }

    private static double V(Object obj, long j10) {
        return ((Double) n1.A(obj, j10)).doubleValue();
    }

    private static float W(Object obj, long j10) {
        return ((Float) n1.A(obj, j10)).floatValue();
    }

    private static int X(Object obj, long j10) {
        return ((Integer) n1.A(obj, j10)).intValue();
    }

    private static long Y(Object obj, long j10) {
        return ((Long) n1.A(obj, j10)).longValue();
    }

    private int Z(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, e.a aVar) {
        Object obj2 = obj;
        long j11 = j10;
        Unsafe unsafe = f7209s;
        int i13 = i12;
        Object s10 = s(i12);
        Object object = unsafe.getObject(obj, j11);
        if (this.f7226q.d(object)) {
            Object b10 = this.f7226q.b(s10);
            this.f7226q.a(b10, object);
            unsafe.putObject(obj, j11, b10);
            object = b10;
        }
        this.f7226q.f(s10);
        return m(bArr, i10, i11, (h0.a) null, this.f7226q.h(object), aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0103, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a0(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.crypto.tink.shaded.protobuf.e.a r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r8 = r22
            r2 = r23
            r9 = r26
            r5 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f7209s
            int[] r6 = r0.f7210a
            int r7 = r5 + 2
            r6 = r6[r7]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r7
            long r13 = (long) r6
            r6 = 5
            r7 = 1
            r15 = 2
            switch(r25) {
                case 51: goto L_0x013a;
                case 52: goto L_0x012f;
                case 53: goto L_0x0125;
                case 54: goto L_0x0125;
                case 55: goto L_0x011b;
                case 56: goto L_0x010a;
                case 57: goto L_0x00f9;
                case 58: goto L_0x00e3;
                case 59: goto L_0x00b5;
                case 60: goto L_0x0093;
                case 61: goto L_0x008a;
                case 62: goto L_0x011b;
                case 63: goto L_0x007e;
                case 64: goto L_0x00f9;
                case 65: goto L_0x010a;
                case 66: goto L_0x006d;
                case 67: goto L_0x0059;
                case 68: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0145
        L_0x0027:
            r6 = 3
            if (r2 != r6) goto L_0x0145
            r2 = r21 & -8
            r6 = r2 | 4
            com.google.crypto.tink.shaded.protobuf.d1 r2 = r0.t(r5)
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.google.crypto.tink.shaded.protobuf.e.m(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x0049
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004a
        L_0x0049:
            r15 = 0
        L_0x004a:
            java.lang.Object r3 = r11.f7066c
            if (r15 != 0) goto L_0x004f
        L_0x004e:
            goto L_0x0069
        L_0x004f:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.z.h(r15, r3)
            goto L_0x004e
        L_0x0054:
            r12.putInt(r1, r13, r8)
            goto L_0x0146
        L_0x0059:
            if (r2 != 0) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.K(r3, r4, r11)
            long r3 = r11.f7065b
            long r3 = com.google.crypto.tink.shaded.protobuf.i.c(r3)
        L_0x0065:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0069:
            r12.putObject(r1, r9, r3)
            goto L_0x0054
        L_0x006d:
            if (r2 != 0) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.H(r3, r4, r11)
            int r3 = r11.f7064a
            int r3 = com.google.crypto.tink.shaded.protobuf.i.b(r3)
        L_0x0079:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0069
        L_0x007e:
            if (r2 != 0) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.H(r3, r4, r11)
            int r3 = r11.f7064a
            r0.r(r5)
            goto L_0x0079
        L_0x008a:
            if (r2 != r15) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.b(r3, r4, r11)
            java.lang.Object r3 = r11.f7066c
            goto L_0x0069
        L_0x0093:
            if (r2 != r15) goto L_0x0145
            com.google.crypto.tink.shaded.protobuf.d1 r2 = r0.t(r5)
            r5 = r20
            int r2 = com.google.crypto.tink.shaded.protobuf.e.o(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00aa
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00ab
        L_0x00aa:
            r15 = 0
        L_0x00ab:
            java.lang.Object r3 = r11.f7066c
            if (r15 != 0) goto L_0x00b0
        L_0x00af:
            goto L_0x0069
        L_0x00b0:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.z.h(r15, r3)
            goto L_0x00af
        L_0x00b5:
            if (r2 != r15) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.H(r3, r4, r11)
            int r4 = r11.f7064a
            if (r4 != 0) goto L_0x00c2
            java.lang.String r3 = ""
            goto L_0x0069
        L_0x00c2:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00d6
            int r5 = r2 + r4
            boolean r5 = com.google.crypto.tink.shaded.protobuf.o1.n(r3, r2, r5)
            if (r5 == 0) goto L_0x00d1
            goto L_0x00d6
        L_0x00d1:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = com.google.crypto.tink.shaded.protobuf.a0.c()
            throw r1
        L_0x00d6:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.crypto.tink.shaded.protobuf.z.f7292a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0054
        L_0x00e3:
            if (r2 != 0) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.K(r3, r4, r11)
            long r3 = r11.f7065b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r7 = 0
        L_0x00f3:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            goto L_0x0069
        L_0x00f9:
            if (r2 != r6) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.g(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0103:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0054
        L_0x010a:
            if (r2 != r7) goto L_0x0145
            long r2 = com.google.crypto.tink.shaded.protobuf.e.i(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x0114:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
            goto L_0x0054
        L_0x011b:
            if (r2 != 0) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.H(r3, r4, r11)
            int r3 = r11.f7064a
            goto L_0x0079
        L_0x0125:
            if (r2 != 0) goto L_0x0145
            int r2 = com.google.crypto.tink.shaded.protobuf.e.K(r3, r4, r11)
            long r3 = r11.f7065b
            goto L_0x0065
        L_0x012f:
            if (r2 != r6) goto L_0x0145
            float r2 = com.google.crypto.tink.shaded.protobuf.e.k(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x0103
        L_0x013a:
            if (r2 != r7) goto L_0x0145
            double r2 = com.google.crypto.tink.shaded.protobuf.e.d(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            goto L_0x0114
        L_0x0145:
            r2 = r4
        L_0x0146:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.a0(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r0.putLong(r1, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (r6 == 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r0 = com.google.crypto.tink.shaded.protobuf.e.H(r12, r8, r11);
        r1 = r11.f7064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        r1 = r11.f7066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011e, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0124, code lost:
        if (r6 == 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c2, code lost:
        if (r0 != r15) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0204, code lost:
        if (r0 != r15) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0221, code lost:
        if (r0 != r15) goto L_0x01c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c0(java.lang.Object r28, byte[] r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.e.a r32) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = f7209s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = r10
            r2 = r16
        L_0x0014:
            if (r0 >= r13) goto L_0x0235
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0026
            int r0 = com.google.crypto.tink.shaded.protobuf.e.G(r0, r12, r3, r11)
            int r3 = r11.f7064a
            r8 = r0
            r17 = r3
            goto L_0x0029
        L_0x0026:
            r17 = r0
            r8 = r3
        L_0x0029:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0037
            int r2 = r2 / 3
            int r0 = r15.f0(r7, r2)
        L_0x0035:
            r4 = r0
            goto L_0x003c
        L_0x0037:
            int r0 = r15.e0(r7)
            goto L_0x0035
        L_0x003c:
            if (r4 != r10) goto L_0x0049
            r24 = r7
            r2 = r8
            r18 = r9
            r25 = r10
            r19 = r16
            goto L_0x0224
        L_0x0049:
            int[] r0 = r15.f7210a
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = p0(r5)
            long r1 = T(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0152
            r0 = 1
            switch(r3) {
                case 0: goto L_0x0146;
                case 1: goto L_0x0136;
                case 2: goto L_0x0127;
                case 3: goto L_0x0127;
                case 4: goto L_0x0122;
                case 5: goto L_0x010f;
                case 6: goto L_0x0101;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00d8;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00ae;
                case 11: goto L_0x0122;
                case 12: goto L_0x00a3;
                case 13: goto L_0x0101;
                case 14: goto L_0x010f;
                case 15: goto L_0x0089;
                case 16: goto L_0x006b;
                default: goto L_0x0060;
            }
        L_0x0060:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x0067:
            r25 = -1
            goto L_0x0207
        L_0x006b:
            if (r6 != 0) goto L_0x0060
            int r6 = com.google.crypto.tink.shaded.protobuf.e.K(r12, r8, r11)
            r19 = r1
            long r0 = r11.f7065b
            long r21 = com.google.crypto.tink.shaded.protobuf.i.c(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
        L_0x0081:
            r0.putLong(r1, r2, r4)
            r0 = r6
        L_0x0085:
            r1 = r7
            r2 = r10
        L_0x0087:
            r10 = -1
            goto L_0x0014
        L_0x0089:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x009b
            int r0 = com.google.crypto.tink.shaded.protobuf.e.H(r12, r8, r11)
            int r1 = r11.f7064a
            int r1 = com.google.crypto.tink.shaded.protobuf.i.b(r1)
        L_0x0097:
            r9.putInt(r14, r2, r1)
            goto L_0x0085
        L_0x009b:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x0067
        L_0x00a3:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x009b
        L_0x00a7:
            int r0 = com.google.crypto.tink.shaded.protobuf.e.H(r12, r8, r11)
            int r1 = r11.f7064a
            goto L_0x0097
        L_0x00ae:
            r2 = r1
            if (r6 != r10) goto L_0x0060
            int r0 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r8, r11)
        L_0x00b5:
            java.lang.Object r1 = r11.f7066c
        L_0x00b7:
            r9.putObject(r14, r2, r1)
        L_0x00ba:
            r2 = r4
            r1 = r7
            goto L_0x0087
        L_0x00bd:
            r2 = r1
            if (r6 != r10) goto L_0x0060
            com.google.crypto.tink.shaded.protobuf.d1 r0 = r15.t(r4)
            int r0 = com.google.crypto.tink.shaded.protobuf.e.o(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00d1
            java.lang.Object r1 = r11.f7066c
            goto L_0x00b7
        L_0x00d1:
            java.lang.Object r5 = r11.f7066c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.z.h(r1, r5)
            goto L_0x00b7
        L_0x00d8:
            r2 = r1
            if (r6 != r10) goto L_0x0060
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00e5
            int r0 = com.google.crypto.tink.shaded.protobuf.e.B(r12, r8, r11)
            goto L_0x00b5
        L_0x00e5:
            int r0 = com.google.crypto.tink.shaded.protobuf.e.E(r12, r8, r11)
            goto L_0x00b5
        L_0x00ea:
            r2 = r1
            if (r6 != 0) goto L_0x0060
            int r1 = com.google.crypto.tink.shaded.protobuf.e.K(r12, r8, r11)
            long r5 = r11.f7065b
            r19 = 0
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r0 = r16
        L_0x00fc:
            com.google.crypto.tink.shaded.protobuf.n1.E(r14, r2, r0)
            r0 = r1
            goto L_0x00ba
        L_0x0101:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x0060
            int r0 = com.google.crypto.tink.shaded.protobuf.e.g(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x00ba
        L_0x010f:
            r2 = r1
            if (r6 != r0) goto L_0x0060
            long r5 = com.google.crypto.tink.shaded.protobuf.e.i(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
        L_0x011e:
            int r0 = r8 + 8
            goto L_0x0085
        L_0x0122:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x009b
            goto L_0x00a7
        L_0x0127:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x009b
            int r6 = com.google.crypto.tink.shaded.protobuf.e.K(r12, r8, r11)
            long r4 = r11.f7065b
            r0 = r9
            r1 = r28
            goto L_0x0081
        L_0x0136:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x009b
            float r0 = com.google.crypto.tink.shaded.protobuf.e.k(r12, r8)
            com.google.crypto.tink.shaded.protobuf.n1.L(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x0085
        L_0x0146:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x009b
            double r0 = com.google.crypto.tink.shaded.protobuf.e.d(r12, r8)
            com.google.crypto.tink.shaded.protobuf.n1.K(r14, r2, r0)
            goto L_0x011e
        L_0x0152:
            r0 = 27
            if (r3 != r0) goto L_0x018f
            if (r6 != r10) goto L_0x0060
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.crypto.tink.shaded.protobuf.z$d r0 = (com.google.crypto.tink.shaded.protobuf.z.d) r0
            boolean r3 = r0.c0()
            if (r3 != 0) goto L_0x0176
            int r3 = r0.size()
            if (r3 != 0) goto L_0x016d
            r3 = 10
            goto L_0x016f
        L_0x016d:
            int r3 = r3 * 2
        L_0x016f:
            com.google.crypto.tink.shaded.protobuf.z$d r0 = r0.z(r3)
            r9.putObject(r14, r1, r0)
        L_0x0176:
            r5 = r0
            com.google.crypto.tink.shaded.protobuf.d1 r0 = r15.t(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.e.p(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0087
        L_0x018f:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01da
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r26 = r10
            r25 = -1
            r9 = r22
            r11 = r26
            r12 = r20
            r14 = r32
            int r0 = r0.d0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x01d8
        L_0x01c4:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
            r10 = r25
            goto L_0x0014
        L_0x01d8:
            r2 = r0
            goto L_0x0224
        L_0x01da:
            r20 = r1
            r26 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r25 = -1
            r0 = 50
            r9 = r26
            r7 = r30
            if (r9 != r0) goto L_0x0209
            if (r7 != r10) goto L_0x0207
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.Z(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x01d8
            goto L_0x01c4
        L_0x0207:
            r2 = r15
            goto L_0x0224
        L_0x0209:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.a0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x01d8
            goto L_0x01c4
        L_0x0224:
            com.google.crypto.tink.shaded.protobuf.k1 r4 = u(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.e.F(r0, r1, r2, r3, r4, r5)
            goto L_0x01c4
        L_0x0235:
            r1 = r13
            if (r0 != r1) goto L_0x0239
            return r0
        L_0x0239:
            com.google.crypto.tink.shaded.protobuf.a0 r0 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.c0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    private int d0(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.a aVar) {
        int i17;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i14;
        int i20 = i15;
        long j12 = j11;
        e.a aVar2 = aVar;
        Unsafe unsafe = f7209s;
        z.d dVar = (z.d) unsafe.getObject(obj, j12);
        if (!dVar.c0()) {
            int size = dVar.size();
            dVar = dVar.z(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j12, dVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i19 == 2) {
                    return e.r(bArr, i18, dVar, aVar2);
                }
                if (i19 == 1) {
                    return e.e(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i19 == 2) {
                    return e.u(bArr, i18, dVar, aVar2);
                }
                if (i19 == 5) {
                    return e.l(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i19 == 2) {
                    return e.y(bArr, i18, dVar, aVar2);
                }
                if (i19 == 0) {
                    return e.L(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i19 == 2) {
                    return e.x(bArr, i18, dVar, aVar2);
                }
                if (i19 == 0) {
                    return e.I(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i19 == 2) {
                    return e.t(bArr, i18, dVar, aVar2);
                }
                if (i19 == 1) {
                    return e.j(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i19 == 2) {
                    return e.s(bArr, i18, dVar, aVar2);
                }
                if (i19 == 5) {
                    return e.h(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i19 == 2) {
                    return e.q(bArr, i18, dVar, aVar2);
                }
                if (i19 == 0) {
                    return e.a(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 26:
                if (i19 == 2) {
                    int i21 = ((j10 & 536870912) > 0 ? 1 : ((j10 & 536870912) == 0 ? 0 : -1));
                    byte[] bArr3 = bArr;
                    int i22 = i10;
                    int i23 = i11;
                    z.d dVar2 = dVar;
                    e.a aVar3 = aVar;
                    return i21 == 0 ? e.C(i12, bArr3, i22, i23, dVar2, aVar3) : e.D(i12, bArr3, i22, i23, dVar2, aVar3);
                }
                break;
            case 27:
                if (i19 == 2) {
                    return e.p(t(i20), i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 28:
                if (i19 == 2) {
                    return e.c(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i19 == 2) {
                    i17 = e.x(bArr, i18, dVar, aVar2);
                } else if (i19 == 0) {
                    i17 = e.I(i12, bArr, i10, i11, dVar, aVar);
                }
                x xVar = (x) obj2;
                k1 k1Var = xVar.unknownFields;
                if (k1Var == k1.e()) {
                    k1Var = null;
                }
                r(i20);
                k1 k1Var2 = (k1) f1.z(i13, dVar, (z.c) null, k1Var, this.f7224o);
                if (k1Var2 != null) {
                    xVar.unknownFields = k1Var2;
                }
                return i17;
            case 33:
            case 47:
                if (i19 == 2) {
                    return e.v(bArr, i18, dVar, aVar2);
                }
                if (i19 == 0) {
                    return e.z(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i19 == 2) {
                    return e.w(bArr, i18, dVar, aVar2);
                }
                if (i19 == 0) {
                    return e.A(i12, bArr, i10, i11, dVar, aVar);
                }
                break;
            case 49:
                if (i19 == 3) {
                    return e.n(t(i20), i12, bArr, i10, i11, dVar, aVar);
                }
                break;
        }
        return i18;
    }

    private int e0(int i10) {
        if (i10 < this.f7212c || i10 > this.f7213d) {
            return -1;
        }
        return o0(i10, 0);
    }

    private int f0(int i10, int i11) {
        if (i10 < this.f7212c || i10 > this.f7213d) {
            return -1;
        }
        return o0(i10, i11);
    }

    private int g0(int i10) {
        return this.f7210a[i10 + 2];
    }

    private void h0(Object obj, long j10, c1 c1Var, d1 d1Var, p pVar) {
        c1Var.H(this.f7223n.e(obj, j10), d1Var, pVar);
    }

    private void i0(Object obj, int i10, c1 c1Var, d1 d1Var, p pVar) {
        c1Var.o(this.f7223n.e(obj, T(i10)), d1Var, pVar);
    }

    private void j0(Object obj, int i10, c1 c1Var) {
        long T;
        Object w10;
        if (z(i10)) {
            T = T(i10);
            w10 = c1Var.J();
        } else if (this.f7216g) {
            T = T(i10);
            w10 = c1Var.readString();
        } else {
            T = T(i10);
            w10 = c1Var.w();
        }
        n1.O(obj, T, w10);
    }

    private boolean k(Object obj, Object obj2, int i10) {
        return A(obj, i10) == A(obj2, i10);
    }

    private void k0(Object obj, int i10, c1 c1Var) {
        if (z(i10)) {
            c1Var.v(this.f7223n.e(obj, T(i10)));
        } else {
            c1Var.s(this.f7223n.e(obj, T(i10)));
        }
    }

    private static boolean l(Object obj, long j10) {
        return n1.p(obj, j10);
    }

    private static Field l0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private int m(byte[] bArr, int i10, int i11, h0.a aVar, Map map, e.a aVar2) {
        int H = e.H(bArr, i10, aVar2);
        int i12 = aVar2.f7064a;
        if (i12 < 0 || i12 > i11 - H) {
            throw a0.j();
        }
        throw null;
    }

    private void m0(Object obj, int i10) {
        if (!this.f7217h) {
            int g02 = g0(i10);
            long j10 = (long) (g02 & 1048575);
            n1.M(obj, j10, n1.x(obj, j10) | (1 << (g02 >>> 20)));
        }
    }

    private static double n(Object obj, long j10) {
        return n1.v(obj, j10);
    }

    private void n0(Object obj, int i10, int i11) {
        n1.M(obj, (long) (g0(i11) & 1048575), i10);
    }

    private boolean o(Object obj, Object obj2, int i10) {
        int q02 = q0(i10);
        long T = T(q02);
        switch (p0(q02)) {
            case 0:
                return k(obj, obj2, i10) && Double.doubleToLongBits(n1.v(obj, T)) == Double.doubleToLongBits(n1.v(obj2, T));
            case 1:
                return k(obj, obj2, i10) && Float.floatToIntBits(n1.w(obj, T)) == Float.floatToIntBits(n1.w(obj2, T));
            case 2:
                return k(obj, obj2, i10) && n1.y(obj, T) == n1.y(obj2, T);
            case 3:
                return k(obj, obj2, i10) && n1.y(obj, T) == n1.y(obj2, T);
            case 4:
                return k(obj, obj2, i10) && n1.x(obj, T) == n1.x(obj2, T);
            case 5:
                return k(obj, obj2, i10) && n1.y(obj, T) == n1.y(obj2, T);
            case 6:
                return k(obj, obj2, i10) && n1.x(obj, T) == n1.x(obj2, T);
            case 7:
                return k(obj, obj2, i10) && n1.p(obj, T) == n1.p(obj2, T);
            case 8:
                return k(obj, obj2, i10) && f1.J(n1.A(obj, T), n1.A(obj2, T));
            case 9:
                return k(obj, obj2, i10) && f1.J(n1.A(obj, T), n1.A(obj2, T));
            case 10:
                return k(obj, obj2, i10) && f1.J(n1.A(obj, T), n1.A(obj2, T));
            case 11:
                return k(obj, obj2, i10) && n1.x(obj, T) == n1.x(obj2, T);
            case 12:
                return k(obj, obj2, i10) && n1.x(obj, T) == n1.x(obj2, T);
            case 13:
                return k(obj, obj2, i10) && n1.x(obj, T) == n1.x(obj2, T);
            case 14:
                return k(obj, obj2, i10) && n1.y(obj, T) == n1.y(obj2, T);
            case 15:
                return k(obj, obj2, i10) && n1.x(obj, T) == n1.x(obj2, T);
            case 16:
                return k(obj, obj2, i10) && n1.y(obj, T) == n1.y(obj2, T);
            case 17:
                return k(obj, obj2, i10) && f1.J(n1.A(obj, T), n1.A(obj2, T));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return f1.J(n1.A(obj, T), n1.A(obj2, T));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return F(obj, obj2, i10) && f1.J(n1.A(obj, T), n1.A(obj2, T));
            default:
                return true;
        }
    }

    private int o0(int i10, int i11) {
        int length = (this.f7210a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int S = S(i13);
            if (i10 == S) {
                return i13;
            }
            if (i10 < S) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final Object p(Object obj, int i10, Object obj2, j1 j1Var) {
        S(i10);
        if (n1.A(obj, T(q0(i10))) == null) {
            return obj2;
        }
        r(i10);
        return obj2;
    }

    private static int p0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static float q(Object obj, long j10) {
        return n1.w(obj, j10);
    }

    private int q0(int i10) {
        return this.f7210a[i10 + 1];
    }

    private z.c r(int i10) {
        b.a(this.f7211b[((i10 / 3) * 2) + 1]);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r0(java.lang.Object r18, com.google.crypto.tink.shaded.protobuf.q1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f7215f
            if (r3 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.q r3 = r0.f7225p
            com.google.crypto.tink.shaded.protobuf.t r3 = r3.c(r1)
            boolean r5 = r3.d()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.f()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f7210a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f7209s
            r9 = -1
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r6) goto L_0x049a
            int r12 = r0.q0(r10)
            int r13 = r0.S(r10)
            int r14 = p0(r12)
            boolean r15 = r0.f7217h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.f7210a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r15 & r16
            r16 = r5
            if (r8 == r9) goto L_0x0056
            long r4 = (long) r8
            int r11 = r7.getInt(r1, r4)
            r9 = r8
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            com.google.crypto.tink.shaded.protobuf.q r8 = r0.f7225p
            int r8 = r8.a(r5)
            if (r8 > r13) goto L_0x0081
            com.google.crypto.tink.shaded.protobuf.q r8 = r0.f7225p
            r8.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r8 = r6
            long r5 = T(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.d1 r5 = r0.t(r10)
            r2.M(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = Y(r1, r5)
            r2.B(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = X(r1, r5)
            r2.N(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = Y(r1, r5)
            r2.p(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = X(r1, r5)
            r2.i(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = X(r1, r5)
            r2.I(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = X(r1, r5)
            r2.f(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.h r4 = (com.google.crypto.tink.shaded.protobuf.h) r4
            r2.v(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.d1 r5 = r0.t(r10)
            r2.s(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.v0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = U(r1, r5)
            r2.e(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = X(r1, r5)
            r2.n(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = Y(r1, r5)
            r2.z(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = X(r1, r5)
            r2.k(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = Y(r1, r5)
            r2.H(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = Y(r1, r5)
            r2.d(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = W(r1, r5)
            r2.C(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.G(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = V(r1, r5)
            r2.o(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.u0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.d1 r6 = r0.t(r10)
            com.google.crypto.tink.shaded.protobuf.f1.T(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            com.google.crypto.tink.shaded.protobuf.f1.a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.X(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.c0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.M(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.U(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.O(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            com.google.crypto.tink.shaded.protobuf.f1.a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.X(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.c0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.N(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.d1 r6 = r0.t(r10)
            com.google.crypto.tink.shaded.protobuf.f1.W(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.b0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            com.google.crypto.tink.shaded.protobuf.f1.M(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.U(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.S(r10)
            java.lang.Object r5 = r7.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.f1.O(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.d1 r5 = r0.t(r10)
            r2.M(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.B(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.N(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.p(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.i(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.I(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.f(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.h r4 = (com.google.crypto.tink.shaded.protobuf.h) r4
            r2.v(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.d1 r5 = r0.t(r10)
            r2.s(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r7.getObject(r1, r5)
            r0.v0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = l(r1, r5)
            r2.e(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.n(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.z(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r7.getInt(r1, r5)
            r2.k(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.H(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r7.getLong(r1, r5)
            r2.d(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = q(r1, r5)
            r2.C(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = n(r1, r5)
            r2.o(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r8
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            com.google.crypto.tink.shaded.protobuf.q r4 = r0.f7225p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            com.google.crypto.tink.shaded.protobuf.j1 r3 = r0.f7224o
            r0.w0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.r0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.q1):void");
    }

    private Object s(int i10) {
        return this.f7211b[(i10 / 3) * 2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r14.M(r7, com.google.crypto.tink.shaded.protobuf.n1.A(r13, T(r6)), t(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        r14.B(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r14.N(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r14.p(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
        r14.i(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        r14.I(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        r14.f(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e4, code lost:
        r14.v(r7, (com.google.crypto.tink.shaded.protobuf.h) com.google.crypto.tink.shaded.protobuf.n1.A(r13, T(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        r14.s(r7, com.google.crypto.tink.shaded.protobuf.n1.A(r13, T(r6)), t(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0110, code lost:
        v0(r7, com.google.crypto.tink.shaded.protobuf.n1.A(r13, T(r6)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012b, code lost:
        r14.e(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013e, code lost:
        r14.n(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0151, code lost:
        r14.z(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0164, code lost:
        r14.k(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0177, code lost:
        r14.H(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018a, code lost:
        r14.d(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019d, code lost:
        r14.C(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b0, code lost:
        r14.o(r7, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void s0(java.lang.Object r13, com.google.crypto.tink.shaded.protobuf.q1 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f7215f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.crypto.tink.shaded.protobuf.q r0 = r12.f7225p
            com.google.crypto.tink.shaded.protobuf.t r0 = r0.c(r13)
            boolean r2 = r0.d()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.f()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f7210a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x052e
            int r6 = r12.q0(r5)
            int r7 = r12.S(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.crypto.tink.shaded.protobuf.q r8 = r12.f7225p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.crypto.tink.shaded.protobuf.q r8 = r12.f7225p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = p0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x051a;
                case 1: goto L_0x050a;
                case 2: goto L_0x04fa;
                case 3: goto L_0x04ea;
                case 4: goto L_0x04da;
                case 5: goto L_0x04ca;
                case 6: goto L_0x04ba;
                case 7: goto L_0x04aa;
                case 8: goto L_0x04a2;
                case 9: goto L_0x049a;
                case 10: goto L_0x0492;
                case 11: goto L_0x0482;
                case 12: goto L_0x0472;
                case 13: goto L_0x0462;
                case 14: goto L_0x0452;
                case 15: goto L_0x0442;
                case 16: goto L_0x0432;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x052a
        L_0x0055:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
        L_0x005b:
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.d1 r8 = r12.t(r5)
            r14.M(r7, r6, r8)
            goto L_0x052a
        L_0x006c:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = Y(r13, r8)
        L_0x007a:
            r14.B(r7, r8)
            goto L_0x052a
        L_0x007f:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = X(r13, r8)
        L_0x008d:
            r14.N(r7, r6)
            goto L_0x052a
        L_0x0092:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = Y(r13, r8)
        L_0x00a0:
            r14.p(r7, r8)
            goto L_0x052a
        L_0x00a5:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = X(r13, r8)
        L_0x00b3:
            r14.i(r7, r6)
            goto L_0x052a
        L_0x00b8:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = X(r13, r8)
        L_0x00c6:
            r14.I(r7, r6)
            goto L_0x052a
        L_0x00cb:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = X(r13, r8)
        L_0x00d9:
            r14.f(r7, r6)
            goto L_0x052a
        L_0x00de:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
        L_0x00e4:
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.h r6 = (com.google.crypto.tink.shaded.protobuf.h) r6
            r14.v(r7, r6)
            goto L_0x052a
        L_0x00f3:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
        L_0x00f9:
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.d1 r8 = r12.t(r5)
            r14.s(r7, r6, r8)
            goto L_0x052a
        L_0x010a:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
        L_0x0110:
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            r12.v0(r7, r6, r14)
            goto L_0x052a
        L_0x011d:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            boolean r6 = U(r13, r8)
        L_0x012b:
            r14.e(r7, r6)
            goto L_0x052a
        L_0x0130:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = X(r13, r8)
        L_0x013e:
            r14.n(r7, r6)
            goto L_0x052a
        L_0x0143:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = Y(r13, r8)
        L_0x0151:
            r14.z(r7, r8)
            goto L_0x052a
        L_0x0156:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = X(r13, r8)
        L_0x0164:
            r14.k(r7, r6)
            goto L_0x052a
        L_0x0169:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = Y(r13, r8)
        L_0x0177:
            r14.H(r7, r8)
            goto L_0x052a
        L_0x017c:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = Y(r13, r8)
        L_0x018a:
            r14.d(r7, r8)
            goto L_0x052a
        L_0x018f:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            float r6 = W(r13, r8)
        L_0x019d:
            r14.C(r7, r6)
            goto L_0x052a
        L_0x01a2:
            boolean r8 = r12.G(r13, r7, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            double r8 = V(r13, r8)
        L_0x01b0:
            r14.o(r7, r8)
            goto L_0x052a
        L_0x01b5:
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            r12.u0(r14, r7, r6, r5)
            goto L_0x052a
        L_0x01c2:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d1 r8 = r12.t(r5)
            com.google.crypto.tink.shaded.protobuf.f1.T(r7, r6, r14, r8)
            goto L_0x052a
        L_0x01d9:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.a0(r7, r6, r14, r9)
            goto L_0x052a
        L_0x01ec:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.Z(r7, r6, r14, r9)
            goto L_0x052a
        L_0x01ff:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.Y(r7, r6, r14, r9)
            goto L_0x052a
        L_0x0212:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.X(r7, r6, r14, r9)
            goto L_0x052a
        L_0x0225:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.P(r7, r6, r14, r9)
            goto L_0x052a
        L_0x0238:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.c0(r7, r6, r14, r9)
            goto L_0x052a
        L_0x024b:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.M(r7, r6, r14, r9)
            goto L_0x052a
        L_0x025e:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.Q(r7, r6, r14, r9)
            goto L_0x052a
        L_0x0271:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.R(r7, r6, r14, r9)
            goto L_0x052a
        L_0x0284:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.U(r7, r6, r14, r9)
            goto L_0x052a
        L_0x0297:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.d0(r7, r6, r14, r9)
            goto L_0x052a
        L_0x02aa:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.V(r7, r6, r14, r9)
            goto L_0x052a
        L_0x02bd:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.S(r7, r6, r14, r9)
            goto L_0x052a
        L_0x02d0:
            int r7 = r12.S(r5)
            long r10 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.O(r7, r6, r14, r9)
            goto L_0x052a
        L_0x02e3:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.a0(r7, r6, r14, r4)
            goto L_0x052a
        L_0x02f6:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.Z(r7, r6, r14, r4)
            goto L_0x052a
        L_0x0309:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.Y(r7, r6, r14, r4)
            goto L_0x052a
        L_0x031c:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.X(r7, r6, r14, r4)
            goto L_0x052a
        L_0x032f:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.P(r7, r6, r14, r4)
            goto L_0x052a
        L_0x0342:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.c0(r7, r6, r14, r4)
            goto L_0x052a
        L_0x0355:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.N(r7, r6, r14)
            goto L_0x052a
        L_0x0368:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d1 r8 = r12.t(r5)
            com.google.crypto.tink.shaded.protobuf.f1.W(r7, r6, r14, r8)
            goto L_0x052a
        L_0x037f:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.b0(r7, r6, r14)
            goto L_0x052a
        L_0x0392:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.M(r7, r6, r14, r4)
            goto L_0x052a
        L_0x03a5:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.Q(r7, r6, r14, r4)
            goto L_0x052a
        L_0x03b8:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.R(r7, r6, r14, r4)
            goto L_0x052a
        L_0x03cb:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.U(r7, r6, r14, r4)
            goto L_0x052a
        L_0x03de:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.d0(r7, r6, r14, r4)
            goto L_0x052a
        L_0x03f1:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.V(r7, r6, r14, r4)
            goto L_0x052a
        L_0x0404:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.S(r7, r6, r14, r4)
            goto L_0x052a
        L_0x0417:
            int r7 = r12.S(r5)
            long r8 = T(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.f1.O(r7, r6, r14, r4)
            goto L_0x052a
        L_0x042a:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            goto L_0x005b
        L_0x0432:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = J(r13, r8)
            goto L_0x007a
        L_0x0442:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = y(r13, r8)
            goto L_0x008d
        L_0x0452:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = J(r13, r8)
            goto L_0x00a0
        L_0x0462:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = y(r13, r8)
            goto L_0x00b3
        L_0x0472:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = y(r13, r8)
            goto L_0x00c6
        L_0x0482:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = y(r13, r8)
            goto L_0x00d9
        L_0x0492:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            goto L_0x00e4
        L_0x049a:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            goto L_0x00f9
        L_0x04a2:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            goto L_0x0110
        L_0x04aa:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            boolean r6 = l(r13, r8)
            goto L_0x012b
        L_0x04ba:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = y(r13, r8)
            goto L_0x013e
        L_0x04ca:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = J(r13, r8)
            goto L_0x0151
        L_0x04da:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            int r6 = y(r13, r8)
            goto L_0x0164
        L_0x04ea:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = J(r13, r8)
            goto L_0x0177
        L_0x04fa:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            long r8 = J(r13, r8)
            goto L_0x018a
        L_0x050a:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            float r6 = q(r13, r8)
            goto L_0x019d
        L_0x051a:
            boolean r8 = r12.A(r13, r5)
            if (r8 == 0) goto L_0x052a
            long r8 = T(r6)
            double r8 = n(r13, r8)
            goto L_0x01b0
        L_0x052a:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x052e:
            if (r2 == 0) goto L_0x0544
            com.google.crypto.tink.shaded.protobuf.q r3 = r12.f7225p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0542
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x052e
        L_0x0542:
            r2 = r1
            goto L_0x052e
        L_0x0544:
            com.google.crypto.tink.shaded.protobuf.j1 r0 = r12.f7224o
            r12.w0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.s0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.q1):void");
    }

    private d1 t(int i10) {
        int i11 = (i10 / 3) * 2;
        d1 d1Var = (d1) this.f7211b[i11];
        if (d1Var != null) {
            return d1Var;
        }
        d1 c10 = z0.a().c((Class) this.f7211b[i11 + 1]);
        this.f7211b[i11] = c10;
        return c10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r12.M(r5, com.google.crypto.tink.shaded.protobuf.n1.A(r11, T(r4)), t(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r12.B(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        r12.N(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r12.p(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        r12.i(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r12.I(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00df, code lost:
        r12.f(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ea, code lost:
        r12.v(r5, (com.google.crypto.tink.shaded.protobuf.h) com.google.crypto.tink.shaded.protobuf.n1.A(r11, T(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
        r12.s(r5, com.google.crypto.tink.shaded.protobuf.n1.A(r11, T(r4)), t(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        v0(r5, com.google.crypto.tink.shaded.protobuf.n1.A(r11, T(r4)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        r12.e(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0144, code lost:
        r12.n(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0157, code lost:
        r12.z(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        r12.k(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017d, code lost:
        r12.H(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0190, code lost:
        r12.d(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a3, code lost:
        r12.C(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b6, code lost:
        r12.o(r5, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t0(java.lang.Object r11, com.google.crypto.tink.shaded.protobuf.q1 r12) {
        /*
            r10 = this;
            com.google.crypto.tink.shaded.protobuf.j1 r0 = r10.f7224o
            r10.w0(r0, r11, r12)
            boolean r0 = r10.f7215f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.q r0 = r10.f7225p
            com.google.crypto.tink.shaded.protobuf.t r0 = r0.c(r11)
            boolean r2 = r0.d()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.a()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f7210a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x0534
            int r4 = r10.q0(r3)
            int r5 = r10.S(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.crypto.tink.shaded.protobuf.q r6 = r10.f7225p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.crypto.tink.shaded.protobuf.q r6 = r10.f7225p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = p0(r4)
            r7 = 0
            r8 = 1
            switch(r6) {
                case 0: goto L_0x0520;
                case 1: goto L_0x0510;
                case 2: goto L_0x0500;
                case 3: goto L_0x04f0;
                case 4: goto L_0x04e0;
                case 5: goto L_0x04d0;
                case 6: goto L_0x04c0;
                case 7: goto L_0x04b0;
                case 8: goto L_0x04a8;
                case 9: goto L_0x04a0;
                case 10: goto L_0x0498;
                case 11: goto L_0x0488;
                case 12: goto L_0x0478;
                case 13: goto L_0x0468;
                case 14: goto L_0x0458;
                case 15: goto L_0x0448;
                case 16: goto L_0x0438;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0530
        L_0x005b:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
        L_0x0061:
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            com.google.crypto.tink.shaded.protobuf.d1 r6 = r10.t(r3)
            r12.M(r5, r4, r6)
            goto L_0x0530
        L_0x0072:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = Y(r11, r6)
        L_0x0080:
            r12.B(r5, r6)
            goto L_0x0530
        L_0x0085:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = X(r11, r6)
        L_0x0093:
            r12.N(r5, r4)
            goto L_0x0530
        L_0x0098:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = Y(r11, r6)
        L_0x00a6:
            r12.p(r5, r6)
            goto L_0x0530
        L_0x00ab:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = X(r11, r6)
        L_0x00b9:
            r12.i(r5, r4)
            goto L_0x0530
        L_0x00be:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = X(r11, r6)
        L_0x00cc:
            r12.I(r5, r4)
            goto L_0x0530
        L_0x00d1:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = X(r11, r6)
        L_0x00df:
            r12.f(r5, r4)
            goto L_0x0530
        L_0x00e4:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
        L_0x00ea:
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            com.google.crypto.tink.shaded.protobuf.h r4 = (com.google.crypto.tink.shaded.protobuf.h) r4
            r12.v(r5, r4)
            goto L_0x0530
        L_0x00f9:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
        L_0x00ff:
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            com.google.crypto.tink.shaded.protobuf.d1 r6 = r10.t(r3)
            r12.s(r5, r4, r6)
            goto L_0x0530
        L_0x0110:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
        L_0x0116:
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            r10.v0(r5, r4, r12)
            goto L_0x0530
        L_0x0123:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            boolean r4 = U(r11, r6)
        L_0x0131:
            r12.e(r5, r4)
            goto L_0x0530
        L_0x0136:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = X(r11, r6)
        L_0x0144:
            r12.n(r5, r4)
            goto L_0x0530
        L_0x0149:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = Y(r11, r6)
        L_0x0157:
            r12.z(r5, r6)
            goto L_0x0530
        L_0x015c:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = X(r11, r6)
        L_0x016a:
            r12.k(r5, r4)
            goto L_0x0530
        L_0x016f:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = Y(r11, r6)
        L_0x017d:
            r12.H(r5, r6)
            goto L_0x0530
        L_0x0182:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = Y(r11, r6)
        L_0x0190:
            r12.d(r5, r6)
            goto L_0x0530
        L_0x0195:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            float r4 = W(r11, r6)
        L_0x01a3:
            r12.C(r5, r4)
            goto L_0x0530
        L_0x01a8:
            boolean r6 = r10.G(r11, r5, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            double r6 = V(r11, r6)
        L_0x01b6:
            r12.o(r5, r6)
            goto L_0x0530
        L_0x01bb:
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            r10.u0(r12, r5, r4, r3)
            goto L_0x0530
        L_0x01c8:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.d1 r6 = r10.t(r3)
            com.google.crypto.tink.shaded.protobuf.f1.T(r5, r4, r12, r6)
            goto L_0x0530
        L_0x01df:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.a0(r5, r4, r12, r8)
            goto L_0x0530
        L_0x01f2:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.Z(r5, r4, r12, r8)
            goto L_0x0530
        L_0x0205:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.Y(r5, r4, r12, r8)
            goto L_0x0530
        L_0x0218:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.X(r5, r4, r12, r8)
            goto L_0x0530
        L_0x022b:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.P(r5, r4, r12, r8)
            goto L_0x0530
        L_0x023e:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.c0(r5, r4, r12, r8)
            goto L_0x0530
        L_0x0251:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.M(r5, r4, r12, r8)
            goto L_0x0530
        L_0x0264:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.Q(r5, r4, r12, r8)
            goto L_0x0530
        L_0x0277:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.R(r5, r4, r12, r8)
            goto L_0x0530
        L_0x028a:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.U(r5, r4, r12, r8)
            goto L_0x0530
        L_0x029d:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.d0(r5, r4, r12, r8)
            goto L_0x0530
        L_0x02b0:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.V(r5, r4, r12, r8)
            goto L_0x0530
        L_0x02c3:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.S(r5, r4, r12, r8)
            goto L_0x0530
        L_0x02d6:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.O(r5, r4, r12, r8)
            goto L_0x0530
        L_0x02e9:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.a0(r5, r4, r12, r7)
            goto L_0x0530
        L_0x02fc:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.Z(r5, r4, r12, r7)
            goto L_0x0530
        L_0x030f:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.Y(r5, r4, r12, r7)
            goto L_0x0530
        L_0x0322:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.X(r5, r4, r12, r7)
            goto L_0x0530
        L_0x0335:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.P(r5, r4, r12, r7)
            goto L_0x0530
        L_0x0348:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.c0(r5, r4, r12, r7)
            goto L_0x0530
        L_0x035b:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.N(r5, r4, r12)
            goto L_0x0530
        L_0x036e:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.d1 r6 = r10.t(r3)
            com.google.crypto.tink.shaded.protobuf.f1.W(r5, r4, r12, r6)
            goto L_0x0530
        L_0x0385:
            int r5 = r10.S(r3)
            long r6 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.b0(r5, r4, r12)
            goto L_0x0530
        L_0x0398:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.M(r5, r4, r12, r7)
            goto L_0x0530
        L_0x03ab:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.Q(r5, r4, r12, r7)
            goto L_0x0530
        L_0x03be:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.R(r5, r4, r12, r7)
            goto L_0x0530
        L_0x03d1:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.U(r5, r4, r12, r7)
            goto L_0x0530
        L_0x03e4:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.d0(r5, r4, r12, r7)
            goto L_0x0530
        L_0x03f7:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.V(r5, r4, r12, r7)
            goto L_0x0530
        L_0x040a:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.S(r5, r4, r12, r7)
            goto L_0x0530
        L_0x041d:
            int r5 = r10.S(r3)
            long r8 = T(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.n1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.f1.O(r5, r4, r12, r7)
            goto L_0x0530
        L_0x0430:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            goto L_0x0061
        L_0x0438:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = J(r11, r6)
            goto L_0x0080
        L_0x0448:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = y(r11, r6)
            goto L_0x0093
        L_0x0458:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = J(r11, r6)
            goto L_0x00a6
        L_0x0468:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = y(r11, r6)
            goto L_0x00b9
        L_0x0478:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = y(r11, r6)
            goto L_0x00cc
        L_0x0488:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = y(r11, r6)
            goto L_0x00df
        L_0x0498:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            goto L_0x00ea
        L_0x04a0:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            goto L_0x00ff
        L_0x04a8:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            goto L_0x0116
        L_0x04b0:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            boolean r4 = l(r11, r6)
            goto L_0x0131
        L_0x04c0:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = y(r11, r6)
            goto L_0x0144
        L_0x04d0:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = J(r11, r6)
            goto L_0x0157
        L_0x04e0:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            int r4 = y(r11, r6)
            goto L_0x016a
        L_0x04f0:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = J(r11, r6)
            goto L_0x017d
        L_0x0500:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            long r6 = J(r11, r6)
            goto L_0x0190
        L_0x0510:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            float r4 = q(r11, r6)
            goto L_0x01a3
        L_0x0520:
            boolean r6 = r10.A(r11, r3)
            if (r6 == 0) goto L_0x0530
            long r6 = T(r4)
            double r6 = n(r11, r6)
            goto L_0x01b6
        L_0x0530:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x0534:
            if (r2 == 0) goto L_0x054b
            com.google.crypto.tink.shaded.protobuf.q r11 = r10.f7225p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0549
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x0534
        L_0x0549:
            r2 = r1
            goto L_0x0534
        L_0x054b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.t0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.q1):void");
    }

    static k1 u(Object obj) {
        x xVar = (x) obj;
        k1 k1Var = xVar.unknownFields;
        if (k1Var != k1.e()) {
            return k1Var;
        }
        k1 l10 = k1.l();
        xVar.unknownFields = l10;
        return l10;
    }

    private void u0(q1 q1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f7226q.f(s(i11));
            q1Var.x(i10, (h0.a) null, this.f7226q.g(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f1, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0202, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0213, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0224, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0235, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0247, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0259, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x027d, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x028f, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02a1, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b0, code lost:
        r6 = r6 + r3;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x035b, code lost:
        if ((r7 & r14) != 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0375, code lost:
        if ((r7 & r14) != 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x037b, code lost:
        if ((r7 & r14) != 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0395, code lost:
        if ((r7 & r14) != 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x039b, code lost:
        if ((r7 & r14) != 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03bd, code lost:
        if ((r7 & r14) != 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0416, code lost:
        r5 = r5 + 3;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (G(r1, r9, r5) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.k.r(r9, (com.google.crypto.tink.shaded.protobuf.o0) r2.getObject(r1, r12), t(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.k.H(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.k.F(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (G(r1, r9, r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.k.D(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (G(r1, r9, r5) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r4 = com.google.crypto.tink.shaded.protobuf.k.B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.k.j(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.k.M(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        if (G(r1, r9, r5) != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d6, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.k.f(r9, (com.google.crypto.tink.shaded.protobuf.h) r2.getObject(r1, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        if (G(r1, r9, r5) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.f1.o(r9, r2.getObject(r1, r12), t(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        if (G(r1, r9, r5) != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0118, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.k.d(r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01af, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b1, code lost:
        r2.putInt(r1, (long) r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b5, code lost:
        r4 = (com.google.crypto.tink.shaded.protobuf.k.L(r9) + com.google.crypto.tink.shaded.protobuf.k.N(r3)) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cf, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e0, code lost:
        if (r0.f7218i != false) goto L_0x01b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int v(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f7209s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f7210a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x041b
            int r8 = r0.q0(r5)
            int r9 = r0.S(r5)
            int r10 = p0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.f7210a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0058
        L_0x0039:
            boolean r11 = r0.f7218i
            if (r11 == 0) goto L_0x0056
            com.google.crypto.tink.shaded.protobuf.u r11 = com.google.crypto.tink.shaded.protobuf.u.DOUBLE_LIST_PACKED
            int r11 = r11.a()
            if (r10 < r11) goto L_0x0056
            com.google.crypto.tink.shaded.protobuf.u r11 = com.google.crypto.tink.shaded.protobuf.u.SINT64_LIST_PACKED
            int r11 = r11.a()
            if (r10 > r11) goto L_0x0056
            int[] r11 = r0.f7210a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
        L_0x0054:
            r14 = 0
            goto L_0x0058
        L_0x0056:
            r11 = 0
            goto L_0x0054
        L_0x0058:
            long r12 = T(r8)
            r15 = r4
            r8 = 0
            r3 = 0
            switch(r10) {
                case 0: goto L_0x040a;
                case 1: goto L_0x0400;
                case 2: goto L_0x03f2;
                case 3: goto L_0x03e4;
                case 4: goto L_0x03d6;
                case 5: goto L_0x03cc;
                case 6: goto L_0x03c1;
                case 7: goto L_0x03bb;
                case 8: goto L_0x039f;
                case 9: goto L_0x0399;
                case 10: goto L_0x0393;
                case 11: goto L_0x0389;
                case 12: goto L_0x037f;
                case 13: goto L_0x0379;
                case 14: goto L_0x0373;
                case 15: goto L_0x0369;
                case 16: goto L_0x035f;
                case 17: goto L_0x0359;
                case 18: goto L_0x034c;
                case 19: goto L_0x02cc;
                case 20: goto L_0x033f;
                case 21: goto L_0x0332;
                case 22: goto L_0x0325;
                case 23: goto L_0x02c0;
                case 24: goto L_0x02cc;
                case 25: goto L_0x0319;
                case 26: goto L_0x030d;
                case 27: goto L_0x02fd;
                case 28: goto L_0x02f1;
                case 29: goto L_0x02e4;
                case 30: goto L_0x02d8;
                case 31: goto L_0x02cc;
                case 32: goto L_0x02c0;
                case 33: goto L_0x02b4;
                case 34: goto L_0x02a5;
                case 35: goto L_0x0293;
                case 36: goto L_0x0281;
                case 37: goto L_0x026f;
                case 38: goto L_0x025d;
                case 39: goto L_0x024b;
                case 40: goto L_0x0239;
                case 41: goto L_0x0227;
                case 42: goto L_0x0216;
                case 43: goto L_0x0205;
                case 44: goto L_0x01f4;
                case 45: goto L_0x01e3;
                case 46: goto L_0x01d2;
                case 47: goto L_0x01c1;
                case 48: goto L_0x01a1;
                case 49: goto L_0x0191;
                case 50: goto L_0x0181;
                case 51: goto L_0x0173;
                case 52: goto L_0x0167;
                case 53: goto L_0x0157;
                case 54: goto L_0x0147;
                case 55: goto L_0x0137;
                case 56: goto L_0x012b;
                case 57: goto L_0x011f;
                case 58: goto L_0x0112;
                case 59: goto L_0x00f4;
                case 60: goto L_0x00e1;
                case 61: goto L_0x00d0;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b2;
                case 64: goto L_0x00a5;
                case 65: goto L_0x009a;
                case 66: goto L_0x008b;
                case 67: goto L_0x007c;
                case 68: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0079
        L_0x0064:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
        L_0x006a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.o0 r3 = (com.google.crypto.tink.shaded.protobuf.o0) r3
            com.google.crypto.tink.shaded.protobuf.d1 r4 = r0.t(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.k.r(r9, r3, r4)
        L_0x0078:
            int r6 = r6 + r3
        L_0x0079:
            r10 = 0
            goto L_0x0416
        L_0x007c:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            long r3 = Y(r1, r12)
        L_0x0086:
            int r3 = com.google.crypto.tink.shaded.protobuf.k.H(r9, r3)
            goto L_0x0078
        L_0x008b:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = X(r1, r12)
        L_0x0095:
            int r3 = com.google.crypto.tink.shaded.protobuf.k.F(r9, r3)
            goto L_0x0078
        L_0x009a:
            boolean r8 = r0.G(r1, r9, r5)
            if (r8 == 0) goto L_0x0079
        L_0x00a0:
            int r3 = com.google.crypto.tink.shaded.protobuf.k.D(r9, r3)
            goto L_0x0078
        L_0x00a5:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
        L_0x00ab:
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.k.B(r9, r3)
        L_0x00b0:
            int r6 = r6 + r4
            goto L_0x0079
        L_0x00b2:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = X(r1, r12)
        L_0x00bc:
            int r3 = com.google.crypto.tink.shaded.protobuf.k.j(r9, r3)
            goto L_0x0078
        L_0x00c1:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = X(r1, r12)
        L_0x00cb:
            int r3 = com.google.crypto.tink.shaded.protobuf.k.M(r9, r3)
            goto L_0x0078
        L_0x00d0:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
        L_0x00d6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.h) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.k.f(r9, r3)
            goto L_0x0078
        L_0x00e1:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
        L_0x00e7:
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.d1 r4 = r0.t(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.o(r9, r3, r4)
            goto L_0x0078
        L_0x00f4:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.h
            if (r4 == 0) goto L_0x010a
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.h) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.k.f(r9, r3)
            goto L_0x0078
        L_0x010a:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.k.J(r9, r3)
            goto L_0x0078
        L_0x0112:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
        L_0x0118:
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.k.d(r9, r3)
            goto L_0x0078
        L_0x011f:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.k.l(r9, r3)
            goto L_0x00b0
        L_0x012b:
            boolean r8 = r0.G(r1, r9, r5)
            if (r8 == 0) goto L_0x0079
            int r3 = com.google.crypto.tink.shaded.protobuf.k.n(r9, r3)
            goto L_0x0078
        L_0x0137:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = X(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.k.t(r9, r3)
            goto L_0x0078
        L_0x0147:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            long r3 = Y(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.k.O(r9, r3)
            goto L_0x0078
        L_0x0157:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            long r3 = Y(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.k.v(r9, r3)
            goto L_0x0078
        L_0x0167:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            int r3 = com.google.crypto.tink.shaded.protobuf.k.p(r9, r8)
            goto L_0x0078
        L_0x0173:
            boolean r3 = r0.G(r1, r9, r5)
            if (r3 == 0) goto L_0x0079
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.k.h(r9, r3)
            goto L_0x0078
        L_0x0181:
            com.google.crypto.tink.shaded.protobuf.j0 r3 = r0.f7226q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.s(r5)
            int r3 = r3.c(r9, r4, r8)
            goto L_0x0078
        L_0x0191:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.d1 r4 = r0.t(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.j(r9, r3, r4)
            goto L_0x0078
        L_0x01a1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.t(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
        L_0x01b1:
            long r11 = (long) r11
            r2.putInt(r1, r11, r3)
        L_0x01b5:
            int r4 = com.google.crypto.tink.shaded.protobuf.k.L(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.k.N(r3)
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x00b0
        L_0x01c1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.r(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x01d2:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.i(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x01e3:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.g(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x01f4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.e(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x0205:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.w(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x0216:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.b(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x0227:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.g(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x0239:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.i(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x024b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.l(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x025d:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.y(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x026f:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.n(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x0281:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.g(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x0293:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.i(r3)
            if (r3 <= 0) goto L_0x0079
            boolean r4 = r0.f7218i
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b1
        L_0x02a5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.s(r9, r3, r4)
        L_0x02b0:
            int r6 = r6 + r3
            r10 = r4
            goto L_0x0416
        L_0x02b4:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.q(r9, r3, r4)
            goto L_0x02b0
        L_0x02c0:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.h(r9, r3, r4)
            goto L_0x02b0
        L_0x02cc:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.f(r9, r3, r4)
            goto L_0x02b0
        L_0x02d8:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.d(r9, r3, r4)
            goto L_0x02b0
        L_0x02e4:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.v(r9, r3, r4)
            goto L_0x0078
        L_0x02f1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.c(r9, r3)
            goto L_0x0078
        L_0x02fd:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.d1 r4 = r0.t(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.p(r9, r3, r4)
            goto L_0x0078
        L_0x030d:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.u(r9, r3)
            goto L_0x0078
        L_0x0319:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.a(r9, r3, r4)
            goto L_0x02b0
        L_0x0325:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.k(r9, r3, r4)
            goto L_0x02b0
        L_0x0332:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.x(r9, r3, r4)
            goto L_0x02b0
        L_0x033f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.m(r9, r3, r4)
            goto L_0x02b0
        L_0x034c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.f1.h(r9, r3, r4)
            goto L_0x0078
        L_0x0359:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            goto L_0x006a
        L_0x035f:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            long r3 = r2.getLong(r1, r12)
            goto L_0x0086
        L_0x0369:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            int r3 = r2.getInt(r1, r12)
            goto L_0x0095
        L_0x0373:
            r10 = r7 & r14
            if (r10 == 0) goto L_0x0079
            goto L_0x00a0
        L_0x0379:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            goto L_0x00ab
        L_0x037f:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            int r3 = r2.getInt(r1, r12)
            goto L_0x00bc
        L_0x0389:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            int r3 = r2.getInt(r1, r12)
            goto L_0x00cb
        L_0x0393:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            goto L_0x00d6
        L_0x0399:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            goto L_0x00e7
        L_0x039f:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.h
            if (r4 == 0) goto L_0x03b3
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.h) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.k.f(r9, r3)
            goto L_0x0078
        L_0x03b3:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.k.J(r9, r3)
            goto L_0x0078
        L_0x03bb:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            goto L_0x0118
        L_0x03c1:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0079
            r10 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.k.l(r9, r10)
        L_0x03ca:
            int r6 = r6 + r3
            goto L_0x0416
        L_0x03cc:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0416
            int r3 = com.google.crypto.tink.shaded.protobuf.k.n(r9, r3)
            goto L_0x03ca
        L_0x03d6:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0416
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.k.t(r9, r3)
            goto L_0x03ca
        L_0x03e4:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0416
            long r3 = r2.getLong(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.k.O(r9, r3)
            goto L_0x03ca
        L_0x03f2:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0416
            long r3 = r2.getLong(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.k.v(r9, r3)
            goto L_0x03ca
        L_0x0400:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0416
            int r3 = com.google.crypto.tink.shaded.protobuf.k.p(r9, r8)
            goto L_0x03ca
        L_0x040a:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0416
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.k.h(r9, r3)
            goto L_0x03ca
        L_0x0416:
            int r5 = r5 + 3
            r4 = r15
            goto L_0x000a
        L_0x041b:
            com.google.crypto.tink.shaded.protobuf.j1 r2 = r0.f7224o
            int r2 = r0.x(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f7215f
            if (r2 == 0) goto L_0x0431
            com.google.crypto.tink.shaded.protobuf.q r2 = r0.f7225p
            com.google.crypto.tink.shaded.protobuf.t r1 = r2.c(r1)
            int r1 = r1.c()
            int r6 = r6 + r1
        L_0x0431:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.v(java.lang.Object):int");
    }

    private void v0(int i10, Object obj, q1 q1Var) {
        if (obj instanceof String) {
            q1Var.F(i10, (String) obj);
        } else {
            q1Var.v(i10, (h) obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e4, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f5, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0206, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0218, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x022a, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x023c, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x024e, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0260, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0272, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.r(r8, (com.google.crypto.tink.shaded.protobuf.o0) com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9), t(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0360, code lost:
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.h) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.H(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03b0, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.F(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.D(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.B(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.j(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.M(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.f(r8, (com.google.crypto.tink.shaded.protobuf.h) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c2, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.f1.o(r8, com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9), t(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.h) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.J(r8, (java.lang.String) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ec, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.d(r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f8, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.l(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0104, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.n(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0114, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.t(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0124, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.O(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0134, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.v(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0140, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.p(r8, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014c, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.k.h(r8, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0180, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0182, code lost:
        r2.putInt(r1, (long) r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0186, code lost:
        r6 = (com.google.crypto.tink.shaded.protobuf.k.L(r8) + com.google.crypto.tink.shaded.protobuf.k.N(r7)) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a0, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b1, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c2, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d3, code lost:
        if (r0.f7218i != false) goto L_0x0182;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int w(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f7209s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f7210a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x03b4
            int r6 = r15.q0(r4)
            int r7 = p0(r6)
            int r8 = r15.S(r4)
            long r9 = T(r6)
            com.google.crypto.tink.shaded.protobuf.u r6 = com.google.crypto.tink.shaded.protobuf.u.DOUBLE_LIST_PACKED
            int r6 = r6.a()
            if (r7 < r6) goto L_0x0038
            com.google.crypto.tink.shaded.protobuf.u r6 = com.google.crypto.tink.shaded.protobuf.u.SINT64_LIST_PACKED
            int r6 = r6.a()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f7210a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r13 = 0
            r14 = 1
            r11 = 0
            switch(r7) {
                case 0: goto L_0x03a8;
                case 1: goto L_0x03a0;
                case 2: goto L_0x0394;
                case 3: goto L_0x0388;
                case 4: goto L_0x037c;
                case 5: goto L_0x0374;
                case 6: goto L_0x036c;
                case 7: goto L_0x0364;
                case 8: goto L_0x0354;
                case 9: goto L_0x034c;
                case 10: goto L_0x0344;
                case 11: goto L_0x0338;
                case 12: goto L_0x032c;
                case 13: goto L_0x0324;
                case 14: goto L_0x031c;
                case 15: goto L_0x0310;
                case 16: goto L_0x0304;
                case 17: goto L_0x02fc;
                case 18: goto L_0x028a;
                case 19: goto L_0x0294;
                case 20: goto L_0x02f2;
                case 21: goto L_0x02e8;
                case 22: goto L_0x02de;
                case 23: goto L_0x028a;
                case 24: goto L_0x0294;
                case 25: goto L_0x02d4;
                case 26: goto L_0x02ca;
                case 27: goto L_0x02bc;
                case 28: goto L_0x02b2;
                case 29: goto L_0x02a8;
                case 30: goto L_0x029e;
                case 31: goto L_0x0294;
                case 32: goto L_0x028a;
                case 33: goto L_0x0280;
                case 34: goto L_0x0276;
                case 35: goto L_0x0264;
                case 36: goto L_0x0252;
                case 37: goto L_0x0240;
                case 38: goto L_0x022e;
                case 39: goto L_0x021c;
                case 40: goto L_0x020a;
                case 41: goto L_0x01f8;
                case 42: goto L_0x01e7;
                case 43: goto L_0x01d6;
                case 44: goto L_0x01c5;
                case 45: goto L_0x01b4;
                case 46: goto L_0x01a3;
                case 47: goto L_0x0192;
                case 48: goto L_0x0172;
                case 49: goto L_0x0164;
                case 50: goto L_0x0154;
                case 51: goto L_0x0146;
                case 52: goto L_0x013a;
                case 53: goto L_0x012a;
                case 54: goto L_0x011a;
                case 55: goto L_0x010a;
                case 56: goto L_0x00fe;
                case 57: goto L_0x00f2;
                case 58: goto L_0x00e6;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00ab;
                case 62: goto L_0x009c;
                case 63: goto L_0x008d;
                case 64: goto L_0x0082;
                case 65: goto L_0x0077;
                case 66: goto L_0x0068;
                case 67: goto L_0x0059;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x03b0
        L_0x0042:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x0048:
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9)
            com.google.crypto.tink.shaded.protobuf.o0 r6 = (com.google.crypto.tink.shaded.protobuf.o0) r6
            com.google.crypto.tink.shaded.protobuf.d1 r7 = r15.t(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.k.r(r8, r6, r7)
        L_0x0056:
            int r5 = r5 + r6
            goto L_0x03b0
        L_0x0059:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
            long r6 = Y(r1, r9)
        L_0x0063:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.H(r8, r6)
            goto L_0x0056
        L_0x0068:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
            int r6 = X(r1, r9)
        L_0x0072:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.F(r8, r6)
            goto L_0x0056
        L_0x0077:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x007d:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.D(r8, r11)
            goto L_0x0056
        L_0x0082:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x0088:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.B(r8, r3)
            goto L_0x0056
        L_0x008d:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
            int r6 = X(r1, r9)
        L_0x0097:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.j(r8, r6)
            goto L_0x0056
        L_0x009c:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
            int r6 = X(r1, r9)
        L_0x00a6:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.M(r8, r6)
            goto L_0x0056
        L_0x00ab:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x00b1:
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9)
        L_0x00b5:
            com.google.crypto.tink.shaded.protobuf.h r6 = (com.google.crypto.tink.shaded.protobuf.h) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.k.f(r8, r6)
            goto L_0x0056
        L_0x00bc:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x00c2:
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9)
            com.google.crypto.tink.shaded.protobuf.d1 r7 = r15.t(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.o(r8, r6, r7)
            goto L_0x0056
        L_0x00cf:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.h
            if (r7 == 0) goto L_0x00de
        L_0x00dd:
            goto L_0x00b5
        L_0x00de:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.k.J(r8, r6)
            goto L_0x0056
        L_0x00e6:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x00ec:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.d(r8, r14)
            goto L_0x0056
        L_0x00f2:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x00f8:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.l(r8, r3)
            goto L_0x0056
        L_0x00fe:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x0104:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.n(r8, r11)
            goto L_0x0056
        L_0x010a:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
            int r6 = X(r1, r9)
        L_0x0114:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.t(r8, r6)
            goto L_0x0056
        L_0x011a:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
            long r6 = Y(r1, r9)
        L_0x0124:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.O(r8, r6)
            goto L_0x0056
        L_0x012a:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
            long r6 = Y(r1, r9)
        L_0x0134:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.v(r8, r6)
            goto L_0x0056
        L_0x013a:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x0140:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.p(r8, r13)
            goto L_0x0056
        L_0x0146:
            boolean r6 = r15.G(r1, r8, r4)
            if (r6 == 0) goto L_0x03b0
        L_0x014c:
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.k.h(r8, r6)
            goto L_0x0056
        L_0x0154:
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r0.f7226q
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9)
            java.lang.Object r9 = r15.s(r4)
            int r6 = r6.c(r8, r7, r9)
            goto L_0x0056
        L_0x0164:
            java.util.List r6 = I(r1, r9)
            com.google.crypto.tink.shaded.protobuf.d1 r7 = r15.t(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.j(r8, r6, r7)
            goto L_0x0056
        L_0x0172:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.t(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
        L_0x0182:
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0186:
            int r6 = com.google.crypto.tink.shaded.protobuf.k.L(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.k.N(r7)
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0056
        L_0x0192:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.r(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x01a3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.i(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x01b4:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.g(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x01c5:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.e(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x01d6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.w(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x01e7:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.b(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.g(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x020a:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.i(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x021c:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.l(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x022e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.y(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x0240:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.n(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.g(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x0264:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.f1.i(r7)
            if (r7 <= 0) goto L_0x03b0
            boolean r9 = r0.f7218i
            if (r9 == 0) goto L_0x0186
            goto L_0x0182
        L_0x0276:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.s(r8, r6, r3)
            goto L_0x0056
        L_0x0280:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.q(r8, r6, r3)
            goto L_0x0056
        L_0x028a:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.h(r8, r6, r3)
            goto L_0x0056
        L_0x0294:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.f(r8, r6, r3)
            goto L_0x0056
        L_0x029e:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.d(r8, r6, r3)
            goto L_0x0056
        L_0x02a8:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.v(r8, r6, r3)
            goto L_0x0056
        L_0x02b2:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.c(r8, r6)
            goto L_0x0056
        L_0x02bc:
            java.util.List r6 = I(r1, r9)
            com.google.crypto.tink.shaded.protobuf.d1 r7 = r15.t(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.p(r8, r6, r7)
            goto L_0x0056
        L_0x02ca:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.u(r8, r6)
            goto L_0x0056
        L_0x02d4:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.a(r8, r6, r3)
            goto L_0x0056
        L_0x02de:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.k(r8, r6, r3)
            goto L_0x0056
        L_0x02e8:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.x(r8, r6, r3)
            goto L_0x0056
        L_0x02f2:
            java.util.List r6 = I(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.f1.m(r8, r6, r3)
            goto L_0x0056
        L_0x02fc:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x0048
        L_0x0304:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            long r6 = com.google.crypto.tink.shaded.protobuf.n1.y(r1, r9)
            goto L_0x0063
        L_0x0310:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            int r6 = com.google.crypto.tink.shaded.protobuf.n1.x(r1, r9)
            goto L_0x0072
        L_0x031c:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x007d
        L_0x0324:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x0088
        L_0x032c:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            int r6 = com.google.crypto.tink.shaded.protobuf.n1.x(r1, r9)
            goto L_0x0097
        L_0x0338:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            int r6 = com.google.crypto.tink.shaded.protobuf.n1.x(r1, r9)
            goto L_0x00a6
        L_0x0344:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x00b1
        L_0x034c:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x00c2
        L_0x0354:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.n1.A(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.h
            if (r7 == 0) goto L_0x00de
            goto L_0x00dd
        L_0x0364:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x00ec
        L_0x036c:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x00f8
        L_0x0374:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x0104
        L_0x037c:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            int r6 = com.google.crypto.tink.shaded.protobuf.n1.x(r1, r9)
            goto L_0x0114
        L_0x0388:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            long r6 = com.google.crypto.tink.shaded.protobuf.n1.y(r1, r9)
            goto L_0x0124
        L_0x0394:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            long r6 = com.google.crypto.tink.shaded.protobuf.n1.y(r1, r9)
            goto L_0x0134
        L_0x03a0:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x0140
        L_0x03a8:
            boolean r6 = r15.A(r1, r4)
            if (r6 == 0) goto L_0x03b0
            goto L_0x014c
        L_0x03b0:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x03b4:
            com.google.crypto.tink.shaded.protobuf.j1 r2 = r0.f7224o
            int r1 = r15.x(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.w(java.lang.Object):int");
    }

    private void w0(j1 j1Var, Object obj, q1 q1Var) {
        j1Var.t(j1Var.g(obj), q1Var);
    }

    private int x(j1 j1Var, Object obj) {
        return j1Var.h(j1Var.g(obj));
    }

    private static int y(Object obj, long j10) {
        return n1.x(obj, j10);
    }

    private static boolean z(int i10) {
        return (i10 & 536870912) != 0;
    }

    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.f7210a.length; i10 += 3) {
            O(obj, obj2, i10);
        }
        f1.F(this.f7224o, obj, obj2);
        if (this.f7215f) {
            f1.D(this.f7225p, obj, obj2);
        }
    }

    public void b(Object obj, byte[] bArr, int i10, int i11, e.a aVar) {
        if (this.f7217h) {
            c0(obj, bArr, i10, i11, aVar);
        } else {
            b0(obj, bArr, i10, i11, 0, aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0318, code lost:
        if (r0 != r15) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0334, code lost:
        r8 = r31;
        r2 = r0;
        r0 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0366, code lost:
        if (r0 != r15) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0387, code lost:
        if (r0 != r15) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d2, code lost:
        r3 = r31;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        r11 = r33;
        r2 = r8;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e3, code lost:
        r12 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
        r10.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        r6 = r6 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017f, code lost:
        r6 = r6 | r20;
        r3 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01aa, code lost:
        r10.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0204, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0272, code lost:
        r0 = r33;
        r20 = r6;
        r25 = r7;
        r18 = r8;
        r27 = r10;
        r2 = r13;
        r8 = r31;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b0(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.e.a r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f7209s
            r16 = 0
            r0 = r31
            r2 = r16
            r3 = r2
            r6 = r3
            r1 = -1
            r7 = -1
        L_0x0018:
            if (r0 >= r13) goto L_0x03df
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.crypto.tink.shaded.protobuf.e.G(r0, r12, r3, r9)
            int r3 = r9.f7064a
            r4 = r0
            r5 = r3
            goto L_0x002b
        L_0x0029:
            r5 = r0
            r4 = r3
        L_0x002b:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x003a
            int r2 = r2 / r8
            int r1 = r15.f0(r3, r2)
        L_0x0037:
            r2 = r1
            r1 = -1
            goto L_0x003f
        L_0x003a:
            int r1 = r15.e0(r3)
            goto L_0x0037
        L_0x003f:
            if (r2 != r1) goto L_0x0050
            r17 = r3
            r2 = r4
            r8 = r5
            r20 = r6
            r25 = r7
            r27 = r10
            r0 = r11
            r18 = r16
            goto L_0x038a
        L_0x0050:
            int[] r1 = r15.f7210a
            int r18 = r2 + 1
            r1 = r1[r18]
            int r8 = p0(r1)
            long r11 = T(r1)
            r18 = r5
            r5 = 17
            r19 = r1
            if (r8 > r5) goto L_0x0281
            int[] r5 = r15.f7210a
            int r20 = r2 + 2
            r5 = r5[r20]
            int r20 = r5 >>> 20
            r1 = 1
            int r20 = r1 << r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r21
            if (r5 == r7) goto L_0x0088
            r13 = -1
            r17 = r2
            if (r7 == r13) goto L_0x0081
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
        L_0x0081:
            long r1 = (long) r5
            int r6 = r10.getInt(r14, r1)
            r7 = r5
            goto L_0x008b
        L_0x0088:
            r17 = r2
            r13 = -1
        L_0x008b:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x025c;
                case 1: goto L_0x0244;
                case 2: goto L_0x021d;
                case 3: goto L_0x021d;
                case 4: goto L_0x0208;
                case 5: goto L_0x01e8;
                case 6: goto L_0x01d0;
                case 7: goto L_0x01ae;
                case 8: goto L_0x018a;
                case 9: goto L_0x0156;
                case 10: goto L_0x0140;
                case 11: goto L_0x0208;
                case 12: goto L_0x012b;
                case 13: goto L_0x01d0;
                case 14: goto L_0x01e8;
                case 15: goto L_0x0110;
                case 16: goto L_0x00e7;
                case 17: goto L_0x009b;
                default: goto L_0x008f;
            }
        L_0x008f:
            r12 = r30
            r11 = r13
            r8 = r17
            r31 = r18
            r17 = r3
        L_0x0098:
            r13 = r4
            goto L_0x0272
        L_0x009b:
            r1 = 3
            if (r0 != r1) goto L_0x00dd
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r17
            com.google.crypto.tink.shaded.protobuf.d1 r0 = r15.t(r2)
            r1 = r30
            r8 = r2
            r2 = r4
            r17 = r3
            r3 = r32
            r4 = r5
            r31 = r18
            r5 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.e.m(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x00c3
            java.lang.Object r1 = r9.f7066c
        L_0x00bf:
            r10.putObject(r14, r11, r1)
            goto L_0x00ce
        L_0x00c3:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f7066c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.z.h(r1, r2)
            goto L_0x00bf
        L_0x00ce:
            r6 = r6 | r20
            r12 = r30
        L_0x00d2:
            r3 = r31
            r13 = r32
        L_0x00d6:
            r11 = r33
            r2 = r8
            r1 = r17
            goto L_0x0018
        L_0x00dd:
            r8 = r17
            r31 = r18
            r17 = r3
        L_0x00e3:
            r12 = r30
        L_0x00e5:
            r11 = r13
            goto L_0x0098
        L_0x00e7:
            r8 = r17
            r31 = r18
            r17 = r3
            if (r0 != 0) goto L_0x00e3
            r2 = r11
            r12 = r30
            int r11 = com.google.crypto.tink.shaded.protobuf.e.K(r12, r4, r9)
            long r0 = r9.f7065b
            long r4 = com.google.crypto.tink.shaded.protobuf.i.c(r0)
            r0 = r10
            r1 = r29
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r3 = r31
            r13 = r32
            r2 = r8
            r0 = r11
            r1 = r17
            r11 = r33
            goto L_0x0018
        L_0x0110:
            r8 = r17
            r31 = r18
            r17 = r3
            r2 = r11
            r12 = r30
            if (r0 != 0) goto L_0x00e5
            int r0 = com.google.crypto.tink.shaded.protobuf.e.H(r12, r4, r9)
            int r1 = r9.f7064a
            int r1 = com.google.crypto.tink.shaded.protobuf.i.b(r1)
        L_0x0125:
            r10.putInt(r14, r2, r1)
        L_0x0128:
            r6 = r6 | r20
            goto L_0x00d2
        L_0x012b:
            r8 = r17
            r31 = r18
            r17 = r3
            r2 = r11
            r12 = r30
            if (r0 != 0) goto L_0x00e5
            int r0 = com.google.crypto.tink.shaded.protobuf.e.H(r12, r4, r9)
            int r1 = r9.f7064a
            r15.r(r8)
            goto L_0x0125
        L_0x0140:
            r8 = r17
            r31 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r30
            if (r0 != r1) goto L_0x00e5
            int r0 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r4, r9)
            java.lang.Object r1 = r9.f7066c
            r10.putObject(r14, r2, r1)
            goto L_0x0128
        L_0x0156:
            r8 = r17
            r31 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r30
            if (r0 != r1) goto L_0x0185
            com.google.crypto.tink.shaded.protobuf.d1 r0 = r15.t(r8)
            r11 = r13
            r13 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.e.o(r0, r12, r4, r13, r9)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x0174
            java.lang.Object r1 = r9.f7066c
            goto L_0x01aa
        L_0x0174:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f7066c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.z.h(r1, r4)
            goto L_0x01aa
        L_0x017f:
            r6 = r6 | r20
            r3 = r31
            goto L_0x00d6
        L_0x0185:
            r11 = r13
            r13 = r32
            goto L_0x0098
        L_0x018a:
            r8 = r17
            r31 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r11 = r13
            r12 = r30
            r13 = r32
            if (r0 != r1) goto L_0x0098
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x01a4
            int r0 = com.google.crypto.tink.shaded.protobuf.e.B(r12, r4, r9)
            goto L_0x01a8
        L_0x01a4:
            int r0 = com.google.crypto.tink.shaded.protobuf.e.E(r12, r4, r9)
        L_0x01a8:
            java.lang.Object r1 = r9.f7066c
        L_0x01aa:
            r10.putObject(r14, r2, r1)
            goto L_0x017f
        L_0x01ae:
            r8 = r17
            r31 = r18
            r17 = r3
            r2 = r11
            r11 = r13
            r12 = r30
            r13 = r32
            if (r0 != 0) goto L_0x0098
            int r0 = com.google.crypto.tink.shaded.protobuf.e.K(r12, r4, r9)
            long r4 = r9.f7065b
            r18 = 0
            int r1 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x01ca
            r1 = 1
            goto L_0x01cc
        L_0x01ca:
            r1 = r16
        L_0x01cc:
            com.google.crypto.tink.shaded.protobuf.n1.E(r14, r2, r1)
            goto L_0x017f
        L_0x01d0:
            r8 = r17
            r31 = r18
            r17 = r3
            r2 = r11
            r11 = r13
            r12 = r30
            r13 = r32
            if (r0 != r1) goto L_0x0098
            int r0 = com.google.crypto.tink.shaded.protobuf.e.g(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
            goto L_0x017f
        L_0x01e8:
            r8 = r17
            r31 = r18
            r1 = 1
            r17 = r3
            r2 = r11
            r11 = r13
            r12 = r30
            r13 = r32
            if (r0 != r1) goto L_0x0098
            long r18 = com.google.crypto.tink.shaded.protobuf.e.i(r12, r4)
            r0 = r10
            r1 = r29
            r13 = r4
            r4 = r18
            r0.putLong(r1, r2, r4)
        L_0x0204:
            int r0 = r13 + 8
            goto L_0x0128
        L_0x0208:
            r8 = r17
            r31 = r18
            r17 = r3
            r2 = r11
            r11 = r13
            r12 = r30
            r13 = r4
            if (r0 != 0) goto L_0x0272
            int r0 = com.google.crypto.tink.shaded.protobuf.e.H(r12, r13, r9)
            int r1 = r9.f7064a
            goto L_0x0125
        L_0x021d:
            r8 = r17
            r31 = r18
            r17 = r3
            r2 = r11
            r11 = r13
            r12 = r30
            r13 = r4
            if (r0 != 0) goto L_0x0272
            int r13 = com.google.crypto.tink.shaded.protobuf.e.K(r12, r13, r9)
            long r4 = r9.f7065b
            r0 = r10
            r1 = r29
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r3 = r31
            r11 = r33
            r2 = r8
            r0 = r13
            r1 = r17
            r13 = r32
            goto L_0x0018
        L_0x0244:
            r8 = r17
            r31 = r18
            r17 = r3
            r2 = r11
            r11 = r13
            r12 = r30
            r13 = r4
            if (r0 != r1) goto L_0x0272
            float r0 = com.google.crypto.tink.shaded.protobuf.e.k(r12, r13)
            com.google.crypto.tink.shaded.protobuf.n1.L(r14, r2, r0)
            int r0 = r13 + 4
            goto L_0x0128
        L_0x025c:
            r8 = r17
            r31 = r18
            r1 = 1
            r17 = r3
            r2 = r11
            r11 = r13
            r12 = r30
            r13 = r4
            if (r0 != r1) goto L_0x0272
            double r0 = com.google.crypto.tink.shaded.protobuf.e.d(r12, r13)
            com.google.crypto.tink.shaded.protobuf.n1.K(r14, r2, r0)
            goto L_0x0204
        L_0x0272:
            r0 = r33
            r20 = r6
            r25 = r7
            r18 = r8
            r27 = r10
            r2 = r13
            r8 = r31
            goto L_0x038a
        L_0x0281:
            r5 = r2
            r17 = r3
            r13 = r4
            r2 = r11
            r31 = r18
            r11 = -1
            r12 = r30
            r1 = 27
            if (r8 != r1) goto L_0x02e0
            r1 = 2
            if (r0 != r1) goto L_0x02d5
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.crypto.tink.shaded.protobuf.z$d r0 = (com.google.crypto.tink.shaded.protobuf.z.d) r0
            boolean r1 = r0.c0()
            if (r1 != 0) goto L_0x02b0
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02a7
            r1 = 10
            goto L_0x02a9
        L_0x02a7:
            int r1 = r1 * 2
        L_0x02a9:
            com.google.crypto.tink.shaded.protobuf.z$d r0 = r0.z(r1)
            r10.putObject(r14, r2, r0)
        L_0x02b0:
            r8 = r0
            com.google.crypto.tink.shaded.protobuf.d1 r0 = r15.t(r5)
            r1 = r31
            r2 = r30
            r3 = r13
            r4 = r32
            r18 = r5
            r5 = r8
            r20 = r6
            r6 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.e.p(r0, r1, r2, r3, r4, r5, r6)
            r3 = r31
            r13 = r32
            r11 = r33
            r1 = r17
            r2 = r18
            r6 = r20
            goto L_0x0018
        L_0x02d5:
            r18 = r5
            r20 = r6
            r25 = r7
            r27 = r10
            r15 = r13
            goto L_0x0369
        L_0x02e0:
            r18 = r5
            r20 = r6
            r1 = 49
            if (r8 > r1) goto L_0x033b
            r1 = r19
            long r5 = (long) r1
            r4 = r0
            r0 = r28
            r1 = r29
            r21 = r2
            r2 = r30
            r3 = r13
            r19 = r4
            r4 = r32
            r23 = r5
            r5 = r31
            r6 = r17
            r25 = r7
            r7 = r19
            r26 = r8
            r8 = r18
            r27 = r10
            r9 = r23
            r15 = r33
            r11 = r26
            r15 = r13
            r12 = r21
            r14 = r34
            int r0 = r0.d0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0334
        L_0x031a:
            r15 = r28
            r14 = r29
            r12 = r30
            r3 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r1 = r17
            r2 = r18
            r6 = r20
            r7 = r25
        L_0x0330:
            r10 = r27
            goto L_0x0018
        L_0x0334:
            r8 = r31
            r2 = r0
            r0 = r33
            goto L_0x038a
        L_0x033b:
            r21 = r2
            r25 = r7
            r26 = r8
            r27 = r10
            r15 = r13
            r1 = r19
            r19 = r0
            r0 = 50
            r9 = r26
            r7 = r19
            if (r9 != r0) goto L_0x036f
            r0 = 2
            if (r7 != r0) goto L_0x0369
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r18
            r6 = r21
            r8 = r34
            int r0 = r0.Z(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0334
            goto L_0x031a
        L_0x0369:
            r8 = r31
            r0 = r33
            r2 = r15
            goto L_0x038a
        L_0x036f:
            r0 = r28
            r8 = r1
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r31
            r6 = r17
            r10 = r21
            r12 = r18
            r13 = r34
            int r0 = r0.a0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0334
            goto L_0x031a
        L_0x038a:
            if (r8 != r0) goto L_0x0399
            if (r0 == 0) goto L_0x0399
            r9 = r28
            r10 = r0
            r0 = r2
            r3 = r8
            r6 = r20
            r7 = r25
        L_0x0397:
            r1 = -1
            goto L_0x03e8
        L_0x0399:
            r9 = r28
            r10 = r0
            boolean r0 = r9.f7215f
            r11 = r34
            if (r0 == 0) goto L_0x03bc
            com.google.crypto.tink.shaded.protobuf.p r0 = r11.f7067d
            com.google.crypto.tink.shaded.protobuf.p r1 = com.google.crypto.tink.shaded.protobuf.p.b()
            if (r0 == r1) goto L_0x03bc
            com.google.crypto.tink.shaded.protobuf.o0 r5 = r9.f7214e
            com.google.crypto.tink.shaded.protobuf.j1 r6 = r9.f7224o
            r0 = r8
            r1 = r30
            r3 = r32
            r4 = r29
            r7 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.e.f(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x03cb
        L_0x03bc:
            com.google.crypto.tink.shaded.protobuf.k1 r4 = u(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.e.F(r0, r1, r2, r3, r4, r5)
        L_0x03cb:
            r14 = r29
            r12 = r30
            r13 = r32
            r3 = r8
            r15 = r9
            r9 = r11
            r1 = r17
            r2 = r18
            r6 = r20
            r7 = r25
            r11 = r10
            goto L_0x0330
        L_0x03df:
            r20 = r6
            r25 = r7
            r27 = r10
            r10 = r11
            r9 = r15
            goto L_0x0397
        L_0x03e8:
            if (r7 == r1) goto L_0x03f3
            long r1 = (long) r7
            r4 = r29
            r5 = r27
            r5.putInt(r4, r1, r6)
            goto L_0x03f5
        L_0x03f3:
            r4 = r29
        L_0x03f5:
            int r1 = r9.f7220k
            r2 = 0
        L_0x03f8:
            int r5 = r9.f7221l
            if (r1 >= r5) goto L_0x040b
            int[] r5 = r9.f7219j
            r5 = r5[r1]
            com.google.crypto.tink.shaded.protobuf.j1 r6 = r9.f7224o
            java.lang.Object r2 = r9.p(r4, r5, r2, r6)
            com.google.crypto.tink.shaded.protobuf.k1 r2 = (com.google.crypto.tink.shaded.protobuf.k1) r2
            int r1 = r1 + 1
            goto L_0x03f8
        L_0x040b:
            if (r2 == 0) goto L_0x0412
            com.google.crypto.tink.shaded.protobuf.j1 r1 = r9.f7224o
            r1.o(r4, r2)
        L_0x0412:
            r1 = r32
            if (r10 != 0) goto L_0x041e
            if (r0 != r1) goto L_0x0419
            goto L_0x0422
        L_0x0419:
            com.google.crypto.tink.shaded.protobuf.a0 r0 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r0
        L_0x041e:
            if (r0 > r1) goto L_0x0423
            if (r3 != r10) goto L_0x0423
        L_0x0422:
            return r0
        L_0x0423:
            com.google.crypto.tink.shaded.protobuf.a0 r0 = com.google.crypto.tink.shaded.protobuf.a0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.b0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    public void c(Object obj, q1 q1Var) {
        if (q1Var.A() == q1.a.DESCENDING) {
            t0(obj, q1Var);
        } else if (this.f7217h) {
            s0(obj, q1Var);
        } else {
            r0(obj, q1Var);
        }
    }

    public void d(Object obj, c1 c1Var, p pVar) {
        pVar.getClass();
        K(this.f7224o, this.f7225p, obj, c1Var, pVar);
    }

    public void e(Object obj) {
        int i10;
        int i11 = this.f7220k;
        while (true) {
            i10 = this.f7221l;
            if (i11 >= i10) {
                break;
            }
            long T = T(q0(this.f7219j[i11]));
            Object A = n1.A(obj, T);
            if (A != null) {
                n1.O(obj, T, this.f7226q.e(A));
            }
            i11++;
        }
        int length = this.f7219j.length;
        while (i10 < length) {
            this.f7223n.c(obj, (long) this.f7219j[i10]);
            i10++;
        }
        this.f7224o.j(obj);
        if (this.f7215f) {
            this.f7225p.f(obj);
        }
    }

    public final boolean f(Object obj) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7220k; i13++) {
            int i14 = this.f7219j[i13];
            int S = S(i14);
            int q02 = q0(i14);
            if (!this.f7217h) {
                int i15 = this.f7210a[i14 + 2];
                int i16 = 1048575 & i15;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i12 = f7209s.getInt(obj, (long) i16);
                    i11 = i16;
                }
            } else {
                i10 = 0;
            }
            if (H(q02) && !B(obj, i14, i12, i10)) {
                return false;
            }
            int p02 = p0(q02);
            if (p02 != 9 && p02 != 17) {
                if (p02 != 27) {
                    if (p02 == 60 || p02 == 68) {
                        if (G(obj, S, i14) && !C(obj, q02, t(i14))) {
                            return false;
                        }
                    } else if (p02 != 49) {
                        if (p02 == 50 && !E(obj, q02, i14)) {
                            return false;
                        }
                    }
                }
                if (!D(obj, q02, i14)) {
                    return false;
                }
            } else if (B(obj, i14, i12, i10) && !C(obj, q02, t(i14))) {
                return false;
            }
        }
        return !this.f7215f || this.f7225p.c(obj).e();
    }

    public boolean g(Object obj, Object obj2) {
        int length = this.f7210a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!o(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f7224o.g(obj).equals(this.f7224o.g(obj2))) {
            return false;
        }
        if (this.f7215f) {
            return this.f7225p.c(obj).equals(this.f7225p.c(obj2));
        }
        return true;
    }

    public int h(Object obj) {
        return this.f7217h ? w(obj) : v(obj);
    }

    public Object i() {
        return this.f7222m.a(this.f7214e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r2 = r2 * 53;
        r3 = Y(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.z.f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r2 = r2 * 53;
        r3 = X(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        r2 = r2 * 53;
        r3 = com.google.crypto.tink.shaded.protobuf.n1.A(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.crypto.tink.shaded.protobuf.n1.A(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.z.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        if (r3 != null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010e, code lost:
        if (r3 != null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0126, code lost:
        r1 = r1 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.n1.A(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r2 = r2 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int j(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f7210a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012a
            int r3 = r8.q0(r1)
            int r4 = r8.S(r1)
            long r5 = T(r3)
            int r3 = p0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011f;
                case 1: goto L_0x0118;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00fa;
                case 4: goto L_0x0102;
                case 5: goto L_0x00fa;
                case 6: goto L_0x0102;
                case 7: goto L_0x0111;
                case 8: goto L_0x0085;
                case 9: goto L_0x010a;
                case 10: goto L_0x0071;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x00fa;
                case 15: goto L_0x0102;
                case 16: goto L_0x00fa;
                case 17: goto L_0x00ec;
                case 18: goto L_0x0071;
                case 19: goto L_0x0071;
                case 20: goto L_0x0071;
                case 21: goto L_0x0071;
                case 22: goto L_0x0071;
                case 23: goto L_0x0071;
                case 24: goto L_0x0071;
                case 25: goto L_0x0071;
                case 26: goto L_0x0071;
                case 27: goto L_0x0071;
                case 28: goto L_0x0071;
                case 29: goto L_0x0071;
                case 30: goto L_0x0071;
                case 31: goto L_0x0071;
                case 32: goto L_0x0071;
                case 33: goto L_0x0071;
                case 34: goto L_0x0071;
                case 35: goto L_0x0071;
                case 36: goto L_0x0071;
                case 37: goto L_0x0071;
                case 38: goto L_0x0071;
                case 39: goto L_0x0071;
                case 40: goto L_0x0071;
                case 41: goto L_0x0071;
                case 42: goto L_0x0071;
                case 43: goto L_0x0071;
                case 44: goto L_0x0071;
                case 45: goto L_0x0071;
                case 46: goto L_0x0071;
                case 47: goto L_0x0071;
                case 48: goto L_0x0071;
                case 49: goto L_0x0071;
                case 50: goto L_0x0071;
                case 51: goto L_0x00da;
                case 52: goto L_0x00c8;
                case 53: goto L_0x00c0;
                case 54: goto L_0x00b8;
                case 55: goto L_0x00b1;
                case 56: goto L_0x00aa;
                case 57: goto L_0x00a3;
                case 58: goto L_0x0092;
                case 59: goto L_0x007f;
                case 60: goto L_0x0078;
                case 61: goto L_0x006b;
                case 62: goto L_0x0064;
                case 63: goto L_0x005d;
                case 64: goto L_0x0056;
                case 65: goto L_0x004f;
                case 66: goto L_0x0042;
                case 67: goto L_0x0031;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0126
        L_0x001e:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
        L_0x0024:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.n1.A(r9, r5)
            int r2 = r2 * 53
        L_0x002a:
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0126
        L_0x0031:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
        L_0x0037:
            int r2 = r2 * 53
            long r3 = Y(r9, r5)
        L_0x003d:
            int r3 = com.google.crypto.tink.shaded.protobuf.z.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
        L_0x0048:
            int r2 = r2 * 53
            int r3 = X(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0037
        L_0x0056:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0048
        L_0x005d:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0048
        L_0x0064:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0048
        L_0x006b:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
        L_0x0071:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.n1.A(r9, r5)
            goto L_0x002a
        L_0x0078:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0024
        L_0x007f:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
        L_0x0085:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.n1.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0092:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            int r2 = r2 * 53
            boolean r3 = U(r9, r5)
        L_0x009e:
            int r3 = com.google.crypto.tink.shaded.protobuf.z.c(r3)
            goto L_0x002e
        L_0x00a3:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0048
        L_0x00aa:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0037
        L_0x00b1:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0048
        L_0x00b8:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0037
        L_0x00c0:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            goto L_0x0037
        L_0x00c8:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            int r2 = r2 * 53
            float r3 = W(r9, r5)
        L_0x00d4:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x00da:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x0126
            int r2 = r2 * 53
            double r3 = V(r9, r5)
        L_0x00e6:
            long r3 = java.lang.Double.doubleToLongBits(r3)
            goto L_0x003d
        L_0x00ec:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.n1.A(r9, r5)
            if (r3 == 0) goto L_0x00f6
        L_0x00f2:
            int r7 = r3.hashCode()
        L_0x00f6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0126
        L_0x00fa:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.n1.y(r9, r5)
            goto L_0x003d
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.n1.x(r9, r5)
            goto L_0x002e
        L_0x010a:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.n1.A(r9, r5)
            if (r3 == 0) goto L_0x00f6
            goto L_0x00f2
        L_0x0111:
            int r2 = r2 * 53
            boolean r3 = com.google.crypto.tink.shaded.protobuf.n1.p(r9, r5)
            goto L_0x009e
        L_0x0118:
            int r2 = r2 * 53
            float r3 = com.google.crypto.tink.shaded.protobuf.n1.w(r9, r5)
            goto L_0x00d4
        L_0x011f:
            int r2 = r2 * 53
            double r3 = com.google.crypto.tink.shaded.protobuf.n1.v(r9, r5)
            goto L_0x00e6
        L_0x0126:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012a:
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.j1 r0 = r8.f7224o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f7215f
            if (r0 == 0) goto L_0x0148
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.q r0 = r8.f7225p
            com.google.crypto.tink.shaded.protobuf.t r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0148:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.j(java.lang.Object):int");
    }
}
