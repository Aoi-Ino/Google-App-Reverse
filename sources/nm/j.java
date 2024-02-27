package nm;

import bm.l;
import java.util.concurrent.atomic.AtomicReferenceArray;
import lm.j2;
import qm.e0;
import qm.z;
import tl.g;

public final class j extends e0 {

    /* renamed from: i  reason: collision with root package name */
    private final b f29960i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicReferenceArray f29961j = new AtomicReferenceArray(c.f29933b * 2);

    public j(long j10, j jVar, b bVar, int i10) {
        super(j10, jVar, i10);
        this.f29960i = bVar;
    }

    private final void z(int i10, Object obj) {
        this.f29961j.lazySet(i10 * 2, obj);
    }

    public final void A(int i10, Object obj) {
        this.f29961j.set((i10 * 2) + 1, obj);
    }

    public final void B(int i10, Object obj) {
        z(i10, obj);
    }

    public int n() {
        return c.f29933b;
    }

    public void o(int i10, Throwable th2, g gVar) {
        l lVar;
        l lVar2;
        int i11 = c.f29933b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object v10 = v(i10);
        while (true) {
            Object w10 = w(i10);
            if ((w10 instanceof j2) || (w10 instanceof v)) {
                if (r(i10, w10, z10 ? c.f29941j : c.f29942k)) {
                    s(i10);
                    x(i10, !z10);
                    if (z10 && (lVar = u().f29914f) != null) {
                        z.b(lVar, v10, gVar);
                        return;
                    }
                    return;
                }
            } else if (w10 == c.f29941j || w10 == c.f29942k) {
                s(i10);
            } else if (!(w10 == c.f29938g || w10 == c.f29937f)) {
                if (w10 != c.f29940i && w10 != c.f29935d && w10 != c.z()) {
                    throw new IllegalStateException(("unexpected state: " + w10).toString());
                }
                return;
            }
        }
        s(i10);
        if (z10 && (lVar2 = u().f29914f) != null) {
            z.b(lVar2, v10, gVar);
        }
    }

    public final boolean r(int i10, Object obj, Object obj2) {
        return i.a(this.f29961j, (i10 * 2) + 1, obj, obj2);
    }

    public final void s(int i10) {
        z(i10, (Object) null);
    }

    public final Object t(int i10, Object obj) {
        return this.f29961j.getAndSet((i10 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f29960i;
        cm.l.c(bVar);
        return bVar;
    }

    public final Object v(int i10) {
        return this.f29961j.get(i10 * 2);
    }

    public final Object w(int i10) {
        return this.f29961j.get((i10 * 2) + 1);
    }

    public final void x(int i10, boolean z10) {
        if (z10) {
            u().I0((this.f30812g * ((long) c.f29933b)) + ((long) i10));
        }
        p();
    }

    public final Object y(int i10) {
        Object v10 = v(i10);
        s(i10);
        return v10;
    }
}
