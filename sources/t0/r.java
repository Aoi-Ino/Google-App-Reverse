package t0;

import android.os.Bundle;
import cm.l;
import java.util.Iterator;
import java.util.List;
import t0.b0;

@b0.b("navigation")
public class r extends b0 {

    /* renamed from: c  reason: collision with root package name */
    private final c0 f16449c;

    public r(c0 c0Var) {
        l.f(c0Var, "navigatorProvider");
        this.f16449c = c0Var;
    }

    private final void m(h hVar, v vVar, b0.a aVar) {
        p e10 = hVar.e();
        l.d(e10, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        q qVar = (q) e10;
        Bundle c10 = hVar.c();
        int x02 = qVar.x0();
        String y02 = qVar.y0();
        if (x02 == 0 && y02 == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + qVar.F()).toString());
        }
        p u02 = y02 != null ? qVar.u0(y02, false) : qVar.s0(x02, false);
        if (u02 != null) {
            this.f16449c.d(u02.T()).e(p.d(b().a(u02, u02.s(c10))), vVar, aVar);
            return;
        }
        String w02 = qVar.w0();
        throw new IllegalArgumentException("navigation destination " + w02 + " is not a direct child of this NavGraph");
    }

    public void e(List list, v vVar, b0.a aVar) {
        l.f(list, "entries");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m((h) it.next(), vVar, aVar);
        }
    }

    /* renamed from: l */
    public q a() {
        return new q(this);
    }
}
