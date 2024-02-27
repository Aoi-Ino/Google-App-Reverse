package ec;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.Activity.AddDrivingSchoolActivity;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AddDrivingSchoolActivity f11152e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f11153f;

    public /* synthetic */ m(AddDrivingSchoolActivity addDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f11152e = addDrivingSchoolActivity;
        this.f11153f = onDateSetListener;
    }

    public final void onClick(View view) {
        AddDrivingSchoolActivity.S1(this.f11152e, this.f11153f, view);
    }
}
