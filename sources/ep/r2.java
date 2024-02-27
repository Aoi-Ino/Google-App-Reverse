package ep;

import gp.f;
import gp.g;
import hp.o;

class r2 extends y0 {
    public r2(w wVar, f fVar) {
        super(wVar, fVar);
    }

    public e1 h(o oVar) {
        g b10 = b(oVar);
        return b10 == null ? this.f23434a.d(d()) : new d2(this.f23434a, b10);
    }

    public Object i(String str, Class cls) {
        return this.f23435b.r(str, cls);
    }

    public String j(Object obj) {
        Class<?> cls = obj.getClass();
        boolean isEnum = cls.isEnum();
        return this.f23435b.s(obj, cls);
    }

    public r2(w wVar, f fVar, Class cls) {
        super(wVar, fVar, cls);
    }
}
