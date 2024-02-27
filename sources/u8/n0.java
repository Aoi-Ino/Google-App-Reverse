package u8;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Account.View.SignInScreen;

public final /* synthetic */ class n0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16992e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SignInScreen f16993f;

    public /* synthetic */ n0(Dialog dialog, SignInScreen signInScreen) {
        this.f16992e = dialog;
        this.f16993f = signInScreen;
    }

    public final void onClick(View view) {
        SignInScreen.s1(this.f16992e, this.f16993f, view);
    }
}
