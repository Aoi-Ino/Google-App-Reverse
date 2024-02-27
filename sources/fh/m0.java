package fh;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipConfirmationScreen;

public final /* synthetic */ class m0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f23494e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TransferOfOwnerShipConfirmationScreen f23495f;

    public /* synthetic */ m0(Dialog dialog, TransferOfOwnerShipConfirmationScreen transferOfOwnerShipConfirmationScreen) {
        this.f23494e = dialog;
        this.f23495f = transferOfOwnerShipConfirmationScreen;
    }

    public final void onClick(View view) {
        TransferOfOwnerShipConfirmationScreen.o1(this.f23494e, this.f23495f, view);
    }
}
