package androidx.lifecycle;

import androidx.lifecycle.k;
import bm.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import lm.f0;
import lm.k1;
import lm.q0;
import pl.q;
import pl.x;
import tl.d;
import tl.g;

public final class m extends l implements o {

    /* renamed from: e  reason: collision with root package name */
    private final k f3309e;

    /* renamed from: f  reason: collision with root package name */
    private final g f3310f;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f3311f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f3312g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m f3313h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, d dVar) {
            super(2, dVar);
            this.f3313h = mVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f3313h, dVar);
            aVar.f3312g = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.f3311f == 0) {
                q.b(obj);
                d0 d0Var = (d0) this.f3312g;
                if (this.f3313h.i().b().compareTo(k.b.INITIALIZED) >= 0) {
                    this.f3313h.i().a(this.f3313h);
                } else {
                    p1.d(d0Var.h(), (CancellationException) null, 1, (Object) null);
                }
                return x.f30437a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m(k kVar, g gVar) {
        cm.l.f(kVar, "lifecycle");
        cm.l.f(gVar, "coroutineContext");
        this.f3309e = kVar;
        this.f3310f = gVar;
        if (i().b() == k.b.DESTROYED) {
            p1.d(h(), (CancellationException) null, 1, (Object) null);
        }
    }

    public void d(s sVar, k.a aVar) {
        cm.l.f(sVar, "source");
        cm.l.f(aVar, "event");
        if (i().b().compareTo(k.b.DESTROYED) <= 0) {
            i().d(this);
            p1.d(h(), (CancellationException) null, 1, (Object) null);
        }
    }

    public g h() {
        return this.f3310f;
    }

    public k i() {
        return this.f3309e;
    }

    public final void j() {
        k1 unused = g.d(this, q0.c().E0(), (f0) null, new a(this, (d) null), 2, (Object) null);
    }
}
