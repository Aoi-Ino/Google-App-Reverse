package fo;

import qn.c0;
import qn.g;
import qn.p;
import qn.q1;
import qn.s;
import qn.u1;
import qn.v;
import qn.z;
import zo.a;

public class d extends s {

    /* renamed from: e  reason: collision with root package name */
    private final int f23613e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23614f;

    /* renamed from: g  reason: collision with root package name */
    private final a f23615g;

    public d(int i10, int i11, a aVar) {
        this.f23613e = i10;
        this.f23614f = i11;
        this.f23615g = new a(aVar);
    }

    public static d B(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(c0.k0(obj));
        }
        return null;
    }

    public int E() {
        return this.f23613e;
    }

    public int F() {
        return this.f23614f;
    }

    public z n() {
        g gVar = new g();
        gVar.a(new p((long) this.f23613e));
        gVar.a(new p((long) this.f23614f));
        gVar.a(new q1(this.f23615g.c()));
        return new u1(gVar);
    }

    public a y() {
        return new a(this.f23615g);
    }

    private d(c0 c0Var) {
        this.f23613e = ((p) c0Var.l0(0)).o0();
        this.f23614f = ((p) c0Var.l0(1)).o0();
        this.f23615g = new a(((v) c0Var.l0(2)).l0());
    }
}
