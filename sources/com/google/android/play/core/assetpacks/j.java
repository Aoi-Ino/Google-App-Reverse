package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import t5.b;
import t5.n0;
import w5.p;

final class j extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p f6750f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ s f6751g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(s sVar, p pVar, p pVar2) {
        super(pVar);
        this.f6751g = sVar;
        this.f6750f = pVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f6751g.f6875e.e()).x(this.f6751g.f6871a, s.a(), new o(this.f6751g, this.f6750f));
        } catch (RemoteException e10) {
            s.f6869g.c(e10, "keepAlive", new Object[0]);
        }
    }
}
