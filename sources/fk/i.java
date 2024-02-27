package fk;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.slots.DlSlotsAcknowActivity;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f23584e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlSlotsAcknowActivity f23585f;

    public /* synthetic */ i(Dialog dialog, DlSlotsAcknowActivity dlSlotsAcknowActivity) {
        this.f23584e = dialog;
        this.f23585f = dlSlotsAcknowActivity;
    }

    public final void onClick(View view) {
        DlSlotsAcknowActivity.U1(this.f23584e, this.f23585f, view);
    }
}
