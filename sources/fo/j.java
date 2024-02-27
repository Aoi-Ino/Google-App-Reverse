package fo;

import qn.c0;
import qn.g;
import qn.p;
import qn.s;
import qn.u1;
import qn.z;
import wn.a;

public class j extends s {

    /* renamed from: e  reason: collision with root package name */
    private final p f23661e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23662f;

    /* renamed from: g  reason: collision with root package name */
    private final int f23663g;

    /* renamed from: h  reason: collision with root package name */
    private final a f23664h;

    public j(int i10, int i11, a aVar) {
        this.f23661e = new p(0);
        this.f23662f = i10;
        this.f23663g = i11;
        this.f23664h = aVar;
    }

    public static j B(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(c0.k0(obj));
        }
        return null;
    }

    public int E() {
        return this.f23663g;
    }

    public a F() {
        return this.f23664h;
    }

    public z n() {
        g gVar = new g();
        gVar.a(this.f23661e);
        gVar.a(new p((long) this.f23662f));
        gVar.a(new p((long) this.f23663g));
        gVar.a(this.f23664h);
        return new u1(gVar);
    }

    public int y() {
        return this.f23662f;
    }

    private j(c0 c0Var) {
        this.f23661e = p.j0(c0Var.l0(0));
        this.f23662f = p.j0(c0Var.l0(1)).o0();
        this.f23663g = p.j0(c0Var.l0(2)).o0();
        this.f23664h = a.B(c0Var.l0(3));
    }
}
