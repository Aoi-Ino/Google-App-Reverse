package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.widget.CompoundButton;

public final /* synthetic */ class t2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanWithdrawTransactionApplied f20930e;

    public /* synthetic */ t2(VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied) {
        this.f20930e = vahanWithdrawTransactionApplied;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        VahanWithdrawTransactionApplied.v1(this.f20930e, compoundButton, z10);
    }
}
