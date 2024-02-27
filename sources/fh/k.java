package fh;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.HypothecationTerminationActivityMultiServiceTO;

public final /* synthetic */ class k implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HypothecationTerminationActivityMultiServiceTO f23488a;

    public /* synthetic */ k(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO) {
        this.f23488a = hypothecationTerminationActivityMultiServiceTO;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        HypothecationTerminationActivityMultiServiceTO.E1(this.f23488a, datePicker, i10, i11, i12);
    }
}
