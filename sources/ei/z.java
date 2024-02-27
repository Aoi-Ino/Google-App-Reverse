package ei;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanValidateUpdateMobileActivity;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f23005e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanValidateUpdateMobileActivity f23006f;

    public /* synthetic */ z(EditText editText, VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity) {
        this.f23005e = editText;
        this.f23006f = vahanValidateUpdateMobileActivity;
    }

    public final void onClick(View view) {
        VahanValidateUpdateMobileActivity.A2(this.f23005e, this.f23006f, view);
    }
}
