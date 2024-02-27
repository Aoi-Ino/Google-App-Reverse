package ep;

import dp.m;
import hp.i;

class x1 {

    /* renamed from: a  reason: collision with root package name */
    private final x0 f23418a;

    /* renamed from: b  reason: collision with root package name */
    private final i f23419b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f23420c;

    public x1(x0 x0Var, d0 d0Var, n3 n3Var) {
        this.f23419b = n3Var.f();
        this.f23418a = x0Var;
        this.f23420c = d0Var;
    }

    private void b(w1 w1Var, m mVar) {
        String[] attributes = mVar.attributes();
        int length = attributes.length;
        int i10 = 0;
        while (i10 < length) {
            String str = attributes[i10];
            w0 a10 = this.f23418a.a(str);
            if (a10.g() || !a10.C()) {
                if (!a10.C()) {
                    w1Var.x(this.f23419b.c().a(str));
                } else {
                    e(w1Var, a10);
                }
                i10++;
            } else {
                throw new k2("Ordered attribute '%s' references an element in %s", a10, this.f23420c);
            }
        }
    }

    private void c(w1 w1Var, m mVar) {
        String[] elements = mVar.elements();
        int length = elements.length;
        int i10 = 0;
        while (i10 < length) {
            w0 a10 = this.f23418a.a(elements[i10]);
            if (!a10.g()) {
                g(w1Var, a10);
                i10++;
            } else {
                throw new k2("Ordered element '%s' references an attribute in %s", a10, this.f23420c);
            }
        }
    }

    private void d(w1 w1Var, w0 w0Var) {
        String first = w0Var.getFirst();
        if (first != null) {
            w1Var.x(first);
        }
    }

    private void e(w1 w1Var, w0 w0Var) {
        String prefix = w0Var.getPrefix();
        String first = w0Var.getFirst();
        int f10 = w0Var.f();
        if (w0Var.C()) {
            w1 k10 = w1Var.k(first, prefix, f10);
            w0 R = w0Var.R(1);
            if (k10 != null) {
                e(k10, R);
                return;
            }
            throw new k2("Element '%s' does not exist in %s", first, this.f23420c);
        }
        d(w1Var, w0Var);
    }

    private void f(w1 w1Var, w0 w0Var) {
        String prefix = w0Var.getPrefix();
        String first = w0Var.getFirst();
        int f10 = w0Var.f();
        if (f10 <= 1 || w1Var.D(first, f10 - 1) != null) {
            w1Var.k(first, prefix, f10);
            return;
        }
        throw new k2("Ordered element '%s' in path '%s' is out of sequence for %s", first, w0Var, this.f23420c);
    }

    private void g(w1 w1Var, w0 w0Var) {
        String prefix = w0Var.getPrefix();
        String first = w0Var.getFirst();
        int f10 = w0Var.f();
        if (first != null) {
            w1 k10 = w1Var.k(first, prefix, f10);
            w0 R = w0Var.R(1);
            if (w0Var.C()) {
                g(k10, R);
            }
        }
        f(w1Var, w0Var);
    }

    public void a(w1 w1Var, m mVar) {
        c(w1Var, mVar);
        b(w1Var, mVar);
    }
}
