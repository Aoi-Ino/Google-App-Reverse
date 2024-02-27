package u8;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Account.View.CreateAccountScreen;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16994e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CreateAccountScreen f16995f;

    public /* synthetic */ o(Dialog dialog, CreateAccountScreen createAccountScreen) {
        this.f16994e = dialog;
        this.f16995f = createAccountScreen;
    }

    public final void onClick(View view) {
        CreateAccountScreen.p1(this.f16994e, this.f16995f, view);
    }
}
