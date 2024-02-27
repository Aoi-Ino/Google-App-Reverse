package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20899e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanApplTranByRcStatus f20900f;

    public /* synthetic */ n(Dialog dialog, VahanApplTranByRcStatus vahanApplTranByRcStatus) {
        this.f20899e = dialog;
        this.f20900f = vahanApplTranByRcStatus;
    }

    public final void onClick(View view) {
        VahanApplTranByRcStatus.M1(this.f20899e, this.f20900f, view);
    }
}
