package com.nic.mparivahan.VahanServices.VahanMultiService;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f21136e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanMultiDmsAPI f21137f;

    public /* synthetic */ i(Dialog dialog, VahanMultiDmsAPI vahanMultiDmsAPI) {
        this.f21136e = dialog;
        this.f21137f = vahanMultiDmsAPI;
    }

    public final void onClick(View view) {
        VahanMultiDmsAPI.j3(this.f21136e, this.f21137f, view);
    }
}
