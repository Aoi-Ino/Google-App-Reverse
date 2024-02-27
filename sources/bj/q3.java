package bj;

import android.view.View;
import android.widget.RadioButton;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen;

public final /* synthetic */ class q3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19882e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19883f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenseTrainingScreen f19884g;

    public /* synthetic */ q3(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
        this.f19882e = radioButton;
        this.f19883f = radioButton2;
        this.f19884g = learnerLicenseTrainingScreen;
    }

    public final void onClick(View view) {
        LearnerLicenseTrainingScreen.C2(this.f19882e, this.f19883f, this.f19884g, view);
    }
}
