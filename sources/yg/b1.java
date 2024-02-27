package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicatePermitActivity;

public final /* synthetic */ class b1 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VahanDuplicatePermitActivity f32876a;

    public /* synthetic */ b1(VahanDuplicatePermitActivity vahanDuplicatePermitActivity) {
        this.f32876a = vahanDuplicatePermitActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanDuplicatePermitActivity.A1(this.f32876a, datePicker, i10, i11, i12);
    }
}
