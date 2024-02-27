package zg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity;

public final /* synthetic */ class y implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VahanTransferOfOwnerShipActivity f33190a;

    public /* synthetic */ y(VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity) {
        this.f33190a = vahanTransferOfOwnerShipActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanTransferOfOwnerShipActivity.G1(this.f33190a, datePicker, i10, i11, i12);
    }
}
