package u9;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.ClServicesMainScreens.MobileOtpScreen;

public final /* synthetic */ class r0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MobileOtpScreen f17060e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f17061f;

    public /* synthetic */ r0(MobileOtpScreen mobileOtpScreen, EditText editText) {
        this.f17060e = mobileOtpScreen;
        this.f17061f = editText;
    }

    public final void onClick(View view) {
        MobileOtpScreen.t2(this.f17060e, this.f17061f, view);
    }
}
