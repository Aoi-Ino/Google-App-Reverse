package bj;

import android.view.View;
import android.widget.RadioButton;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen;

public final /* synthetic */ class p3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19872e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19873f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenseTrainingScreen f19874g;

    public /* synthetic */ p3(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
        this.f19872e = radioButton;
        this.f19873f = radioButton2;
        this.f19874g = learnerLicenseTrainingScreen;
    }

    public final void onClick(View view) {
        LearnerLicenseTrainingScreen.B2(this.f19872e, this.f19873f, this.f19874g, view);
    }
}
