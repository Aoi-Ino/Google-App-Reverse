package fj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DLServiceAcknowlegementActivity f23530e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Dialog f23531f;

    public /* synthetic */ d(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, Dialog dialog) {
        this.f23530e = dLServiceAcknowlegementActivity;
        this.f23531f = dialog;
    }

    public final void onClick(View view) {
        DLServiceAcknowlegementActivity.o2(this.f23530e, this.f23531f, view);
    }
}
