package fo;

import qn.c0;
import qn.g;
import qn.p;
import qn.q1;
import qn.s;
import qn.u1;
import qn.v;
import qn.z;
import zo.b;
import zo.h;
import zo.i;

public class a extends s {

    /* renamed from: e  reason: collision with root package name */
    private int f23596e;

    /* renamed from: f  reason: collision with root package name */
    private int f23597f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f23598g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f23599h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f23600i;

    /* renamed from: j  reason: collision with root package name */
    private wn.a f23601j;

    public a(int i10, int i11, b bVar, i iVar, h hVar, wn.a aVar) {
        this.f23596e = i10;
        this.f23597f = i11;
        this.f23598g = bVar.e();
        this.f23599h = iVar.h();
        this.f23600i = hVar.a();
        this.f23601j = aVar;
    }

    public static a F(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(c0.k0(obj));
        }
        return null;
    }

    public b B() {
        return new b(this.f23598g);
    }

    public i E() {
        return new i(B(), this.f23599h);
    }

    public int H() {
        return this.f23597f;
    }

    public int T() {
        return this.f23596e;
    }

    public h Y() {
        return new h(this.f23600i);
    }

    public z n() {
        g gVar = new g();
        gVar.a(new p((long) this.f23596e));
        gVar.a(new p((long) this.f23597f));
        gVar.a(new q1(this.f23598g));
        gVar.a(new q1(this.f23599h));
        gVar.a(new q1(this.f23600i));
        gVar.a(this.f23601j);
        return new u1(gVar);
    }

    public wn.a y() {
        return this.f23601j;
    }

    private a(c0 c0Var) {
        this.f23596e = ((p) c0Var.l0(0)).o0();
        this.f23597f = ((p) c0Var.l0(1)).o0();
        this.f23598g = ((v) c0Var.l0(2)).l0();
        this.f23599h = ((v) c0Var.l0(3)).l0();
        this.f23600i = ((v) c0Var.l0(4)).l0();
        this.f23601j = wn.a.B(c0Var.l0(5));
    }
}
