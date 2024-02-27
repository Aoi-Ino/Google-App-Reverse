package androidx.work;

import android.content.Context;
import androidx.work.c;
import androidx.work.impl.utils.futures.c;
import bm.p;
import cm.g;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import lm.a0;
import lm.d0;
import lm.e0;
import lm.f0;
import lm.k1;
import lm.q0;
import lm.s;
import m1.e;
import pl.q;
import pl.x;
import tl.d;

public abstract class CoroutineWorker extends c {

    /* renamed from: i  reason: collision with root package name */
    private final s f4044i = p1.b((k1) null, 1, (Object) null);

    /* renamed from: j  reason: collision with root package name */
    private final c f4045j;

    /* renamed from: k  reason: collision with root package name */
    private final a0 f4046k;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        Object f4047f;

        /* renamed from: g  reason: collision with root package name */
        int f4048g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m1.l f4049h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f4050i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m1.l lVar, CoroutineWorker coroutineWorker, d dVar) {
            super(2, dVar);
            this.f4049h = lVar;
            this.f4050i = coroutineWorker;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f4049h, this.f4050i, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            m1.l lVar;
            Object c10 = d.c();
            int i10 = this.f4048g;
            if (i10 == 0) {
                q.b(obj);
                m1.l lVar2 = this.f4049h;
                CoroutineWorker coroutineWorker = this.f4050i;
                this.f4047f = lVar2;
                this.f4048g = 1;
                Object t10 = coroutineWorker.t(this);
                if (t10 == c10) {
                    return c10;
                }
                lVar = lVar2;
                obj = t10;
            } else if (i10 == 1) {
                lVar = (m1.l) this.f4047f;
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar.c(obj);
            return x.f30437a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f4051f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f4052g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CoroutineWorker coroutineWorker, d dVar) {
            super(2, dVar);
            this.f4052g = coroutineWorker;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new b(this.f4052g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f4051f;
            if (i10 == 0) {
                q.b(obj);
                CoroutineWorker coroutineWorker = this.f4052g;
                this.f4051f = 1;
                obj = coroutineWorker.r(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                try {
                    q.b(obj);
                } catch (Throwable th2) {
                    this.f4052g.v().q(th2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f4052g.v().p((c.a) obj);
            return x.f30437a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        cm.l.f(context, "appContext");
        cm.l.f(workerParameters, "params");
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        cm.l.e(t10, "create()");
        this.f4045j = t10;
        t10.a(new e(this), h().b());
        this.f4046k = q0.a();
    }

    /* access modifiers changed from: private */
    public static final void q(CoroutineWorker coroutineWorker) {
        cm.l.f(coroutineWorker, "this$0");
        if (coroutineWorker.f4045j.isCancelled()) {
            k1.a.a(coroutineWorker.f4044i, (CancellationException) null, 1, (Object) null);
        }
    }

    static /* synthetic */ Object u(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public final x5.a d() {
        s b10 = p1.b((k1) null, 1, (Object) null);
        d0 a10 = e0.a(s().l(b10));
        m1.l lVar = new m1.l(b10, (androidx.work.impl.utils.futures.c) null, 2, (g) null);
        k1 unused = g.d(a10, (tl.g) null, (f0) null, new a(lVar, this, (d) null), 3, (Object) null);
        return lVar;
    }

    public final void l() {
        super.l();
        this.f4045j.cancel(false);
    }

    public final x5.a n() {
        k1 unused = g.d(e0.a(s().l(this.f4044i)), (tl.g) null, (f0) null, new b(this, (d) null), 3, (Object) null);
        return this.f4045j;
    }

    public abstract Object r(d dVar);

    public a0 s() {
        return this.f4046k;
    }

    public Object t(d dVar) {
        return u(this, dVar);
    }

    public final androidx.work.impl.utils.futures.c v() {
        return this.f4045j;
    }
}
