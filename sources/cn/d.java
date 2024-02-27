package cn;

import cm.l;
import in.a0;
import in.e;
import in.g;
import in.h;
import in.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final c[] f20265a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f20266b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f20267c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f20268a;

        /* renamed from: b  reason: collision with root package name */
        private final g f20269b;

        /* renamed from: c  reason: collision with root package name */
        public c[] f20270c;

        /* renamed from: d  reason: collision with root package name */
        private int f20271d;

        /* renamed from: e  reason: collision with root package name */
        public int f20272e;

        /* renamed from: f  reason: collision with root package name */
        public int f20273f;

        /* renamed from: g  reason: collision with root package name */
        private final int f20274g;

        /* renamed from: h  reason: collision with root package name */
        private int f20275h;

        public a(a0 a0Var, int i10, int i11) {
            l.f(a0Var, "source");
            this.f20274g = i10;
            this.f20275h = i11;
            this.f20268a = new ArrayList();
            this.f20269b = o.b(a0Var);
            c[] cVarArr = new c[8];
            this.f20270c = cVarArr;
            this.f20271d = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f20275h;
            int i11 = this.f20273f;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                d(i11 - i10);
            }
        }

        private final void b() {
            l.l(this.f20270c, (Object) null, 0, 0, 6, (Object) null);
            this.f20271d = this.f20270c.length - 1;
            this.f20272e = 0;
            this.f20273f = 0;
        }

        private final int c(int i10) {
            return this.f20271d + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f20270c.length;
                while (true) {
                    length--;
                    i11 = this.f20271d;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f20270c;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f20272e);
                        this.f20271d += i12;
                    } else {
                        c cVar = this.f20270c[length];
                        l.c(cVar);
                        int i13 = cVar.f20262a;
                        i10 -= i13;
                        this.f20273f -= i13;
                        this.f20272e--;
                        i12++;
                    }
                }
                c[] cVarArr2 = this.f20270c;
                System.arraycopy(cVarArr2, i11 + 1, cVarArr2, i11 + 1 + i12, this.f20272e);
                this.f20271d += i12;
            }
            return i12;
        }

        private final h f(int i10) {
            c cVar;
            if (h(i10)) {
                cVar = d.f20267c.c()[i10];
            } else {
                int c10 = c(i10 - d.f20267c.c().length);
                if (c10 >= 0) {
                    c[] cVarArr = this.f20270c;
                    if (c10 < cVarArr.length) {
                        cVar = cVarArr[c10];
                        l.c(cVar);
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            }
            return cVar.f20263b;
        }

        private final void g(int i10, c cVar) {
            this.f20268a.add(cVar);
            int i11 = cVar.f20262a;
            if (i10 != -1) {
                c cVar2 = this.f20270c[c(i10)];
                l.c(cVar2);
                i11 -= cVar2.f20262a;
            }
            int i12 = this.f20275h;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f20273f + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f20272e + 1;
                c[] cVarArr = this.f20270c;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f20271d = this.f20270c.length - 1;
                    this.f20270c = cVarArr2;
                }
                int i14 = this.f20271d;
                this.f20271d = i14 - 1;
                this.f20270c[i14] = cVar;
                this.f20272e++;
            } else {
                this.f20270c[i10 + c(i10) + d10] = cVar;
            }
            this.f20273f += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f20267c.c().length - 1;
        }

        private final int i() {
            return vm.b.b(this.f20269b.readByte(), 255);
        }

        private final void l(int i10) {
            if (h(i10)) {
                this.f20268a.add(d.f20267c.c()[i10]);
                return;
            }
            int c10 = c(i10 - d.f20267c.c().length);
            if (c10 >= 0) {
                c[] cVarArr = this.f20270c;
                if (c10 < cVarArr.length) {
                    c cVar = cVarArr[c10];
                    l.c(cVar);
                    this.f20268a.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new c(f(i10), j()));
        }

        private final void o() {
            g(-1, new c(d.f20267c.a(j()), j()));
        }

        private final void p(int i10) {
            this.f20268a.add(new c(f(i10), j()));
        }

        private final void q() {
            this.f20268a.add(new c(d.f20267c.a(j()), j()));
        }

        public final List e() {
            List t02 = y.t0(this.f20268a);
            this.f20268a.clear();
            return t02;
        }

        public final h j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long m10 = (long) m(i10, 127);
            if (!z10) {
                return this.f20269b.v(m10);
            }
            e eVar = new e();
            k.f20451d.b(this.f20269b, m10, eVar);
            return eVar.u();
        }

        public final void k() {
            while (!this.f20269b.P()) {
                int b10 = vm.b.b(this.f20269b.readByte(), 255);
                if (b10 == 128) {
                    throw new IOException("index == 0");
                } else if ((b10 & 128) == 128) {
                    l(m(b10, 127) - 1);
                } else if (b10 == 64) {
                    o();
                } else if ((b10 & 64) == 64) {
                    n(m(b10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int m10 = m(b10, 31);
                    this.f20275h = m10;
                    if (m10 < 0 || m10 > this.f20274g) {
                        throw new IOException("Invalid dynamic table size update " + this.f20275h);
                    }
                    a();
                } else if (b10 == 16 || b10 == 0) {
                    q();
                } else {
                    p(m(b10, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(a0 a0Var, int i10, int i11, int i12, cm.g gVar) {
            this(a0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f20276a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f20277b;

        /* renamed from: c  reason: collision with root package name */
        public int f20278c;

        /* renamed from: d  reason: collision with root package name */
        public c[] f20279d;

        /* renamed from: e  reason: collision with root package name */
        private int f20280e;

        /* renamed from: f  reason: collision with root package name */
        public int f20281f;

        /* renamed from: g  reason: collision with root package name */
        public int f20282g;

        /* renamed from: h  reason: collision with root package name */
        public int f20283h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f20284i;

        /* renamed from: j  reason: collision with root package name */
        private final e f20285j;

        public b(int i10, boolean z10, e eVar) {
            l.f(eVar, "out");
            this.f20283h = i10;
            this.f20284i = z10;
            this.f20285j = eVar;
            this.f20276a = Integer.MAX_VALUE;
            this.f20278c = i10;
            c[] cVarArr = new c[8];
            this.f20279d = cVarArr;
            this.f20280e = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f20278c;
            int i11 = this.f20282g;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                c(i11 - i10);
            }
        }

        private final void b() {
            l.l(this.f20279d, (Object) null, 0, 0, 6, (Object) null);
            this.f20280e = this.f20279d.length - 1;
            this.f20281f = 0;
            this.f20282g = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f20279d.length;
                while (true) {
                    length--;
                    i11 = this.f20280e;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f20279d;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f20281f);
                        c[] cVarArr2 = this.f20279d;
                        int i13 = this.f20280e;
                        Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i12, (Object) null);
                        this.f20280e += i12;
                    } else {
                        c cVar = this.f20279d[length];
                        l.c(cVar);
                        i10 -= cVar.f20262a;
                        int i14 = this.f20282g;
                        c cVar2 = this.f20279d[length];
                        l.c(cVar2);
                        this.f20282g = i14 - cVar2.f20262a;
                        this.f20281f--;
                        i12++;
                    }
                }
                c[] cVarArr3 = this.f20279d;
                System.arraycopy(cVarArr3, i11 + 1, cVarArr3, i11 + 1 + i12, this.f20281f);
                c[] cVarArr22 = this.f20279d;
                int i132 = this.f20280e;
                Arrays.fill(cVarArr22, i132 + 1, i132 + 1 + i12, (Object) null);
                this.f20280e += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f20262a;
            int i11 = this.f20278c;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f20282g + i10) - i11);
            int i12 = this.f20281f + 1;
            c[] cVarArr = this.f20279d;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f20280e = this.f20279d.length - 1;
                this.f20279d = cVarArr2;
            }
            int i13 = this.f20280e;
            this.f20280e = i13 - 1;
            this.f20279d[i13] = cVar;
            this.f20281f++;
            this.f20282g += i10;
        }

        public final void e(int i10) {
            this.f20283h = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f20278c;
            if (i11 != min) {
                if (min < i11) {
                    this.f20276a = Math.min(this.f20276a, min);
                }
                this.f20277b = true;
                this.f20278c = min;
                a();
            }
        }

        public final void f(h hVar) {
            int q10;
            int i10;
            l.f(hVar, "data");
            if (this.f20284i) {
                k kVar = k.f20451d;
                if (kVar.d(hVar) < hVar.q()) {
                    e eVar = new e();
                    kVar.c(hVar, eVar);
                    hVar = eVar.u();
                    q10 = hVar.q();
                    i10 = 128;
                    h(q10, 127, i10);
                    this.f20285j.N(hVar);
                }
            }
            q10 = hVar.q();
            i10 = 0;
            h(q10, 127, i10);
            this.f20285j.N(hVar);
        }

        public final void g(List list) {
            int i10;
            int i11;
            l.f(list, "headerBlock");
            if (this.f20277b) {
                int i12 = this.f20276a;
                if (i12 < this.f20278c) {
                    h(i12, 31, 32);
                }
                this.f20277b = false;
                this.f20276a = Integer.MAX_VALUE;
                h(this.f20278c, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = (c) list.get(i13);
                h s10 = cVar.f20263b.s();
                h hVar = cVar.f20264c;
                d dVar = d.f20267c;
                Integer num = (Integer) dVar.b().get(s10);
                if (num != null) {
                    int intValue = num.intValue();
                    i10 = intValue + 1;
                    if (2 <= i10 && 7 >= i10) {
                        if (l.a(dVar.c()[intValue].f20264c, hVar)) {
                            i11 = i10;
                        } else if (l.a(dVar.c()[i10].f20264c, hVar)) {
                            i11 = i10;
                            i10 = intValue + 2;
                        }
                    }
                    i11 = i10;
                    i10 = -1;
                } else {
                    i11 = -1;
                    i10 = -1;
                }
                if (i10 == -1) {
                    int i14 = this.f20280e + 1;
                    int length = this.f20279d.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        c cVar2 = this.f20279d[i14];
                        l.c(cVar2);
                        if (l.a(cVar2.f20263b, s10)) {
                            c cVar3 = this.f20279d[i14];
                            l.c(cVar3);
                            if (l.a(cVar3.f20264c, hVar)) {
                                i10 = d.f20267c.c().length + (i14 - this.f20280e);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i14 - this.f20280e) + d.f20267c.c().length;
                            }
                        }
                        i14++;
                    }
                }
                if (i10 != -1) {
                    h(i10, 127, 128);
                } else {
                    if (i11 == -1) {
                        this.f20285j.Q(64);
                        f(s10);
                    } else if (!s10.r(c.f20255d) || !(!l.a(c.f20260i, s10))) {
                        h(i11, 63, 64);
                    } else {
                        h(i11, 15, 0);
                        f(hVar);
                    }
                    f(hVar);
                    d(cVar);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            int i13;
            e eVar;
            if (i10 < i11) {
                eVar = this.f20285j;
                i13 = i10 | i12;
            } else {
                this.f20285j.Q(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f20285j.Q(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                eVar = this.f20285j;
            }
            eVar.Q(i13);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, boolean z10, e eVar, int i11, cm.g gVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }

    static {
        d dVar = new d();
        f20267c = dVar;
        c cVar = r2;
        c cVar2 = new c(c.f20260i, "");
        c cVar3 = r3;
        h hVar = c.f20257f;
        c cVar4 = new c(hVar, "GET");
        c cVar5 = r5;
        c cVar6 = new c(hVar, "POST");
        c cVar7 = r5;
        h hVar2 = c.f20258g;
        c cVar8 = new c(hVar2, "/");
        c cVar9 = r7;
        c cVar10 = new c(hVar2, "/index.html");
        c cVar11 = r7;
        h hVar3 = c.f20259h;
        c cVar12 = new c(hVar3, "http");
        c cVar13 = r9;
        c cVar14 = new c(hVar3, "https");
        c cVar15 = r9;
        h hVar4 = c.f20256e;
        c cVar16 = new c(hVar4, "200");
        c cVar17 = r10;
        c cVar18 = new c(hVar4, "204");
        c cVar19 = r11;
        c cVar20 = new c(hVar4, "206");
        c cVar21 = r12;
        c cVar22 = new c(hVar4, "304");
        c cVar23 = r13;
        c cVar24 = new c(hVar4, "400");
        c cVar25 = r15;
        d dVar2 = dVar;
        c cVar26 = new c(hVar4, "404");
        h hVar5 = hVar4;
        c cVar27 = r0;
        c cVar28 = cVar;
        c cVar29 = new c(hVar5, "500");
        String str = "";
        c cVar30 = r0;
        c cVar31 = new c("accept-charset", str);
        c cVar32 = r0;
        c cVar33 = new c("accept-encoding", "gzip, deflate");
        c cVar34 = r0;
        c cVar35 = new c("accept-language", str);
        c cVar36 = r0;
        c cVar37 = new c("accept-ranges", str);
        c cVar38 = r0;
        c cVar39 = new c("accept", str);
        c cVar40 = r0;
        c cVar41 = new c("access-control-allow-origin", str);
        c cVar42 = r0;
        c cVar43 = new c("age", str);
        c cVar44 = r0;
        c cVar45 = new c("allow", str);
        c cVar46 = r0;
        c cVar47 = new c("authorization", str);
        c cVar48 = r0;
        c cVar49 = new c("cache-control", str);
        c cVar50 = r0;
        c cVar51 = new c("content-disposition", str);
        c cVar52 = r0;
        c cVar53 = new c("content-encoding", str);
        c cVar54 = r0;
        c cVar55 = new c("content-language", str);
        c cVar56 = r0;
        c cVar57 = new c("content-length", str);
        c cVar58 = r0;
        c cVar59 = new c("content-location", str);
        c cVar60 = r0;
        c cVar61 = new c("content-range", str);
        c cVar62 = r0;
        c cVar63 = new c("content-type", str);
        c cVar64 = r0;
        c cVar65 = new c("cookie", str);
        c cVar66 = r0;
        c cVar67 = new c("date", str);
        c cVar68 = r0;
        c cVar69 = new c("etag", str);
        c cVar70 = r0;
        c cVar71 = new c("expect", str);
        c cVar72 = r0;
        c cVar73 = new c("expires", str);
        c cVar74 = r0;
        c cVar75 = new c("from", str);
        c cVar76 = r0;
        c cVar77 = new c("host", str);
        c cVar78 = r0;
        c cVar79 = new c("if-match", str);
        c cVar80 = r0;
        c cVar81 = new c("if-modified-since", str);
        c cVar82 = r0;
        c cVar83 = new c("if-none-match", str);
        c cVar84 = r0;
        c cVar85 = new c("if-range", str);
        c cVar86 = r0;
        c cVar87 = new c("if-unmodified-since", str);
        c cVar88 = r0;
        c cVar89 = new c("last-modified", str);
        c cVar90 = r0;
        c cVar91 = new c("link", str);
        c cVar92 = r0;
        c cVar93 = new c("location", str);
        c cVar94 = r0;
        c cVar95 = new c("max-forwards", str);
        c cVar96 = r0;
        c cVar97 = new c("proxy-authenticate", str);
        c cVar98 = r0;
        c cVar99 = new c("proxy-authorization", str);
        c cVar100 = r0;
        c cVar101 = new c("range", str);
        c cVar102 = r0;
        c cVar103 = new c("referer", str);
        c cVar104 = r0;
        c cVar105 = new c("refresh", str);
        c cVar106 = r0;
        c cVar107 = new c("retry-after", str);
        c cVar108 = r0;
        c cVar109 = new c("server", str);
        c cVar110 = r0;
        c cVar111 = new c("set-cookie", str);
        c cVar112 = r0;
        c cVar113 = new c("strict-transport-security", str);
        c cVar114 = r0;
        c cVar115 = new c("transfer-encoding", str);
        c cVar116 = r0;
        c cVar117 = new c("user-agent", str);
        c cVar118 = r0;
        c cVar119 = new c("vary", str);
        c cVar120 = r0;
        c cVar121 = new c("via", str);
        c cVar122 = r0;
        c cVar123 = new c("www-authenticate", str);
        f20265a = new c[]{cVar28, cVar3, cVar5, cVar7, cVar9, cVar11, cVar13, cVar15, cVar17, cVar19, cVar21, cVar23, cVar25, cVar27, cVar30, cVar32, cVar34, cVar36, cVar38, cVar40, cVar42, cVar44, cVar46, cVar48, cVar50, cVar52, cVar54, cVar56, cVar58, cVar60, cVar62, cVar64, cVar66, cVar68, cVar70, cVar72, cVar74, cVar76, cVar78, cVar80, cVar82, cVar84, cVar86, cVar88, cVar90, cVar92, cVar94, cVar96, cVar98, cVar100, cVar102, cVar104, cVar106, cVar108, cVar110, cVar112, cVar114, cVar116, cVar118, cVar120, cVar122};
        f20266b = dVar2.d();
    }

    private d() {
    }

    private final Map d() {
        c[] cVarArr = f20265a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f20265a;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f20263b)) {
                linkedHashMap.put(cVarArr2[i10].f20263b, Integer.valueOf(i10));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.e(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final h a(h hVar) {
        l.f(hVar, "name");
        int q10 = hVar.q();
        for (int i10 = 0; i10 < q10; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte d10 = hVar.d(i10);
            if (b10 <= d10 && b11 >= d10) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.t());
            }
        }
        return hVar;
    }

    public final Map b() {
        return f20266b;
    }

    public final c[] c() {
        return f20265a;
    }
}
