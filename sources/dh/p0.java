package dh;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer;

public final /* synthetic */ class p0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f22818e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f22819f;

    public /* synthetic */ p0(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f22818e = nomineeAndInsuranceDetailTOBuyer;
        this.f22819f = onDateSetListener;
    }

    public final void onClick(View view) {
        NomineeAndInsuranceDetailTOBuyer.S1(this.f22818e, this.f22819f, view);
    }
}
