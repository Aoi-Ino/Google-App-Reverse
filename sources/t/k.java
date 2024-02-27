package t;

import s.a;
import s.e;
import t.f;

class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f16226h.f16176k.add(fVar);
        fVar.f16177l.add(this.f16226h);
    }

    public void a(d dVar) {
        a aVar = (a) this.f16220b;
        int v12 = aVar.v1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f16226h.f16177l) {
            int i12 = fVar.f16172g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (v12 == 0 || v12 == 2) {
            this.f16226h.d(i11 + aVar.w1());
        } else {
            this.f16226h.d(i10 + aVar.w1());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        p pVar;
        e eVar = this.f16220b;
        if (eVar instanceof a) {
            this.f16226h.f16167b = true;
            a aVar = (a) eVar;
            int v12 = aVar.v1();
            boolean u12 = aVar.u1();
            int i10 = 0;
            if (v12 == 0) {
                this.f16226h.f16170e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    e eVar2 = aVar.L0[i10];
                    if (u12 || eVar2.V() != 8) {
                        f fVar = eVar2.f15687e.f16226h;
                        fVar.f16176k.add(this.f16226h);
                        this.f16226h.f16177l.add(fVar);
                    }
                    i10++;
                }
                q(this.f16220b.f15687e.f16226h);
                pVar = this.f16220b.f15687e;
            } else if (v12 != 1) {
                if (v12 == 2) {
                    this.f16226h.f16170e = f.a.TOP;
                    while (i10 < aVar.M0) {
                        e eVar3 = aVar.L0[i10];
                        if (u12 || eVar3.V() != 8) {
                            f fVar2 = eVar3.f15689f.f16226h;
                            fVar2.f16176k.add(this.f16226h);
                            this.f16226h.f16177l.add(fVar2);
                        }
                        i10++;
                    }
                } else if (v12 == 3) {
                    this.f16226h.f16170e = f.a.BOTTOM;
                    while (i10 < aVar.M0) {
                        e eVar4 = aVar.L0[i10];
                        if (u12 || eVar4.V() != 8) {
                            f fVar3 = eVar4.f15689f.f16227i;
                            fVar3.f16176k.add(this.f16226h);
                            this.f16226h.f16177l.add(fVar3);
                        }
                        i10++;
                    }
                } else {
                    return;
                }
                q(this.f16220b.f15689f.f16226h);
                pVar = this.f16220b.f15689f;
            } else {
                this.f16226h.f16170e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    e eVar5 = aVar.L0[i10];
                    if (u12 || eVar5.V() != 8) {
                        f fVar4 = eVar5.f15687e.f16227i;
                        fVar4.f16176k.add(this.f16226h);
                        this.f16226h.f16177l.add(fVar4);
                    }
                    i10++;
                }
                q(this.f16220b.f15687e.f16226h);
                pVar = this.f16220b.f15687e;
            }
            q(pVar.f16227i);
        }
    }

    public void e() {
        e eVar = this.f16220b;
        if (eVar instanceof a) {
            int v12 = ((a) eVar).v1();
            if (v12 == 0 || v12 == 1) {
                this.f16220b.m1(this.f16226h.f16172g);
            } else {
                this.f16220b.n1(this.f16226h.f16172g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f16221c = null;
        this.f16226h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
