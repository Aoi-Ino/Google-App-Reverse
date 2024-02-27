package qg;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f30600e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanMultiServiceConfirmationScreen f30601f;

    public /* synthetic */ a(Dialog dialog, VahanMultiServiceConfirmationScreen vahanMultiServiceConfirmationScreen) {
        this.f30600e = dialog;
        this.f30601f = vahanMultiServiceConfirmationScreen;
    }

    public final void onClick(View view) {
        VahanMultiServiceConfirmationScreen.l1(this.f30600e, this.f30601f, view);
    }
}
