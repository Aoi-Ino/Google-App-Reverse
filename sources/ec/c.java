package ec;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.Activity.AddDrivingSchoolActivity;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AddDrivingSchoolActivity f11138e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f11139f;

    public /* synthetic */ c(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f11138e = addDrivingSchoolActivity;
        this.f11139f = onDateSetListener;
    }

    public final void onClick(View view) {
        AddDrivingSchoolActivity.I1(this.f11138e, this.f11139f, view);
    }
}
