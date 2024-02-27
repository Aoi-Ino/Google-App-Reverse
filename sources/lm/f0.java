package lm;

import bm.l;
import bm.p;
import pl.m;
import rm.b;
import tl.d;
import tl.f;

public enum f0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24957a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                lm.f0[] r0 = lm.f0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                lm.f0 r1 = lm.f0.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                lm.f0 r1 = lm.f0.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                lm.f0 r1 = lm.f0.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                lm.f0 r1 = lm.f0.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f24957a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lm.f0.a.<clinit>():void");
        }
    }

    public final void b(p pVar, Object obj, d dVar) {
        int i10 = a.f24957a[ordinal()];
        if (i10 == 1) {
            rm.a.d(pVar, obj, dVar, (l) null, 4, (Object) null);
        } else if (i10 == 2) {
            f.a(pVar, obj, dVar);
        } else if (i10 == 3) {
            b.a(pVar, obj, dVar);
        } else if (i10 != 4) {
            throw new m();
        }
    }

    public final boolean c() {
        return this == LAZY;
    }
}
