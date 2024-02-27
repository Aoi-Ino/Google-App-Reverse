package dh;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer;

public final /* synthetic */ class y0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f22839a;

    public /* synthetic */ y0(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer) {
        this.f22839a = nomineeAndInsuranceDetailTOBuyer;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        NomineeAndInsuranceDetailTOBuyer.P1(this.f22839a, datePicker, i10, i11, i12);
    }
}
