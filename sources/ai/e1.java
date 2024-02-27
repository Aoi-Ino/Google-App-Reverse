package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;

public final /* synthetic */ class e1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19127e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanDmsAPI f19128f;

    public /* synthetic */ e1(Dialog dialog, VahanDmsAPI vahanDmsAPI) {
        this.f19127e = dialog;
        this.f19128f = vahanDmsAPI;
    }

    public final void onClick(View view) {
        VahanDmsAPI.B2(this.f19127e, this.f19128f, view);
    }
}
