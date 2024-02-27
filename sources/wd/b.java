package wd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.ChangeOfAddressConfirmation;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32502e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ChangeOfAddressConfirmation f32503f;

    public /* synthetic */ b(Dialog dialog, ChangeOfAddressConfirmation changeOfAddressConfirmation) {
        this.f32502e = dialog;
        this.f32503f = changeOfAddressConfirmation;
    }

    public final void onClick(View view) {
        ChangeOfAddressConfirmation.l1(this.f32502e, this.f32503f, view);
    }
}
