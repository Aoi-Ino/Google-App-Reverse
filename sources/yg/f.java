package yg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ HypothecationAdditionActivity f32891e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f32892f;

    public /* synthetic */ f(HypothecationAdditionActivity hypothecationAdditionActivity, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f32891e = hypothecationAdditionActivity;
        this.f32892f = onDateSetListener;
    }

    public final void onClick(View view) {
        HypothecationAdditionActivity.F1(this.f32891e, this.f32892f, view);
    }
}
