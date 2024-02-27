package fh;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.IsueOfDuplicateMultiServiceTO;

public final /* synthetic */ class u implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IsueOfDuplicateMultiServiceTO f23505a;

    public /* synthetic */ u(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO) {
        this.f23505a = isueOfDuplicateMultiServiceTO;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        IsueOfDuplicateMultiServiceTO.z1(this.f23505a, datePicker, i10, i11, i12);
    }
}
