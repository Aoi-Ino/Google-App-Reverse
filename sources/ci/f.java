package ci;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.eSign.eSignDMS;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20103e;

    public /* synthetic */ f(Dialog dialog) {
        this.f20103e = dialog;
    }

    public final void onClick(View view) {
        eSignDMS.S1(this.f20103e, view);
    }
}
