package bj;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.AddLLDrivingSchoolActivity;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AddLLDrivingSchoolActivity f19764e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f19765f;

    public /* synthetic */ c(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f19764e = addLLDrivingSchoolActivity;
        this.f19765f = onDateSetListener;
    }

    public final void onClick(View view) {
        AddLLDrivingSchoolActivity.I1(this.f19764e, this.f19765f, view);
    }
}
