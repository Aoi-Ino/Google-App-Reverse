package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import r3.p;

final class g0 extends p {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f5307a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h0 f5308b;

    g0(h0 h0Var, Dialog dialog) {
        this.f5308b = h0Var;
        this.f5307a = dialog;
    }

    public final void a() {
        this.f5308b.f5311f.o();
        if (this.f5307a.isShowing()) {
            this.f5307a.dismiss();
        }
    }
}
