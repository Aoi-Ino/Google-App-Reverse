package p9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.RenewalCl;

public final /* synthetic */ class m3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14843e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RenewalCl f14844f;

    public /* synthetic */ m3(Dialog dialog, RenewalCl renewalCl) {
        this.f14843e = dialog;
        this.f14844f = renewalCl;
    }

    public final void onClick(View view) {
        RenewalCl.V1(this.f14843e, this.f14844f, view);
    }
}
