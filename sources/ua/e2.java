package ua;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.SearchDL;

public final /* synthetic */ class e2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17095e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SearchDL f17096f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f17097g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DldetobjX f17098h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f17099i;

    public /* synthetic */ e2(Dialog dialog, SearchDL searchDL, String str, DldetobjX dldetobjX, String str2) {
        this.f17095e = dialog;
        this.f17096f = searchDL;
        this.f17097g = str;
        this.f17098h = dldetobjX;
        this.f17099i = str2;
    }

    public final void onClick(View view) {
        SearchDL.F1(this.f17095e, this.f17096f, this.f17097g, this.f17098h, this.f17099i, view);
    }
}
