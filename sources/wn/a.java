package wn;

import qn.c0;
import qn.f;
import qn.g;
import qn.s;
import qn.u;
import qn.u1;
import qn.z;

public class a extends s {

    /* renamed from: e  reason: collision with root package name */
    private u f32653e;

    /* renamed from: f  reason: collision with root package name */
    private f f32654f;

    public a(u uVar) {
        this.f32653e = uVar;
    }

    public static a B(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(c0.k0(obj));
        }
        return null;
    }

    public f E() {
        return this.f32654f;
    }

    public z n() {
        g gVar = new g(2);
        gVar.a(this.f32653e);
        f fVar = this.f32654f;
        if (fVar != null) {
            gVar.a(fVar);
        }
        return new u1(gVar);
    }

    public u y() {
        return this.f32653e;
    }

    public a(u uVar, f fVar) {
        this.f32653e = uVar;
        this.f32654f = fVar;
    }

    private a(c0 c0Var) {
        if (c0Var.size() < 1 || c0Var.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + c0Var.size());
        }
        this.f32653e = u.n0(c0Var.l0(0));
        this.f32654f = c0Var.size() == 2 ? c0Var.l0(1) : null;
    }
}
