package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.List;
import t5.b;
import t5.n0;
import w5.p;

final class d extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ List f6639f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p f6640g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ s f6641h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d(s sVar, p pVar, List list, p pVar2) {
        super(pVar);
        this.f6641h = sVar;
        this.f6639f = list;
        this.f6640g = pVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f6641h.f6874d.e()).K(this.f6641h.f6871a, s.u(this.f6639f), s.a(), new l(this.f6641h, this.f6640g));
        } catch (RemoteException e10) {
            s.f6869g.c(e10, "cancelDownloads(%s)", this.f6639f);
        }
    }
}
