package ua;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.DLDashboardNew;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f17176e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DLDashboardNew f17177f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ EditText f17178g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EditText f17179h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ EditText f17180i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f17181j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Dialog f17182k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f17183l;

    public /* synthetic */ t(String str, DLDashboardNew dLDashboardNew, EditText editText, EditText editText2, EditText editText3, int i10, Dialog dialog, String str2) {
        this.f17176e = str;
        this.f17177f = dLDashboardNew;
        this.f17178g = editText;
        this.f17179h = editText2;
        this.f17180i = editText3;
        this.f17181j = i10;
        this.f17182k = dialog;
        this.f17183l = str2;
    }

    public final void onClick(View view) {
        DLDashboardNew.r3(this.f17176e, this.f17177f, this.f17178g, this.f17179h, this.f17180i, this.f17181j, this.f17182k, this.f17183l, view);
    }
}
