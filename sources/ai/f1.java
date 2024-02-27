package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;

public final /* synthetic */ class f1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19136e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanDmsAPI f19137f;

    public /* synthetic */ f1(Dialog dialog, VahanDmsAPI vahanDmsAPI) {
        this.f19136e = dialog;
        this.f19137f = vahanDmsAPI;
    }

    public final void onClick(View view) {
        VahanDmsAPI.f3(this.f19136e, this.f19137f, view);
    }
}
