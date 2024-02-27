package vg;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreen;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32307e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanPaymentStatusScreen f32308f;

    public /* synthetic */ e(Dialog dialog, VahanPaymentStatusScreen vahanPaymentStatusScreen) {
        this.f32307e = dialog;
        this.f32308f = vahanPaymentStatusScreen;
    }

    public final void onClick(View view) {
        VahanPaymentStatusScreen.u1(this.f32307e, this.f32308f, view);
    }
}
