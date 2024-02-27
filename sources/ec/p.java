package ec;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity;

public final /* synthetic */ class p implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LLNoCheckActivity f11158a;

    public /* synthetic */ p(LLNoCheckActivity lLNoCheckActivity) {
        this.f11158a = lLNoCheckActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        LLNoCheckActivity.r1(this.f11158a, datePicker, i10, i11, i12);
    }
}
