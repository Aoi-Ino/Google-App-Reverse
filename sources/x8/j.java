package x8;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.AddCov.View.CovApplication;

public final /* synthetic */ class j implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CovApplication f18225a;

    public /* synthetic */ j(CovApplication covApplication) {
        this.f18225a = covApplication;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        CovApplication.L1(this.f18225a, datePicker, i10, i11, i12);
    }
}
