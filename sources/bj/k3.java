package bj;

import android.app.Dialog;
import android.view.View;
import android.widget.CheckBox;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen;

public final /* synthetic */ class k3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenseTrainingScreen f19831e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CheckBox f19832f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f19833g;

    public /* synthetic */ k3(LearnerLicenseTrainingScreen learnerLicenseTrainingScreen, CheckBox checkBox, Dialog dialog) {
        this.f19831e = learnerLicenseTrainingScreen;
        this.f19832f = checkBox;
        this.f19833g = dialog;
    }

    public final void onClick(View view) {
        LearnerLicenseTrainingScreen.K2(this.f19831e, this.f19832f, this.f19833g, view);
    }
}
