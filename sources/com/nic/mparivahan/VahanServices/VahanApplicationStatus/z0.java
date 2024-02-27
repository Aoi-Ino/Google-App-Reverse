package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class z0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20951e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanApplicationTransactionStatus f20952f;

    public /* synthetic */ z0(Dialog dialog, VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
        this.f20951e = dialog;
        this.f20952f = vahanApplicationTransactionStatus;
    }

    public final void onClick(View view) {
        VahanApplicationTransactionStatus.Z2(this.f20951e, this.f20952f, view);
    }
}
