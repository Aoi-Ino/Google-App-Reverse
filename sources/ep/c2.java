package ep;

import gp.f;
import gp.g;
import hp.o;

class c2 extends r2 {
    public c2(w wVar, f fVar, Class cls) {
        super(wVar, fVar, cls);
    }

    public e1 h(o oVar) {
        g b10 = b(oVar);
        Class d10 = d();
        if (b10 != null) {
            return new d2(this.f23434a, b10);
        }
        if (y0.f(d10)) {
            return this.f23434a.d(d10);
        }
        throw new g1("Cannot instantiate %s for %s", d10, this.f23437d);
    }
}
