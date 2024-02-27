package bj;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen;

public final /* synthetic */ class y1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenceAadharScreen f19935e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f19936f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f19937g;

    public /* synthetic */ y1(LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView, TextView textView2) {
        this.f19935e = learnerLicenceAadharScreen;
        this.f19936f = textView;
        this.f19937g = textView2;
    }

    public final void onClick(View view) {
        LearnerLicenceAadharScreen.N2(this.f19935e, this.f19936f, this.f19937g, view);
    }
}
