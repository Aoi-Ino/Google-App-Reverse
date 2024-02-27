package zg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.NomineeAndInsuranceDetail;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetail f33179e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f33180f;

    public /* synthetic */ p(NomineeAndInsuranceDetail nomineeAndInsuranceDetail, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f33179e = nomineeAndInsuranceDetail;
        this.f33180f = onDateSetListener;
    }

    public final void onClick(View view) {
        NomineeAndInsuranceDetail.G1(this.f33179e, this.f33180f, view);
    }
}
