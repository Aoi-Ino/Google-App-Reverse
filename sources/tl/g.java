package tl;

import bm.p;
import cm.l;
import cm.m;
import tl.e;

public interface g {

    public static final class a {

        /* renamed from: tl.g$a$a  reason: collision with other inner class name */
        static final class C0357a extends m implements p {

            /* renamed from: e  reason: collision with root package name */
            public static final C0357a f31682e = new C0357a();

            C0357a() {
                super(2);
            }

            /* renamed from: b */
            public final g h(g gVar, b bVar) {
                c cVar;
                l.f(gVar, "acc");
                l.f(bVar, "element");
                g g10 = gVar.g(bVar.getKey());
                h hVar = h.f31683e;
                if (g10 == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f31680d;
                e eVar = (e) g10.f(bVar2);
                if (eVar == null) {
                    cVar = new c(g10, bVar);
                } else {
                    g g11 = g10.g(bVar2);
                    if (g11 == hVar) {
                        return new c(bVar, eVar);
                    }
                    cVar = new c(new c(g11, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            l.f(gVar2, "context");
            return gVar2 == h.f31683e ? gVar : (g) gVar2.X(gVar, C0357a.f31682e);
        }
    }

    public interface b extends g {

        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                l.f(pVar, "operation");
                return pVar.h(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                l.f(cVar, "key");
                if (!l.a(bVar.getKey(), cVar)) {
                    return null;
                }
                l.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c cVar) {
                l.f(cVar, "key");
                return l.a(bVar.getKey(), cVar) ? h.f31683e : bVar;
            }

            public static g d(b bVar, g gVar) {
                l.f(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        b f(c cVar);

        c getKey();
    }

    public interface c {
    }

    Object X(Object obj, p pVar);

    b f(c cVar);

    g g(c cVar);

    g l(g gVar);
}
