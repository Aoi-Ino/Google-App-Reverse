package bj;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen;

public final /* synthetic */ class q1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenceAadharScreen f19878e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f19879f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f19880g;

    public /* synthetic */ q1(LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView, TextView textView2) {
        this.f19878e = learnerLicenceAadharScreen;
        this.f19879f = textView;
        this.f19880g = textView2;
    }

    public final void onClick(View view) {
        LearnerLicenceAadharScreen.S2(this.f19878e, this.f19879f, this.f19880g, view);
    }
}
