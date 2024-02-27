package tg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.ChangeOfAddressMultiService;

public final /* synthetic */ class o implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChangeOfAddressMultiService f31384a;

    public /* synthetic */ o(ChangeOfAddressMultiService changeOfAddressMultiService) {
        this.f31384a = changeOfAddressMultiService;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        ChangeOfAddressMultiService.V1(this.f31384a, datePicker, i10, i11, i12);
    }
}
