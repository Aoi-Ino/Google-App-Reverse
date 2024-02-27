package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class q1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20915e;

    public /* synthetic */ q1(Dialog dialog) {
        this.f20915e = dialog;
    }

    public final void onClick(View view) {
        VahanVerifyPendingTransaction.G1(this.f20915e, view);
    }
}
