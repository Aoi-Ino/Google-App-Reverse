package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;

public final /* synthetic */ class f2 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VahanNocActivity f32895a;

    public /* synthetic */ f2(VahanNocActivity vahanNocActivity) {
        this.f32895a = vahanNocActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanNocActivity.Z1(this.f32895a, datePicker, i10, i11, i12);
    }
}
