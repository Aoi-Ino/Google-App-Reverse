package bj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen;

public final /* synthetic */ class v3 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenseTrainingScreen f19920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f19921b;

    public /* synthetic */ v3(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, int i10) {
        this.f19920a = learnerLicenseTrainingScreen;
        this.f19921b = i10;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        LearnerLicenseTrainingScreen.W2(this.f19920a, this.f19921b, datePicker, i10, i11, i12);
    }
}
