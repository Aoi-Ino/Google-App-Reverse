package gj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.ui.appcancel.ApplicationCancel;

public final /* synthetic */ class e implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApplicationCancel f23730a;

    public /* synthetic */ e(ApplicationCancel applicationCancel) {
        this.f23730a = applicationCancel;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        ApplicationCancel.k1(this.f23730a, datePicker, i10, i11, i12);
    }
}
