package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcCancellationActivity;

public final /* synthetic */ class i2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanRcCancellationActivity f32909e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32910f;

    public /* synthetic */ i2(VahanRcCancellationActivity vahanRcCancellationActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32909e = vahanRcCancellationActivity;
        this.f32910f = onDateSetListener;
    }

    public final void onClick(View view) {
        VahanRcCancellationActivity.z1(this.f32909e, this.f32910f, view);
    }
}
