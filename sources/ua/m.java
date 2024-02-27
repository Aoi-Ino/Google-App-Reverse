package ua;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Dl.DLDashboardNew;
import com.nic.mparivahan.Dl.Model.DldetobjX;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17142e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f17143f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ DLDashboardNew f17144g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DldetobjX f17145h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f17146i;

    public /* synthetic */ m(Dialog dialog, String str, DLDashboardNew dLDashboardNew, DldetobjX dldetobjX, String str2) {
        this.f17142e = dialog;
        this.f17143f = str;
        this.f17144g = dLDashboardNew;
        this.f17145h = dldetobjX;
        this.f17146i = str2;
    }

    public final void onClick(View view) {
        DLDashboardNew.O1(this.f17142e, this.f17143f, this.f17144g, this.f17145h, this.f17146i, view);
    }
}
