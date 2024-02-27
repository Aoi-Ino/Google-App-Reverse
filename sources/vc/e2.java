package vc;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.RC.VirtualRcScreen;

public final /* synthetic */ class e2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17707e;

    public /* synthetic */ e2(Dialog dialog) {
        this.f17707e = dialog;
    }

    public final void onClick(View view) {
        VirtualRcScreen.G1(this.f17707e, view);
    }
}
