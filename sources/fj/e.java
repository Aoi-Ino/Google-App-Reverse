package fj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f23532e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DLServiceAcknowlegementActivity f23533f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f23534g;

    public /* synthetic */ e(Dialog dialog, DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, String str) {
        this.f23532e = dialog;
        this.f23533f = dLServiceAcknowlegementActivity;
        this.f23534g = str;
    }

    public final void onClick(View view) {
        DLServiceAcknowlegementActivity.s2(this.f23532e, this.f23533f, this.f23534g, view);
    }
}
