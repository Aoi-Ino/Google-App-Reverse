package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import w5.p;

final class o extends k {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s f6824d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(s sVar, p pVar) {
        super(sVar, pVar);
        this.f6824d = sVar;
    }

    public final void O(Bundle bundle, Bundle bundle2) {
        super.O(bundle, bundle2);
        if (!this.f6824d.f6876f.compareAndSet(true, false)) {
            s.f6869g.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f6824d.g();
        }
    }

    public final void R(Bundle bundle) {
        this.f6824d.f6875e.s(this.f6763b);
        int i10 = bundle.getInt("error_code");
        s.f6869g.b("onError(%d)", Integer.valueOf(i10));
        this.f6763b.d(new a(i10));
    }
}
