package ep;

import gp.g;

class d2 implements e1 {

    /* renamed from: a  reason: collision with root package name */
    private final w f23144a;

    /* renamed from: b  reason: collision with root package name */
    private final g f23145b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f23146c;

    public d2(w wVar, g gVar) {
        this.f23146c = gVar.getType();
        this.f23144a = wVar;
        this.f23145b = gVar;
    }

    public boolean a() {
        return this.f23145b.a();
    }

    public Object b(Object obj) {
        g gVar = this.f23145b;
        if (gVar != null) {
            gVar.setValue(obj);
        }
        return obj;
    }

    public Object c() {
        if (this.f23145b.a()) {
            return this.f23145b.getValue();
        }
        Object d10 = d(this.f23146c);
        g gVar = this.f23145b;
        if (gVar != null) {
            gVar.setValue(d10);
        }
        return d10;
    }

    public Object d(Class cls) {
        return this.f23144a.d(cls).c();
    }

    public Class getType() {
        return this.f23146c;
    }
}
