package a3;

public final class a implements s6.a {

    /* renamed from: a  reason: collision with root package name */
    public static final s6.a f116a = new a();

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    private static final class C0003a implements r6.d {

        /* renamed from: a  reason: collision with root package name */
        static final C0003a f117a = new C0003a();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f118b = r6.c.a("window").b(u6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final r6.c f119c = r6.c.a("logSourceMetrics").b(u6.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final r6.c f120d = r6.c.a("globalMetrics").b(u6.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final r6.c f121e = r6.c.a("appNamespace").b(u6.a.b().c(4).a()).a();

        private C0003a() {
        }

        /* renamed from: b */
        public void a(d3.a aVar, r6.e eVar) {
            eVar.e(f118b, aVar.d());
            eVar.e(f119c, aVar.c());
            eVar.e(f120d, aVar.b());
            eVar.e(f121e, aVar.a());
        }
    }

    private static final class b implements r6.d {

        /* renamed from: a  reason: collision with root package name */
        static final b f122a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f123b = r6.c.a("storageMetrics").b(u6.a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(d3.b bVar, r6.e eVar) {
            eVar.e(f123b, bVar.a());
        }
    }

    private static final class c implements r6.d {

        /* renamed from: a  reason: collision with root package name */
        static final c f124a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f125b = r6.c.a("eventsDroppedCount").b(u6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final r6.c f126c = r6.c.a("reason").b(u6.a.b().c(3).a()).a();

        private c() {
        }

        /* renamed from: b */
        public void a(d3.c cVar, r6.e eVar) {
            eVar.a(f125b, cVar.a());
            eVar.e(f126c, cVar.b());
        }
    }

    private static final class d implements r6.d {

        /* renamed from: a  reason: collision with root package name */
        static final d f127a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f128b = r6.c.a("logSource").b(u6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final r6.c f129c = r6.c.a("logEventDropped").b(u6.a.b().c(2).a()).a();

        private d() {
        }

        /* renamed from: b */
        public void a(d3.d dVar, r6.e eVar) {
            eVar.e(f128b, dVar.b());
            eVar.e(f129c, dVar.a());
        }
    }

    private static final class e implements r6.d {

        /* renamed from: a  reason: collision with root package name */
        static final e f130a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f131b = r6.c.d("clientMetrics");

        private e() {
        }

        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b((l) null, (r6.e) obj2);
        }

        public void b(l lVar, r6.e eVar) {
            throw null;
        }
    }

    private static final class f implements r6.d {

        /* renamed from: a  reason: collision with root package name */
        static final f f132a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f133b = r6.c.a("currentCacheSizeBytes").b(u6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final r6.c f134c = r6.c.a("maxCacheSizeBytes").b(u6.a.b().c(2).a()).a();

        private f() {
        }

        /* renamed from: b */
        public void a(d3.e eVar, r6.e eVar2) {
            eVar2.a(f133b, eVar.a());
            eVar2.a(f134c, eVar.b());
        }
    }

    private static final class g implements r6.d {

        /* renamed from: a  reason: collision with root package name */
        static final g f135a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f136b = r6.c.a("startMs").b(u6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final r6.c f137c = r6.c.a("endMs").b(u6.a.b().c(2).a()).a();

        private g() {
        }

        /* renamed from: b */
        public void a(d3.f fVar, r6.e eVar) {
            eVar.a(f136b, fVar.b());
            eVar.a(f137c, fVar.a());
        }
    }

    private a() {
    }

    public void a(s6.b bVar) {
        bVar.a(l.class, e.f130a);
        bVar.a(d3.a.class, C0003a.f117a);
        bVar.a(d3.f.class, g.f135a);
        bVar.a(d3.d.class, d.f127a);
        bVar.a(d3.c.class, c.f124a);
        bVar.a(d3.b.class, b.f122a);
        bVar.a(d3.e.class, f.f132a);
    }
}
