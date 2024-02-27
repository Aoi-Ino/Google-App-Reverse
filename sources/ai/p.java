package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanChangeOfAddress;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19214e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanChangeOfAddress f19215f;

    public /* synthetic */ p(Dialog dialog, VahanChangeOfAddress vahanChangeOfAddress) {
        this.f19214e = dialog;
        this.f19215f = vahanChangeOfAddress;
    }

    public final void onClick(View view) {
        VahanChangeOfAddress.A1(this.f19214e, this.f19215f, view);
    }
}
