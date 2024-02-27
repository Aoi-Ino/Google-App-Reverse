package ci;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.eSign.eSignDMS;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20104e;

    public /* synthetic */ g(Dialog dialog) {
        this.f20104e = dialog;
    }

    public final void onClick(View view) {
        eSignDMS.T1(this.f20104e, view);
    }
}
