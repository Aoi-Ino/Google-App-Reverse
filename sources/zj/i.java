package zj;

import android.webkit.DownloadListener;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;

public final /* synthetic */ class i implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DLRenewalFeePaymentActivity f33210a;

    public /* synthetic */ i(DLRenewalFeePaymentActivity dLRenewalFeePaymentActivity) {
        this.f33210a = dLRenewalFeePaymentActivity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        DLRenewalFeePaymentActivity.G1(this.f33210a, str, str2, str3, str4, j10);
    }
}
