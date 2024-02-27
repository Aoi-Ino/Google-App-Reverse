package com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f21031e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21032f;

    public /* synthetic */ p(Dialog dialog, VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
        this.f21031e = dialog;
        this.f21032f = vahanMultiServiceApplicationTransactionStatus;
    }

    public final void onClick(View view) {
        VahanMultiServiceApplicationTransactionStatus.r2(this.f21031e, this.f21032f, view);
    }
}
