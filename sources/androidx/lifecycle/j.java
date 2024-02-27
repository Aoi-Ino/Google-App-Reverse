package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.k;
import b1.d;
import b1.f;
import cm.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f3286a = new j();

    public static final class a implements d.a {
        public void a(f fVar) {
            l.f(fVar, "owner");
            if (fVar instanceof x0) {
                w0 X = ((x0) fVar).X();
                d l10 = fVar.l();
                for (String b10 : X.c()) {
                    t0 b11 = X.b(b10);
                    l.c(b11);
                    j.a(b11, l10, fVar.d0());
                }
                if (!X.c().isEmpty()) {
                    l10.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    public static final class b implements o {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f3287e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f3288f;

        b(k kVar, d dVar) {
            this.f3287e = kVar;
            this.f3288f = dVar;
        }

        public void d(s sVar, k.a aVar) {
            l.f(sVar, "source");
            l.f(aVar, "event");
            if (aVar == k.a.ON_START) {
                this.f3287e.d(this);
                this.f3288f.i(a.class);
            }
        }
    }

    private j() {
    }

    public static final void a(t0 t0Var, d dVar, k kVar) {
        l.f(t0Var, "viewModel");
        l.f(dVar, "registry");
        l.f(kVar, "lifecycle");
        l0 l0Var = (l0) t0Var.d("androidx.lifecycle.savedstate.vm.tag");
        if (l0Var != null && !l0Var.j()) {
            l0Var.h(dVar, kVar);
            f3286a.c(dVar, kVar);
        }
    }

    public static final l0 b(d dVar, k kVar, String str, Bundle bundle) {
        l.f(dVar, "registry");
        l.f(kVar, "lifecycle");
        l.c(str);
        l0 l0Var = new l0(str, j0.f3289f.a(dVar.b(str), bundle));
        l0Var.h(dVar, kVar);
        f3286a.c(dVar, kVar);
        return l0Var;
    }

    private final void c(d dVar, k kVar) {
        k.b b10 = kVar.b();
        if (b10 == k.b.INITIALIZED || b10.b(k.b.STARTED)) {
            dVar.i(a.class);
        } else {
            kVar.a(new b(kVar, dVar));
        }
    }
}
