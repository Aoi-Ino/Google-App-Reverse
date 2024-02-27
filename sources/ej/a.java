package ej;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppDetailsScreen;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f23007e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AppDetailsScreen f23008f;

    public /* synthetic */ a(Dialog dialog, AppDetailsScreen appDetailsScreen) {
        this.f23007e = dialog;
        this.f23008f = appDetailsScreen;
    }

    public final void onClick(View view) {
        AppDetailsScreen.L1(this.f23007e, this.f23008f, view);
    }
}
