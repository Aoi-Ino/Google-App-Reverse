package uj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DLIdpActivity f31844e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ cm.u f31845f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f31846g;

    public /* synthetic */ u(DLIdpActivity dLIdpActivity, cm.u uVar, Dialog dialog) {
        this.f31844e = dLIdpActivity;
        this.f31845f = uVar;
        this.f31846g = dialog;
    }

    public final void onClick(View view) {
        DLIdpActivity.i2(this.f31844e, this.f31845f, this.f31846g, view);
    }
}
