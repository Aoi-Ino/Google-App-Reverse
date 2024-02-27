package rd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Tax.PayTaxActivity;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f31024e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PayTaxActivity f31025f;

    public /* synthetic */ d(Dialog dialog, PayTaxActivity payTaxActivity) {
        this.f31024e = dialog;
        this.f31025f = payTaxActivity;
    }

    public final void onClick(View view) {
        PayTaxActivity.s1(this.f31024e, this.f31025f, view);
    }
}
