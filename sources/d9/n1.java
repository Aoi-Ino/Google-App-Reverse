package d9;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity;
import java.util.Calendar;

public final /* synthetic */ class n1 implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Calendar f9832a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TrafficReportVioActivity f9833b;

    public /* synthetic */ n1(Calendar calendar, TrafficReportVioActivity trafficReportVioActivity) {
        this.f9832a = calendar;
        this.f9833b = trafficReportVioActivity;
    }

    public final void onTimeSet(TimePicker timePicker, int i10, int i11) {
        TrafficReportVioActivity.h2(this.f9832a, this.f9833b, timePicker, i10, i11);
    }
}
