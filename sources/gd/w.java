package gd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f11906e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ApplicationStatusActivity f11907f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f11908g;

    public /* synthetic */ w(Dialog dialog, ApplicationStatusActivity applicationStatusActivity, String str) {
        this.f11906e = dialog;
        this.f11907f = applicationStatusActivity;
        this.f11908g = str;
    }

    public final void onClick(View view) {
        ApplicationStatusActivity.g2(this.f11906e, this.f11907f, this.f11908g, view);
    }
}
