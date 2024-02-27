package gc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlApplicationScreen;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11770e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlApplicationScreen f11771f;

    public /* synthetic */ c(Dialog dialog, DlApplicationScreen dlApplicationScreen) {
        this.f11770e = dialog;
        this.f11771f = dlApplicationScreen;
    }

    public final void onClick(View view) {
        DlApplicationScreen.z1(this.f11770e, this.f11771f, view);
    }
}
