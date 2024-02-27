package d9;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.Citizen.Activities.TrafficHistoryActivity;

public final /* synthetic */ class e1 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TrafficHistoryActivity f9802a;

    public /* synthetic */ e1(TrafficHistoryActivity trafficHistoryActivity) {
        this.f9802a = trafficHistoryActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        TrafficHistoryActivity.E1(this.f9802a, datePicker, i10, i11, i12);
    }
}
