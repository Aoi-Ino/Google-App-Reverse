package gj;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.dlservices.ui.appcancel.VerifyMobileScreen;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VerifyMobileScreen f23737e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f23738f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f23739g;

    public /* synthetic */ i(VerifyMobileScreen verifyMobileScreen, EditText editText, Dialog dialog) {
        this.f23737e = verifyMobileScreen;
        this.f23738f = editText;
        this.f23739g = dialog;
    }

    public final void onClick(View view) {
        VerifyMobileScreen.U1(this.f23737e, this.f23738f, this.f23739g, view);
    }
}
