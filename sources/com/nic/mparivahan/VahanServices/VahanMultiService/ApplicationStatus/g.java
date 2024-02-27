package com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f21020e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21021f;

    public /* synthetic */ g(Dialog dialog, VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
        this.f21020e = dialog;
        this.f21021f = vahanMultiServiceApplicationTransactionStatus;
    }

    public final void onClick(View view) {
        VahanMultiServiceApplicationTransactionStatus.J2(this.f21020e, this.f21021f, view);
    }
}
