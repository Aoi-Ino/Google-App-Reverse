package fj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f23535e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DLServiceAcknowlegementActivity f23536f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f23537g;

    public /* synthetic */ f(Dialog dialog, DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, String str) {
        this.f23535e = dialog;
        this.f23536f = dLServiceAcknowlegementActivity;
        this.f23537g = str;
    }

    public final void onClick(View view) {
        DLServiceAcknowlegementActivity.u2(this.f23535e, this.f23536f, this.f23537g, view);
    }
}
