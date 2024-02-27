package md;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sos.SosHomeScreen;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14042e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SosHomeScreen f14043f;

    public /* synthetic */ u(Dialog dialog, SosHomeScreen sosHomeScreen) {
        this.f14042e = dialog;
        this.f14043f = sosHomeScreen;
    }

    public final void onClick(View view) {
        SosHomeScreen.O1(this.f14042e, this.f14043f, view);
    }
}
