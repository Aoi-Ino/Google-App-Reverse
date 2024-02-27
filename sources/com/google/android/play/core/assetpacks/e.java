package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;
import t5.b;
import t5.n0;
import w5.p;

final class e extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Map f6654f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p f6655g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ s f6656h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e(s sVar, p pVar, Map map, p pVar2) {
        super(pVar);
        this.f6656h = sVar;
        this.f6654f = map;
        this.f6655g = pVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f6656h.f6874d.e()).l(this.f6656h.f6871a, s.o(this.f6654f), new n(this.f6656h, this.f6655g));
        } catch (RemoteException e10) {
            s.f6869g.c(e10, "syncPacks", new Object[0]);
            this.f6655g.d(new RuntimeException(e10));
        }
    }
}
