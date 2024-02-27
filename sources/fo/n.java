package fo;

import ap.a;
import qn.c0;
import qn.g;
import qn.p;
import qn.q1;
import qn.s;
import qn.u1;
import qn.v;
import qn.z;

public class n extends s {

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f23683e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f23684f;

    private n(c0 c0Var) {
        if (p.j0(c0Var.l0(0)).m0(0)) {
            this.f23683e = a.d(v.j0(c0Var.l0(1)).l0());
            this.f23684f = a.d(v.j0(c0Var.l0(2)).l0());
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public static n y(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(c0.k0(obj));
        }
        return null;
    }

    public byte[] B() {
        return a.d(this.f23683e);
    }

    public byte[] E() {
        return a.d(this.f23684f);
    }

    public z n() {
        g gVar = new g();
        gVar.a(new p(0));
        gVar.a(new q1(this.f23683e));
        gVar.a(new q1(this.f23684f));
        return new u1(gVar);
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.f23683e = a.d(bArr);
        this.f23684f = a.d(bArr2);
    }
}
