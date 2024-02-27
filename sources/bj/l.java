package bj;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.AddLLDrivingSchoolActivity;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AddLLDrivingSchoolActivity f19835e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f19836f;

    public /* synthetic */ l(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f19835e = addLLDrivingSchoolActivity;
        this.f19836f = onDateSetListener;
    }

    public final void onClick(View view) {
        AddLLDrivingSchoolActivity.R1(this.f19835e, this.f19836f, view);
    }
}
