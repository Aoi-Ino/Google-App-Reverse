package gd;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;

public final /* synthetic */ class y implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApplicationStatusActivity f11912a;

    public /* synthetic */ y(ApplicationStatusActivity applicationStatusActivity) {
        this.f11912a = applicationStatusActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        ApplicationStatusActivity.N1(this.f11912a, datePicker, i10, i11, i12);
    }
}
