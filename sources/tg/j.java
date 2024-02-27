package tg;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.ChangeOfAddressMultiService;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f31368e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ChangeOfAddressMultiService f31369f;

    public /* synthetic */ j(Dialog dialog, ChangeOfAddressMultiService changeOfAddressMultiService) {
        this.f31368e = dialog;
        this.f31369f = changeOfAddressMultiService;
    }

    public final void onClick(View view) {
        ChangeOfAddressMultiService.A1(this.f31368e, this.f31369f, view);
    }
}
