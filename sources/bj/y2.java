package bj;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceDownloadActivity;

public final /* synthetic */ class y2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenceDownloadActivity f19938e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f19939f;

    public /* synthetic */ y2(LearnerLicenceDownloadActivity learnerLicenceDownloadActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f19938e = learnerLicenceDownloadActivity;
        this.f19939f = onDateSetListener;
    }

    public final void onClick(View view) {
        LearnerLicenceDownloadActivity.t1(this.f19938e, this.f19939f, view);
    }
}
