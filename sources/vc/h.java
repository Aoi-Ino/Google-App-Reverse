package vc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RC.CreateRCAlertsScreen;
import com.nic.mparivahan.RC.Model.RcModelsDet;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17715e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CreateRCAlertsScreen f17716f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ RcModelsDet f17717g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f17718h;

    public /* synthetic */ h(Dialog dialog, CreateRCAlertsScreen createRCAlertsScreen, RcModelsDet rcModelsDet, String str) {
        this.f17715e = dialog;
        this.f17716f = createRCAlertsScreen;
        this.f17717g = rcModelsDet;
        this.f17718h = str;
    }

    public final void onClick(View view) {
        CreateRCAlertsScreen.z1(this.f17715e, this.f17716f, this.f17717g, this.f17718h, view);
    }
}
