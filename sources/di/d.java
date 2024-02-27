package di;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanConfirmUpdateMobileActivity;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f22860e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VahanConfirmUpdateMobileActivity f22861f;

    public /* synthetic */ d(EditText editText, VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity) {
        this.f22860e = editText;
        this.f22861f = vahanConfirmUpdateMobileActivity;
    }

    public final void onClick(View view) {
        VahanConfirmUpdateMobileActivity.p2(this.f22860e, this.f22861f, view);
    }
}
