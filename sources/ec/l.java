package ec;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.Activity.AddDrivingSchoolActivity;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AddDrivingSchoolActivity f11150e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f11151f;

    public /* synthetic */ l(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f11150e = addDrivingSchoolActivity;
        this.f11151f = onDateSetListener;
    }

    public final void onClick(View view) {
        AddDrivingSchoolActivity.R1(this.f11150e, this.f11151f, view);
    }
}
