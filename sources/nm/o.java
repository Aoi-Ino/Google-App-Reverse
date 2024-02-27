package nm;

import bm.l;
import cm.v;
import lm.j2;
import nm.h;
import pl.x;
import qm.h0;
import qm.q0;
import qm.z;
import tl.d;

public class o extends b {

    /* renamed from: q  reason: collision with root package name */
    private final int f29962q;

    /* renamed from: r  reason: collision with root package name */
    private final a f29963r;

    public o(int i10, a aVar, l lVar) {
        super(i10, lVar);
        this.f29962q = i10;
        this.f29963r = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + v.b(b.class).a() + " instead").toString());
        } else if (i10 < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
    }

    static /* synthetic */ Object J0(o oVar, Object obj, d dVar) {
        q0 d10;
        Object M0 = oVar.M0(obj, true);
        if (!(M0 instanceof h.a)) {
            return x.f30437a;
        }
        h.e(M0);
        l lVar = oVar.f29914f;
        if (lVar == null || (d10 = z.d(lVar, obj, (q0) null, 2, (Object) null)) == null) {
            throw oVar.P();
        }
        b.a(d10, oVar.P());
        throw d10;
    }

    private final Object K0(Object obj, boolean z10) {
        l lVar;
        q0 d10;
        Object k10 = super.k(obj);
        if (h.i(k10) || h.h(k10)) {
            return k10;
        }
        if (!z10 || (lVar = this.f29914f) == null || (d10 = z.d(lVar, obj, (q0) null, 2, (Object) null)) == null) {
            return h.f29956b.c(x.f30437a);
        }
        throw d10;
    }

    private final Object L0(Object obj) {
        j jVar;
        h0 h0Var = c.f29935d;
        j jVar2 = (j) b.f29908l.get(this);
        while (true) {
            long andIncrement = b.f29904h.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean o10 = Z(andIncrement);
            int i10 = c.f29933b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (jVar2.f30812g != j11) {
                j f10 = K(j11, jVar2);
                if (f10 != null) {
                    jVar = f10;
                } else if (o10) {
                    return h.f29956b.a(P());
                }
            } else {
                jVar = jVar2;
            }
            int x10 = E0(jVar, i11, obj, j10, h0Var, o10);
            if (x10 == 0) {
                jVar.b();
                return h.f29956b.c(x.f30437a);
            } else if (x10 == 1) {
                return h.f29956b.c(x.f30437a);
            } else {
                if (x10 != 2) {
                    if (x10 == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (x10 != 4) {
                        if (x10 == 5) {
                            jVar.b();
                        }
                        jVar2 = jVar;
                    } else {
                        if (j10 < O()) {
                            jVar.b();
                        }
                        return h.f29956b.a(P());
                    }
                } else if (o10) {
                    jVar.p();
                    return h.f29956b.a(P());
                } else {
                    j2 j2Var = h0Var instanceof j2 ? (j2) h0Var : null;
                    if (j2Var != null) {
                        o0(j2Var, jVar, i11);
                    }
                    G((jVar.f30812g * ((long) i10)) + ((long) i11));
                    return h.f29956b.c(x.f30437a);
                }
            }
        }
    }

    private final Object M0(Object obj, boolean z10) {
        return this.f29963r == a.DROP_LATEST ? K0(obj, z10) : L0(obj);
    }

    /* access modifiers changed from: protected */
    public boolean a0() {
        return this.f29963r == a.DROP_OLDEST;
    }

    public Object k(Object obj) {
        return M0(obj, false);
    }

    public Object m(Object obj, d dVar) {
        return J0(this, obj, dVar);
    }
}
