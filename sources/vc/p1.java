package vc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RC.SharedRcScreen;

public final /* synthetic */ class p1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17748e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SharedRcScreen f17749f;

    public /* synthetic */ p1(Dialog dialog, SharedRcScreen sharedRcScreen) {
        this.f17748e = dialog;
        this.f17749f = sharedRcScreen;
    }

    public final void onClick(View view) {
        SharedRcScreen.t1(this.f17748e, this.f17749f, view);
    }
}
