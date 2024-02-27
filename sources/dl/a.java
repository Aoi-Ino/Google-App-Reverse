package dl;

import al.b;
import android.util.Pair;
import xk.e;

public abstract class a {
    public static int a(al.a aVar, int i10) {
        if (aVar == null) {
            return 0;
        }
        return aVar.e() == b.HORIZONTAL ? e(aVar, i10) : f(aVar, i10);
    }

    private static int b(al.a aVar, int i10) {
        int c10 = aVar.c();
        int k10 = aVar.k();
        int q10 = aVar.q();
        int f10 = aVar.f();
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            int i13 = q10 / 2;
            int i14 = i11 + k10 + i13;
            if (i10 == i12) {
                return i14;
            }
            i11 = i14 + k10 + f10 + i13;
        }
        return aVar.b() == e.DROP ? i11 + (k10 * 2) : i11;
    }

    public static Pair c(al.a aVar, int i10, float f10, boolean z10) {
        int c10 = aVar.c();
        int o10 = aVar.o();
        if (z10) {
            i10 = (c10 - 1) - i10;
        }
        boolean z11 = false;
        if (i10 < 0) {
            i10 = 0;
        } else {
            int i11 = c10 - 1;
            if (i10 > i11) {
                i10 = i11;
            }
        }
        boolean z12 = i10 > o10;
        if (!z10 ? i10 + 1 < o10 : i10 - 1 < o10) {
            z11 = true;
        }
        if (z12 || z11) {
            aVar.O(i10);
            o10 = i10;
        }
        float f11 = 1.0f;
        if (o10 != i10 || f10 == 0.0f) {
            f10 = 1.0f - f10;
        } else {
            i10 = z10 ? i10 - 1 : i10 + 1;
        }
        if (f10 <= 1.0f) {
            f11 = f10 < 0.0f ? 0.0f : f10;
        }
        return new Pair(Integer.valueOf(i10), Float.valueOf(f11));
    }

    private static int d(al.a aVar) {
        int k10 = aVar.k();
        return aVar.b() == e.DROP ? k10 * 3 : k10;
    }

    public static int e(al.a aVar, int i10) {
        if (aVar == null) {
            return 0;
        }
        return (aVar.e() == b.HORIZONTAL ? b(aVar, i10) : d(aVar)) + aVar.h();
    }

    public static int f(al.a aVar, int i10) {
        if (aVar == null) {
            return 0;
        }
        return (aVar.e() == b.HORIZONTAL ? d(aVar) : b(aVar, i10)) + aVar.j();
    }
}
