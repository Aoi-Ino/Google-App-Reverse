package r1;

import cm.g;
import cm.l;
import m1.d;
import m1.m;
import m1.r;
import m1.x;

public final class u {

    /* renamed from: x  reason: collision with root package name */
    public static final a f15474x = new a((g) null);

    /* renamed from: y  reason: collision with root package name */
    private static final String f15475y;

    /* renamed from: z  reason: collision with root package name */
    public static final l.a f15476z = new t();

    /* renamed from: a  reason: collision with root package name */
    public final String f15477a;

    /* renamed from: b  reason: collision with root package name */
    public x f15478b;

    /* renamed from: c  reason: collision with root package name */
    public String f15479c;

    /* renamed from: d  reason: collision with root package name */
    public String f15480d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.b f15481e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.b f15482f;

    /* renamed from: g  reason: collision with root package name */
    public long f15483g;

    /* renamed from: h  reason: collision with root package name */
    public long f15484h;

    /* renamed from: i  reason: collision with root package name */
    public long f15485i;

    /* renamed from: j  reason: collision with root package name */
    public d f15486j;

    /* renamed from: k  reason: collision with root package name */
    public int f15487k;

    /* renamed from: l  reason: collision with root package name */
    public m1.a f15488l;

    /* renamed from: m  reason: collision with root package name */
    public long f15489m;

    /* renamed from: n  reason: collision with root package name */
    public long f15490n;

    /* renamed from: o  reason: collision with root package name */
    public long f15491o;

    /* renamed from: p  reason: collision with root package name */
    public long f15492p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15493q;

    /* renamed from: r  reason: collision with root package name */
    public r f15494r;

    /* renamed from: s  reason: collision with root package name */
    private int f15495s;

    /* renamed from: t  reason: collision with root package name */
    private final int f15496t;

    /* renamed from: u  reason: collision with root package name */
    private long f15497u;

    /* renamed from: v  reason: collision with root package name */
    private int f15498v;

    /* renamed from: w  reason: collision with root package name */
    private final int f15499w;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final long a(boolean z10, int i10, m1.a aVar, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            int i12 = i10;
            m1.a aVar2 = aVar;
            long j16 = j10;
            long j17 = j15;
            l.f(aVar, "backoffPolicy");
            if (j17 != Long.MAX_VALUE && z11) {
                return i11 == 0 ? j17 : f.c(j17, 900000 + j11);
            }
            if (z10) {
                return j11 + f.e(aVar2 == m1.a.LINEAR ? ((long) i12) * j16 : (long) Math.scalb((float) j16, i12 - 1), 18000000);
            } else if (z11) {
                long j18 = i11 == 0 ? j11 + j12 : j11 + j14;
                if (j13 != j14 && i11 == 0) {
                    j18 += j14 - j13;
                }
                return j18;
            } else if (j11 == -1) {
                return Long.MAX_VALUE;
            } else {
                return j11 + j12;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f15500a;

        /* renamed from: b  reason: collision with root package name */
        public x f15501b;

        public b(String str, x xVar) {
            l.f(str, "id");
            l.f(xVar, "state");
            this.f15500a = str;
            this.f15501b = xVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f15500a, bVar.f15500a) && this.f15501b == bVar.f15501b;
        }

        public int hashCode() {
            return (this.f15500a.hashCode() * 31) + this.f15501b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f15500a + ", state=" + this.f15501b + ')';
        }
    }

