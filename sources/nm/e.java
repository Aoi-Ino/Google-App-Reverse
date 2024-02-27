package nm;

import bm.l;
import java.util.concurrent.CancellationException;
import lm.a;
import lm.l1;
import lm.r1;
import tl.d;
import tl.g;

public abstract class e extends a implements d {

    /* renamed from: h  reason: collision with root package name */
    private final d f29955h;

    public e(g gVar, d dVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.f29955h = dVar;
    }

    public void F(Throwable th2) {
        CancellationException B0 = r1.B0(this, th2, (String) null, 1, (Object) null);
        this.f29955h.e(B0);
        C(B0);
    }

    public final d M0() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final d N0() {
        return this.f29955h;
    }

    public boolean a(Throwable th2) {
        return this.f29955h.a(th2);
    }

    public Object b(d dVar) {
        Object b10 = this.f29955h.b(dVar);
        Object unused = d.c();
        return b10;
    }

    public void d(l lVar) {
        this.f29955h.d(lVar);
    }

    public final void e(CancellationException cancellationException) {
        if (!f0()) {
            if (cancellationException == null) {
                cancellationException = new l1(J(), (Throwable) null, this);
            }
            F(cancellationException);
        }
    }

    public f iterator() {
        return this.f29955h.iterator();
    }

    public Object j() {
        return this.f29955h.j();
    }

    public Object k(Object obj) {
        return this.f29955h.k(obj);
    }

    public Object m(Object obj, d dVar) {
        return this.f29955h.m(obj, dVar);
    }

    public boolean p() {
        return this.f29955h.p();
    }
}
