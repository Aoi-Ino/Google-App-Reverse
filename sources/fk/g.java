package fk;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DlRenewalSlotsActivity f23570e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f23571f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f23572g;

    public /* synthetic */ g(DlRenewalSlotsActivity dlRenewalSlotsActivity, int i10, Dialog dialog) {
        this.f23570e = dlRenewalSlotsActivity;
        this.f23571f = i10;
        this.f23572g = dialog;
    }

    public final void onClick(View view) {
        DlRenewalSlotsActivity.d2(this.f23570e, this.f23571f, this.f23572g, view);
    }
}
