package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;

public final /* synthetic */ class j1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19169e;

    public /* synthetic */ j1(Dialog dialog) {
        this.f19169e = dialog;
    }

    public final void onClick(View view) {
        VahanDmsAPI.v2(this.f19169e, view);
    }
}
