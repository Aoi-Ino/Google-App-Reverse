package f9;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

public final /* synthetic */ class x implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Calendar f11544a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f11545b;

    public /* synthetic */ x(Calendar calendar, y yVar) {
        this.f11544a = calendar;
        this.f11545b = yVar;
    }

    public final void onTimeSet(TimePicker timePicker, int i10, int i11) {
        y.o2(this.f11544a, this.f11545b, timePicker, i10, i11);
    }
}
