package qm;

import androidx.concurrent.futures.b;
import cm.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import lm.a0;
import lm.f2;
import lm.h0;
import lm.k;
import lm.o0;
import lm.u0;
import lm.v;
import lm.y;
import pl.x;
import tl.d;
import tl.g;

public final class j extends o0 implements e, d {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30820l = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: h  reason: collision with root package name */
    public final a0 f30821h;

    /* renamed from: i  reason: collision with root package name */
    public final d f30822i;

    /* renamed from: j  reason: collision with root package name */
    public Object f30823j = k.f30826a;

    /* renamed from: k  reason: collision with root package name */
    public final Object f30824k = l0.b(getContext());

    public j(a0 a0Var, d dVar) {
        super(-1);
        this.f30821h = a0Var;
        this.f30822i = dVar;
    }

    private final k l() {
        Object obj = f30820l.get(this);
        if (obj instanceof k) {
            return (k) obj;
        }
        return null;
    }

    public void b(Object obj, Throwable th2) {
        if (obj instanceof v) {
            ((v) obj).f25029b.invoke(th2);
        }
    }

    public d c() {
        return this;
    }

    public Object g() {
        Object obj = this.f30823j;
        this.f30823j = k.f30826a;
        return obj;
    }

    public e getCallerFrame() {
        d dVar = this.f30822i;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f30822i.getContext();
    }

    public final void h() {
        do {
        } while (f30820l.get(this) == k.f30827b);
    }

    public final k j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30820l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f30820l.set(this, k.f30827b);
                return null;
            } else if (obj instanceof k) {
                if (b.a(f30820l, this, obj, k.f30827b)) {
                    return (k) obj;
                }
            } else if (obj != k.f30827b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void k(g gVar, Object obj) {
        this.f30823j = obj;
        this.f24987g = 1;
        this.f30821h.B0(gVar, this);
    }

    public final boolean m() {
        return f30820l.get(this) != null;
    }

    public final boolean n(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30820l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0 h0Var = k.f30827b;
            if (l.a(obj, h0Var)) {
                if (b.a(f30820l, this, h0Var, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (b.a(f30820l, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        h();
        k l10 = l();
        if (l10 != null) {
            l10.o();
        }
    }

    public final Throwable p(lm.j jVar) {
        h0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30820l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0Var = k.f30827b;
            if (obj != h0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (b.a(f30820l, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!b.a(f30820l, this, h0Var, jVar));
        return null;
    }

    public void resumeWith(Object obj) {
        g context;
        Object c10;
        g context2 = this.f30822i.getContext();
        Object d10 = y.d(obj, (bm.l) null, 1, (Object) null);
        if (this.f30821h.C0(context2)) {
            this.f30823j = d10;
            this.f24987g = 0;
            this.f30821h.A0(context2, this);
            return;
        }
        u0 a10 = f2.f24958a.a();
        if (a10.K0()) {
            this.f30823j = d10;
            this.f24987g = 0;
            a10.G0(this);
            return;
        }
        a10.I0(true);
        try {
            context = getContext();
            c10 = l0.c(context, this.f30824k);
            this.f30822i.resumeWith(obj);
            x xVar = x.f30437a;
            l0.a(context, c10);
            do {
            } while (a10.M0());
        } catch (Throwable th2) {
            a10.E0(true);
            throw th2;
        }
        a10.E0(true);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f30821h + ", " + h0.c(this.f30822i) + ']';
    }
}
