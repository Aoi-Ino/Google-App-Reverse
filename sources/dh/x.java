package dh;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.HypothecationAdditionActivityMultiServiceTO;

public final /* synthetic */ class x implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HypothecationAdditionActivityMultiServiceTO f22835a;

    public /* synthetic */ x(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO) {
        this.f22835a = hypothecationAdditionActivityMultiServiceTO;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        HypothecationAdditionActivityMultiServiceTO.F1(this.f22835a, datePicker, i10, i11, i12);
    }
}
