package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class z1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20953e;

    public /* synthetic */ z1(Dialog dialog) {
        this.f20953e = dialog;
    }

    public final void onClick(View view) {
        VahanVerifyPendingTransactionList.F1(this.f20953e, view);
    }
}
