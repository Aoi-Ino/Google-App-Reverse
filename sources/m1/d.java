package m1;

import android.net.Uri;
import cm.g;
import cm.l;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {

    /* renamed from: i  reason: collision with root package name */
    public static final b f13661i = new b((g) null);

    /* renamed from: j  reason: collision with root package name */
    public static final d f13662j = new d((n) null, false, false, false, 15, (g) null);

    /* renamed from: a  reason: collision with root package name */
    private final n f13663a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13664b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13665c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f13666d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f13667e;

    /* renamed from: f  reason: collision with root package name */
    private final long f13668f;

    /* renamed from: g  reason: collision with root package name */
    private final long f13669g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f13670h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f13671a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13672b;

        /* renamed from: c  reason: collision with root package name */
        private n f13673c = n.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13674d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f13675e;

        /* renamed from: f  reason: collision with root package name */
        private long f13676f = -1;

        /* renamed from: g  reason: collision with root package name */
        private long f13677g = -1;

        /* renamed from: h  reason: collision with root package name */
        private Set f13678h = new LinkedHashSet();

        public final d a() {
            Set x02 = y.x0(this.f13678h);
            long j10 = this.f13676f;
            long j11 = this.f13677g;
            return new d(this.f13673c, this.f13671a, this.f13672b, this.f13674d, this.f13675e, j10, j11, x02);
        }

        public final a b(n nVar) {
            l.f(nVar, "networkType");
            this.f13673c = nVar;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f13679a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f13680b;

        public c(Uri uri, boolean z10) {
            l.f(uri, "uri");
            this.f13679a = uri;
            this.f13680b = z10;
        }

        public final Uri a() {
            return this.f13679a;
        }

        public final boolean b() {
            return this.f13680b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!l.a(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            l.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return l.a(this.f13679a, cVar.f13679a) && this.f13680b == cVar.f13680b;
        }

        public int hashCode() {
            return (this.f13679a.hashCode() * 31) + Boolean.hashCode(this.f13680b);
        }
    }

    public d(d dVar) {
        l.f(dVar, "other");
        this.f13664b = dVar.f13664b;
        this.f13665c = dVar.f13665c;
        this.f13663a = dVar.f13663a;
        this.f13666d = dVar.f13666d;
        this.f13667e = dVar.f13667e;
        this.f13670h = dVar.f13670h;
        this.f13668f = dVar.f13668f;
        this.f13669g = dVar.f13669g;
    }

    public final long a() {
        return this.f13669g;
    }

    public final long b() {
        return this.f13668f;
    }

    public final Set c() {
        return this.f13670h;
    }

    public final n d() {
        return this.f13663a;
    }

    public final boolean e() {
        return !this.f13670h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!l.a(d.class, obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f13664b == dVar.f13664b && this.f13665c == dVar.f13665c && this.f13666d == dVar.f13666d && this.f13667e == dVar.f13667e && this.f13668f == dVar.f13668f && this.f13669g == dVar.f13669g && this.f13663a == dVar.f13663a) {
            return l.a(this.f13670h, dVar.f13670h);
        }
        return false;
    }

    public final boolean f() {
        return this.f13666d;
    }

    public final boolean g() {
        return this.f13664b;
    }

    public final boolean h() {
        return this.f13665c;
    }

    public int hashCode() {
        long j10 = this.f13668f;
        long j11 = this.f13669g;
        return (((((((((((((this.f13663a.hashCode() * 31) + (this.f13664b ? 1 : 0)) * 31) + (this.f13665c ? 1 : 0)) * 31) + (this.f13666d ? 1 : 0)) * 31) + (this.f13667e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f13670h.hashCode();
    }

    public final boolean i() {
        return this.f13667e;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f13663a + ", requiresCharging=" + this.f13664b + ", requiresDeviceIdle=" + this.f13665c + ", requiresBatteryNotLow=" + this.f13666d + ", requiresStorageNotLow=" + this.f13667e + ", contentTriggerUpdateDelayMillis=" + this.f13668f + ", contentTriggerMaxDelayMillis=" + this.f13669g + ", contentUriTriggers=" + this.f13670h + ", }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(n nVar, boolean z10, boolean z11, boolean z12) {
        this(nVar, z10, false, z11, z12);
        l.f(nVar, "requiredNetworkType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(n nVar, boolean z10, boolean z11, boolean z12, int i10, g gVar) {
        this((i10 & 1) != 0 ? n.NOT_REQUIRED : nVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(n nVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(nVar, z10, z11, z12, z13, -1, 0, (Set) null, 192, (g) null);
        l.f(nVar, "requiredNetworkType");
    }

    public d(n nVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set) {
        l.f(nVar, "requiredNetworkType");
        l.f(set, "contentUriTriggers");
        this.f13663a = nVar;
        this.f13664b = z10;
        this.f13665c = z11;
        this.f13666d = z12;
        this.f13667e = z13;
        this.f13668f = j10;
        this.f13669g = j11;
        this.f13670h = set;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d(m1.n r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17, long r19, java.util.Set r21, int r22, cm.g r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            m1.n r1 = m1.n.NOT_REQUIRED
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r16
        L_0x0027:
            r6 = r0 & 32
            r7 = -1
            if (r6 == 0) goto L_0x002f
            r9 = r7
            goto L_0x0031
        L_0x002f:
            r9 = r17
        L_0x0031:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r19
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = ql.q0.d()
            goto L_0x0043
        L_0x0041:
            r0 = r21
        L_0x0043:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r3
            r18 = r9
            r20 = r7
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.d.<init>(m1.n, boolean, boolean, boolean, boolean, long, long, java.util.Set, int, cm.g):void");
    }
}
