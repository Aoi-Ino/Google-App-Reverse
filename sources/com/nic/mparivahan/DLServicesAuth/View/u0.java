package com.nic.mparivahan.DLServicesAuth.View;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

public final /* synthetic */ class u0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DlServicesMainScreen f8324a;

    public /* synthetic */ u0(DlServicesMainScreen dlServicesMainScreen) {
        this.f8324a = dlServicesMainScreen;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        DlServicesMainScreen.v2(this.f8324a, datePicker, i10, i11, i12);
    }
}
