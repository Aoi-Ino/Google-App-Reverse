package zg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.NomineeAndInsuranceDetail;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetail f33187e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f33188f;

    public /* synthetic */ w(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f33187e = nomineeAndInsuranceDetail;
        this.f33188f = onDateSetListener;
    }

    public final void onClick(View view) {
        NomineeAndInsuranceDetail.M1(this.f33187e, this.f33188f, view);
    }
}
