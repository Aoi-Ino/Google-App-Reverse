package bj;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.AddLLDrivingSchoolActivity;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AddLLDrivingSchoolActivity f19844e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f19845f;

    public /* synthetic */ m(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f19844e = addLLDrivingSchoolActivity;
        this.f19845f = onDateSetListener;
    }

    public final void onClick(View view) {
        AddLLDrivingSchoolActivity.S1(this.f19844e, this.f19845f, view);
    }
}
