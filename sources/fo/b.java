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

public class b extends s {

    /* renamed from: e  reason: collision with root package name */
    private final int f23602e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23603f;

    /* renamed from: g  reason: collision with root package name */
    private final a f23604g;

    /* renamed from: h  reason: collision with root package name */
    private final wn.a f23605h;

    public b(int i10, int i11, a aVar, wn.a aVar2) {
        this.f23602e = i10;
        this.f23603f = i11;
        this.f23604g = new a(aVar.c());
        this.f23605h = aVar2;
    }

    public static b E(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(c0.k0(obj));
        }
        return null;
    }

    public a B() {
        return this.f23604g;
    }

    public int F() {
        return this.f23602e;
    }

    public int H() {
        return this.f23603f;
    }

    public z n() {
        g gVar = new g();
        gVar.a(new p((long) this.f23602e));
        gVar.a(new p((long) this.f23603f));
        gVar.a(new q1(this.f23604g.c()));
        gVar.a(this.f23605h);
        return new u1(gVar);
    }

    public wn.a y() {
        return this.f23605h;
    }

    private b(c0 c0Var) {
        this.f23602e = ((p) c0Var.l0(0)).o0();
        this.f23603f = ((p) c0Var.l0(1)).o0();
        this.f23604g = new a(((v) c0Var.l0(2)).l0());
        this.f23605h = wn.a.B(c0Var.l0(3));
    }
}
