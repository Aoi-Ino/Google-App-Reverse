package pl;

import cm.g;
import cm.l;

abstract class j {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30418a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                pl.l[] r0 = pl.l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pl.l r1 = pl.l.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                pl.l r1 = pl.l.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                pl.l r1 = pl.l.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f30418a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.j.a.<clinit>():void");
        }
    }

    public static h a(bm.a aVar) {
        l.f(aVar, "initializer");
        return new s(aVar, (Object) null, 2, (g) null);
    }

    public static h b(l lVar, bm.a aVar) {
        l.f(lVar, "mode");
        l.f(aVar, "initializer");
        int i10 = a.f30418a[lVar.ordinal()];
        if (i10 == 1) {
            return new s(aVar, (Object) null, 2, (g) null);
        }
        if (i10 == 2) {
            return new r(aVar);
        }
        if (i10 == 3) {
            return new y(aVar);
        }
        throw new m();
    }
}
