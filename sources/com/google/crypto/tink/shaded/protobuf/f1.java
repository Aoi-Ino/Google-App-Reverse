package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

abstract class f1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f7071a = A();

    /* renamed from: b  reason: collision with root package name */
    private static final j1 f7072b = B(false);

    /* renamed from: c  reason: collision with root package name */
    private static final j1 f7073c = B(true);

    /* renamed from: d  reason: collision with root package name */
    private static final j1 f7074d = new l1();

    private static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static j1 B(boolean z10) {
        try {
            Class C = C();
            if (C == null) {
                return null;
            }
            return (j1) C.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(q qVar, Object obj, Object obj2) {
        t c10 = qVar.c(obj2);
        if (!c10.d()) {
            qVar.d(obj).h(c10);
        }
    }

    static void E(j0 j0Var, Object obj, Object obj2, long j10) {
        n1.O(obj, j10, j0Var.a(n1.A(obj, j10), n1.A(obj2, j10)));
    }

    static void F(j1 j1Var, Object obj, Object obj2) {
        j1Var.p(obj, j1Var.k(j1Var.g(obj), j1Var.g(obj2)));
    }

    public static j1 G() {
        return f7072b;
    }

    public static j1 H() {
        return f7073c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!x.class.isAssignableFrom(cls) && (cls2 = f7071a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object K(int i10, int i11, Object obj, j1 j1Var) {
        if (obj == null) {
            obj = j1Var.n();
        }
        j1Var.e(obj, i10, (long) i11);
        return obj;
    }

    public static j1 L() {
        return f7074d;
    }

    public static void M(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.u(i10, list, z10);
        }
    }

    public static void N(int i10, List list, q1 q1Var) {
        if (list != null && !list.isEmpty()) {
            q1Var.O(i10, list);
        }
    }

    public static void O(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.L(i10, list, z10);
        }
    }

    public static void P(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.K(i10, list, z10);
        }
    }

    public static void Q(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.r(i10, list, z10);
        }
    }

    public static void R(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.l(i10, list, z10);
        }
    }

    public static void S(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.c(i10, list, z10);
        }
    }

    public static void T(int i10, List list, q1 q1Var, d1 d1Var) {
        if (list != null && !list.isEmpty()) {
            q1Var.a(i10, list, d1Var);
        }
    }

    public static void U(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.b(i10, list, z10);
        }
    }

    public static void V(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.J(i10, list, z10);
        }
    }

    public static void W(int i10, List list, q1 q1Var, d1 d1Var) {
        if (list != null && !list.isEmpty()) {
            q1Var.g(i10, list, d1Var);
        }
    }

    public static void X(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.m(i10, list, z10);
        }
    }

    public static void Y(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.q(i10, list, z10);
        }
    }

    public static void Z(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.G(i10, list, z10);
        }
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.L(i10) + k.x(size) : size * k.d(i10, true);
    }

    public static void a0(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.y(i10, list, z10);
        }
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, q1 q1Var) {
        if (list != null && !list.isEmpty()) {
            q1Var.D(i10, list);
        }
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L = size * k.L(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            L += k.g((h) list.get(i11));
        }
        return L;
    }

    public static void c0(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.w(i10, list, z10);
        }
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        int L = k.L(i10);
        return z10 ? L + k.x(e10) : e10 + (size * L);
    }

    public static void d0(int i10, List list, q1 q1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q1Var.t(i10, list, z10);
        }
    }

    static int e(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.k(yVar.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.L(i10) + k.x(size * 4) : size * k.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.L(i10) + k.x(size * 8) : size * k.n(i10, 0);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += k.r(i10, (o0) list.get(i12), d1Var);
        }
        return i11;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        int L = k.L(i10);
        return z10 ? L + k.x(l10) : l10 + (size * L);
    }

    static int l(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.u(yVar.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.u(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? k.L(i10) + k.x(n10) : n10 + (list.size() * k.L(i10));
    }

    static int n(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.w(f0Var.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.w(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int o(int i10, Object obj, d1 d1Var) {
        return k.y(i10, (o0) obj, d1Var);
    }

    static int p(int i10, List list, d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L = k.L(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            L += k.z((o0) list.get(i11), d1Var);
        }
        return L;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        int L = k.L(i10);
        return z10 ? L + k.x(r10) : r10 + (size * L);
    }

    static int r(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.G(yVar.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.G(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        int L = k.L(i10);
        return z10 ? L + k.x(t10) : t10 + (size * L);
    }

    static int t(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.I(f0Var.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.I(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int L = k.L(i10) * size;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            while (i11 < size) {
                Object S = d0Var.S(i11);
                L += S instanceof h ? k.g((h) S) : k.K((String) S);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                L += obj instanceof h ? k.g((h) obj) : k.K((String) obj);
                i11++;
            }
        }
        return L;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        int L = k.L(i10);
        return z10 ? L + k.x(w10) : w10 + (size * L);
    }

    static int w(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.N(yVar.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.N(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        int L = k.L(i10);
        return z10 ? L + k.x(y10) : y10 + (size * L);
    }

    static int y(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.P(f0Var.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.P(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static Object z(int i10, List list, z.c cVar, Object obj, j1 j1Var) {
        if (cVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (cVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = K(i10, intValue, obj, j1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!cVar.a(intValue2)) {
                    obj = K(i10, intValue2, obj, j1Var);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
