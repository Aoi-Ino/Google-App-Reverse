package bj;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen;

public final /* synthetic */ class w1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19924e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f19925f;

    public /* synthetic */ w1(EditText editText, ImageView imageView) {
        this.f19924e = editText;
        this.f19925f = imageView;
    }

    public final void onClick(View view) {
        LearnerLicenceAadharScreen.M2(this.f19924e, this.f19925f, view);
    }
}
