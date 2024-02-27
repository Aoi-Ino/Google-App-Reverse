package dh;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.IssueOfDuplicateMultiServiceToBuyer;

public final /* synthetic */ class j0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IssueOfDuplicateMultiServiceToBuyer f22803e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f22804f;

    public /* synthetic */ j0(IssueOfDuplicateMultiServiceToBuyer issueOfDuplicateMultiServiceToBuyer, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f22803e = issueOfDuplicateMultiServiceToBuyer;
        this.f22804f = onDateSetListener;
    }

    public final void onClick(View view) {
        IssueOfDuplicateMultiServiceToBuyer.A1(this.f22803e, this.f22804f, view);
    }
}
