package fh;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.IsueOfDuplicateMultiServiceTO;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IsueOfDuplicateMultiServiceTO f23506e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f23507f;

    public /* synthetic */ v(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f23506e = isueOfDuplicateMultiServiceTO;
        this.f23507f = onDateSetListener;
    }

    public final void onClick(View view) {
        IsueOfDuplicateMultiServiceTO.A1(this.f23506e, this.f23507f, view);
    }
}
