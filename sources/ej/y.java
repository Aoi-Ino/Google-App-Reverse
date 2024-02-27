package ej;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.ViewDocs.ViewDocScreen;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f23044e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ViewDocScreen f23045f;

    public /* synthetic */ y(Dialog dialog, ViewDocScreen viewDocScreen) {
        this.f23044e = dialog;
        this.f23045f = viewDocScreen;
    }

    public final void onClick(View view) {
        ViewDocScreen.p1(this.f23044e, this.f23045f, view);
    }
}
