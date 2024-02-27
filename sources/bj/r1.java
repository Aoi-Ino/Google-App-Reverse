package bj;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen;

public final /* synthetic */ class r1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LearnerLicenceAadharScreen f19887e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f19888f;

    public /* synthetic */ r1(LearnerLicenceAadharScreen learnerLicenceAadharScreen, EditText editText) {
        this.f19887e = learnerLicenceAadharScreen;
        this.f19888f = editText;
    }

    public final void onClick(View view) {
        LearnerLicenceAadharScreen.T2(this.f19887e, this.f19888f, view);
    }
}
