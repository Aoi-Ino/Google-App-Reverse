package dh;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.IssueOfDuplicateMultiServiceToBuyer;

public final /* synthetic */ class i0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IssueOfDuplicateMultiServiceToBuyer f22800a;

    public /* synthetic */ i0(IssueOfDuplicateMultiServiceToBuyer issueOfDuplicateMultiServiceToBuyer) {
        this.f22800a = issueOfDuplicateMultiServiceToBuyer;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        IssueOfDuplicateMultiServiceToBuyer.z1(this.f22800a, datePicker, i10, i11, i12);
    }
}
