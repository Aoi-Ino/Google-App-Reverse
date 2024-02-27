package bj;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.dlservices.newlearner.LLApplicationScreen;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19875e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LLApplicationScreen f19876f;

    public /* synthetic */ q(Dialog dialog, LLApplicationScreen lLApplicationScreen) {
        this.f19875e = dialog;
        this.f19876f = lLApplicationScreen;
    }

    public final void onClick(View view) {
        LLApplicationScreen.x1(this.f19875e, this.f19876f, view);
    }
}
