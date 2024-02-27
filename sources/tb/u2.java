package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.LlStoltsAck;

public final /* synthetic */ class u2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16834e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LlStoltsAck f16835f;

    public /* synthetic */ u2(Dialog dialog, LlStoltsAck llStoltsAck) {
        this.f16834e = dialog;
        this.f16835f = llStoltsAck;
    }

    public final void onClick(View view) {
        LlStoltsAck.X1(this.f16834e, this.f16835f, view);
    }
}
