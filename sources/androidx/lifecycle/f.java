package androidx.lifecycle;

import androidx.lifecycle.k;
import cm.l;

public final class f implements o {

    /* renamed from: e  reason: collision with root package name */
    private final e f3278e;

    /* renamed from: f  reason: collision with root package name */
    private final o f3279f;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3280a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.lifecycle.k$a[] r0 = androidx.lifecycle.k.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f3280a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f.a.<clinit>():void");
        }
    }

    public f(e eVar, o oVar) {
        l.f(eVar, "defaultLifecycleObserver");
        this.f3278e = eVar;
        this.f3279f = oVar;
    }

    public void d(s sVar, k.a aVar) {
        l.f(sVar, "source");
        l.f(aVar, "event");
        switch (a.f3280a[aVar.ordinal()]) {
            case 1:
                this.f3278e.c(sVar);
                break;
            case 2:
                this.f3278e.f(sVar);
                break;
            case 3:
                this.f3278e.a(sVar);
                break;
            case 4:
                this.f3278e.e(sVar);
                break;
            case 5:
                this.f3278e.g(sVar);
                break;
            case 6:
                this.f3278e.b(sVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        o oVar = this.f3279f;
        if (oVar != null) {
            oVar.d(sVar, aVar);
        }
    }
}
