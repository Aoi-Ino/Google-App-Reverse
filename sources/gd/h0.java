package gd;

import android.webkit.DownloadListener;
import com.nic.mparivahan.Sarathithreeservices.view.ReprintReceipt;

public final /* synthetic */ class h0 implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReprintReceipt f11874a;

    public /* synthetic */ h0(ReprintReceipt reprintReceipt) {
        this.f11874a = reprintReceipt;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        ReprintReceipt.m1(this.f11874a, str, str2, str3, str4, j10);
    }
}
