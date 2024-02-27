package bh;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.VahanSellerBuyerMainScreen;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19451e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f19452f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f19453g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ VahanSellerBuyerMainScreen f19454h;

    public /* synthetic */ o(Dialog dialog, Context context, String str, VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
        this.f19451e = dialog;
        this.f19452f = context;
        this.f19453g = str;
        this.f19454h = vahanSellerBuyerMainScreen;
    }

    public final void onClick(View view) {
        VahanSellerBuyerMainScreen.x1(this.f19451e, this.f19452f, this.f19453g, this.f19454h, view);
    }
}
