package bj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.LLFeePayment;

public final /* synthetic */ class c0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19766e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LLFeePayment f19767f;

    public /* synthetic */ c0(Dialog dialog, LLFeePayment lLFeePayment) {
        this.f19766e = dialog;
        this.f19767f = lLFeePayment;
    }

    public final void onClick(View view) {
        LLFeePayment.E1(this.f19766e, this.f19767f, view);
    }
}
