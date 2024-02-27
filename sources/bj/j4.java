package bj;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen;

public final /* synthetic */ class j4 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ PersonalDetailsScreen f19824e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f19825f;

    public /* synthetic */ j4(PersonalDetailsScreen personalDetailsScreen, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f19824e = personalDetailsScreen;
        this.f19825f = onDateSetListener;
    }

    public final void onClick(View view) {
        PersonalDetailsScreen.M1(this.f19824e, this.f19825f, view);
    }
}
