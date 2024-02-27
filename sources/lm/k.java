package lm;

import androidx.concurrent.futures.b;
import cm.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import lm.k1;
import qm.e0;
import qm.h0;
import qm.j;
import tl.d;
import tl.g;

public class k extends o0 implements j, e, j2 {

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24972j;

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24973k;

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24974l;
    private volatile int _decisionAndIndex = 536870911;
    private volatile Object _parentHandle;
    private volatile Object _state = d.f24948e;

    /* renamed from: h  reason: collision with root package name */
    private final d f24975h;

    /* renamed from: i  reason: collision with root package name */
    private final g f24976i;

    static {
        Class<k> cls = k.class;
        f24972j = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        f24973k = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f24974l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public k(d dVar, int i10) {
        super(i10);
        this.f24975h = dVar;
        this.f24976i = dVar.getContext();
    }

    private final void A(Object obj) {
        Object obj2 = obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24973k;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof d) {
                if (b.a(f24973k, this, obj3, obj2)) {
                    return;
                }
            } else if (!(obj3 instanceof h) && !(obj3 instanceof e0)) {
                boolean z10 = obj3 instanceof u;
                if (z10) {
                    u uVar = (u) obj3;
                    if (!uVar.b()) {
                        E(obj2, obj3);
                    }
                    if (obj3 instanceof n) {
                        Throwable th2 = null;
                        if (!z10) {
                            uVar = null;
                        }
                        if (uVar != null) {
                            th2 = uVar.f25023a;
                        }
                        if (obj2 instanceof h) {
                            j((h) obj2, th2);
                            return;
                        }
                        l.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((e0) obj2, th2);
                        return;
                    }
                    return;
                } else if (obj3 instanceof t) {
                    t tVar = (t) obj3;
                    if (tVar.f25016b != null) {
                        E(obj2, obj3);
                    }
                    if (!(obj2 instanceof e0)) {
                        l.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        h hVar = (h) obj2;
                        if (tVar.c()) {
                            j(hVar, tVar.f25019e);
                            return;
                        }
                        if (b.a(f24973k, this, obj3, t.b(tVar, (Object) null, hVar, (bm.l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(obj2 instanceof e0)) {
                    l.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (b.a(f24973k, this, obj3, new t(obj3, (h) obj2, (bm.l) null, (Object) null, (Throwable) null, 28, (cm.g) null))) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                E(obj2, obj3);
            }
        }
    }

    private final boolean C() {
        if (p0.c(this.f24987g)) {
            d dVar = this.f24975h;
            l.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((j) dVar).m()) {
                return true;
            }
        }
        return false;
    }

    private final h D(bm.l lVar) {
        return lVar instanceof h ? (h) lVar : new h1(lVar);
    }

    private final void E(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void K(Object obj, int i10, bm.l lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24973k;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
            } else {
                if (obj2 instanceof n) {
                    n nVar = (n) obj2;
                    if (nVar.c()) {
                        if (lVar != null) {
                            k(lVar, nVar.f25023a);
                            return;
                        }
                        return;
                    }
                }
                h(obj);
                throw new pl.d();
            }
        } while (!b.a(f24973k, this, obj2, M((y1) obj2, obj, i10, lVar, (Object) null)));
        p();
        q(i10);
    }

    static /* synthetic */ void L(k kVar, Object obj, int i10, bm.l lVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            kVar.K(obj, i10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object M(y1 y1Var, Object obj, int i10, bm.l lVar, Object obj2) {
        if (obj instanceof u) {
            return obj;
        }
        if (!p0.b(i10) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(y1Var instanceof h) && obj2 == null) {
            return obj;
        }
        return new t(obj, y1Var instanceof h ? (h) y1Var : null, lVar, obj2, (Throwable) null, 16, (cm.g) null);
    }

    private final boolean N() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24972j;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f24972j.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final h0 O(Object obj, Object obj2, bm.l lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24973k;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof y1) {
            } else if (!(obj3 instanceof t) || obj2 == null || ((t) obj3).f25018d != obj2) {
                return null;
            } else {
                return l.f24981a;
            }
        } while (!b.a(f24973k, this, obj3, M((y1) obj3, obj, this.f24987g, lVar, obj2)));
        p();
        return l.f24981a;
    }

    private final boolean P() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24972j;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f24972j.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void h(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void l(e0 e0Var, Throwable th2) {
        int i10 = f24972j.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                e0Var.o(i10, th2, getContext());
            } catch (Throwable th3) {
                g context = getContext();
                c0.a(context, new x("Exception in invokeOnCancellation handler for " + this, th3));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    private final boolean n(Throwable th2) {
        if (!C()) {
            return false;
        }
        d dVar = this.f24975h;
        l.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((j) dVar).n(th2);
    }

    private final void p() {
        if (!C()) {
            o();
        }
    }

    private final void q(int i10) {
        if (!N()) {
            p0.a(this, i10);
        }
    }

    private final r0 u() {
        return (r0) f24974l.get(this);
    }

    private final String x() {
        Object w10 = w();
        if (w10 instanceof y1) {
            return "Active";
        }
        return w10 instanceof n ? "Cancelled" : "Completed";
    }

    private final r0 z() {
        k1 k1Var = (k1) getContext().f(k1.f24977b);
        if (k1Var == null) {
            return null;
        }
        r0 d10 = k1.a.d(k1Var, true, false, new o(this), 2, (Object) null);
        b.a(f24974l, this, (Object) null, d10);
        return d10;
    }

    public boolean B() {
        return !(w() instanceof y1);
    }

    /* access modifiers changed from: protected */
    public String F() {
        return "CancellableContinuation";
    }

    public final void G(Throwable th2) {
        if (!n(th2)) {
            m(th2);
            p();
        }
    }

    public final void H() {
        Throwable p10;
        d dVar = this.f24975h;
        j jVar = dVar instanceof j ? (j) dVar : null;
        if (jVar != null && (p10 = jVar.p(this)) != null) {
            o();
            m(p10);
        }
    }

    public final boolean I() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24973k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (!(obj instanceof t) || ((t) obj).f25018d == null) {
            f24972j.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, d.f24948e);
            return true;
        }
        o();
        return false;
    }

    public void J(Object obj, bm.l lVar) {
        K(obj, this.f24987g, lVar);
    }

    public void a(e0 e0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24972j;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        A(e0Var);
    }

    public void b(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24973k;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof u)) {
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (!tVar.c()) {
                        Throwable th3 = th2;
                        if (b.a(f24973k, this, obj2, t.b(tVar, (Object) null, (h) null, (bm.l) null, (Object) null, th2, 15, (Object) null))) {
                            tVar.d(this, th3);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    Throwable th4 = th2;
                    if (b.a(f24973k, this, obj2, new t(obj2, (h) null, (bm.l) null, (Object) null, th2, 14, (cm.g) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final d c() {
        return this.f24975h;
    }

    public Throwable d(Object obj) {
        Throwable d10 = super.d(obj);
        if (d10 != null) {
            return d10;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj instanceof t ? ((t) obj).f25015a : obj;
    }

    public Object g() {
        return w();
    }

    public e getCallerFrame() {
        d dVar = this.f24975h;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f24976i;
    }

    public void i(bm.l lVar) {
        A(D(lVar));
    }

    public final void j(h hVar, Throwable th2) {
        try {
            hVar.b(th2);
        } catch (Throwable th3) {
            g context = getContext();
            c0.a(context, new x("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void k(bm.l lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            g context = getContext();
            c0.a(context, new x("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public boolean m(Throwable th2) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24973k;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof y1)) {
                return false;
            }
            if ((obj instanceof h) || (obj instanceof e0)) {
                z10 = true;
            }
        } while (!b.a(f24973k, this, obj, new n(this, th2, z10)));
        y1 y1Var = (y1) obj;
        if (y1Var instanceof h) {
            j((h) obj, th2);
        } else if (y1Var instanceof e0) {
            l((e0) obj, th2);
        }
        p();
        q(this.f24987g);
        return true;
    }

    public final void o() {
        r0 u10 = u();
        if (u10 != null) {
            u10.b();
            f24974l.set(this, x1.f25033e);
        }
    }

    public void r(Object obj) {
        q(this.f24987g);
    }

    public void resumeWith(Object obj) {
        L(this, y.c(obj, this), this.f24987g, (bm.l) null, 4, (Object) null);
    }

    public Throwable s(k1 k1Var) {
        return k1Var.c0();
    }

    public Object t(Object obj, Object obj2, bm.l lVar) {
        return O(obj, obj2, lVar);
    }

    public String toString() {
        return F() + '(' + h0.c(this.f24975h) + "){" + x() + "}@" + h0.b(this);
    }

    public final Object v() {
        k1 k1Var;
        boolean C = C();
        if (P()) {
            if (u() == null) {
                z();
            }
            if (C) {
                H();
            }
            return d.c();
        }
        if (C) {
            H();
        }
        Object w10 = w();
        if (w10 instanceof u) {
            throw ((u) w10).f25023a;
        } else if (!p0.b(this.f24987g) || (k1Var = (k1) getContext().f(k1.f24977b)) == null || k1Var.c()) {
            return e(w10);
        } else {
            CancellationException c02 = k1Var.c0();
            b(w10, c02);
            throw c02;
        }
    }

    public final Object w() {
        return f24973k.get(this);
    }

    public void y() {
        r0 z10 = z();
        if (z10 != null && B()) {
            z10.b();
            f24974l.set(this, x1.f25033e);
        }
    }
}
