package t;

import t.f;

class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f16187m;

    public g(p pVar) {
        super(pVar);
        this.f16170e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    public void d(int i10) {
        if (!this.f16175j) {
            this.f16175j = true;
            this.f16172g = i10;
            for (d dVar : this.f16176k) {
                dVar.a(dVar);
            }
        }
    }
}
