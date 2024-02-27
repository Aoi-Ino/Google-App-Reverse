package p9;

import android.webkit.DownloadListener;
import com.nic.mparivahan.ClServices.View.ClFeePayment;

public final /* synthetic */ class g1 implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClFeePayment f14794a;

    public /* synthetic */ g1(ClFeePayment clFeePayment) {
        this.f14794a = clFeePayment;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        ClFeePayment.B1(this.f14794a, str, str2, str3, str4, j10);
    }
}
