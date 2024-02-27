package ci;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.eSign.eSignDMS;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f20101e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ eSignDMS f20102f;

    public /* synthetic */ e(Dialog dialog, eSignDMS esigndms) {
        this.f20101e = dialog;
        this.f20102f = esigndms;
    }

    public final void onClick(View view) {
        eSignDMS.V1(this.f20101e, this.f20102f, view);
    }
}
