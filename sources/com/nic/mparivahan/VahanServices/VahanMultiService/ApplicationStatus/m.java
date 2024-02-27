package com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f21027e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanMultiServiceApplicationTransactionStatus f21028f;

    public /* synthetic */ m(Dialog dialog, VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus) {
        this.f21027e = dialog;
        this.f21028f = vahanMultiServiceApplicationTransactionStatus;
    }

    public final void onClick(View view) {
        VahanMultiServiceApplicationTransactionStatus.g3(this.f21027e, this.f21028f, view);
    }
}
