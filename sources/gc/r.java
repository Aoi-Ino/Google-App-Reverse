package gc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlFeePayment;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11814e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DlFeePayment f11815f;

    public /* synthetic */ r(Dialog dialog, DlFeePayment dlFeePayment) {
        this.f11814e = dialog;
        this.f11815f = dlFeePayment;
    }

    public final void onClick(View view) {
        DlFeePayment.E1(this.f11814e, this.f11815f, view);
    }
}
