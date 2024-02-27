package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ HypothecationTerminationActivity f32972e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32973f;

    public /* synthetic */ y(HypothecationTerminationActivity hypothecationTerminationActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32972e = hypothecationTerminationActivity;
        this.f32973f = onDateSetListener;
    }

    public final void onClick(View view) {
        HypothecationTerminationActivity.D1(this.f32972e, this.f32973f, view);
    }
}
