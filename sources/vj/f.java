package vj;

import android.view.View;
import android.widget.ProgressBar;
import com.nic.mparivahan.dlservices.ui.mobileupdate.SarthiOTPMobile;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ProgressBar f32390e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SarthiOTPMobile f32391f;

    public /* synthetic */ f(ProgressBar progressBar, SarthiOTPMobile sarthiOTPMobile) {
        this.f32390e = progressBar;
        this.f32391f = sarthiOTPMobile;
    }

    public final void onClick(View view) {
        SarthiOTPMobile.W1(this.f32390e, this.f32391f, view);
    }
}
