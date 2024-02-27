package p;

import java.util.Arrays;
import p.b;

public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    private static float f14577n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f14578a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f14579b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f14580c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f14581d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f14582e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f14583f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f14584g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f14585h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f14586i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    int f14587j = 0;

    /* renamed from: k  reason: collision with root package name */
    int f14588k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final b f14589l;

    /* renamed from: m  reason: collision with root package name */
    protected final c f14590m;

    j(b bVar, c cVar) {
        this.f14589l = bVar;
        this.f14590m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f14556g % this.f14580c;
        int[] iArr2 = this.f14581d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f14582e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                }
                i12 = i13;
            }
            iArr[i12] = i10;
        }
        this.f14582e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f14583f[i10] = iVar.f14556g;
        this.f14584g[i10] = f10;
        this.f14585h[i10] = -1;
        this.f14586i[i10] = -1;
        iVar.a(this.f14589l);
        iVar.f14566q++;
        this.f14587j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f14579b; i10++) {
            if (this.f14583f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f14579b * 2;
        this.f14583f = Arrays.copyOf(this.f14583f, i10);
        this.f14584g = Arrays.copyOf(this.f14584g, i10);
        this.f14585h = Arrays.copyOf(this.f14585h, i10);
        this.f14586i = Arrays.copyOf(this.f14586i, i10);
        this.f14582e = Arrays.copyOf(this.f14582e, i10);
        for (int i11 = this.f14579b; i11 < i10; i11++) {
            this.f14583f[i11] = -1;
            this.f14582e[i11] = -1;
        }
        this.f14579b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f14585h[n10] = i10;
            int[] iArr = this.f14586i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f14585h[n10] = -1;
            if (this.f14587j > 0) {
                this.f14586i[n10] = this.f14588k;
                this.f14588k = n10;
            } else {
                this.f14586i[n10] = -1;
            }
        }
        int i11 = this.f14586i[n10];
        if (i11 != -1) {
            this.f14585h[i11] = n10;
        }
        l(iVar, n10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(p.i r6) {
        /*
            r5 = this;
            int r6 = r6.f14556g
            int r0 = r5.f14580c
            int r0 = r6 % r0
            int[] r1 = r5.f14581d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f14583f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f14582e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f14582e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f14583f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f14583f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j.r(p.i):void");
    }

    public float a(int i10) {
        int i11 = this.f14587j;
        int i12 = this.f14588k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f14584g[i12];
            }
            i12 = this.f14586i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public float b(b bVar, boolean z10) {
        float i10 = i(bVar.f14505a);
        c(bVar.f14505a, z10);
        j jVar = (j) bVar.f14509e;
        int g10 = jVar.g();
        int i11 = 0;
        int i12 = 0;
        while (i11 < g10) {
            int i13 = jVar.f14583f[i12];
            if (i13 != -1) {
                f(this.f14590m.f14514d[i13], jVar.f14584g[i12] * i10, z10);
                i11++;
            }
            i12++;
        }
        return i10;
    }

    public float c(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f14584g[p10];
        if (this.f14588k == p10) {
            this.f14588k = this.f14586i[p10];
        }
        this.f14583f[p10] = -1;
        int[] iArr = this.f14585h;
        int i10 = iArr[p10];
        if (i10 != -1) {
            int[] iArr2 = this.f14586i;
            iArr2[i10] = iArr2[p10];
        }
        int i11 = this.f14586i[p10];
        if (i11 != -1) {
            iArr[i11] = iArr[p10];
        }
        this.f14587j--;
        iVar.f14566q--;
        if (z10) {
            iVar.d(this.f14589l);
        }
        return f10;
    }

    public void clear() {
        int i10 = this.f14587j;
        for (int i11 = 0; i11 < i10; i11++) {
            i h10 = h(i11);
            if (h10 != null) {
                h10.d(this.f14589l);
            }
        }
        for (int i12 = 0; i12 < this.f14579b; i12++) {
            this.f14583f[i12] = -1;
            this.f14582e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f14580c; i13++) {
            this.f14581d[i13] = -1;
        }
        this.f14587j = 0;
        this.f14588k = -1;
    }

    public void d(i iVar, float f10) {
        float f11 = f14577n;
        if (f10 <= (-f11) || f10 >= f11) {
            if (this.f14587j == 0) {
                m(0, iVar, f10);
                l(iVar, 0);
                this.f14588k = 0;
                return;
            }
            int p10 = p(iVar);
            if (p10 != -1) {
                this.f14584g[p10] = f10;
                return;
            }
            if (this.f14587j + 1 >= this.f14579b) {
                o();
            }
            int i10 = this.f14587j;
            int i11 = this.f14588k;
            int i12 = -1;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = this.f14583f[i11];
                int i15 = iVar.f14556g;
                if (i14 == i15) {
                    this.f14584g[i11] = f10;
                    return;
                }
                if (i14 < i15) {
                    i12 = i11;
                }
                i11 = this.f14586i[i11];
                if (i11 == -1) {
                    break;
                }
            }
            q(i12, iVar, f10);
            return;
        }
        c(iVar, true);
    }

    public boolean e(i iVar) {
        return p(iVar) != -1;
    }

    public void f(i iVar, float f10, boolean z10) {
        float f11 = f14577n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                d(iVar, f10);
                return;
            }
            float[] fArr = this.f14584g;
            float f12 = fArr[p10] + f10;
            fArr[p10] = f12;
            float f13 = f14577n;
            if (f12 > (-f13) && f12 < f13) {
                fArr[p10] = 0.0f;
                c(iVar, z10);
            }
        }
    }

    public int g() {
        return this.f14587j;
    }

    public i h(int i10) {
        int i11 = this.f14587j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f14588k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f14590m.f14514d[this.f14583f[i12]];
            }
            i12 = this.f14586i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    public float i(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f14584g[p10];
        }
        return 0.0f;
    }

    public void j(float f10) {
        int i10 = this.f14587j;
        int i11 = this.f14588k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f14584g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f14586i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    public void k() {
        int i10 = this.f14587j;
        int i11 = this.f14588k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f14584g;
            fArr[i11] = fArr[i11] * -1.0f;
            i11 = this.f14586i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int p(p.i r4) {
        /*
            r3 = this;
            int r0 = r3.f14587j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f14556g
            int r0 = r3.f14580c
            int r0 = r4 % r0
            int[] r2 = r3.f14581d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f14583f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f14582e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f14583f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f14583f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j.p(p.i):int");
    }

    public String toString() {
        StringBuilder sb2;
        String str;
        String str2 = hashCode() + " { ";
        int i10 = this.f14587j;
        for (int i11 = 0; i11 < i10; i11++) {
            i h10 = h(i11);
            if (h10 != null) {
                String str3 = str2 + h10 + " = " + a(i11) + " ";
                int p10 = p(h10);
                String str4 = str3 + "[p: ";
                if (this.f14585h[p10] != -1) {
                    sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append(this.f14590m.f14514d[this.f14583f[this.f14585h[p10]]]);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append("none");
                }
                String str5 = sb2.toString() + ", n: ";
                if (this.f14586i[p10] != -1) {
                    str = str5 + this.f14590m.f14514d[this.f14583f[this.f14586i[p10]]];
                } else {
                    str = str5 + "none";
                }
                str2 = str + "]";
            }
        }
        return str2 + " }";
    }
}
