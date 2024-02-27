package qm;

import java.util.List;
import lm.v1;
import pl.d;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f30868a = false;

    private static final y a(Throwable th2, String str) {
        if (f30868a) {
            return new y(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new d();
    }

    static /* synthetic */ y b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(v1 v1Var) {
        return v1Var.E0() instanceof y;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final v1 e(v vVar, List list) {
        try {
            return vVar.b(list);
        } catch (Throwable th2) {
            return a(th2, vVar.a());
        }
    }
}
