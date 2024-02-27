package ep;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

class s {

    /* renamed from: a  reason: collision with root package name */
    private List f23393a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private j2 f23394b = new j2();

    /* renamed from: c  reason: collision with root package name */
    private g3 f23395c;

    /* renamed from: d  reason: collision with root package name */
    private n3 f23396d;

    public s(d0 d0Var, n3 n3Var) {
        this.f23396d = n3Var;
        d(d0Var);
    }

    private void d(d0 d0Var) {
        Constructor[] h10 = d0Var.h();
        if (d0Var.l()) {
            for (Constructor constructor : h10) {
                if (!d0Var.c()) {
                    e(constructor);
                }
            }
            return;
        }
        throw new r("Can not construct inner %s", d0Var);
    }

    private void e(Constructor constructor) {
        j3 j3Var = new j3(constructor, this.f23394b, this.f23396d);
        if (j3Var.d()) {
            for (g3 g3Var : j3Var.c()) {
                if (g3Var.size() == 0) {
                    this.f23395c = g3Var;
                }
                this.f23393a.add(g3Var);
            }
        }
    }

    public j2 a() {
        return this.f23394b;
    }

    public g3 b() {
        return this.f23395c;
    }

    public List c() {
        return new ArrayList(this.f23393a);
    }
}
