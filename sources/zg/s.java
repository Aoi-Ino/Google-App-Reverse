package zg;

import android.widget.CompoundButton;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.NomineeAndInsuranceDetail;

public final /* synthetic */ class s implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NomineeAndInsuranceDetail f33183e;

    public /* synthetic */ s(NomineeAndInsuranceDetail nomineeAndInsuranceDetail) {
        this.f33183e = nomineeAndInsuranceDetail;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        NomineeAndInsuranceDetail.I1(this.f33183e, compoundButton, z10);
    }
}
