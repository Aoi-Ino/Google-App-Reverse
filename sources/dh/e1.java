package dh;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen;

public final /* synthetic */ class e1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f22788e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TOBuyerSelectionScreen f22789f;

    public /* synthetic */ e1(Dialog dialog, TOBuyerSelectionScreen tOBuyerSelectionScreen) {
        this.f22788e = dialog;
        this.f22789f = tOBuyerSelectionScreen;
    }

    public final void onClick(View view) {
        TOBuyerSelectionScreen.n1(this.f22788e, this.f22789f, view);
    }
}
