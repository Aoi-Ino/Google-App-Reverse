package t;

import s.e;
import t.f;

public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f16201k;

    /* renamed from: l  reason: collision with root package name */
    g f16202l = null;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16203a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                t.p$b[] r0 = t.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16203a = r0
                t.p$b r1 = t.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16203a     // Catch:{ NoSuchFieldError -> 0x001d }
                t.p$b r1 = t.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16203a     // Catch:{ NoSuchFieldError -> 0x0028 }
                t.p$b r1 = t.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f16201k = fVar;
        this.f16226h.f16170e = f.a.TOP;
        this.f16227i.f16170e = f.a.BOTTOM;
        fVar.f16170e = f.a.BASELINE;
        this.f16224f = 1;
    }

    public void a(d dVar) {
        int i10;
        float f10;
        int i11 = a.f16203a[this.f16228j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            e eVar = this.f16220b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f16223e;
        if (gVar.f16168c && !gVar.f16175j && this.f16222d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f16220b;
            int i12 = eVar2.f15725x;
            if (i12 == 2) {
                e K = eVar2.K();
                if (K != null) {
                    g gVar2 = K.f15689f.f16223e;
                    if (gVar2.f16175j) {
                        i10 = (int) ((((float) gVar2.f16172g) * this.f16220b.E) + 0.5f);
                    }
                }
            } else if (i12 == 3 && eVar2.f15687e.f16223e.f16175j) {
                int w10 = eVar2.w();
                if (w10 != -1) {
                    if (w10 == 0) {
                        e eVar3 = this.f16220b;
                        f10 = ((float) eVar3.f15687e.f16223e.f16172g) * eVar3.v();
                        i10 = (int) (f10 + 0.5f);
                    } else if (w10 != 1) {
                        i10 = 0;
                    }
                }
                e eVar4 = this.f16220b;
                f10 = ((float) eVar4.f15687e.f16223e.f16172g) / eVar4.v();
                i10 = (int) (f10 + 0.5f);
            }
            this.f16223e.d(i10);
        }
        f fVar = this.f16226h;
        if (fVar.f16168c) {
            f fVar2 = this.f16227i;
            if (fVar2.f16168c) {
                if (!fVar.f16175j || !fVar2.f16175j || !this.f16223e.f16175j) {
                    if (!this.f16223e.f16175j && this.f16222d == e.b.MATCH_CONSTRAINT) {
                        e eVar5 = this.f16220b;
                        if (eVar5.f15723w == 0 && !eVar5.k0()) {
                            int i13 = ((f) this.f16226h.f16177l.get(0)).f16172g;
                            f fVar3 = this.f16226h;
                            int i14 = i13 + fVar3.f16171f;
                            int i15 = ((f) this.f16227i.f16177l.get(0)).f16172g + this.f16227i.f16171f;
                            fVar3.d(i14);
                            this.f16227i.d(i15);
                            this.f16223e.d(i15 - i14);
                            return;
                        }
                    }
                    if (!this.f16223e.f16175j && this.f16222d == e.b.MATCH_CONSTRAINT && this.f16219a == 1 && this.f16226h.f16177l.size() > 0 && this.f16227i.f16177l.size() > 0) {
                        int i16 = (((f) this.f16227i.f16177l.get(0)).f16172g + this.f16227i.f16171f) - (((f) this.f16226h.f16177l.get(0)).f16172g + this.f16226h.f16171f);
                        g gVar3 = this.f16223e;
                        int i17 = gVar3.f16187m;
                        if (i16 < i17) {
                            gVar3.d(i16);
                        } else {
                            gVar3.d(i17);
                        }
                    }
                    if (this.f16223e.f16175j && this.f16226h.f16177l.size() > 0 && this.f16227i.f16177l.size() > 0) {
                        f fVar4 = (f) this.f16226h.f16177l.get(0);
                        f fVar5 = (f) this.f16227i.f16177l.get(0);
                        int i18 = fVar4.f16172g + this.f16226h.f16171f;
                        int i19 = fVar5.f16172g + this.f16227i.f16171f;
                        float R = this.f16220b.R();
                        if (fVar4 == fVar5) {
                            i18 = fVar4.f16172g;
                            i19 = fVar5.f16172g;
                            R = 0.5f;
                        }
                        this.f16226h.d((int) (((float) i18) + 0.5f + (((float) ((i19 - i18) - this.f16223e.f16172g)) * R)));
                        this.f16227i.d(this.f16226h.f16172g + this.f16223e.f16172g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02dd, code lost:
        if (r10.f16220b.Z() != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0332, code lost:
        if (r0.f16222d == r1) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0362, code lost:
        if (r10.f16220b.Z() != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03d7, code lost:
        if (r0.f16222d == r1) goto L_0x03d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r10 = this;
            s.e r0 = r10.f16220b
            boolean r1 = r0.f15679a
            if (r1 == 0) goto L_0x000f
            t.g r1 = r10.f16223e
            int r0 = r0.x()
            r1.d(r0)
        L_0x000f:
            t.g r0 = r10.f16223e
            boolean r0 = r0.f16175j
            if (r0 != 0) goto L_0x0097
            s.e r0 = r10.f16220b
            s.e$b r0 = r0.T()
            r10.f16222d = r0
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x002c
            t.a r0 = new t.a
            r0.<init>(r10)
            r10.f16202l = r0
        L_0x002c:
            s.e$b r0 = r10.f16222d
            s.e$b r1 = s.e.b.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            s.e$b r1 = s.e.b.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            s.e r0 = r10.f16220b
            s.e r0 = r0.K()
            if (r0 == 0) goto L_0x0085
            s.e$b r1 = r0.T()
            s.e$b r2 = s.e.b.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.x()
            s.e r2 = r10.f16220b
            s.d r2 = r2.P
            int r2 = r2.f()
            int r1 = r1 - r2
            s.e r2 = r10.f16220b
            s.d r2 = r2.R
            int r2 = r2.f()
            int r1 = r1 - r2
            t.f r2 = r10.f16226h
            t.n r3 = r0.f15689f
            t.f r3 = r3.f16226h
            s.e r4 = r10.f16220b
            s.d r4 = r4.P
            int r4 = r4.f()
            r10.b(r2, r3, r4)
            t.f r2 = r10.f16227i
            t.n r0 = r0.f15689f
            t.f r0 = r0.f16227i
            s.e r3 = r10.f16220b
            s.d r3 = r3.R
            int r3 = r3.f()
            int r3 = -r3
            r10.b(r2, r0, r3)
            t.g r0 = r10.f16223e
            r0.d(r1)
            return
        L_0x0085:
            s.e$b r0 = r10.f16222d
            s.e$b r1 = s.e.b.FIXED
            if (r0 != r1) goto L_0x00d1
            t.g r0 = r10.f16223e
            s.e r1 = r10.f16220b
            int r1 = r1.x()
            r0.d(r1)
            goto L_0x00d1
        L_0x0097:
            s.e$b r0 = r10.f16222d
            s.e$b r1 = s.e.b.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            s.e r0 = r10.f16220b
            s.e r0 = r0.K()
            if (r0 == 0) goto L_0x00d1
            s.e$b r1 = r0.T()
            s.e$b r2 = s.e.b.FIXED
            if (r1 != r2) goto L_0x00d1
            t.f r1 = r10.f16226h
            t.n r2 = r0.f15689f
            t.f r2 = r2.f16226h
            s.e r3 = r10.f16220b
            s.d r3 = r3.P
            int r3 = r3.f()
            r10.b(r1, r2, r3)
            t.f r1 = r10.f16227i
            t.n r0 = r0.f15689f
            t.f r0 = r0.f16227i
            s.e r2 = r10.f16220b
            s.d r2 = r2.R
            int r2 = r2.f()
            int r2 = -r2
            r10.b(r1, r0, r2)
            return
        L_0x00d1:
            t.g r0 = r10.f16223e
            boolean r1 = r0.f16175j
            r2 = 0
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 3
            if (r1 == 0) goto L_0x022f
            s.e r7 = r10.f16220b
            boolean r8 = r7.f15679a
            if (r8 == 0) goto L_0x022f
            s.d[] r0 = r7.W
            r1 = r0[r4]
            s.d r8 = r1.f15664f
            if (r8 == 0) goto L_0x016a
            r9 = r0[r6]
            s.d r9 = r9.f15664f
            if (r9 == 0) goto L_0x016a
            boolean r0 = r7.k0()
            if (r0 == 0) goto L_0x0114
            t.f r0 = r10.f16226h
            s.e r1 = r10.f16220b
            s.d[] r1 = r1.W
            r1 = r1[r4]
            int r1 = r1.f()
            r0.f16171f = r1
            t.f r0 = r10.f16227i
            s.e r1 = r10.f16220b
            s.d[] r1 = r1.W
            r1 = r1[r6]
            int r1 = r1.f()
            int r1 = -r1
            r0.f16171f = r1
            goto L_0x0153
        L_0x0114:
            s.e r0 = r10.f16220b
            s.d[] r0 = r0.W
            r0 = r0[r4]
            t.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x012f
            t.f r1 = r10.f16226h
            s.e r2 = r10.f16220b
            s.d[] r2 = r2.W
            r2 = r2[r4]
            int r2 = r2.f()
            r10.b(r1, r0, r2)
        L_0x012f:
            s.e r0 = r10.f16220b
            s.d[] r0 = r0.W
            r0 = r0[r6]
            t.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x014b
            t.f r1 = r10.f16227i
            s.e r2 = r10.f16220b
            s.d[] r2 = r2.W
            r2 = r2[r6]
            int r2 = r2.f()
            int r2 = -r2
            r10.b(r1, r0, r2)
        L_0x014b:
            t.f r0 = r10.f16226h
            r0.f16167b = r5
            t.f r0 = r10.f16227i
            r0.f16167b = r5
        L_0x0153:
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0401
        L_0x015b:
            t.f r0 = r10.f16201k
            t.f r1 = r10.f16226h
            s.e r2 = r10.f16220b
            int r2 = r2.p()
        L_0x0165:
            r10.b(r0, r1, r2)
            goto L_0x0401
        L_0x016a:
            if (r8 == 0) goto L_0x0195
            t.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x0401
            t.f r1 = r10.f16226h
            s.e r2 = r10.f16220b
            s.d[] r2 = r2.W
            r2 = r2[r4]
            int r2 = r2.f()
            r10.b(r1, r0, r2)
            t.f r0 = r10.f16227i
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16223e
            int r2 = r2.f16172g
            r10.b(r0, r1, r2)
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x0195:
            r1 = r0[r6]
            s.d r4 = r1.f15664f
            if (r4 == 0) goto L_0x01c6
            t.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x01bd
            t.f r1 = r10.f16227i
            s.e r2 = r10.f16220b
            s.d[] r2 = r2.W
            r2 = r2[r6]
            int r2 = r2.f()
            int r2 = -r2
            r10.b(r1, r0, r2)
            t.f r0 = r10.f16226h
            t.f r1 = r10.f16227i
            t.g r2 = r10.f16223e
            int r2 = r2.f16172g
            int r2 = -r2
            r10.b(r0, r1, r2)
        L_0x01bd:
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x01c6:
            r0 = r0[r3]
            s.d r1 = r0.f15664f
            if (r1 == 0) goto L_0x01ef
            t.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x0401
            t.f r1 = r10.f16201k
            r10.b(r1, r0, r2)
            t.f r0 = r10.f16226h
            t.f r1 = r10.f16201k
            s.e r2 = r10.f16220b
            int r2 = r2.p()
            int r2 = -r2
            r10.b(r0, r1, r2)
            t.f r0 = r10.f16227i
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16223e
            int r2 = r2.f16172g
            goto L_0x0165
        L_0x01ef:
            boolean r0 = r7 instanceof s.i
            if (r0 != 0) goto L_0x0401
            s.e r0 = r7.K()
            if (r0 == 0) goto L_0x0401
            s.e r0 = r10.f16220b
            s.d$b r1 = s.d.b.CENTER
            s.d r0 = r0.o(r1)
            s.d r0 = r0.f15664f
            if (r0 != 0) goto L_0x0401
            s.e r0 = r10.f16220b
            s.e r0 = r0.K()
            t.n r0 = r0.f15689f
            t.f r0 = r0.f16226h
            t.f r1 = r10.f16226h
            s.e r2 = r10.f16220b
            int r2 = r2.Y()
            r10.b(r1, r0, r2)
            t.f r0 = r10.f16227i
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16223e
            int r2 = r2.f16172g
            r10.b(r0, r1, r2)
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x022f:
            if (r1 != 0) goto L_0x027e
            s.e$b r1 = r10.f16222d
            s.e$b r7 = s.e.b.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x027e
            s.e r0 = r10.f16220b
            int r1 = r0.f15725x
            if (r1 == r4) goto L_0x0274
            if (r1 == r6) goto L_0x0240
            goto L_0x0281
        L_0x0240:
            boolean r0 = r0.k0()
            if (r0 != 0) goto L_0x0281
            s.e r0 = r10.f16220b
            int r1 = r0.f15723w
            if (r1 != r6) goto L_0x024d
            goto L_0x0281
        L_0x024d:
            t.l r0 = r0.f15687e
        L_0x024f:
            t.g r0 = r0.f16223e
            t.g r1 = r10.f16223e
            java.util.List r1 = r1.f16177l
            r1.add(r0)
            java.util.List r0 = r0.f16176k
            t.g r1 = r10.f16223e
            r0.add(r1)
            t.g r0 = r10.f16223e
            r0.f16167b = r5
            java.util.List r0 = r0.f16176k
            t.f r1 = r10.f16226h
            r0.add(r1)
            t.g r0 = r10.f16223e
            java.util.List r0 = r0.f16176k
            t.f r1 = r10.f16227i
            r0.add(r1)
            goto L_0x0281
        L_0x0274:
            s.e r0 = r0.K()
            if (r0 != 0) goto L_0x027b
            goto L_0x0281
        L_0x027b:
            t.n r0 = r0.f15689f
            goto L_0x024f
        L_0x027e:
            r0.b(r10)
        L_0x0281:
            s.e r0 = r10.f16220b
            s.d[] r1 = r0.W
            r7 = r1[r4]
            s.d r8 = r7.f15664f
            if (r8 == 0) goto L_0x02ea
            r9 = r1[r6]
            s.d r9 = r9.f15664f
            if (r9 == 0) goto L_0x02ea
            boolean r0 = r0.k0()
            if (r0 == 0) goto L_0x02b5
            t.f r0 = r10.f16226h
            s.e r1 = r10.f16220b
            s.d[] r1 = r1.W
            r1 = r1[r4]
            int r1 = r1.f()
            r0.f16171f = r1
            t.f r0 = r10.f16227i
            s.e r1 = r10.f16220b
            s.d[] r1 = r1.W
            r1 = r1[r6]
            int r1 = r1.f()
            int r1 = -r1
            r0.f16171f = r1
            goto L_0x02d7
        L_0x02b5:
            s.e r0 = r10.f16220b
            s.d[] r0 = r0.W
            r0 = r0[r4]
            t.f r0 = r10.h(r0)
            s.e r1 = r10.f16220b
            s.d[] r1 = r1.W
            r1 = r1[r6]
            t.f r1 = r10.h(r1)
            if (r0 == 0) goto L_0x02ce
            r0.b(r10)
        L_0x02ce:
            if (r1 == 0) goto L_0x02d3
            r1.b(r10)
        L_0x02d3:
            t.p$b r0 = t.p.b.CENTER
            r10.f16228j = r0
        L_0x02d7:
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x03f3
        L_0x02df:
            t.f r0 = r10.f16201k
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16202l
        L_0x02e5:
            r10.c(r0, r1, r5, r2)
            goto L_0x03f3
        L_0x02ea:
            r9 = 0
            if (r8 == 0) goto L_0x0336
            t.f r0 = r10.h(r7)
            if (r0 == 0) goto L_0x03f3
            t.f r1 = r10.f16226h
            s.e r2 = r10.f16220b
            s.d[] r2 = r2.W
            r2 = r2[r4]
            int r2 = r2.f()
            r10.b(r1, r0, r2)
            t.f r0 = r10.f16227i
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16223e
            r10.c(r0, r1, r5, r2)
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x031c
            t.f r0 = r10.f16201k
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16202l
            r10.c(r0, r1, r5, r2)
        L_0x031c:
            s.e$b r0 = r10.f16222d
            s.e$b r1 = s.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f3
            s.e r0 = r10.f16220b
            float r0 = r0.v()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f3
            s.e r0 = r10.f16220b
            t.l r0 = r0.f15687e
            s.e$b r2 = r0.f16222d
            if (r2 != r1) goto L_0x03f3
            goto L_0x03d9
        L_0x0336:
            r4 = r1[r6]
            s.d r7 = r4.f15664f
            r8 = -1
            if (r7 == 0) goto L_0x0366
            t.f r0 = r10.h(r4)
            if (r0 == 0) goto L_0x03f3
            t.f r1 = r10.f16227i
            s.e r2 = r10.f16220b
            s.d[] r2 = r2.W
            r2 = r2[r6]
            int r2 = r2.f()
            int r2 = -r2
            r10.b(r1, r0, r2)
            t.f r0 = r10.f16226h
            t.f r1 = r10.f16227i
            t.g r2 = r10.f16223e
            r10.c(r0, r1, r8, r2)
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x03f3
            goto L_0x02df
        L_0x0366:
            r1 = r1[r3]
            s.d r3 = r1.f15664f
            if (r3 == 0) goto L_0x0388
            t.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x03f3
            t.f r1 = r10.f16201k
            r10.b(r1, r0, r2)
            t.f r0 = r10.f16226h
            t.f r1 = r10.f16201k
            t.g r2 = r10.f16202l
            r10.c(r0, r1, r8, r2)
            t.f r0 = r10.f16227i
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16223e
            goto L_0x02e5
        L_0x0388:
            boolean r1 = r0 instanceof s.i
            if (r1 != 0) goto L_0x03f3
            s.e r0 = r0.K()
            if (r0 == 0) goto L_0x03f3
            s.e r0 = r10.f16220b
            s.e r0 = r0.K()
            t.n r0 = r0.f15689f
            t.f r0 = r0.f16226h
            t.f r1 = r10.f16226h
            s.e r2 = r10.f16220b
            int r2 = r2.Y()
            r10.b(r1, r0, r2)
            t.f r0 = r10.f16227i
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16223e
            r10.c(r0, r1, r5, r2)
            s.e r0 = r10.f16220b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x03c1
            t.f r0 = r10.f16201k
            t.f r1 = r10.f16226h
            t.g r2 = r10.f16202l
            r10.c(r0, r1, r5, r2)
        L_0x03c1:
            s.e$b r0 = r10.f16222d
            s.e$b r1 = s.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f3
            s.e r0 = r10.f16220b
            float r0 = r0.v()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f3
            s.e r0 = r10.f16220b
            t.l r0 = r0.f15687e
            s.e$b r2 = r0.f16222d
            if (r2 != r1) goto L_0x03f3
        L_0x03d9:
            t.g r0 = r0.f16223e
            java.util.List r0 = r0.f16176k
            t.g r1 = r10.f16223e
            r0.add(r1)
            t.g r0 = r10.f16223e
            java.util.List r0 = r0.f16177l
            s.e r1 = r10.f16220b
            t.l r1 = r1.f15687e
            t.g r1 = r1.f16223e
            r0.add(r1)
            t.g r0 = r10.f16223e
            r0.f16166a = r10
        L_0x03f3:
            t.g r0 = r10.f16223e
            java.util.List r0 = r0.f16177l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0401
            t.g r0 = r10.f16223e
            r0.f16168c = r5
        L_0x0401:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n.d():void");
    }

    public void e() {
        f fVar = this.f16226h;
        if (fVar.f16175j) {
            this.f16220b.n1(fVar.f16172g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f16221c = null;
        this.f16226h.c();
        this.f16227i.c();
        this.f16201k.c();
        this.f16223e.c();
        this.f16225g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f16222d != e.b.MATCH_CONSTRAINT || this.f16220b.f15725x == 0;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f16225g = false;
        this.f16226h.c();
        this.f16226h.f16175j = false;
        this.f16227i.c();
        this.f16227i.f16175j = false;
        this.f16201k.c();
        this.f16201k.f16175j = false;
        this.f16223e.f16175j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f16220b.t();
    }
}
