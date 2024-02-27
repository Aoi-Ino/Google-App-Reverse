package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class o0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20905e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanApplicationTransactionStatus f20906f;

    public /* synthetic */ o0(Dialog dialog, VahanApplicationTransactionStatus vahanApplicationTransactionStatus) {
        this.f20905e = dialog;
        this.f20906f = vahanApplicationTransactionStatus;
    }

    public final void onClick(View view) {
        VahanApplicationTransactionStatus.o2(this.f20905e, this.f20906f, view);
    }
}
