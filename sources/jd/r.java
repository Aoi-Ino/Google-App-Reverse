package jd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.SelectedWithdrawnList;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f12858e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SelectedWithdrawnList f12859f;

    public /* synthetic */ r(Dialog dialog, SelectedWithdrawnList selectedWithdrawnList) {
        this.f12858e = dialog;
        this.f12859f = selectedWithdrawnList;
    }

    public final void onClick(View view) {
        SelectedWithdrawnList.b2(this.f12858e, this.f12859f, view);
    }
}
