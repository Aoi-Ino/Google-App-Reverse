package ej;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen;

public final /* synthetic */ class s implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppNumberScreen f23030a;

    public /* synthetic */ s(AppNumberScreen appNumberScreen) {
        this.f23030a = appNumberScreen;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        AppNumberScreen.S1(this.f23030a, datePicker, i10, i11, i12);
    }
}
