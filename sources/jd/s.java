package jd;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.SelectedWithdrawnList;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f12860e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SelectedWithdrawnList f12861f;

    public /* synthetic */ s(Dialog dialog, SelectedWithdrawnList selectedWithdrawnList) {
        this.f12860e = dialog;
        this.f12861f = selectedWithdrawnList;
    }

    public final void onClick(View view) {
        SelectedWithdrawnList.U1(this.f12860e, this.f12861f, view);
    }
}
