package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;

public final /* synthetic */ class h1 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VahanDuplicateRcActivity f32902a;

    public /* synthetic */ h1(VahanDuplicateRcActivity vahanDuplicateRcActivity) {
        this.f32902a = vahanDuplicateRcActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanDuplicateRcActivity.x1(this.f32902a, datePicker, i10, i11, i12);
    }
}
