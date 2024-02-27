package ch;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import cm.u;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerBuyerToGenerateOTPScreen;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f20061e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f20062f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f20063g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ SellerBuyerToGenerateOTPScreen f20064h;

    public /* synthetic */ e(EditText editText, Context context, u uVar, SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen) {
        this.f20061e = editText;
        this.f20062f = context;
        this.f20063g = uVar;
        this.f20064h = sellerBuyerToGenerateOTPScreen;
    }

    public final void onClick(View view) {
        SellerBuyerToGenerateOTPScreen.j3(this.f20061e, this.f20062f, this.f20063g, this.f20064h, view);
    }
}
