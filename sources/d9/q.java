package d9;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.Citizen.Activities.AccidentHistoryActivity;

public final /* synthetic */ class q implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccidentHistoryActivity f9842a;

    public /* synthetic */ q(AccidentHistoryActivity accidentHistoryActivity) {
        this.f9842a = accidentHistoryActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        AccidentHistoryActivity.E1(this.f9842a, datePicker, i10, i11, i12);
    }
}
