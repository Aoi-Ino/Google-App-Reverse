package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.LlPayment;

public final /* synthetic */ class l1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f16785e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f16786f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LlPayment f16787g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Dialog f16788h;

    public /* synthetic */ l1(String str, String str2, LlPayment llPayment, Dialog dialog) {
        this.f16785e = str;
        this.f16786f = str2;
        this.f16787g = llPayment;
        this.f16788h = dialog;
    }

    public final void onClick(View view) {
        LlPayment.z1(this.f16785e, this.f16786f, this.f16787g, this.f16788h, view);
    }
}
