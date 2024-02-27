package ud;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Tax.payment.PayTaxPaymentStatusScreen;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f31732e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PayTaxPaymentStatusScreen f31733f;

    public /* synthetic */ g(Dialog dialog, PayTaxPaymentStatusScreen payTaxPaymentStatusScreen) {
        this.f31732e = dialog;
        this.f31733f = payTaxPaymentStatusScreen;
    }

    public final void onClick(View view) {
        PayTaxPaymentStatusScreen.s1(this.f31732e, this.f31733f, view);
    }
}
