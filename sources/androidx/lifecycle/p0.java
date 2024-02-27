package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.u0;
import b1.d;
import b1.f;
import cm.l;
import java.lang.reflect.Constructor;
import r0.a;

public final class p0 extends u0.d implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private Application f3325b;

    /* renamed from: c  reason: collision with root package name */
    private final u0.b f3326c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f3327d;

    /* renamed from: e  reason: collision with root package name */
    private k f3328e;

    /* renamed from: f  reason: collision with root package name */
    private d f3329f;

    public p0(Application application, f fVar, Bundle bundle) {
        l.f(fVar, "owner");
        this.f3329f = fVar.l();
        this.f3328e = fVar.d0();
        this.f3327d = bundle;
        this.f3325b = application;
        this.f3326c = application != null ? u0.a.f3356f.b(application) : new u0.a();
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public t0 b(Class cls, a aVar) {
        l.f(cls, "modelClass");
        l.f(aVar, "extras");
        String str = (String) aVar.a(u0.c.f3365d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(m0.f3314a) != null && aVar.a(m0.f3315b) != null) {
            Application application = (Application) aVar.a(u0.a.f3358h);
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor c10 = q0.c(cls, (!isAssignableFrom || application == null) ? q0.f3331b : q0.f3330a);
            if (c10 == null) {
                return this.f3326c.b(cls, aVar);
            }
            return (!isAssignableFrom || application == null) ? q0.d(cls, c10, m0.b(aVar)) : q0.d(cls, c10, application, m0.b(aVar));
        } else if (this.f3328e != null) {
            return d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public void c(t0 t0Var) {
        l.f(t0Var, "viewModel");
        if (this.f3328e != null) {
            d dVar = this.f3329f;
            l.c(dVar);
            k kVar = this.f3328e;
            l.c(kVar);
            j.a(t0Var, dVar, kVar);
        }
    }

    public final t0 d(String str, Class cls) {
        t0 t0Var;
        Application application;
        l.f(str, "key");
        l.f(cls, "modelClass");
        k kVar = this.f3328e;
        if (kVar != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor c10 = q0.c(cls, (!isAssignableFrom || this.f3325b == null) ? q0.f3331b : q0.f3330a);
            if (c10 == null) {
                return this.f3325b != null ? this.f3326c.a(cls) : u0.c.f3363b.a().a(cls);
            }
            d dVar = this.f3329f;
            l.c(dVar);
            l0 b10 = j.b(dVar, kVar, str, this.f3327d);
            if (!isAssignableFrom || (application = this.f3325b) == null) {
                t0Var = q0.d(cls, c10, b10.i());
            } else {
                l.c(application);
                t0Var = q0.d(cls, c10, application, b10.i());
            }
            t0Var.f("androidx.lifecycle.savedstate.vm.tag", b10);
            return t0Var;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
