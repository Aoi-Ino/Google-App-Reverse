package tb;

import android.webkit.DownloadListener;
import com.nic.mparivahan.LLServices.UI.LlPayment;

public final /* synthetic */ class i1 implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LlPayment f16764a;

    public /* synthetic */ i1(LlPayment llPayment) {
        this.f16764a = llPayment;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        LlPayment.Y1(this.f16764a, str, str2, str3, str4, j10);
    }
}
