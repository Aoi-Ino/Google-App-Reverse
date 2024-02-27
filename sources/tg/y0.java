package tg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.HypothecationTerminationActivityMultiService;

public final /* synthetic */ class y0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HypothecationTerminationActivityMultiService f31419a;

    public /* synthetic */ y0(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService) {
        this.f31419a = hypothecationTerminationActivityMultiService;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        HypothecationTerminationActivityMultiService.H1(this.f31419a, datePicker, i10, i11, i12);
    }
}
