package ua;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Dl.NewDlSearch;

public final /* synthetic */ class j1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17131e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ NewDlSearch f17132f;

    public /* synthetic */ j1(Dialog dialog, NewDlSearch newDlSearch) {
        this.f17131e = dialog;
        this.f17132f = newDlSearch;
    }

    public final void onClick(View view) {
        NewDlSearch.P2(this.f17131e, this.f17132f, view);
    }
}
