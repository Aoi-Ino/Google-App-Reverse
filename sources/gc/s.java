package gc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlFeePayment;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f11818e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f11819f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ DlFeePayment f11820g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Dialog f11821h;

    public /* synthetic */ s(String str, String str2, DlFeePayment dlFeePayment, Dialog dialog) {
        this.f11818e = str;
        this.f11819f = str2;
        this.f11820g = dlFeePayment;
        this.f11821h = dialog;
    }

    public final void onClick(View view) {
        DlFeePayment.v1(this.f11818e, this.f11819f, this.f11820g, this.f11821h, view);
    }
}
