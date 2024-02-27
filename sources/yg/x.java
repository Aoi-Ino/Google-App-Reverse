package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;

public final /* synthetic */ class x implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HypothecationTerminationActivity f32969a;

    public /* synthetic */ x(HypothecationTerminationActivity hypothecationTerminationActivity) {
        this.f32969a = hypothecationTerminationActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        HypothecationTerminationActivity.C1(this.f32969a, datePicker, i10, i11, i12);
    }
}
