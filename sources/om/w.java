package om;

import androidx.concurrent.futures.b;
import cm.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import lm.k;
import pl.p;
import pl.x;
import pm.c;
import tl.d;

final class w extends c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30209a = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d */
    public boolean a(u uVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30209a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, v.f30207a);
        return true;
    }

    public final Object e(d dVar) {
        k kVar = new k(c.b(dVar), 1);
        kVar.y();
        if (!b.a(f30209a, this, v.f30207a, kVar)) {
            p.a aVar = p.f30426e;
            kVar.resumeWith(p.a(x.f30437a));
        }
        Object v10 = kVar.v();
        if (v10 == d.c()) {
            h.c(dVar);
        }
        return v10 == d.c() ? v10 : x.f30437a;
    }

    /* renamed from: f */
    public d[] b(u uVar) {
        f30209a.set(this, (Object) null);
        return pm.b.f30443a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30209a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null && obj != v.f30208b) {
                if (obj == v.f30207a) {
                    if (b.a(f30209a, this, obj, v.f30208b)) {
                        return;
                    }
                } else if (b.a(f30209a, this, obj, v.f30207a)) {
                    p.a aVar = p.f30426e;
                    ((k) obj).resumeWith(p.a(x.f30437a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f30209a.getAndSet(this, v.f30207a);
        l.c(andSet);
        return andSet == v.f30208b;
    }
}
