package f9;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

public final /* synthetic */ class b0 implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Calendar f11433a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p0 f11434b;

    public /* synthetic */ b0(Calendar calendar, p0 p0Var) {
        this.f11433a = calendar;
        this.f11434b = p0Var;
    }

    public final void onTimeSet(TimePicker timePicker, int i10, int i11) {
        p0.v2(this.f11433a, this.f11434b, timePicker, i10, i11);
    }
}
