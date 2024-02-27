package dh;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer;

public final /* synthetic */ class s0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f22825e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f22826f;

    public /* synthetic */ s0(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f22825e = nomineeAndInsuranceDetailTOBuyer;
        this.f22826f = onDateSetListener;
    }

    public final void onClick(View view) {
        NomineeAndInsuranceDetailTOBuyer.K1(this.f22825e, this.f22826f, view);
    }
}
