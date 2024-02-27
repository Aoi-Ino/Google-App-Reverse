package jd;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.OtpVerification;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ OtpVerification f12849e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f12850f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f12851g;

    public /* synthetic */ m(OtpVerification otpVerification, TextView textView, TextView textView2) {
        this.f12849e = otpVerification;
        this.f12850f = textView;
        this.f12851g = textView2;
    }

    public final void onClick(View view) {
        OtpVerification.K1(this.f12849e, this.f12850f, this.f12851g, view);
    }
}
