package cb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Echallan.PaymentSearchChallanDetails;

public final /* synthetic */ class f0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f4817e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4818f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ PaymentSearchChallanDetails f4819g;

    public /* synthetic */ f0(Dialog dialog, int i10, PaymentSearchChallanDetails paymentSearchChallanDetails) {
        this.f4817e = dialog;
        this.f4818f = i10;
        this.f4819g = paymentSearchChallanDetails;
    }

    public final void onClick(View view) {
        PaymentSearchChallanDetails.u1(this.f4817e, this.f4818f, this.f4819g, view);
    }
}
