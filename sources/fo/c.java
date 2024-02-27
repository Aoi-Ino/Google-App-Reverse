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
import zo.b;
import zo.h;
import zo.i;

public class c extends s {

    /* renamed from: e  reason: collision with root package name */
    private int f23606e;

    /* renamed from: f  reason: collision with root package name */
    private int f23607f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f23608g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f23609h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f23610i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f23611j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f23612k;

    public c(int i10, int i11, b bVar, i iVar, h hVar, h hVar2, a aVar) {
        this.f23606e = i10;
        this.f23607f = i11;
        this.f23608g = bVar.e();
        this.f23609h = iVar.h();
        this.f23610i = aVar.c();
        this.f23611j = hVar.a();
        this.f23612k = hVar2.a();
    }

    public static c E(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(c0.k0(obj));
        }
        return null;
    }

    public i B() {
        return new i(y(), this.f23609h);
    }

    public int F() {
        return this.f23607f;
    }

    public int H() {
        return this.f23606e;
    }

    public h T() {
        return new h(this.f23611j);
    }

    public h Y() {
        return new h(this.f23612k);
    }

    public a e0() {
        return new a(this.f23610i);
    }

    public z n() {
        g gVar = new g();
        gVar.a(new p((long) this.f23606e));
        gVar.a(new p((long) this.f23607f));
        gVar.a(new q1(this.f23608g));
        gVar.a(new q1(this.f23609h));
        gVar.a(new q1(this.f23611j));
        gVar.a(new q1(this.f23612k));
        gVar.a(new q1(this.f23610i));
        return new u1(gVar);
    }

    public b y() {
        return new b(this.f23608g);
    }

    private c(c0 c0Var) {
        this.f23606e = ((p) c0Var.l0(0)).o0();
        this.f23607f = ((p) c0Var.l0(1)).o0();
        this.f23608g = ((v) c0Var.l0(2)).l0();
        this.f23609h = ((v) c0Var.l0(3)).l0();
        this.f23611j = ((v) c0Var.l0(4)).l0();
        this.f23612k = ((v) c0Var.l0(5)).l0();
        this.f23610i = ((v) c0Var.l0(6)).l0();
    }
}
