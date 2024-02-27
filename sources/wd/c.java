package wd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.ChangeOfAddressConfirmation;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32507e;

    public /* synthetic */ c(Dialog dialog) {
        this.f32507e = dialog;
    }

    public final void onClick(View view) {
        ChangeOfAddressConfirmation.m1(this.f32507e, view);
    }
}
