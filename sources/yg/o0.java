package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TemporaryPermitActivity;

public final /* synthetic */ class o0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TemporaryPermitActivity f32933a;

    public /* synthetic */ o0(TemporaryPermitActivity temporaryPermitActivity) {
        this.f32933a = temporaryPermitActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        TemporaryPermitActivity.C1(this.f32933a, datePicker, i10, i11, i12);
    }
}
