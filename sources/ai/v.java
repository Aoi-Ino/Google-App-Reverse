package ai;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanChangeOfAddress;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanChangeOfAddress f19277e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f19278f;

    public /* synthetic */ v(VahanChangeOfAddress vahanChangeOfAddress, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f19277e = vahanChangeOfAddress;
        this.f19278f = onDateSetListener;
    }

    public final void onClick(View view) {
        VahanChangeOfAddress.U1(this.f19277e, this.f19278f, view);
    }
}
