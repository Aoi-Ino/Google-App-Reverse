package bj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.LLFeePayment;

public final /* synthetic */ class g0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f19793e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f19794f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LLFeePayment f19795g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Dialog f19796h;

    public /* synthetic */ g0(String str, String str2, LLFeePayment lLFeePayment, Dialog dialog) {
        this.f19793e = str;
        this.f19794f = str2;
        this.f19795g = lLFeePayment;
        this.f19796h = dialog;
    }

    public final void onClick(View view) {
        LLFeePayment.v1(this.f19793e, this.f19794f, this.f19795g, this.f19796h, view);
    }
}
