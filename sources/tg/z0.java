package tg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.HypothecationTerminationActivityMultiService;

public final /* synthetic */ class z0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ HypothecationTerminationActivityMultiService f31422e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f31423f;

    public /* synthetic */ z0(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f31422e = hypothecationTerminationActivityMultiService;
        this.f31423f = onDateSetListener;
    }

    public final void onClick(View view) {
        HypothecationTerminationActivityMultiService.I1(this.f31422e, this.f31423f, view);
    }
}
