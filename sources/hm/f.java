package hm;

import cm.l;
import hm.a;

abstract class f extends e {
    public static int b(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long c(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int d(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int f(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
        } else if (i10 < i11) {
            return i11;
        } else {
            return i10 > i12 ? i12 : i10;
        }
    }

    public static a g(int i10, int i11) {
        return a.f24171h.a(i10, i11, -1);
    }

    public static a h(a aVar, int i10) {
        l.f(aVar, "<this>");
        e.a(i10 > 0, Integer.valueOf(i10));
        a.C0301a aVar2 = a.f24171h;
        int l10 = aVar.l();
        int n10 = aVar.n();
        if (aVar.o() <= 0) {
            i10 = -i10;
        }
        return aVar2.a(l10, n10, i10);
    }

    public static c i(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? c.f24179i.a() : new c(i10, i11 - 1);
    }
}
