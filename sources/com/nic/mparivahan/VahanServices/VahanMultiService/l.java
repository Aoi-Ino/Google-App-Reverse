package com.nic.mparivahan.VahanServices.VahanMultiService;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f21143e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanMultiDmsAPI f21144f;

    public /* synthetic */ l(Dialog dialog, VahanMultiDmsAPI vahanMultiDmsAPI) {
        this.f21143e = dialog;
        this.f21144f = vahanMultiDmsAPI;
    }

    public final void onClick(View view) {
        VahanMultiDmsAPI.D2(this.f21143e, this.f21144f, view);
    }
}
