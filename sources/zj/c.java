package zj;

import android.webkit.DownloadListener;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;

public final /* synthetic */ class c implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DLRenewalFeePaymentActivity f33204a;

    public /* synthetic */ c(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity) {
        this.f33204a = dLRenewalFeePaymentActivity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        DLRenewalFeePaymentActivity.n2(this.f33204a, str, str2, str3, str4, j10);
    }
}
