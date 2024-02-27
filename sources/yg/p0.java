package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TemporaryPermitActivity;

public final /* synthetic */ class p0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TemporaryPermitActivity f32937e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32938f;

    public /* synthetic */ p0(TemporaryPermitActivity temporaryPermitActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32937e = temporaryPermitActivity;
        this.f32938f = onDateSetListener;
    }

    public final void onClick(View view) {
        TemporaryPermitActivity.D1(this.f32937e, this.f32938f, view);
    }
}
