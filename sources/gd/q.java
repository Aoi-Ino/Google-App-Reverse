package gd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11897e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ApplicationDetailsActivity f11898f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f11899g;

    public /* synthetic */ q(Dialog dialog, ApplicationDetailsActivity applicationDetailsActivity, String str) {
        this.f11897e = dialog;
        this.f11898f = applicationDetailsActivity;
        this.f11899g = str;
    }

    public final void onClick(View view) {
        ApplicationDetailsActivity.P2(this.f11897e, this.f11898f, this.f11899g, view);
    }
}
