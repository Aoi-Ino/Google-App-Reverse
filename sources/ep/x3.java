package ep;

import java.util.ArrayList;
import java.util.Iterator;

class x3 implements w1 {

    /* renamed from: e  reason: collision with root package name */
    private w0 f23422e;

    /* renamed from: f  reason: collision with root package name */
    private n1 f23423f;

    /* renamed from: g  reason: collision with root package name */
    private n1 f23424g;

    /* renamed from: h  reason: collision with root package name */
    private z1 f23425h;

    /* renamed from: i  reason: collision with root package name */
    private a f23426i;

    /* renamed from: j  reason: collision with root package name */
    private p2 f23427j;

    /* renamed from: k  reason: collision with root package name */
    private d0 f23428k;

    /* renamed from: l  reason: collision with root package name */
    private String f23429l;

    /* renamed from: m  reason: collision with root package name */
    private String f23430m;

    /* renamed from: n  reason: collision with root package name */
    private j1 f23431n;

    /* renamed from: o  reason: collision with root package name */
    private j1 f23432o;

    /* renamed from: p  reason: collision with root package name */
    private int f23433p;

    private static class a extends ArrayList {
    }

    public x3(p2 p2Var, d0 d0Var) {
        this(p2Var, d0Var, (String) null, (String) null, 1);
    }

