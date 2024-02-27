package uj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;

public final /* synthetic */ class o implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DLIdpActivity f31836a;

    public /* synthetic */ o(DLIdpActivity dLIdpActivity) {
        this.f31836a = dLIdpActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        DLIdpActivity.S2(this.f31836a, datePicker, i10, i11, i12);
    }
}
