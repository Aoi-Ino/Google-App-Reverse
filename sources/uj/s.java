package uj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;

public final /* synthetic */ class s implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DLIdpActivity f31841a;

    public /* synthetic */ s(DLIdpActivity dLIdpActivity) {
        this.f31841a = dLIdpActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        DLIdpActivity.Q2(this.f31841a, datePicker, i10, i11, i12);
    }
}
