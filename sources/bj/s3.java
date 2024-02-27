package bj;

import android.view.View;
import android.widget.RadioButton;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen;

public final /* synthetic */ class s3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19897e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19898f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenseTrainingScreen f19899g;

    public /* synthetic */ s3(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
        this.f19897e = radioButton;
        this.f19898f = radioButton2;
        this.f19899g = learnerLicenseTrainingScreen;
    }

    public final void onClick(View view) {
        LearnerLicenseTrainingScreen.E2(this.f19897e, this.f19898f, this.f19899g, view);
    }
}
