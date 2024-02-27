package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.u0;
import b1.d;
import b1.f;
import cm.g;
import cm.l;

public abstract class a extends u0.d implements u0.b {

    /* renamed from: e  reason: collision with root package name */
    public static final C0054a f3252e = new C0054a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private d f3253b;

    /* renamed from: c  reason: collision with root package name */
    private k f3254c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f3255d;

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static final class C0054a {
        private C0054a() {
        }

        public /* synthetic */ C0054a(g gVar) {
            this();
        }
    }

    public a(f fVar, Bundle bundle) {
        l.f(fVar, "owner");
        this.f3253b = fVar.l();
        this.f3254c = fVar.d0();
        this.f3255d = bundle;
    }

    private final t0 d(String str, Class cls) {
        d dVar = this.f3253b;
        l.c(dVar);
        k kVar = this.f3254c;
        l.c(kVar);
        l0 b10 = j.b(dVar, kVar, str, this.f3255d);
        t0 e10 = e(str, cls, b10.i());
        e10.f("androidx.lifecycle.savedstate.vm.tag", b10);
        return e10;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f3254c != null) {
            return d(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public t0 b(Class cls, r0.a aVar) {
        l.f(cls, "modelClass");
        l.f(aVar, "extras");
        String str = (String) aVar.a(u0.c.f3365d);
        if (str != null) {
            return this.f3253b != null ? d(str, cls) : e(str, cls, m0.b(aVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public void c(t0 t0Var) {
        l.f(t0Var, "viewModel");
        d dVar = this.f3253b;
        if (dVar != null) {
            l.c(dVar);
            k kVar = this.f3254c;
            l.c(kVar);
            j.a(t0Var, dVar, kVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract t0 e(String str, Class cls, j0 j0Var);
}
