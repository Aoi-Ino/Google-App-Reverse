package lm;

import cm.l;

public abstract class q1 extends w implements r0, f1 {

    /* renamed from: h  reason: collision with root package name */
    public r1 f24993h;

    public void b() {
        y().w0(this);
    }

    public boolean c() {
        return true;
    }

    public w1 f() {
        return null;
    }

    public String toString() {
        return h0.a(this) + '@' + h0.b(this) + "[job@" + h0.b(y()) + ']';
    }

    public final r1 y() {
        r1 r1Var = this.f24993h;
        if (r1Var != null) {
            return r1Var;
        }
        l.v("job");
        return null;
    }

    public final void z(r1 r1Var) {
        this.f24993h = r1Var;
    }
}
