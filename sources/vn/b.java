package vn;

import java.util.Enumeration;
import qn.c;
import qn.c0;
import qn.d0;
import qn.f;
import qn.g;
import qn.h0;
import qn.h1;
import qn.p;
import qn.q1;
import qn.s;
import qn.u1;
import qn.v;
import qn.x1;
import qn.z;
import wn.a;

public class b extends s {

    /* renamed from: e  reason: collision with root package name */
    private p f32487e;

    /* renamed from: f  reason: collision with root package name */
    private a f32488f;

    /* renamed from: g  reason: collision with root package name */
    private v f32489g;

    /* renamed from: h  reason: collision with root package name */
    private d0 f32490h;

    /* renamed from: i  reason: collision with root package name */
    private c f32491i;

    private b(c0 c0Var) {
        Enumeration m02 = c0Var.m0();
        p j02 = p.j0(m02.nextElement());
        this.f32487e = j02;
        int H = H(j02);
        this.f32488f = a.B(m02.nextElement());
        this.f32489g = v.j0(m02.nextElement());
        int i10 = -1;
        while (m02.hasMoreElements()) {
            h0 h0Var = (h0) m02.nextElement();
            int r02 = h0Var.r0();
            if (r02 > i10) {
                if (r02 == 0) {
                    this.f32490h = d0.j0(h0Var, false);
                } else if (r02 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                } else if (H >= 1) {
                    this.f32491i = h1.r0(h0Var, false);
                } else {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                i10 = r02;
            } else {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
        }
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

    private static int H(p pVar) {
        int o02 = pVar.o0();
        if (o02 >= 0 && o02 <= 1) {
            return o02;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    public a E() {
        return this.f32488f;
    }

    public c F() {
        return this.f32491i;
    }

    public f T() {
        return z.e0(this.f32489g.l0());
    }

    public z n() {
        g gVar = new g(5);
        gVar.a(this.f32487e);
        gVar.a(this.f32488f);
        gVar.a(this.f32489g);
        d0 d0Var = this.f32490h;
        if (d0Var != null) {
            gVar.a(new x1(false, 0, d0Var));
        }
        c cVar = this.f32491i;
        if (cVar != null) {
            gVar.a(new x1(false, 1, cVar));
        }
        return new u1(gVar);
    }

    public d0 y() {
        return this.f32490h;
    }

    public b(a aVar, f fVar) {
        this(aVar, fVar, (d0) null, (byte[]) null);
    }

    public b(a aVar, f fVar, d0 d0Var) {
        this(aVar, fVar, d0Var, (byte[]) null);
    }

    public b(a aVar, f fVar, d0 d0Var, byte[] bArr) {
        this.f32487e = new p(bArr != null ? ap.b.f19419b : ap.b.f19418a);
        this.f32488f = aVar;
        this.f32489g = new q1(fVar);
        this.f32490h = d0Var;
        this.f32491i = bArr == null ? null : new h1(bArr);
    }
}
