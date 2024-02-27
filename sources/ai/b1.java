package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;

public final /* synthetic */ class b1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19100e;

    public /* synthetic */ b1(Dialog dialog) {
        this.f19100e = dialog;
    }

    public final void onClick(View view) {
        VahanDmsAPI.c3(this.f19100e, view);
    }
}
