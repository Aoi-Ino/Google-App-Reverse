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

public class k extends s {

    /* renamed from: e  reason: collision with root package name */
    private final int f23665e;

    /* renamed from: f  reason: collision with root package name */
    private final long f23666f;

    /* renamed from: g  reason: collision with root package name */
    private final long f23667g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f23668h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f23669i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f23670j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f23671k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f23672l;

    public k(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f23665e = 0;
        this.f23666f = j10;
        this.f23668h = a.d(bArr);
        this.f23669i = a.d(bArr2);
        this.f23670j = a.d(bArr3);
        this.f23671k = a.d(bArr4);
        this.f23672l = a.d(bArr5);
        this.f23667g = -1;
    }

    public static k E(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(c0.k0(obj));
        }
        return null;
    }

    public long B() {
        return this.f23666f;
    }

    public long F() {
        return this.f23667g;
    }

    public byte[] H() {
        return a.d(this.f23670j);
    }

    public byte[] T() {
        return a.d(this.f23671k);
    }

    public byte[] Y() {
        return a.d(this.f23669i);
    }

    public byte[] e0() {
        return a.d(this.f23668h);
    }

    public int g0() {
        return this.f23665e;
    }

    public z n() {
        g gVar = new g();
        gVar.a(this.f23667g >= 0 ? new p(1) : new p(0));
        g gVar2 = new g();
        gVar2.a(new p(this.f23666f));
        gVar2.a(new q1(this.f23668h));
        gVar2.a(new q1(this.f23669i));
        gVar2.a(new q1(this.f23670j));
        gVar2.a(new q1(this.f23671k));
        if (this.f23667g >= 0) {
            gVar2.a(new x1(false, 0, new p(this.f23667g)));
        }
        gVar.a(new u1(gVar2));
        gVar.a(new x1(true, 0, new q1(this.f23672l)));
        return new u1(gVar);
    }

    public byte[] y() {
        return a.d(this.f23672l);
    }

    public k(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j11) {
        this.f23665e = 1;
        this.f23666f = j10;
        this.f23668h = a.d(bArr);
        this.f23669i = a.d(bArr2);
        this.f23670j = a.d(bArr3);
        this.f23671k = a.d(bArr4);
        this.f23672l = a.d(bArr5);
        this.f23667g = j11;
    }

    private k(c0 c0Var) {
        long j10;
        p j02 = p.j0(c0Var.l0(0));
        if (j02.m0(0) || j02.m0(1)) {
            this.f23665e = j02.o0();
            if (c0Var.size() == 2 || c0Var.size() == 3) {
                c0 k02 = c0.k0(c0Var.l0(1));
                this.f23666f = p.j0(k02.l0(0)).r0();
                this.f23668h = a.d(v.j0(k02.l0(1)).l0());
                this.f23669i = a.d(v.j0(k02.l0(2)).l0());
                this.f23670j = a.d(v.j0(k02.l0(3)).l0());
                this.f23671k = a.d(v.j0(k02.l0(4)).l0());
                if (k02.size() == 6) {
                    h0 o02 = h0.o0(k02.l0(5));
                    if (o02.r0() == 0) {
                        j10 = p.k0(o02, false).r0();
                    } else {
                        throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                    }
                } else if (k02.size() == 5) {
                    j10 = -1;
                } else {
                    throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
                }
                this.f23667g = j10;
                if (c0Var.size() == 3) {
                    this.f23672l = a.d(v.k0(h0.o0(c0Var.l0(2)), true).l0());
                } else {
                    this.f23672l = null;
                }
            } else {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        } else {
            throw new IllegalArgumentException("unknown version of sequence");
        }
    }
}
