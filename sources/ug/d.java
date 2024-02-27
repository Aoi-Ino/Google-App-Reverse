package ug;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.Payment.VahanPaymentMultiServiceStatusScreen;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f31757e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanPaymentMultiServiceStatusScreen f31758f;

    public /* synthetic */ d(Dialog dialog, VahanPaymentMultiServiceStatusScreen vahanPaymentMultiServiceStatusScreen) {
        this.f31757e = dialog;
        this.f31758f = vahanPaymentMultiServiceStatusScreen;
    }

    public final void onClick(View view) {
        VahanPaymentMultiServiceStatusScreen.v1(this.f31757e, this.f31758f, view);
    }
}
