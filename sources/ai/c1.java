package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;

public final /* synthetic */ class c1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19111e;

    public /* synthetic */ c1(Dialog dialog) {
        this.f19111e = dialog;
    }

    public final void onClick(View view) {
        VahanDmsAPI.x2(this.f19111e, view);
    }
}
