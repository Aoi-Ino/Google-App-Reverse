package bj;

import android.view.View;
import android.widget.RadioButton;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTrainingScreen;

public final /* synthetic */ class r3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19890e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RadioButton f19891f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenseTrainingScreen f19892g;

    public /* synthetic */ r3(RadioButton radioButton, RadioButton radioButton2, LearnerLicenseTrainingScreen learnerLicenseTrainingScreen) {
        this.f19890e = radioButton;
        this.f19891f = radioButton2;
        this.f19892g = learnerLicenseTrainingScreen;
    }

    public final void onClick(View view) {
        LearnerLicenseTrainingScreen.D2(this.f19890e, this.f19891f, this.f19892g, view);
    }
}
