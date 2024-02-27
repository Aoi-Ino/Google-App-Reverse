package b1;

import android.os.Bundle;
import androidx.lifecycle.k;
import cm.g;
import cm.l;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4403d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f4404a;

    /* renamed from: b  reason: collision with root package name */
    private final d f4405b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4406c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final e a(f fVar) {
            l.f(fVar, "owner");
            return new e(fVar, (g) null);
        }
    }

    private e(f fVar) {
        this.f4404a = fVar;
        this.f4405b = new d();
    }

    public static final e a(f fVar) {
        return f4403d.a(fVar);
    }

    public final d b() {
        return this.f4405b;
    }

    public final void c() {
        k d02 = this.f4404a.d0();
        if (d02.b() == k.b.INITIALIZED) {
            d02.a(new b(this.f4404a));
            this.f4405b.e(d02);
            this.f4406c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f4406c) {
            c();
        }
        k d02 = this.f4404a.d0();
        if (!d02.b().b(k.b.STARTED)) {
            this.f4405b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + d02.b()).toString());
    }

    public final void e(Bundle bundle) {
        l.f(bundle, "outBundle");
        this.f4405b.g(bundle);
    }

    public /* synthetic */ e(f fVar, g gVar) {
        this(fVar);
    }
}
