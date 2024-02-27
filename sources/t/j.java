package t;

import s.e;
import s.h;

class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.f15687e.f();
        eVar.f15689f.f();
        this.f16224f = ((h) eVar).s1();
    }

    private void q(f fVar) {
        this.f16226h.f16176k.add(fVar);
        fVar.f16177l.add(this.f16226h);
    }

    public void a(d dVar) {
        f fVar = this.f16226h;
        if (fVar.f16168c && !fVar.f16175j) {
            this.f16226h.d((int) ((((float) ((f) fVar.f16177l.get(0)).f16172g) * ((h) this.f16220b).v1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        p pVar;
        f fVar;
        f fVar2;
        h hVar = (h) this.f16220b;
        int t12 = hVar.t1();
        int u12 = hVar.u1();
        hVar.v1();
        if (hVar.s1() == 1) {
            f fVar3 = this.f16226h;
            if (t12 != -1) {
                fVar3.f16177l.add(this.f16220b.f15680a0.f15687e.f16226h);
                this.f16220b.f15680a0.f15687e.f16226h.f16176k.add(this.f16226h);
                fVar2 = this.f16226h;
            } else if (u12 != -1) {
                fVar3.f16177l.add(this.f16220b.f15680a0.f15687e.f16227i);
                this.f16220b.f15680a0.f15687e.f16227i.f16176k.add(this.f16226h);
                fVar2 = this.f16226h;
                t12 = -u12;
            } else {
                fVar3.f16167b = true;
                fVar3.f16177l.add(this.f16220b.f15680a0.f15687e.f16227i);
                this.f16220b.f15680a0.f15687e.f16227i.f16176k.add(this.f16226h);
                q(this.f16220b.f15687e.f16226h);
                pVar = this.f16220b.f15687e;
            }
            fVar2.f16171f = t12;
            q(this.f16220b.f15687e.f16226h);
            pVar = this.f16220b.f15687e;
        } else {
            f fVar4 = this.f16226h;
            if (t12 != -1) {
                fVar4.f16177l.add(this.f16220b.f15680a0.f15689f.f16226h);
                this.f16220b.f15680a0.f15689f.f16226h.f16176k.add(this.f16226h);
                fVar = this.f16226h;
            } else if (u12 != -1) {
                fVar4.f16177l.add(this.f16220b.f15680a0.f15689f.f16227i);
                this.f16220b.f15680a0.f15689f.f16227i.f16176k.add(this.f16226h);
                fVar = this.f16226h;
                t12 = -u12;
            } else {
                fVar4.f16167b = true;
                fVar4.f16177l.add(this.f16220b.f15680a0.f15689f.f16227i);
                this.f16220b.f15680a0.f15689f.f16227i.f16176k.add(this.f16226h);
                q(this.f16220b.f15689f.f16226h);
                pVar = this.f16220b.f15689f;
            }
            fVar.f16171f = t12;
            q(this.f16220b.f15689f.f16226h);
            pVar = this.f16220b.f15689f;
        }
        q(pVar.f16227i);
    }

    public void e() {
        if (((h) this.f16220b).s1() == 1) {
            this.f16220b.m1(this.f16226h.f16172g);
        } else {
            this.f16220b.n1(this.f16226h.f16172g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f16226h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
