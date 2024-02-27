package t;

import s.d;
import s.e;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f16219a;

    /* renamed from: b  reason: collision with root package name */
    e f16220b;

    /* renamed from: c  reason: collision with root package name */
    m f16221c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f16222d;

    /* renamed from: e  reason: collision with root package name */
    g f16223e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f16224f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f16225g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f16226h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f16227i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f16228j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16229a;

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
                s.d$b[] r0 = s.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16229a = r0
                s.d$b r1 = s.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16229a     // Catch:{ NoSuchFieldError -> 0x001d }
                s.d$b r1 = s.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16229a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s.d$b r1 = s.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16229a     // Catch:{ NoSuchFieldError -> 0x0033 }
                s.d$b r1 = s.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16229a     // Catch:{ NoSuchFieldError -> 0x003e }
                s.d$b r1 = s.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t.p.a.<clinit>():void");
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f16220b = eVar;
    }

    private void l(int i10, int i11) {
        g gVar;
        int g10;
        int i12 = this.f16219a;
        if (i12 != 0) {
            if (i12 == 1) {
                int g11 = g(this.f16223e.f16187m, i10);
                gVar = this.f16223e;
                g10 = Math.min(g11, i11);
                gVar.d(g10);
            } else if (i12 == 2) {
                e K = this.f16220b.K();
                if (K != null) {
                    g gVar2 = (i10 == 0 ? K.f15687e : K.f15689f).f16223e;
                    if (gVar2.f16175j) {
                        e eVar = this.f16220b;
                        i11 = (int) ((((float) gVar2.f16172g) * (i10 == 0 ? eVar.B : eVar.E)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i12 == 3) {
                e eVar2 = this.f16220b;
                p pVar = eVar2.f15687e;
                e.b bVar = pVar.f16222d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f16219a == 3) {
                    n nVar = eVar2.f15689f;
                    if (nVar.f16222d == bVar2 && nVar.f16219a == 3) {
                        return;
                    }
                }
                if (i10 == 0) {
                    pVar = eVar2.f15689f;
                }
                if (pVar.f16223e.f16175j) {
                    float v10 = eVar2.v();
                    this.f16223e.d(i10 == 1 ? (int) ((((float) pVar.f16223e.f16172g) / v10) + 0.5f) : (int) ((v10 * ((float) pVar.f16223e.f16172g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f16223e;
        g10 = g(i11, i10);
        gVar.d(g10);
    }

    public abstract void a(d dVar);

    /* access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f16177l.add(fVar2);
        fVar.f16171f = i10;
        fVar2.f16176k.add(fVar);
    }

    /* access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f16177l.add(fVar2);
        fVar.f16177l.add(this.f16223e);
        fVar.f16173h = i10;
        fVar.f16174i = gVar;
        fVar2.f16176k.add(fVar);
        gVar.f16176k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            e eVar = this.f16220b;
            int i13 = eVar.A;
            i12 = Math.max(eVar.f15729z, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            e eVar2 = this.f16220b;
            int i14 = eVar2.D;
            int max = Math.max(eVar2.C, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    /* access modifiers changed from: protected */
    public final f h(d dVar) {
        p pVar;
        p pVar2;
        d dVar2 = dVar.f15664f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f15662d;
        int i10 = a.f16229a[dVar2.f15663e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                pVar2 = eVar.f15687e;
            } else if (i10 == 3) {
                pVar = eVar.f15689f;
            } else if (i10 == 4) {
                return eVar.f15689f.f16201k;
            } else {
                if (i10 != 5) {
                    return null;
                }
                pVar2 = eVar.f15689f;
            }
            return pVar2.f16227i;
        }
        pVar = eVar.f15687e;
        return pVar.f16226h;
    }

    /* access modifiers changed from: protected */
    public final f i(d dVar, int i10) {
        d dVar2 = dVar.f15664f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f15662d;
        p pVar = i10 == 0 ? eVar.f15687e : eVar.f15689f;
        int i11 = a.f16229a[dVar2.f15663e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f16227i;
        }
        return pVar.f16226h;
    }

    public long j() {
        g gVar = this.f16223e;
        if (gVar.f16175j) {
            return (long) gVar.f16172g;
        }
        return 0;
    }

    public boolean k() {
        return this.f16225g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(d dVar, d dVar2, d dVar3, int i10) {
        f fVar;
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f16175j && h11.f16175j) {
            int f10 = h10.f16172g + dVar2.f();
            int f11 = h11.f16172g - dVar3.f();
            int i11 = f11 - f10;
            if (!this.f16223e.f16175j && this.f16222d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f16223e;
            if (gVar.f16175j) {
                if (gVar.f16172g == i11) {
                    this.f16226h.d(f10);
                    fVar = this.f16227i;
                } else {
                    e eVar = this.f16220b;
                    float y10 = i10 == 0 ? eVar.y() : eVar.R();
                    if (h10 == h11) {
                        f10 = h10.f16172g;
                        f11 = h11.f16172g;
                        y10 = 0.5f;
                    }
                    this.f16226h.d((int) (((float) f10) + 0.5f + (((float) ((f11 - f10) - this.f16223e.f16172g)) * y10)));
                    fVar = this.f16227i;
                    f11 = this.f16226h.f16172g + this.f16223e.f16172g;
                }
                fVar.d(f11);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
