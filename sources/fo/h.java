package fo;

import qn.c0;
import qn.g;
import qn.p;
import qn.s;
import qn.u1;
import qn.z;
import wn.a;

public class h extends s {

    /* renamed from: e  reason: collision with root package name */
    private final p f23656e;

    /* renamed from: f  reason: collision with root package name */
    private final a f23657f;

    private h(c0 c0Var) {
        this.f23656e = p.j0(c0Var.l0(0));
        this.f23657f = a.B(c0Var.l0(1));
    }

    public static final h y(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(c0.k0(obj));
        }
        return null;
    }

    public a B() {
        return this.f23657f;
    }

    public z n() {
        g gVar = new g();
        gVar.a(this.f23656e);
        gVar.a(this.f23657f);
        return new u1(gVar);
    }

    public h(a aVar) {
        this.f23656e = new p(0);
        this.f23657f = aVar;
    }
}
