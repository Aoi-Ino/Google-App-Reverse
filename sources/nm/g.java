package nm;

import bm.l;

public abstract class g {
    public static final d a(int i10, a aVar, l lVar) {
        d bVar;
        if (i10 == -2) {
            bVar = aVar == a.SUSPEND ? new b(d.f29952c.a(), lVar) : new o(1, aVar, lVar);
        } else if (i10 != -1) {
            if (i10 == 0) {
                bVar = aVar == a.SUSPEND ? new b(0, lVar) : new o(1, aVar, lVar);
            } else if (i10 != Integer.MAX_VALUE) {
                return aVar == a.SUSPEND ? new b(i10, lVar) : new o(i10, aVar, lVar);
            } else {
                return new b(Integer.MAX_VALUE, lVar);
            }
        } else if (aVar == a.SUSPEND) {
            return new o(1, a.DROP_OLDEST, lVar);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        return bVar;
    }

    public static /* synthetic */ d b(int i10, a aVar, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}
