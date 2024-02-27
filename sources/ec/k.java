package ec;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.NewDlScreen.Activity.AddDrivingSchoolActivity;

public final /* synthetic */ class k implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AddDrivingSchoolActivity f11149a;

    public /* synthetic */ k(AddDrivingSchoolActivity addDrivingSchoolActivity) {
        this.f11149a = addDrivingSchoolActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        AddDrivingSchoolActivity.Q1(this.f11149a, datePicker, i10, i11, i12);
    }
}
