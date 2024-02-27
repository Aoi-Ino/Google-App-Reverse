package fh;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller;

public final /* synthetic */ class a0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferOfOwnerShipActivitySeller f23468a;

    public /* synthetic */ a0(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
        this.f23468a = transferOfOwnerShipActivitySeller;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        TransferOfOwnerShipActivitySeller.L1(this.f23468a, datePicker, i10, i11, i12);
    }
}
