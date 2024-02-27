package m1;

import cm.g;
import cm.l;
import m1.z;

public final class p extends z {

    /* renamed from: e  reason: collision with root package name */
    public static final b f13706e = new b((g) null);

    public static final class a extends z.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(cls);
            l.f(cls, "workerClass");
        }

        /* renamed from: k */
        public p b() {
            if (!c() || !g().f15486j.h()) {
                return new p(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        /* renamed from: l */
        public a f() {
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final p a(Class cls) {
            l.f(cls, "workerClass");
            return (p) new a(cls).a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(a aVar) {
        super(aVar.d(), aVar.g(), aVar.e());
        l.f(aVar, "builder");
    }

    public static final p e(Class cls) {
        return f13706e.a(cls);
    }
}
