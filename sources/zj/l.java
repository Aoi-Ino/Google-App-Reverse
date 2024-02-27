package zj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f33216e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DLRenewalFeePaymentActivity f33217f;

    public /* synthetic */ l(Dialog dialog, DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity) {
        this.f33216e = dialog;
        this.f33217f = dLRenewalFeePaymentActivity;
    }

    public final void onClick(View view) {
        DLRenewalFeePaymentActivity.a2(this.f33216e, this.f33217f, view);
    }
}
