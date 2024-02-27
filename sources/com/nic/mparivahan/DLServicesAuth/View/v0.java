package com.nic.mparivahan.DLServicesAuth.View;

import android.app.DatePickerDialog;
import android.view.View;

public final /* synthetic */ class v0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DlServicesMainScreen f8329e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f8330f;

    public /* synthetic */ v0(DlServicesMainScreen dlServicesMainScreen, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f8329e = dlServicesMainScreen;
        this.f8330f = onDateSetListener;
    }

    public final void onClick(View view) {
        DlServicesMainScreen.w2(this.f8329e, this.f8330f, view);
    }
}
