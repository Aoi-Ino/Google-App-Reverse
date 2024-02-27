package com.google.android.gms.common.api.internal;

import android.app.Activity;
import o.b;
import p3.a;
import p3.i;
import r3.f;
import s3.o;

public final class k extends i0 {

    /* renamed from: j  reason: collision with root package name */
    private final b f5320j = new b();

    /* renamed from: k  reason: collision with root package name */
    private final b f5321k;

    k(f fVar, b bVar, i iVar) {
        super(fVar, iVar);
        this.f5321k = bVar;
        this.f5245e.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, b bVar, r3.b bVar2) {
        f c10 = LifecycleCallback.c(activity);
        k kVar = (k) c10.c("ConnectionlessLifecycleHelper", k.class);
        if (kVar == null) {
            kVar = new k(c10, bVar, i.l());
        }
        o.j(bVar2, "ApiKey cannot be null");
        kVar.f5320j.add(bVar2);
        bVar.c(kVar);
    }

    private final void v() {
        if (!this.f5320j.isEmpty()) {
            this.f5321k.c(this);
        }
    }

    public final void h() {
        super.h();
        v();
    }

    public final void j() {
        super.j();
        v();
    }

    public final void k() {
        super.k();
        this.f5321k.d(this);
    }

    /* access modifiers changed from: protected */
    public final void m(a aVar, int i10) {
        this.f5321k.H(aVar, i10);
    }

    /* access modifiers changed from: protected */
    public final void n() {
        this.f5321k.a();
    }

    /* access modifiers changed from: package-private */
    public final b t() {
        return this.f5320j;
    }
}
