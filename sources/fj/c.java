package fj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DLServiceAcknowlegementActivity f23528e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Dialog f23529f;

    public /* synthetic */ c(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, Dialog dialog) {
        this.f23528e = dLServiceAcknowlegementActivity;
        this.f23529f = dialog;
    }

    public final void onClick(View view) {
        DLServiceAcknowlegementActivity.n2(this.f23528e, this.f23529f, view);
    }
}
