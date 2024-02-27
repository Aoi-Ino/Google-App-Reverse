package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import w5.p;

final class q extends k {

    /* renamed from: d  reason: collision with root package name */
    final int f6847d;

    /* renamed from: e  reason: collision with root package name */
    final String f6848e;

    /* renamed from: f  reason: collision with root package name */
    final int f6849f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ s f6850g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(s sVar, p pVar, int i10, String str, int i11) {
        super(sVar, pVar);
        this.f6850g = sVar;
        this.f6847d = i10;
        this.f6848e = str;
        this.f6849f = i11;
    }

    public final void R(Bundle bundle) {
        this.f6850g.f6874d.s(this.f6763b);
        s.f6869g.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i10 = this.f6849f;
        if (i10 > 0) {
            this.f6850g.d(this.f6847d, this.f6848e, i10 - 1);
        }
    }
}
