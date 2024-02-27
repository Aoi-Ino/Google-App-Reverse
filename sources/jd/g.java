package jd;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.ApplicationDetails;

public final /* synthetic */ class g implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApplicationDetails f12842a;

    public /* synthetic */ g(ApplicationDetails applicationDetails) {
        this.f12842a = applicationDetails;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        ApplicationDetails.t1(this.f12842a, datePicker, i10, i11, i12);
    }
}
