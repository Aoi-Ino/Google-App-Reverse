package di;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanConfirmUpdateMobileActivity;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f22870e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f22871f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ VahanConfirmUpdateMobileActivity f22872g;

    public /* synthetic */ m(Dialog dialog, int i10, VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
        this.f22870e = dialog;
        this.f22871f = i10;
        this.f22872g = vahanConfirmUpdateMobileActivity;
    }

    public final void onClick(View view) {
        VahanConfirmUpdateMobileActivity.h2(this.f22870e, this.f22871f, this.f22872g, view);
    }
}
