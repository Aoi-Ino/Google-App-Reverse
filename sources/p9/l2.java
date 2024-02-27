package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.ClSlotsAcknow;

public final /* synthetic */ class l2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14834e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ClSlotsAcknow f14835f;

    public /* synthetic */ l2(Dialog dialog, ClSlotsAcknow clSlotsAcknow) {
        this.f14834e = dialog;
        this.f14835f = clSlotsAcknow;
    }

    public final void onClick(View view) {
        ClSlotsAcknow.Y1(this.f14834e, this.f14835f, view);
    }
}
