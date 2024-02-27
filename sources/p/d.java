package p;

import java.util.Arrays;
import java.util.HashMap;
import p.i;
import s.d;
import s.e;

public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f14515r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f14516s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f14517t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f14518u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f14519v = false;

    /* renamed from: w  reason: collision with root package name */
    private static int f14520w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static long f14521x;

    /* renamed from: y  reason: collision with root package name */
    public static long f14522y;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14523a;

    /* renamed from: b  reason: collision with root package name */
    int f14524b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f14525c;

    /* renamed from: d  reason: collision with root package name */
    private a f14526d;

    /* renamed from: e  reason: collision with root package name */
    private int f14527e;

    /* renamed from: f  reason: collision with root package name */
    private int f14528f;

    /* renamed from: g  reason: collision with root package name */
    b[] f14529g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14530h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14531i;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f14532j;

    /* renamed from: k  reason: collision with root package name */
    int f14533k;

    /* renamed from: l  reason: collision with root package name */
    int f14534l;

    /* renamed from: m  reason: collision with root package name */
    private int f14535m;

    /* renamed from: n  reason: collision with root package name */
    final c f14536n;

    /* renamed from: o  reason: collision with root package name */
    private i[] f14537o;

    /* renamed from: p  reason: collision with root package name */
    private int f14538p;

    /* renamed from: q  reason: collision with root package name */
    private a f14539q;

    interface a {
        void a(i iVar);

        void b(a aVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends b {
        public b(c cVar) {
            this.f14509e = new j(this, cVar);
        }
    }

    public d() {
        this.f14523a = false;
        this.f14524b = 0;
        this.f14525c = null;
        this.f14527e = 32;
        this.f14528f = 32;
        this.f14529g = null;
        this.f14530h = false;
        this.f14531i = false;
        this.f14532j = new boolean[32];
        this.f14533k = 1;
        this.f14534l = 0;
        this.f14535m = 32;
        this.f14537o = new i[f14520w];
        this.f14538p = 0;
        this.f14529g = new b[32];
        C();
        c cVar = new c();
        this.f14536n = cVar;
        this.f14526d = new h(cVar);
        this.f14539q = f14519v ? new b(cVar) : new b(cVar);
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f14533k; i10++) {
            this.f14532j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f14533k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f14532j[aVar.getKey().f14556g] = true;
            }
            i c10 = aVar.c(this, this.f14532j);
            if (c10 != null) {
                boolean[] zArr = this.f14532j;
                int i12 = c10.f14556g;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (c10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f14534l; i14++) {
                    b bVar = this.f14529g[i14];
                    if (bVar.f14505a.f14563n != i.a.UNRESTRICTED && !bVar.f14510f && bVar.t(c10)) {
                        float i15 = bVar.f14509e.i(c10);
                        if (i15 < 0.0f) {
                            float f11 = (-bVar.f14506b) / i15;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f14529g[i13];
                    bVar2.f14505a.f14557h = -1;
                    bVar2.x(c10);
                    i iVar = bVar2.f14505a;
                    iVar.f14557h = i13;
                    iVar.h(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f14519v) {
            while (i10 < this.f14534l) {
                b bVar = this.f14529g[i10];
                if (bVar != null) {
                    this.f14536n.f14511a.a(bVar);
                }
                this.f14529g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f14534l) {
            b bVar2 = this.f14529g[i10];
            if (bVar2 != null) {
                this.f14536n.f14512b.a(bVar2);
            }
            this.f14529g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f14536n.f14513c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
        } else {
            iVar.e();
        }
        iVar.g(aVar, str);
        int i10 = this.f14538p;
        int i11 = f14520w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f14520w = i12;
            this.f14537o = (i[]) Arrays.copyOf(this.f14537o, i12);
        }
        i[] iVarArr = this.f14537o;
        int i13 = this.f14538p;
        this.f14538p = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private final void l(b bVar) {
        int i10;
        if (!f14517t || !bVar.f14510f) {
            b[] bVarArr = this.f14529g;
            int i11 = this.f14534l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f14505a;
            iVar.f14557h = i11;
            this.f14534l = i11 + 1;
            iVar.h(this, bVar);
        } else {
            bVar.f14505a.f(this, bVar.f14506b);
        }
        if (f14517t && this.f14523a) {
            int i12 = 0;
            while (i12 < this.f14534l) {
                if (this.f14529g[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f14529g[i12];
                if (bVar2 != null && bVar2.f14510f) {
                    bVar2.f14505a.f(this, bVar2.f14506b);
                    (f14519v ? this.f14536n.f14511a : this.f14536n.f14512b).a(bVar2);
                    this.f14529g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f14534l;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f14529g;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f14505a;
                        if (iVar2.f14557h == i13) {
                            iVar2.f14557h = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f14529g[i14] = null;
                    }
                    this.f14534l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f14523a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f14534l; i10++) {
            b bVar = this.f14529g[i10];
            bVar.f14505a.f14559j = bVar.f14506b;
        }
    }

    public static b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f14534l; i10++) {
            b bVar = this.f14529g[i10];
            if (bVar.f14505a.f14563n != i.a.UNRESTRICTED && bVar.f14506b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = 0;
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = 0;
                    while (true) {
                        if (i12 >= this.f14534l) {
                            break;
                        }
                        b bVar2 = this.f14529g[i12];
                        if (bVar2.f14505a.f14563n != i.a.UNRESTRICTED && !bVar2.f14510f && bVar2.f14506b < 0.0f) {
                            int i16 = 9;
                            if (f14518u) {
                                int g10 = bVar2.f14509e.g();
                                int i17 = 0;
                                while (i17 < g10) {
                                    i h10 = bVar2.f14509e.h(i17);
                                    float i18 = bVar2.f14509e.i(h10);
                                    if (i18 > 0.0f) {
                                        int i19 = 0;
                                        while (i19 < i16) {
                                            float f11 = h10.f14561l[i19] / i18;
                                            if ((f11 < f10 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                i14 = h10.f14556g;
                                                i13 = i12;
                                                f10 = f11;
                                            }
                                            i19++;
                                            i16 = 9;
                                        }
                                    }
                                    i17++;
                                    i16 = 9;
                                }
                            } else {
                                for (int i20 = 1; i20 < this.f14533k; i20++) {
                                    i iVar = this.f14536n.f14514d[i20];
                                    float i21 = bVar2.f14509e.i(iVar);
                                    if (i21 > 0.0f) {
                                        for (int i22 = 0; i22 < 9; i22++) {
                                            float f12 = iVar.f14561l[i22] / i21;
                                            if ((f12 < f10 && i22 == i15) || i22 > i15) {
                                                i13 = i12;
                                                i14 = i20;
                                                i15 = i22;
                                                f10 = f12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i12++;
                    }
                    if (i13 != -1) {
                        b bVar3 = this.f14529g[i13];
                        bVar3.f14505a.f14557h = -1;
                        bVar3.x(this.f14536n.f14514d[i14]);
                        i iVar2 = bVar3.f14505a;
                        iVar2.f14557h = i13;
                        iVar2.h(this, bVar3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f14533k / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f14527e * 2;
        this.f14527e = i10;
        this.f14529g = (b[]) Arrays.copyOf(this.f14529g, i10);
        c cVar = this.f14536n;
        cVar.f14514d = (i[]) Arrays.copyOf(cVar.f14514d, this.f14527e);
        int i11 = this.f14527e;
        this.f14532j = new boolean[i11];
        this.f14528f = i11;
        this.f14535m = i11;
    }

    /* access modifiers changed from: package-private */
    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f14536n;
            i[] iVarArr = cVar.f14514d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        cVar.f14513c.c(this.f14537o, this.f14538p);
        this.f14538p = 0;
        Arrays.fill(this.f14536n.f14514d, (Object) null);
        HashMap hashMap = this.f14525c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f14524b = 0;
        this.f14526d.clear();
        this.f14533k = 1;
        for (int i11 = 0; i11 < this.f14534l; i11++) {
            b bVar = this.f14529g[i11];
            if (bVar != null) {
                bVar.f14507c = false;
            }
        }
        C();
        this.f14534l = 0;
        this.f14539q = f14519v ? new b(this.f14536n) : new b(this.f14536n);
    }

    public void b(e eVar, e eVar2, float f10, int i10) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar3.o(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar3.o(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar3.o(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar3.o(bVar4));
        i q14 = q(eVar4.o(bVar));
        i q15 = q(eVar4.o(bVar2));
        i q16 = q(eVar4.o(bVar3));
        i q17 = q(eVar4.o(bVar4));
        b r10 = r();
        double d10 = (double) f10;
        i iVar = q16;
        double d11 = (double) i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        b r11 = r();
        r11.q(q10, q12, q14, iVar, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        int i13 = i12;
        b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i13 != 8) {
            r10.d(this, i13);
        }
        d(r10);
    }

    public void d(b bVar) {
        i v10;
        if (bVar != null) {
            boolean z10 = true;
            if (this.f14534l + 1 >= this.f14535m || this.f14533k + 1 >= this.f14528f) {
                y();
            }
            if (!bVar.f14510f) {
                bVar.D(this);
                if (!bVar.isEmpty()) {
                    bVar.r();
                    if (bVar.f(this)) {
                        i p10 = p();
                        bVar.f14505a = p10;
                        int i10 = this.f14534l;
                        l(bVar);
                        if (this.f14534l == i10 + 1) {
                            this.f14539q.b(bVar);
                            B(this.f14539q, true);
                            if (p10.f14557h == -1) {
                                if (bVar.f14505a == p10 && (v10 = bVar.v(p10)) != null) {
                                    bVar.x(v10);
                                }
                                if (!bVar.f14510f) {
                                    bVar.f14505a.h(this, bVar);
                                }
                                (f14519v ? this.f14536n.f14511a : this.f14536n.f14512b).a(bVar);
                                this.f14534l--;
                            }
                            if (!bVar.s() || z10) {
                                return;
                            }
                        }
                    }
                    z10 = false;
                    return;
                }
                return;
            }
            l(bVar);
        }
    }

    public b e(i iVar, i iVar2, int i10, int i11) {
        if (!f14516s || i11 != 8 || !iVar2.f14560k || iVar.f14557h != -1) {
            b r10 = r();
            r10.n(iVar, iVar2, i10);
            if (i11 != 8) {
                r10.d(this, i11);
            }
            d(r10);
            return r10;
        }
        iVar.f(this, iVar2.f14559j + ((float) i10));
        return null;
    }

    public void f(i iVar, int i10) {
        b bVar;
        if (!f14516s || iVar.f14557h != -1) {
            int i11 = iVar.f14557h;
            if (i11 != -1) {
                b bVar2 = this.f14529g[i11];
                if (!bVar2.f14510f) {
                    if (bVar2.f14509e.g() == 0) {
                        bVar2.f14510f = true;
                    } else {
                        bVar = r();
                        bVar.m(iVar, i10);
                    }
                }
                bVar2.f14506b = (float) i10;
                return;
            }
            bVar = r();
            bVar.i(iVar, i10);
            d(bVar);
            return;
        }
        float f10 = (float) i10;
        iVar.f(this, f10);
        for (int i12 = 0; i12 < this.f14524b + 1; i12++) {
            i iVar2 = this.f14536n.f14514d[i12];
            if (iVar2 != null && iVar2.f14567r && iVar2.f14568s == iVar.f14556g) {
                iVar2.f(this, iVar2.f14569t + f10);
            }
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        b r10 = r();
        i t10 = t();
        t10.f14558i = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        b r10 = r();
        i t10 = t();
        t10.f14558i = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f14509e.i(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        b r10 = r();
        i t10 = t();
        t10.f14558i = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        b r10 = r();
        i t10 = t();
        t10.f14558i = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f14509e.i(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, int i10, int i11) {
        bVar.e(o(i11, (String) null), i10);
    }

    public i o(int i10, String str) {
        if (this.f14533k + 1 >= this.f14528f) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f14524b + 1;
        this.f14524b = i11;
        this.f14533k++;
        a10.f14556g = i11;
        a10.f14558i = i10;
        this.f14536n.f14514d[i11] = a10;
        this.f14526d.a(a10);
        return a10;
    }

    public i p() {
        if (this.f14533k + 1 >= this.f14528f) {
            y();
        }
        i a10 = a(i.a.SLACK, (String) null);
        int i10 = this.f14524b + 1;
        this.f14524b = i10;
        this.f14533k++;
        a10.f14556g = i10;
        this.f14536n.f14514d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f14533k + 1 >= this.f14528f) {
            y();
        }
        if (obj instanceof s.d) {
            s.d dVar = (s.d) obj;
            iVar = dVar.i();
            if (iVar == null) {
                dVar.s(this.f14536n);
                iVar = dVar.i();
            }
            int i10 = iVar.f14556g;
            if (i10 == -1 || i10 > this.f14524b || this.f14536n.f14514d[i10] == null) {
                if (i10 != -1) {
                    iVar.e();
                }
                int i11 = this.f14524b + 1;
                this.f14524b = i11;
                this.f14533k++;
                iVar.f14556g = i11;
                iVar.f14563n = i.a.UNRESTRICTED;
                this.f14536n.f14514d[i11] = iVar;
            }
        }
        return iVar;
    }

    public b r() {
        b bVar;
        if (f14519v) {
            bVar = (b) this.f14536n.f14511a.b();
            if (bVar == null) {
                bVar = new b(this.f14536n);
                f14522y++;
                i.c();
                return bVar;
            }
        } else {
            bVar = (b) this.f14536n.f14512b.b();
            if (bVar == null) {
                bVar = new b(this.f14536n);
                f14521x++;
                i.c();
                return bVar;
            }
        }
        bVar.y();
        i.c();
        return bVar;
    }

    public i t() {
        if (this.f14533k + 1 >= this.f14528f) {
            y();
        }
        i a10 = a(i.a.SLACK, (String) null);
        int i10 = this.f14524b + 1;
        this.f14524b = i10;
        this.f14533k++;
        a10.f14556g = i10;
        this.f14536n.f14514d[i10] = a10;
        return a10;
    }

    public c v() {
        return this.f14536n;
    }

    public int x(Object obj) {
        i i10 = ((s.d) obj).i();
        if (i10 != null) {
            return (int) (i10.f14559j + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f14526d.isEmpty()) {
            n();
            return;
        }
        if (this.f14530h || this.f14531i) {
            int i10 = 0;
            while (i10 < this.f14534l) {
                if (this.f14529g[i10].f14510f) {
                    i10++;
                }
            }
            n();
            return;
        }
        A(this.f14526d);
    }
}
