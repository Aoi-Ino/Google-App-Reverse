package ah;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToGenerateOTPScreenForResult;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19060e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f19061f;

    public /* synthetic */ g(EditText editText, ImageView imageView) {
        this.f19060e = editText;
        this.f19061f = imageView;
    }

    public final void onClick(View view) {
        ToGenerateOTPScreenForResult.g3(this.f19060e, this.f19061f, view);
    }
}
