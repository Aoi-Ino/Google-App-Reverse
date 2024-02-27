package ch;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import cm.u;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerBuyerToGenerateOTPScreen;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SellerBuyerToGenerateOTPScreen f20055e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f20056f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f20057g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f20058h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TextView f20059i;

    public /* synthetic */ d(SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen, TextView textView, u uVar, Context context, TextView textView2) {
        this.f20055e = sellerBuyerToGenerateOTPScreen;
        this.f20056f = textView;
        this.f20057g = uVar;
        this.f20058h = context;
        this.f20059i = textView2;
    }

    public final void onClick(View view) {
        SellerBuyerToGenerateOTPScreen.i3(this.f20055e, this.f20056f, this.f20057g, this.f20058h, this.f20059i, view);
    }
}
