package wd;

import android.webkit.DownloadListener;
import com.nic.mparivahan.VahanServices.DownloadReceipt;

public final /* synthetic */ class v implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DownloadReceipt f32552a;

    public /* synthetic */ v(DownloadReceipt downloadReceipt) {
        this.f32552a = downloadReceipt;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        DownloadReceipt.h1(this.f32552a, str, str2, str3, str4, j10);
    }
}
