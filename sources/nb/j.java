package nb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14243e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FetchVahanTransactions f14244f;

    public /* synthetic */ j(Dialog dialog, FetchVahanTransactions fetchVahanTransactions) {
        this.f14243e = dialog;
        this.f14244f = fetchVahanTransactions;
    }

    public final void onClick(View view) {
        FetchVahanTransactions.a2(this.f14243e, this.f14244f, view);
    }
}
