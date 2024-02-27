package com.nic.mparivahan.VahanServices.VahanMultiService;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f21140e;

    public /* synthetic */ j(Dialog dialog) {
        this.f21140e = dialog;
    }

    public final void onClick(View view) {
        VahanMultiDmsAPI.g3(this.f21140e, view);
    }
}
