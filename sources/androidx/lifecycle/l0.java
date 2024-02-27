package androidx.lifecycle;

import androidx.lifecycle.k;
import b1.d;
import cm.l;

public final class l0 implements o {

    /* renamed from: e  reason: collision with root package name */
    private final String f3306e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f3307f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3308g;

    public l0(String str, j0 j0Var) {
        l.f(str, "key");
        l.f(j0Var, "handle");
        this.f3306e = str;
        this.f3307f = j0Var;
    }

    public void d(s sVar, k.a aVar) {
        l.f(sVar, "source");
        l.f(aVar, "event");
        if (aVar == k.a.ON_DESTROY) {
            this.f3308g = false;
            sVar.d0().d(this);
        }
    }

    public final void h(d dVar, k kVar) {
        l.f(dVar, "registry");
        l.f(kVar, "lifecycle");
        if (!this.f3308g) {
            this.f3308g = true;
            kVar.a(this);
            dVar.h(this.f3306e, this.f3307f.c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final j0 i() {
        return this.f3307f;
    }

    public final boolean j() {
        return this.f3308g;
    }
}
