package com.nic.mparivahan.VahanServices.VahanMultiService;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f21147e;

    public /* synthetic */ o(Dialog dialog) {
        this.f21147e = dialog;
    }

    public final void onClick(View view) {
        VahanMultiDmsAPI.x2(this.f21147e, view);
    }
}
