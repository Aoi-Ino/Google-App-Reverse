package ei;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanValidateUpdateMobileActivity;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f22990e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f22991f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ VahanValidateUpdateMobileActivity f22992g;

    public /* synthetic */ p(Dialog dialog, int i10, VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
        this.f22990e = dialog;
        this.f22991f = i10;
        this.f22992g = vahanValidateUpdateMobileActivity;
    }

    public final void onClick(View view) {
        VahanValidateUpdateMobileActivity.s2(this.f22990e, this.f22991f, this.f22992g, view);
    }
}
