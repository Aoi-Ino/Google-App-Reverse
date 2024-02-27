package cb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Echallan.VerifyPaymentChallanDetails;

public final /* synthetic */ class q3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f4878e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4879f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ VerifyPaymentChallanDetails f4880g;

    public /* synthetic */ q3(Dialog dialog, int i10, VerifyPaymentChallanDetails verifyPaymentChallanDetails) {
        this.f4878e = dialog;
        this.f4879f = i10;
        this.f4880g = verifyPaymentChallanDetails;
    }

    public final void onClick(View view) {
        VerifyPaymentChallanDetails.s1(this.f4878e, this.f4879f, this.f4880g, view);
    }
}
