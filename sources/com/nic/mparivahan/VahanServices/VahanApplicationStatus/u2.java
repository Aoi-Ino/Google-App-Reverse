package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class u2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20935e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanWithdrawTransactionApplied f20936f;

    public /* synthetic */ u2(Dialog dialog, VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied) {
        this.f20935e = dialog;
        this.f20936f = vahanWithdrawTransactionApplied;
    }

    public final void onClick(View view) {
        VahanWithdrawTransactionApplied.A1(this.f20935e, this.f20936f, view);
    }
}
