package fj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f23544e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DLServiceAcknowlegementActivity f23545f;

    public /* synthetic */ m(Dialog dialog, DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity) {
        this.f23544e = dialog;
        this.f23545f = dLServiceAcknowlegementActivity;
    }

    public final void onClick(View view) {
        DLServiceAcknowlegementActivity.q2(this.f23544e, this.f23545f, view);
    }
}
