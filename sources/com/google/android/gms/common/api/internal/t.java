package com.google.android.gms.common.api.internal;

import android.util.Log;
import java.util.Set;
import q3.a;
import r3.b;
import r3.z;
import s3.c;
import s3.j;

final class t implements c.C0213c, z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a.f f5345a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f5346b;

    /* renamed from: c  reason: collision with root package name */
    private j f5347c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set f5348d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f5349e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ b f5350f;

    public t(b bVar, a.f fVar, b bVar2) {
        this.f5350f = bVar;
        this.f5345a = fVar;
        this.f5346b = bVar2;
    }

    /* access modifiers changed from: private */
    public final void h() {
        j jVar;
        if (this.f5349e && (jVar = this.f5347c) != null) {
            this.f5345a.j(jVar, this.f5348d);
        }
    }

    public final void a(p3.a aVar) {
        this.f5350f.f5271p.post(new s(this, aVar));
    }

    public final void b(p3.a aVar) {
        q qVar = (q) this.f5350f.f5267l.get(this.f5346b);
        if (qVar != null) {
            qVar.H(aVar);
        }
    }

    public final void c(j jVar, Set set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new p3.a(4));
            return;
        }
        this.f5347c = jVar;
        this.f5348d = set;
        h();
    }
}
