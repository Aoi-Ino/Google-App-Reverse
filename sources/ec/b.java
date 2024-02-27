package ec;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.Activity.AddDrivingSchoolActivity;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AddDrivingSchoolActivity f11135e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f11136f;

    public /* synthetic */ b(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f11135e = addDrivingSchoolActivity;
        this.f11136f = onDateSetListener;
    }

    public final void onClick(View view) {
        AddDrivingSchoolActivity.T1(this.f11135e, this.f11136f, view);
    }
}
