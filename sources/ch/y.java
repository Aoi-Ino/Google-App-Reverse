package ch;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerValidationWithAadhaar;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f20094e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SellerValidationWithAadhaar f20095f;

    public /* synthetic */ y(EditText editText, SellerValidationWithAadhaar sellerValidationWithAadhaar) {
        this.f20094e = editText;
        this.f20095f = sellerValidationWithAadhaar;
    }

    public final void onClick(View view) {
        SellerValidationWithAadhaar.x2(this.f20094e, this.f20095f, view);
    }
}
