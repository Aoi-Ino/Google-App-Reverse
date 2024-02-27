package ai;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanView.VahanChangeOfAddress;

public final /* synthetic */ class u implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VahanChangeOfAddress f19269a;

    public /* synthetic */ u(VahanChangeOfAddress vahanChangeOfAddress) {
        this.f19269a = vahanChangeOfAddress;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanChangeOfAddress.T1(this.f19269a, datePicker, i10, i11, i12);
    }
}
