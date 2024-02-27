package ij;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f24397e;

    public /* synthetic */ c(Dialog dialog) {
        this.f24397e = dialog;
    }

    public final void onClick(View view) {
        ChangeOfName.d2(this.f24397e, view);
    }
}
