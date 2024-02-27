package qm;

import bm.l;
import kotlin.coroutines.jvm.internal.e;
import lm.a;
import lm.y;
import tl.d;
import tl.g;

public class d0 extends a implements e {

    /* renamed from: h  reason: collision with root package name */
    public final d f30808h;

    public d0(g gVar, d dVar) {
        super(gVar, true, true);
        this.f30808h = dVar;
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
        d dVar = this.f30808h;
        dVar.resumeWith(y.a(obj, dVar));
    }

    public final e getCallerFrame() {
        d dVar = this.f30808h;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean h0() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void z(Object obj) {
        k.c(c.b(this.f30808h), y.a(obj, this.f30808h), (l) null, 2, (Object) null);
    }
}
