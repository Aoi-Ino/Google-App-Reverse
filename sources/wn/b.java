package wn;

import java.util.Enumeration;
import qn.c;
import qn.c0;
import qn.f;
import qn.g;
import qn.h1;
import qn.s;
import qn.u1;
import qn.z;

public class b extends s {

    /* renamed from: e  reason: collision with root package name */
    private a f32655e;

    /* renamed from: f  reason: collision with root package name */
    private c f32656f;

    public b(c0 c0Var) {
        if (c0Var.size() == 2) {
            Enumeration m02 = c0Var.m0();
            this.f32655e = a.B(m02.nextElement());
            this.f32656f = h1.q0(m02.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + c0Var.size());
    }

    public static b B(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(c0.k0(obj));
        }
        return null;
    }

    public c E() {
        return this.f32656f;
    }

    public z F() {
        return z.e0(this.f32656f.m0());
    }

    public z n() {
        g gVar = new g(2);
        gVar.a(this.f32655e);
        gVar.a(this.f32656f);
        return new u1(gVar);
    }

    public a y() {
        return this.f32655e;
    }

    public b(a aVar, f fVar) {
        this.f32656f = new h1(fVar);
        this.f32655e = aVar;
    }

    public b(a aVar, byte[] bArr) {
        this.f32656f = new h1(bArr);
        this.f32655e = aVar;
    }
}
