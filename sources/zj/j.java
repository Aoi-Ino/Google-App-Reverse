package zj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f33211e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f33212f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ DLRenewalFeePaymentActivity f33213g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Dialog f33214h;

    public /* synthetic */ j(String str, String str2, DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity, Dialog dialog) {
        this.f33211e = str;
        this.f33212f = str2;
        this.f33213g = dLRenewalFeePaymentActivity;
        this.f33214h = dialog;
    }

    public final void onClick(View view) {
        DLRenewalFeePaymentActivity.D1(this.f33211e, this.f33212f, this.f33213g, this.f33214h, view);
    }
}
