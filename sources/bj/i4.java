package bj;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen;

public final /* synthetic */ class i4 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PersonalDetailsScreen f19816a;

    public /* synthetic */ i4(PersonalDetailsScreen personalDetailsScreen) {
        this.f19816a = personalDetailsScreen;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        PersonalDetailsScreen.L1(this.f19816a, datePicker, i10, i11, i12);
    }
}
