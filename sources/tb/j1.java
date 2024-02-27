package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.LlPayment;

public final /* synthetic */ class j1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16768e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LlPayment f16769f;

    public /* synthetic */ j1(Dialog dialog, LlPayment llPayment) {
        this.f16768e = dialog;
        this.f16769f = llPayment;
    }

    public final void onClick(View view) {
        LlPayment.N1(this.f16768e, this.f16769f, view);
    }
}
