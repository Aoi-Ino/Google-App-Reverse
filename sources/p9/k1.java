package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.ClFeePayment;

public final /* synthetic */ class k1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f14821e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f14822f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ClFeePayment f14823g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Dialog f14824h;

    public /* synthetic */ k1(String str, String str2, ClFeePayment clFeePayment, Dialog dialog) {
        this.f14821e = str;
        this.f14822f = str2;
        this.f14823g = clFeePayment;
        this.f14824h = dialog;
    }

    public final void onClick(View view) {
        ClFeePayment.z1(this.f14821e, this.f14822f, this.f14823g, this.f14824h, view);
    }
}
