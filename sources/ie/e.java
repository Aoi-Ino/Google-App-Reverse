package ie;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment.CompPaymentStatusScreen;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f24322e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CompPaymentStatusScreen f24323f;

    public /* synthetic */ e(Dialog dialog, CompPaymentStatusScreen compPaymentStatusScreen) {
        this.f24322e = dialog;
        this.f24323f = compPaymentStatusScreen;
    }

    public final void onClick(View view) {
        CompPaymentStatusScreen.s1(this.f24322e, this.f24323f, view);
    }
}
