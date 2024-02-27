package cb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Echallan.PaymentSearchChallanDetails;

public final /* synthetic */ class e0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f4811e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PaymentSearchChallanDetails f4812f;

    public /* synthetic */ e0(Dialog dialog, PaymentSearchChallanDetails paymentSearchChallanDetails) {
        this.f4811e = dialog;
        this.f4812f = paymentSearchChallanDetails;
    }

    public final void onClick(View view) {
        PaymentSearchChallanDetails.H1(this.f4811e, this.f4812f, view);
    }
}
