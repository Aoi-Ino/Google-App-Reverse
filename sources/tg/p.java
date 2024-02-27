package tg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.ChangeOfAddressMultiService;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ChangeOfAddressMultiService f31387e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f31388f;

    public /* synthetic */ p(ChangeOfAddressMultiService changeOfAddressMultiService, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f31387e = changeOfAddressMultiService;
        this.f31388f = onDateSetListener;
    }

    public final void onClick(View view) {
        ChangeOfAddressMultiService.W1(this.f31387e, this.f31388f, view);
    }
}
