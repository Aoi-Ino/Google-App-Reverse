package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;

public final /* synthetic */ class e implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HypothecationAdditionActivity f32887a;

    public /* synthetic */ e(HypothecationAdditionActivity hypothecationAdditionActivity) {
        this.f32887a = hypothecationAdditionActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        HypothecationAdditionActivity.Q1(this.f32887a, datePicker, i10, i11, i12);
    }
}
