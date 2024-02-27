package o1;

import bm.p;
import kotlin.coroutines.jvm.internal.l;
import lm.a0;
import lm.d0;
import lm.e0;
import lm.f0;
import lm.k1;
import lm.s;
import m1.m;
import om.e;
import pl.q;
import pl.x;
import r1.u;
import tl.d;
import tl.g;

public abstract class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f14353a;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f14354f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f14355g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ u f14356h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f14357i;

        /* renamed from: o1.f$a$a  reason: collision with other inner class name */
        static final class C0195a implements e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f14358a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f14359b;

            C0195a(d dVar, u uVar) {
                this.f14358a = dVar;
                this.f14359b = uVar;
            }

            /* renamed from: a */
            public final Object c(b bVar, d dVar) {
                this.f14358a.b(this.f14359b, bVar);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, u uVar, d dVar, d dVar2) {
            super(2, dVar2);
            this.f14355g = eVar;
            this.f14356h = uVar;
            this.f14357i = dVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f14355g, this.f14356h, this.f14357i, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f14354f;
            if (i10 == 0) {
                q.b(obj);
                om.d b10 = this.f14355g.b(this.f14356h);
                C0195a aVar = new C0195a(this.f14357i, this.f14356h);
                this.f14354f = 1;
                if (b10.a(aVar, this) == c10) {
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

    static {
        String i10 = m.i("WorkConstraintsTracker");
        cm.l.e(i10, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f14353a = i10;
    }

    public static final k1 b(e eVar, u uVar, a0 a0Var, d dVar) {
        cm.l.f(eVar, "<this>");
        cm.l.f(uVar, "spec");
        cm.l.f(a0Var, "dispatcher");
        cm.l.f(dVar, "listener");
        s b10 = p1.b((k1) null, 1, (Object) null);
        k1 unused = g.d(e0.a(a0Var.l(b10)), (g) null, (f0) null, new a(eVar, uVar, dVar, (d) null), 3, (Object) null);
        return b10;
    }
}
