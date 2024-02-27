package rd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Tax.PayTaxActivity;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f31028e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PayTaxActivity f31029f;

    public /* synthetic */ g(Dialog dialog, PayTaxActivity payTaxActivity) {
        this.f31028e = dialog;
        this.f31029f = payTaxActivity;
    }

    public final void onClick(View view) {
        PayTaxActivity.N1(this.f31028e, this.f31029f, view);
    }
}
