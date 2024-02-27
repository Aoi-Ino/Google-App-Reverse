package androidx.lifecycle;

import cm.l;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f3371a = new LinkedHashMap();

    public final void a() {
        for (t0 b10 : this.f3371a.values()) {
            b10.b();
        }
        this.f3371a.clear();
    }

    public final t0 b(String str) {
        l.f(str, "key");
        return (t0) this.f3371a.get(str);
    }

    public final Set c() {
        return new HashSet(this.f3371a.keySet());
    }

    public final void d(String str, t0 t0Var) {
        l.f(str, "key");
        l.f(t0Var, "viewModel");
        t0 t0Var2 = (t0) this.f3371a.put(str, t0Var);
        if (t0Var2 != null) {
            t0Var2.e();
        }
    }
}
