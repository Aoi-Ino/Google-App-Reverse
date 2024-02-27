package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class u0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20932e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanApplicationTransactionStatus f20933f;

    public /* synthetic */ u0(Dialog dialog, VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
        this.f20932e = dialog;
        this.f20933f = vahanApplicationTransactionStatus;
    }

    public final void onClick(View view) {
        VahanApplicationTransactionStatus.G2(this.f20932e, this.f20933f, view);
    }
}
