package qn;

import ap.e;

public abstract class j extends z {

    /* renamed from: j  reason: collision with root package name */
    static final m0 f30935j = new a(j.class, 8);

    /* renamed from: e  reason: collision with root package name */
    u f30936e;

    /* renamed from: f  reason: collision with root package name */
    p f30937f;

    /* renamed from: g  reason: collision with root package name */
    z f30938g;

    /* renamed from: h  reason: collision with root package name */
    int f30939h;

    /* renamed from: i  reason: collision with root package name */
    z f30940i;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z c(c0 c0Var) {
            return c0Var.o0();
        }
    }

    j(u uVar, p pVar, z zVar, int i10, z zVar2) {
        this.f30936e = uVar;
        this.f30937f = pVar;
        this.f30938g = zVar;
        this.f30939h = j0(i10);
        this.f30940i = k0(i10, zVar2);
    }

    private static int j0(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            return i10;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i10);
    }

    private static z k0(int i10, z zVar) {
        m0 m0Var;
        if (i10 == 1) {
            m0Var = v.f31007f;
        } else if (i10 != 2) {
            return zVar;
        } else {
            m0Var = c.f30883f;
        }
        return m0Var.a(zVar);
    }

    private static z l0(h0 h0Var) {
        int q02 = h0Var.q0();
        int r02 = h0Var.r0();
        if (128 != q02) {
            throw new IllegalArgumentException("invalid tag: " + n0.a(q02, r02));
        } else if (r02 == 0) {
            return h0Var.n0().n();
        } else {
            if (r02 == 1) {
                return v.k0(h0Var, false);
            }
            if (r02 == 2) {
                return c.l0(h0Var, false);
            }
            throw new IllegalArgumentException("invalid tag: " + n0.a(q02, r02));
        }
    }

    private static z m0(c0 c0Var, int i10) {
        if (c0Var.size() > i10) {
            return c0Var.l0(i10).n();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.s(z10, 40);
        i0().B(xVar, false);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return i0().T(z10);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return new i1(this.f30936e, this.f30937f, this.f30938g, this.f30939h, this.f30940i);
    }

    public int hashCode() {
        return (((e.b(this.f30936e) ^ e.b(this.f30937f)) ^ e.b(this.f30938g)) ^ this.f30939h) ^ this.f30940i.hashCode();
    }

    /* access modifiers changed from: package-private */
    public abstract c0 i0();

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (this == zVar) {
            return true;
        }
        if (!(zVar instanceof j)) {
            return false;
        }
        j jVar = (j) zVar;
        return e.a(this.f30936e, jVar.f30936e) && e.a(this.f30937f, jVar.f30937f) && e.a(this.f30938g, jVar.f30938g) && this.f30939h == jVar.f30939h && this.f30940i.Y(jVar.f30940i);
    }

    j(c0 c0Var) {
        int i10 = 0;
        z m02 = m0(c0Var, 0);
        if (m02 instanceof u) {
            this.f30936e = (u) m02;
            m02 = m0(c0Var, 1);
            i10 = 1;
        }
        if (m02 instanceof p) {
            this.f30937f = (p) m02;
            i10++;
            m02 = m0(c0Var, i10);
        }
        if (!(m02 instanceof h0)) {
            this.f30938g = m02;
            i10++;
            m02 = m0(c0Var, i10);
        }
        if (c0Var.size() != i10 + 1) {
            throw new IllegalArgumentException("input sequence too large");
        } else if (m02 instanceof h0) {
            h0 h0Var = (h0) m02;
            this.f30939h = j0(h0Var.r0());
            this.f30940i = l0(h0Var);
        } else {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
    }
}
