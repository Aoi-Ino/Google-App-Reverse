package wd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;

public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32499e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FeesDetailsScreen f32500f;

    public /* synthetic */ a0(Dialog dialog, FeesDetailsScreen feesDetailsScreen) {
        this.f32499e = dialog;
        this.f32500f = feesDetailsScreen;
    }

    public final void onClick(View view) {
        FeesDetailsScreen.s2(this.f32499e, this.f32500f, view);
    }
}
