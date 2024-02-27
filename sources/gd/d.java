package gd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11858e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ApplicationDetailsActivity f11859f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f11860g;

    public /* synthetic */ d(Dialog dialog, ApplicationDetailsActivity applicationDetailsActivity, String str) {
        this.f11858e = dialog;
        this.f11859f = applicationDetailsActivity;
        this.f11860g = str;
    }

    public final void onClick(View view) {
        ApplicationDetailsActivity.N2(this.f11858e, this.f11859f, this.f11860g, view);
    }
}
