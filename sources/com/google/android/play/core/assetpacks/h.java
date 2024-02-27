package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import t5.b;
import t5.n0;
import w5.p;

final class h extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f6727f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p f6728g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ s f6729h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(s sVar, p pVar, int i10, p pVar2) {
        super(pVar);
        this.f6729h = sVar;
        this.f6727f = i10;
        this.f6728g = pVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f6729h.f6874d.e()).f0(this.f6729h.f6871a, s.b(this.f6727f), s.a(), new r(this.f6729h, this.f6728g));
        } catch (RemoteException e10) {
            s.f6869g.c(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
