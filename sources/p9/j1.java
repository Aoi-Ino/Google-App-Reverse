package p9;

import android.webkit.DownloadListener;
import com.nic.mparivahan.ClServices.View.ClFeePayment;

public final /* synthetic */ class j1 implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClFeePayment f14812a;

    public /* synthetic */ j1(ClFeePayment clFeePayment) {
        this.f14812a = clFeePayment;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        ClFeePayment.W1(this.f14812a, str, str2, str3, str4, j10);
    }
}
