package um;

import cm.g;
import cm.l;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final d f31922n = new a().d().a();

    /* renamed from: o  reason: collision with root package name */
    public static final d f31923o = new a().e().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f31924p = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31925a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31926b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31927c;

    /* renamed from: d  reason: collision with root package name */
    private final int f31928d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f31929e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f31930f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f31931g;

    /* renamed from: h  reason: collision with root package name */
    private final int f31932h;

    /* renamed from: i  reason: collision with root package name */
    private final int f31933i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f31934j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f31935k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f31936l;

    /* renamed from: m  reason: collision with root package name */
    private String f31937m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f31938a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31939b;

        /* renamed from: c  reason: collision with root package name */
        private int f31940c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f31941d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f31942e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f31943f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f31944g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f31945h;

        private final int b(long j10) {
            if (j10 > ((long) Integer.MAX_VALUE)) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final d a() {
            return new d(this.f31938a, this.f31939b, this.f31940c, -1, false, false, false, this.f31941d, this.f31942e, this.f31943f, this.f31944g, this.f31945h, (String) null, (g) null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            l.f(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f31941d = b(timeUnit.toSeconds((long) i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f31938a = true;
            return this;
        }

        public final a e() {
            this.f31943f = true;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (q.E(str2, str.charAt(i10), false, 2, (Object) null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final um.d b(um.u r32) {
            /*
                r31 = this;
                r0 = r31
                r1 = r32
                java.lang.String r2 = "headers"
                cm.l.f(r1, r2)
                int r2 = r32.size()
                r5 = 1
                r8 = r5
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x018f
                java.lang.String r3 = r1.n(r7)
                java.lang.String r6 = r1.s(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = km.p.o(r3, r4, r5)
                if (r4 == 0) goto L_0x003b
                if (r9 == 0) goto L_0x0039
            L_0x0037:
                r8 = 0
                goto L_0x0044
            L_0x0039:
                r9 = r6
                goto L_0x0044
            L_0x003b:
                java.lang.String r4 = "Pragma"
                boolean r3 = km.p.o(r3, r4, r5)
                if (r3 == 0) goto L_0x0184
                goto L_0x0037
            L_0x0044:
                r3 = 0
            L_0x0045:
                int r4 = r6.length()
                if (r3 >= r4) goto L_0x017e
                java.lang.String r4 = "=,;"
                int r4 = r0.a(r6, r4, r3)
                java.lang.String r3 = r6.substring(r3, r4)
                java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                cm.l.e(r3, r5)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r3 == 0) goto L_0x0178
                java.lang.CharSequence r3 = km.q.B0(r3)
                java.lang.String r3 = r3.toString()
                r29 = r2
                int r2 = r6.length()
                if (r4 == r2) goto L_0x00d0
                char r2 = r6.charAt(r4)
                r30 = r8
                r8 = 44
                if (r2 == r8) goto L_0x00d2
                char r2 = r6.charAt(r4)
                r8 = 59
                if (r2 != r8) goto L_0x0081
                goto L_0x00d2
            L_0x0081:
                int r4 = r4 + 1
                int r2 = vm.b.A(r6, r4)
                int r4 = r6.length()
                if (r2 >= r4) goto L_0x00b2
                char r4 = r6.charAt(r2)
                r8 = 34
                if (r4 != r8) goto L_0x00b2
                int r2 = r2 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r6
                r25 = r2
                int r1 = km.q.P(r23, r24, r25, r26, r27, r28)
                java.lang.String r2 = r6.substring(r2, r1)
                cm.l.e(r2, r5)
                r4 = 1
                int r1 = r1 + r4
                r4 = r1
                goto L_0x00d5
            L_0x00b2:
                java.lang.String r4 = ",;"
                int r4 = r0.a(r6, r4, r2)
                java.lang.String r2 = r6.substring(r2, r4)
                cm.l.e(r2, r5)
                if (r2 == 0) goto L_0x00ca
                java.lang.CharSequence r1 = km.q.B0(r2)
                java.lang.String r2 = r1.toString()
                goto L_0x00d5
            L_0x00ca:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                r2.<init>(r1)
                throw r2
            L_0x00d0:
                r30 = r8
            L_0x00d2:
                int r4 = r4 + 1
                r2 = 0
            L_0x00d5:
                java.lang.String r1 = "no-cache"
                r5 = 1
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x00e2
                r10 = r5
            L_0x00df:
                r8 = -1
                goto L_0x016f
            L_0x00e2:
                java.lang.String r1 = "no-store"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x00ec
                r11 = r5
                goto L_0x00df
            L_0x00ec:
                java.lang.String r1 = "max-age"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x00fd
                r1 = -1
                int r2 = vm.b.R(r2, r1)
                r8 = r1
                r12 = r2
                goto L_0x016f
            L_0x00fd:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = km.p.o(r8, r3, r5)
                if (r8 == 0) goto L_0x010e
                int r2 = vm.b.R(r2, r1)
                r8 = r1
                r13 = r2
                goto L_0x016f
            L_0x010e:
                java.lang.String r1 = "private"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x0118
                r14 = r5
                goto L_0x00df
            L_0x0118:
                java.lang.String r1 = "public"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x0122
                r15 = r5
                goto L_0x00df
            L_0x0122:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x012d
                r16 = r5
                goto L_0x00df
            L_0x012d:
                java.lang.String r1 = "max-stale"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x013f
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r1 = vm.b.R(r2, r1)
                r17 = r1
                goto L_0x00df
            L_0x013f:
                java.lang.String r1 = "min-fresh"
                boolean r1 = km.p.o(r1, r3, r5)
                r8 = -1
                if (r1 == 0) goto L_0x014f
                int r1 = vm.b.R(r2, r8)
                r18 = r1
                goto L_0x016f
            L_0x014f:
                java.lang.String r1 = "only-if-cached"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x015a
                r19 = r5
                goto L_0x016f
            L_0x015a:
                java.lang.String r1 = "no-transform"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x0165
                r20 = r5
                goto L_0x016f
            L_0x0165:
                java.lang.String r1 = "immutable"
                boolean r1 = km.p.o(r1, r3, r5)
                if (r1 == 0) goto L_0x016f
                r21 = r5
            L_0x016f:
                r1 = r32
                r3 = r4
                r2 = r29
                r8 = r30
                goto L_0x0045
            L_0x0178:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                r2.<init>(r1)
                throw r2
            L_0x017e:
                r29 = r2
                r30 = r8
            L_0x0182:
                r1 = -1
                goto L_0x0187
            L_0x0184:
                r29 = r2
                goto L_0x0182
            L_0x0187:
                int r7 = r7 + 1
                r1 = r32
                r2 = r29
                goto L_0x0023
            L_0x018f:
                if (r8 != 0) goto L_0x0194
                r22 = 0
                goto L_0x0196
            L_0x0194:
                r22 = r9
            L_0x0196:
                um.d r1 = new um.d
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: um.d.b.b(um.u):um.d");
        }
    }

    private d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f31925a = z10;
        this.f31926b = z11;
        this.f31927c = i10;
        this.f31928d = i11;
        this.f31929e = z12;
        this.f31930f = z13;
        this.f31931g = z14;
        this.f31932h = i12;
        this.f31933i = i13;
        this.f31934j = z15;
        this.f31935k = z16;
        this.f31936l = z17;
        this.f31937m = str;
    }

    public final boolean a() {
        return this.f31929e;
    }

    public final boolean b() {
        return this.f31930f;
    }

    public final int c() {
        return this.f31927c;
    }

    public final int d() {
        return this.f31932h;
    }

    public final int e() {
        return this.f31933i;
    }

    public final boolean f() {
        return this.f31931g;
    }

    public final boolean g() {
        return this.f31925a;
    }

    public final boolean h() {
        return this.f31926b;
    }

    public final boolean i() {
        return this.f31934j;
    }

    public String toString() {
        String str = this.f31937m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f31925a) {
            sb2.append("no-cache, ");
        }
        if (this.f31926b) {
            sb2.append("no-store, ");
        }
        if (this.f31927c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f31927c);
            sb2.append(", ");
        }
        if (this.f31928d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f31928d);
            sb2.append(", ");
        }
        if (this.f31929e) {
            sb2.append("private, ");
        }
        if (this.f31930f) {
            sb2.append("public, ");
        }
        if (this.f31931g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f31932h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f31932h);
            sb2.append(", ");
        }
        if (this.f31933i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f31933i);
            sb2.append(", ");
        }
        if (this.f31934j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f31935k) {
            sb2.append("no-transform, ");
        }
        if (this.f31936l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f31937m = sb3;
        return sb3;
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, g gVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }
}
