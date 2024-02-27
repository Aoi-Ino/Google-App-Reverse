package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class p1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20911e;

    public /* synthetic */ p1(Dialog dialog) {
        this.f20911e = dialog;
    }

    public final void onClick(View view) {
        VahanVerifyPendingTransaction.F1(this.f20911e, view);
    }
}
