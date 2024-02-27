package ep;

import dp.k;
import hp.g0;
import hp.t;
import java.util.ArrayList;
import java.util.List;

class b2 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private List f23127a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private k f23128b;

    private void d(g0 g0Var) {
        k kVar = this.f23128b;
        if (kVar != null) {
            g0Var.d(kVar.reference());
        }
    }

    private void e(g0 g0Var) {
        t e10 = g0Var.e();
        for (k kVar : this.f23127a) {
            e10.O(kVar.reference(), kVar.prefix());
        }
    }

    public void a(g0 g0Var) {
        b(g0Var, (a0) null);
    }

    public void b(g0 g0Var, a0 a0Var) {
        if (a0Var != null) {
            a0Var.a(g0Var);
        }
        e(g0Var);
        d(g0Var);
    }

    public void c(k kVar) {
        this.f23127a.add(kVar);
    }

    public void f(k kVar) {
        if (kVar != null) {
            c(kVar);
        }
        this.f23128b = kVar;
    }
}
