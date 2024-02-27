package ep;

import java.util.ArrayList;
import java.util.Iterator;

class a2 implements c3 {

    /* renamed from: e  reason: collision with root package name */
    private n1 f23110e;

    /* renamed from: f  reason: collision with root package name */
    private n1 f23111f;

    /* renamed from: g  reason: collision with root package name */
    private z1 f23112g;

    /* renamed from: h  reason: collision with root package name */
    private w1 f23113h;

    public a2(w1 w1Var) {
        this.f23113h = w1Var;
    }

    public c3 A(String str) {
        w1 T;
        y1 y1Var = (y1) U().get(str);
        if (y1Var == null || (T = y1Var.T()) == null) {
            return null;
        }
        return new a2(T);
    }

    public z1 U() {
        if (this.f23112g == null) {
            this.f23112g = this.f23113h.U();
        }
        return this.f23112g;
    }

    public String V(String str) {
        w0 d10 = this.f23113h.d();
        return d10 == null ? str : d10.e(str);
    }

    public String a(String str) {
        w0 d10 = this.f23113h.d();
        return d10 == null ? str : d10.a(str);
    }

    public n1 c() {
        if (this.f23110e == null) {
            this.f23110e = this.f23113h.c();
        }
        return this.f23110e;
    }

    public j1 e(String str) {
        return j().r(str);
    }

    public String getPrefix() {
        return this.f23113h.getPrefix();
    }

    public j1 getText() {
        return this.f23113h.getText();
    }

    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f23113h) {
            arrayList.add(add);
        }
        return arrayList.iterator();
    }

    public n1 j() {
        if (this.f23111f == null) {
            this.f23111f = this.f23113h.j();
        }
        return this.f23111f;
    }
}
