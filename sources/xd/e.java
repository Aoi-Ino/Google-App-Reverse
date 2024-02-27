package xd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.VahanAlterationOfVehicle;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32661e;

    public /* synthetic */ e(Dialog dialog) {
        this.f32661e = dialog;
    }

    public final void onClick(View view) {
        VahanAlterationOfVehicle.X2(this.f32661e, view);
    }
}
