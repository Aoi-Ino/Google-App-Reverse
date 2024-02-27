package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;

public final /* synthetic */ class h1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19153e;

    public /* synthetic */ h1(Dialog dialog) {
        this.f19153e = dialog;
    }

    public final void onClick(View view) {
        VahanDmsAPI.u2(this.f19153e, view);
    }
}
