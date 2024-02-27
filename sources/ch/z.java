package ch;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerValidationWithAadhaar;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f20096e;

    public /* synthetic */ z(EditText editText) {
        this.f20096e = editText;
    }

    public final void onClick(View view) {
        SellerValidationWithAadhaar.y2(this.f20096e, view);
    }
}
