package com.google.firebase.messaging;

import r6.d;
import r6.e;

public final class a implements s6.a {

    /* renamed from: a  reason: collision with root package name */
    public static final s6.a f7422a = new a();

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    private static final class C0109a implements d {

        /* renamed from: a  reason: collision with root package name */
        static final C0109a f7423a = new C0109a();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f7424b = r6.c.a("projectNumber").b(u6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final r6.c f7425c = r6.c.a("messageId").b(u6.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final r6.c f7426d = r6.c.a("instanceId").b(u6.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final r6.c f7427e = r6.c.a("messageType").b(u6.a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final r6.c f7428f = r6.c.a("sdkPlatform").b(u6.a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final r6.c f7429g = r6.c.a("packageName").b(u6.a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final r6.c f7430h = r6.c.a("collapseKey").b(u6.a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final r6.c f7431i = r6.c.a("priority").b(u6.a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final r6.c f7432j = r6.c.a("ttl").b(u6.a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final r6.c f7433k = r6.c.a("topic").b(u6.a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final r6.c f7434l = r6.c.a("bulkId").b(u6.a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final r6.c f7435m = r6.c.a("event").b(u6.a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final r6.c f7436n = r6.c.a("analyticsLabel").b(u6.a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final r6.c f7437o = r6.c.a("campaignId").b(u6.a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final r6.c f7438p = r6.c.a("composerLabel").b(u6.a.b().c(15).a()).a();

        private C0109a() {
        }

        /* renamed from: b */
        public void a(e7.a aVar, e eVar) {
            eVar.a(f7424b, aVar.l());
            eVar.e(f7425c, aVar.h());
            eVar.e(f7426d, aVar.g());
            eVar.e(f7427e, aVar.i());
            eVar.e(f7428f, aVar.m());
            eVar.e(f7429g, aVar.j());
            eVar.e(f7430h, aVar.d());
            eVar.b(f7431i, aVar.k());
            eVar.b(f7432j, aVar.o());
            eVar.e(f7433k, aVar.n());
            eVar.a(f7434l, aVar.b());
            eVar.e(f7435m, aVar.f());
            eVar.e(f7436n, aVar.a());
            eVar.a(f7437o, aVar.c());
            eVar.e(f7438p, aVar.e());
        }
    }

    private static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        static final b f7439a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f7440b = r6.c.a("messagingClientEvent").b(u6.a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(e7.b bVar, e eVar) {
            eVar.e(f7440b, bVar.a());
        }
    }

    private static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        static final c f7441a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final r6.c f7442b = r6.c.d("messagingClientEventExtension");

        private c() {
        }

        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b((h0) null, (e) obj2);
        }

        public void b(h0 h0Var, e eVar) {
            throw null;
        }
    }

    private a() {
    }

    public void a(s6.b bVar) {
        bVar.a(h0.class, c.f7441a);
        bVar.a(e7.b.class, b.f7439a);
        bVar.a(e7.a.class, C0109a.f7423a);
    }
}
