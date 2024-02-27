package ua;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.NewDlSearch;

public final /* synthetic */ class q1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17164e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ NewDlSearch f17165f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ DldetobjX f17166g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f17167h;

    public /* synthetic */ q1(Dialog dialog, NewDlSearch newDlSearch, DldetobjX dldetobjX, String str) {
        this.f17164e = dialog;
        this.f17165f = newDlSearch;
        this.f17166g = dldetobjX;
        this.f17167h = str;
    }

    public final void onClick(View view) {
        NewDlSearch.N1(this.f17164e, this.f17165f, this.f17166g, this.f17167h, view);
    }
}
