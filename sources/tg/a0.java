package tg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.HypothecationAdditionActivityMultiService;

public final /* synthetic */ class a0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HypothecationAdditionActivityMultiService f31338a;

    public /* synthetic */ a0(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService) {
        this.f31338a = hypothecationAdditionActivityMultiService;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        HypothecationAdditionActivityMultiService.I1(this.f31338a, datePicker, i10, i11, i12);
    }
}
