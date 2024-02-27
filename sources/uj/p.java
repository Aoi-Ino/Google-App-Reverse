package uj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;

public final /* synthetic */ class p implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DLIdpActivity f31837a;

    public /* synthetic */ p(DLIdpActivity dLIdpActivity) {
        this.f31837a = dLIdpActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        DLIdpActivity.U2(this.f31837a, datePicker, i10, i11, i12);
    }
}
