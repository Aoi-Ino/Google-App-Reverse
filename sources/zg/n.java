package zg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.NomineeAndInsuranceDetail;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetail f33176e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f33177f;

    public /* synthetic */ n(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f33176e = nomineeAndInsuranceDetail;
        this.f33177f = onDateSetListener;
    }

    public final void onClick(View view) {
        NomineeAndInsuranceDetail.O1(this.f33176e, this.f33177f, view);
    }
}
