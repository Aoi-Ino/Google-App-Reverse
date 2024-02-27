package n5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import q5.a;
import r5.b;
import w5.e;

final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final u f14156a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14157b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14158c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f14159d = new Handler(Looper.getMainLooper());

    j(u uVar, g gVar, Context context) {
        this.f14156a = uVar;
        this.f14157b = gVar;
        this.f14158c = context;
    }

    public final synchronized void a(b bVar) {
        this.f14157b.e(bVar);
    }

    public final boolean b(a aVar, int i10, Activity activity, int i11) {
        d c10 = d.c(i10);
        if (activity == null) {
            return false;
        }
        return f(aVar, new i(this, activity), c10, i11);
    }

    public final synchronized void c(b bVar) {
        this.f14157b.c(bVar);
    }

    public final e d() {
        return this.f14156a.f(this.f14158c.getPackageName());
    }

    public final e e() {
        return this.f14156a.g(this.f14158c.getPackageName());
    }

    public final boolean f(a aVar, a aVar2, d dVar, int i10) {
        if (aVar == null || aVar2 == null || dVar == null || !aVar.e(dVar) || aVar.j()) {
            return false;
        }
        aVar.i();
        aVar2.a(aVar.g(dVar).getIntentSender(), i10, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
