package oj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;

public final /* synthetic */ class m implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DobChangeActivity f30120a;

    public /* synthetic */ m(DobChangeActivity dobChangeActivity) {
        this.f30120a = dobChangeActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        DobChangeActivity.h2(this.f30120a, datePicker, i10, i11, i12);
    }
}
