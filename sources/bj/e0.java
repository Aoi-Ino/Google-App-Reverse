package bj;

import android.webkit.DownloadListener;
import com.nic.mparivahan.dlservices.newlearner.LLFeePayment;

public final /* synthetic */ class e0 implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LLFeePayment f19779a;

    public /* synthetic */ e0(LLFeePayment lLFeePayment) {
        this.f19779a = lLFeePayment;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        LLFeePayment.O1(this.f19779a, str, str2, str3, str4, j10);
    }
}
