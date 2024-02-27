package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.LlStoltsAck;

public final /* synthetic */ class q2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f16816e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LlStoltsAck f16817f;

    public /* synthetic */ q2(Dialog dialog, LlStoltsAck llStoltsAck) {
        this.f16816e = dialog;
        this.f16817f = llStoltsAck;
    }

    public final void onClick(View view) {
        LlStoltsAck.Z1(this.f16816e, this.f16817f, view);
    }
}
