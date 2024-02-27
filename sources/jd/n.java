package jd;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.OtpVerification;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ OtpVerification f12852e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f12853f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f12854g;

    public /* synthetic */ n(OtpVerification otpVerification, EditText editText, Dialog dialog) {
        this.f12852e = otpVerification;
        this.f12853f = editText;
        this.f12854g = dialog;
    }

    public final void onClick(View view) {
        OtpVerification.L1(this.f12852e, this.f12853f, this.f12854g, view);
    }
}
