package zg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.NomineeAndInsuranceDetail;

public final /* synthetic */ class v implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetail f33186a;

    public /* synthetic */ v(NomineeAndInsuranceDetail nomineeAndInsuranceDetail) {
        this.f33186a = nomineeAndInsuranceDetail;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        NomineeAndInsuranceDetail.L1(this.f33186a, datePicker, i10, i11, i12);
    }
}
