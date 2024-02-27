package ep;

import java.util.ArrayList;
import java.util.List;

class i implements h1 {

    /* renamed from: a  reason: collision with root package name */
    private final List f23235a;

    /* renamed from: b  reason: collision with root package name */
    private final j2 f23236b;

    /* renamed from: c  reason: collision with root package name */
    private final y f23237c;

    /* renamed from: d  reason: collision with root package name */
    private final d0 f23238d;

    public i(List list, y yVar, j2 j2Var, d0 d0Var) {
        this.f23235a = list;
        this.f23236b = j2Var;
        this.f23237c = yVar;
        this.f23238d = d0Var;
    }

    private y d(z zVar) {
        y yVar = this.f23237c;
        double d10 = 0.0d;
        for (y yVar2 : this.f23235a) {
            double g10 = yVar2.g(zVar);
            if (g10 > d10) {
                yVar = yVar2;
                d10 = g10;
            }
        }
        return yVar;
    }

    public Object a(z zVar) {
        y d10 = d(zVar);
        if (d10 != null) {
            return d10.a(zVar);
        }
        throw new n2("Constructor not matched for %s", this.f23238d);
    }

    public List b() {
        return new ArrayList(this.f23235a);
    }

    public boolean c() {
        return this.f23235a.size() <= 1 && this.f23237c != null;
    }

    public String toString() {
        return String.format("creator for %s", new Object[]{this.f23238d});
    }
}
