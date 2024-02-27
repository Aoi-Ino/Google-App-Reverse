package bj;

import android.view.View;
import android.widget.RadioButton;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen;

public final /* synthetic */ class l3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19840e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19841f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenseTrainingScreen f19842g;

    public /* synthetic */ l3(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
        this.f19840e = radioButton;
        this.f19841f = radioButton2;
        this.f19842g = learnerLicenseTrainingScreen;
    }

    public final void onClick(View view) {
        LearnerLicenseTrainingScreen.y2(this.f19840e, this.f19841f, this.f19842g, view);
    }
}
