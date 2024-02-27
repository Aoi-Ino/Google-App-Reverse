package gc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlSlotsNext;

public final /* synthetic */ class v0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11828e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlSlotsNext f11829f;

    public /* synthetic */ v0(Dialog dialog, DlSlotsNext dlSlotsNext) {
        this.f11828e = dialog;
        this.f11829f = dlSlotsNext;
    }

    public final void onClick(View view) {
        DlSlotsNext.Q1(this.f11828e, this.f11829f, view);
    }
}
