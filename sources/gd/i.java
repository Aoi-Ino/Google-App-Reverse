package gd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ApplicationDetailsActivity f11875e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f11876f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f11877g;

    public /* synthetic */ i(ApplicationDetailsActivity applicationDetailsActivity, String str, Dialog dialog) {
        this.f11875e = applicationDetailsActivity;
        this.f11876f = str;
        this.f11877g = dialog;
    }

    public final void onClick(View view) {
        ApplicationDetailsActivity.I2(this.f11875e, this.f11876f, this.f11877g, view);
    }
}
