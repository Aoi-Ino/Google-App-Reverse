package oj;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DobChangeActivity f30121e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f30122f;

    public /* synthetic */ n(DobChangeActivity dobChangeActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f30121e = dobChangeActivity;
        this.f30122f = onDateSetListener;
    }

    public final void onClick(View view) {
        DobChangeActivity.i2(this.f30121e, this.f30122f, view);
    }
}
