package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.RCReleaseActivity;

public final /* synthetic */ class h0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RCReleaseActivity f32901a;

    public /* synthetic */ h0(RCReleaseActivity rCReleaseActivity) {
        this.f32901a = rCReleaseActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        RCReleaseActivity.x1(this.f32901a, datePicker, i10, i11, i12);
    }
}
