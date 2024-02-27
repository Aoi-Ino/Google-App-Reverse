package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;

public final /* synthetic */ class g1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19145e;

    public /* synthetic */ g1(Dialog dialog) {
        this.f19145e = dialog;
    }

    public final void onClick(View view) {
        VahanDmsAPI.z2(this.f19145e, view);
    }
}
