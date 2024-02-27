package tj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;

public final /* synthetic */ class e implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HillReligion f31660a;

    public /* synthetic */ e(HillReligion hillReligion) {
        this.f31660a = hillReligion;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        HillReligion.m2(this.f31660a, datePicker, i10, i11, i12);
    }
}
