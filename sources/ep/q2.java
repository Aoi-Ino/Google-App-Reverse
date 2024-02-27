package ep;

import gp.f;
import hp.g0;
import hp.o;

class q2 implements x {

    /* renamed from: a  reason: collision with root package name */
    private final r2 f23383a;

    /* renamed from: b  reason: collision with root package name */
    private final w f23384b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23385c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f23386d;

    /* renamed from: e  reason: collision with root package name */
    private final f f23387e;

    public q2(w wVar, f fVar) {
        this(wVar, fVar, (String) null);
    }

    private Object e(o oVar) {
        e1 h10 = this.f23383a.h(oVar);
        return !h10.a() ? f(oVar, h10) : h10.c();
    }

    private Object f(o oVar, e1 e1Var) {
        Object d10 = d(oVar, this.f23386d);
        if (e1Var != null) {
            e1Var.b(d10);
        }
        return d10;
    }

    private Object g(String str, Class cls) {
        String property = this.f23384b.getProperty(str);
        if (property != null) {
            return this.f23383a.i(property, cls);
        }
        return null;
    }

    public Object a(o oVar, Object obj) {
        if (obj == null) {
            return b(oVar);
        }
        throw new n2("Can not read existing %s for %s", this.f23386d, this.f23387e);
    }

    public Object b(o oVar) {
        return oVar.b() ? e(oVar) : d(oVar, this.f23386d);
    }

    public void c(g0 g0Var, Object obj) {
        String j10 = this.f23383a.j(obj);
        if (j10 != null) {
            g0Var.i(j10);
        }
    }

    public Object d(o oVar, Class cls) {
        String value = oVar.getValue();
        if (value == null) {
            return null;
        }
        String str = this.f23385c;
        return (str == null || !value.equals(str)) ? g(value, cls) : this.f23385c;
    }

    public q2(w wVar, f fVar, String str) {
        this.f23383a = new r2(wVar, fVar);
        this.f23386d = fVar.getType();
        this.f23384b = wVar;
        this.f23385c = str;
        this.f23387e = fVar;
    }
}
