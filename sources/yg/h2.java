package yg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcCancellationActivity;

public final /* synthetic */ class h2 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VahanRcCancellationActivity f32903a;

    public /* synthetic */ h2(VahanRcCancellationActivity vahanRcCancellationActivity) {
        this.f32903a = vahanRcCancellationActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        VahanRcCancellationActivity.y1(this.f32903a, datePicker, i10, i11, i12);
    }
}
