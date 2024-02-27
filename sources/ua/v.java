package ua;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Dl.DLDashboardNew;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17188e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DLDashboardNew f17189f;

    public /* synthetic */ v(Dialog dialog, DLDashboardNew dLDashboardNew) {
        this.f17188e = dialog;
        this.f17189f = dLDashboardNew;
    }

    public final void onClick(View view) {
        DLDashboardNew.g3(this.f17188e, this.f17189f, view);
    }
}
