package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;

public final /* synthetic */ class d1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19119e;

    public /* synthetic */ d1(Dialog dialog) {
        this.f19119e = dialog;
    }

    public final void onClick(View view) {
        VahanDmsAPI.D2(this.f19119e, view);
    }
}
