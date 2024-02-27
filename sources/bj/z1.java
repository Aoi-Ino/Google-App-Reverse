package bj;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen;

public final /* synthetic */ class z1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19943e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenceAadharScreen f19944f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f19945g;

    public /* synthetic */ z1(EditText editText, LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView) {
        this.f19943e = editText;
        this.f19944f = learnerLicenceAadharScreen;
        this.f19945g = textView;
    }

    public final void onClick(View view) {
        LearnerLicenceAadharScreen.O2(this.f19943e, this.f19944f, this.f19945g, view);
    }
}
