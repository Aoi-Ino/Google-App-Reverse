package com.google.android.gms.common.api.internal;

import android.util.Log;
import p3.a;
import s3.j;

final class s implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f5343e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ t f5344f;

    s(t tVar, a aVar) {
        this.f5344f = tVar;
        this.f5343e = aVar;
    }

    public final void run() {
        t tVar = this.f5344f;
        q qVar = (q) tVar.f5350f.f5267l.get(tVar.f5346b);
        if (qVar != null) {
            if (this.f5343e.g()) {
                this.f5344f.f5349e = true;
                if (this.f5344f.f5345a.n()) {
                    this.f5344f.h();
                    return;
                }
                try {
                    t tVar2 = this.f5344f;
                    tVar2.f5345a.j((j) null, tVar2.f5345a.b());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    this.f5344f.f5345a.d("Failed to get service from broker.");
                    qVar.G(new a(10), (Exception) null);
                }
            } else {
                qVar.G(this.f5343e, (Exception) null);
            }
        }
    }
}
