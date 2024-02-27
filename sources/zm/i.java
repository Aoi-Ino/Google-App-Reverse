package zm;

import cm.l;
import java.util.LinkedHashSet;
import java.util.Set;
import um.f0;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Set f33310a = new LinkedHashSet();

    public final synchronized void a(f0 f0Var) {
        l.f(f0Var, "route");
        this.f33310a.remove(f0Var);
    }

    public final synchronized void b(f0 f0Var) {
        l.f(f0Var, "failedRoute");
        this.f33310a.add(f0Var);
    }

    public final synchronized boolean c(f0 f0Var) {
        l.f(f0Var, "route");
        return this.f33310a.contains(f0Var);
    }
}
