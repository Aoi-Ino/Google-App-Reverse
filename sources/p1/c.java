package p1;

import bm.p;
import cm.m;
import kotlin.coroutines.jvm.internal.l;
import nm.r;
import o1.b;
import om.f;
import pl.q;
import pl.x;
import q1.h;
import r1.u;
import tl.d;

public abstract class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f14598a;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f14599f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f14600g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f14601h;

        /* renamed from: p1.c$a$a  reason: collision with other inner class name */
        static final class C0198a extends m implements bm.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c f14602e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f14603f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0198a(c cVar, b bVar) {
                super(0);
                this.f14602e = cVar;
                this.f14603f = bVar;
            }

            public /* bridge */ /* synthetic */ Object a() {
                b();
                return x.f30437a;
            }

            public final void b() {
                this.f14602e.f14598a.f(this.f14603f);
            }
        }

        public static final class b implements o1.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f14604a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r f14605b;

            b(c cVar, r rVar) {
                this.f14604a = cVar;
                this.f14605b = rVar;
            }

            public void a(Object obj) {
                this.f14605b.q().k(this.f14604a.d(obj) ? new b.C0193b(this.f14604a.b()) : b.a.f14340a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, d dVar) {
            super(2, dVar);
            this.f14601h = cVar;
        }

        /* renamed from: b */
        public final Object h(r rVar, d dVar) {
            return ((a) create(rVar, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f14601h, dVar);
            aVar.f14600g = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f14599f;
            if (i10 == 0) {
                q.b(obj);
                r rVar = (r) this.f14600g;
                b bVar = new b(this.f14601h, rVar);
                this.f14601h.f14598a.c(bVar);
                C0198a aVar = new C0198a(this.f14601h, bVar);
                this.f14599f = 1;
                if (nm.p.a(rVar, aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.f30437a;
        }
    }

    public c(h hVar) {
        cm.l.f(hVar, "tracker");
        this.f14598a = hVar;
    }

    public abstract int b();

    public abstract boolean c(u uVar);

    public abstract boolean d(Object obj);

    public final boolean e(u uVar) {
        cm.l.f(uVar, "workSpec");
        return c(uVar) && d(this.f14598a.e());
    }

    public final om.d f() {
        return f.c(new a(this, (d) null));
    }
}
