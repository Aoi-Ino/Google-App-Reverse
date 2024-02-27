package ep;

import java.util.List;

class i3 implements y {

    /* renamed from: a  reason: collision with root package name */
    private final List f23251a;

    /* renamed from: b  reason: collision with root package name */
    private final g3 f23252b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f23253c;

    public i3(g3 g3Var) {
        this.f23253c = g3Var.v();
        this.f23251a = g3Var.s();
        this.f23252b = g3Var;
    }

    private double b(double d10) {
        return d10 > 0.0d ? (((double) this.f23251a.size()) / 1000.0d) + (d10 / ((double) this.f23251a.size())) : d10 / ((double) this.f23251a.size());
    }

    private double c(z zVar) {
        double d10 = 0.0d;
        for (h2 h2Var : this.f23251a) {
            if (zVar.get(h2Var.getKey()) != null) {
                d10 += 1.0d;
            } else if (h2Var.e() || h2Var.c()) {
                return -1.0d;
            }
        }
        return b(d10);
    }

    private Object d(z zVar, int i10) {
        b4 remove = zVar.remove(((h2) this.f23251a.get(i10)).getKey());
        if (remove != null) {
            return remove.c();
        }
        return null;
    }

    public Object a(z zVar) {
        Object[] array = this.f23251a.toArray();
        for (int i10 = 0; i10 < this.f23251a.size(); i10++) {
            array[i10] = d(zVar, i10);
        }
        return this.f23252b.o(array);
    }

    public g3 f() {
        return this.f23252b;
    }

    public double g(z zVar) {
        g3 n10 = this.f23252b.n();
        for (Object next : zVar) {
            h2 r10 = n10.r(next);
            b4 b4Var = zVar.get(next);
            t q10 = b4Var.q();
            if (r10 != null && !n3.o(b4Var.c().getClass(), r10.getType())) {
                return -1.0d;
            }
            if (q10.e() && r10 == null) {
                return -1.0d;
            }
        }
        return c(zVar);
    }

    public String toString() {
        return this.f23252b.toString();
    }
}
