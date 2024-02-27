package k6;

import java.util.Set;
import y6.b;

public interface d {
    Object a(Class cls) {
        return b(d0.b(cls));
    }

    Object b(d0 d0Var) {
        b e10 = e(d0Var);
        if (e10 == null) {
            return null;
        }
        return e10.get();
    }

    Set c(Class cls) {
        return g(d0.b(cls));
    }

    b d(Class cls) {
        return e(d0.b(cls));
    }

    b e(d0 d0Var);

    b f(d0 d0Var);

    Set g(d0 d0Var) {
        return (Set) f(d0Var).get();
    }
}
