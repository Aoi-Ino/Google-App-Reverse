package bh;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.TOMultiSelectionScreen;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19445e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TOMultiSelectionScreen f19446f;

    public /* synthetic */ j(Dialog dialog, TOMultiSelectionScreen tOMultiSelectionScreen) {
        this.f19445e = dialog;
        this.f19446f = tOMultiSelectionScreen;
    }

    public final void onClick(View view) {
        TOMultiSelectionScreen.n1(this.f19445e, this.f19446f, view);
    }
}
