package fh;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller;

public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TransferOfOwnerShipActivitySeller f23470e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f23471f;

    public /* synthetic */ b0(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f23470e = transferOfOwnerShipActivitySeller;
        this.f23471f = onDateSetListener;
    }

    public final void onClick(View view) {
        TransferOfOwnerShipActivitySeller.M1(this.f23470e, this.f23471f, view);
    }
}
