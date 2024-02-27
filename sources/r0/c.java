package r0;

import am.a;
import androidx.lifecycle.u0;
import bm.l;
import im.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List f15427a = new ArrayList();

    public final void a(b bVar, l lVar) {
        cm.l.f(bVar, "clazz");
        cm.l.f(lVar, "initializer");
        this.f15427a.add(new f(a.a(bVar), lVar));
    }

    public final u0.b b() {
        f[] fVarArr = (f[]) this.f15427a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
