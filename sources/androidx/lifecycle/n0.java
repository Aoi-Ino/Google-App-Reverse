package androidx.lifecycle;

import android.os.Bundle;
import b1.d;
import cm.l;
import cm.m;
import java.util.Map;
import pl.h;

public final class n0 implements d.c {

    /* renamed from: a  reason: collision with root package name */
    private final d f3319a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3320b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f3321c;

    /* renamed from: d  reason: collision with root package name */
    private final h f3322d;

    static final class a extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ x0 f3323e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(x0 x0Var) {
            super(0);
            this.f3323e = x0Var;
        }

        /* renamed from: b */
        public final o0 a() {
            return m0.e(this.f3323e);
        }
    }

    public n0(d dVar, x0 x0Var) {
        l.f(dVar, "savedStateRegistry");
        l.f(x0Var, "viewModelStoreOwner");
        this.f3319a = dVar;
        this.f3322d = j.a(new a(x0Var));
    }

    private final o0 c() {
        return (o0) this.f3322d.getValue();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3321c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().g().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((j0) entry.getValue()).c().a();
            if (!l.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f3320b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        l.f(str, "key");
        d();
        Bundle bundle = this.f3321c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3321c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3321c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f3321c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (!this.f3320b) {
            Bundle b10 = this.f3319a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f3321c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b10 != null) {
                bundle.putAll(b10);
            }
            this.f3321c = bundle;
            this.f3320b = true;
            c();
        }
    }
}
