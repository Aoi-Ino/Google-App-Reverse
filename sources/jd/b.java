package jd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.ApplicationDetails;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f12836e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ApplicationDetails f12837f;

    public /* synthetic */ b(Dialog dialog, ApplicationDetails applicationDetails) {
        this.f12836e = dialog;
        this.f12837f = applicationDetails;
    }

    public final void onClick(View view) {
        ApplicationDetails.F1(this.f12836e, this.f12837f, view);
    }
}
