package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.q1;
import java.util.List;
import java.util.Map;

final class l implements q1 {

    /* renamed from: a  reason: collision with root package name */
    private final k f7126a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7127a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.p1$b[] r0 = com.google.crypto.tink.shaded.protobuf.p1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7127a = r0
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f7127a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.crypto.tink.shaded.protobuf.p1$b r1 = com.google.crypto.tink.shaded.protobuf.p1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.l.a.<clinit>():void");
        }
    }

    private l(k kVar) {
        k kVar2 = (k) z.b(kVar, "output");
        this.f7126a = kVar2;
        kVar2.f7114a = this;
    }

    public static l P(k kVar) {
        l lVar = kVar.f7114a;
        return lVar != null ? lVar : new l(kVar);
    }

    private void Q(int i10, h0.a aVar, Map map) {
        int[] iArr = a.f7127a;
        throw null;
    }

    private void R(int i10, Object obj) {
        if (obj instanceof String) {
            this.f7126a.C0(i10, (String) obj);
        } else {
            this.f7126a.a0(i10, (h) obj);
        }
    }

    public q1.a A() {
        return q1.a.ASCENDING;
    }

    public void B(int i10, long j10) {
        this.f7126a.A0(i10, j10);
    }

    public void C(int i10, float f10) {
        this.f7126a.j0(i10, f10);
    }

    public void D(int i10, List list) {
        int i11 = 0;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            while (i11 < list.size()) {
                R(i10, d0Var.S(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.C0(i10, (String) list.get(i11));
            i11++;
        }
    }

    public void E(int i10) {
        this.f7126a.D0(i10, 4);
    }

    public void F(int i10, String str) {
        this.f7126a.C0(i10, str);
    }

    public void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.G(((Integer) list.get(i13)).intValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.z0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.y0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void H(int i10, long j10) {
        this.f7126a.G0(i10, j10);
    }

    public void I(int i10, int i11) {
        this.f7126a.d0(i10, i11);
    }

    public void J(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.w(((Long) list.get(i13)).longValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.q0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.p0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void K(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.k(((Integer) list.get(i13)).intValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.e0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.d0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void L(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.i(((Double) list.get(i13)).doubleValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.c0(((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.b0(i10, ((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    public void M(int i10, Object obj, d1 d1Var) {
        this.f7126a.l0(i10, (o0) obj, d1Var);
    }

    public void N(int i10, int i11) {
        this.f7126a.y0(i10, i11);
    }

    public void O(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f7126a.a0(i10, (h) list.get(i11));
        }
    }

    public void a(int i10, List list, d1 d1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), d1Var);
        }
    }

    public void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.u(((Integer) list.get(i13)).intValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.o0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.n0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.q(((Float) list.get(i13)).floatValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.k0(((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.j0(i10, ((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    public void d(int i10, long j10) {
        this.f7126a.p0(i10, j10);
    }

    public void e(int i10, boolean z10) {
        this.f7126a.Y(i10, z10);
    }

    public void f(int i10, int i11) {
        this.f7126a.E0(i10, i11);
    }

    public void g(int i10, List list, d1 d1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            s(i10, list.get(i11), d1Var);
        }
    }

    public final void h(int i10, Object obj) {
        if (obj instanceof h) {
            this.f7126a.t0(i10, (h) obj);
        } else {
            this.f7126a.s0(i10, (o0) obj);
        }
    }

    public void i(int i10, int i11) {
        this.f7126a.u0(i10, i11);
    }

    public void j(int i10) {
        this.f7126a.D0(i10, 3);
    }

    public void k(int i10, int i11) {
        this.f7126a.n0(i10, i11);
    }

    public void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.o(((Long) list.get(i13)).longValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.i0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.h0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.C(((Integer) list.get(i13)).intValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.v0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.u0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void n(int i10, int i11) {
        this.f7126a.f0(i10, i11);
    }

    public void o(int i10, double d10) {
        this.f7126a.b0(i10, d10);
    }

    public void p(int i10, long j10) {
        this.f7126a.w0(i10, j10);
    }

    public void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.E(((Long) list.get(i13)).longValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.x0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.w0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.m(((Integer) list.get(i13)).intValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.g0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.f0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void s(int i10, Object obj, d1 d1Var) {
        this.f7126a.r0(i10, (o0) obj, d1Var);
    }

    public void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.P(((Long) list.get(i13)).longValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.H0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.G0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.e(((Boolean) list.get(i13)).booleanValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.Z(((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.Y(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public void v(int i10, h hVar) {
        this.f7126a.a0(i10, hVar);
    }

    public void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.N(((Integer) list.get(i13)).intValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.F0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.E0(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void x(int i10, h0.a aVar, Map map) {
        if (this.f7126a.T()) {
            Q(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f7126a.D0(i10, 2);
            this.f7126a.F0(h0.a(aVar, entry.getKey(), entry.getValue()));
            h0.b(this.f7126a, aVar, entry.getKey(), entry.getValue());
        }
    }

    public void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7126a.D0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.I(((Long) list.get(i13)).longValue());
            }
            this.f7126a.F0(i12);
            while (i11 < list.size()) {
                this.f7126a.B0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7126a.A0(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public void z(int i10, long j10) {
        this.f7126a.h0(i10, j10);
    }
}
