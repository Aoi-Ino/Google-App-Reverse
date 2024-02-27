package a8;

import e8.c;

public class k implements Comparable {

    /* renamed from: e  reason: collision with root package name */
    private b f284e;

    /* renamed from: f  reason: collision with root package name */
    private float f285f;

    /* renamed from: g  reason: collision with root package name */
    private int f286g;

    /* renamed from: h  reason: collision with root package name */
    private b f287h;

    /* renamed from: i  reason: collision with root package name */
    private c f288i;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f289a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                a8.k$b[] r0 = a8.k.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f289a = r0
                a8.k$b r1 = a8.k.b.COURIER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f289a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.k$b r1 = a8.k.b.HELVETICA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f289a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.k$b r1 = a8.k.b.TIMES_ROMAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f289a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a8.k$b r1 = a8.k.b.SYMBOL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f289a     // Catch:{ NoSuchFieldError -> 0x003e }
                a8.k$b r1 = a8.k.b.ZAPFDINGBATS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a8.k.a.<clinit>():void");
        }
    }

    public enum b {
        COURIER,
        HELVETICA,
        TIMES_ROMAN,
        SYMBOL,
        ZAPFDINGBATS,
        UNDEFINED
    }

    public k() {
        this(b.UNDEFINED, -1.0f, -1, (b) null);
    }

    /* renamed from: a */
    public int compareTo(k kVar) {
        if (kVar == null) {
            return -1;
        }
        try {
            c cVar = this.f288i;
            if (cVar != null && !cVar.equals(kVar.c())) {
                return -2;
            }
            if (this.f284e != kVar.h()) {
                return 1;
            }
            if (this.f285f != kVar.j()) {
                return 2;
            }
            if (this.f286g != kVar.k()) {
                return 3;
            }
            b bVar = this.f287h;
            return bVar == null ? kVar.f287h == null ? 0 : 4 : (kVar.f287h != null && bVar.equals(kVar.g())) ? 0 : 4;
        } catch (ClassCastException unused) {
            return -3;
        }
    }

    public k b(k kVar) {
        if (kVar == null) {
            return this;
        }
        float f10 = kVar.f285f;
        if (f10 == -1.0f) {
            f10 = this.f285f;
        }
        int i10 = this.f286g;
        int k10 = kVar.k();
        int i11 = -1;
        if (!(i10 == -1 && k10 == -1)) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (k10 == -1) {
                k10 = 0;
            }
            i11 = i10 | k10;
        }
        b bVar = kVar.f287h;
        if (bVar == null) {
            bVar = this.f287h;
        }
        c cVar = kVar.f288i;
        if (cVar != null) {
            return new k(cVar, f10, i11, bVar);
        }
        if (kVar.h() != b.UNDEFINED) {
            return new k(kVar.f284e, f10, i11, bVar);
        }
        c cVar2 = this.f288i;
        if (cVar2 != null) {
            return i11 == i10 ? new k(cVar2, f10, i11, bVar) : l.a(i(), f10, i11, bVar);
        }
        return new k(this.f284e, f10, i11, bVar);
    }

    public c c() {
        return this.f288i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r9 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r9 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e8.c d(boolean r9) {
        /*
            r8 = this;
            e8.c r0 = r8.f288i
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            int r0 = r8.f286g
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L_0x000c
            r0 = r2
        L_0x000c:
            int[] r1 = a8.k.a.f289a
            a8.k$b r3 = r8.f284e
            int r3 = r3.ordinal()
            r1 = r1[r3]
            r3 = 2
            r4 = 1
            r5 = 3
            java.lang.String r6 = "Cp1252"
            if (r1 == r4) goto L_0x005b
            if (r1 == r5) goto L_0x0047
            r7 = 4
            if (r1 == r7) goto L_0x0042
            r7 = 5
            if (r1 == r7) goto L_0x0039
            r9 = r0 & 3
            if (r9 == r4) goto L_0x0036
            if (r9 == r3) goto L_0x0033
            if (r9 == r5) goto L_0x0030
            java.lang.String r9 = "Helvetica"
            goto L_0x006e
        L_0x0030:
            java.lang.String r9 = "Helvetica-BoldOblique"
            goto L_0x006e
        L_0x0033:
            java.lang.String r9 = "Helvetica-Oblique"
            goto L_0x006e
        L_0x0036:
            java.lang.String r9 = "Helvetica-Bold"
            goto L_0x006e
        L_0x0039:
            java.lang.String r0 = "ZapfDingbats"
            if (r9 == 0) goto L_0x0040
        L_0x003d:
            r9 = r0
            r6 = r9
            goto L_0x006e
        L_0x0040:
            r9 = r0
            goto L_0x006e
        L_0x0042:
            java.lang.String r0 = "Symbol"
            if (r9 == 0) goto L_0x0040
            goto L_0x003d
        L_0x0047:
            r9 = r0 & 3
            if (r9 == r4) goto L_0x0058
            if (r9 == r3) goto L_0x0055
            if (r9 == r5) goto L_0x0052
            java.lang.String r9 = "Times-Roman"
            goto L_0x006e
        L_0x0052:
            java.lang.String r9 = "Times-BoldItalic"
            goto L_0x006e
        L_0x0055:
            java.lang.String r9 = "Times-Italic"
            goto L_0x006e
        L_0x0058:
            java.lang.String r9 = "Times-Bold"
            goto L_0x006e
        L_0x005b:
            r9 = r0 & 3
            if (r9 == r4) goto L_0x006c
            if (r9 == r3) goto L_0x0069
            if (r9 == r5) goto L_0x0066
            java.lang.String r9 = "Courier"
            goto L_0x006e
        L_0x0066:
            java.lang.String r9 = "Courier-BoldOblique"
            goto L_0x006e
        L_0x0069:
            java.lang.String r9 = "Courier-Oblique"
            goto L_0x006e
        L_0x006c:
            java.lang.String r9 = "Courier-Bold"
        L_0x006e:
            e8.c r9 = e8.c.d(r9, r6, r2)     // Catch:{ Exception -> 0x0073 }
            return r9
        L_0x0073:
            r9 = move-exception
            a8.j r0 = new a8.j
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.k.d(boolean):e8.c");
    }

    public float e(float f10) {
        return f10 * f();
    }

    public float f() {
        float f10 = this.f285f;
        if (f10 == -1.0f) {
            return 12.0f;
        }
        return f10;
    }

    public b g() {
        return this.f287h;
    }

    public b h() {
        return this.f284e;
    }

    public String i() {
        int i10 = a.f289a[h().ordinal()];
        if (i10 == 1) {
            return "Courier";
        }
        if (i10 == 2) {
            return "Helvetica";
        }
        if (i10 == 3) {
            return "Times-Roman";
        }
        if (i10 == 4) {
            return "Symbol";
        }
        if (i10 == 5) {
            return "ZapfDingbats";
        }
        c cVar = this.f288i;
        String str = "unknown";
        if (cVar != null) {
            for (String[] strArr : cVar.k()) {
                if ("0".equals(strArr[2])) {
                    return strArr[3];
                }
                if ("1033".equals(strArr[2])) {
                    str = strArr[3];
                }
                if ("".equals(strArr[2])) {
                    str = strArr[3];
                }
            }
        }
        return str;
    }

    public float j() {
        return this.f285f;
    }

    public int k() {
        return this.f286g;
    }

    public boolean l() {
        return this.f284e == b.UNDEFINED && this.f285f == -1.0f && this.f286g == -1 && this.f287h == null && this.f288i == null;
    }

    public boolean m() {
        int i10 = this.f286g;
        return i10 != -1 && (i10 & 8) == 8;
    }

    public boolean n() {
        int i10 = this.f286g;
        return i10 != -1 && (i10 & 4) == 4;
    }

    public void o(int i10) {
        this.f286g = i10;
    }

    public k(b bVar, float f10, int i10, b bVar2) {
        b bVar3 = b.COURIER;
        this.f288i = null;
        this.f284e = bVar;
        this.f285f = f10;
        this.f286g = i10;
        this.f287h = bVar2;
    }

    public k(k kVar) {
        this.f284e = b.UNDEFINED;
        this.f285f = -1.0f;
        this.f286g = -1;
        this.f287h = null;
        this.f288i = null;
        this.f284e = kVar.f284e;
        this.f285f = kVar.f285f;
        this.f286g = kVar.f286g;
        this.f287h = kVar.f287h;
        this.f288i = kVar.f288i;
    }

    public k(c cVar, float f10, int i10, b bVar) {
        this.f284e = b.UNDEFINED;
        this.f288i = cVar;
        this.f285f = f10;
        this.f286g = i10;
        this.f287h = bVar;
    }
}
