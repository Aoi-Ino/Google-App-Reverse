package wd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;

public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32504e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FeesDetailsScreen f32505f;

    public /* synthetic */ b0(Dialog dialog, FeesDetailsScreen feesDetailsScreen) {
        this.f32504e = dialog;
        this.f32505f = feesDetailsScreen;
    }

    public final void onClick(View view) {
        FeesDetailsScreen.u2(this.f32504e, this.f32505f, view);
    }
}
