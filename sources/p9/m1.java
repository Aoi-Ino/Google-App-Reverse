package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.ClFeePayment;

public final /* synthetic */ class m1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14840e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ClFeePayment f14841f;

    public /* synthetic */ m1(Dialog dialog, ClFeePayment clFeePayment) {
        this.f14840e = dialog;
        this.f14841f = clFeePayment;
    }

    public final void onClick(View view) {
        ClFeePayment.M1(this.f14840e, this.f14841f, view);
    }
}
