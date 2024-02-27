package p;

import java.util.ArrayList;
import p.d;
import p.i;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    i f14505a = null;

    /* renamed from: b  reason: collision with root package name */
    float f14506b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f14507c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList f14508d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public a f14509e;

    /* renamed from: f  reason: collision with root package name */
    boolean f14510f = false;

    public interface a {
        float a(int i10);

        float b(b bVar, boolean z10);

        float c(i iVar, boolean z10);

        void clear();

        void d(i iVar, float f10);

        boolean e(i iVar);

        void f(i iVar, float f10, boolean z10);

        int g();

        i h(int i10);

        float i(i iVar);

        void j(float f10);

        void k();
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f14566q <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int g10 = this.f14509e.g();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < g10; i10++) {
            float a10 = this.f14509e.a(i10);
            if (a10 < 0.0f) {
                i h10 = this.f14509e.h(i10);
                if ((zArr == null || !zArr[h10.f14556g]) && h10 != iVar && (((aVar = h10.f14563n) == i.a.SLACK || aVar == i.a.ERROR) && a10 < f10)) {
                    f10 = a10;
                    iVar2 = h10;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar != null && iVar.f14560k) {
            this.f14506b += iVar.f14559j * this.f14509e.i(iVar);
            this.f14509e.c(iVar, z10);
            if (z10) {
                iVar.d(this);
            }
            if (d.f14517t && this.f14509e.g() == 0) {
                this.f14510f = true;
                dVar.f14523a = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f14506b += bVar.f14506b * this.f14509e.b(bVar, z10);
        if (z10) {
            bVar.f14505a.d(this);
        }
        if (d.f14517t && this.f14505a != null && this.f14509e.g() == 0) {
            this.f14510f = true;
            dVar.f14523a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar != null && iVar.f14567r) {
            float i10 = this.f14509e.i(iVar);
            this.f14506b += iVar.f14569t * i10;
            this.f14509e.c(iVar, z10);
            if (z10) {
                iVar.d(this);
            }
            this.f14509e.f(dVar.f14536n.f14514d[iVar.f14568s], i10, z10);
            if (d.f14517t && this.f14509e.g() == 0) {
                this.f14510f = true;
                dVar.f14523a = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.f14529g.length != 0) {
            boolean z10 = false;
            while (!z10) {
                int g10 = this.f14509e.g();
                for (int i10 = 0; i10 < g10; i10++) {
                    i h10 = this.f14509e.h(i10);
                    if (h10.f14557h != -1 || h10.f14560k || h10.f14567r) {
                        this.f14508d.add(h10);
                    }
                }
                int size = this.f14508d.size();
                if (size > 0) {
                    for (int i11 = 0; i11 < size; i11++) {
                        i iVar = (i) this.f14508d.get(i11);
                        if (iVar.f14560k) {
                            A(dVar, iVar, true);
                        } else if (iVar.f14567r) {
                            C(dVar, iVar, true);
                        } else {
                            B(dVar, dVar.f14529g[iVar.f14557h], true);
                        }
                    }
                    this.f14508d.clear();
                } else {
                    z10 = true;
                }
            }
            if (d.f14517t && this.f14505a != null && this.f14509e.g() == 0) {
                this.f14510f = true;
                dVar.f14523a = true;
            }
        }
    }

    public void a(i iVar) {
        int i10 = iVar.f14558i;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f14509e.d(iVar, f10);
    }

    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f14505a = null;
            this.f14509e.clear();
            for (int i10 = 0; i10 < bVar.f14509e.g(); i10++) {
                this.f14509e.f(bVar.f14509e.h(i10), bVar.f14509e.a(i10), true);
            }
        }
    }

    public i c(d dVar, boolean[] zArr) {
        return w(zArr, (i) null);
    }

    public void clear() {
        this.f14509e.clear();
        this.f14505a = null;
        this.f14506b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f14509e.d(dVar.o(i10, "ep"), 1.0f);
        this.f14509e.d(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b e(i iVar, int i10) {
        this.f14509e.d(iVar, (float) i10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f14509e.g() == 0) {
            this.f14510f = true;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public i g(d dVar) {
        int g10 = this.f14509e.g();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < g10; i10++) {
            float a10 = this.f14509e.a(i10);
            i h10 = this.f14509e.h(i10);
            if (h10.f14563n == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > a10) {
                    z10 = u(h10, dVar);
                    f10 = a10;
                    iVar = h10;
                } else if (!z10 && u(h10, dVar)) {
                    f10 = a10;
                    iVar = h10;
                    z10 = true;
                }
            } else if (iVar == null && a10 < 0.0f) {
                if (iVar2 == null || f11 > a10) {
                    z11 = u(h10, dVar);
                    f11 = a10;
                    iVar2 = h10;
                } else if (!z11 && u(h10, dVar)) {
                    f11 = a10;
                    iVar2 = h10;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public i getKey() {
        return this.f14505a;
    }

    /* access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        float f11;
        int i12;
        if (iVar2 == iVar3) {
            this.f14509e.d(iVar, 1.0f);
            this.f14509e.d(iVar4, 1.0f);
            this.f14509e.d(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f14509e.d(iVar, 1.0f);
            this.f14509e.d(iVar2, -1.0f);
            this.f14509e.d(iVar3, -1.0f);
            this.f14509e.d(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                i12 = (-i10) + i11;
            }
            return this;
        }
        if (f10 <= 0.0f) {
            this.f14509e.d(iVar, -1.0f);
            this.f14509e.d(iVar2, 1.0f);
            f11 = (float) i10;
        } else if (f10 >= 1.0f) {
            this.f14509e.d(iVar4, -1.0f);
            this.f14509e.d(iVar3, 1.0f);
            i12 = -i11;
        } else {
            float f12 = 1.0f - f10;
            this.f14509e.d(iVar, f12 * 1.0f);
            this.f14509e.d(iVar2, f12 * -1.0f);
            this.f14509e.d(iVar3, -1.0f * f10);
            this.f14509e.d(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                f11 = (((float) (-i10)) * f12) + (((float) i11) * f10);
            }
            return this;
        }
        this.f14506b = f11;
        return this;
        f11 = (float) i12;
        this.f14506b = f11;
        return this;
    }

    /* access modifiers changed from: package-private */
    public b i(i iVar, int i10) {
        this.f14505a = iVar;
        float f10 = (float) i10;
        iVar.f14559j = f10;
        this.f14506b = f10;
        this.f14510f = true;
        return this;
    }

    public boolean isEmpty() {
        return this.f14505a == null && this.f14506b == 0.0f && this.f14509e.g() == 0;
    }

    /* access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f10) {
        this.f14509e.d(iVar, -1.0f);
        this.f14509e.d(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f14509e.d(iVar, -1.0f);
        this.f14509e.d(iVar2, 1.0f);
        this.f14509e.d(iVar3, f10);
        this.f14509e.d(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f14506b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f14509e.d(iVar, 1.0f);
            this.f14509e.d(iVar2, -1.0f);
            this.f14509e.d(iVar4, 1.0f);
            this.f14509e.d(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f14509e.d(iVar, 1.0f);
            this.f14509e.d(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f14509e.d(iVar3, 1.0f);
            this.f14509e.d(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f14509e.d(iVar, 1.0f);
            this.f14509e.d(iVar2, -1.0f);
            this.f14509e.d(iVar4, f13);
            this.f14509e.d(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        a aVar;
        float f10;
        if (i10 < 0) {
            this.f14506b = (float) (i10 * -1);
            aVar = this.f14509e;
            f10 = 1.0f;
        } else {
            this.f14506b = (float) i10;
            aVar = this.f14509e;
            f10 = -1.0f;
        }
        aVar.d(iVar, f10);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f14506b = (float) i10;
            if (z10) {
                this.f14509e.d(iVar, 1.0f);
                this.f14509e.d(iVar2, -1.0f);
                return this;
            }
        }
        this.f14509e.d(iVar, -1.0f);
        this.f14509e.d(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f14506b = (float) i10;
            if (z10) {
                this.f14509e.d(iVar, 1.0f);
                this.f14509e.d(iVar2, -1.0f);
                this.f14509e.d(iVar3, -1.0f);
                return this;
            }
        }
        this.f14509e.d(iVar, -1.0f);
        this.f14509e.d(iVar2, 1.0f);
        this.f14509e.d(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f14506b = (float) i10;
            if (z10) {
                this.f14509e.d(iVar, 1.0f);
                this.f14509e.d(iVar2, -1.0f);
                this.f14509e.d(iVar3, 1.0f);
                return this;
            }
        }
        this.f14509e.d(iVar, -1.0f);
        this.f14509e.d(iVar2, 1.0f);
        this.f14509e.d(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f14509e.d(iVar3, 0.5f);
        this.f14509e.d(iVar4, 0.5f);
        this.f14509e.d(iVar, -0.5f);
        this.f14509e.d(iVar2, -0.5f);
        this.f14506b = -f10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        float f10 = this.f14506b;
        if (f10 < 0.0f) {
            this.f14506b = f10 * -1.0f;
            this.f14509e.k();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f14505a;
        return iVar != null && (iVar.f14563n == i.a.UNRESTRICTED || this.f14506b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f14509e.e(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    public void x(i iVar) {
        i iVar2 = this.f14505a;
        if (iVar2 != null) {
            this.f14509e.d(iVar2, -1.0f);
            this.f14505a.f14557h = -1;
            this.f14505a = null;
        }
        float c10 = this.f14509e.c(iVar, true) * -1.0f;
        this.f14505a = iVar;
        if (c10 != 1.0f) {
            this.f14506b /= c10;
            this.f14509e.j(c10);
        }
    }

    public void y() {
        this.f14505a = null;
        this.f14509e.clear();
        this.f14506b = 0.0f;
        this.f14510f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r7 = r10.f14509e.a(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String z() {
        /*
            r10 = this;
            p.i r0 = r10.f14505a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
        L_0x0013:
            java.lang.String r0 = r0.toString()
            goto L_0x0026
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            p.i r1 = r10.f14505a
            r0.append(r1)
            goto L_0x0013
        L_0x0026:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f14506b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0053
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f14506b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0054
        L_0x0053:
            r1 = r3
        L_0x0054:
            p.b$a r5 = r10.f14509e
            int r5 = r5.g()
        L_0x005a:
            if (r3 >= r5) goto L_0x00d5
            p.b$a r6 = r10.f14509e
            p.i r6 = r6.h(r3)
            if (r6 != 0) goto L_0x0066
            goto L_0x00d2
        L_0x0066:
            p.b$a r7 = r10.f14509e
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0071
            goto L_0x00d2
        L_0x0071:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0090
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
        L_0x0087:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
            goto L_0x00ad
        L_0x0090:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L_0x00a4
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ad
        L_0x00a4:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            goto L_0x0087
        L_0x00ad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00b8:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00d1
        L_0x00c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            goto L_0x00b8
        L_0x00d1:
            r1 = r4
        L_0x00d2:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x00d5:
            if (r1 != 0) goto L_0x00e8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f14509e = new a(this, cVar);
    }
}