    static {
        String i10 = m.i("WorkSpec");
        l.e(i10, "tagWithPrefix(\"WorkSpec\")");
        f15475y = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(String str, String str2) {
        this(str, (x) null, str2, (String) null, (androidx.work.b) null, (androidx.work.b) null, 0, 0, 0, (d) null, 0, (m1.a) null, 0, 0, 0, 0, false, (r) null, 0, 0, 0, 0, 0, 8388602, (g) null);
        l.f(str, "id");
        l.f(str2, "workerClassName_");
    }

    public static /* synthetic */ u c(u uVar, String str, x xVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, d dVar, int i10, m1.a aVar, long j13, long j14, long j15, long j16, boolean z10, r rVar, int i11, int i12, long j17, int i13, int i14, int i15, Object obj) {
        u uVar2 = uVar;
        int i16 = i15;
        String str4 = (i16 & 1) != 0 ? uVar2.f15477a : str;
        x xVar2 = (i16 & 2) != 0 ? uVar2.f15478b : xVar;
        String str5 = (i16 & 4) != 0 ? uVar2.f15479c : str2;
        String str6 = (i16 & 8) != 0 ? uVar2.f15480d : str3;
        androidx.work.b bVar3 = (i16 & 16) != 0 ? uVar2.f15481e : bVar;
        androidx.work.b bVar4 = (i16 & 32) != 0 ? uVar2.f15482f : bVar2;
        long j18 = (i16 & 64) != 0 ? uVar2.f15483g : j10;
        long j19 = (i16 & 128) != 0 ? uVar2.f15484h : j11;
        long j20 = (i16 & 256) != 0 ? uVar2.f15485i : j12;
        d dVar2 = (i16 & 512) != 0 ? uVar2.f15486j : dVar;
        return uVar.b(str4, xVar2, str5, str6, bVar3, bVar4, j18, j19, j20, dVar2, (i16 & 1024) != 0 ? uVar2.f15487k : i10, (i16 & 2048) != 0 ? uVar2.f15488l : aVar, (i16 & 4096) != 0 ? uVar2.f15489m : j13, (i16 & 8192) != 0 ? uVar2.f15490n : j14, (i16 & 16384) != 0 ? uVar2.f15491o : j15, (i16 & 32768) != 0 ? uVar2.f15492p : j16, (i16 & 65536) != 0 ? uVar2.f15493q : z10, (131072 & i16) != 0 ? uVar2.f15494r : rVar, (i16 & 262144) != 0 ? uVar2.f15495s : i11, (i16 & 524288) != 0 ? uVar2.f15496t : i12, (i16 & 1048576) != 0 ? uVar2.f15497u : j17, (i16 & 2097152) != 0 ? uVar2.f15498v : i13, (i16 & 4194304) != 0 ? uVar2.f15499w : i14);
    }

    public final long a() {
        a aVar = f15474x;
        return aVar.a(j(), this.f15487k, this.f15488l, this.f15489m, this.f15490n, this.f15495s, k(), this.f15483g, this.f15485i, this.f15484h, this.f15497u);
    }

    public final u b(String str, x xVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, d dVar, int i10, m1.a aVar, long j13, long j14, long j15, long j16, boolean z10, r rVar, int i11, int i12, long j17, int i13, int i14) {
        String str4 = str;
        l.f(str4, "id");
        l.f(xVar, "state");
        l.f(str2, "workerClassName");
        l.f(str3, "inputMergerClassName");
        l.f(bVar, "input");
        l.f(bVar2, "output");
        l.f(dVar, "constraints");
        l.f(aVar, "backoffPolicy");
        l.f(rVar, "outOfQuotaPolicy");
        return new u(str4, xVar, str2, str3, bVar, bVar2, j10, j11, j12, dVar, i10, aVar, j13, j14, j15, j16, z10, rVar, i11, i12, j17, i13, i14);
    }

    public final int d() {
        return this.f15496t;
    }

    public final long e() {
        return this.f15497u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return l.a(this.f15477a, uVar.f15477a) && this.f15478b == uVar.f15478b && l.a(this.f15479c, uVar.f15479c) && l.a(this.f15480d, uVar.f15480d) && l.a(this.f15481e, uVar.f15481e) && l.a(this.f15482f, uVar.f15482f) && this.f15483g == uVar.f15483g && this.f15484h == uVar.f15484h && this.f15485i == uVar.f15485i && l.a(this.f15486j, uVar.f15486j) && this.f15487k == uVar.f15487k && this.f15488l == uVar.f15488l && this.f15489m == uVar.f15489m && this.f15490n == uVar.f15490n && this.f15491o == uVar.f15491o && this.f15492p == uVar.f15492p && this.f15493q == uVar.f15493q && this.f15494r == uVar.f15494r && this.f15495s == uVar.f15495s && this.f15496t == uVar.f15496t && this.f15497u == uVar.f15497u && this.f15498v == uVar.f15498v && this.f15499w == uVar.f15499w;
    }

    public final int f() {
        return this.f15498v;
    }

    public final int g() {
        return this.f15495s;
    }

    public final int h() {
        return this.f15499w;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.f15477a.hashCode() * 31) + this.f15478b.hashCode()) * 31) + this.f15479c.hashCode()) * 31) + this.f15480d.hashCode()) * 31) + this.f15481e.hashCode()) * 31) + this.f15482f.hashCode()) * 31) + Long.hashCode(this.f15483g)) * 31) + Long.hashCode(this.f15484h)) * 31) + Long.hashCode(this.f15485i)) * 31) + this.f15486j.hashCode()) * 31) + Integer.hashCode(this.f15487k)) * 31) + this.f15488l.hashCode()) * 31) + Long.hashCode(this.f15489m)) * 31) + Long.hashCode(this.f15490n)) * 31) + Long.hashCode(this.f15491o)) * 31) + Long.hashCode(this.f15492p)) * 31;
        boolean z10 = this.f15493q;
        if (z10) {
            z10 = true;
        }
        return ((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.f15494r.hashCode()) * 31) + Integer.hashCode(this.f15495s)) * 31) + Integer.hashCode(this.f15496t)) * 31) + Long.hashCode(this.f15497u)) * 31) + Integer.hashCode(this.f15498v)) * 31) + Integer.hashCode(this.f15499w);
    }

    public final boolean i() {
        return !l.a(d.f13662j, this.f15486j);
    }

    public final boolean j() {
        return this.f15478b == x.ENQUEUED && this.f15487k > 0;
    }

    public final boolean k() {
        return this.f15484h != 0;
    }

    public String toString() {
        return "{WorkSpec: " + this.f15477a + '}';
    }

    public u(String str, x xVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, d dVar, int i10, m1.a aVar, long j13, long j14, long j15, long j16, boolean z10, r rVar, int i11, int i12, long j17, int i13, int i14) {
        androidx.work.b bVar3 = bVar;
        androidx.work.b bVar4 = bVar2;
        d dVar2 = dVar;
        m1.a aVar2 = aVar;
        r rVar2 = rVar;
        l.f(str, "id");
        l.f(xVar, "state");
        l.f(str2, "workerClassName");
        l.f(str3, "inputMergerClassName");
        l.f(bVar3, "input");
        l.f(bVar4, "output");
        l.f(dVar2, "constraints");
        l.f(aVar2, "backoffPolicy");
        l.f(rVar2, "outOfQuotaPolicy");
        this.f15477a = str;
        this.f15478b = xVar;
        this.f15479c = str2;
        this.f15480d = str3;
        this.f15481e = bVar3;
        this.f15482f = bVar4;
        this.f15483g = j10;
        this.f15484h = j11;
        this.f15485i = j12;
        this.f15486j = dVar2;
        this.f15487k = i10;
        this.f15488l = aVar2;
        this.f15489m = j13;
        this.f15490n = j14;
        this.f15491o = j15;
        this.f15492p = j16;
        this.f15493q = z10;
        this.f15494r = rVar2;
        this.f15495s = i11;
        this.f15496t = i12;
        this.f15497u = j17;
        this.f15498v = i13;
        this.f15499w = i14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ u(java.lang.String r35, m1.x r36, java.lang.String r37, java.lang.String r38, androidx.work.b r39, androidx.work.b r40, long r41, long r43, long r45, m1.d r47, int r48, m1.a r49, long r50, long r52, long r54, long r56, boolean r58, m1.r r59, int r60, int r61, long r62, int r64, int r65, int r66, cm.g r67) {
        /*
            r34 = this;
            r0 = r66
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            m1.x r1 = m1.x.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r36
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            java.lang.Class<androidx.work.OverwritingInputMerger> r1 = androidx.work.OverwritingInputMerger.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "OverwritingInputMerger::class.java.name"
            cm.l.e(r1, r2)
            r6 = r1
            goto L_0x001f
        L_0x001d:
            r6 = r38
        L_0x001f:
            r1 = r0 & 16
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto L_0x002c
            androidx.work.b r1 = androidx.work.b.f4103c
            cm.l.e(r1, r2)
            r7 = r1
            goto L_0x002e
        L_0x002c:
            r7 = r39
        L_0x002e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0039
            androidx.work.b r1 = androidx.work.b.f4103c
            cm.l.e(r1, r2)
            r8 = r1
            goto L_0x003b
        L_0x0039:
            r8 = r40
        L_0x003b:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0043
            r9 = r2
            goto L_0x0045
        L_0x0043:
            r9 = r41
        L_0x0045:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x004b
            r11 = r2
            goto L_0x004d
        L_0x004b:
            r11 = r43
        L_0x004d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0053
            r13 = r2
            goto L_0x0055
        L_0x0053:
            r13 = r45
        L_0x0055:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x005d
            m1.d r1 = m1.d.f13662j
            r15 = r1
            goto L_0x005f
        L_0x005d:
            r15 = r47
        L_0x005f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x0067
            r16 = r5
            goto L_0x0069
        L_0x0067:
            r16 = r48
        L_0x0069:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0072
            m1.a r1 = m1.a.EXPONENTIAL
            r17 = r1
            goto L_0x0074
        L_0x0072:
            r17 = r49
        L_0x0074:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x007b
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x007d
        L_0x007b:
            r18 = r50
        L_0x007d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r20 = -1
            if (r1 == 0) goto L_0x0086
            r22 = r20
            goto L_0x0088
        L_0x0086:
            r22 = r52
        L_0x0088:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x008f
            r24 = r2
            goto L_0x0091
        L_0x008f:
            r24 = r54
        L_0x0091:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009a
            r26 = r20
            goto L_0x009c
        L_0x009a:
            r26 = r56
        L_0x009c:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a3
            r1 = r5
            goto L_0x00a5
        L_0x00a3:
            r1 = r58
        L_0x00a5:
            r2 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00af
            m1.r r2 = m1.r.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r28 = r2
            goto L_0x00b1
        L_0x00af:
            r28 = r59
        L_0x00b1:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00b9
            r29 = r5
            goto L_0x00bb
        L_0x00b9:
            r29 = r60
        L_0x00bb:
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00c3
            r30 = r5
            goto L_0x00c5
        L_0x00c3:
            r30 = r61
        L_0x00c5:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00d2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r31 = r2
            goto L_0x00d4
        L_0x00d2:
            r31 = r62
        L_0x00d4:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00dc
            r33 = r5
            goto L_0x00de
        L_0x00dc:
            r33 = r64
        L_0x00de:
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00e6
            r0 = -256(0xffffffffffffff00, float:NaN)
            goto L_0x00e8
        L_0x00e6:
            r0 = r65
        L_0x00e8:
            r2 = r34
            r3 = r35
            r5 = r37
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r1
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r32 = r33
            r33 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29, r30, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.u.<init>(java.lang.String, m1.x, java.lang.String, java.lang.String, androidx.work.b, androidx.work.b, long, long, long, m1.d, int, m1.a, long, long, long, long, boolean, m1.r, int, int, long, int, int, int, cm.g):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(java.lang.String r38, r1.u r39) {
        /*
            r37 = this;
            r0 = r39
            r1 = r37
            r2 = r38
            java.lang.String r3 = "newId"
            r4 = r38
            cm.l.f(r4, r3)
            java.lang.String r3 = "other"
            cm.l.f(r0, r3)
            java.lang.String r4 = r0.f15479c
            m1.x r3 = r0.f15478b
            java.lang.String r5 = r0.f15480d
            androidx.work.b r7 = new androidx.work.b
            r6 = r7
            androidx.work.b r8 = r0.f15481e
            r7.<init>((androidx.work.b) r8)
            androidx.work.b r8 = new androidx.work.b
            r7 = r8
            androidx.work.b r9 = r0.f15482f
            r8.<init>((androidx.work.b) r9)
            long r8 = r0.f15483g
            long r10 = r0.f15484h
            long r12 = r0.f15485i
            m1.d r15 = new m1.d
            r14 = r15
            r35 = r1
            m1.d r1 = r0.f15486j
            r15.<init>(r1)
            int r15 = r0.f15487k
            m1.a r1 = r0.f15488l
            r16 = r1
            r36 = r2
            long r1 = r0.f15489m
            r17 = r1
            long r1 = r0.f15490n
            r19 = r1
            long r1 = r0.f15491o
            r21 = r1
            long r1 = r0.f15492p
            r23 = r1
            boolean r1 = r0.f15493q
            r25 = r1
            m1.r r1 = r0.f15494r
            r26 = r1
            int r1 = r0.f15495s
            r27 = r1
            long r1 = r0.f15497u
            r29 = r1
            int r1 = r0.f15498v
            r31 = r1
            int r0 = r0.f15499w
            r32 = r0
            r28 = 0
            r33 = 524288(0x80000, float:7.34684E-40)
            r34 = 0
            r1 = r35
            r2 = r36
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.u.<init>(java.lang.String, r1.u):void");
    }
}
