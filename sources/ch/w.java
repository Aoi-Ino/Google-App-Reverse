package ch;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerValidationWithAadhaar;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f20089e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f20090f;

    public /* synthetic */ w(EditText editText, ImageView imageView) {
        this.f20089e = editText;
        this.f20090f = imageView;
    }

    public final void onClick(View view) {
        SellerValidationWithAadhaar.v2(this.f20089e, this.f20090f, view);
    }
}
