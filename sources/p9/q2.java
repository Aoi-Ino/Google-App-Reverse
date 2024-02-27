package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.ClSlotsAcknow;

public final /* synthetic */ class q2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14867e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ClSlotsAcknow f14868f;

    public /* synthetic */ q2(Dialog dialog, ClSlotsAcknow clSlotsAcknow) {
        this.f14867e = dialog;
        this.f14868f = clSlotsAcknow;
    }

    public final void onClick(View view) {
        ClSlotsAcknow.W1(this.f14867e, this.f14868f, view);
    }
}
