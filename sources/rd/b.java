package rd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Tax.PayTaxActivity;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f31021e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PayTaxActivity f31022f;

    public /* synthetic */ b(Dialog dialog, PayTaxActivity payTaxActivity) {
        this.f31021e = dialog;
        this.f31022f = payTaxActivity;
    }

    public final void onClick(View view) {
        PayTaxActivity.K1(this.f31021e, this.f31022f, view);
    }
}