    private void B(Class cls) {
        Iterator it = this.f23424g.iterator();
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            if (j1Var != null) {
                y(j1Var);
            }
        }
        Iterator it2 = this.f23423f.iterator();
        while (it2.hasNext()) {
            j1 j1Var2 = (j1) it2.next();
            if (j1Var2 != null) {
                y(j1Var2);
            }
        }
        j1 j1Var3 = this.f23431n;
        if (j1Var3 != null) {
            y(j1Var3);
        }
    }

    private void E(Class cls) {
        Iterator it = this.f23425h.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((y1) it.next()).iterator();
            int i10 = 1;
            while (true) {
                if (it2.hasNext()) {
                    w1 w1Var = (w1) it2.next();
                    if (w1Var != null) {
                        String name = w1Var.getName();
                        int f10 = w1Var.f();
                        int i11 = i10 + 1;
                        if (f10 == i10) {
                            w1Var.L(cls);
                            i10 = i11;
                        } else {
                            throw new i0("Path section '%s[%s]' is out of sequence in %s", name, Integer.valueOf(f10), cls);
                        }
                    }
                }
            }
        }
    }

    private void F(Class cls) {
        if (this.f23431n == null) {
            return;
        }
        if (!this.f23424g.isEmpty()) {
            throw new t3("Text annotation %s used with elements in %s", this.f23431n, cls);
        } else if (K()) {
            throw new t3("Text annotation %s can not be used with paths in %s", this.f23431n, cls);
        }
    }

    private w1 l(String str, String str2, int i10) {
        x3 x3Var = new x3(this.f23427j, this.f23428k, str, str2, i10);
        if (str != null) {
            this.f23425h.r(str, x3Var);
            this.f23426i.add(str);
        }
        return x3Var;
    }

    private void s(Class cls) {
        for (String str : this.f23423f.keySet()) {
            if (((j1) this.f23423f.get(str)) != null) {
                w0 w0Var = this.f23422e;
                if (w0Var != null) {
                    w0Var.a(str);
                }
            } else {
                throw new c("Ordered attribute '%s' does not exist in %s", str, cls);
            }
        }
    }

    private void v(Class cls) {
        for (String str : this.f23424g.keySet()) {
            y1 y1Var = (y1) this.f23425h.get(str);
            j1 j1Var = (j1) this.f23424g.get(str);
            if (y1Var == null && j1Var == null) {
                throw new i0("Ordered element '%s' does not exist in %s", str, cls);
            } else if (y1Var == null || j1Var == null || y1Var.isEmpty()) {
                w0 w0Var = this.f23422e;
                if (w0Var != null) {
                    w0Var.e(str);
                }
            } else {
                throw new i0("Element '%s' is also a path name in %s", str, cls);
            }
        }
    }

    private void y(j1 j1Var) {
        w0 d10 = j1Var.d();
        w0 w0Var = this.f23422e;
        if (w0Var != null) {
            String b10 = w0Var.b();
            String b11 = d10.b();
            if (!b10.equals(b11)) {
                throw new k2("Path '%s' does not match '%s' in %s", b10, b11, this.f23428k);
            }
            return;
        }
        this.f23422e = d10;
    }

    public w1 D(String str, int i10) {
        return this.f23425h.D(str, i10);
    }

    public boolean G(String str) {
        return this.f23425h.containsKey(str);
    }

    public boolean J(String str) {
        return this.f23424g.containsKey(str);
    }

    public boolean K() {
        Iterator it = this.f23425h.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((y1) it.next()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    w1 w1Var = (w1) it2.next();
                    if (w1Var != null && !w1Var.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return !this.f23425h.isEmpty();
    }

    public void L(Class cls) {
        B(cls);
        s(cls);
        v(cls);
        E(cls);
        F(cls);
    }

    public boolean M(String str) {
        return this.f23423f.containsKey(str);
    }

    public z1 U() {
        return this.f23425h.U();
    }

    public n1 c() {
        return this.f23423f.v();
    }

    public w0 d() {
        return this.f23422e;
    }

    public int f() {
        return this.f23433p;
    }

    public String getName() {
        return this.f23429l;
    }

    public String getPrefix() {
        return this.f23430m;
    }

    public j1 getText() {
        j1 j1Var = this.f23432o;
        return j1Var != null ? j1Var : this.f23431n;
    }

    public boolean isEmpty() {
        if (this.f23431n == null && this.f23424g.isEmpty() && this.f23423f.isEmpty()) {
            return !K();
        }
        return false;
    }

    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23426i.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList.iterator();
    }

    public n1 j() {
        return this.f23424g.v();
    }

    public w1 k(String str, String str2, int i10) {
        w1 D = this.f23425h.D(str, i10);
        return D == null ? l(str, str2, i10) : D;
    }

    public void n(j1 j1Var) {
        String name = j1Var.getName();
        if (this.f23423f.get(name) == null) {
            this.f23423f.put(name, j1Var);
            return;
        }
        throw new c("Duplicate annotation of name '%s' on %s", name, j1Var);
    }

    public void o(j1 j1Var) {
        String name = j1Var.getName();
        if (this.f23424g.get(name) == null) {
            if (!this.f23426i.contains(name)) {
                this.f23426i.add(name);
            }
            if (j1Var.s()) {
                this.f23432o = j1Var;
            }
            this.f23424g.put(name, j1Var);
            return;
        }
        throw new i0("Duplicate annotation of name '%s' on %s", name, j1Var);
    }

    public w1 q(w0 w0Var) {
        w1 D = D(w0Var.getFirst(), w0Var.f());
        if (w0Var.C()) {
            w0 a02 = w0Var.a0(1, 0);
            if (D != null) {
                return D.q(a02);
            }
        }
        return D;
    }

    public void r(j1 j1Var) {
        if (this.f23431n == null) {
            this.f23431n = j1Var;
            return;
        }
        throw new t3("Duplicate text annotation on %s", j1Var);
    }

    public String toString() {
        return String.format("model '%s[%s]'", new Object[]{this.f23429l, Integer.valueOf(this.f23433p)});
    }

    public void w(j1 j1Var) {
        if (j1Var.g()) {
            n(j1Var);
        } else if (j1Var.h()) {
            r(j1Var);
        } else {
            o(j1Var);
        }
    }

    public void x(String str) {
        this.f23423f.put(str, (Object) null);
    }

    public x3(p2 p2Var, d0 d0Var, String str, String str2, int i10) {
        this.f23423f = new n1(p2Var);
        this.f23424g = new n1(p2Var);
        this.f23425h = new z1(d0Var);
        this.f23426i = new a();
        this.f23428k = d0Var;
        this.f23427j = p2Var;
        this.f23430m = str2;
        this.f23433p = i10;
        this.f23429l = str;
    }
}
