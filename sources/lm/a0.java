package lm;

import bm.l;
import cm.g;
import cm.m;
import qm.j;
import qm.o;
import qm.p;
import tl.b;
import tl.d;
import tl.e;
import tl.g;

public abstract class a0 extends tl.a implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f24940f = new a((g) null);

    public static final class a extends b {

        /* renamed from: lm.a0$a$a  reason: collision with other inner class name */
        static final class C0318a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0318a f24941e = new C0318a();

            C0318a() {
                super(1);
            }

            /* renamed from: b */
            public final a0 invoke(g.b bVar) {
                if (bVar instanceof a0) {
                    return (a0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(e.f31680d, C0318a.f24941e);
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    public a0() {
        super(e.f31680d);
    }

    public abstract void A0(tl.g gVar, Runnable runnable);

    public void B0(tl.g gVar, Runnable runnable) {
        A0(gVar, runnable);
    }

    public boolean C0(tl.g gVar) {
        return true;
    }

    public a0 D0(int i10) {
        p.a(i10);
        return new o(this, i10);
    }

    public final d H(d dVar) {
        return new j(this, dVar);
    }

    public final void Y(d dVar) {
        cm.l.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((j) dVar).o();
    }

    public g.b f(g.c cVar) {
        return e.a.a(this, cVar);
    }

    public tl.g g(g.c cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return h0.a(this) + '@' + h0.b(this);
    }
}
