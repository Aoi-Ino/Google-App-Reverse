package fo;

import lo.a;
import qn.c0;
import qn.f;
import qn.p;
import qn.q1;
import qn.s;
import qn.u;
import qn.u1;
import qn.v;
import qn.z;

public class g extends s {

    /* renamed from: e  reason: collision with root package name */
    private p f23650e;

    /* renamed from: f  reason: collision with root package name */
    private u f23651f;

    /* renamed from: g  reason: collision with root package name */
    private p f23652g;

    /* renamed from: h  reason: collision with root package name */
    private byte[][] f23653h;

    /* renamed from: i  reason: collision with root package name */
    private byte[][] f23654i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f23655j;

    public g(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f23650e = new p(0);
        this.f23652g = new p((long) i10);
        this.f23653h = a.c(sArr);
        this.f23654i = a.c(sArr2);
        this.f23655j = a.a(sArr3);
    }

    public static g H(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(c0.k0(obj));
        }
        return null;
    }

    public short[] B() {
        return a.b(this.f23655j);
    }

    public short[][] E() {
        return a.d(this.f23654i);
    }

    public int F() {
        return this.f23652g.o0();
    }

    public z n() {
        qn.g gVar = new qn.g();
        f fVar = this.f23650e;
        if (fVar == null) {
            fVar = this.f23651f;
        }
        gVar.a(fVar);
        gVar.a(this.f23652g);
        qn.g gVar2 = new qn.g();
        for (byte[] q1Var : this.f23653h) {
            gVar2.a(new q1(q1Var));
        }
        gVar.a(new u1(gVar2));
        qn.g gVar3 = new qn.g();
        for (byte[] q1Var2 : this.f23654i) {
            gVar3.a(new q1(q1Var2));
        }
        gVar.a(new u1(gVar3));
        qn.g gVar4 = new qn.g();
        gVar4.a(new q1(this.f23655j));
        gVar.a(new u1(gVar4));
        return new u1(gVar);
    }

    public short[][] y() {
        return a.d(this.f23653h);
    }

    private g(c0 c0Var) {
        if (c0Var.l0(0) instanceof p) {
            this.f23650e = p.j0(c0Var.l0(0));
        } else {
            this.f23651f = u.n0(c0Var.l0(0));
        }
        this.f23652g = p.j0(c0Var.l0(1));
        c0 k02 = c0.k0(c0Var.l0(2));
        this.f23653h = new byte[k02.size()][];
        for (int i10 = 0; i10 < k02.size(); i10++) {
            this.f23653h[i10] = v.j0(k02.l0(i10)).l0();
        }
        c0 c0Var2 = (c0) c0Var.l0(3);
        this.f23654i = new byte[c0Var2.size()][];
        for (int i11 = 0; i11 < c0Var2.size(); i11++) {
            this.f23654i[i11] = v.j0(c0Var2.l0(i11)).l0();
        }
        this.f23655j = v.j0(((c0) c0Var.l0(4)).l0(0)).l0();
    }
}
