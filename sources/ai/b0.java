package ai;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;

public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19098e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanCommonConfirmationScreen f19099f;

    public /* synthetic */ b0(Dialog dialog, VahanCommonConfirmationScreen vahanCommonConfirmationScreen) {
        this.f19098e = dialog;
        this.f19099f = vahanCommonConfirmationScreen;
    }

    public final void onClick(View view) {
        VahanCommonConfirmationScreen.l1(this.f19098e, this.f19099f, view);
    }
}
