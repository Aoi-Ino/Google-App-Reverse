package qm;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30855a = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_cur");
    private volatile Object _cur;

    public t(boolean z10) {
        this._cur = new u(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30855a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            int a10 = uVar.a(obj);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                b.a(f30855a, this, uVar, uVar.i());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30855a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (!uVar.d()) {
                b.a(f30855a, this, uVar, uVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((u) f30855a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30855a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            Object j10 = uVar.j();
            if (j10 != u.f30859h) {
                return j10;
            }
            b.a(f30855a, this, uVar, uVar.i());
        }
    }
}
