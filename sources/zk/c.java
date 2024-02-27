package zk;

import al.a;
import al.b;
import android.util.Pair;
import android.view.View;
import xk.e;

public class c {
    public Pair a(a aVar, int i10, int i11) {
        int i12;
        int i13;
        a aVar2 = aVar;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int c10 = aVar.c();
        int k10 = aVar.k();
        int q10 = aVar.q();
        int f10 = aVar.f();
        int h10 = aVar.h();
        int j10 = aVar.j();
        int i14 = aVar.i();
        int g10 = aVar.g();
        int i15 = k10 * 2;
        b e10 = aVar.e();
        int i16 = 0;
        if (c10 != 0) {
            i12 = (i15 * c10) + (q10 * 2 * c10) + (f10 * (c10 - 1));
            i13 = i15 + q10;
            if (e10 != b.HORIZONTAL) {
                int i17 = i12;
                i12 = i13;
                i13 = i17;
            }
        } else {
            i13 = 0;
            i12 = 0;
        }
        if (aVar.b() == e.DROP) {
            if (e10 == b.HORIZONTAL) {
                i13 *= 2;
            } else {
                i12 *= 2;
            }
        }
        b bVar = b.HORIZONTAL;
        int i18 = i12 + h10 + i14;
        int i19 = i13 + j10 + g10;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i18, size) : i18;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i19, size2) : i19;
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 >= 0) {
            i16 = size2;
        }
        aVar2.T(size);
        aVar2.B(i16);
        return new Pair(Integer.valueOf(size), Integer.valueOf(i16));
    }
}
