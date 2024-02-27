package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateFitnessActivity;

public final /* synthetic */ class v0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VahanDuplicateFitnessActivity f32961a;

    public /* synthetic */ v0(VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity) {
        this.f32961a = vahanDuplicateFitnessActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanDuplicateFitnessActivity.z1(this.f32961a, datePicker, i10, i11, i12);
    }
}
