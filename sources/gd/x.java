package gd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;

public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11909e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ApplicationStatusActivity f11910f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f11911g;

    public /* synthetic */ x(Dialog dialog, ApplicationStatusActivity applicationStatusActivity, String str) {
        this.f11909e = dialog;
        this.f11910f = applicationStatusActivity;
        this.f11911g = str;
    }

    public final void onClick(View view) {
        ApplicationStatusActivity.k2(this.f11909e, this.f11910f, this.f11911g, view);
    }
}
