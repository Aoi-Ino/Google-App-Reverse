package d9;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.nic.mparivahan.Citizen.Activities.AccidentReportActivity;
import java.util.Calendar;

public final /* synthetic */ class y implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Calendar f9866a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AccidentReportActivity f9867b;

    public /* synthetic */ y(Calendar calendar, AccidentReportActivity accidentReportActivity) {
        this.f9866a = calendar;
        this.f9867b = accidentReportActivity;
    }

    public final void onTimeSet(TimePicker timePicker, int i10, int i11) {
        AccidentReportActivity.W1(this.f9866a, this.f9867b, timePicker, i10, i11);
    }
}
