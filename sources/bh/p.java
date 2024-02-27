package bh;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.VahanSellerBuyerMainScreen;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19455e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f19456f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f19457g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ VahanSellerBuyerMainScreen f19458h;

    public /* synthetic */ p(Dialog dialog, Context context, String str, VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
        this.f19455e = dialog;
        this.f19456f = context;
        this.f19457g = str;
        this.f19458h = vahanSellerBuyerMainScreen;
    }

    public final void onClick(View view) {
        VahanSellerBuyerMainScreen.y1(this.f19455e, this.f19456f, this.f19457g, this.f19458h, view);
    }
}
