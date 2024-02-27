package gd;

import android.webkit.DownloadListener;
import com.nic.mparivahan.Sarathithreeservices.view.DownloadApplicationActivity;

public final /* synthetic */ class c0 implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DownloadApplicationActivity f11857a;

    public /* synthetic */ c0(DownloadApplicationActivity downloadApplicationActivity) {
        this.f11857a = downloadApplicationActivity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        DownloadApplicationActivity.G1(this.f11857a, str, str2, str3, str4, j10);
    }
}
