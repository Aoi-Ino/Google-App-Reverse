package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import t5.b;
import t5.n0;
import w5.p;

final class g extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f6703f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6704g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p f6705h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f6706i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ s f6707j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(s sVar, p pVar, int i10, String str, p pVar2, int i11) {
        super(pVar);
        this.f6707j = sVar;
        this.f6703f = i10;
        this.f6704g = str;
        this.f6705h = pVar2;
        this.f6706i = i11;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f6707j.f6874d.e()).v(this.f6707j.f6871a, s.y(this.f6703f, this.f6704g), s.a(), new q(this.f6707j, this.f6705h, this.f6703f, this.f6704g, this.f6706i));
        } catch (RemoteException e10) {
            s.f6869g.c(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
