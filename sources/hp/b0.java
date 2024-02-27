package hp;

import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f24215a;

    /* renamed from: b  reason: collision with root package name */
    private final j f24216b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f24217c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f24218d;

    public b0(Writer writer, i iVar) {
        this(writer, iVar, false);
    }

    private void c(g0 g0Var) {
        y<String> c10 = g0Var.c();
        for (String str : c10) {
            g0 g0Var2 = (g0) c10.i(str);
            this.f24216b.n(str, g0Var2.getValue(), g0Var2.h(this.f24218d));
        }
        this.f24217c.remove(g0Var);
    }

    private void d(g0 g0Var) {
        String f10 = g0Var.f();
        if (f10 != null) {
            this.f24216b.o(f10);
        }
    }

    private void f(g0 g0Var) {
        String name = g0Var.getName();
        String h10 = g0Var.h(this.f24218d);
        if (g0Var.getValue() != null) {
            l(g0Var);
        }
        if (name != null) {
            this.f24216b.p(name, h10);
            this.f24216b.g();
        }
    }

    private void g(g0 g0Var) {
        String h10 = g0Var.h(this.f24218d);
        String name = g0Var.getName();
        if (name != null) {
            this.f24216b.s(name, h10);
        }
    }

    private void h(g0 g0Var) {
        t<String> e10 = g0Var.e();
        for (String str : e10) {
            this.f24216b.q(str, e10.Z(str));
        }
    }

    private g0 j(g0 g0Var, String str) {
        f0 f0Var = new f0(g0Var, this, str);
        if (str != null) {
            return this.f24215a.T(f0Var);
        }
        throw new w("Can not have a null name");
    }

    private void k(g0 g0Var) {
        d(g0Var);
        g(g0Var);
        c(g0Var);
        h(g0Var);
    }

    private void l(g0 g0Var) {
        s m10 = g0Var.m();
        String value = g0Var.getValue();
        if (value != null) {
            Iterator it = this.f24215a.iterator();
            while (it.hasNext()) {
                g0 g0Var2 = (g0) it.next();
                if (m10 != s.INHERIT) {
                    break;
                }
                m10 = g0Var2.m();
            }
            this.f24216b.t(value, m10);
        }
        g0Var.i((String) null);
    }

    public void a(g0 g0Var) {
        if (this.f24215a.contains(g0Var)) {
            g0 Y = this.f24215a.Y();
            if (!b(Y)) {
                k(Y);
            }
            while (this.f24215a.Y() != g0Var) {
                f(this.f24215a.v());
            }
            f(g0Var);
            this.f24215a.v();
        }
    }

    public boolean b(g0 g0Var) {
        return !this.f24217c.contains(g0Var);
    }

    public g0 e(g0 g0Var, String str) {
        if (this.f24215a.isEmpty()) {
            return j(g0Var, str);
        }
        if (!this.f24215a.contains(g0Var)) {
            return null;
        }
        g0 Y = this.f24215a.Y();
        if (!b(Y)) {
            k(Y);
        }
        while (this.f24215a.Y() != g0Var) {
            f(this.f24215a.v());
        }
        if (!this.f24215a.isEmpty()) {
            l(g0Var);
        }
        return j(g0Var, str);
    }

    public g0 i() {
        e0 e0Var = new e0(this, this.f24215a);
        if (this.f24215a.isEmpty()) {
            this.f24216b.r();
        }
        return e0Var;
    }

    private b0(Writer writer, i iVar, boolean z10) {
        this.f24216b = new j(writer, iVar);
        HashSet hashSet = new HashSet();
        this.f24217c = hashSet;
        this.f24215a = new i0(hashSet);
        this.f24218d = z10;
    }
}
