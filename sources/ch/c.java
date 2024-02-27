package ch;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerBuyerToGenerateOTPScreen;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f20052e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f20053f;

    public /* synthetic */ c(EditText editText, ImageView imageView) {
        this.f20052e = editText;
        this.f20053f = imageView;
    }

    public final void onClick(View view) {
        SellerBuyerToGenerateOTPScreen.h3(this.f20052e, this.f20053f, view);
    }
}
