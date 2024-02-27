package qm;

import androidx.concurrent.futures.b;
import cm.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class e {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30809e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30810f;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<e> cls = e.class;
        Class<Object> cls2 = Object.class;
        f30809e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f30810f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public e(e eVar) {
        this._prev = eVar;
    }

    private final e c() {
        e g10 = g();
        while (g10 != null && g10.h()) {
            g10 = (e) f30810f.get(g10);
        }
        return g10;
    }

    private final e d() {
        e e10;
        e e11 = e();
        l.c(e11);
        while (e11.h() && (e10 = e11.e()) != null) {
            e11 = e10;
        }
        return e11;
    }

    /* access modifiers changed from: private */
    public final Object f() {
        return f30809e.get(this);
    }

    public final void b() {
        f30810f.lazySet(this, (Object) null);
    }

    public final e e() {
        Object a10 = f();
        if (a10 == d.f30807a) {
            return null;
        }
        return (e) a10;
    }

    public final e g() {
        return (e) f30810f.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return b.a(f30809e, this, (Object) null, d.f30807a);
    }

    public final void k() {
        Object obj;
        if (!i()) {
            while (true) {
                e c10 = c();
                e d10 = d();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30810f;
                do {
                    obj = atomicReferenceFieldUpdater.get(d10);
                } while (!b.a(atomicReferenceFieldUpdater, d10, obj, ((e) obj) == null ? null : c10));
                if (c10 != null) {
                    f30809e.set(c10, d10);
                }
                if ((!d10.h() || d10.i()) && (c10 == null || !c10.h())) {
                    return;
                }
            }
        }
    }

    public final boolean l(e eVar) {
        return b.a(f30809e, this, (Object) null, eVar);
    }
}
