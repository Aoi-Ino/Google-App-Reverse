package fo;

import qn.c0;
import qn.g;
import qn.p;
import qn.s;
import qn.u1;
import qn.z;
import wn.a;

public class i extends s {

    /* renamed from: e  reason: collision with root package name */
    private final p f23658e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23659f;

    /* renamed from: g  reason: collision with root package name */
    private final a f23660g;

    public i(int i10, a aVar) {
        this.f23658e = new p(0);
        this.f23659f = i10;
        this.f23660g = aVar;
    }

    public static i B(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(c0.k0(obj));
        }
        return null;
    }

    public a E() {
        return this.f23660g;
    }

    public z n() {
        g gVar = new g();
        gVar.a(this.f23658e);
        gVar.a(new p((long) this.f23659f));
        gVar.a(this.f23660g);
        return new u1(gVar);
    }

    public int y() {
        return this.f23659f;
    }

    private i(c0 c0Var) {
        this.f23658e = p.j0(c0Var.l0(0));
        this.f23659f = p.j0(c0Var.l0(1)).o0();
        this.f23660g = a.B(c0Var.l0(2));
    }
}
