package r0;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final f[] f15426b;

    public b(f... fVarArr) {
        l.f(fVarArr, "initializers");
        this.f15426b = fVarArr;
    }

    public t0 b(Class cls, a aVar) {
        l.f(cls, "modelClass");
        l.f(aVar, "extras");
        t0 t0Var = null;
        for (f fVar : this.f15426b) {
            if (l.a(fVar.a(), cls)) {
                Object invoke = fVar.b().invoke(aVar);
                t0Var = invoke instanceof t0 ? (t0) invoke : null;
            }
        }
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
