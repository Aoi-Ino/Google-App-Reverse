package zg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.NomineeAndInsuranceDetail;

public final /* synthetic */ class o implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetail f33178a;

    public /* synthetic */ o(NomineeAndInsuranceDetail nomineeAndInsuranceDetail) {
        this.f33178a = nomineeAndInsuranceDetail;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        NomineeAndInsuranceDetail.F1(this.f33178a, datePicker, i10, i11, i12);
    }
}
