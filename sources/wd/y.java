package wd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32558e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FeesDetailsScreen f32559f;

    public /* synthetic */ y(Dialog dialog, FeesDetailsScreen feesDetailsScreen) {
        this.f32558e = dialog;
        this.f32559f = feesDetailsScreen;
    }

    public final void onClick(View view) {
        FeesDetailsScreen.v1(this.f32558e, this.f32559f, view);
    }
}
