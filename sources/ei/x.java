package ei;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanValidateUpdateMobileActivity;

public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f23000e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f23001f;

    public /* synthetic */ x(EditText editText, ImageView imageView) {
        this.f23000e = editText;
        this.f23001f = imageView;
    }

    public final void onClick(View view) {
        VahanValidateUpdateMobileActivity.y2(this.f23000e, this.f23001f, view);
    }
}
