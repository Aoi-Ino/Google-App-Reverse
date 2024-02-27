package bj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.newlearner.AddLLDrivingSchoolActivity;

public final /* synthetic */ class k implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AddLLDrivingSchoolActivity f19826a;

    public /* synthetic */ k(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity) {
        this.f19826a = addLLDrivingSchoolActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        AddLLDrivingSchoolActivity.Q1(this.f19826a, datePicker, i10, i11, i12);
    }
}
