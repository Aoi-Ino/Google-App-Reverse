package s9;

import android.view.View;
import android.widget.ProgressBar;
import com.nic.mparivahan.ClServices.View.clobileupdate.ClOTPMobile;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ProgressBar f16069e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ClOTPMobile f16070f;

    public /* synthetic */ d(ProgressBar progressBar, ClOTPMobile clOTPMobile) {
        this.f16069e = progressBar;
        this.f16070f = clOTPMobile;
    }

    public final void onClick(View view) {
        ClOTPMobile.V1(this.f16069e, this.f16070f, view);
    }
}
