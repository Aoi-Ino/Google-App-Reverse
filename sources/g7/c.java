package g7;

import java.util.Iterator;
import java.util.Set;
import k6.d;
import k6.q;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f11715a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11716b;

    c(Set set, d dVar) {
        this.f11715a = e(set);
        this.f11716b = dVar;
    }

    public static k6.c c() {
        return k6.c.c(i.class).b(q.l(f.class)).e(new b()).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i d(d dVar) {
        return new c(dVar.c(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public String a() {
        if (this.f11716b.b().isEmpty()) {
            return this.f11715a;
        }
        return this.f11715a + ' ' + e(this.f11716b.b());
    }
}
