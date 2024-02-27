package fo;

import ap.a;
import qn.c0;
import qn.g;
import qn.h0;
import qn.p;
import qn.q1;
import qn.s;
import qn.u1;
import qn.v;
import qn.x1;
import qn.z;

public class m extends s {

    /* renamed from: e  reason: collision with root package name */
    private final int f23675e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23676f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f23677g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f23678h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f23679i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f23680j;

    /* renamed from: k  reason: collision with root package name */
    private final int f23681k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f23682l;

    public m(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f23675e = 0;
        this.f23676f = i10;
        this.f23677g = a.d(bArr);
        this.f23678h = a.d(bArr2);
        this.f23679i = a.d(bArr3);
        this.f23680j = a.d(bArr4);
        this.f23682l = a.d(bArr5);
        this.f23681k = -1;
    }

    public static m B(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(c0.k0(obj));
        }
        return null;
    }

    public int E() {
        return this.f23681k;
    }

    public byte[] F() {
        return a.d(this.f23679i);
    }

    public byte[] H() {
        return a.d(this.f23680j);
    }

    public byte[] T() {
        return a.d(this.f23678h);
    }

    public byte[] Y() {
        return a.d(this.f23677g);
    }

    public int e0() {
        return this.f23675e;
    }

    public int f() {
        return this.f23676f;
    }

    public z n() {
        g gVar = new g();
        gVar.a(this.f23681k >= 0 ? new p(1) : new p(0));
        g gVar2 = new g();
        gVar2.a(new p((long) this.f23676f));
        gVar2.a(new q1(this.f23677g));
        gVar2.a(new q1(this.f23678h));
        gVar2.a(new q1(this.f23679i));
        gVar2.a(new q1(this.f23680j));
        if (this.f23681k >= 0) {
            gVar2.a(new x1(false, 0, new p((long) this.f23681k)));
        }
        gVar.a(new u1(gVar2));
        gVar.a(new x1(true, 0, new q1(this.f23682l)));
        return new u1(gVar);
    }

    public byte[] y() {
        return a.d(this.f23682l);
    }

    public m(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i11) {
        this.f23675e = 1;
        this.f23676f = i10;
        this.f23677g = a.d(bArr);
        this.f23678h = a.d(bArr2);
        this.f23679i = a.d(bArr3);
        this.f23680j = a.d(bArr4);
        this.f23682l = a.d(bArr5);
        this.f23681k = i11;
    }

    private m(c0 c0Var) {
        int i10;
        p j02 = p.j0(c0Var.l0(0));
        if (j02.m0(0) || j02.m0(1)) {
            this.f23675e = j02.o0();
            if (c0Var.size() == 2 || c0Var.size() == 3) {
                c0 k02 = c0.k0(c0Var.l0(1));
                this.f23676f = p.j0(k02.l0(0)).o0();
                this.f23677g = a.d(v.j0(k02.l0(1)).l0());
                this.f23678h = a.d(v.j0(k02.l0(2)).l0());
                this.f23679i = a.d(v.j0(k02.l0(3)).l0());
                this.f23680j = a.d(v.j0(k02.l0(4)).l0());
                if (k02.size() == 6) {
                    h0 o02 = h0.o0(k02.l0(5));
                    if (o02.r0() == 0) {
                        i10 = p.k0(o02, false).o0();
                    } else {
                        throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                    }
                } else if (k02.size() == 5) {
                    i10 = -1;
                } else {
                    throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
                }
                this.f23681k = i10;
                if (c0Var.size() == 3) {
                    this.f23682l = a.d(v.k0(h0.o0(c0Var.l0(2)), true).l0());
                } else {
                    this.f23682l = null;
                }
            } else {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        } else {
            throw new IllegalArgumentException("unknown version of sequence");
        }
    }
}
