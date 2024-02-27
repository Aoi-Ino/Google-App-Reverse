package y0;

import cm.l;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final u f18336a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f18337b;

    public m(u uVar) {
        l.f(uVar, "database");
        this.f18336a = uVar;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        l.e(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f18337b = newSetFromMap;
    }
}
