package jd;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.OtpVerification;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f12847e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f12848f;

    public /* synthetic */ l(EditText editText, ImageView imageView) {
        this.f12847e = editText;
        this.f12848f = imageView;
    }

    public final void onClick(View view) {
        OtpVerification.J1(this.f12847e, this.f12848f, view);
    }
}
