package r3;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import n4.d;
import n4.l;
import q3.a;
import q3.e;
import s3.k0;
import s3.o;

public final class a0 extends d implements e.a, e.b {

    /* renamed from: i  reason: collision with root package name */
    private static final a.C0202a f15540i = m4.d.f13746c;

    /* renamed from: b  reason: collision with root package name */
    private final Context f15541b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f15542c;

    /* renamed from: d  reason: collision with root package name */
    private final a.C0202a f15543d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f15544e;

    /* renamed from: f  reason: collision with root package name */
    private final s3.e f15545f;

    /* renamed from: g  reason: collision with root package name */
    private m4.e f15546g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public z f15547h;

    public a0(Context context, Handler handler, s3.e eVar) {
        a.C0202a aVar = f15540i;
        this.f15541b = context;
        this.f15542c = handler;
        this.f15545f = (s3.e) o.j(eVar, "ClientSettings must not be null");
        this.f15544e = eVar.e();
        this.f15543d = aVar;
    }

    static /* bridge */ /* synthetic */ void n0(a0 a0Var, l lVar) {
        p3.a c10 = lVar.c();
        if (c10.g()) {
            k0 k0Var = (k0) o.i(lVar.d());
            c10 = k0Var.c();
            if (!c10.g()) {
                String valueOf = String.valueOf(c10);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            } else {
                a0Var.f15547h.c(k0Var.d(), a0Var.f15544e);
                a0Var.f15546g.l();
            }
        }
        a0Var.f15547h.b(c10);
        a0Var.f15546g.l();
    }

    public final void c(int i10) {
        this.f15546g.l();
    }

    public final void d(p3.a aVar) {
        this.f15547h.b(aVar);
    }

    public final void e0(l lVar) {
        this.f15542c.post(new y(this, lVar));
    }

    public final void j(Bundle bundle) {
        this.f15546g.o(this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [m4.e, q3.a$f] */
    public final void o0(z zVar) {
        m4.e eVar = this.f15546g;
        if (eVar != null) {
            eVar.l();
        }
        this.f15545f.i(Integer.valueOf(System.identityHashCode(this)));
        a.C0202a aVar = this.f15543d;
        Context context = this.f15541b;
        Looper looper = this.f15542c.getLooper();
        s3.e eVar2 = this.f15545f;
        this.f15546g = aVar.a(context, looper, eVar2, eVar2.f(), this, this);
        this.f15547h = zVar;
        Set set = this.f15544e;
        if (set == null || set.isEmpty()) {
            this.f15542c.post(new x(this));
        } else {
            this.f15546g.p();
        }
    }

    public final void p0() {
        m4.e eVar = this.f15546g;
        if (eVar != null) {
            eVar.l();
        }
    }
}
