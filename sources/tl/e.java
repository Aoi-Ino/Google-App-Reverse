package tl;

import cm.l;
import tl.g;

public interface e extends g.b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f31680d = b.f31681e;

    public static final class a {
        public static g.b a(e eVar, g.c cVar) {
            l.f(cVar, "key");
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                g.b b10 = bVar.b(eVar);
                if (b10 instanceof g.b) {
                    return b10;
                }
                return null;
            } else if (e.f31680d != cVar) {
                return null;
            } else {
                l.d(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        public static g b(e eVar, g.c cVar) {
            l.f(cVar, "key");
            if (!(cVar instanceof b)) {
                return e.f31680d == cVar ? h.f31683e : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f31683e;
        }
    }

    public static final class b implements g.c {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ b f31681e = new b();

        private b() {
        }
    }

    d H(d dVar);

    void Y(d dVar);
}
