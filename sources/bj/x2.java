package bj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceDownloadActivity;

public final /* synthetic */ class x2 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenceDownloadActivity f19931a;

    public /* synthetic */ x2(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity) {
        this.f19931a = learnerLicenceDownloadActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        LearnerLicenceDownloadActivity.s1(this.f19931a, datePicker, i10, i11, i12);
    }
}
