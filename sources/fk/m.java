package fk;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.slots.DlSlotsAcknowActivity;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f23589e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlSlotsAcknowActivity f23590f;

    public /* synthetic */ m(Dialog dialog, DlSlotsAcknowActivity dlSlotsAcknowActivity) {
        this.f23589e = dialog;
        this.f23590f = dlSlotsAcknowActivity;
    }

    public final void onClick(View view) {
        DlSlotsAcknowActivity.S1(this.f23589e, this.f23590f, view);
    }
}
