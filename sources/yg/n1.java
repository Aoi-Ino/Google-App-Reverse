package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;

public final /* synthetic */ class n1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanNocActivity f32929e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32930f;

    public /* synthetic */ n1(VahanNocActivity vahanNocActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32929e = vahanNocActivity;
        this.f32930f = onDateSetListener;
    }

    public final void onClick(View view) {
        VahanNocActivity.a2(this.f32929e, this.f32930f, view);
    }
}
