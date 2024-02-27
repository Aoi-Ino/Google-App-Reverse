package vc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RC.CreateRCAlertsScreen;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17724e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CreateRCAlertsScreen f17725f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f17726g;

    public /* synthetic */ j(Dialog dialog, CreateRCAlertsScreen createRCAlertsScreen, String str) {
        this.f17724e = dialog;
        this.f17725f = createRCAlertsScreen;
        this.f17726g = str;
    }

    public final void onClick(View view) {
        CreateRCAlertsScreen.u2(this.f17724e, this.f17725f, this.f17726g, view);
    }
}
