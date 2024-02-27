package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p3.a;
import s3.o;

final class h0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final f0 f5310e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i0 f5311f;

    h0(i0 i0Var, f0 f0Var) {
        this.f5311f = i0Var;
        this.f5310e = f0Var;
    }

    public final void run() {
        if (this.f5311f.f5314f) {
            a b10 = this.f5310e.b();
            if (b10.f()) {
                i0 i0Var = this.f5311f;
                i0Var.f5245e.startActivityForResult(GoogleApiActivity.a(i0Var.b(), (PendingIntent) o.i(b10.e()), this.f5310e.a(), false), 1);
                return;
            }
            i0 i0Var2 = this.f5311f;
            if (i0Var2.f5317i.a(i0Var2.b(), b10.c(), (String) null) != null) {
                i0 i0Var3 = this.f5311f;
                i0Var3.f5317i.u(i0Var3.b(), this.f5311f.f5245e, b10.c(), 2, this.f5311f);
            } else if (b10.c() == 18) {
                i0 i0Var4 = this.f5311f;
                Dialog p10 = i0Var4.f5317i.p(i0Var4.b(), this.f5311f);
                i0 i0Var5 = this.f5311f;
                i0Var5.f5317i.q(i0Var5.b().getApplicationContext(), new g0(this, p10));
            } else {
                this.f5311f.l(b10, this.f5310e.a());
            }
        }
    }
}
