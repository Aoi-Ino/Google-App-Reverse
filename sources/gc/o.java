package gc;

import android.webkit.DownloadListener;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlFeePayment;

public final /* synthetic */ class o implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DlFeePayment f11806a;

    public /* synthetic */ o(DlFeePayment dlFeePayment) {
        this.f11806a = dlFeePayment;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        DlFeePayment.y1(this.f11806a, str, str2, str3, str4, j10);
    }
}
