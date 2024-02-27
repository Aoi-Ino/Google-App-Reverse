package gc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlSlotsNext;

public final /* synthetic */ class r0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11816e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlSlotsNext f11817f;

    public /* synthetic */ r0(Dialog dialog, DlSlotsNext dlSlotsNext) {
        this.f11816e = dialog;
        this.f11817f = dlSlotsNext;
    }

    public final void onClick(View view) {
        DlSlotsNext.S1(this.f11816e, this.f11817f, view);
    }
}
