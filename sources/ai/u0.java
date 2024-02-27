package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanDms;

public final /* synthetic */ class u0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19270e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanDms f19271f;

    public /* synthetic */ u0(Dialog dialog, VahanDms vahanDms) {
        this.f19270e = dialog;
        this.f19271f = vahanDms;
    }

    public final void onClick(View view) {
        VahanDms.Z1(this.f19270e, this.f19271f, view);
    }
}
