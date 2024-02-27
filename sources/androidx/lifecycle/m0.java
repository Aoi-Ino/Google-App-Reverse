package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.u0;
import b1.d;
import b1.f;
import cm.l;
import r0.a;

public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b f3314a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f3315b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b f3316c = new a();

    public static final class a implements a.b {
        a() {
        }
    }

    public static final class b implements a.b {
        b() {
        }
    }

    public static final class c implements a.b {
        c() {
        }
    }

    public static final class d implements u0.b {
        d() {
        }

        public t0 b(Class cls, r0.a aVar) {
            l.f(cls, "modelClass");
            l.f(aVar, "extras");
            return new o0();
        }
    }

    private static final j0 a(f fVar, x0 x0Var, String str, Bundle bundle) {
        n0 d10 = d(fVar);
        o0 e10 = e(x0Var);
        j0 j0Var = (j0) e10.g().get(str);
        if (j0Var != null) {
            return j0Var;
        }
        j0 a10 = j0.f3289f.a(d10.b(str), bundle);
        e10.g().put(str, a10);
        return a10;
    }

    public static final j0 b(r0.a aVar) {
        l.f(aVar, "<this>");
        f fVar = (f) aVar.a(f3314a);
        if (fVar != null) {
            x0 x0Var = (x0) aVar.a(f3315b);
            if (x0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f3316c);
                String str = (String) aVar.a(u0.c.f3365d);
                if (str != null) {
                    return a(fVar, x0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void c(f fVar) {
        l.f(fVar, "<this>");
        k.b b10 = fVar.d0().b();
        if (b10 != k.b.INITIALIZED && b10 != k.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (fVar.l().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            n0 n0Var = new n0(fVar.l(), (x0) fVar);
            fVar.l().h("androidx.lifecycle.internal.SavedStateHandlesProvider", n0Var);
            fVar.d0().a(new k0(n0Var));
        }
    }

    public static final n0 d(f fVar) {
        l.f(fVar, "<this>");
        d.c c10 = fVar.l().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        n0 n0Var = c10 instanceof n0 ? (n0) c10 : null;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final o0 e(x0 x0Var) {
        l.f(x0Var, "<this>");
        return (o0) new u0(x0Var, (u0.b) new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", o0.class);
    }
}
