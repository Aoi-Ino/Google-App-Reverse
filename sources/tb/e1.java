package tb;

import android.webkit.DownloadListener;
import com.nic.mparivahan.LLServices.UI.LlPayment;

public final /* synthetic */ class e1 implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LlPayment f16742a;

    public /* synthetic */ e1(LlPayment llPayment) {
        this.f16742a = llPayment;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        LlPayment.B1(this.f16742a, str, str2, str3, str4, j10);
    }
}
