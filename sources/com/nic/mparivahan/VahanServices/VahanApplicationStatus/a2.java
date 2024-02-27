package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class a2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20849e;

    public /* synthetic */ a2(Dialog dialog) {
        this.f20849e = dialog;
    }

    public final void onClick(View view) {
        VahanVerifyPendingTransactionList.G1(this.f20849e, view);
    }
}
