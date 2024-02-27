package com.nic.mparivahan.VahanServices.VahanMultiService;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class i0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f21138e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanMultiSelectionScreen f21139f;

    public /* synthetic */ i0(Dialog dialog, VahanMultiSelectionScreen vahanMultiSelectionScreen) {
        this.f21138e = dialog;
        this.f21139f = vahanMultiSelectionScreen;
    }

    public final void onClick(View view) {
        VahanMultiSelectionScreen.s1(this.f21138e, this.f21139f, view);
    }
}
