package om;

import bm.l;
import bm.p;
import cm.m;

abstract /* synthetic */ class i {

    /* renamed from: a  reason: collision with root package name */
    private static final l f30166a = b.f30169e;

    /* renamed from: b  reason: collision with root package name */
    private static final p f30167b = a.f30168e;

    static final class a extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        public static final a f30168e = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final Boolean h(Object obj, Object obj2) {
            return Boolean.valueOf(cm.l.a(obj, obj2));
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f30169e = new b();

        b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }

    public static final d a(d dVar) {
        return dVar instanceof t ? dVar : b(dVar, f30166a, f30167b);
    }

    private static final d b(d dVar, l lVar, p pVar) {
        if (dVar instanceof c) {
            c cVar = (c) dVar;
            if (cVar.f30152b == lVar && cVar.f30153c == pVar) {
                return dVar;
            }
        }
        return new c(dVar, lVar, pVar);
    }
}
