package d9;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.Citizen.Activities.TrafficHistoryActivity;

public final /* synthetic */ class f1 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TrafficHistoryActivity f9806a;

    public /* synthetic */ f1(TrafficHistoryActivity trafficHistoryActivity) {
        this.f9806a = trafficHistoryActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        TrafficHistoryActivity.C1(this.f9806a, datePicker, i10, i11, i12);
    }
}
