package e8;

import java.util.HashSet;
import java.util.Iterator;

public class y extends l0 {

    /* renamed from: n  reason: collision with root package name */
    private c2 f11076n;

    /* renamed from: o  reason: collision with root package name */
    private HashSet f11077o = new HashSet();

    /* renamed from: p  reason: collision with root package name */
    private b0 f11078p = new b0();

    /* renamed from: q  reason: collision with root package name */
    private b0 f11079q = new b0();

    /* renamed from: r  reason: collision with root package name */
    private int f11080r = 0;

    public y(c2 c2Var) {
        this.f11076n = c2Var;
    }

    public void v(x0 x0Var) {
        this.f11078p.m(x0Var);
    }

    public void w(HashSet hashSet) {
        this.f11077o.addAll(hashSet);
    }

    public boolean x() {
        if (this.f11078p.t() == 0) {
            return false;
        }
        r(c1.Z2, this.f11078p);
        int i10 = this.f11080r;
        if (i10 != 0) {
            r(c1.S8, new f1(i10));
        }
        if (this.f11079q.t() > 0) {
            r(c1.Z0, this.f11079q);
        }
        if (this.f11077o.isEmpty()) {
            return true;
        }
        l0 l0Var = new l0();
        Iterator it = this.f11077o.iterator();
        while (it.hasNext()) {
            t0.G(l0Var, (l0) ((a2) it.next()).i0());
        }
        r(c1.f10368n2, l0Var);
        r(c1.F1, new y1("/Helv 0 Tf 0 g "));
        l0 l0Var2 = (l0) l0Var.m(c1.f10473v3);
        if (l0Var2 != null) {
            this.f11076n.r(l0Var2);
        }
        return true;
    }
}
