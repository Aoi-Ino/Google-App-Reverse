package oc;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails;

public final /* synthetic */ class l implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UserDetails f14470a;

    public /* synthetic */ l(UserDetails userDetails) {
        this.f14470a = userDetails;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        UserDetails.y2(this.f14470a, datePicker, i10, i11, i12);
    }
}
