package gd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11913e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ApplicationStatusActivity f11914f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f11915g;

    public /* synthetic */ z(Dialog dialog, ApplicationStatusActivity applicationStatusActivity, String str) {
        this.f11913e = dialog;
        this.f11914f = applicationStatusActivity;
        this.f11915g = str;
    }

    public final void onClick(View view) {
        ApplicationStatusActivity.i2(this.f11913e, this.f11914f, this.f11915g, view);
    }
}
