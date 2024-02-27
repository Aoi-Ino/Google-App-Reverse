package ch;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerValidationWithAadhaar;

public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SellerValidationWithAadhaar f20091e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f20092f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f20093g;

    public /* synthetic */ x(SellerValidationWithAadhaar sellerValidationWithAadhaar, TextView textView, TextView textView2) {
        this.f20091e = sellerValidationWithAadhaar;
        this.f20092f = textView;
        this.f20093g = textView2;
    }

    public final void onClick(View view) {
        SellerValidationWithAadhaar.w2(this.f20091e, this.f20092f, this.f20093g, view);
    }
}
