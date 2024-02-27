package bj;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.AddLLDrivingSchoolActivity;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AddLLDrivingSchoolActivity f19757e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f19758f;

    public /* synthetic */ b(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f19757e = addLLDrivingSchoolActivity;
        this.f19758f = onDateSetListener;
    }

    public final void onClick(View view) {
        AddLLDrivingSchoolActivity.T1(this.f19757e, this.f19758f, view);
    }
}
