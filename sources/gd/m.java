package gd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ApplicationDetailsActivity f11890e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Dialog f11891f;

    public /* synthetic */ m(ApplicationDetailsActivity applicationDetailsActivity, Dialog dialog) {
        this.f11890e = applicationDetailsActivity;
        this.f11891f = dialog;
    }

    public final void onClick(View view) {
        ApplicationDetailsActivity.b2(this.f11890e, this.f11891f, view);
    }
}
