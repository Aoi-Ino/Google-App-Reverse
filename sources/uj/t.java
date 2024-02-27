package uj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f31842e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DLIdpActivity f31843f;

    public /* synthetic */ t(Dialog dialog, DLIdpActivity dLIdpActivity) {
        this.f31842e = dialog;
        this.f31843f = dLIdpActivity;
    }

    public final void onClick(View view) {
        DLIdpActivity.h2(this.f31842e, this.f31843f, view);
    }
}
