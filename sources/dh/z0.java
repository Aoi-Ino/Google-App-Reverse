package dh;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer;

public final /* synthetic */ class z0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f22841e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f22842f;

    public /* synthetic */ z0(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f22841e = nomineeAndInsuranceDetailTOBuyer;
        this.f22842f = onDateSetListener;
    }

    public final void onClick(View view) {
        NomineeAndInsuranceDetailTOBuyer.Q1(this.f22841e, this.f22842f, view);
    }
}
