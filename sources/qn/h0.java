package qn;

import ap.a;
import java.io.IOException;

public abstract class h0 extends z implements p2 {

    /* renamed from: e  reason: collision with root package name */
    final int f30928e;

    /* renamed from: f  reason: collision with root package name */
    final int f30929f;

    /* renamed from: g  reason: collision with root package name */
    final int f30930g;

    /* renamed from: h  reason: collision with root package name */
    final f f30931h;

    h0(int i10, int i11, int i12, f fVar) {
        if (fVar == null) {
            throw new NullPointerException("'obj' cannot be null");
        } else if (i11 == 0 || (i11 & 192) != i11) {
            throw new IllegalArgumentException("invalid tag class: " + i11);
        } else {
            this.f30928e = i10;
            this.f30929f = i11;
            this.f30930g = i12;
            this.f30931h = fVar;
        }
    }

    private static h0 i0(z zVar) {
        if (zVar instanceof h0) {
            return (h0) zVar;
        }
        throw new IllegalStateException("unexpected object: " + zVar.getClass().getName());
    }

    static z j0(int i10, int i11, g gVar) {
        m2 m2Var = gVar.f() == 1 ? new m2(3, i10, i11, gVar.d(0)) : new m2(4, i10, i11, g2.a(gVar));
        return i10 != 64 ? m2Var : new c2(m2Var);
    }

    static z k0(int i10, int i11, g gVar) {
        b1 b1Var = gVar.f() == 1 ? new b1(3, i10, i11, gVar.d(0)) : new b1(4, i10, i11, u0.a(gVar));
        return i10 != 64 ? b1Var : new q0(b1Var);
    }

    static z l0(int i10, int i11, byte[] bArr) {
        m2 m2Var = new m2(4, i10, i11, new q1(bArr));
        return i10 != 64 ? m2Var : new c2(m2Var);
    }

    public static h0 o0(Object obj) {
        if (obj == null || (obj instanceof h0)) {
            return (h0) obj;
        }
        if (obj instanceof f) {
            z n10 = ((f) obj).n();
            if (n10 instanceof h0) {
                return (h0) n10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return i0(z.e0((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return new x1(this.f30928e, this.f30929f, this.f30930g, this.f30931h);
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return new m2(this.f30928e, this.f30929f, this.f30930g, this.f30931h);
    }

    public int hashCode() {
        return (((this.f30929f * 7919) ^ this.f30930g) ^ (s0() ? 15 : 240)) ^ this.f30931h.n().hashCode();
    }

    /* access modifiers changed from: package-private */
    public z m0(boolean z10, m0 m0Var) {
        if (z10) {
            if (s0()) {
                return m0Var.a(this.f30931h.n());
            }
            throw new IllegalStateException("object explicit - implicit expected.");
        } else if (1 != this.f30928e) {
            z n10 = this.f30931h.n();
            int i10 = this.f30928e;
            if (i10 == 3) {
                return m0Var.c(t0(n10));
            }
            if (i10 != 4) {
                return m0Var.a(n10);
            }
            return n10 instanceof c0 ? m0Var.c((c0) n10) : m0Var.d((q1) n10);
        } else {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
    }

    public s n0() {
        if (s0()) {
            f fVar = this.f30931h;
            return fVar instanceof s ? (s) fVar : fVar.n();
        }
        throw new IllegalStateException("object implicit - explicit expected.");
    }

    public z p0() {
        if (128 == q0()) {
            return this.f30931h.n();
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public int q0() {
        return this.f30929f;
    }

    public final z r() {
        return this;
    }

    public int r0() {
        return this.f30930g;
    }

    public boolean s0() {
        int i10 = this.f30928e;
        return i10 == 1 || i10 == 3;
    }

    /* access modifiers changed from: package-private */
    public abstract c0 t0(z zVar);

    public String toString() {
        return n0.a(this.f30929f, this.f30930g) + this.f30931h;
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (zVar instanceof a) {
            return zVar.Y(this);
        }
        if (!(zVar instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) zVar;
        if (this.f30930g != h0Var.f30930g || this.f30929f != h0Var.f30929f) {
            return false;
        }
        if (this.f30928e != h0Var.f30928e && s0() != h0Var.s0()) {
            return false;
        }
        z n10 = this.f30931h.n();
        z n11 = h0Var.f30931h.n();
        if (n10 == n11) {
            return true;
        }
        if (s0()) {
            return n10.y(n11);
        }
        try {
            return a.a(getEncoded(), h0Var.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected h0(boolean z10, int i10, int i11, f fVar) {
        this(z10 ? 1 : 2, i10, i11, fVar);
    }

    protected h0(boolean z10, int i10, f fVar) {
        this(z10, 128, i10, fVar);
    }
}
