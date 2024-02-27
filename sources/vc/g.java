package vc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RC.CreateRCAlertsScreen;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17711e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CreateRCAlertsScreen f17712f;

    public /* synthetic */ g(Dialog dialog, CreateRCAlertsScreen createRCAlertsScreen) {
        this.f17711e = dialog;
        this.f17712f = createRCAlertsScreen;
    }

    public final void onClick(View view) {
        CreateRCAlertsScreen.w2(this.f17711e, this.f17712f, view);
    }
}
